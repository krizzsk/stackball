package com.smaato.sdk.core.network.execution;

import com.smaato.sdk.core.Task;
import com.smaato.sdk.core.framework.SomaApiContext;

public interface Executioner<Request, Result, Err> {
    Task submitRequest(Request request, SomaApiContext somaApiContext, Task.Listener<Result, Err> listener);
}
