package com.fyber.inneractive.sdk.player.p059c.p077i;

import com.fyber.inneractive.sdk.player.p059c.C3290h;
import com.fyber.inneractive.sdk.player.p059c.p074g.C3460h;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3535a;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.fyber.inneractive.sdk.player.c.i.a */
public abstract class C3464a implements C3473e {

    /* renamed from: a */
    protected final C3460h f9367a;

    /* renamed from: b */
    protected final int f9368b = 1;

    /* renamed from: c */
    protected final int[] f9369c;

    /* renamed from: d */
    private final C3290h[] f9370d = new C3290h[1];

    /* renamed from: e */
    private final long[] f9371e;

    /* renamed from: f */
    private int f9372f;

    public C3464a(C3460h hVar, int... iArr) {
        C3535a.m8784b(true);
        this.f9367a = (C3460h) C3535a.m8781a(hVar);
        int i = 0;
        for (int i2 = 0; i2 <= 0; i2++) {
            this.f9370d[0] = hVar.f9360b[iArr[0]];
        }
        Arrays.sort(this.f9370d, new C3465a((byte) 0));
        this.f9369c = new int[this.f9368b];
        while (true) {
            int i3 = this.f9368b;
            if (i < i3) {
                this.f9369c[i] = hVar.mo19283a(this.f9370d[i]);
                i++;
            } else {
                this.f9371e = new long[i3];
                return;
            }
        }
    }

    /* renamed from: a */
    public final C3460h mo19289a() {
        return this.f9367a;
    }

    /* renamed from: b */
    public final int mo19291b() {
        return this.f9369c.length;
    }

    /* renamed from: a */
    public final C3290h mo19290a(int i) {
        return this.f9370d[i];
    }

    /* renamed from: b */
    public final int mo19292b(int i) {
        return this.f9369c[i];
    }

    /* renamed from: c */
    public final C3290h mo19293c() {
        return this.f9370d[0];
    }

    public int hashCode() {
        if (this.f9372f == 0) {
            this.f9372f = (System.identityHashCode(this.f9367a) * 31) + Arrays.hashCode(this.f9369c);
        }
        return this.f9372f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C3464a aVar = (C3464a) obj;
            return this.f9367a == aVar.f9367a && Arrays.equals(this.f9369c, aVar.f9369c);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.i.a$a */
    private static final class C3465a implements Comparator<C3290h> {
        private C3465a() {
        }

        /* synthetic */ C3465a(byte b) {
            this();
        }

        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return ((C3290h) obj2).f8489b - ((C3290h) obj).f8489b;
        }
    }
}
