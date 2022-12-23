package com.fyber.inneractive.sdk.p049h;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InvalidAppIdException;
import com.fyber.inneractive.sdk.p029a.C2681a;
import com.fyber.inneractive.sdk.p029a.C2704e;
import com.fyber.inneractive.sdk.util.C3670q;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.h.ac */
public final class C2939ac<T> extends C2937ab<T> {

    /* renamed from: a */
    private final Context f7075a;

    /* renamed from: b */
    private final C2681a<T> f7076b;

    /* renamed from: g */
    private C2975q<T> f7077g;

    /* renamed from: g */
    public final boolean mo18407g() {
        return false;
    }

    /* renamed from: h */
    public final int mo18408h() {
        return 0;
    }

    public C2939ac(C2977r<T> rVar, Context context, C2681a<T> aVar) {
        super(rVar, new C2957f());
        this.f7075a = context;
        this.f7076b = aVar;
    }

    /* renamed from: c */
    public final C2984u mo18406c() {
        return C2984u.GET;
    }

    /* renamed from: m */
    public final int mo18410m() {
        return C2945ah.f7088b;
    }

    /* renamed from: a */
    public final C2986w<T> mo18405a(InputStream inputStream, Map<String, List<String>> map, int i) throws Exception {
        C2987x xVar = new C2987x();
        try {
            String stringBuffer = C3670q.m9156a(inputStream).toString();
            xVar.f7270a = this.f7076b.mo17885a(stringBuffer);
            xVar.f7271b = stringBuffer;
            return xVar;
        } catch (Exception e) {
            IAlog.m9032a("failed parse cacheable network request", (Throwable) e, new Object[0]);
            if (e instanceof InvalidAppIdException) {
                throw e;
            }
            throw new C2985v(e);
        }
    }

    /* renamed from: k */
    public final String mo18409k() {
        return this.f7076b.mo17889c();
    }

    /* renamed from: i */
    public final String mo18397i() {
        return this.f7076b.mo17888b();
    }

    /* renamed from: j */
    public final C2935a<T> mo18398j() {
        C2975q<T> qVar = new C2975q<>(this.f7075a, this.f7076b);
        this.f7077g = qVar;
        C2704e<T> a = qVar.mo18439a();
        return new C2935a<>(a.f6372b, a.f6371a, this.f7076b.mo17888b());
    }

    /* renamed from: a */
    public final void mo18392a(C2986w<T> wVar, String str, String str2) {
        C2975q<T> qVar = this.f7077g;
        if (qVar != null) {
            qVar.f7252d = str2;
            if (qVar.f7251c == null) {
                qVar.f7251c = qVar.f7249a.getSharedPreferences("IAConfigurationPreferences", 0);
            }
            qVar.f7251c.edit().putString(qVar.f7250b.mo17886a(), str2).apply();
            if (wVar != null && !wVar.mo18447b().isEmpty() && !str.isEmpty()) {
                if (!this.f7077g.mo18440a(str, wVar.mo18447b())) {
                    IAlog.m9037e("Failed to cache file", new Object[0]);
                } else {
                    this.f7076b.mo17887a(wVar.mo18446a());
                }
            }
        }
    }
}
