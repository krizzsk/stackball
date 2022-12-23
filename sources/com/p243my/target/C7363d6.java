package com.p243my.target;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: com.my.target.d6 */
public final class C7363d6 extends FrameLayout {

    /* renamed from: a */
    public final C7722w5 f18452a;

    /* renamed from: b */
    public int f18453b;

    /* renamed from: c */
    public int f18454c;

    public C7363d6(Context context) {
        this(context, (AttributeSet) null);
    }

    public C7363d6(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C7363d6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C7722w5 w5Var = new C7722w5(context);
        this.f18452a = w5Var;
        int a = C7761y8.m20931a(2, context);
        w5Var.setPadding(a, a, a, a);
        w5Var.setFixedHeight(C7761y8.m20931a(17, context));
        addView(w5Var);
    }

    /* renamed from: a */
    public void mo49994a(int i, int i2) {
        this.f18453b = i;
        this.f18454c = i2;
    }

    public C7722w5 getAdChoicesView() {
        return this.f18452a;
    }

    public void onMeasure(int i, int i2) {
        int i3 = this.f18453b;
        if (i3 > 0 && this.f18454c > 0) {
            i = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
            i2 = View.MeasureSpec.makeMeasureSpec(this.f18454c, 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
