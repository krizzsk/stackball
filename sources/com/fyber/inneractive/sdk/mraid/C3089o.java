package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.p056m.C3039d;
import com.fyber.inneractive.sdk.util.C3629aj;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.mraid.o */
final class C3089o extends C3074b {
    /* renamed from: b */
    public final boolean mo18658b() {
        return false;
    }

    C3089o(Map<String, String> map, C3039d dVar, C3629aj ajVar) {
        super(map, dVar, ajVar);
    }

    /* renamed from: d */
    public final void mo18664d() {
        this.f7582c.setOrientationProperties(this.f7581b == null || !this.f7581b.containsKey("allowOrientationChange") || !"false".equals(this.f7581b.get("allowOrientationChange")), mo18662b("forceOrientation"));
    }
}
