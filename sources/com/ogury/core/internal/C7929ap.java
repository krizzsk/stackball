package com.ogury.core.internal;

import java.util.NoSuchElementException;

/* renamed from: com.ogury.core.internal.ap */
/* compiled from: ProgressionIterators.kt */
public final class C7929ap extends C7995t {

    /* renamed from: a */
    private final int f20695a;

    /* renamed from: b */
    private boolean f20696b;

    /* renamed from: c */
    private int f20697c;

    /* renamed from: d */
    private final int f20698d;

    public C7929ap(int i, int i2, int i3) {
        this.f20698d = i3;
        this.f20695a = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f20696b = z;
        this.f20697c = !z ? this.f20695a : i;
    }

    public final boolean hasNext() {
        return this.f20696b;
    }

    /* renamed from: a */
    public final int mo52905a() {
        int i = this.f20697c;
        if (i != this.f20695a) {
            this.f20697c = this.f20698d + i;
        } else if (this.f20696b) {
            this.f20696b = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }
}
