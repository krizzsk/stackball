package com.amazon.device.ads;

import android.view.ViewTreeObserver;

/* compiled from: ViewabilityObserver */
class AmazonOnScrollChangedListenerFactory {
    AmazonOnScrollChangedListenerFactory() {
    }

    public ViewTreeObserver.OnScrollChangedListener buildAmazonOnScrollChangedListenerFactory(ViewabilityObserver viewabilityObserver) {
        return new AmazonOnScrollChangedListener(viewabilityObserver);
    }

    /* compiled from: ViewabilityObserver */
    private class AmazonOnScrollChangedListener implements ViewTreeObserver.OnScrollChangedListener {
        private final ViewabilityObserver viewabilityObserver;

        public AmazonOnScrollChangedListener(ViewabilityObserver viewabilityObserver2) {
            this.viewabilityObserver = viewabilityObserver2;
        }

        public void onScrollChanged() {
            this.viewabilityObserver.fireViewableEvent(true);
        }
    }
}
