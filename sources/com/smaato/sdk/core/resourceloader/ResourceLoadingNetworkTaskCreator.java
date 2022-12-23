package com.smaato.sdk.core.resourceloader;

import com.smaato.sdk.core.Task;
import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.NetworkHttpRequest;
import com.smaato.sdk.core.network.NetworkRequest;
import com.smaato.sdk.core.network.execution.ErrorMapper;
import com.smaato.sdk.core.network.execution.IoFunction;
import com.smaato.sdk.core.network.execution.NetworkActions;
import com.smaato.sdk.core.network.execution.NetworkLayerException;
import com.smaato.sdk.core.network.execution.TaskStepResult;
import com.smaato.sdk.core.util.Objects;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;

public class ResourceLoadingNetworkTaskCreator<OutputResourceType> {
    private final ErrorMapper<NetworkLayerException> errorMapper;
    private final ExecutorService executorService;
    private final Logger logger;
    private final NetworkActions networkActions;
    private final NetworkResourceStreamPreparationStrategy streamPreparingStrategy;

    public ResourceLoadingNetworkTaskCreator(Logger logger2, NetworkActions networkActions2, ErrorMapper<NetworkLayerException> errorMapper2, ExecutorService executorService2, NetworkResourceStreamPreparationStrategy networkResourceStreamPreparationStrategy) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.networkActions = (NetworkActions) Objects.requireNonNull(networkActions2);
        this.errorMapper = (ErrorMapper) Objects.requireNonNull(errorMapper2);
        this.executorService = (ExecutorService) Objects.requireNonNull(executorService2);
        this.streamPreparingStrategy = (NetworkResourceStreamPreparationStrategy) Objects.requireNonNull(networkResourceStreamPreparationStrategy);
    }

    public Task createTask(String str, SomaApiContext somaApiContext, IoFunction<InputStream, TaskStepResult<OutputResourceType, Exception>> ioFunction, Task.Listener<OutputResourceType, NetworkLayerException> listener) {
        Objects.requireNonNull(somaApiContext);
        Objects.requireNonNull(ioFunction);
        Objects.requireNonNull(listener);
        return new ResourceLoadingTask(this.logger, this.networkActions, new NetworkHttpRequest.Builder().setMethod(NetworkRequest.Method.GET).setUrl(str).build(), somaApiContext, this.errorMapper, this.executorService, this.streamPreparingStrategy, ioFunction, listener);
    }
}
