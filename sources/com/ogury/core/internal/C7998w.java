package com.ogury.core.internal;

/* renamed from: com.ogury.core.internal.w */
/* compiled from: Thread.kt */
public class C7998w {

    /* renamed from: a */
    private final int f20786a;

    /* renamed from: b */
    private final String f20787b;

    /* renamed from: com.ogury.core.internal.w$a */
    /* compiled from: Thread.kt */
    public static final class C7999a extends Thread {

        /* renamed from: a */
        private /* synthetic */ C7917ae f20788a;

        C7999a(C7917ae aeVar) {
            this.f20788a = aeVar;
        }

        public final void run() {
            this.f20788a.mo52894a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static Thread m22244a(boolean z, boolean z2, ClassLoader classLoader, String str, int i, C7917ae<C7979g> aeVar) {
        C7921ai.m22144b(aeVar, "block");
        C7999a aVar = new C7999a(aeVar);
        if (z2) {
            aVar.setDaemon(true);
        }
        if (i > 0) {
            aVar.setPriority(i);
        }
        if (str != null) {
            aVar.setName(str);
        }
        if (classLoader != null) {
            aVar.setContextClassLoader(classLoader);
        }
        if (z) {
            aVar.start();
        }
        return aVar;
    }

    /* renamed from: a */
    public int mo53046a() {
        return this.f20786a;
    }

    /* renamed from: b */
    public String mo53047b() {
        return this.f20787b;
    }

    public C7998w(int i, String str) {
        C7921ai.m22144b(str, "name");
        this.f20786a = i;
        this.f20787b = str;
    }
}
