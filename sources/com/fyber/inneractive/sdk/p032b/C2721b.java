package com.fyber.inneractive.sdk.p032b;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.p045e.C2900c;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.b.b */
public final class C2721b extends C2720a implements C2900c.C2901a {

    /* renamed from: a */
    private InneractiveAdSpot f6410a;

    /* renamed from: b */
    private C2900c f6411b;

    public final void destroy() {
    }

    public final ViewGroup getLayout() {
        return null;
    }

    public final boolean isCloseButtonDisplay() {
        return false;
    }

    public final void setActivityOrientation(boolean z, Orientation orientation) {
    }

    public final void showAdditionalCloseButton() {
    }

    public final void showCloseButton(boolean z, boolean z2) {
    }

    public final void showCloseCountdown() {
    }

    public final void updateCloseCountdown(int i) {
    }

    public final boolean wasDismissedByUser() {
        return false;
    }

    public final void dismissAd(boolean z) {
        C2900c cVar = this.f6411b;
        if (cVar != null) {
            cVar.destroy();
            this.f6411b = null;
        }
    }

    /* renamed from: a */
    public final void mo17960a(Activity activity, InneractiveAdSpot inneractiveAdSpot, String str) {
        InneractiveAdSpot inneractiveAdSpot2;
        if (TextUtils.isEmpty(str) || (inneractiveAdSpot2 = InneractiveAdSpotManager.get().getSpot(str)) == null || inneractiveAdSpot2.getAdContent() == null) {
            inneractiveAdSpot2 = null;
        }
        this.f6410a = inneractiveAdSpot2;
        if (inneractiveAdSpot2 != null) {
            InneractiveUnitController selectedUnitController = inneractiveAdSpot2.getSelectedUnitController();
            if (selectedUnitController instanceof InneractiveFullscreenAdActivity.FullScreenRendererProvider) {
                C2900c fullscreenRenderer = ((InneractiveFullscreenAdActivity.FullScreenRendererProvider) selectedUnitController).getFullscreenRenderer();
                this.f6411b = fullscreenRenderer;
                if (fullscreenRenderer != null) {
                    fullscreenRenderer.initialize(this.f6410a);
                    try {
                        this.f6411b.mo18185a(this, activity);
                    } catch (InneractiveUnitController.AdDisplayError e) {
                        IAlog.m9036d("Interstitial Activity: %s", e.getMessage());
                    }
                }
            }
        }
    }
}
