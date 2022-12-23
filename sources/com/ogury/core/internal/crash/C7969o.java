package com.ogury.core.internal.crash;

import com.ogury.core.internal.C7921ai;

/* renamed from: com.ogury.core.internal.crash.o */
/* compiled from: PhoneInfo.kt */
public final class C7969o {

    /* renamed from: a */
    public static final C7970a f20756a = new C7970a((byte) 0);

    /* renamed from: b */
    private final String f20757b;

    /* renamed from: c */
    private final String f20758c;

    /* renamed from: d */
    private final C7971p f20759d;

    /* renamed from: com.ogury.core.internal.crash.o$a */
    /* compiled from: PhoneInfo.kt */
    public static final class C7970a {
        private C7970a() {
        }

        public /* synthetic */ C7970a(byte b) {
            this();
        }
    }

    public C7969o(String str, String str2, C7971p pVar) {
        C7921ai.m22144b(str, "phoneModel");
        C7921ai.m22144b(str2, "androidVersion");
        C7921ai.m22144b(pVar, "memory");
        this.f20757b = str;
        this.f20758c = str2;
        this.f20759d = pVar;
    }

    /* renamed from: a */
    public final String mo52954a() {
        return this.f20757b;
    }

    /* renamed from: b */
    public final String mo52955b() {
        return this.f20758c;
    }

    /* renamed from: c */
    public final C7971p mo52956c() {
        return this.f20759d;
    }
}
