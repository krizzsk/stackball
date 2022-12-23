package com.fyber.inneractive.sdk.util;

import android.net.Uri;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.util.ai */
public final class C3628ai {
    /* renamed from: a */
    public static String m9050a(String str, Map<String, String> map) {
        StringBuilder sb = new StringBuilder(str);
        boolean z = true;
        for (Map.Entry next : map.entrySet()) {
            sb.append(z ? "?" : "&");
            sb.append((String) next.getKey());
            sb.append("=");
            sb.append(Uri.encode((String) next.getValue()));
            z = false;
        }
        return sb.toString();
    }
}
