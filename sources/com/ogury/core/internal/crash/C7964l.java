package com.ogury.core.internal.crash;

import com.ogury.core.internal.C7921ai;
import java.lang.Thread;

/* renamed from: com.ogury.core.internal.crash.l */
/* compiled from: ExceptionHandler.kt */
public final class C7964l implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public static final C7965a f20751a = new C7965a((byte) 0);

    /* renamed from: b */
    private final C7959j f20752b;

    /* renamed from: c */
    private final Thread.UncaughtExceptionHandler f20753c;

    public C7964l(C7959j jVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        C7921ai.m22144b(jVar, "crashSerializerFactory");
        this.f20752b = jVar;
        this.f20753c = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        C7921ai.m22144b(thread, "thread");
        C7921ai.m22144b(th, "exception");
        try {
            this.f20752b.mo52947a(th).mo52920a();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f20753c;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Exception e) {
            C7958i iVar = C7958i.f20738a;
            C7958i.m22206a(e);
        }
    }

    /* renamed from: com.ogury.core.internal.crash.l$a */
    /* compiled from: ExceptionHandler.kt */
    public static final class C7965a {
        private C7965a() {
        }

        public /* synthetic */ C7965a(byte b) {
            this();
        }
    }
}
