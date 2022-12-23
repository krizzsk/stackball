package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;

public class ec1 extends b30 {

    /* renamed from: k */
    private int f32957k;

    /* renamed from: l */
    private int f32958l;

    /* renamed from: m */
    private boolean f32959m;

    public ec1(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public int getCompoundPaddingBottom() {
        return super.getCompoundPaddingBottom() + this.f32958l;
    }

    public int getCompoundPaddingTop() {
        return super.getCompoundPaddingTop() + this.f32957k;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int d = mo65950d();
        boolean z = true;
        if ((d == -1 || (this.f32957k == 0 && this.f32958l == 0) || d - getMeasuredHeight() == 0) ? false : true) {
            this.f32959m = true;
            this.f32957k = 0;
            this.f32958l = 0;
        }
        int measuredWidth = (getMeasuredWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        CharSequence text = getText();
        Layout layout = getLayout();
        float lineSpacingExtra = getLineSpacingExtra();
        if (layout != null && this.f32959m && measuredWidth > 0 && lineSpacingExtra > 0.0f && !TextUtils.isEmpty(text) && getLayout().getLineCount() == 1) {
            this.f32957k = Math.round(lineSpacingExtra / 2.0f);
            this.f32958l = ((int) lineSpacingExtra) / 2;
            this.f32959m = false;
        } else {
            z = false;
        }
        if (z) {
            int measuredHeightAndState = getMeasuredHeightAndState();
            super.setMeasuredDimension(getMeasuredWidthAndState(), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(measuredHeightAndState) + this.f32957k + this.f32958l, View.MeasureSpec.getMode(measuredHeightAndState)));
        }
        mo65949a(getMeasuredHeight());
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (!mo65951e()) {
            this.f32959m = true;
            this.f32957k = 0;
            this.f32958l = 0;
        }
    }

    public ec1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ec1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32957k = 0;
        this.f32958l = 0;
        this.f32959m = true;
    }
}
