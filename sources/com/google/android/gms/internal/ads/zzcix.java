package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.internal.zzq;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzcix implements AppEventListener, zzbqx, zzbrc, zzbrp, zzbrs, zzbsm, zzbtm, zzdla, zzub {
    private long startTime;
    private final List<Object> zzdzj;
    private final zzcil zzfzu;

    public zzcix(zzcil zzcil, zzbgy zzbgy) {
        this.zzfzu = zzcil;
        this.zzdzj = Collections.singletonList(zzbgy);
    }

    public final void zzb(zzdha zzdha) {
    }

    public final void zzbx(Context context) {
        zza((Class<?>) zzbrs.class, "onPause", context);
    }

    public final void zzby(Context context) {
        zza((Class<?>) zzbrs.class, "onResume", context);
    }

    public final void zzbz(Context context) {
        zza((Class<?>) zzbrs.class, "onDestroy", context);
    }

    public final void onAppEvent(String str, String str2) {
        zza((Class<?>) AppEventListener.class, "onAppEvent", str, str2);
    }

    public final void onAdLoaded() {
        long elapsedRealtime = zzq.zzld().elapsedRealtime() - this.startTime;
        StringBuilder sb = new StringBuilder(41);
        sb.append("Ad Request Latency : ");
        sb.append(elapsedRealtime);
        zzawr.zzeg(sb.toString());
        zza((Class<?>) zzbsm.class, "onAdLoaded", new Object[0]);
    }

    public final void onAdFailedToLoad(int i) {
        zza((Class<?>) zzbrc.class, "onAdFailedToLoad", Integer.valueOf(i));
    }

    public final void onAdOpened() {
        zza((Class<?>) zzbqx.class, "onAdOpened", new Object[0]);
    }

    public final void onAdClosed() {
        zza((Class<?>) zzbqx.class, "onAdClosed", new Object[0]);
    }

    public final void onAdLeftApplication() {
        zza((Class<?>) zzbqx.class, "onAdLeftApplication", new Object[0]);
    }

    public final void onAdClicked() {
        zza((Class<?>) zzub.class, "onAdClicked", new Object[0]);
    }

    public final void onAdImpression() {
        zza((Class<?>) zzbrp.class, "onAdImpression", new Object[0]);
    }

    public final void onRewardedVideoStarted() {
        zza((Class<?>) zzbqx.class, "onRewardedVideoStarted", new Object[0]);
    }

    @ParametersAreNonnullByDefault
    public final void zzb(zzasd zzasd, String str, String str2) {
        zza((Class<?>) zzbqx.class, "onRewarded", zzasd, str, str2);
    }

    public final void onRewardedVideoCompleted() {
        zza((Class<?>) zzbqx.class, "onRewardedVideoCompleted", new Object[0]);
    }

    public final void zza(zzdkr zzdkr, String str) {
        zza((Class<?>) zzdks.class, "onTaskCreated", str);
    }

    public final void zzb(zzdkr zzdkr, String str) {
        zza((Class<?>) zzdks.class, "onTaskStarted", str);
    }

    public final void zza(zzdkr zzdkr, String str, Throwable th) {
        zza((Class<?>) zzdks.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    public final void zzc(zzdkr zzdkr, String str) {
        zza((Class<?>) zzdks.class, "onTaskSucceeded", str);
    }

    private final void zza(Class<?> cls, String str, Object... objArr) {
        zzcil zzcil = this.zzfzu;
        List<Object> list = this.zzdzj;
        String valueOf = String.valueOf(cls.getSimpleName());
        zzcil.zza(list, valueOf.length() != 0 ? "Event-".concat(valueOf) : new String("Event-"), str, objArr);
    }

    public final void zzd(zzarj zzarj) {
        this.startTime = zzq.zzld().elapsedRealtime();
        zza((Class<?>) zzbtm.class, "onAdRequest", new Object[0]);
    }
}
