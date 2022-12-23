package com.p243my.target.mediation;

import android.content.Context;
import android.text.TextUtils;
import com.p243my.target.C7374e0;
import com.p243my.target.C7665t2;
import com.p243my.target.ads.InterstitialAd;
import com.p243my.target.common.CustomParams;
import com.p243my.target.mediation.MediationInterstitialAdAdapter;
import java.util.Map;

/* renamed from: com.my.target.mediation.MyTargetInterstitialAdAdapter */
public final class MyTargetInterstitialAdAdapter implements MediationInterstitialAdAdapter {

    /* renamed from: ad */
    private InterstitialAd f19047ad;
    private C7665t2 section;

    /* renamed from: com.my.target.mediation.MyTargetInterstitialAdAdapter$AdListener */
    public class AdListener implements InterstitialAd.InterstitialAdListener {
        private final MediationInterstitialAdAdapter.MediationInterstitialAdListener mediationListener;

        public AdListener(MediationInterstitialAdAdapter.MediationInterstitialAdListener mediationInterstitialAdListener) {
            this.mediationListener = mediationInterstitialAdListener;
        }

        public void onClick(InterstitialAd interstitialAd) {
            C7374e0.m18989a("MyTargetInterstitialAdAdapter: ad clicked");
            this.mediationListener.onClick(MyTargetInterstitialAdAdapter.this);
        }

        public void onDismiss(InterstitialAd interstitialAd) {
            C7374e0.m18989a("MyTargetInterstitialAdAdapter: ad dismissed");
            this.mediationListener.onDismiss(MyTargetInterstitialAdAdapter.this);
        }

        public void onDisplay(InterstitialAd interstitialAd) {
            C7374e0.m18989a("MyTargetInterstitialAdAdapter: ad displayed");
            this.mediationListener.onDisplay(MyTargetInterstitialAdAdapter.this);
        }

        public void onLoad(InterstitialAd interstitialAd) {
            C7374e0.m18989a("MyTargetInterstitialAdAdapter: ad loaded");
            this.mediationListener.onLoad(MyTargetInterstitialAdAdapter.this);
        }

        public void onNoAd(String str, InterstitialAd interstitialAd) {
            C7374e0.m18989a("MyTargetInterstitialAdAdapter: no ad (" + str + ")");
            this.mediationListener.onNoAd(str, MyTargetInterstitialAdAdapter.this);
        }

        public void onVideoCompleted(InterstitialAd interstitialAd) {
            C7374e0.m18989a("MyTargetInterstitialAdAdapter: video completed");
            this.mediationListener.onVideoCompleted(MyTargetInterstitialAdAdapter.this);
        }
    }

    public void destroy() {
        InterstitialAd interstitialAd = this.f19047ad;
        if (interstitialAd != null) {
            interstitialAd.setListener((InterstitialAd.InterstitialAdListener) null);
            this.f19047ad.destroy();
            this.f19047ad = null;
        }
    }

    public void dismiss() {
        InterstitialAd interstitialAd = this.f19047ad;
        if (interstitialAd != null) {
            interstitialAd.dismiss();
        }
    }

    public void load(MediationAdConfig mediationAdConfig, MediationInterstitialAdAdapter.MediationInterstitialAdListener mediationInterstitialAdListener, Context context) {
        String placementId = mediationAdConfig.getPlacementId();
        try {
            int parseInt = Integer.parseInt(placementId);
            InterstitialAd interstitialAd = new InterstitialAd(parseInt, context);
            this.f19047ad = interstitialAd;
            interstitialAd.setMediationEnabled(false);
            this.f19047ad.setListener(new AdListener(mediationInterstitialAdListener));
            CustomParams customParams = this.f19047ad.getCustomParams();
            customParams.setAge(mediationAdConfig.getAge());
            customParams.setGender(mediationAdConfig.getGender());
            for (Map.Entry next : mediationAdConfig.getServerParams().entrySet()) {
                customParams.setCustomParam((String) next.getKey(), (String) next.getValue());
            }
            String payload = mediationAdConfig.getPayload();
            if (this.section != null) {
                C7374e0.m18989a("MyTargetInterstitialAdAdapter: got banner from mediation response");
                this.f19047ad.handleSection(this.section);
            } else if (TextUtils.isEmpty(payload)) {
                C7374e0.m18989a("MyTargetInterstitialAdAdapter: load id " + parseInt);
                this.f19047ad.load();
            } else {
                C7374e0.m18989a("MyTargetInterstitialAdAdapter: load id " + parseInt + " from BID " + payload);
                this.f19047ad.loadFromBid(payload);
            }
        } catch (Throwable unused) {
            String str = "failed to request ad, unable to convert slotId " + placementId + " to int";
            C7374e0.m18990b("MyTargetInterstitialAdAdapter error: " + str);
            mediationInterstitialAdListener.onNoAd(str, this);
        }
    }

    public void setSection(C7665t2 t2Var) {
        this.section = t2Var;
    }

    public void show(Context context) {
        InterstitialAd interstitialAd = this.f19047ad;
        if (interstitialAd != null) {
            interstitialAd.show();
        }
    }
}
