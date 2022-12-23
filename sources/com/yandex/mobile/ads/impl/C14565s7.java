package com.yandex.mobile.ads.impl;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.s7 */
public final class C14565s7 extends Handler {

    /* renamed from: a */
    public static final C14565s7 f39863a = new C14565s7();

    private C14565s7() {
    }

    public void close() {
    }

    public void flush() {
    }

    public void publish(LogRecord logRecord) {
        int i;
        Intrinsics.checkNotNullParameter(logRecord, "record");
        C14442r7 r7Var = C14442r7.f39371a;
        String loggerName = logRecord.getLoggerName();
        Intrinsics.checkNotNullExpressionValue(loggerName, "record.loggerName");
        if (logRecord.getLevel().intValue() > Level.INFO.intValue()) {
            i = 5;
        } else {
            i = logRecord.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
        }
        String message = logRecord.getMessage();
        Intrinsics.checkNotNullExpressionValue(message, "record.message");
        r7Var.mo69700a(loggerName, i, message, logRecord.getThrown());
    }
}
