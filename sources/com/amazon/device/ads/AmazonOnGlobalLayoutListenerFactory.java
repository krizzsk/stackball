package com.amazon.device.ads;

import android.view.ViewTreeObserver;

/* compiled from: ViewabilityObserver */
class AmazonOnGlobalLayoutListenerFactory {
    AmazonOnGlobalLayoutListenerFactory() {
    }

    public ViewTreeObserver.OnGlobalLayoutListener buildAmazonOnGlobalLayoutListener(ViewabilityObserver viewabilityObserver) {
        return new AmazonOnGlobalLayoutListener(viewabilityObserver);
    }

    /* compiled from: ViewabilityObserver */
    private class AmazonOnGlobalLayoutListener implements ViewTreeObserver.OnGlobalLayoutListener {
        private final ViewabilityObserver viewabilityObserver;

        public AmazonOnGlobalLayoutListener(ViewabilityObserver viewabilityObserver2) {
            this.viewabilityObserver = viewabilityObserver2;
        }

        public void onGlobalLayout() {
            this.viewabilityObserver.addOnScrollChangedListenerIfNeeded();
            this.viewabilityObserver.fireViewableEvent(false);
        }
    }
}
