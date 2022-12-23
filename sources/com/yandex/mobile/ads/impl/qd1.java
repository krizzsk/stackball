package com.yandex.mobile.ads.impl;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;

public class qd1 extends Spannable.Factory {

    /* renamed from: a */
    private final Drawable f39089a;

    /* renamed from: b */
    private final int f39090b;

    /* renamed from: c */
    private final int f39091c;

    public qd1(Drawable drawable, int i, int i2) {
        this.f39089a = drawable;
        this.f39090b = i;
        this.f39091c = i2;
    }

    public Spannable newSpannable(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.f39089a != null && this.f39090b > 0) {
            spannableStringBuilder.append("  ");
            Drawable drawable = this.f39089a;
            int i = this.f39090b;
            drawable.setBounds(0, 0, i, i);
            C13280h7 h7Var = new C13280h7(drawable, -1);
            ColorDrawable colorDrawable = new ColorDrawable(0);
            int i2 = this.f39091c;
            colorDrawable.setBounds(0, 0, i2, i2);
            C13280h7 h7Var2 = new C13280h7(colorDrawable, -1);
            spannableStringBuilder.setSpan(h7Var, 0, 1, 33);
            spannableStringBuilder.setSpan(h7Var2, 1, 2, 33);
        }
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }
}
