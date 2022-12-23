package com.ogury.p244cm.internal;

import com.ogury.p244cm.ConsentActivity;
import com.ogury.p244cm.internal.bbbac;
import java.util.Iterator;

/* renamed from: com.ogury.cm.internal.bbbaa */
public class bbbaa implements Iterable<Integer> {

    /* renamed from: a */
    public static final aaaaa f20622a = new aaaaa((bbabb) null);

    /* renamed from: b */
    private final int f20623b;

    /* renamed from: c */
    private final int f20624c;

    /* renamed from: d */
    private final int f20625d = 1;

    /* renamed from: com.ogury.cm.internal.bbbaa$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }

        /* renamed from: a */
        public static bbbac m22058a(int i, int i2) {
            if (i2 > Integer.MIN_VALUE) {
                return new bbbac(i, i2 - 1);
            }
            bbbac.aaaaa aaaaa = bbbac.f20630b;
            return bbbac.f20631c;
        }
    }

    public bbbaa(int i, int i2, int i3) {
        this.f20623b = i;
        this.f20624c = ConsentActivity.aaaaa.m21622a(i, i2, 1);
    }

    /* renamed from: a */
    public final int mo52840a() {
        return this.f20623b;
    }

    /* renamed from: b */
    public final int mo52841b() {
        return this.f20624c;
    }

    /* renamed from: c */
    public final int mo52842c() {
        return this.f20625d;
    }

    /* renamed from: d */
    public boolean mo52843d() {
        return this.f20625d > 0 ? this.f20623b > this.f20624c : this.f20623b < this.f20624c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof bbbaa)) {
            return false;
        }
        if (mo52843d() && ((bbbaa) obj).mo52843d()) {
            return true;
        }
        bbbaa bbbaa = (bbbaa) obj;
        return this.f20623b == bbbaa.f20623b && this.f20624c == bbbaa.f20624c && this.f20625d == bbbaa.f20625d;
    }

    public int hashCode() {
        if (mo52843d()) {
            return -1;
        }
        return (((this.f20623b * 31) + this.f20624c) * 31) + this.f20625d;
    }

    public /* synthetic */ Iterator iterator() {
        return new bbbab(this.f20623b, this.f20624c, this.f20625d);
    }

    public String toString() {
        StringBuilder sb;
        int i;
        if (this.f20625d > 0) {
            sb = new StringBuilder();
            sb.append(this.f20623b);
            sb.append("..");
            sb.append(this.f20624c);
            sb.append(" step ");
            i = this.f20625d;
        } else {
            sb = new StringBuilder();
            sb.append(this.f20623b);
            sb.append(" downTo ");
            sb.append(this.f20624c);
            sb.append(" step ");
            i = -this.f20625d;
        }
        sb.append(i);
        return sb.toString();
    }
}
