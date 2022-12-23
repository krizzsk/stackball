package com.smaato.sdk.core.tracker;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.smaato.sdk.core.appbgdetection.AppBackgroundAwareHandler;
import com.smaato.sdk.core.appbgdetection.PauseUnpauseListener;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.tracker.VisibilityTracker;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Threads;
import java.lang.ref.WeakReference;

public class VisibilityTracker {
    private final String actionName;
    private final AppBackgroundAwareHandler appBackgroundAwareHandler;
    private VisibilityTrackerListener listener;
    private ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() {
        private boolean started = false;

        public boolean onPreDraw() {
            if (!this.started) {
                this.started = true;
                VisibilityTracker.this.checkVisibility(new CheckContext(SystemClock.uptimeMillis()));
            }
            return true;
        }
    };
    private final double visibilityRatio;
    private final long visibilityTimeInMillis;
    private WeakReference<View> weakContentView;
    private WeakReference<ViewTreeObserver> weakViewTreeObserver = new WeakReference<>((Object) null);

    VisibilityTracker(Logger logger, View view, double d, long j, VisibilityTrackerListener visibilityTrackerListener, AppBackgroundAwareHandler appBackgroundAwareHandler2, String str) {
        Objects.requireNonNull(view, "Parameter contentView cannot be null for VisibilityTracker::new");
        this.weakContentView = new WeakReference<>(view);
        this.actionName = (String) Objects.requireNonNull(str, "Parameter actionName cannot be null for VisibilityTracker::new");
        if (d <= 0.0d || d > 1.0d) {
            throw new IllegalArgumentException("visibilityRatio should be in range (0..1]");
        }
        this.visibilityRatio = d;
        if (j >= 0) {
            this.visibilityTimeInMillis = j;
            this.listener = (VisibilityTrackerListener) Objects.requireNonNull(visibilityTrackerListener, "Parameter listener cannot be null for VisibilityTracker::new");
            this.appBackgroundAwareHandler = (AppBackgroundAwareHandler) Objects.requireNonNull(appBackgroundAwareHandler2);
            View rootView = view.getRootView();
            if (rootView != null) {
                ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
                this.weakViewTreeObserver = new WeakReference<>(viewTreeObserver);
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnPreDrawListener(this.onPreDrawListener);
                    return;
                }
            }
            logger.error(LogDomain.CORE, "Cannot set VisibilityTracker due to no available root view", new Object[0]);
            return;
        }
        throw new IllegalArgumentException("visibilityTimeInMillis should be bigger or equal to 0");
    }

    /* access modifiers changed from: private */
    public void checkVisibility(CheckContext checkContext) {
        this.appBackgroundAwareHandler.postDelayed(this.actionName, new Runnable(checkContext) {
            public final /* synthetic */ VisibilityTracker.CheckContext f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                VisibilityTracker.this.lambda$checkVisibility$0$VisibilityTracker(this.f$1);
            }
        }, 250, checkContext);
    }

    public /* synthetic */ void lambda$checkVisibility$0$VisibilityTracker(CheckContext checkContext) {
        View view = (View) this.weakContentView.get();
        if (view != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            boolean checkVisibility = VisibilityTrackerUtils.checkVisibility(view, this.visibilityRatio);
            if (checkContext.wasVisible) {
                checkContext.totalVisibilityTime += uptimeMillis - checkContext.previousCheckTime;
                if (checkContext.totalVisibilityTime >= this.visibilityTimeInMillis) {
                    Objects.onNotNull(this.listener, $$Lambda$uYHkhh3aiLW8Nf5tif2DyOnenZA.INSTANCE);
                    return;
                }
                checkContext.previousCheckTime = uptimeMillis;
                checkContext.wasVisible = checkVisibility;
                checkVisibility(checkContext);
                return;
            }
            checkContext.previousCheckTime = uptimeMillis;
            checkContext.wasVisible = checkVisibility;
            checkVisibility(checkContext);
        }
    }

    public void destroy() {
        Threads.ensureMainThread();
        this.appBackgroundAwareHandler.stop();
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.weakViewTreeObserver.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.onPreDrawListener);
        }
        this.weakContentView.clear();
        this.weakViewTreeObserver.clear();
        this.listener = null;
    }

    static class CheckContext implements PauseUnpauseListener {
        long pausedAt = 0;
        long previousCheckTime;
        long totalVisibilityTime = 0;
        boolean wasVisible = false;

        CheckContext(long j) {
            this.previousCheckTime = j;
        }

        public void onActionPaused() {
            this.pausedAt = SystemClock.uptimeMillis();
        }

        public void onBeforeActionUnpaused() {
            long uptimeMillis = SystemClock.uptimeMillis() - this.pausedAt;
            this.pausedAt = 0;
            this.previousCheckTime += uptimeMillis;
        }
    }
}
