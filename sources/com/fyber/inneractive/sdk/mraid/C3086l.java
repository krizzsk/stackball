package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.mraid.C3078f;
import com.fyber.inneractive.sdk.p056m.C3039d;
import com.fyber.inneractive.sdk.util.C3629aj;
import com.fyber.inneractive.sdk.util.C3685u;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.mraid.l */
public final class C3086l extends C3071a {
    C3086l(Map<String, String> map, C3039d dVar, C3629aj ajVar) {
        super(map, dVar, ajVar);
    }

    /* renamed from: d */
    public final void mo18664d() {
        String str;
        String b = mo18662b("url");
        IAlog.m9033a("IAmraidActionOpen: opening Internal Browser For Url: %s", b);
        if (this.f7582c != null) {
            C3685u.C3686a c = this.f7582c.mo18607c(b, this.f7583d);
            if (c.f9977a == C3685u.C3688c.FAILED) {
                C3039d dVar = this.f7582c;
                C3078f.C3080a aVar = C3078f.C3080a.OPEN;
                if (c.f9978b == null) {
                    str = "unknown error";
                } else {
                    str = c.f9978b.getMessage();
                }
                dVar.mo18601a(aVar, str);
            }
        }
    }

    /* renamed from: c */
    public final void mo18659c() {
        super.mo18659c();
        if (this.f7582c != null) {
            this.f7582c.mo18601a(C3078f.C3080a.OPEN, "No native click was detected in a timely fashion");
        }
    }

    /* renamed from: a */
    public final String mo18657a() {
        return mo18662b("url");
    }
}
