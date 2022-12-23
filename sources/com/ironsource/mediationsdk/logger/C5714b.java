package com.ironsource.mediationsdk.logger;

import com.ironsource.mediationsdk.logger.IronSourceLogger;

/* renamed from: com.ironsource.mediationsdk.logger.b */
public final class C5714b extends IronSourceLogger {

    /* renamed from: c */
    public LogListener f13676c;

    private C5714b() {
        super("publisher");
    }

    public C5714b(LogListener logListener, int i) {
        super("publisher", 1);
        this.f13676c = null;
    }

    public final synchronized void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        if (!(this.f13676c == null || str == null)) {
            this.f13676c.onLog(ironSourceTag, str, i);
        }
    }

    public final void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        if (th != null) {
            log(ironSourceTag, th.getMessage(), 3);
        }
    }
}
