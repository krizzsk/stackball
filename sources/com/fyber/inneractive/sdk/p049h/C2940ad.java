package com.fyber.inneractive.sdk.p049h;

import android.os.Build;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.fyber.inneractive.sdk.h.ad */
public final class C2940ad extends C2937ab<String> {

    /* renamed from: a */
    private String f7078a;

    /* renamed from: b */
    private final String f7079b;

    /* renamed from: g */
    private final AtomicInteger f7080g;

    public C2940ad(C2977r<String> rVar, String str, String str2) {
        this(rVar, str, str2, new C2957f());
    }

    private C2940ad(C2977r<String> rVar, String str, String str2, C2956e eVar) {
        super(rVar, eVar);
        this.f7080g = new AtomicInteger();
        this.f7079b = str;
        this.f7078a = str2;
        this.f7068e = eVar;
    }

    /* renamed from: c */
    public final C2984u mo18406c() {
        return C2984u.POST;
    }

    /* renamed from: m */
    public final int mo18410m() {
        return C2945ah.f7088b;
    }

    /* renamed from: e */
    public final byte[] mo18395e() {
        try {
            IAlog.m9034b("NetworkRequestEvent: network request body %s", this.f7078a);
            if (Build.VERSION.SDK_INT >= 19) {
                return this.f7078a.getBytes(StandardCharsets.UTF_8);
            }
            return this.f7078a.getBytes("UTF-8");
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    /* renamed from: k */
    public final String mo18409k() {
        return this.f7079b;
    }

    /* renamed from: a */
    public final C2986w<String> mo18405a(InputStream inputStream, Map<String, List<String>> map, int i) throws Exception {
        try {
            C2987x xVar = new C2987x();
            xVar.f7270a = String.valueOf(i);
            return xVar;
        } catch (Exception e) {
            IAlog.m9032a("failed parse event network request", (Throwable) e, new Object[0]);
            throw new C2985v(e);
        }
    }

    /* renamed from: g */
    public final boolean mo18407g() {
        return this.f7080g.getAndIncrement() < 4;
    }

    /* renamed from: h */
    public final int mo18408h() {
        return ((int) Math.pow(2.0d, (double) this.f7080g.get())) * 1000;
    }
}
