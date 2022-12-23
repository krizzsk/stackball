package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzaot {
    private final zzbek zzdce;
    private final boolean zzdix;
    private final String zzdiy;

    public zzaot(zzbek zzbek, Map<String, String> map) {
        this.zzdce = zzbek;
        this.zzdiy = map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            this.zzdix = Boolean.parseBoolean(map.get("allowOrientationChange"));
        } else {
            this.zzdix = true;
        }
    }

    public final void execute() {
        int i;
        if (this.zzdce == null) {
            zzawr.zzfc("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(this.zzdiy)) {
            zzq.zzky();
            i = 7;
        } else if ("landscape".equalsIgnoreCase(this.zzdiy)) {
            zzq.zzky();
            i = 6;
        } else if (this.zzdix) {
            i = -1;
        } else {
            i = zzq.zzky().zzxk();
        }
        this.zzdce.setRequestedOrientation(i);
    }
}
