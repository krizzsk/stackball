package com.p243my.target.ads;

import android.content.Context;
import com.p243my.target.C7374e0;
import com.p243my.target.C7524l3;
import com.p243my.target.C7572o;
import com.p243my.target.C7593p0;
import com.p243my.target.C7618q2;
import com.p243my.target.C7665t2;
import com.p243my.target.C7725w8;
import com.p243my.target.common.BaseAd;

/* renamed from: com.my.target.ads.BaseInterstitialAd */
public abstract class BaseInterstitialAd extends BaseAd {
    public final Context context;
    public C7593p0 engine;
    private C7524l3 renderMetricsMessage;
    public boolean useExoPlayer = true;

    public BaseInterstitialAd(int i, String str, Context context2) {
        super(i, str);
        this.context = context2;
    }

    public void destroy() {
        C7593p0 p0Var = this.engine;
        if (p0Var != null) {
            p0Var.destroy();
            this.engine = null;
        }
    }

    public void dismiss() {
        C7593p0 p0Var = this.engine;
        if (p0Var != null) {
            p0Var.dismiss();
        }
    }

    public void finishRenderMetrics() {
        C7524l3 l3Var = this.renderMetricsMessage;
        if (l3Var != null) {
            l3Var.mo50800b();
            this.renderMetricsMessage.mo50802b(this.context);
        }
    }

    public String getAdSource() {
        C7593p0 p0Var = this.engine;
        if (p0Var != null) {
            return p0Var.mo51313c();
        }
        return null;
    }

    public float getAdSourcePriority() {
        C7593p0 p0Var = this.engine;
        if (p0Var != null) {
            return p0Var.mo51314d();
        }
        return 0.0f;
    }

    public abstract void handleResult(C7665t2 t2Var, String str);

    public final void handleSection(C7665t2 t2Var) {
        C7572o.m19962a(t2Var, this.adConfig, this.metricFactory).mo49685a(new C7572o.C7575c() {
            /* renamed from: a */
            public final void mo49446a(C7618q2 q2Var, String str) {
                BaseInterstitialAd.this.handleResult((C7665t2) q2Var, str);
            }
        }).mo49692b(this.metricFactory.mo50803a(), this.context);
    }

    public boolean isMediationEnabled() {
        return this.adConfig.isMediationEnabled();
    }

    public boolean isUseExoPlayer() {
        return this.useExoPlayer;
    }

    public final void load() {
        if (isLoadCalled()) {
            C7374e0.m18989a("Interstitial/Rewarded doesn't support multiple load");
            return;
        }
        C7572o.m19961a(this.adConfig, this.metricFactory).mo49685a(new C7572o.C7575c() {
            /* renamed from: a */
            public final void mo49446a(C7618q2 q2Var, String str) {
                BaseInterstitialAd.this.handleResult((C7665t2) q2Var, str);
            }
        }).mo49692b(this.metricFactory.mo50803a(), this.context);
    }

    public void loadFromBid(String str) {
        this.adConfig.setBidId(str);
        load();
    }

    public void setMediationEnabled(boolean z) {
        this.adConfig.setMediationEnabled(z);
    }

    public void show() {
        show((Context) null);
    }

    public void show(Context context2) {
        C7593p0 p0Var = this.engine;
        if (p0Var == null) {
            C7374e0.m18991c("InterstitialAd.show: No ad");
            return;
        }
        if (context2 == null) {
            context2 = this.context;
        }
        p0Var.mo49535a(context2);
    }

    public void startRenderMetrics() {
        this.renderMetricsMessage = this.metricFactory.mo50806b();
    }

    public void useExoPlayer(boolean z) {
        this.useExoPlayer = z;
        if (!z) {
            C7725w8.m20772g();
        }
    }
}
