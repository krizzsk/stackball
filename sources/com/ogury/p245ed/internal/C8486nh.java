package com.ogury.p245ed.internal;

/* renamed from: com.ogury.ed.internal.nh */
public final class C8486nh extends C8483nf {

    /* renamed from: b */
    public static final C8487a f21710b = new C8487a((byte) 0);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C8486nh f21711c = new C8486nh(1, 0);

    public C8486nh(int i, int i2) {
        super(i, i2);
    }

    /* renamed from: e */
    public final Integer mo53992e() {
        return Integer.valueOf(mo53983a());
    }

    /* renamed from: f */
    public final Integer mo53993f() {
        return Integer.valueOf(mo53984b());
    }

    /* renamed from: d */
    public final boolean mo53986d() {
        return mo53983a() > mo53984b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8486nh)) {
            return false;
        }
        if (mo53986d() && ((C8486nh) obj).mo53986d()) {
            return true;
        }
        C8486nh nhVar = (C8486nh) obj;
        return mo53983a() == nhVar.mo53983a() && mo53984b() == nhVar.mo53984b();
    }

    public final int hashCode() {
        if (mo53986d()) {
            return -1;
        }
        return (mo53983a() * 31) + mo53984b();
    }

    public final String toString() {
        return mo53983a() + ".." + mo53984b();
    }

    /* renamed from: com.ogury.ed.internal.nh$a */
    public static final class C8487a {
        private C8487a() {
        }

        public /* synthetic */ C8487a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C8486nh m23917a() {
            return C8486nh.f21711c;
        }
    }
}
