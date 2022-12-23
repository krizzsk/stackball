package com.p243my.target.mediation;

import android.content.Context;
import android.text.TextUtils;
import com.p243my.target.C7374e0;
import com.p243my.target.C7665t2;
import com.p243my.target.ads.Reward;
import com.p243my.target.ads.RewardedAd;
import com.p243my.target.common.CustomParams;
import com.p243my.target.mediation.MediationRewardedAdAdapter;
import java.util.Map;

/* renamed from: com.my.target.mediation.MyTargetRewardedAdAdapter */
public final class MyTargetRewardedAdAdapter implements MediationRewardedAdAdapter {

    /* renamed from: ad */
    private RewardedAd f19050ad;
    private C7665t2 section;

    /* renamed from: com.my.target.mediation.MyTargetRewardedAdAdapter$AdListener */
    public class AdListener implements RewardedAd.RewardedAdListener {
        private final MediationRewardedAdAdapter.MediationRewardedAdListener mediationListener;

        public AdListener(MediationRewardedAdAdapter.MediationRewardedAdListener mediationRewardedAdListener) {
            this.mediationListener = mediationRewardedAdListener;
        }

        public void onClick(RewardedAd rewardedAd) {
            C7374e0.m18989a("MyTargetRewardedAdAdapter: ad clicked");
            this.mediationListener.onClick(MyTargetRewardedAdAdapter.this);
        }

        public void onDismiss(RewardedAd rewardedAd) {
            C7374e0.m18989a("MyTargetRewardedAdAdapter: ad dismissed");
            this.mediationListener.onDismiss(MyTargetRewardedAdAdapter.this);
        }

        public void onDisplay(RewardedAd rewardedAd) {
            C7374e0.m18989a("MyTargetRewardedAdAdapter: ad displayed");
            this.mediationListener.onDisplay(MyTargetRewardedAdAdapter.this);
        }

        public void onLoad(RewardedAd rewardedAd) {
            C7374e0.m18989a("MyTargetRewardedAdAdapter: ad loaded");
            this.mediationListener.onLoad(MyTargetRewardedAdAdapter.this);
        }

        public void onNoAd(String str, RewardedAd rewardedAd) {
            C7374e0.m18989a("MyTargetRewardedAdAdapter: no ad (" + str + ")");
            this.mediationListener.onNoAd(str, MyTargetRewardedAdAdapter.this);
        }

        public void onReward(Reward reward, RewardedAd rewardedAd) {
            C7374e0.m18989a("MyTargetRewardedAdAdapter: onReward: " + reward.type);
            this.mediationListener.onReward(reward, MyTargetRewardedAdAdapter.this);
        }
    }

    public void destroy() {
        RewardedAd rewardedAd = this.f19050ad;
        if (rewardedAd != null) {
            rewardedAd.setListener((RewardedAd.RewardedAdListener) null);
            this.f19050ad.destroy();
            this.f19050ad = null;
        }
    }

    public void dismiss() {
        RewardedAd rewardedAd = this.f19050ad;
        if (rewardedAd != null) {
            rewardedAd.dismiss();
        }
    }

    public void load(MediationAdConfig mediationAdConfig, MediationRewardedAdAdapter.MediationRewardedAdListener mediationRewardedAdListener, Context context) {
        String placementId = mediationAdConfig.getPlacementId();
        try {
            int parseInt = Integer.parseInt(placementId);
            RewardedAd rewardedAd = new RewardedAd(parseInt, context);
            this.f19050ad = rewardedAd;
            rewardedAd.setMediationEnabled(false);
            this.f19050ad.setListener(new AdListener(mediationRewardedAdListener));
            CustomParams customParams = this.f19050ad.getCustomParams();
            customParams.setAge(mediationAdConfig.getAge());
            customParams.setGender(mediationAdConfig.getGender());
            for (Map.Entry next : mediationAdConfig.getServerParams().entrySet()) {
                customParams.setCustomParam((String) next.getKey(), (String) next.getValue());
            }
            String payload = mediationAdConfig.getPayload();
            if (this.section != null) {
                C7374e0.m18989a("MyTargetRewardedAdAdapter: got banner from mediation response");
                this.f19050ad.handleSection(this.section);
            } else if (TextUtils.isEmpty(payload)) {
                C7374e0.m18989a("MyTargetRewardedAdAdapter: load id " + parseInt);
                this.f19050ad.load();
            } else {
                C7374e0.m18989a("MyTargetRewardedAdAdapter: load id " + parseInt + " from BID " + payload);
                this.f19050ad.loadFromBid(payload);
            }
        } catch (Throwable unused) {
            String str = "failed to request ad, unable to convert slotId " + placementId + " to int";
            C7374e0.m18990b("MyTargetRewardedAdAdapter error: " + str);
            mediationRewardedAdListener.onNoAd(str, this);
        }
    }

    public void setSection(C7665t2 t2Var) {
        this.section = t2Var;
    }

    public void show(Context context) {
        RewardedAd rewardedAd = this.f19050ad;
        if (rewardedAd != null) {
            rewardedAd.show();
        }
    }
}
