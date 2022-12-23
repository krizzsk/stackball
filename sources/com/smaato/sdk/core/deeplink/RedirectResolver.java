package com.smaato.sdk.core.deeplink;

import com.smaato.sdk.core.Task;
import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.execution.ClickThroughUrlRedirectResolver;
import com.smaato.sdk.core.network.execution.ErrorMapper;
import com.smaato.sdk.core.network.execution.Executioner;
import com.smaato.sdk.core.network.execution.NetworkActions;
import com.smaato.sdk.core.network.execution.RedirectResolveTask;
import com.smaato.sdk.core.util.Objects;
import java.util.concurrent.ExecutorService;

public class RedirectResolver implements Executioner<String, String, Exception> {
    private final ClickThroughUrlRedirectResolver clickThroughUrlRedirectResolver;
    private final ErrorMapper<Exception> errorMapper;
    private final ExecutorService executorService;
    private final Logger logger;
    private final NetworkActions networkActions;

    RedirectResolver(Logger logger2, ExecutorService executorService2, NetworkActions networkActions2, ErrorMapper<Exception> errorMapper2, ClickThroughUrlRedirectResolver clickThroughUrlRedirectResolver2) {
        this.logger = (Logger) Objects.requireNonNull(logger2, "Parameter logger cannot be null for RedirectResolver::new");
        this.executorService = (ExecutorService) Objects.requireNonNull(executorService2, "Parameter executorService cannot be null for RedirectResolver::new");
        this.networkActions = (NetworkActions) Objects.requireNonNull(networkActions2, "Parameter networkActions cannot be null for RedirectResolver::new");
        this.errorMapper = (ErrorMapper) Objects.requireNonNull(errorMapper2, "Parameter errorMapper cannot be null for RedirectResolver::new");
        this.clickThroughUrlRedirectResolver = (ClickThroughUrlRedirectResolver) Objects.requireNonNull(clickThroughUrlRedirectResolver2, "Parameter clickThroughUrlRedirectResolver cannot be null for RedirectResolver::new");
    }

    public Task submitRequest(String str, SomaApiContext somaApiContext, Task.Listener<String, Exception> listener) {
        return RedirectResolveTask.create(this.logger, this.executorService, str, listener, this.networkActions, this.errorMapper, this.clickThroughUrlRedirectResolver, somaApiContext);
    }
}
