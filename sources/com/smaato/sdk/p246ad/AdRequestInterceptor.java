package com.smaato.sdk.p246ad;

import com.smaato.sdk.net.HttpException;
import com.smaato.sdk.net.Interceptor;
import com.smaato.sdk.net.Response;
import com.smaato.sdk.p246ad.SomaException;
import java.io.IOException;
import java.net.SocketTimeoutException;

/* renamed from: com.smaato.sdk.ad.AdRequestInterceptor */
public class AdRequestInterceptor implements Interceptor {
    public Response intercept(Interceptor.Chain chain) throws IOException {
        if (chain != null) {
            try {
                Response proceed = chain.proceed(chain.request());
                if (204 != proceed.responseCode()) {
                    return proceed;
                }
                SomaException.Type type = SomaException.Type.NO_CONTENT;
                throw new SomaException(type, "Server returned HTTP response code: 204 for URL: " + proceed.request().uri().toString());
            } catch (SocketTimeoutException e) {
                throw new SomaException(SomaException.Type.NETWORK_ERROR, (Throwable) e);
            } catch (HttpException e2) {
                int responseCode = e2.getResponseCode();
                if (400 <= responseCode && responseCode < 420) {
                    throw new SomaException(SomaException.Type.BAD_REQUEST, e2.getCause());
                } else if (500 > responseCode || responseCode >= 510) {
                    throw e2;
                } else {
                    throw new SomaException(SomaException.Type.BAD_RESPONSE, e2.getCause());
                }
            }
        } else {
            throw new NullPointerException("'chain' specified as non-null is null");
        }
    }
}
