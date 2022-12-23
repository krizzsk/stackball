package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
public final class zzaqi {
    /* access modifiers changed from: private */
    @Nonnull
    public View zzaae;
    /* access modifiers changed from: private */
    public final Map<String, WeakReference<View>> zzdli = new HashMap();

    public final zzaqi zzk(View view) {
        this.zzaae = view;
        return this;
    }

    public final zzaqi zzh(Map<String, View> map) {
        this.zzdli.clear();
        for (Map.Entry next : map.entrySet()) {
            View view = (View) next.getValue();
            if (view != null) {
                this.zzdli.put((String) next.getKey(), new WeakReference(view));
            }
        }
        return this;
    }
}
