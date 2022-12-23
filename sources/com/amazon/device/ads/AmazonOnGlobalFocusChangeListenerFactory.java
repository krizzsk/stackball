package com.amazon.device.ads;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: ViewabilityObserver */
class AmazonOnGlobalFocusChangeListenerFactory {
    AmazonOnGlobalFocusChangeListenerFactory() {
    }

    public ViewTreeObserver.OnGlobalFocusChangeListener buildAmazonOnGlobalFocusChangedListener(ViewabilityObserver viewabilityObserver) {
        return new AmazonOnGlobalFocusChangeListener(viewabilityObserver);
    }

    /* compiled from: ViewabilityObserver */
    private class AmazonOnGlobalFocusChangeListener implements ViewTreeObserver.OnGlobalFocusChangeListener {
        private final ViewabilityObserver viewabilityObserver;

        public AmazonOnGlobalFocusChangeListener(ViewabilityObserver viewabilityObserver2) {
            this.viewabilityObserver = viewabilityObserver2;
        }

        public void onGlobalFocusChanged(View view, View view2) {
            this.viewabilityObserver.fireViewableEvent(false);
        }
    }
}
