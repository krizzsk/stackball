package com.ogury.core.internal;

import java.util.Iterator;

/* renamed from: com.ogury.core.internal.ao */
/* compiled from: Progressions.kt */
public class C7927ao implements C7925am, Iterable<Integer> {

    /* renamed from: a */
    public static final C7928a f20691a = new C7928a((byte) 0);

    /* renamed from: b */
    private final int f20692b;

    /* renamed from: c */
    private final int f20693c;

    /* renamed from: d */
    private final int f20694d;

    public C7927ao(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f20692b = i;
            this.f20693c = C7906a.m22110a(i, i2, i3);
            this.f20694d = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    /* renamed from: a */
    public final int mo52897a() {
        return this.f20692b;
    }

    /* renamed from: b */
    public final int mo52898b() {
        return this.f20693c;
    }

    /* renamed from: c */
    public final int mo52899c() {
        return this.f20694d;
    }

    /* renamed from: d */
    public boolean mo52900d() {
        return this.f20694d > 0 ? this.f20692b > this.f20693c : this.f20692b < this.f20693c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7927ao)) {
            return false;
        }
        if (mo52900d() && ((C7927ao) obj).mo52900d()) {
            return true;
        }
        C7927ao aoVar = (C7927ao) obj;
        return this.f20692b == aoVar.f20692b && this.f20693c == aoVar.f20693c && this.f20694d == aoVar.f20694d;
    }

    public int hashCode() {
        if (mo52900d()) {
            return -1;
        }
        return (((this.f20692b * 31) + this.f20693c) * 31) + this.f20694d;
    }

    public String toString() {
        StringBuilder sb;
        int i;
        if (this.f20694d > 0) {
            sb = new StringBuilder();
            sb.append(this.f20692b);
            sb.append("..");
            sb.append(this.f20693c);
            sb.append(" step ");
            i = this.f20694d;
        } else {
            sb = new StringBuilder();
            sb.append(this.f20692b);
            sb.append(" downTo ");
            sb.append(this.f20693c);
            sb.append(" step ");
            i = -this.f20694d;
        }
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: com.ogury.core.internal.ao$a */
    /* compiled from: Progressions.kt */
    public static final class C7928a {
        /* renamed from: a */
        public static int m22153a(int i, int i2) {
            if (i < 0) {
                return 0;
            }
            return i;
        }

        /* renamed from: b */
        public static int m22154b(int i, int i2) {
            return i > i2 ? i2 : i;
        }

        private C7928a() {
        }

        public /* synthetic */ C7928a(byte b) {
            this();
        }
    }

    public /* synthetic */ Iterator iterator() {
        return new C7929ap(this.f20692b, this.f20693c, this.f20694d);
    }
}
