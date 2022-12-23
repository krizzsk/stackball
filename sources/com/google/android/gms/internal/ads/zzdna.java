package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.appsflyer.share.Constants;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.internal.ads.zzbv;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.ogury.p245ed.OguryAdFormatErrorCode;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
final class zzdna implements zzdlq {
    private final Object zzhcv;
    private final zzdmz zzhcw;
    private final zzdnm zzhcx;
    private final zzdlk zzvj;

    zzdna(Object obj, zzdmz zzdmz, zzdnm zzdnm, zzdlk zzdlk) {
        this.zzhcv = obj;
        this.zzhcw = zzdmz;
        this.zzhcx = zzdnm;
        this.zzvj = zzdlk;
    }

    /* access modifiers changed from: package-private */
    public final zzdmz zzave() {
        return this.zzhcw;
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean zzavf() throws zzdnk {
        try {
        } catch (Exception e) {
            throw new zzdnk(2001, (Throwable) e);
        }
        return ((Boolean) this.zzhcv.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.zzhcv, new Object[0])).booleanValue();
    }

    public final synchronized void close() throws zzdnk {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.zzhcv.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.zzhcv, new Object[0]);
            this.zzvj.zzg(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzdnk(2003, (Throwable) e);
        }
    }

    public final synchronized String zzu(Context context, String str) {
        Map<String, Object> zzcd;
        zzcd = this.zzhcx.zzcd();
        zzcd.put(InneractiveMediationDefs.GENDER_FEMALE, CampaignEx.JSON_KEY_AD_Q);
        zzcd.put("ctx", context);
        zzcd.put("aid", (Object) null);
        return zzk(zzb((Map<String, String>) null, zzcd));
    }

    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        Map<String, Object> zzce;
        zzce = this.zzhcx.zzce();
        zzce.put(InneractiveMediationDefs.GENDER_FEMALE, "v");
        zzce.put("ctx", context);
        zzce.put("aid", (Object) null);
        zzce.put("view", view);
        zzce.put("act", activity);
        return zzk(zzb((Map<String, String>) null, zzce));
    }

    public final synchronized String zza(Context context, String str, String str2, View view, Activity activity) {
        Map<String, Object> zzcf;
        zzcf = this.zzhcx.zzcf();
        zzcf.put(InneractiveMediationDefs.GENDER_FEMALE, Constants.URL_CAMPAIGN);
        zzcf.put("ctx", context);
        zzcf.put("cs", str2);
        zzcf.put("aid", (Object) null);
        zzcf.put("view", view);
        zzcf.put("act", activity);
        return zzk(zzb((Map<String, String>) null, zzcf));
    }

    public final synchronized void zza(String str, MotionEvent motionEvent) throws zzdnk {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("aid", (Object) null);
            hashMap.put("evt", motionEvent);
            this.zzhcv.getClass().getDeclaredMethod("he", new Class[]{Map.class}).invoke(this.zzhcv, new Object[]{hashMap});
            this.zzvj.zzg(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzdnk(2005, (Throwable) e);
        }
    }

    public final synchronized int zzavg() throws zzdnk {
        try {
        } catch (Exception e) {
            throw new zzdnk(2006, (Throwable) e);
        }
        return ((Integer) this.zzhcv.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.zzhcv, new Object[0])).intValue();
    }

    private static String zzk(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(((zzbv.zzf) ((zzecd) zzbv.zzf.zzbm().zzb(zzcc.DG).zzj(zzeaq.zzu(bArr)).zzbet())).toByteArray(), 11);
    }

    private final synchronized byte[] zzb(Map<String, String> map, Map<String, Object> map2) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            this.zzvj.zza((int) OguryAdFormatErrorCode.ACTIVITY_IN_BACKGROUND, System.currentTimeMillis() - currentTimeMillis, e);
            return null;
        }
        return (byte[]) this.zzhcv.getClass().getDeclaredMethod("xss", new Class[]{Map.class, Map.class}).invoke(this.zzhcv, new Object[]{null, map2});
    }
}
