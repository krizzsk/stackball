package com.yandex.mobile.ads.fullscreen.template.view;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;
import com.yandex.mobile.ads.impl.C12574b8;
import com.yandex.mobile.ads.impl.el0;
import com.yandex.mobile.ads.impl.r81;

public class ExtendedTextView extends TextView {

    /* renamed from: a */
    private el0 f30385a;

    /* renamed from: b */
    private final C12574b8 f30386b;

    public ExtendedTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private boolean m32570a() {
        return Build.VERSION.SDK_INT >= 27;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C12574b8 b8Var;
        super.onLayout(z, i, i2, i3, i4);
        if (!m32570a() && (b8Var = this.f30386b) != null) {
            b8Var.mo66013a();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        el0.C12983a a = this.f30385a.mo65798a(i, i2);
        super.onMeasure(a.f33000a, a.f33001b);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C12574b8 b8Var;
        super.onTextChanged(charSequence, i, i2, i3);
        if (!m32570a() && (b8Var = this.f30386b) != null) {
            b8Var.mo66016b();
        }
    }

    public void setAutoSizeTextType(int i) {
        if (m32570a()) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C12574b8 b8Var = this.f30386b;
        if (b8Var != null) {
            b8Var.mo66014a(i);
        }
    }

    public void setMeasureSpecProvider(el0 el0) {
        this.f30385a = el0;
        requestLayout();
        invalidate();
    }

    public void setTextSize(int i, float f) {
        if (m32570a()) {
            super.setTextSize(i, f);
            return;
        }
        C12574b8 b8Var = this.f30386b;
        if (b8Var != null) {
            b8Var.mo66015a(i, f);
        }
    }

    public ExtendedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExtendedTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30385a = new r81();
        this.f30386b = new C12574b8(this);
    }
}
