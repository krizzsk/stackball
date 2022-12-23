package com.smaato.sdk.core.network.trackers;

import com.smaato.sdk.core.Task;
import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.execution.ErrorMapper;
import com.smaato.sdk.core.network.execution.Executioner;
import com.smaato.sdk.core.network.execution.NetworkActions;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Whatever;
import java.util.concurrent.ExecutorService;

public class BeaconsExecutioner implements Executioner<String, Whatever, Exception> {
    private final ErrorMapper<Exception> errorMapper;
    private final ExecutorService executorService;
    private final Logger logger;
    private final NetworkActions networkActions;

    public BeaconsExecutioner(Logger logger2, NetworkActions networkActions2, ErrorMapper<Exception> errorMapper2, ExecutorService executorService2) {
        this.logger = (Logger) Objects.requireNonNull(logger2, "Parameter logger cannot be null for BeaconsExecutioner::new");
        this.networkActions = (NetworkActions) Objects.requireNonNull(networkActions2, "Parameter networkActions cannot be null for BeaconsExecutioner::new");
        this.errorMapper = (ErrorMapper) Objects.requireNonNull(errorMapper2, "Parameter errorMapper cannot be null for BeaconsExecutioner::new");
        this.executorService = (ExecutorService) Objects.requireNonNull(executorService2, "Parameter executorService cannot be null for BeaconsExecutioner::new");
    }

    public Task submitRequest(String str, SomaApiContext somaApiContext, Task.Listener<Whatever, Exception> listener) {
        return new BeaconTask(this.logger, this.networkActions, this.errorMapper, this.executorService, str, somaApiContext, listener);
    }
}
