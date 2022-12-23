package com.p243my.target.ads;

import android.content.Context;
import com.p243my.target.C7300a1;
import com.p243my.target.C7327b2;
import com.p243my.target.C7374e0;
import com.p243my.target.C7541m2;
import com.p243my.target.C7593p0;
import com.p243my.target.C7665t2;
import com.p243my.target.C7697v0;

/* renamed from: com.my.target.ads.InterstitialAd */
public final class InterstitialAd extends BaseInterstitialAd {
    public InterstitialAdListener listener;

    /* renamed from: com.my.target.ads.InterstitialAd$EngineListener */
    public class EngineListener implements C7593p0.C7594a {
        private EngineListener() {
        }

        public void onClick() {
            InterstitialAd interstitialAd = InterstitialAd.this;
            InterstitialAdListener interstitialAdListener = interstitialAd.listener;
            if (interstitialAdListener != null) {
                interstitialAdListener.onClick(interstitialAd);
            }
        }

        public void onDismiss() {
            InterstitialAd interstitialAd = InterstitialAd.this;
            InterstitialAdListener interstitialAdListener = interstitialAd.listener;
            if (interstitialAdListener != null) {
                interstitialAdListener.onDismiss(interstitialAd);
            }
        }

        public void onDisplay() {
            InterstitialAd.this.finishRenderMetrics();
            InterstitialAd interstitialAd = InterstitialAd.this;
            InterstitialAdListener interstitialAdListener = interstitialAd.listener;
            if (interstitialAdListener != null) {
                interstitialAdListener.onDisplay(interstitialAd);
            }
        }

        public void onLoad() {
            InterstitialAd interstitialAd = InterstitialAd.this;
            InterstitialAdListener interstitialAdListener = interstitialAd.listener;
            if (interstitialAdListener != null) {
                interstitialAdListener.onLoad(interstitialAd);
            }
        }

        public void onNoAd(String str) {
            InterstitialAd interstitialAd = InterstitialAd.this;
            InterstitialAdListener interstitialAdListener = interstitialAd.listener;
            if (interstitialAdListener != null) {
                interstitialAdListener.onNoAd(str, interstitialAd);
            }
        }

        public void onStartDisplaying() {
            InterstitialAd.this.startRenderMetrics();
        }

        public void onVideoCompleted() {
            InterstitialAd interstitialAd = InterstitialAd.this;
            InterstitialAdListener interstitialAdListener = interstitialAd.listener;
            if (interstitialAdListener != null) {
                interstitialAdListener.onVideoCompleted(interstitialAd);
            }
        }
    }

    /* renamed from: com.my.target.ads.InterstitialAd$InterstitialAdListener */
    public interface InterstitialAdListener {
        void onClick(InterstitialAd interstitialAd);

        void onDismiss(InterstitialAd interstitialAd);

        void onDisplay(InterstitialAd interstitialAd);

        void onLoad(InterstitialAd interstitialAd);

        void onNoAd(String str, InterstitialAd interstitialAd);

        void onVideoCompleted(InterstitialAd interstitialAd);
    }

    public InterstitialAd(int i, Context context) {
        super(i, "fullscreen", context);
        C7374e0.m18991c("InterstitialAd created. Version: 5.15.0");
    }

    public void destroy() {
        super.destroy();
        this.listener = null;
    }

    public InterstitialAdListener getListener() {
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
                    this.listener.onLoad(this);
                } else {
                    this.listener.onNoAd("no ad", this);
                }
            } else if (m2Var != null) {
                C7300a1 a2 = C7300a1.m18683a(m2Var, this.adConfig, this.metricFactory, new EngineListener());
                this.engine = a2;
                a2.mo51911b(this.context);
            } else {
                InterstitialAdListener interstitialAdListener = this.listener;
                if (str == null) {
                    str = "no ad";
                }
                interstitialAdListener.onNoAd(str, this);
            }
        }
    }

    public void setListener(InterstitialAdListener interstitialAdListener) {
        this.listener = interstitialAdListener;
    }
}
