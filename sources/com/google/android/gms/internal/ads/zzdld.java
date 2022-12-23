package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzdld {
    private final Executor executor;
    private final String zzbnd;
    private final Clock zzbnt;
    private final String zzcgc;
    private final String zzdma;
    private final zzdt zzfgm;
    private final zzdgz zzfmx;
    private final zzcqi zzfof;
    private final zzbaa zzhao;
    private final Context zzvf;

    public zzdld(Executor executor2, zzbaa zzbaa, zzcqi zzcqi, zzazz zzazz, String str, String str2, Context context, zzdgz zzdgz, Clock clock, zzdt zzdt) {
        this.executor = executor2;
        this.zzhao = zzbaa;
        this.zzfof = zzcqi;
        this.zzbnd = zzazz.zzbnd;
        this.zzdma = str;
        this.zzcgc = str2;
        this.zzvf = context;
        this.zzfmx = zzdgz;
        this.zzbnt = clock;
        this.zzfgm = zzdt;
    }

    public final void zza(zzdha zzdha, zzdgo zzdgo, List<String> list) {
        zza(zzdha, zzdgo, false, "", list);
    }

    public final void zza(zzdha zzdha, zzdgo zzdgo, boolean z, String str, List<String> list) {
        ArrayList arrayList = new ArrayList();
        String str2 = z ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO;
        for (String zzc : list) {
            String zzc2 = zzc(zzc(zzc(zzc, "@gw_adlocid@", zzdha.zzgur.zzfll.zzgux), "@gw_adnetrefresh@", str2), "@gw_sdkver@", this.zzbnd);
            if (zzdgo != null) {
                zzc2 = zzavj.zzc(zzc(zzc(zzc(zzc2, "@gw_qdata@", zzdgo.zzdfa), "@gw_adnetid@", zzdgo.zzagd), "@gw_allocid@", zzdgo.zzdfq), this.zzvf, zzdgo.zzdov);
            }
            String zzc3 = zzc(zzc(zzc(zzc2, "@gw_adnetstatus@", this.zzfof.zzape()), "@gw_seqnum@", this.zzdma), "@gw_sessid@", this.zzcgc);
            if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcol)).booleanValue() && !TextUtils.isEmpty(str)) {
                if (this.zzfgm.zzb(Uri.parse(zzc3))) {
                    zzc3 = Uri.parse(zzc3).buildUpon().appendQueryParameter("ms", str).build().toString();
                }
            }
            arrayList.add(zzc3);
        }
        zzh(arrayList);
    }

    public final void zza(zzdha zzdha, zzdgo zzdgo, List<String> list, zzasd zzasd) {
        long currentTimeMillis = this.zzbnt.currentTimeMillis();
        try {
            String type = zzasd.getType();
            String num = Integer.toString(zzasd.getAmount());
            ArrayList arrayList = new ArrayList();
            zzdgz zzdgz = this.zzfmx;
            String str = "";
            String zzgw = zzdgz == null ? str : zzgw(zzdgz.zzdrf);
            zzdgz zzdgz2 = this.zzfmx;
            if (zzdgz2 != null) {
                str = zzgw(zzdgz2.zzdrg);
            }
            for (String zzc : list) {
                arrayList.add(zzavj.zzc(zzc(zzc(zzc(zzc(zzc(zzc(zzc, "@gw_rwd_userid@", Uri.encode(zzgw)), "@gw_rwd_custom_data@", Uri.encode(str)), "@gw_tmstmp@", Long.toString(currentTimeMillis)), "@gw_rwd_itm@", Uri.encode(type)), "@gw_rwd_amt@", num), "@gw_sdkver@", this.zzbnd), this.zzvf, zzdgo.zzdov));
            }
            zzh(arrayList);
        } catch (RemoteException unused) {
        }
    }

    public final void zzh(List<String> list) {
        for (String zzeq : list) {
            zzeq(zzeq);
        }
    }

    public final void zzeq(String str) {
        this.executor.execute(new zzdlg(this, str));
    }

    private static String zzc(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    private static String zzgw(String str) {
        return (TextUtils.isEmpty(str) || !zzazq.isEnabled()) ? str : "fakeForAdDebugLog";
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzgx(String str) {
        this.zzhao.zzeq(str);
    }
}
