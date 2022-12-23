package com.fyber.inneractive.sdk.external;

import android.app.Activity;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.C2801o;
import com.fyber.inneractive.sdk.config.C2809u;
import com.fyber.inneractive.sdk.config.C2811w;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.p033c.C2723a;
import com.fyber.inneractive.sdk.p033c.C2730d;
import com.fyber.inneractive.sdk.p037d.C2836g;
import com.fyber.inneractive.sdk.p037d.C2845j;
import com.fyber.inneractive.sdk.p037d.C2856p;
import com.fyber.inneractive.sdk.p045e.C2900c;
import com.fyber.inneractive.sdk.p049h.C2967m;
import com.fyber.inneractive.sdk.p049h.C2968n;
import com.fyber.inneractive.sdk.util.C3670q;
import com.fyber.inneractive.sdk.util.IAlog;

public class InneractiveFullscreenUnitController extends C2856p<InneractiveFullscreenAdEventsListener> implements InneractiveFullscreenAdActivity.FullScreenRendererProvider, InneractiveFullscreenAdActivity.OnInneractiveFullscreenAdDestroyListener {

    /* renamed from: a */
    private boolean f6895a = false;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public InneractiveFullScreenAdRewardedListener f6896b;

    /* renamed from: c */
    private final C2900c.C2902b f6897c = new C2900c.C2902b() {
        /* renamed from: a */
        public final void mo18274a() {
            C2845j jVar = (C2845j) C3670q.m9152a(InneractiveFullscreenUnitController.this.mAdSpot);
            if (InneractiveFullscreenUnitController.this.f6896b != null && jVar != null) {
                InneractiveFullscreenUnitController.this.f6896b.onAdRewarded(jVar);
            }
        }
    };
    protected C2900c mRenderer;

    public boolean supportsRefresh() {
        return false;
    }

    public boolean supports(InneractiveAdSpot inneractiveAdSpot) {
        C2809u h = inneractiveAdSpot.getAdContent().mo18131h();
        if (h.mo18067d() != null) {
            return false;
        }
        C2801o h2 = h.mo18071h();
        if (h2 != null && UnitDisplayType.INTERSTITIAL.equals(h2.mo18057a())) {
            return true;
        }
        C2811w g = h.mo18070g();
        if (g == null || (!UnitDisplayType.REWARDED.equals(g.mo18080h()) && !UnitDisplayType.INTERSTITIAL.equals(g.mo18080h()) && !UnitDisplayType.VERTICAL.equals(g.mo18080h()))) {
            return false;
        }
        return true;
    }

    public boolean isAvailable() {
        C2845j jVar = (C2845j) C3670q.m9152a(this.mAdSpot);
        return jVar != null && jVar.isReady();
    }

    public C2900c getFullscreenRenderer() {
        return this.mRenderer;
    }

    public void show(Activity activity) {
        if (activity == null) {
            IAlog.m9036d("show() called with a null activity", new Object[0]);
        } else if (!this.f6895a) {
            InneractiveAdSpot adSpot = getAdSpot();
            if (adSpot == null) {
                IAlog.m9036d("InneractiveFullscreenUnitController was not attached to an ad spot", new Object[0]);
                return;
            }
            C2836g adContent = adSpot.getAdContent();
            if (adContent != null) {
                new C2968n.C2969a(C2967m.IA_PUBLISHER_REQUESTED_SHOW, adContent.mo18130g(), adContent.mo18129f(), adContent.mo18132i().mo18013b()).mo18436b((String) null);
            }
            if (adSpot.isReady()) {
                if (this.mRenderer == null) {
                    this.mRenderer = C2730d.C2732b.f6417a.mo17971a(getAdSpot());
                }
                selectContentController();
                C2723a.m5894a(adContent).mo17960a(activity, adSpot, adSpot.getLocalUniqueId());
                this.f6895a = true;
                C2900c cVar = this.mRenderer;
                if (cVar != null) {
                    cVar.mo18261a(this.f6897c);
                }
            } else if (this.mEventsListener != null) {
                ((InneractiveFullscreenAdEventsListener) this.mEventsListener).onAdEnteredErrorState(adSpot, new AdExpiredError("Ad Expired"));
            }
        } else {
            IAlog.m9036d("InneractiveFullscreenUnitController->show(android.content.Context) called while an ad is already showing", new Object[0]);
        }
    }

    public static class AdExpiredError extends InneractiveUnitController.AdDisplayError {
        AdExpiredError(String str) {
            super(str);
        }
    }

    public void destroy() {
        C2900c cVar = this.mRenderer;
        if (cVar != null) {
            cVar.destroy();
            this.mRenderer = null;
        }
        super.destroy();
    }

    public void onActivityDestroyed(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.f6895a = false;
    }

    public InneractiveFullScreenAdRewardedListener getRewardedListener() {
        return this.f6896b;
    }

    public void setRewardedListener(InneractiveFullScreenAdRewardedListener inneractiveFullScreenAdRewardedListener) {
        this.f6896b = inneractiveFullScreenAdRewardedListener;
    }
}
