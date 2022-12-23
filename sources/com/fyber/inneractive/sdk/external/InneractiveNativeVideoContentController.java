package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.p037d.C2858r;
import com.fyber.inneractive.sdk.util.C3670q;
import java.lang.ref.WeakReference;

public class InneractiveNativeVideoContentController extends C2858r {

    /* renamed from: a */
    WeakReference<Renderer> f6904a;

    /* renamed from: b */
    private boolean f6905b = true;

    public interface Renderer {
        void pauseVideo();

        void playVideo();
    }

    public void setControlledRenderer(Renderer renderer) {
        this.f6904a = new WeakReference<>(renderer);
    }

    public boolean canControl(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent().isVideoAd();
    }

    public void playVideo() {
        Renderer renderer = (Renderer) C3670q.m9152a(this.f6904a);
        if (renderer != null) {
            renderer.playVideo();
        }
    }

    public void pauseVideo() {
        if (((Renderer) C3670q.m9152a(this.f6904a)) != null) {
            ((Renderer) this.f6904a.get()).pauseVideo();
        }
    }
}
