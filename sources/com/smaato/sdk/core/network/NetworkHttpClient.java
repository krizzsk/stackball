package com.smaato.sdk.core.network;

import com.smaato.sdk.core.Task;
import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.NetworkClient;
import com.smaato.sdk.core.network.NetworkHttpClient;
import com.smaato.sdk.core.network.execution.Executioner;
import com.smaato.sdk.core.network.execution.NetworkLayerException;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p251fi.Consumer;
import java.lang.ref.WeakReference;

public class NetworkHttpClient implements NetworkClient {
    private final Executioner<NetworkRequest, NetworkResponse, NetworkLayerException> executioner;
    /* access modifiers changed from: private */
    public WeakReference<NetworkClient.Listener> listener = new WeakReference<>((Object) null);
    /* access modifiers changed from: private */
    public final Logger logger;

    public NetworkHttpClient(Logger logger2, Executioner<NetworkRequest, NetworkResponse, NetworkLayerException> executioner2) {
        this.logger = (Logger) Objects.requireNonNull(logger2, "Parameter logger cannot be null for NetworkHttpClient::new");
        this.executioner = (Executioner) Objects.requireNonNull(executioner2, "Parameter executioner cannot be null for NetworkHttpClient::new");
    }

    public void setListener(NetworkClient.Listener listener2) {
        this.listener = new WeakReference<>(Objects.requireNonNull(listener2));
    }

    public Task performNetworkRequest(NetworkRequest networkRequest, SomaApiContext somaApiContext) {
        Objects.requireNonNull(networkRequest);
        return this.executioner.submitRequest(networkRequest, somaApiContext, new Task.Listener<NetworkResponse, NetworkLayerException>() {
            public void onSuccess(Task task, NetworkResponse networkResponse) {
                NetworkHttpClient.this.logger.debug(LogDomain.NETWORK, "Task Success result %s", networkResponse);
                Objects.onNotNull(NetworkHttpClient.this.listener.get(), new Consumer(task, networkResponse) {
                    public final /* synthetic */ Task f$1;
                    public final /* synthetic */ NetworkResponse f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void accept(Object obj) {
                        NetworkHttpClient.C86841.this.lambda$onSuccess$0$NetworkHttpClient$1(this.f$1, this.f$2, (NetworkClient.Listener) obj);
                    }
                });
            }

            public /* synthetic */ void lambda$onSuccess$0$NetworkHttpClient$1(Task task, NetworkResponse networkResponse, NetworkClient.Listener listener) {
                listener.onRequestSuccess(NetworkHttpClient.this, task, networkResponse);
            }

            public void onFailure(Task task, NetworkLayerException networkLayerException) {
                NetworkHttpClient.this.logger.error(LogDomain.NETWORK, "Task Failure result %s", networkLayerException);
                Objects.onNotNull(NetworkHttpClient.this.listener.get(), new Consumer(task, networkLayerException) {
                    public final /* synthetic */ Task f$1;
                    public final /* synthetic */ NetworkLayerException f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void accept(Object obj) {
                        NetworkHttpClient.C86841.this.lambda$onFailure$1$NetworkHttpClient$1(this.f$1, this.f$2, (NetworkClient.Listener) obj);
                    }
                });
            }

            public /* synthetic */ void lambda$onFailure$1$NetworkHttpClient$1(Task task, NetworkLayerException networkLayerException, NetworkClient.Listener listener) {
                listener.onRequestError(NetworkHttpClient.this, task, networkLayerException);
            }
        });
    }
}
