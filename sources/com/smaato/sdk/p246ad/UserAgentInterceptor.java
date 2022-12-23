package com.smaato.sdk.p246ad;

import android.content.Context;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.smaato.sdk.net.Interceptor;
import com.smaato.sdk.net.Request;
import com.smaato.sdk.net.Response;
import java.io.IOException;
import java.lang.reflect.Constructor;

/* renamed from: com.smaato.sdk.ad.UserAgentInterceptor */
public class UserAgentInterceptor implements Interceptor {
    private final String userAgent;

    public UserAgentInterceptor(Context context) {
        this.userAgent = getUserAgent(context);
    }

    public Response intercept(Interceptor.Chain chain) throws IOException {
        if (chain != null) {
            Request request = chain.request();
            return chain.proceed(request.buildUpon().headers(request.headers().buildUpon().put("User-Agent", this.userAgent).build()).build());
        }
        throw new NullPointerException("'chain' specified as non-null is null");
    }

    private static String getUserAgent(Context context) {
        Constructor<WebSettings> declaredConstructor;
        boolean isAccessible;
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                return WebSettings.getDefaultUserAgent(context);
            }
            declaredConstructor = WebSettings.class.getDeclaredConstructor(new Class[]{Context.class, WebView.class});
            isAccessible = declaredConstructor.isAccessible();
            declaredConstructor.setAccessible(true);
            String userAgentString = declaredConstructor.newInstance(new Object[]{context, null}).getUserAgentString();
            declaredConstructor.setAccessible(isAccessible);
            return userAgentString;
        } catch (Exception unused) {
            return new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable th) {
            declaredConstructor.setAccessible(isAccessible);
            throw th;
        }
    }
}
