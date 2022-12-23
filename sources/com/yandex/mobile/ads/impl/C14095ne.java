package com.yandex.mobile.ads.impl;

import android.text.Layout;

/* renamed from: com.yandex.mobile.ads.impl.ne */
final class C14095ne extends C14683ti implements Comparable<C14095ne> {

    /* renamed from: g */
    public final int f37796g;

    public C14095ne(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3, z, i4);
        this.f37796g = i5;
    }

    public int compareTo(Object obj) {
        int i = ((C14095ne) obj).f37796g;
        int i2 = this.f37796g;
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }
}
