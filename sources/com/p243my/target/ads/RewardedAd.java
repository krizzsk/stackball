package com.p243my.target.ads;

import android.content.Context;
import com.p243my.target.C7327b2;
import com.p243my.target.C7357d1;
import com.p243my.target.C7374e0;
import com.p243my.target.C7541m2;
import com.p243my.target.C7593p0;
import com.p243my.target.C7665t2;
import com.p243my.target.C7697v0;

/* renamed from: com.my.target.ads.RewardedAd */
public final class RewardedAd extends BaseInterstitialAd {
    public RewardedAdListener listener;

    /* renamed from: com.my.target.ads.RewardedAd$EngineListener */
    public class EngineListener implements C7593p0.C7594a {
        private EngineListener() {
        }

        public void onClick() {
            RewardedAd rewardedAd = RewardedAd.this;
            RewardedAdListener rewardedAdListener = rewardedAd.listener;
            if (rewardedAdListener != null) {
                rewardedAdListener.onClick(rewardedAd);
            }
        }

        public void onDismiss() {
            RewardedAd rewardedAd = RewardedAd.this;
            RewardedAdListener rewardedAdListener = rewardedAd.listener;
            if (rewardedAdListener != null) {
                rewardedAdListener.onDismiss(rewardedAd);
            }
        }

        public void onDisplay() {
            RewardedAd.this.finishRenderMetrics();
            RewardedAd rewardedAd = RewardedAd.this;
            RewardedAdListener rewardedAdListener = rewardedAd.listener;
            if (rewardedAdListener != null) {
                rewardedAdListener.onDisplay(rewardedAd);
            }
        }

        public void onLoad() {
            RewardedAd rewardedAd = RewardedAd.this;
            RewardedAdListener rewardedAdListener = rewardedAd.listener;
            if (rewardedAdListener != null) {
                rewardedAdListener.onLoad(rewardedAd);
            }
        }

        public void onNoAd(String str) {
            RewardedAd rewardedAd = RewardedAd.this;
            RewardedAdListener rewardedAdListener = rewardedAd.listener;
            if (rewardedAdListener != null) {
                rewardedAdListener.onNoAd(str, rewardedAd);
            }
        }

        public void onStartDisplaying() {
            RewardedAd.this.startRenderMetrics();
        }

        public void onVideoCompleted() {
        }
    }

    /* renamed from: com.my.target.ads.RewardedAd$RewardedAdListener */
    public interface RewardedAdListener {
        void onClick(RewardedAd rewardedAd);

        void onDismiss(RewardedAd rewardedAd);

        void onDisplay(RewardedAd rewardedAd);

        void onLoad(RewardedAd rewardedAd);

        void onNoAd(String str, RewardedAd rewardedAd);

        void onReward(Reward reward, RewardedAd rewardedAd);
    }

    /* renamed from: com.my.target.ads.RewardedAd$RewardedListener */
    public class RewardedListener implements C7593p0.C7595b {
        private RewardedListener() {
        }

        public void onReward(Reward reward) {
            RewardedAd rewardedAd = RewardedAd.this;
            RewardedAdListener rewardedAdListener = rewardedAd.listener;
            if (rewardedAdListener != null) {
                rewardedAdListener.onReward(reward, rewardedAd);
            }
        }
    }

    public RewardedAd(int i, Context context) {
        super(i, "rewarded", context);
        C7374e0.m18991c("RewardedAd created. Version: 5.15.0");
    }

    public void destroy() {
        super.destroy();
        this.listener = null;
    }

    public RewardedAdListener getListener() {
        return this.listener;
    }

    public void handleResult(C7665t2 t2Var, String str) {
        C7541m2 m2Var;
        C7327b2 b2Var;
        if (this.listener != null) {
            if (t2Var != null) {
                b2Var = t2Var.mo51571c();
                m2Var = t2Var.mo51418b();
            } else {
                b2Var = null;
                m2Var = null;
            }
            if (b2Var != null) {
                C7697v0 a = C7697v0.m20629a(b2Var, t2Var, this.useExoPlayer, new EngineListener());
                this.engine = a;
                if (a != null) {
                    a.mo49538a((C7593p0.C7595b) new RewardedListener());
                    this.listener.onLoad(this);
                    return;
                }
                this.listener.onNoAd("no ad", this);
            } else if (m2Var != null) {
                C7357d1 a2 = C7357d1.m18918a(m2Var, this.adConfig, this.metricFactory, new EngineListener());
                a2.mo49538a((C7593p0.C7595b) new RewardedListener());
                this.engine = a2;
                a2.mo51911b(this.context);
            } else {
                RewardedAdListener rewardedAdListener = this.listener;
                if (str == null) {
                    str = "no ad";
                }
                rewardedAdListener.onNoAd(str, this);
            }
        }
    }

    public void setListener(RewardedAdListener rewardedAdListener) {
        this.listener = rewardedAdListener;
    }
}
