package com.yandex.mobile.ads.fullscreen.template.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class ExtraSpacingTextView extends TextView {

    /* renamed from: a */
    private CharSequence f30390a;

    public ExtraSpacingTextView(Context context) {
        super(context);
    }

    public CharSequence getText() {
        return this.f30390a;
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.f30390a = charSequence;
        super.setText("     " + this.f30390a + "     ", bufferType);
    }

    public ExtraSpacingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExtraSpacingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
