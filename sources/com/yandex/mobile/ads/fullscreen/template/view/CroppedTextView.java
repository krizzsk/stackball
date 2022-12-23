package com.yandex.mobile.ads.fullscreen.template.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;

public class CroppedTextView extends TextView {

    /* renamed from: a */
    private final int f30384a;

    public CroppedTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredHeight = getMeasuredHeight();
        int lineHeight = getLineHeight();
        int minLines = getMinLines();
        int maxLines = getMaxLines();
        if (lineHeight > 0) {
            int min = Math.min((measuredHeight + Math.round(((float) getLineHeight()) * 0.05f)) / lineHeight, this.f30384a);
            if (min != minLines || min != maxLines) {
                setLines(min);
                TextUtils.TruncateAt ellipsize = getEllipsize();
                setEllipsize((TextUtils.TruncateAt) null);
                setEllipsize(ellipsize);
            }
        }
    }

    public CroppedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CroppedTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30384a = getMaxLines();
    }
}
