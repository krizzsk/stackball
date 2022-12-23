package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.AdRequest;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import com.google.android.gms.internal.ads.zzazw;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
public final class CustomEventAdapter implements MediationBannerAdapter<CustomEventExtras, CustomEventServerParameters>, MediationInterstitialAdapter<CustomEventExtras, CustomEventServerParameters> {
    private View zzms;
    private CustomEventBanner zzmt;
    private CustomEventInterstitial zzmu;

    private static <T> T zzak(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            zzazw.zzfc(sb.toString());
            return null;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
    static final class zza implements CustomEventBannerListener {
        private final CustomEventAdapter zzmq;
        private final MediationBannerListener zzmr;

        public zza(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
            this.zzmq = customEventAdapter;
            this.zzmr = mediationBannerListener;
        }

        public final void onReceivedAd(View view) {
            zzazw.zzed("Custom event adapter called onReceivedAd.");
            this.zzmq.zza(view);
            this.zzmr.onReceivedAd(this.zzmq);
        }

        public final void onFailedToReceiveAd() {
            zzazw.zzed("Custom event adapter called onFailedToReceiveAd.");
            this.zzmr.onFailedToReceiveAd(this.zzmq, AdRequest.ErrorCode.NO_FILL);
        }

        public final void onClick() {
            zzazw.zzed("Custom event adapter called onFailedToReceiveAd.");
            this.zzmr.onClick(this.zzmq);
        }

        public final void onPresentScreen() {
            zzazw.zzed("Custom event adapter called onFailedToReceiveAd.");
            this.zzmr.onPresentScreen(this.zzmq);
        }

        public final void onDismissScreen() {
            zzazw.zzed("Custom event adapter called onFailedToReceiveAd.");
            this.zzmr.onDismissScreen(this.zzmq);
        }

        public final void onLeaveApplication() {
            zzazw.zzed("Custom event adapter called onFailedToReceiveAd.");
            this.zzmr.onLeaveApplication(this.zzmq);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
    class zzb implements CustomEventInterstitialListener {
        private final CustomEventAdapter zzmq;
        private final MediationInterstitialListener zzmv;

        public zzb(CustomEventAdapter customEventAdapter, MediationInterstitialListener mediationInterstitialListener) {
            this.zzmq = customEventAdapter;
            this.zzmv = mediationInterstitialListener;
        }

        public final void onReceivedAd() {
            zzazw.zzed("Custom event adapter called onReceivedAd.");
            this.zzmv.onReceivedAd(CustomEventAdapter.this);
        }

        public final void onFailedToReceiveAd() {
            zzazw.zzed("Custom event adapter called onFailedToReceiveAd.");
            this.zzmv.onFailedToReceiveAd(this.zzmq, AdRequest.ErrorCode.NO_FILL);
        }

        public final void onPresentScreen() {
            zzazw.zzed("Custom event adapter called onPresentScreen.");
            this.zzmv.onPresentScreen(this.zzmq);
        }

        public final void onDismissScreen() {
            zzazw.zzed("Custom event adapter called onDismissScreen.");
            this.zzmv.onDismissScreen(this.zzmq);
        }

        public final void onLeaveApplication() {
            zzazw.zzed("Custom event adapter called onLeaveApplication.");
            this.zzmv.onLeaveApplication(this.zzmq);
        }
    }

    public final void destroy() {
        CustomEventBanner customEventBanner = this.zzmt;
        if (customEventBanner != null) {
            customEventBanner.destroy();
        }
        CustomEventInterstitial customEventInterstitial = this.zzmu;
        if (customEventInterstitial != null) {
            customEventInterstitial.destroy();
        }
    }

    public final Class<CustomEventExtras> getAdditionalParametersType() {
        return CustomEventExtras.class;
    }

    public final View getBannerView() {
        return this.zzms;
    }

    public final Class<CustomEventServerParameters> getServerParametersType() {
        return CustomEventServerParameters.class;
    }

    public final void requestBannerAd(MediationBannerListener mediationBannerListener, Activity activity, CustomEventServerParameters customEventServerParameters, AdSize adSize, MediationAdRequest mediationAdRequest, CustomEventExtras customEventExtras) {
        Object obj;
        CustomEventBanner customEventBanner = (CustomEventBanner) zzak(customEventServerParameters.className);
        this.zzmt = customEventBanner;
        if (customEventBanner == null) {
            mediationBannerListener.onFailedToReceiveAd(this, AdRequest.ErrorCode.INTERNAL_ERROR);
            return;
        }
        if (customEventExtras == null) {
            obj = null;
        } else {
            obj = customEventExtras.getExtra(customEventServerParameters.label);
        }
        Activity activity2 = activity;
        this.zzmt.requestBannerAd(new zza(this, mediationBannerListener), activity2, customEventServerParameters.label, customEventServerParameters.parameter, adSize, mediationAdRequest, obj);
    }

    public final void requestInterstitialAd(MediationInterstitialListener mediationInterstitialListener, Activity activity, CustomEventServerParameters customEventServerParameters, MediationAdRequest mediationAdRequest, CustomEventExtras customEventExtras) {
        Object obj;
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) zzak(customEventServerParameters.className);
        this.zzmu = customEventInterstitial;
        if (customEventInterstitial == null) {
            mediationInterstitialListener.onFailedToReceiveAd(this, AdRequest.ErrorCode.INTERNAL_ERROR);
            return;
        }
        if (customEventExtras == null) {
            obj = null;
        } else {
            obj = customEventExtras.getExtra(customEventServerParameters.label);
        }
        Activity activity2 = activity;
        this.zzmu.requestInterstitialAd(new zzb(this, mediationInterstitialListener), activity2, customEventServerParameters.label, customEventServerParameters.parameter, mediationAdRequest, obj);
    }

    public final void showInterstitial() {
        this.zzmu.showInterstitial();
    }

    /* access modifiers changed from: private */
    public final void zza(View view) {
        this.zzms = view;
    }
}
