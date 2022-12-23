package com.smaato.sdk.core.api;

import com.smaato.sdk.core.Task;
import com.smaato.sdk.core.api.ApiResponseMapper;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.NetworkClient;
import com.smaato.sdk.core.network.NetworkResponse;
import com.smaato.sdk.core.network.execution.NetworkLayerException;
import com.smaato.sdk.core.util.Objects;

class NetworkClientListener implements NetworkClient.Listener {
    private final ApiResponseMapper apiResponseMapper;
    private final Callback callback;
    private final Logger logger;

    interface Callback {
        void onAdRequestError(Task task, ApiConnectorException apiConnectorException);

        void onAdRequestSuccess(Task task, ApiAdResponse apiAdResponse);
    }

    public NetworkClientListener(Logger logger2, ApiResponseMapper apiResponseMapper2, Callback callback2) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.apiResponseMapper = (ApiResponseMapper) Objects.requireNonNull(apiResponseMapper2);
        this.callback = (Callback) Objects.requireNonNull(callback2);
    }

    public void onRequestSuccess(NetworkClient networkClient, Task task, NetworkResponse networkResponse) {
        Objects.requireNonNull(networkClient);
        Objects.requireNonNull(task);
        Objects.requireNonNull(networkResponse);
        this.logger.debug(LogDomain.API, "networkClientListener.onRequestSuccess: entered, task = %s, networkResponse = %s", task, networkResponse);
        try {
            ApiAdResponse map = this.apiResponseMapper.map(networkResponse);
            this.logger.debug(LogDomain.API, "networkClientListener.onRequestSuccess: mapped ApiAdResponse (for task %s): %s", task, map);
            this.callback.onAdRequestSuccess(task, map);
        } catch (ApiResponseMapper.MappingException e) {
            if (e.type == ApiResponseMapper.MappingException.Type.NO_AD) {
                this.logger.error(LogDomain.API, "networkClientListener.onRequestSuccess: (for task %s) error mapping NetworkResponse to ApiAdResponse: %s", task, e);
            } else {
                this.logger.error(LogDomain.API, e, "networkClientListener.onRequestSuccess: (for task %s) error mapping NetworkResponse to ApiAdResponse: %s", task, e);
            }
            this.callback.onAdRequestError(task, ErrorMappingUtil.mapApiResponseMapperErrorToApiConnectorException(e));
        }
    }

    public void onRequestError(NetworkClient networkClient, Task task, NetworkLayerException networkLayerException) {
        Objects.requireNonNull(networkClient);
        Objects.requireNonNull(task);
        Objects.requireNonNull(networkLayerException);
        this.logger.error(LogDomain.API, "networkClientListener.onRequestError: (for task %s): %s", task, networkLayerException);
        this.callback.onAdRequestError(task, ErrorMappingUtil.mapNetworkClientErrorToApiConnectorLayerException(networkLayerException));
    }
}
