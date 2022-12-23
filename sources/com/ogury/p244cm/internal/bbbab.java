package com.ogury.p244cm.internal;

import java.util.NoSuchElementException;

/* renamed from: com.ogury.cm.internal.bbbab */
public final class bbbab extends bacba {

    /* renamed from: a */
    private final int f20626a;

    /* renamed from: b */
    private boolean f20627b;

    /* renamed from: c */
    private int f20628c;

    /* renamed from: d */
    private final int f20629d;

    public bbbab(int i, int i2, int i3) {
        this.f20629d = i3;
        this.f20626a = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f20627b = z;
        this.f20628c = !z ? this.f20626a : i;
    }

    /* renamed from: a */
    public final int mo52830a() {
        int i = this.f20628c;
        if (i != this.f20626a) {
            this.f20628c = this.f20629d + i;
        } else if (this.f20627b) {
            this.f20627b = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    public final boolean hasNext() {
        return this.f20627b;
    }
}
