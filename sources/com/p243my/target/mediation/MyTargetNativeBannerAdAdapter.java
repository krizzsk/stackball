package com.p243my.target.mediation;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.p243my.target.C7374e0;
import com.p243my.target.C7699v2;
import com.p243my.target.common.CustomParams;
import com.p243my.target.mediation.MediationNativeBannerAdAdapter;
import com.p243my.target.nativeads.NativeBannerAd;
import com.p243my.target.nativeads.banners.NativeBanner;
import java.util.List;
import java.util.Map;

/* renamed from: com.my.target.mediation.MyTargetNativeBannerAdAdapter */
public final class MyTargetNativeBannerAdAdapter implements MediationNativeBannerAdAdapter {

    /* renamed from: ad */
    private NativeBannerAd f19049ad;
    private C7699v2 section;

    /* renamed from: com.my.target.mediation.MyTargetNativeBannerAdAdapter$AdListener */
    public class AdListener implements NativeBannerAd.NativeBannerAdListener {
        private final MediationNativeBannerAdAdapter.MediationNativeBannerAdListener mediationListener;

        public AdListener(MediationNativeBannerAdAdapter.MediationNativeBannerAdListener mediationNativeBannerAdListener) {
            this.mediationListener = mediationNativeBannerAdListener;
        }

        public void onClick(NativeBannerAd nativeBannerAd) {
            C7374e0.m18989a("MyTargetNativeBannerAdAdapter: ad clicked");
            this.mediationListener.onClick(MyTargetNativeBannerAdAdapter.this);
        }

        public void onLoad(NativeBanner nativeBanner, NativeBannerAd nativeBannerAd) {
            C7374e0.m18989a("MyTargetNativeBannerAdAdapter: ad loaded");
            this.mediationListener.onLoad(nativeBanner, MyTargetNativeBannerAdAdapter.this);
        }

        public void onNoAd(String str, NativeBannerAd nativeBannerAd) {
            C7374e0.m18989a("MyTargetNativeBannerAdAdapter: no ad (" + str + ")");
            this.mediationListener.onNoAd(str, MyTargetNativeBannerAdAdapter.this);
        }

        public void onShow(NativeBannerAd nativeBannerAd) {
            C7374e0.m18989a("MyTargetNativeBannerAdAdapter: ad shown");
            this.mediationListener.onShow(MyTargetNativeBannerAdAdapter.this);
        }
    }

    public void destroy() {
        NativeBannerAd nativeBannerAd = this.f19049ad;
        if (nativeBannerAd != null) {
            nativeBannerAd.unregisterView();
            this.f19049ad.setListener((NativeBannerAd.NativeBannerAdListener) null);
            this.f19049ad = null;
        }
    }

    public View getIconView(Context context) {
        return null;
    }

    public void load(MediationNativeBannerAdConfig mediationNativeBannerAdConfig, MediationNativeBannerAdAdapter.MediationNativeBannerAdListener mediationNativeBannerAdListener, Context context) {
        String placementId = mediationNativeBannerAdConfig.getPlacementId();
        try {
            int parseInt = Integer.parseInt(placementId);
            NativeBannerAd nativeBannerAd = new NativeBannerAd(parseInt, context);
            this.f19049ad = nativeBannerAd;
            nativeBannerAd.setMediationEnabled(false);
            this.f19049ad.setListener(new AdListener(mediationNativeBannerAdListener));
            this.f19049ad.setCachePolicy(mediationNativeBannerAdConfig.getCachePolicy());
            CustomParams customParams = this.f19049ad.getCustomParams();
            customParams.setAge(mediationNativeBannerAdConfig.getAge());
            customParams.setGender(mediationNativeBannerAdConfig.getGender());
            for (Map.Entry next : mediationNativeBannerAdConfig.getServerParams().entrySet()) {
                customParams.setCustomParam((String) next.getKey(), (String) next.getValue());
            }
            String payload = mediationNativeBannerAdConfig.getPayload();
            if (this.section != null) {
                C7374e0.m18989a("MyTargetNativeBannerAdAdapter: got banner from mediation response");
                this.f19049ad.handleSection(this.section);
            } else if (TextUtils.isEmpty(payload)) {
                C7374e0.m18989a("MyTargetNativeBannerAdAdapter: load id " + parseInt);
                this.f19049ad.load();
            } else {
                C7374e0.m18989a("MyTargetNativeBannerAdAdapter: load id " + parseInt + " from BID " + payload);
                this.f19049ad.loadFromBid(payload);
            }
        } catch (Throwable unused) {
            String str = "failed to request ad, unable to convert slotId " + placementId + " to int";
            C7374e0.m18990b("MyTargetNativeBannerAdAdapter error: " + str);
            mediationNativeBannerAdListener.onNoAd(str, this);
        }
    }

    public void registerView(View view, List<View> list, int i) {
        NativeBannerAd nativeBannerAd = this.f19049ad;
        if (nativeBannerAd != null) {
            nativeBannerAd.setAdChoicesPlacement(i);
            this.f19049ad.registerView(view, list);
        }
    }

    public void setSection(C7699v2 v2Var) {
        this.section = v2Var;
    }

    public void unregisterView() {
        NativeBannerAd nativeBannerAd = this.f19049ad;
        if (nativeBannerAd != null) {
            nativeBannerAd.unregisterView();
        }
    }
}
