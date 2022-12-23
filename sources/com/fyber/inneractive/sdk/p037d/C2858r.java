package com.fyber.inneractive.sdk.p037d;

import com.fyber.inneractive.sdk.external.VideoContentListener;

/* renamed from: com.fyber.inneractive.sdk.d.r */
public abstract class C2858r extends C2846k<VideoContentListener> implements VideoContentListener {
    protected boolean isOverlayOutside = true;

    public C2858r setOverlayOutside(boolean z) {
        this.isOverlayOutside = z;
        return this;
    }

    public boolean isOverlayOutside() {
        return this.isOverlayOutside;
    }

    public void onProgress(int i, int i2) {
        if (this.mEventsListener != null) {
            ((VideoContentListener) this.mEventsListener).onProgress(i, i2);
        }
    }

    public void onCompleted() {
        if (this.mEventsListener != null) {
            ((VideoContentListener) this.mEventsListener).onCompleted();
        }
    }

    public void onPlayerError() {
        if (this.mEventsListener != null) {
            ((VideoContentListener) this.mEventsListener).onPlayerError();
        }
    }
}
