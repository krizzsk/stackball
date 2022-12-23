package com.smaato.sdk.core.network.execution;

import com.google.common.net.HttpHeaders;
import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.NetworkRequest;
import com.smaato.sdk.core.network.UrlCreator;
import com.smaato.sdk.core.network.execution.ClickThroughUrlRedirectResolver;
import com.smaato.sdk.core.util.Objects;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class ClickThroughUrlRedirectResolver {
    private final HttpsOnlyPolicy httpsOnlyPolicy;
    private final Logger logger;
    private final NetworkActions networkActions;
    private final UrlCreator urlCreator;

    public ClickThroughUrlRedirectResolver(Logger logger2, NetworkActions networkActions2, UrlCreator urlCreator2, HttpsOnlyPolicy httpsOnlyPolicy2) {
        this.logger = (Logger) Objects.requireNonNull(logger2, "Parameter logger cannot be null for ClickThroughUrlRedirectResolver::new");
        this.networkActions = (NetworkActions) Objects.requireNonNull(networkActions2, "Parameter networkActions cannot be null for ClickThroughUrlRedirectResolver::new");
        this.urlCreator = (UrlCreator) Objects.requireNonNull(urlCreator2, "Parameter urlCreator cannot be null for ClickThroughUrlRedirectResolver::new");
        this.httpsOnlyPolicy = (HttpsOnlyPolicy) Objects.requireNonNull(httpsOnlyPolicy2, "Parameter httpsOnlyPolicy cannot be null for ClickThroughUrlRedirectResolver::new");
    }

    public TaskStepResult<String, Exception> resolve(String str, ConnectionConfig connectionConfig, SomaApiContext somaApiContext) {
        return resolve(str, connectionConfig, somaApiContext, 16);
    }

    private TaskStepResult<String, Exception> resolve(String str, ConnectionConfig connectionConfig, SomaApiContext somaApiContext, int i) {
        if (i <= 0) {
            this.logger.debug(LogDomain.NETWORK, "Redirect limit reached", new Object[0]);
            return TaskStepResult.success(str);
        } else if (!this.urlCreator.isSupportedForNetworking(str)) {
            return TaskStepResult.success(str);
        } else {
            return this.networkActions.executeRequest(somaApiContext, str, Collections.emptyMap(), "GET", connectionConfig.getConnectionTimeout(), connectionConfig.getReadTimeout(), connectionConfig.getRequestHeaders(), (byte[]) null).andThen(this.networkActions.wrapIo(new IoFunction(somaApiContext, connectionConfig, i, str) {
                public final /* synthetic */ SomaApiContext f$1;
                public final /* synthetic */ ClickThroughUrlRedirectResolver.ConnectionConfig f$2;
                public final /* synthetic */ int f$3;
                public final /* synthetic */ String f$4;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                }

                public final Object apply(Object obj) {
                    return ClickThroughUrlRedirectResolver.this.lambda$resolve$0$ClickThroughUrlRedirectResolver(this.f$1, this.f$2, this.f$3, this.f$4, (HttpURLConnection) obj);
                }
            }));
        }
    }

    public /* synthetic */ TaskStepResult lambda$resolve$0$ClickThroughUrlRedirectResolver(SomaApiContext somaApiContext, ConnectionConfig connectionConfig, int i, String str, HttpURLConnection httpURLConnection) throws IOException {
        HttpUrlConnections.ensureConnectionResourcesReleased(httpURLConnection);
        if (!this.networkActions.isRedirect(httpURLConnection)) {
            return TaskStepResult.success(str);
        }
        String headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
        if (headerField == null) {
            NullPointerException nullPointerException = new NullPointerException("Redirected Location url is null");
            this.logger.error(LogDomain.NETWORK, nullPointerException, "Redirected Location url is null", new Object[0]);
            return TaskStepResult.error(nullPointerException);
        } else if (!this.urlCreator.isSupportedForNetworking(headerField)) {
            return TaskStepResult.success(headerField);
        } else {
            if (!this.httpsOnlyPolicy.validateUrl(somaApiContext, headerField)) {
                return TaskStepResult.success(headerField);
            }
            return resolve(headerField, connectionConfig, somaApiContext, i - 1);
        }
    }

    public static class ConnectionConfig {
        private final int connectionTimeout;
        private final int readTimeout;
        private final Map<String, List<String>> requestHeaders;

        public ConnectionConfig(int i, int i2, Map<String, List<String>> map) {
            this.connectionTimeout = i;
            this.readTimeout = i2;
            this.requestHeaders = (Map) Objects.requireNonNull(map, "Parameter requestHeaders cannot be null for ConnectionConfig::new");
        }

        public int getConnectionTimeout() {
            return this.connectionTimeout;
        }

        public int getReadTimeout() {
            return this.readTimeout;
        }

        public Map<String, List<String>> getRequestHeaders() {
            return this.requestHeaders;
        }

        public static ConnectionConfig fromRequest(NetworkRequest networkRequest) {
            return new ConnectionConfig(networkRequest.getConnectTimeout(), networkRequest.getReadTimeout(), networkRequest.getHeaders());
        }
    }
}
