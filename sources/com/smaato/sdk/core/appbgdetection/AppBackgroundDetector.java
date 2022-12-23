package com.smaato.sdk.core.appbgdetection;

import com.smaato.sdk.core.lifecycle.ProcessLifecycleOwner;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;

public class AppBackgroundDetector {
    /* access modifiers changed from: private */
    public boolean foreground;
    private final ArrayList<Listener> listeners = new ArrayList<>();

    public interface Listener {
        void onAppEnteredInBackground();

        void onAppEnteredInForeground();
    }

    public AppBackgroundDetector(final Logger logger) {
        Objects.requireNonNull(logger, "logger must not be null for AppBackgroundDetector::new");
        ProcessLifecycleOwner.get().setListener(new ProcessLifecycleOwner.Listener() {
            public void onFirstActivityStarted() {
                logger.info(LogDomain.CORE, "app entered foreground", new Object[0]);
                boolean unused = AppBackgroundDetector.this.foreground = true;
                AppBackgroundDetector appBackgroundDetector = AppBackgroundDetector.this;
                AppBackgroundDetector.access$100(appBackgroundDetector, appBackgroundDetector.foreground);
            }

            public void onLastActivityStopped() {
                logger.info(LogDomain.CORE, "app entered background", new Object[0]);
                boolean unused = AppBackgroundDetector.this.foreground = false;
                AppBackgroundDetector appBackgroundDetector = AppBackgroundDetector.this;
                AppBackgroundDetector.access$100(appBackgroundDetector, appBackgroundDetector.foreground);
            }
        });
    }

    public synchronized boolean isAppInBackground() {
        return !this.foreground;
    }

    public synchronized void addListener(Listener listener, boolean z) {
        Objects.requireNonNull(listener, "listener can not be null");
        if (!this.listeners.contains(listener)) {
            this.listeners.add(listener);
            if (z) {
                notifyListener(listener, this.foreground);
            }
        }
    }

    private static void notifyListener(Listener listener, boolean z) {
        if (z) {
            listener.onAppEnteredInForeground();
        } else {
            listener.onAppEnteredInBackground();
        }
    }

    public synchronized void deleteListener(Listener listener) {
        this.listeners.remove(listener);
    }

    static /* synthetic */ void access$100(AppBackgroundDetector appBackgroundDetector, boolean z) {
        Iterator it = new ArrayList(appBackgroundDetector.listeners).iterator();
        while (it.hasNext()) {
            notifyListener((Listener) it.next(), z);
        }
    }
}
