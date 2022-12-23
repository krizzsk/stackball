package com.smaato.sdk.core.analytics;

import android.view.View;
import com.smaato.sdk.core.util.p251fi.Consumer;

final class NativeViewabilityTrackerComposite extends BaseViewabilityTrackerComposite<NativeViewabilityTracker> implements NativeViewabilityTracker {
    public final void registerAdView(View view) {
        performActionOnMainThread(new Consumer(view) {
            public final /* synthetic */ View f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((NativeViewabilityTracker) obj).registerAdView(this.f$0);
            }
        });
    }
}
