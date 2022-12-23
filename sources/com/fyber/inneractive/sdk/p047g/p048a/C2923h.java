package com.fyber.inneractive.sdk.p047g.p048a;

import android.text.TextUtils;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.g.a.h */
public enum C2923h {
    Jpeg(MimeTypes.IMAGE_JPEG),
    Jpg("image/jpg"),
    Gif("image/gif"),
    Png("image/png");
    

    /* renamed from: f */
    private static final Map<String, C2923h> f6990f = null;

    /* renamed from: e */
    String f6992e;

    static {
        int i;
        f6990f = new HashMap();
        for (C2923h hVar : values()) {
            f6990f.put(hVar.f6992e, hVar);
        }
    }

    private C2923h(String str) {
        this.f6992e = str;
    }

    /* renamed from: a */
    public static C2923h m6554a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return f6990f.get(str.toLowerCase());
        }
        return null;
    }
}
