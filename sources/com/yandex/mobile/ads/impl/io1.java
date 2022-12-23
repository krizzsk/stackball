package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

public final class io1 {

    /* renamed from: a */
    private final int f34959a;

    /* renamed from: b */
    private final int f34960b;

    public io1(int i, int i2) {
        this.f34959a = i;
        this.f34960b = i2;
    }

    /* renamed from: a */
    public final int mo67839a() {
        return this.f34960b;
    }

    /* renamed from: b */
    public final int mo67840b() {
        return this.f34959a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io1)) {
            return false;
        }
        io1 io1 = (io1) obj;
        return this.f34959a == io1.f34959a && this.f34960b == io1.f34960b;
    }

    public int hashCode() {
        return (this.f34959a * 31) + this.f34960b;
    }

    public String toString() {
        return "ViewSize(width=" + this.f34959a + ", height=" + this.f34960b + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public io1(View view) {
        this(view.getWidth(), view.getHeight());
        Intrinsics.checkNotNullParameter(view, "view");
    }
}
