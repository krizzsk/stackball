package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.mraid.C3078f;
import com.fyber.inneractive.sdk.p056m.C3039d;
import com.fyber.inneractive.sdk.util.C3629aj;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.mraid.m */
final class C3087m extends C3071a {
    public C3087m(Map<String, String> map, C3039d dVar, C3629aj ajVar) {
        super(map, dVar, ajVar);
    }

    /* renamed from: d */
    public final void mo18664d() {
        String b = mo18662b("uri");
        if (b == null || "".equals(b)) {
            this.f7582c.mo18601a(C3078f.C3080a.PLAY_VIDEO, "Video can't be played with null or empty URL");
        } else {
            this.f7582c.mo18603a(b);
        }
    }

    /* renamed from: a */
    public final String mo18657a() {
        return mo18662b("uri");
    }
}
