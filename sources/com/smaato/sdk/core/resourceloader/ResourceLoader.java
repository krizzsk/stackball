package com.smaato.sdk.core.resourceloader;

import com.smaato.sdk.core.Task;
import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.execution.IoFunction;
import com.smaato.sdk.core.network.execution.NetworkLayerException;
import com.smaato.sdk.core.network.execution.TaskStepResult;
import com.smaato.sdk.core.p248ad.Expiration;
import com.smaato.sdk.core.resourceloader.ResourceLoader;
import com.smaato.sdk.core.util.Objects;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;

public class ResourceLoader<PersistedResourceType, OutputResourceType> {
    private final ExecutorService deviceLocalExecutorService;
    /* access modifiers changed from: private */
    public final Logger logger;
    private final PersistingStrategy<PersistedResourceType> persistingStrategy;
    private final ResourceLoadingNetworkTaskCreator<OutputResourceType> resourceLoadingNetworkTaskCreator;
    private final ResourceTransformer<PersistedResourceType, OutputResourceType> resourceTransformer;

    public enum Error {
        CANCELLED,
        INVALID_RESPONSE,
        RESOURCE_EXPIRED,
        GENERIC,
        IO_ERROR,
        NETWORK_NO_CONNECTION,
        NETWORK_TIMEOUT,
        NETWORK_GENERIC,
        NETWORK_IO_TOO_MANY_REDIRECTS
    }

    public interface Listener<OutputResourceType> {
        void onFailure(ResourceLoaderException resourceLoaderException);

        void onResourceLoaded(OutputResourceType outputresourcetype);
    }

    public ResourceLoader(Logger logger2, ResourceLoadingNetworkTaskCreator<OutputResourceType> resourceLoadingNetworkTaskCreator2, ExecutorService executorService, PersistingStrategy<PersistedResourceType> persistingStrategy2, ResourceTransformer<PersistedResourceType, OutputResourceType> resourceTransformer2) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.resourceLoadingNetworkTaskCreator = (ResourceLoadingNetworkTaskCreator) Objects.requireNonNull(resourceLoadingNetworkTaskCreator2);
        this.deviceLocalExecutorService = (ExecutorService) Objects.requireNonNull(executorService);
        this.persistingStrategy = (PersistingStrategy) Objects.requireNonNull(persistingStrategy2);
        this.resourceTransformer = (ResourceTransformer) Objects.requireNonNull(resourceTransformer2);
    }

    public void loadResource(String str, SomaApiContext somaApiContext, Listener<OutputResourceType> listener) {
        this.deviceLocalExecutorService.submit(new Runnable(str, listener, somaApiContext) {
            public final /* synthetic */ String f$1;
            public final /* synthetic */ ResourceLoader.Listener f$2;
            public final /* synthetic */ SomaApiContext f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                ResourceLoader.this.lambda$loadResource$0$ResourceLoader(this.f$1, this.f$2, this.f$3);
            }
        });
    }

    public /* synthetic */ void lambda$loadResource$0$ResourceLoader(final String str, final Listener listener, SomaApiContext somaApiContext) {
        try {
            PersistedResourceType persistedresourcetype = this.persistingStrategy.get(str);
            if (persistedresourcetype != null) {
                listener.onResourceLoaded(this.resourceTransformer.transform(persistedresourcetype));
                return;
            }
            Expiration expiration = somaApiContext.getApiAdResponse().getExpiration();
            if (expiration.isExpired()) {
                this.logger.warning(LogDomain.RESOURCE_LOADER, "Resource already expired, resourceExpirationTimestamp=%d, current time=%d. Skipping the loading.", Long.valueOf(expiration.getTimestamp()), Long.valueOf(System.currentTimeMillis()));
                listener.onFailure(new ResourceLoaderException(Error.RESOURCE_EXPIRED, new IllegalStateException()));
                return;
            }
            this.resourceLoadingNetworkTaskCreator.createTask(str, somaApiContext, new IoFunction(somaApiContext, str) {
                public final /* synthetic */ SomaApiContext f$1;
                public final /* synthetic */ String f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final Object apply(Object obj) {
                    return ResourceLoader.this.lambda$loadNetworkResource$1$ResourceLoader(this.f$1, this.f$2, (InputStream) obj);
                }
            }, new Task.Listener<OutputResourceType, NetworkLayerException>() {
                public void onSuccess(Task task, OutputResourceType outputresourcetype) {
                    listener.onResourceLoaded(outputresourcetype);
                }

                public void onFailure(Task task, NetworkLayerException networkLayerException) {
                    ResourceLoader.this.logger.error(LogDomain.RESOURCE_LOADER, "Failed to load resource at url: %s with error: %s", str, networkLayerException);
                    listener.onFailure(ResourceLoaderErrorMapper.map(networkLayerException));
                }
            }).start();
        } catch (PersistingStrategyException e) {
            listener.onFailure(new ResourceLoaderException(Error.IO_ERROR, e));
        }
    }

    public /* synthetic */ TaskStepResult lambda$loadNetworkResource$1$ResourceLoader(SomaApiContext somaApiContext, String str, InputStream inputStream) throws IOException {
        return TaskStepResult.success(this.resourceTransformer.transform(this.persistingStrategy.put(inputStream, str, somaApiContext.getApiAdResponse().getExpiration().getTimestamp())));
    }
}
