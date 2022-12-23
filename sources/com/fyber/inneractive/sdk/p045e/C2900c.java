package com.fyber.inneractive.sdk.p045e;

import android.app.Activity;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.external.InneractiveAdRenderer;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;

/* renamed from: com.fyber.inneractive.sdk.e.c */
public interface C2900c extends InneractiveAdRenderer {

    /* renamed from: com.fyber.inneractive.sdk.e.c$a */
    public interface C2901a {
        void destroy();

        void dismissAd(boolean z);

        ViewGroup getLayout();

        boolean isCloseButtonDisplay();

        void setActivityOrientation(boolean z, Orientation orientation);

        void showAdditionalCloseButton();

        void showCloseButton(boolean z, boolean z2);

        void showCloseCountdown();

        void updateCloseCountdown(int i);

        boolean wasDismissedByUser();
    }

    /* renamed from: com.fyber.inneractive.sdk.e.c$b */
    public interface C2902b {
        /* renamed from: a */
        void mo18274a();
    }

    /* renamed from: a */
    void mo18185a(C2901a aVar, Activity activity) throws InneractiveUnitController.AdDisplayError;

    /* renamed from: a */
    void mo18261a(C2902b bVar);

    void destroy();

    /* renamed from: i */
    boolean mo18262i();

    void initialize(InneractiveAdSpot inneractiveAdSpot);

    /* renamed from: j */
    void mo18263j();

    /* renamed from: k */
    void mo18264k();

    /* renamed from: q */
    boolean mo18273q();

    /* renamed from: w */
    void mo18197w();

    /* renamed from: x */
    void mo18198x();
}
