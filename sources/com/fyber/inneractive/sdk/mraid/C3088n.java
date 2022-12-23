package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.p056m.C3039d;
import com.fyber.inneractive.sdk.util.C3629aj;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.mraid.n */
final class C3088n extends C3074b {
    /* renamed from: b */
    public final boolean mo18658b() {
        return true;
    }

    C3088n(Map<String, String> map, C3039d dVar, C3629aj ajVar) {
        super(map, dVar, ajVar);
    }

    /* renamed from: d */
    public final void mo18664d() {
        int a = mo18661a("w");
        int a2 = mo18661a("h");
        int a3 = mo18661a("offsetX");
        int a4 = mo18661a("offsetY");
        boolean c = mo18663c("allowOffscreen");
        mo18662b("customClosePosition");
        if (a <= 0) {
            a = this.f7582c.f7512y;
        }
        int i = a;
        if (a2 <= 0) {
            a2 = this.f7582c.f7513z;
        }
        this.f7582c.mo18600a(i, a2, a3, a4, c);
    }
}
