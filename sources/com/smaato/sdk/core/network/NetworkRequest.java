package com.smaato.sdk.core.network;

import java.util.List;
import java.util.Map;

public interface NetworkRequest {
    public static final int DEFAULT_CONNECT_TIMEOUT_SECONDS = 30000;
    public static final int DEFAULT_READ_TIMEOUT_SECONDS = 30000;

    byte[] getBody();

    int getConnectTimeout();

    Map<String, List<String>> getHeaders();

    Method getMethod();

    Map<String, String> getQueryItems();

    int getReadTimeout();

    String getUrl();

    public enum Method {
        GET("GET"),
        POST("POST"),
        PUT("PUT"),
        DELETE("DELETE");
        
        private static final BodyValidator shouldHaveBody = null;
        private static final BodyValidator shouldNotHaveBody = null;
        private BodyValidator bodyValidator;
        private final String methodName;

        @FunctionalInterface
        interface BodyValidator {
            boolean validate(byte[] bArr);
        }

        static {
            shouldHaveBody = $$Lambda$NetworkRequest$Method$gSKEUV8o7SvqbjliLwg5JXYpi8k.INSTANCE;
            $$Lambda$3Birl1zLlr6NOO9XkWbSulf003w r0 = $$Lambda$3Birl1zLlr6NOO9XkWbSulf003w.INSTANCE;
            shouldNotHaveBody = r0;
            GET.bodyValidator = r0;
            Method method = POST;
            BodyValidator bodyValidator2 = shouldHaveBody;
            method.bodyValidator = bodyValidator2;
            PUT.bodyValidator = bodyValidator2;
            DELETE.bodyValidator = r0;
        }

        private Method(String str) {
            this.methodName = str;
        }

        public final String getMethodName() {
            return this.methodName;
        }

        public final boolean validateBody(byte[] bArr) {
            return this.bodyValidator.validate(bArr);
        }
    }
}
