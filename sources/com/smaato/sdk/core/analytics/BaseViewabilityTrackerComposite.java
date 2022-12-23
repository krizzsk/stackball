package com.smaato.sdk.core.analytics;

import android.view.View;
import com.smaato.sdk.core.analytics.ViewabilityTracker;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.collections.Iterables;
import com.smaato.sdk.core.util.collections.Lists;
import com.smaato.sdk.core.util.p251fi.Consumer;
import java.util.List;

abstract class BaseViewabilityTrackerComposite<T extends ViewabilityTracker> implements ViewabilityTracker {
    private final List<T> trackers;

    BaseViewabilityTrackerComposite(List<T> list) {
        this.trackers = Lists.toImmutableList(list);
    }

    public final void startTracking() {
        performActionOnMainThread($$Lambda$OpOKEwdnWj6hOzcgmxWrQbiIROc.INSTANCE);
    }

    public final void stopTracking() {
        performActionOnMainThread($$Lambda$uDorTzt2PJ9zriW72C6ocYX_OxY.INSTANCE);
    }

    public final void trackImpression() {
        performActionOnMainThread($$Lambda$nkzhK3hMMJQO1nw8z4bB3V1PKfw.INSTANCE);
    }

    public final void registerFriendlyObstruction(View view) {
        performActionOnMainThread(new Consumer(view) {
            public final /* synthetic */ View f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((ViewabilityTracker) obj).registerFriendlyObstruction(this.f$0);
            }
        });
    }

    public final void removeFriendlyObstruction(View view) {
        performActionOnMainThread(new Consumer(view) {
            public final /* synthetic */ View f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((ViewabilityTracker) obj).removeFriendlyObstruction(this.f$0);
            }
        });
    }

    /* renamed from: lambda$performActionOnMainThread$2$BaseViewabilityTrackerComposite */
    public /* synthetic */ void mo54522xf15d82c9(Consumer consumer) {
        Iterables.forEach(this.trackers, consumer);
    }

    /* access modifiers changed from: package-private */
    public final void performActionOnMainThread(Consumer<T> consumer) {
        Threads.runOnUi(new Runnable(consumer) {
            public final /* synthetic */ Consumer f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                BaseViewabilityTrackerComposite.this.mo54522xf15d82c9(this.f$1);
            }
        });
    }
}
