package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.android.gms.internal.ads.zzbfj;
import com.google.android.gms.internal.ads.zzbfr;
import com.google.android.gms.internal.ads.zzbft;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzbff<WebViewT extends zzbfj & zzbfr & zzbft> {
    private final zzbfk zzeld;
    private final WebViewT zzele;

    public static zzbff<zzbek> zzc(zzbek zzbek) {
        return new zzbff<>(zzbek, new zzbfi(zzbek));
    }

    private zzbff(WebViewT webviewt, zzbfk zzbfk) {
        this.zzeld = zzbfk;
        this.zzele = webviewt;
    }

    @JavascriptInterface
    public final void notify(String str) {
        if (TextUtils.isEmpty(str)) {
            zzawr.zzfc("URL is empty, ignoring message");
        } else {
            zzaxa.zzdwf.post(new zzbfh(this, str));
        }
    }

    @JavascriptInterface
    public final String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            zzawr.zzeg("Click string is empty, not proceeding.");
            return "";
        }
        zzdt zzabm = ((zzbfr) this.zzele).zzabm();
        if (zzabm == null) {
            zzawr.zzeg("Signal utils is empty, ignoring.");
            return "";
        }
        zzdj zzcb = zzabm.zzcb();
        if (zzcb == null) {
            zzawr.zzeg("Signals object is empty, ignoring.");
            return "";
        } else if (this.zzele.getContext() != null) {
            return zzcb.zza(this.zzele.getContext(), str, ((zzbft) this.zzele).getView(), this.zzele.zzzh());
        } else {
            zzawr.zzeg("Context is null, ignoring.");
            return "";
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzfs(String str) {
        this.zzeld.zzh(Uri.parse(str));
    }
}
