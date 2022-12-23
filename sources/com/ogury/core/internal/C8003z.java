package com.ogury.core.internal;

/* renamed from: com.ogury.core.internal.z */
/* compiled from: JDK7PlatformImplementations.kt */
public class C8003z extends C8000x {
    /* renamed from: a */
    public final void mo53049a(Throwable th, Throwable th2) {
        C7921ai.m22144b(th, "cause");
        C7921ai.m22144b(th2, "exception");
        th.addSuppressed(th2);
    }
}
