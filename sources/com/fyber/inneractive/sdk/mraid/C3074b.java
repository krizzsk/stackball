package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.p056m.C3039d;
import com.fyber.inneractive.sdk.util.C3629aj;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.mraid.b */
public abstract class C3074b {

    /* renamed from: a */
    public String f7580a;

    /* renamed from: b */
    protected Map<String, String> f7581b;

    /* renamed from: c */
    protected C3039d f7582c;

    /* renamed from: d */
    protected C3629aj f7583d;

    /* renamed from: b */
    public abstract boolean mo18658b();

    /* renamed from: d */
    public abstract void mo18664d();

    C3074b(Map<String, String> map, C3039d dVar, C3629aj ajVar) {
        this.f7581b = map;
        this.f7583d = ajVar;
        this.f7582c = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo18661a(String str) {
        String str2 = this.f7581b.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Integer.parseInt(str2, 10);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public final String mo18662b(String str) {
        return this.f7581b.get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo18663c(String str) {
        return "true".equals(this.f7581b.get(str));
    }
}
