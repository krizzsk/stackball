package com.p243my.target.mediation;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.p243my.target.C7374e0;
import com.p243my.target.C7699v2;
import com.p243my.target.common.CustomParams;
import com.p243my.target.mediation.MediationNativeAdAdapter;
import com.p243my.target.nativeads.NativeAd;
import com.p243my.target.nativeads.banners.NativePromoBanner;
import java.util.List;
import java.util.Map;

/* renamed from: com.my.target.mediation.MyTargetNativeAdAdapter */
public final class MyTargetNativeAdAdapter implements MediationNativeAdAdapter {

    /* renamed from: ad */
    private NativeAd f19048ad;
    private C7699v2 section;

    /* renamed from: com.my.target.mediation.MyTargetNativeAdAdapter$AdListener */
    public class AdListener implements NativeAd.NativeAdListener {
        private final MediationNativeAdAdapter.MediationNativeAdListener mediationListener;

        public AdListener(MediationNativeAdAdapter.MediationNativeAdListener mediationNativeAdListener) {
            this.mediationListener = mediationNativeAdListener;
        }

        public void onClick(NativeAd nativeAd) {
            C7374e0.m18989a("MyTargetNativeAdAdapter: ad clicked");
            this.mediationListener.onClick(MyTargetNativeAdAdapter.this);
        }

        public void onLoad(NativePromoBanner nativePromoBanner, NativeAd nativeAd) {
            C7374e0.m18989a("MyTargetNativeAdAdapter: ad loaded");
            this.mediationListener.onLoad(nativePromoBanner, MyTargetNativeAdAdapter.this);
        }

        public void onNoAd(String str, NativeAd nativeAd) {
            C7374e0.m18989a("MyTargetNativeAdAdapter: no ad (" + str + ")");
            this.mediationListener.onNoAd(str, MyTargetNativeAdAdapter.this);
        }

        public void onShow(NativeAd nativeAd) {
            C7374e0.m18989a("MyTargetNativeAdAdapter: ad shown");
            this.mediationListener.onShow(MyTargetNativeAdAdapter.this);
        }

        public void onVideoComplete(NativeAd nativeAd) {
            C7374e0.m18989a("MyTargetNativeAdAdapter: video completed");
            this.mediationListener.onVideoComplete(MyTargetNativeAdAdapter.this);
        }

        public void onVideoPause(NativeAd nativeAd) {
            C7374e0.m18989a("MyTargetNativeAdAdapter: video paused");
            this.mediationListener.onVideoPause(MyTargetNativeAdAdapter.this);
        }

        public void onVideoPlay(NativeAd nativeAd) {
            C7374e0.m18989a("MyTargetNativeAdAdapter: video playing");
            this.mediationListener.onVideoPlay(MyTargetNativeAdAdapter.this);
        }
    }

    public void destroy() {
        NativeAd nativeAd = this.f19048ad;
        if (nativeAd != null) {
            nativeAd.unregisterView();
            this.f19048ad.setListener((NativeAd.NativeAdListener) null);
            this.f19048ad = null;
        }
    }

    public View getMediaView(Context context) {
        return null;
    }

    public void load(MediationNativeAdConfig mediationNativeAdConfig, MediationNativeAdAdapter.MediationNativeAdListener mediationNativeAdListener, Context context) {
        String placementId = mediationNativeAdConfig.getPlacementId();
        try {
            int parseInt = Integer.parseInt(placementId);
            NativeAd nativeAd = new NativeAd(parseInt, context);
            this.f19048ad = nativeAd;
            nativeAd.setMediationEnabled(false);
            this.f19048ad.setListener(new AdListener(mediationNativeAdListener));
            this.f19048ad.setCachePolicy(mediationNativeAdConfig.getCachePolicy());
            CustomParams customParams = this.f19048ad.getCustomParams();
            customParams.setAge(mediationNativeAdConfig.getAge());
            customParams.setGender(mediationNativeAdConfig.getGender());
            for (Map.Entry next : mediationNativeAdConfig.getServerParams().entrySet()) {
                customParams.setCustomParam((String) next.getKey(), (String) next.getValue());
            }
            String payload = mediationNativeAdConfig.getPayload();
            if (this.section != null) {
                C7374e0.m18989a("MyTargetNativeAdAdapter: got banner from mediation response");
                this.f19048ad.handleSection(this.section);
            } else if (TextUtils.isEmpty(payload)) {
                C7374e0.m18989a("MyTargetNativeAdAdapter: load id " + parseInt);
                this.f19048ad.load();
            } else {
                C7374e0.m18989a("MyTargetNativeAdAdapter: load id " + parseInt + " from BID " + payload);
                this.f19048ad.loadFromBid(payload);
            }
        } catch (Throwable unused) {
            String str = "failed to request ad, unable to convert slotId " + placementId + " to int";
            C7374e0.m18990b("MyTargetNativeAdAdapter error: " + str);
            mediationNativeAdListener.onNoAd(str, this);
        }
    }

    public void registerView(View view, List<View> list, int i) {
        NativeAd nativeAd = this.f19048ad;
        if (nativeAd != null) {
            nativeAd.setAdChoicesPlacement(i);
            this.f19048ad.registerView(view, list);
        }
    }

    public void setSection(C7699v2 v2Var) {
        this.section = v2Var;
    }

    public void unregisterView() {
        NativeAd nativeAd = this.f19048ad;
        if (nativeAd != null) {
            nativeAd.unregisterView();
        }
    }
}
