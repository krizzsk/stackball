package com.amazon.device.ads;

import android.view.ViewTreeObserver;

/* compiled from: ViewabilityObserver */
class AmazonOnWindowFocusChangeListenerFactory {
    AmazonOnWindowFocusChangeListenerFactory() {
    }

    public ViewTreeObserver.OnWindowFocusChangeListener buildOnWindowFocusChangeListener(ViewabilityObserver viewabilityObserver) {
        return new AmazonOnWindowFocusChangeListener(viewabilityObserver);
    }

    /* compiled from: ViewabilityObserver */
    private class AmazonOnWindowFocusChangeListener implements ViewTreeObserver.OnWindowFocusChangeListener {
        private final ViewabilityObserver viewabilityObserver;

        AmazonOnWindowFocusChangeListener(ViewabilityObserver viewabilityObserver2) {
            this.viewabilityObserver = viewabilityObserver2;
        }

        public void onWindowFocusChanged(boolean z) {
            this.viewabilityObserver.fireViewableEvent(false);
        }
    }
}
