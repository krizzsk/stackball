package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.AdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
public final class zzams<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> implements MediationBannerListener, MediationInterstitialListener {
    /* access modifiers changed from: private */
    public final zzalv zzdgu;

    public zzams(zzalv zzalv) {
        this.zzdgu = zzalv;
    }

    public final void onClick(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzazw.zzed("Adapter called onClick.");
        zzvj.zzpr();
        if (!zzazm.zzye()) {
            zzazw.zze("#008 Must be called on the main UI thread.", (Throwable) null);
            zzazm.zzzn.post(new zzamv(this));
            return;
        }
        try {
            this.zzdgu.onAdClicked();
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onDismissScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzazw.zzed("Adapter called onDismissScreen.");
        zzvj.zzpr();
        if (!zzazm.zzye()) {
            zzazw.zzfc("#008 Must be called on the main UI thread.");
            zzazm.zzzn.post(new zzamw(this));
            return;
        }
        try {
            this.zzdgu.onAdClosed();
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onFailedToReceiveAd(MediationBannerAdapter<?, ?> mediationBannerAdapter, AdRequest.ErrorCode errorCode) {
        String valueOf = String.valueOf(errorCode);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error. ");
        sb.append(valueOf);
        zzazw.zzed(sb.toString());
        zzvj.zzpr();
        if (!zzazm.zzye()) {
            zzazw.zze("#008 Must be called on the main UI thread.", (Throwable) null);
            zzazm.zzzn.post(new zzamz(this, errorCode));
            return;
        }
        try {
            this.zzdgu.onAdFailedToLoad(zzane.zza(errorCode));
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onLeaveApplication(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzazw.zzed("Adapter called onLeaveApplication.");
        zzvj.zzpr();
        if (!zzazm.zzye()) {
            zzazw.zze("#008 Must be called on the main UI thread.", (Throwable) null);
            zzazm.zzzn.post(new zzamy(this));
            return;
        }
        try {
            this.zzdgu.onAdLeftApplication();
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onPresentScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzazw.zzed("Adapter called onPresentScreen.");
        zzvj.zzpr();
        if (!zzazm.zzye()) {
            zzazw.zze("#008 Must be called on the main UI thread.", (Throwable) null);
            zzazm.zzzn.post(new zzanb(this));
            return;
        }
        try {
            this.zzdgu.onAdOpened();
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onReceivedAd(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzazw.zzed("Adapter called onReceivedAd.");
        zzvj.zzpr();
        if (!zzazm.zzye()) {
            zzazw.zze("#008 Must be called on the main UI thread.", (Throwable) null);
            zzazm.zzzn.post(new zzana(this));
            return;
        }
        try {
            this.zzdgu.onAdLoaded();
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onDismissScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzazw.zzed("Adapter called onDismissScreen.");
        zzvj.zzpr();
        if (!zzazm.zzye()) {
            zzazw.zze("#008 Must be called on the main UI thread.", (Throwable) null);
            zzazm.zzzn.post(new zzand(this));
            return;
        }
        try {
            this.zzdgu.onAdClosed();
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onFailedToReceiveAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, AdRequest.ErrorCode errorCode) {
        String valueOf = String.valueOf(errorCode);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error ");
        sb.append(valueOf);
        sb.append(".");
        zzazw.zzed(sb.toString());
        zzvj.zzpr();
        if (!zzazm.zzye()) {
            zzazw.zze("#008 Must be called on the main UI thread.", (Throwable) null);
            zzazm.zzzn.post(new zzanc(this, errorCode));
            return;
        }
        try {
            this.zzdgu.onAdFailedToLoad(zzane.zza(errorCode));
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onLeaveApplication(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzazw.zzed("Adapter called onLeaveApplication.");
        zzvj.zzpr();
        if (!zzazm.zzye()) {
            zzazw.zze("#008 Must be called on the main UI thread.", (Throwable) null);
            zzazm.zzzn.post(new zzanf(this));
            return;
        }
        try {
            this.zzdgu.onAdLeftApplication();
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onPresentScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzazw.zzed("Adapter called onPresentScreen.");
        zzvj.zzpr();
        if (!zzazm.zzye()) {
            zzazw.zze("#008 Must be called on the main UI thread.", (Throwable) null);
            zzazm.zzzn.post(new zzamu(this));
            return;
        }
        try {
            this.zzdgu.onAdOpened();
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }

    public final void onReceivedAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzazw.zzed("Adapter called onReceivedAd.");
        zzvj.zzpr();
        if (!zzazm.zzye()) {
            zzazw.zze("#008 Must be called on the main UI thread.", (Throwable) null);
            zzazm.zzzn.post(new zzamx(this));
            return;
        }
        try {
            this.zzdgu.onAdLoaded();
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }
}
