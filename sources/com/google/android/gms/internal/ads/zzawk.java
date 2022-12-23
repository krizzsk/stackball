package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzawk {
    private final Object lock = new Object();
    private long zzduq = -1;
    private long zzdur = -1;
    private int zzdus = -1;
    int zzdut = -1;
    private long zzduu = 0;
    private final String zzduv;
    private final zzawt zzduw;
    private int zzdux = 0;
    private int zzduy = 0;

    public zzawk(String str, zzawt zzawt) {
        this.zzduv = str;
        this.zzduw = zzawt;
    }

    public final void zzvs() {
        synchronized (this.lock) {
            this.zzdux++;
        }
    }

    public final void zzvr() {
        synchronized (this.lock) {
            this.zzduy++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0076, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.ads.zzuj r11, long r12) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.lock
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzawt r1 = r10.zzduw     // Catch:{ all -> 0x0077 }
            long r1 = r1.zzwx()     // Catch:{ all -> 0x0077 }
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzq.zzld()     // Catch:{ all -> 0x0077 }
            long r3 = r3.currentTimeMillis()     // Catch:{ all -> 0x0077 }
            long r5 = r10.zzdur     // Catch:{ all -> 0x0077 }
            r7 = -1
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0040
            long r1 = r3 - r1
            com.google.android.gms.internal.ads.zzzk<java.lang.Long> r5 = com.google.android.gms.internal.ads.zzzz.zzclp     // Catch:{ all -> 0x0077 }
            com.google.android.gms.internal.ads.zzzv r6 = com.google.android.gms.internal.ads.zzvj.zzpv()     // Catch:{ all -> 0x0077 }
            java.lang.Object r5 = r6.zzd(r5)     // Catch:{ all -> 0x0077 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x0077 }
            long r5 = r5.longValue()     // Catch:{ all -> 0x0077 }
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0033
            r1 = -1
            r10.zzdut = r1     // Catch:{ all -> 0x0077 }
            goto L_0x003b
        L_0x0033:
            com.google.android.gms.internal.ads.zzawt r1 = r10.zzduw     // Catch:{ all -> 0x0077 }
            int r1 = r1.zzwy()     // Catch:{ all -> 0x0077 }
            r10.zzdut = r1     // Catch:{ all -> 0x0077 }
        L_0x003b:
            r10.zzdur = r12     // Catch:{ all -> 0x0077 }
            r10.zzduq = r12     // Catch:{ all -> 0x0077 }
            goto L_0x0042
        L_0x0040:
            r10.zzduq = r12     // Catch:{ all -> 0x0077 }
        L_0x0042:
            r12 = 1
            if (r11 == 0) goto L_0x0056
            android.os.Bundle r13 = r11.extras     // Catch:{ all -> 0x0077 }
            if (r13 == 0) goto L_0x0056
            android.os.Bundle r11 = r11.extras     // Catch:{ all -> 0x0077 }
            java.lang.String r13 = "gw"
            r1 = 2
            int r11 = r11.getInt(r13, r1)     // Catch:{ all -> 0x0077 }
            if (r11 != r12) goto L_0x0056
            monitor-exit(r0)     // Catch:{ all -> 0x0077 }
            return
        L_0x0056:
            int r11 = r10.zzdus     // Catch:{ all -> 0x0077 }
            int r11 = r11 + r12
            r10.zzdus = r11     // Catch:{ all -> 0x0077 }
            int r11 = r10.zzdut     // Catch:{ all -> 0x0077 }
            int r11 = r11 + r12
            r10.zzdut = r11     // Catch:{ all -> 0x0077 }
            if (r11 != 0) goto L_0x006c
            r11 = 0
            r10.zzduu = r11     // Catch:{ all -> 0x0077 }
            com.google.android.gms.internal.ads.zzawt r11 = r10.zzduw     // Catch:{ all -> 0x0077 }
            r11.zzfa(r3)     // Catch:{ all -> 0x0077 }
            goto L_0x0075
        L_0x006c:
            com.google.android.gms.internal.ads.zzawt r11 = r10.zzduw     // Catch:{ all -> 0x0077 }
            long r11 = r11.zzwz()     // Catch:{ all -> 0x0077 }
            long r3 = r3 - r11
            r10.zzduu = r3     // Catch:{ all -> 0x0077 }
        L_0x0075:
            monitor-exit(r0)     // Catch:{ all -> 0x0077 }
            return
        L_0x0077:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0077 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzawk.zza(com.google.android.gms.internal.ads.zzuj, long):void");
    }

    public final Bundle zzo(Context context, String str) {
        Bundle bundle;
        synchronized (this.lock) {
            bundle = new Bundle();
            bundle.putString("session_id", this.zzduv);
            bundle.putLong("basets", this.zzdur);
            bundle.putLong("currts", this.zzduq);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.zzdus);
            bundle.putInt("preqs_in_session", this.zzdut);
            bundle.putLong("time_in_session", this.zzduu);
            bundle.putInt("pclick", this.zzdux);
            bundle.putInt("pimp", this.zzduy);
            bundle.putBoolean("support_transparent_background", zzam(context));
        }
        return bundle;
    }

    private static boolean zzam(Context context) {
        Context zzaa = zzase.zzaa(context);
        int identifier = zzaa.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (identifier == 0) {
            zzawr.zzfb("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        try {
            if (identifier == zzaa.getPackageManager().getActivityInfo(new ComponentName(zzaa.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                return true;
            }
            zzawr.zzfb("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            zzawr.zzfc("Fail to fetch AdActivity theme");
            zzawr.zzfb("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
    }
}
