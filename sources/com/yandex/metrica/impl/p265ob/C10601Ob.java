package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10839Vd;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.Ob */
public final class C10601Ob {

    /* renamed from: a */
    private final C11823ui f25334a;

    public C10601Ob(C11823ui uiVar) {
        this.f25334a = uiVar;
    }

    /* renamed from: a */
    public final HttpsURLConnection mo61858a() {
        HttpsURLConnection httpsURLConnection;
        String c = this.f25334a.mo63801c();
        try {
            C10619P0 i = C10619P0.m27164i();
            Intrinsics.checkNotNullExpressionValue(i, "GlobalServiceLocator.getInstance()");
            httpsURLConnection = i.mo61896x().mo62577a(c);
        } catch (Throwable unused) {
            httpsURLConnection = null;
        }
        if (httpsURLConnection == null) {
            return null;
        }
        httpsURLConnection.setInstanceFollowRedirects(true);
        int i2 = C10839Vd.C10840a.f26007a;
        httpsURLConnection.setConnectTimeout(i2);
        httpsURLConnection.setReadTimeout(i2);
        httpsURLConnection.setUseCaches(false);
        return httpsURLConnection;
    }
}
