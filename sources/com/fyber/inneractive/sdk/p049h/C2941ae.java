package com.fyber.inneractive.sdk.p049h;

import com.fyber.inneractive.sdk.util.C3670q;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.fyber.inneractive.sdk.h.ae */
public final class C2941ae extends C2937ab<String> {

    /* renamed from: a */
    private final String f7081a;

    /* renamed from: b */
    private final AtomicInteger f7082b;

    public C2941ae(C2977r<String> rVar, String str) {
        this(rVar, str, new C2957f());
    }

    private C2941ae(C2977r<String> rVar, String str, C2956e eVar) {
        super(rVar, eVar);
        this.f7082b = new AtomicInteger();
        this.f7081a = str;
    }

    /* renamed from: c */
    public final C2984u mo18406c() {
        return C2984u.GET;
    }

    /* renamed from: g */
    public final boolean mo18407g() {
        return this.f7082b.getAndIncrement() < 4;
    }

    /* renamed from: h */
    public final int mo18408h() {
        return ((int) Math.pow(2.0d, (double) this.f7082b.get())) * 1000;
    }

    /* renamed from: k */
    public final String mo18409k() {
        return this.f7081a;
    }

    /* renamed from: a */
    public final C2986w<String> mo18405a(InputStream inputStream, Map<String, List<String>> map, int i) throws Exception {
        try {
            C2987x xVar = new C2987x();
            xVar.f7270a = String.valueOf(i);
            if (inputStream != null) {
                xVar.f7271b = C3670q.m9156a(inputStream).toString();
            }
            return xVar;
        } catch (Exception e) {
            IAlog.m9032a("failed parse hit network request", (Throwable) e, new Object[0]);
            throw new C2985v(e);
        }
    }

    /* renamed from: m */
    public final int mo18410m() {
        return C2945ah.f7088b;
    }
}
