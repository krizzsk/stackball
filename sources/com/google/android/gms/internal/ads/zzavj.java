package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzavj {
    public static String zzc(String str, Context context, boolean z) {
        String zzag;
        if ((((Boolean) zzvj.zzpv().zzd(zzzz.zzckx)).booleanValue() && !z) || !zzq.zzlu().zzab(context) || TextUtils.isEmpty(str) || (zzag = zzq.zzlu().zzag(context)) == null) {
            return str;
        }
        String zzae = zzq.zzlu().zzae(context);
        String zzaf = zzq.zzlu().zzaf(context);
        if (zzq.zzkw().zzen(str) || zzq.zzkw().zzeo(str)) {
            if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(zzae)) {
                str = zza(str, "gmp_app_id", zzae).toString();
            }
            if (!str.contains("fbs_aiid") && !TextUtils.isEmpty(zzaf)) {
                str = zza(str, "fbs_aiid", zzaf).toString();
            }
        }
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzckp)).booleanValue()) {
            String str2 = (String) zzvj.zzpv().zzd(zzzz.zzckq);
            if (!str.contains(str2)) {
                return str;
            }
            if (zzq.zzkw().zzen(str)) {
                zzq.zzlu().zzh(context, zzag);
                return str.replace(str2, zzag);
            } else if (!zzq.zzkw().zzeo(str)) {
                return str;
            } else {
                zzq.zzlu().zzi(context, zzag);
                return str.replace(str2, zzag);
            }
        } else if (str.contains("fbs_aeid")) {
            return str;
        } else {
            if (zzq.zzkw().zzen(str)) {
                zzq.zzlu().zzh(context, zzag);
                return zza(str, "fbs_aeid", zzag).toString();
            } else if (!zzq.zzkw().zzeo(str)) {
                return str;
            } else {
                zzq.zzlu().zzi(context, zzag);
                return zza(str, "fbs_aeid", zzag).toString();
            }
        }
    }

    public static String zzb(Uri uri, Context context) {
        if (!zzq.zzlu().zzab(context)) {
            return uri.toString();
        }
        String zzag = zzq.zzlu().zzag(context);
        if (zzag == null) {
            return uri.toString();
        }
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzckp)).booleanValue()) {
            String str = (String) zzvj.zzpv().zzd(zzzz.zzckq);
            String uri2 = uri.toString();
            if (uri2.contains(str)) {
                zzq.zzlu().zzh(context, zzag);
                return uri2.replace(str, zzag);
            }
        } else if (TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            uri = zza(uri.toString(), "fbs_aeid", zzag);
            zzq.zzlu().zzh(context, zzag);
        }
        return uri.toString();
    }

    private static Uri zza(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = indexOf + 1;
        return Uri.parse(str.substring(0, i) + str2 + "=" + str3 + "&" + str.substring(i));
    }
}
