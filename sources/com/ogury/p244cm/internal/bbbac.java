package com.ogury.p244cm.internal;

/* renamed from: com.ogury.cm.internal.bbbac */
public final class bbbac extends bbbaa {

    /* renamed from: b */
    public static final aaaaa f20630b = new aaaaa((bbabb) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final bbbac f20631c = new bbbac(1, 0);

    /* renamed from: com.ogury.cm.internal.bbbac$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    public bbbac(int i, int i2) {
        super(i, i2, 1);
    }

    /* renamed from: d */
    public final boolean mo52843d() {
        return mo52840a() > mo52841b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bbbac)) {
            return false;
        }
        if (mo52843d() && ((bbbac) obj).mo52843d()) {
            return true;
        }
        bbbac bbbac = (bbbac) obj;
        return mo52840a() == bbbac.mo52840a() && mo52841b() == bbbac.mo52841b();
    }

    public final int hashCode() {
        if (mo52843d()) {
            return -1;
        }
        return (mo52840a() * 31) + mo52841b();
    }

    public final String toString() {
        return mo52840a() + ".." + mo52841b();
    }
}
