package com.smaato.sdk.openmeasurement;

import android.view.View;
import com.smaato.sdk.core.analytics.ViewabilityTracker;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p251fi.Consumer;

abstract class BaseOMViewabilityTracker<T extends ViewabilityTracker> implements ViewabilityTracker {
    private final T decorated;
    private final Logger logger;

    BaseOMViewabilityTracker(Logger logger2, T t) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.decorated = (ViewabilityTracker) Objects.requireNonNull(t);
    }

    public final void startTracking() {
        performActionSafely($$Lambda$OpOKEwdnWj6hOzcgmxWrQbiIROc.INSTANCE);
    }

    public final void stopTracking() {
        performActionSafely($$Lambda$uDorTzt2PJ9zriW72C6ocYX_OxY.INSTANCE);
    }

    public final void trackImpression() {
        performActionSafely($$Lambda$nkzhK3hMMJQO1nw8z4bB3V1PKfw.INSTANCE);
    }

    public final void registerFriendlyObstruction(View view) {
        performActionSafely(new Consumer(view) {
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
        performActionSafely(new Consumer(view) {
            public final /* synthetic */ View f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((ViewabilityTracker) obj).removeFriendlyObstruction(this.f$0);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final void performActionSafely(Consumer<T> consumer) {
        try {
            consumer.accept(this.decorated);
        } catch (IllegalArgumentException | IllegalStateException e) {
            this.logger.error(LogDomain.OPEN_MEASUREMENT, e, "WebViewViewabilityTracker failed to perform action", new Object[0]);
        }
    }
}
