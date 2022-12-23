package com.p243my.target;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;

/* renamed from: com.my.target.b6 */
public class C7331b6 extends TextView {

    /* renamed from: a */
    public final GradientDrawable f18367a;

    /* renamed from: b */
    public int f18368b;

    public C7331b6(Context context) {
        this(context, (AttributeSet) null);
    }

    public C7331b6(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C7331b6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f18367a = gradientDrawable;
        gradientDrawable.setStroke(0, -13421773);
        gradientDrawable.setColor(0);
        this.f18368b = (int) TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics());
    }

    /* renamed from: a */
    public void mo49746a(int i, int i2) {
        mo49747a(i, i2, 0);
    }

    /* renamed from: a */
    public void mo49747a(int i, int i2, int i3) {
        this.f18367a.setStroke(i, i2);
        this.f18367a.setCornerRadius((float) i3);
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        this.f18367a.setBounds(getPaddingLeft() - this.f18368b, getPaddingTop(), getWidth(), getHeight());
        this.f18367a.draw(canvas);
        super.onDraw(canvas);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth() + (this.f18368b * 2), getMeasuredHeight());
    }

    public void setBackgroundColor(int i) {
        this.f18367a.setColor(i);
        invalidate();
    }
}
