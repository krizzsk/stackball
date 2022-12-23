package com.smaato.sdk.core.network.execution;

import com.smaato.sdk.core.Task;
import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.NetworkRequest;
import com.smaato.sdk.core.network.NetworkResponse;
import com.smaato.sdk.core.util.Objects;
import java.util.concurrent.ExecutorService;

public class HttpTasksExecutioner implements Executioner<NetworkRequest, NetworkResponse, NetworkLayerException> {
    private final ErrorMapper<NetworkLayerException> errorMapper;
    private final ExecutorService executorService;
    private final Logger logger;
    private final NetworkActions networkActions;

    public HttpTasksExecutioner(Logger logger2, NetworkActions networkActions2, ExecutorService executorService2, ErrorMapper<NetworkLayerException> errorMapper2) {
        this.networkActions = (NetworkActions) Objects.requireNonNull(networkActions2, "Parameter networkActions cannot be null for HttpTasksExecutioner::new");
        this.logger = (Logger) Objects.requireNonNull(logger2, "Parameter logger cannot be null for HttpTasksExecutioner::new");
        this.executorService = (ExecutorService) Objects.requireNonNull(executorService2, "Parameter executorService cannot be null for HttpTasksExecutioner::new");
        this.errorMapper = (ErrorMapper) Objects.requireNonNull(errorMapper2, "Parameter errorMapper cannot be null for HttpTasksExecutioner::new");
    }

    public Task submitRequest(NetworkRequest networkRequest, SomaApiContext somaApiContext, Task.Listener<NetworkResponse, NetworkLayerException> listener) {
        return HttpTask.create(this.logger, this.networkActions, this.executorService, networkRequest, this.errorMapper, listener, somaApiContext);
    }
}
