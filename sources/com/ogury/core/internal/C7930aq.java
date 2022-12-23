package com.ogury.core.internal;

/* renamed from: com.ogury.core.internal.aq */
/* compiled from: Ranges.kt */
public final class C7930aq extends C7927ao {
    public C7930aq(int i, int i2) {
        super(i, i2, 1);
    }

    /* renamed from: d */
    public final boolean mo52900d() {
        return mo52897a() > mo52898b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7930aq)) {
            return false;
        }
        if (mo52900d() && ((C7930aq) obj).mo52900d()) {
            return true;
        }
        C7930aq aqVar = (C7930aq) obj;
        return mo52897a() == aqVar.mo52897a() && mo52898b() == aqVar.mo52898b();
    }

    public final int hashCode() {
        if (mo52900d()) {
            return -1;
        }
        return (mo52897a() * 31) + mo52898b();
    }

    public final String toString() {
        return mo52897a() + ".." + mo52898b();
    }

    /* renamed from: com.ogury.core.internal.aq$a */
    /* compiled from: Ranges.kt */
    public static final class C7931a {
        private C7931a() {
        }

        public /* synthetic */ C7931a(byte b) {
            this();
        }
    }

    static {
        new C7931a((byte) 0);
        new C7930aq(1, 0);
    }
}
