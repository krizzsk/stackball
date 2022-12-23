package com.smaato.sdk.core.network;

import com.smaato.sdk.core.Task;
import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.network.execution.NetworkLayerException;

public interface NetworkClient {

    public enum Error {
        CANCELLED,
        TIMEOUT,
        IO_ERROR,
        GENERIC,
        IO_TOO_MANY_REDIRECTS,
        NO_NETWORK_CONNECTION
    }

    public interface Listener {
        void onRequestError(NetworkClient networkClient, Task task, NetworkLayerException networkLayerException);

        void onRequestSuccess(NetworkClient networkClient, Task task, NetworkResponse networkResponse);
    }

    Task performNetworkRequest(NetworkRequest networkRequest, SomaApiContext somaApiContext);

    void setListener(Listener listener);
}
