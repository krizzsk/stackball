package com.ogury.p245ed.internal;

/* renamed from: com.ogury.ed.internal.nf */
public class C8483nf implements C8474mx, Iterable<Integer> {

    /* renamed from: a */
    public static final C8484a f21702a = new C8484a((byte) 0);

    /* renamed from: b */
    private final int f21703b;

    /* renamed from: c */
    private final int f21704c;

    /* renamed from: d */
    private final int f21705d = 1;

    public C8483nf(int i, int i2) {
        this.f21703b = i;
        this.f21704c = C8429lh.m23850a(i, i2);
    }

    /* renamed from: a */
    public final int mo53983a() {
        return this.f21703b;
    }

    /* renamed from: b */
    public final int mo53984b() {
        return this.f21704c;
    }

    /* renamed from: c */
    public final int mo53985c() {
        return this.f21705d;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public C8423lb iterator() {
        return new C8485ng(this.f21703b, this.f21704c, this.f21705d);
    }

    /* renamed from: d */
    public boolean mo53986d() {
        return this.f21705d > 0 ? this.f21703b > this.f21704c : this.f21703b < this.f21704c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8483nf)) {
            return false;
        }
        if (mo53986d() && ((C8483nf) obj).mo53986d()) {
            return true;
        }
        C8483nf nfVar = (C8483nf) obj;
        return this.f21703b == nfVar.f21703b && this.f21704c == nfVar.f21704c && this.f21705d == nfVar.f21705d;
    }

    public int hashCode() {
        if (mo53986d()) {
            return -1;
        }
        return (((this.f21703b * 31) + this.f21704c) * 31) + this.f21705d;
    }

    public String toString() {
        StringBuilder sb;
        int i;
        if (this.f21705d > 0) {
            sb = new StringBuilder();
            sb.append(this.f21703b);
            sb.append("..");
            sb.append(this.f21704c);
            sb.append(" step ");
            i = this.f21705d;
        } else {
            sb = new StringBuilder();
            sb.append(this.f21703b);
            sb.append(" downTo ");
            sb.append(this.f21704c);
            sb.append(" step ");
            i = -this.f21705d;
        }
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: com.ogury.ed.internal.nf$a */
    public static final class C8484a {
        private C8484a() {
        }

        public /* synthetic */ C8484a(byte b) {
            this();
        }
    }
}
