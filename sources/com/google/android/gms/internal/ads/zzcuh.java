package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbqj;
import com.google.android.gms.internal.ads.zzbuj;
import com.google.android.gms.internal.ads.zzcuu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzcuh extends zzavq {
    private static final List<String> zzgkq = new ArrayList(Arrays.asList(new String[]{"/aclk", "/pcs/click"}));
    private static final List<String> zzgkr = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com"}));
    private static final List<String> zzgks = new ArrayList(Arrays.asList(new String[]{"/pagead/adview", "/pcs/view", "/pagead/conversion"}));
    private static final List<String> zzgkt = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"}));
    /* access modifiers changed from: private */
    public zzazz zzbml;
    private zzdt zzfgm;
    private final ScheduledExecutorService zzfky;
    private Point zzfql = new Point();
    private Point zzfqm = new Point();
    private final zzdrh zzfur;
    private zzdhp<zzcdt> zzgga;
    private zzbgy zzgku;
    private zzaqh zzgkv;
    private Context zzvf;

    public zzcuh(zzbgy zzbgy, Context context, zzdt zzdt, zzazz zzazz, zzdhp<zzcdt> zzdhp, zzdrh zzdrh, ScheduledExecutorService scheduledExecutorService) {
        this.zzgku = zzbgy;
        this.zzvf = context;
        this.zzfgm = zzdt;
        this.zzbml = zzazz;
        this.zzgga = zzdhp;
        this.zzfur = zzdrh;
        this.zzfky = scheduledExecutorService;
    }

    public final IObjectWrapper zzao(IObjectWrapper iObjectWrapper) {
        return null;
    }

    public final IObjectWrapper zzb(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return null;
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzavt zzavt, zzavm zzavm) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        this.zzvf = context;
        String str = zzavt.zzbsc;
        String str2 = zzavt.zzbna;
        zzum zzum = zzavt.zzdtf;
        zzuj zzuj = zzavt.zzdtg;
        zzcue zzadj = this.zzgku.zzadj();
        zzbqj.zza zzcb = new zzbqj.zza().zzcb(context);
        zzdhg zzdhg = new zzdhg();
        if (str == null) {
            str = "adUnitId";
        }
        zzdhg zzgr = zzdhg.zzgr(str);
        if (zzuj == null) {
            zzuj = new zzui().zzpg();
        }
        zzdhg zzh = zzgr.zzh(zzuj);
        if (zzum == null) {
            zzum = new zzum();
        }
        zzdqw.zza(zzadj.zzf(zzcb.zza(zzh.zzd(zzum).zzasc()).zzair()).zza(new zzcuu(new zzcuu.zza().zzgq(str2))).zzf(new zzbuj.zza().zzajm()).zzafv().zzagb(), new zzcuq(this, zzavm), this.zzgku.zzacv());
    }

    public final void zzan(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcue)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper);
            zzaqh zzaqh = this.zzgkv;
            this.zzfql = zzaza.zza(motionEvent, zzaqh == null ? null : zzaqh.zzaae);
            if (motionEvent.getAction() == 0) {
                this.zzfqm = this.zzfql;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation((float) this.zzfql.x, (float) this.zzfql.y);
            this.zzfgm.zza(obtain);
            obtain.recycle();
        }
    }

    public final void zza(zzaqh zzaqh) {
        this.zzgkv = zzaqh;
        this.zzgga.zzdw(1);
    }

    public final void zza(List<Uri> list, IObjectWrapper iObjectWrapper, zzapx zzapx) {
        if (!((Boolean) zzvj.zzpv().zzd(zzzz.zzcue)).booleanValue()) {
            try {
                zzapx.onError("The updating URL feature is not enabled.");
            } catch (RemoteException e) {
                zzazw.zzc("", e);
            }
        } else {
            zzdri zzd = this.zzfur.zzd(new zzcug(this, list, iObjectWrapper));
            if (zzapw()) {
                zzd = zzdqw.zzb(zzd, new zzcuj(this), (Executor) this.zzfur);
            } else {
                zzawr.zzfb("Asset view map is empty.");
            }
            zzdqw.zza(zzd, new zzcut(this, zzapx), this.zzgku.zzacv());
        }
    }

    public final void zzb(List<Uri> list, IObjectWrapper iObjectWrapper, zzapx zzapx) {
        try {
            if (!((Boolean) zzvj.zzpv().zzd(zzzz.zzcue)).booleanValue()) {
                zzapx.onError("The updating URL feature is not enabled.");
            } else if (list.size() != 1) {
                zzapx.onError("There should be only 1 click URL.");
            } else {
                Uri uri = list.get(0);
                if (!zza(uri, zzgkq, zzgkr)) {
                    String valueOf = String.valueOf(uri);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                    sb.append("Not a Google URL: ");
                    sb.append(valueOf);
                    zzawr.zzfc(sb.toString());
                    zzapx.onSuccess(list);
                    return;
                }
                zzdri zzd = this.zzfur.zzd(new zzcui(this, uri, iObjectWrapper));
                if (zzapw()) {
                    zzd = zzdqw.zzb(zzd, new zzcul(this), (Executor) this.zzfur);
                } else {
                    zzawr.zzfb("Asset view map is empty.");
                }
                zzdqw.zza(zzd, new zzcus(this, zzapx), this.zzgku.zzacv());
            }
        } catch (RemoteException e) {
            zzazw.zzc("", e);
        }
    }

    private static boolean zzk(Uri uri) {
        return zza(uri, zzgks, zzgkt);
    }

    /* access modifiers changed from: private */
    /* renamed from: zza */
    public final Uri zzb(Uri uri, IObjectWrapper iObjectWrapper) throws Exception {
        try {
            uri = this.zzfgm.zza(uri, this.zzvf, (View) ObjectWrapper.unwrap(iObjectWrapper), (Activity) null);
        } catch (zzdw e) {
            zzazw.zzd("", e);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    private static boolean zza(Uri uri, List<String> list, List<String> list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (!(host == null || path == null)) {
            for (String contains : list) {
                if (path.contains(contains)) {
                    for (String endsWith : list2) {
                        if (host.endsWith(endsWith)) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    private final zzdri<String> zzgp(String str) {
        zzcdt[] zzcdtArr = new zzcdt[1];
        zzdri<O> zzb = zzdqw.zzb(this.zzgga.zzasg(), new zzcuo(this, zzcdtArr, str), (Executor) this.zzfur);
        zzb.addListener(new zzcur(this, zzcdtArr), this.zzfur);
        return zzdqr.zzg(zzb).zza((long) ((Integer) zzvj.zzpv().zzd(zzzz.zzcuf)).intValue(), TimeUnit.MILLISECONDS, this.zzfky).zza(zzcum.zzdsc, this.zzfur).zza(Exception.class, zzcup.zzdsc, (Executor) this.zzfur);
    }

    private static Uri zza(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i = indexOf + 1;
        return Uri.parse(uri2.substring(0, i) + str + "=" + str2 + "&" + uri2.substring(i));
    }

    private final boolean zzapw() {
        zzaqh zzaqh = this.zzgkv;
        return (zzaqh == null || zzaqh.zzdli == null || this.zzgkv.zzdli.isEmpty()) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzcdt[] zzcdtArr) {
        if (zzcdtArr[0] != null) {
            this.zzgga.zzd(zzdqw.zzag(zzcdtArr[0]));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zza(zzcdt[] zzcdtArr, String str, zzcdt zzcdt) throws Exception {
        zzcdtArr[0] = zzcdt;
        JSONObject zza = zzaza.zza(this.zzvf, this.zzgkv.zzdli, this.zzgkv.zzdli, this.zzgkv.zzaae);
        JSONObject zza2 = zzaza.zza(this.zzvf, this.zzgkv.zzaae);
        JSONObject zzs = zzaza.zzs(this.zzgkv.zzaae);
        JSONObject zzb = zzaza.zzb(this.zzvf, this.zzgkv.zzaae);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", zza);
        jSONObject.put("ad_view_signal", zza2);
        jSONObject.put("scroll_view_signal", zzs);
        jSONObject.put("lock_screen_signal", zzb);
        if (str == "google.afma.nativeAds.getPublisherCustomRenderedClickSignals") {
            jSONObject.put("click_signal", zzaza.zza((String) null, this.zzvf, this.zzfqm, this.zzfql));
        }
        return zzcdt.zzc(str, jSONObject);
    }

    static /* synthetic */ Uri zzc(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? zza(uri, "nas", str) : uri;
    }

    static /* synthetic */ ArrayList zza(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!zzk(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(zza(uri, "nas", str));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zzl(Uri uri) throws Exception {
        return zzdqw.zzb(zzgp("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzcun(this, uri), (Executor) this.zzfur);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zzb(ArrayList arrayList) throws Exception {
        return zzdqw.zzb(zzgp("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzcuk(this, arrayList), (Executor) this.zzfur);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList zza(List list, IObjectWrapper iObjectWrapper) throws Exception {
        String zza = this.zzfgm.zzcb() != null ? this.zzfgm.zzcb().zza(this.zzvf, (View) ObjectWrapper.unwrap(iObjectWrapper), (Activity) null) : "";
        if (!TextUtils.isEmpty(zza)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                if (!zzk(uri)) {
                    String valueOf = String.valueOf(uri);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                    sb.append("Not a Google URL: ");
                    sb.append(valueOf);
                    zzawr.zzfc(sb.toString());
                    arrayList.add(uri);
                } else {
                    arrayList.add(zza(uri, "ms", zza));
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
            throw new Exception("Empty impression URLs result.");
        }
        throw new Exception("Failed to get view signals.");
    }
}
