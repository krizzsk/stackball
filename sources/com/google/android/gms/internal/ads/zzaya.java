package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.ads.internal.zzq;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzaya {
    private final Object lock = new Object();
    private String zzdxa = "";
    private String zzdxb = "";
    private boolean zzdxc = false;
    private String zzdxd = "";

    public final void zze(Context context, String str, String str2) {
        if (!zzf(context, str, str2)) {
            zza(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
        } else if ("2".equals(this.zzdxd)) {
            zzawr.zzed("Creative is not pushed for this device.");
            zza(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(this.zzdxd)) {
            zzawr.zzed("The app is not linked for creative preview.");
            zzi(context, str, str2);
        } else if (AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(this.zzdxd)) {
            zzawr.zzed("Device is linked for in app preview.");
            zza(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public final void zza(Context context, String str, String str2, String str3) {
        boolean zzxu = zzxu();
        if (zzg(context, str, str2)) {
            if (!zzxu && !TextUtils.isEmpty(str3)) {
                zzc(context, str2, str3, str);
            }
            zzawr.zzed("Device is linked for debug signals.");
            zza(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        zzi(context, str, str2);
    }

    private final boolean zzf(Context context, String str, String str2) {
        String zzh = zzh(context, zzd(context, (String) zzvj.zzpv().zzd(zzzz.zzcqh), str, str2).toString(), str2);
        if (TextUtils.isEmpty(zzh)) {
            zzawr.zzed("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(zzh.trim());
            String optString = jSONObject.optString("gct");
            this.zzdxd = jSONObject.optString("status");
            synchronized (this.lock) {
                this.zzdxb = optString;
            }
            return true;
        } catch (JSONException e) {
            zzawr.zzd("Fail to get in app preview response json.", e);
            return false;
        }
    }

    private final boolean zzg(Context context, String str, String str2) {
        String zzh = zzh(context, zzd(context, (String) zzvj.zzpv().zzd(zzzz.zzcqi), str, str2).toString(), str2);
        if (TextUtils.isEmpty(zzh)) {
            zzawr.zzed("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(zzh.trim()).optString("debug_mode"));
            synchronized (this.lock) {
                this.zzdxc = equals;
            }
            return equals;
        } catch (JSONException e) {
            zzawr.zzd("Fail to get debug mode response json.", e);
            return false;
        }
    }

    private static String zzh(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", zzq.zzkw().zzr(context, str2));
        zzdri<String> zzc = new zzaym(context).zzc(str, hashMap);
        try {
            return (String) zzc.get((long) ((Integer) zzvj.zzpv().zzd(zzzz.zzcqk)).intValue(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            String valueOf = String.valueOf(str);
            zzawr.zzc(valueOf.length() != 0 ? "Timeout while retriving a response from: ".concat(valueOf) : new String("Timeout while retriving a response from: "), e);
            zzc.cancel(true);
            return null;
        } catch (InterruptedException e2) {
            String valueOf2 = String.valueOf(str);
            zzawr.zzc(valueOf2.length() != 0 ? "Interrupted while retriving a response from: ".concat(valueOf2) : new String("Interrupted while retriving a response from: "), e2);
            zzc.cancel(true);
            return null;
        } catch (Exception e3) {
            String valueOf3 = String.valueOf(str);
            zzawr.zzc(valueOf3.length() != 0 ? "Error retriving a response from: ".concat(valueOf3) : new String("Error retriving a response from: "), e3);
            return null;
        }
    }

    private final void zzi(Context context, String str, String str2) {
        zzq.zzkw();
        zzaxa.zza(context, zzd(context, (String) zzvj.zzpv().zzd(zzzz.zzcqg), str, str2));
    }

    public final boolean zzb(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !zzq.zzlg().zzxu()) {
            return false;
        }
        zzawr.zzed("Sending troubleshooting signals to the server.");
        zzc(context, str, str2, str3);
        return true;
    }

    private final void zzc(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = zzd(context, (String) zzvj.zzpv().zzd(zzzz.zzcqj), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        zzq.zzkw();
        zzaxa.zzb(context, str, buildUpon.build().toString());
    }

    private final Uri zzd(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("linkedDeviceId", zzbh(context));
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    private final String zzbh(Context context) {
        String str;
        synchronized (this.lock) {
            if (TextUtils.isEmpty(this.zzdxa)) {
                zzq.zzkw();
                String zzs = zzaxa.zzs(context, "debug_signals_id.txt");
                this.zzdxa = zzs;
                if (TextUtils.isEmpty(zzs)) {
                    zzq.zzkw();
                    this.zzdxa = zzaxa.zzxg();
                    zzq.zzkw();
                    zzaxa.zzc(context, "debug_signals_id.txt", this.zzdxa);
                }
            }
            str = this.zzdxa;
        }
        return str;
    }

    public final String zzxt() {
        String str;
        synchronized (this.lock) {
            str = this.zzdxb;
        }
        return str;
    }

    public final boolean zzxu() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzdxc;
        }
        return z;
    }

    private final void zza(Context context, String str, boolean z, boolean z2) {
        if (!(context instanceof Activity)) {
            zzawr.zzfb("Can not create dialog without Activity Context");
        } else {
            zzaxa.zzdwf.post(new zzaxz(this, context, str, z, z2));
        }
    }
}
