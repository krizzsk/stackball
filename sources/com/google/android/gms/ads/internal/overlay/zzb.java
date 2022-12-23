package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.internal.ads.zzawr;
import com.google.android.gms.internal.ads.zzaxa;
import com.google.android.gms.internal.ads.zzvj;
import com.google.android.gms.internal.ads.zzzz;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzb {
    public static boolean zza(Context context, zzd zzd, zzt zzt) {
        int i = 0;
        if (zzd == null) {
            zzawr.zzfc("No intent data for launcher overlay.");
            return false;
        }
        zzzz.initialize(context);
        if (zzd.intent != null) {
            return zza(context, zzd.intent, zzt);
        }
        Intent intent = new Intent();
        if (TextUtils.isEmpty(zzd.url)) {
            zzawr.zzfc("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(zzd.mimeType)) {
            intent.setDataAndType(Uri.parse(zzd.url), zzd.mimeType);
        } else {
            intent.setData(Uri.parse(zzd.url));
        }
        intent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(zzd.packageName)) {
            intent.setPackage(zzd.packageName);
        }
        if (!TextUtils.isEmpty(zzd.zzdki)) {
            String[] split = zzd.zzdki.split("/", 2);
            if (split.length < 2) {
                String valueOf = String.valueOf(zzd.zzdki);
                zzawr.zzfc(valueOf.length() != 0 ? "Could not parse component name from open GMSG: ".concat(valueOf) : new String("Could not parse component name from open GMSG: "));
                return false;
            }
            intent.setClassName(split[0], split[1]);
        }
        String str = zzd.zzdkj;
        if (!TextUtils.isEmpty(str)) {
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                zzawr.zzfc("Could not parse intent flags.");
            }
            intent.addFlags(i);
        }
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcqe)).booleanValue()) {
            intent.addFlags(268435456);
            intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcqd)).booleanValue()) {
                zzq.zzkw();
                zzaxa.zzb(context, intent);
            }
        }
        return zza(context, intent, zzt);
    }

    private static boolean zza(Context context, Intent intent, zzt zzt) {
        try {
            String valueOf = String.valueOf(intent.toURI());
            zzawr.zzeg(valueOf.length() != 0 ? "Launching an intent: ".concat(valueOf) : new String("Launching an intent: "));
            zzq.zzkw();
            zzaxa.zza(context, intent);
            if (zzt == null) {
                return true;
            }
            zzt.zzuq();
            return true;
        } catch (ActivityNotFoundException e) {
            zzawr.zzfc(e.getMessage());
            return false;
        }
    }
}
