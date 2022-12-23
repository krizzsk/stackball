package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.zzbek;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzi {
    public final int index;
    public final ViewGroup parent;
    public final ViewGroup.LayoutParams zzdkm;
    public final Context zzvf;

    public zzi(zzbek zzbek) throws zzg {
        this.zzdkm = zzbek.getLayoutParams();
        ViewParent parent2 = zzbek.getParent();
        this.zzvf = zzbek.zzabe();
        if (parent2 == null || !(parent2 instanceof ViewGroup)) {
            throw new zzg("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent2;
        this.parent = viewGroup;
        this.index = viewGroup.indexOfChild(zzbek.getView());
        this.parent.removeView(zzbek.getView());
        zzbek.zzba(true);
    }
}
