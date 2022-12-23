package com.p243my.target.nativeads;

import android.content.Context;
import android.view.View;
import com.p243my.target.C7324b1;
import com.p243my.target.C7374e0;
import com.p243my.target.C7397f1;
import com.p243my.target.C7435h2;
import com.p243my.target.C7541m2;
import com.p243my.target.C7616q0;
import com.p243my.target.C7618q2;
import com.p243my.target.C7629q8;
import com.p243my.target.C7641s;
import com.p243my.target.C7699v2;
import com.p243my.target.C7725w8;
import com.p243my.target.common.BaseAd;
import com.p243my.target.nativeads.banners.NativePromoBanner;
import com.p243my.target.nativeads.views.MediaAdView;
import java.util.List;

/* renamed from: com.my.target.nativeads.NativeAd */
public final class NativeAd extends BaseAd implements INativeAd {
    private int adChoicesPlacement = 0;
    private final Context appContext;
    private C7616q0 engine;
    private NativeAdListener listener;
    private NativeAdMediaListener mediaListener;
    private boolean useExoPlayer = true;

    /* renamed from: com.my.target.nativeads.NativeAd$NativeAdListener */
    public interface NativeAdListener {
        void onClick(NativeAd nativeAd);

        void onLoad(NativePromoBanner nativePromoBanner, NativeAd nativeAd);

        void onNoAd(String str, NativeAd nativeAd);

        void onShow(NativeAd nativeAd);

        void onVideoComplete(NativeAd nativeAd);

        void onVideoPause(NativeAd nativeAd);

        void onVideoPlay(NativeAd nativeAd);
    }

    /* renamed from: com.my.target.nativeads.NativeAd$NativeAdMediaListener */
    public interface NativeAdMediaListener {
        void onIconLoad(NativeAd nativeAd);

        void onImageLoad(NativeAd nativeAd);
    }

    public NativeAd(int i, Context context) {
        super(i, "nativeads");
        this.appContext = context.getApplicationContext();
        C7374e0.m18991c("NativeAd created. Version: 5.15.0");
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
                C7397f1 a = C7397f1.m19091a(this, h2Var, this.appContext);
                this.engine = a;
                a.mo49701a(this.mediaListener);
                if (this.engine.mo49704g() != null) {
                    this.listener.onLoad(this.engine.mo49704g(), this);
                }
            } else if (m2Var != null) {
                C7324b1 a2 = C7324b1.m18760a(this, m2Var, this.adConfig, this.metricFactory);
                this.engine = a2;
                a2.mo51911b(this.appContext);
            } else {
                NativeAdListener nativeAdListener = this.listener;
                if (str == null) {
                    str = "no ad";
                }
                nativeAdListener.onNoAd(str, this);
            }
        }
    }

    public int getAdChoicesPlacement() {
        return this.adChoicesPlacement;
    }

    public String getAdSource() {
        C7616q0 q0Var = this.engine;
        if (q0Var != null) {
            return q0Var.mo50105c();
        }
        return null;
    }

    public float getAdSourcePriority() {
        C7616q0 q0Var = this.engine;
        if (q0Var != null) {
            return q0Var.mo50106d();
        }
        return 0.0f;
    }

    public NativePromoBanner getBanner() {
        C7616q0 q0Var = this.engine;
        if (q0Var == null) {
            return null;
        }
        return q0Var.mo49704g();
    }

    public int getCachePolicy() {
        return this.adConfig.getCachePolicy();
    }

    public NativeAdListener getListener() {
        return this.listener;
    }

    public NativeAdMediaListener getMediaListener() {
        return this.mediaListener;
    }

    public void handleData(String str) {
        C7641s.m20284a(str, this.adConfig, this.metricFactory).mo49685a(new C7641s.C7643b() {
            /* renamed from: a */
            public final void mo49446a(C7618q2 q2Var, String str) {
                NativeAd.this.handleResult((C7699v2) q2Var, str);
            }
        }).mo49692b(this.metricFactory.mo50803a(), this.appContext);
    }

    public final void handleSection(C7699v2 v2Var) {
        C7641s.m20283a(v2Var, this.adConfig, this.metricFactory).mo49685a(new C7641s.C7643b() {
            /* renamed from: a */
            public final void mo49446a(C7618q2 q2Var, String str) {
                NativeAd.this.handleResult((C7699v2) q2Var, str);
            }
        }).mo49692b(this.metricFactory.mo50803a(), this.appContext);
    }

    public boolean isMediationEnabled() {
        return this.adConfig.isMediationEnabled();
    }

    public boolean isUseExoPlayer() {
        return this.useExoPlayer;
    }

    public final void load() {
        if (isLoadCalled()) {
            C7374e0.m18989a("NativeAd doesn't support multiple load");
            return;
        }
        C7641s.m20282a(this.adConfig, this.metricFactory).mo49685a(new C7641s.C7643b() {
            /* renamed from: a */
            public final void mo49446a(C7618q2 q2Var, String str) {
                NativeAd.this.handleResult((C7699v2) q2Var, str);
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
        C7616q0 q0Var = this.engine;
        if (q0Var != null) {
            q0Var.mo49698a(view, list, this.adChoicesPlacement, (MediaAdView) null);
        }
    }

    public void registerView(View view, List<View> list, MediaAdView mediaAdView) {
        C7629q8.m20222a(view, this);
        C7616q0 q0Var = this.engine;
        if (q0Var != null) {
            q0Var.mo49698a(view, list, this.adChoicesPlacement, mediaAdView);
        }
    }

    public void setAdChoicesPlacement(int i) {
        this.adChoicesPlacement = i;
    }

    public void setBanner(C7435h2 h2Var) {
        this.engine = C7397f1.m19091a(this, h2Var, this.appContext);
    }

    public void setCachePolicy(int i) {
        this.adConfig.setCachePolicy(i);
    }

    public void setListener(NativeAdListener nativeAdListener) {
        this.listener = nativeAdListener;
    }

    public void setMediaListener(NativeAdMediaListener nativeAdMediaListener) {
        this.mediaListener = nativeAdMediaListener;
        C7616q0 q0Var = this.engine;
        if (q0Var != null) {
            q0Var.mo49701a(nativeAdMediaListener);
        }
    }

    public void setMediationEnabled(boolean z) {
        this.adConfig.setMediationEnabled(z);
    }

    public final void unregisterView() {
        C7629q8.m20223a(this);
        C7616q0 q0Var = this.engine;
        if (q0Var != null) {
            q0Var.unregisterView();
        }
    }

    public void useExoPlayer(boolean z) {
        this.useExoPlayer = z;
        if (!z) {
            C7725w8.m20772g();
        }
    }
}
