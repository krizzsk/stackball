package com.mbridge.msdk.foundation.same.net.p176e;

import com.mbridge.msdk.thrid.okhttp.ConnectionPool;
import com.mbridge.msdk.thrid.okhttp.Dispatcher;
import com.mbridge.msdk.thrid.okhttp.EventListener;
import com.mbridge.msdk.thrid.okhttp.OkHttpClient;
import java.util.concurrent.TimeUnit;

/* renamed from: com.mbridge.msdk.foundation.same.net.e.b */
/* compiled from: OKHTTPClientManager */
public final class C6265b {

    /* renamed from: a */
    private OkHttpClient f15537a;

    /* renamed from: com.mbridge.msdk.foundation.same.net.e.b$a */
    /* compiled from: OKHTTPClientManager */
    private static final class C6267a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C6265b f15539a = new C6265b();
    }

    private C6265b() {
        this.f15537a = null;
    }

    /* renamed from: a */
    public final synchronized OkHttpClient mo43847a() {
        if (this.f15537a == null) {
            Dispatcher dispatcher = new Dispatcher();
            dispatcher.setMaxRequestsPerHost(10);
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.readTimeout(100, TimeUnit.SECONDS);
            builder.connectTimeout(60, TimeUnit.SECONDS);
            builder.writeTimeout(60, TimeUnit.SECONDS);
            builder.connectionPool(new ConnectionPool(32, 5, TimeUnit.MINUTES));
            builder.dispatcher(dispatcher);
            builder.eventListener(new EventListener() {
            });
            this.f15537a = builder.build();
        }
        return this.f15537a;
    }
}
