package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.p037d.C2857q;
import com.fyber.inneractive.sdk.p037d.C2858r;
import com.fyber.inneractive.sdk.p050i.C3011h;
import java.lang.ref.WeakReference;

public class InneractiveAdViewVideoContentController extends C2858r {

    /* renamed from: a */
    WeakReference<C3011h> f6889a;

    public void pauseVideo() {
    }

    public void playVideo() {
    }

    public void setControlledRenderer(C3011h hVar) {
        this.f6889a = new WeakReference<>(hVar);
    }

    public boolean canControl(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent() instanceof C2857q;
    }
}
