package com.ogury.p245ed.internal;

import java.util.NoSuchElementException;

/* renamed from: com.ogury.ed.internal.ng */
public final class C8485ng extends C8423lb {

    /* renamed from: a */
    private final int f21706a;

    /* renamed from: b */
    private boolean f21707b;

    /* renamed from: c */
    private int f21708c;

    /* renamed from: d */
    private final int f21709d;

    public C8485ng(int i, int i2, int i3) {
        this.f21709d = i3;
        this.f21706a = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f21707b = z;
        this.f21708c = !z ? this.f21706a : i;
    }

    public final boolean hasNext() {
        return this.f21707b;
    }

    /* renamed from: a */
    public final int mo53956a() {
        int i = this.f21708c;
        if (i != this.f21706a) {
            this.f21708c = this.f21709d + i;
        } else if (this.f21707b) {
            this.f21707b = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }
}
