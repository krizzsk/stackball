package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzoc {
    private final Map<String, String> zzbgr = new HashMap();
    private Map<String, String> zzbgs;

    public final synchronized Map<String, String> zzis() {
        if (this.zzbgs == null) {
            this.zzbgs = Collections.unmodifiableMap(new HashMap(this.zzbgr));
        }
        return this.zzbgs;
    }
}
