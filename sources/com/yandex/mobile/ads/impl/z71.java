package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;

public class z71 extends View {

    /* renamed from: a */
    private final Paint f43046a;

    /* renamed from: b */
    private final Rect f43047b;

    /* renamed from: c */
    private boolean f43048c;

    /* renamed from: d */
    private boolean f43049d;

    /* renamed from: e */
    private int f43050e;

    /* renamed from: f */
    private int f43051f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public z71(Context context) {
        this(context, (AttributeSet) null, 0, 6);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public z71(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z71(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (Color.alpha(this.f43046a.getColor()) > 0) {
            if (this.f43048c) {
                int paddingTop = this.f43049d ? getPaddingTop() : getPaddingLeft();
                int paddingBottom = this.f43049d ? getPaddingBottom() : getPaddingRight();
                int height = this.f43049d ? getHeight() : getWidth();
                int i = (height - paddingTop) - paddingBottom;
                int i2 = this.f43051f;
                if (i2 == 17) {
                    paddingTop += (i - this.f43050e) / 2;
                } else if (i2 != 8388611) {
                    if (i2 != 8388613) {
                        paddingTop = 0;
                    } else {
                        paddingTop = (height - paddingBottom) - this.f43050e;
                    }
                }
                if (this.f43049d) {
                    Rect rect = this.f43047b;
                    rect.top = paddingTop;
                    rect.bottom = paddingTop + Math.min(i, this.f43050e);
                    this.f43047b.left = getPaddingLeft();
                    this.f43047b.right = getWidth() - getPaddingRight();
                } else {
                    Rect rect2 = this.f43047b;
                    rect2.left = paddingTop;
                    rect2.right = paddingTop + Math.min(i, this.f43050e);
                    this.f43047b.top = getPaddingTop();
                    this.f43047b.bottom = getHeight() - getPaddingBottom();
                }
                this.f43048c = false;
            }
            canvas.drawRect(this.f43047b, this.f43046a);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f43049d) {
            paddingTop += this.f43050e;
        } else {
            paddingLeft += this.f43050e;
        }
        int max = Math.max(paddingLeft, getSuggestedMinimumWidth());
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            max = Math.min(max, size);
        } else if (mode == 1073741824) {
            max = size;
        }
        int max2 = Math.max(paddingTop, getSuggestedMinimumHeight());
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            max2 = Math.min(max2, size2);
        } else if (mode2 == 1073741824) {
            max2 = size2;
        }
        setMeasuredDimension(max, max2);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f43048c = true;
    }

    public final void setDividerColor(int i) {
        if (this.f43046a.getColor() != i) {
            this.f43046a.setColor(i);
            invalidate();
        }
    }

    public final void setDividerColorResource(int i) {
        setDividerColor(ContextCompat.getColor(getContext(), i));
    }

    public final void setDividerGravity(int i) {
        if (this.f43051f != i) {
            this.f43051f = i;
            this.f43048c = true;
            invalidate();
        }
    }

    public final void setDividerHeightResource(int i) {
        setDividerThickness(getResources().getDimensionPixelSize(i));
    }

    public final void setDividerThickness(int i) {
        if (this.f43050e != i) {
            this.f43050e = i;
            this.f43048c = true;
            requestLayout();
        }
    }

    public final void setHorizontal(boolean z) {
        if (this.f43049d != z) {
            this.f43049d = z;
            this.f43048c = true;
            requestLayout();
        }
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        this.f43048c = true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z71(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        paint.setColor(0);
        this.f43046a = paint;
        this.f43047b = new Rect();
        this.f43049d = true;
        this.f43051f = 17;
    }
}
