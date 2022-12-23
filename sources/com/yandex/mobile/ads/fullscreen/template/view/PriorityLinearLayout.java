package com.yandex.mobile.ads.fullscreen.template.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.yandex.mobile.ads.impl.cl0;
import com.yandex.mobile.ads.impl.dl0;
import com.yandex.mobile.ads.impl.ir1;

public class PriorityLinearLayout extends LinearLayout {

    /* renamed from: a */
    private final cl0 f30391a;

    /* renamed from: b */
    private boolean f30392b;

    /* renamed from: com.yandex.mobile.ads.fullscreen.template.view.PriorityLinearLayout$a */
    public static class C12346a extends LinearLayout.LayoutParams {

        /* renamed from: a */
        private final dl0 f30393a;

        public C12346a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f30393a = new ir1().mo67887a(context, attributeSet);
        }

        /* renamed from: a */
        public dl0 mo65477a() {
            return this.f30393a;
        }
    }

    public PriorityLinearLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public View mo65473a(int i) {
        return super.getChildAt(i);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C12346a(getContext(), attributeSet);
    }

    public View getChildAt(int i) {
        if (this.f30392b) {
            return this.f30391a.mo66326a(i);
        }
        return super.getChildAt(i);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.f30391a.mo66327a();
        this.f30392b = true;
        super.onMeasure(i, i2);
        this.f30392b = false;
    }

    public PriorityLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PriorityLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30392b = false;
        this.f30391a = new cl0(this);
    }

    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public LinearLayout.LayoutParams m45614generateLayoutParams(AttributeSet attributeSet) {
        return new C12346a(getContext(), attributeSet);
    }
}
