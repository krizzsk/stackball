package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzcte extends zzvy {
    private final ViewGroup zzfiv;
    private final zzdhe zzfll;
    private final zzvm zzfps;
    private final zzblx zzgiu;
    private final Context zzvf;

    public zzcte(Context context, zzvm zzvm, zzdhe zzdhe, zzblx zzblx) {
        this.zzvf = context;
        this.zzfps = zzvm;
        this.zzfll = zzdhe;
        this.zzgiu = zzblx;
        FrameLayout frameLayout = new FrameLayout(this.zzvf);
        frameLayout.removeAllViews();
        frameLayout.addView(this.zzgiu.zzahe(), zzq.zzky().zzxl());
        frameLayout.setMinimumHeight(zzkg().heightPixels);
        frameLayout.setMinimumWidth(zzkg().widthPixels);
        this.zzfiv = frameLayout;
    }

    public final boolean isLoading() throws RemoteException {
        return false;
    }

    public final boolean isReady() throws RemoteException {
        return false;
    }

    public final void setImmersiveMode(boolean z) throws RemoteException {
    }

    public final void setUserId(String str) throws RemoteException {
    }

    public final void showInterstitial() throws RemoteException {
    }

    public final void stopLoading() throws RemoteException {
    }

    public final void zza(zzapq zzapq) throws RemoteException {
    }

    public final void zza(zzapw zzapw, String str) throws RemoteException {
    }

    public final void zza(zzasn zzasn) throws RemoteException {
    }

    public final void zza(zzrn zzrn) throws RemoteException {
    }

    public final void zza(zzut zzut) throws RemoteException {
    }

    public final void zza(zzxr zzxr) throws RemoteException {
    }

    public final void zzbn(String str) throws RemoteException {
    }

    public final IObjectWrapper zzke() throws RemoteException {
        return ObjectWrapper.wrap(this.zzfiv);
    }

    public final void destroy() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzgiu.destroy();
    }

    public final boolean zza(zzuj zzuj) throws RemoteException {
        zzawr.zzfb("loadAd is not supported for a Publisher AdView returned from AdLoader.");
        return false;
    }

    public final void pause() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzgiu.zzahz().zzbx((Context) null);
    }

    public final void resume() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzgiu.zzahz().zzby((Context) null);
    }

    public final void zzkf() throws RemoteException {
        this.zzgiu.zzkf();
    }

    public final zzum zzkg() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        return zzdhh.zzb(this.zzvf, Collections.singletonList(this.zzgiu.zzahd()));
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        if (this.zzgiu.zzaia() != null) {
            return this.zzgiu.zzaia().getMediationAdapterClassName();
        }
        return null;
    }

    public final zzxl getVideoController() throws RemoteException {
        return this.zzgiu.getVideoController();
    }

    public final String getAdUnitId() throws RemoteException {
        return this.zzfll.zzgux;
    }

    public final zzwh zzkj() throws RemoteException {
        return this.zzfll.zzgvc;
    }

    public final zzvm zzkk() throws RemoteException {
        return this.zzfps;
    }

    public final String zzkh() throws RemoteException {
        if (this.zzgiu.zzaia() != null) {
            return this.zzgiu.zzaia().getMediationAdapterClassName();
        }
        return null;
    }

    public final zzxg zzki() {
        return this.zzgiu.zzaia();
    }

    public final void zza(zzze zzze) throws RemoteException {
        zzawr.zzfb("setVideoOptions is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void zza(zzum zzum) throws RemoteException {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        zzblx zzblx = this.zzgiu;
        if (zzblx != null) {
            zzblx.zza(this.zzfiv, zzum);
        }
    }

    public final void zza(zzaas zzaas) throws RemoteException {
        zzawr.zzfb("setOnCustomRenderedAdLoadedListener is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void zza(zzvl zzvl) throws RemoteException {
        zzawr.zzfb("setAdClickListener is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void zza(zzwn zzwn) throws RemoteException {
        zzawr.zzfb("setCorrelationIdProvider is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void setManualImpressionsEnabled(boolean z) throws RemoteException {
        zzawr.zzfb("setManualImpressionsEnabled is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void zza(zzvm zzvm) throws RemoteException {
        zzawr.zzfb("setAdListener is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void zza(zzwh zzwh) throws RemoteException {
        zzawr.zzfb("setAppEventListener is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void zza(zzwc zzwc) throws RemoteException {
        zzawr.zzfb("setAdMetadataListener is not supported in Publisher AdView returned by AdLoader.");
    }

    public final Bundle getAdMetadata() throws RemoteException {
        zzawr.zzfb("getAdMetadata is not supported in Publisher AdView returned by AdLoader.");
        return new Bundle();
    }

    public final void zza(zzxf zzxf) {
        zzawr.zzfb("setOnPaidEventListener is not supported in Publisher AdView returned by AdLoader.");
    }
}
