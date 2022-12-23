package com.smaato.sdk.core.api;

import com.smaato.sdk.core.Task;
import com.smaato.sdk.core.api.ApiConnector;
import com.smaato.sdk.core.api.NetworkClientListener;
import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.NetworkClient;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p251fi.Consumer;

public class ApiConnector {
    private final ApiRequestMapper apiRequestMapper;
    /* access modifiers changed from: private */
    public Listener listener;
    private final Logger logger;
    private final NetworkClient networkClient;
    private final NetworkClientListener networkClientListener;
    private final NetworkClientListener.Callback networkClientListenerCallback = new NetworkClientListener.Callback() {
        public /* synthetic */ void lambda$onAdRequestSuccess$0$ApiConnector$1(Task task, ApiAdResponse apiAdResponse, Listener listener) {
            listener.onAdRequestSuccess(ApiConnector.this, task, apiAdResponse);
        }

        public void onAdRequestSuccess(Task task, ApiAdResponse apiAdResponse) {
            Objects.onNotNull(ApiConnector.this.listener, new Consumer(task, apiAdResponse) {
                public final /* synthetic */ Task f$1;
                public final /* synthetic */ ApiAdResponse f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void accept(Object obj) {
                    ApiConnector.C86161.this.lambda$onAdRequestSuccess$0$ApiConnector$1(this.f$1, this.f$2, (ApiConnector.Listener) obj);
                }
            });
        }

        public /* synthetic */ void lambda$onAdRequestError$1$ApiConnector$1(Task task, ApiConnectorException apiConnectorException, Listener listener) {
            listener.onAdRequestError(ApiConnector.this, task, apiConnectorException);
        }

        public void onAdRequestError(Task task, ApiConnectorException apiConnectorException) {
            Objects.onNotNull(ApiConnector.this.listener, new Consumer(task, apiConnectorException) {
                public final /* synthetic */ Task f$1;
                public final /* synthetic */ ApiConnectorException f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void accept(Object obj) {
                    ApiConnector.C86161.this.lambda$onAdRequestError$1$ApiConnector$1(this.f$1, this.f$2, (ApiConnector.Listener) obj);
                }
            });
        }
    };

    public enum Error {
        NO_AD,
        BAD_REQUEST,
        RESPONSE_MAPPING,
        TRANSPORT_TIMEOUT,
        TRANSPORT_IO_ERROR,
        TRANSPORT_NO_NETWORK_CONNECTION,
        TRANSPORT_GENERIC,
        CANCELLED
    }

    public interface Listener {
        void onAdRequestError(ApiConnector apiConnector, Task task, ApiConnectorException apiConnectorException);

        void onAdRequestSuccess(ApiConnector apiConnector, Task task, ApiAdResponse apiAdResponse);
    }

    public ApiConnector(Logger logger2, ApiRequestMapper apiRequestMapper2, ApiResponseMapper apiResponseMapper, NetworkClient networkClient2) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.apiRequestMapper = (ApiRequestMapper) Objects.requireNonNull(apiRequestMapper2);
        this.networkClient = (NetworkClient) Objects.requireNonNull(networkClient2);
        NetworkClientListener networkClientListener2 = new NetworkClientListener(logger2, apiResponseMapper, this.networkClientListenerCallback);
        this.networkClientListener = networkClientListener2;
        this.networkClient.setListener(networkClientListener2);
    }

    public void setListener(Listener listener2) {
        this.listener = (Listener) Objects.requireNonNull(listener2);
    }

    public Task performApiAdRequest(ApiAdRequest apiAdRequest) {
        Objects.requireNonNull(apiAdRequest);
        return this.networkClient.performNetworkRequest(this.apiRequestMapper.map(apiAdRequest), (SomaApiContext) null);
    }

    public Task performApiAdRequest(String str, SomaApiContext somaApiContext) {
        Objects.requireNonNull(str);
        return this.networkClient.performNetworkRequest(this.apiRequestMapper.map(str), somaApiContext);
    }
}
