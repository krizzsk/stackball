package com.fyber.inneractive.sdk.p047g.p048a;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.g.a.o */
public enum C2930o {
    MEDIA_TYPE_MP4("video/mp4"),
    MEDIA_TYPE_3GPP("video/3gpp"),
    MEDIA_TYPE_WEBM("video/webm"),
    UNKNOWN("unknown");
    

    /* renamed from: f */
    private static final Map<String, C2930o> f7025f = null;

    /* renamed from: e */
    final String f7027e;

    static {
        int i;
        f7025f = new HashMap();
        for (C2930o oVar : values()) {
            f7025f.put(oVar.f7027e, oVar);
        }
    }

    private C2930o(String str) {
        this.f7027e = str;
    }

    /* renamed from: a */
    public static C2930o m6557a(String str) {
        return f7025f.containsKey(str) ? f7025f.get(str) : UNKNOWN;
    }
}
