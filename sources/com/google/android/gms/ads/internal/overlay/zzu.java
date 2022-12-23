package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzapf;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzu extends zzapf {
    private Activity zzaad;
    private boolean zzdjw = false;
    private AdOverlayInfoParcel zzdld;
    private boolean zzdle = false;

    public zzu(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zzdld = adOverlayInfoParcel;
        this.zzaad = activity;
    }

    public final void onActivityResult(int i, int i2, Intent intent) throws RemoteException {
    }

    public final void onBackPressed() throws RemoteException {
    }

    public final void onRestart() throws RemoteException {
    }

    public final void onStart() throws RemoteException {
    }

    public final void zzad(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    public final void zzdp() throws RemoteException {
    }

    public final boolean zzuh() throws RemoteException {
        return false;
    }

    public final void onCreate(Bundle bundle) {
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzdld;
        if (adOverlayInfoParcel == null) {
            this.zzaad.finish();
        } else if (z) {
            this.zzaad.finish();
        } else {
            if (bundle == null) {
                if (adOverlayInfoParcel.zzceb != null) {
                    this.zzdld.zzceb.onAdClicked();
                }
                if (!(this.zzaad.getIntent() == null || !this.zzaad.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) || this.zzdld.zzdkt == null)) {
                    this.zzdld.zzdkt.zzua();
                }
            }
            zzq.zzku();
            if (!zzb.zza((Context) this.zzaad, this.zzdld.zzdks, this.zzdld.zzdkx)) {
                this.zzaad.finish();
            }
        }
    }

    public final void onResume() throws RemoteException {
        if (this.zzdjw) {
            this.zzaad.finish();
            return;
        }
        this.zzdjw = true;
        if (this.zzdld.zzdkt != null) {
            this.zzdld.zzdkt.onResume();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzdjw);
    }

    public final void onPause() throws RemoteException {
        if (this.zzdld.zzdkt != null) {
            this.zzdld.zzdkt.onPause();
        }
        if (this.zzaad.isFinishing()) {
            zzur();
        }
    }

    public final void onStop() throws RemoteException {
        if (this.zzaad.isFinishing()) {
            zzur();
        }
    }

    public final void onDestroy() throws RemoteException {
        if (this.zzaad.isFinishing()) {
            zzur();
        }
    }

    private final synchronized void zzur() {
        if (!this.zzdle) {
            if (this.zzdld.zzdkt != null) {
                this.zzdld.zzdkt.zztz();
            }
            this.zzdle = true;
        }
    }
}
