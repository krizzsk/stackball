package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
public final class zzalh {
    private static zzalh zzdeq;
    private AtomicBoolean zzder = new AtomicBoolean(false);

    public static zzalh zzte() {
        if (zzdeq == null) {
            zzdeq = new zzalh();
        }
        return zzdeq;
    }

    zzalh() {
    }

    public final Thread zzc(Context context, String str) {
        if (!this.zzder.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new zzalg(this, context, str));
        thread.start();
        return thread;
    }

    public final Thread zzl(Context context) {
        if (!this.zzder.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new zzalj(this, context));
        thread.start();
        return thread;
    }

    private static void zza(Context context, AppMeasurementSdk appMeasurementSdk) {
        try {
            ((zzbgt) zzazv.zza(context, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", zzali.zzbvh)).zza(ObjectWrapper.wrap(context), new zzale(appMeasurementSdk));
        } catch (RemoteException | zzazx | NullPointerException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }

    private static boolean zzm(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    static /* synthetic */ void zzn(Context context) {
        zzzz.initialize(context);
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcky)).booleanValue() && zzm(context)) {
            zza(context, AppMeasurementSdk.getInstance(context));
        }
    }

    static /* synthetic */ void zzd(Context context, String str) {
        zzzz.initialize(context);
        Bundle bundle = new Bundle();
        bundle.putBoolean("measurementEnabled", ((Boolean) zzvj.zzpv().zzd(zzzz.zzckt)).booleanValue());
        zza(context, AppMeasurementSdk.getInstance(context, "FA-Ads", "am", str, bundle));
    }
}
