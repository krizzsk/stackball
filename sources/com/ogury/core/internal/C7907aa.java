package com.ogury.core.internal;

import java.io.Closeable;

/* renamed from: com.ogury.core.internal.aa */
/* compiled from: Closeable.kt */
public class C7907aa {

    /* renamed from: a */
    private final String f20676a;

    /* renamed from: b */
    private final long f20677b;

    /* renamed from: a */
    public static final void m22118a(Closeable closeable, Throwable th) {
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            C7921ai.m22144b(th, "$this$addSuppressed");
            C7921ai.m22144b(th2, "exception");
            if (th != th2) {
                C8002y.f20790a.mo53049a(th, th2);
            }
        }
    }

    /* renamed from: a */
    public String mo52875a() {
        return this.f20676a;
    }

    /* renamed from: b */
    public long mo52876b() {
        return this.f20677b;
    }

    private C7907aa(String str, long j) {
        C7921ai.m22144b(str, "message");
        this.f20676a = str;
        this.f20677b = j;
    }

    public /* synthetic */ C7907aa(String str, long j, int i) {
        this(str, System.currentTimeMillis());
    }
}
