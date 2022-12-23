package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.ads.internal.zzq;
import java.io.InputStream;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public class zzaxl extends zzaxm {
    public final int zzxn() {
        return 16974374;
    }

    public final CookieManager zzbf(Context context) {
        if (zzxm()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzawr.zzc("Failed to obtain CookieManager.", th);
            zzq.zzla().zza(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public final zzbej zza(zzbek zzbek, zzst zzst, boolean z) {
        return new zzbfn(zzbek, zzst, z);
    }

    public final WebResourceResponse zza(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, str3, map, inputStream);
    }
}
