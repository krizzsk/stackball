package com.p243my.target.nativeads;

import android.content.Context;
import android.view.View;
import com.p243my.target.C7339c1;
import com.p243my.target.C7374e0;
import com.p243my.target.C7433h1;
import com.p243my.target.C7435h2;
import com.p243my.target.C7524l3;
import com.p243my.target.C7541m2;
import com.p243my.target.C7618q2;
import com.p243my.target.C7629q8;
import com.p243my.target.C7630r0;
import com.p243my.target.C7641s;
import com.p243my.target.C7699v2;
import com.p243my.target.common.BaseAd;
import com.p243my.target.nativeads.banners.NativeBanner;
import java.util.List;

/* renamed from: com.my.target.nativeads.NativeBannerAd */
public final class NativeBannerAd extends BaseAd implements INativeAd {
    private int adChoicesPlacement = 0;
    private final Context appContext;
    private C7630r0 engine;
    private NativeBannerAdListener listener;
    private NativeBannerAdMediaListener mediaListener;

    /* renamed from: com.my.target.nativeads.NativeBannerAd$NativeBannerAdListener */
    public interface NativeBannerAdListener {
        void onClick(NativeBannerAd nativeBannerAd);

        void onLoad(NativeBanner nativeBanner, NativeBannerAd nativeBannerAd);

        void onNoAd(String str, NativeBannerAd nativeBannerAd);

        void onShow(NativeBannerAd nativeBannerAd);
    }

    /* renamed from: com.my.target.nativeads.NativeBannerAd$NativeBannerAdMediaListener */
    public interface NativeBannerAdMediaListener {
        void onIconLoad(NativeBannerAd nativeBannerAd);
    }

    public NativeBannerAd(int i, Context context) {
        super(i, "nativebanner");
        this.appContext = context.getApplicationContext();
        C7374e0.m18991c("NativeBannerAd created. Version: 5.15.0");
    }

    /* access modifiers changed from: private */
    public void handleResult(C7699v2 v2Var, String str) {
        C7541m2 m2Var;
        if (this.listener != null) {
            C7435h2 h2Var = null;
            if (v2Var != null) {
                h2Var = v2Var.mo51728e();
                m2Var = v2Var.mo51418b();
            } else {
                m2Var = null;
            }
            if (h2Var != null) {
                C7433h1 a = C7433h1.m19232a(this, h2Var, this.appContext);
                this.engine = a;
                a.mo49783a(this.mediaListener);
                NativeBanner h = this.engine.mo49786h();
                if (h != null) {
                    this.listener.onLoad(h, this);
                }
            } else if (m2Var != null) {
                C7339c1 a2 = C7339c1.m18829a(this, m2Var, this.adConfig, this.metricFactory);
                this.engine = a2;
                a2.mo51911b(this.appContext);
            } else {
                NativeBannerAdListener nativeBannerAdListener = this.listener;
                if (str == null) {
                    str = "no ad";
                }
                nativeBannerAdListener.onNoAd(str, this);
            }
        }
    }

    public int getAdChoicesPlacement() {
        return this.adChoicesPlacement;
    }

    public String getAdSource() {
        C7630r0 r0Var = this.engine;
        if (r0Var != null) {
            return r0Var.mo50271c();
        }
        return null;
    }

    public float getAdSourcePriority() {
        C7630r0 r0Var = this.engine;
        if (r0Var != null) {
            return r0Var.mo50272d();
        }
        return 0.0f;
    }

    public NativeBanner getBanner() {
        C7630r0 r0Var = this.engine;
        if (r0Var == null) {
            return null;
        }
        return r0Var.mo49786h();
    }

    public int getCachePolicy() {
        return this.adConfig.getCachePolicy();
    }

    public NativeBannerAdListener getListener() {
        return this.listener;
    }

    public NativeBannerAdMediaListener getMediaListener() {
        return this.mediaListener;
    }

    public void handleData(String str) {
        C7641s.m20284a(str, this.adConfig, this.metricFactory).mo49685a(new C7641s.C7643b() {
            /* renamed from: a */
            public final void mo49446a(C7618q2 q2Var, String str) {
                NativeBannerAd.this.handleResult((C7699v2) q2Var, str);
            }
        }).mo49692b(this.metricFactory.mo50803a(), this.appContext);
    }

    public final void handleSection(C7699v2 v2Var) {
        C7524l3.C7525a a = C7524l3.m19687a(this.adConfig.getSlotId());
        C7641s.m20283a(v2Var, this.adConfig, a).mo49685a(new C7641s.C7643b() {
            /* renamed from: a */
            public final void mo49446a(C7618q2 q2Var, String str) {
                NativeBannerAd.this.handleResult((C7699v2) q2Var, str);
            }
        }).mo49692b(a.mo50803a(), this.appContext);
    }

    public boolean isMediationEnabled() {
        return this.adConfig.isMediationEnabled();
    }

    public final void load() {
        if (isLoadCalled()) {
            C7374e0.m18989a("NativeBannerAd doesn't support multiple load");
            return;
        }
        C7641s.m20282a(this.adConfig, this.metricFactory).mo49685a(new C7641s.C7643b() {
            /* renamed from: a */
            public final void mo49446a(C7618q2 q2Var, String str) {
                NativeBannerAd.this.handleResult((C7699v2) q2Var, str);
            }
        }).mo49692b(this.metricFactory.mo50803a(), this.appContext);
    }

    public void loadFromBid(String str) {
        this.adConfig.setBidId(str);
        load();
    }

    public final void registerView(View view) {
        registerView(view, (List<View>) null);
    }

    public final void registerView(View view, List<View> list) {
        C7629q8.m20222a(view, this);
        C7630r0 r0Var = this.engine;
        if (r0Var != null) {
            r0Var.registerView(view, list, this.adChoicesPlacement);
        }
    }

    public void setAdChoicesPlacement(int i) {
        this.adChoicesPlacement = i;
    }

    public void setBanner(C7435h2 h2Var) {
        this.engine = C7433h1.m19232a(this, h2Var, this.appContext);
    }

    public void setCachePolicy(int i) {
        this.adConfig.setCachePolicy(i);
    }

    public void setListener(NativeBannerAdListener nativeBannerAdListener) {
        this.listener = nativeBannerAdListener;
    }

    public void setMediaListener(NativeBannerAdMediaListener nativeBannerAdMediaListener) {
        this.mediaListener = nativeBannerAdMediaListener;
        C7630r0 r0Var = this.engine;
        if (r0Var != null) {
            r0Var.mo49783a(nativeBannerAdMediaListener);
        }
    }

    public void setMediationEnabled(boolean z) {
        this.adConfig.setMediationEnabled(z);
    }

    public final void unregisterView() {
        C7629q8.m20223a(this);
        C7630r0 r0Var = this.engine;
        if (r0Var != null) {
            r0Var.unregisterView();
        }
    }
}
