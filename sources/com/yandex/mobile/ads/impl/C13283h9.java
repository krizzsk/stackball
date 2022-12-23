package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.yandex.mobile.ads.C12066R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.math.MathKt;
import kotlin.properties.ReadWriteProperty;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;

/* renamed from: com.yandex.mobile.ads.impl.h9 */
public class C13283h9 extends AppCompatImageView {

    /* renamed from: f */
    static final /* synthetic */ KProperty<Object>[] f34289f;

    /* renamed from: a */
    private final ReadWriteProperty f34290a;

    /* renamed from: b */
    private final ReadWriteProperty f34291b;

    /* renamed from: c */
    private final ReadWriteProperty f34292c;

    /* renamed from: d */
    private final Matrix f34293d;

    /* renamed from: e */
    private boolean f34294e;

    /* renamed from: com.yandex.mobile.ads.impl.h9$a */
    public enum C13284a {
        NO_SCALE,
        FIT,
        FILL
    }

    /* renamed from: com.yandex.mobile.ads.impl.h9$b */
    static final class C13285b extends Lambda implements Function1<Float, Float> {

        /* renamed from: b */
        public static final C13285b f34299b = new C13285b();

        C13285b() {
            super(1);
        }

        public Object invoke(Object obj) {
            return Float.valueOf(RangesKt.coerceAtLeast(((Number) obj).floatValue(), 0.0f));
        }
    }

    static {
        Class<C13283h9> cls = C13283h9.class;
        f34289f = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(cls, "gravity", "getGravity()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(cls, "aspectRatio", "getAspectRatio()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(cls, "imageScale", "getImageScale()Lcom/yandex/div/core/widget/AspectImageView$Scale;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C13283h9(Context context) {
        this(context, (AttributeSet) null, 0, 6);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C13283h9(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13283h9(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo67435a(int i) {
        return View.MeasureSpec.getMode(i) != 1073741824;
    }

    public void invalidate() {
        super.invalidate();
        this.f34294e = true;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if ((getImageMatrix() == null || Intrinsics.areEqual((Object) getImageMatrix(), (Object) this.f34293d)) && this.f34294e && getWidth() > 0 && getHeight() > 0) {
            int width = getWidth();
            int height = getHeight();
            Drawable drawable = getDrawable();
            if (drawable != null) {
                float paddingLeft = (float) ((width - getPaddingLeft()) - getPaddingRight());
                float paddingTop = (float) ((height - getPaddingTop()) - getPaddingBottom());
                float intrinsicWidth = (float) drawable.getIntrinsicWidth();
                float intrinsicHeight = (float) drawable.getIntrinsicHeight();
                ReadWriteProperty readWriteProperty = this.f34290a;
                KProperty<Object>[] kPropertyArr = f34289f;
                int absoluteGravity = GravityCompat.getAbsoluteGravity(((Number) readWriteProperty.getValue(this, kPropertyArr[0])).intValue(), ViewCompat.getLayoutDirection(this));
                int ordinal = ((C13284a) this.f34292c.getValue(this, kPropertyArr[2])).ordinal();
                if (ordinal == 0) {
                    f = 1.0f;
                } else if (ordinal == 1) {
                    f = Math.min(paddingLeft / intrinsicWidth, paddingTop / intrinsicHeight);
                } else if (ordinal == 2) {
                    f = Math.max(paddingLeft / intrinsicWidth, paddingTop / intrinsicHeight);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                int i = absoluteGravity & 7;
                float f2 = 0.0f;
                float f3 = i != 1 ? i != 5 ? 0.0f : paddingLeft - (intrinsicWidth * f) : (paddingLeft - (intrinsicWidth * f)) / ((float) 2);
                int i2 = absoluteGravity & 112;
                if (i2 == 16) {
                    f2 = (paddingTop - (intrinsicHeight * f)) / ((float) 2);
                } else if (i2 == 80) {
                    f2 = paddingTop - (intrinsicHeight * f);
                }
                Matrix matrix = this.f34293d;
                matrix.reset();
                matrix.postScale(f, f);
                matrix.postTranslate(f3, f2);
                setImageMatrix(this.f34293d);
            }
            this.f34294e = false;
        }
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f34294e = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean z = true;
        float floatValue = ((Number) this.f34291b.getValue(this, f34289f[1])).floatValue();
        if (!(floatValue == 0.0f)) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            boolean a = mo67435a(i);
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                z = false;
            }
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (!a && !z) {
                measuredHeight = MathKt.roundToInt(((float) measuredWidth) / floatValue);
            } else if (!a && z) {
                measuredHeight = MathKt.roundToInt(((float) measuredWidth) / floatValue);
            } else if (a && !z) {
                measuredWidth = MathKt.roundToInt(((float) measuredHeight) * floatValue);
            } else if (a && z) {
                measuredHeight = MathKt.roundToInt(((float) measuredWidth) / floatValue);
            }
            setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(measuredWidth, mode), View.MeasureSpec.makeMeasureSpec(measuredHeight, mode2));
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f34294e = true;
    }

    public final void setAspectRatio(float f) {
        this.f34291b.setValue(this, f34289f[1], Float.valueOf(f));
    }

    public final void setGravity(int i) {
        this.f34290a.setValue(this, f34289f[0], Integer.valueOf(i));
    }

    public final void setImageScale(C13284a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f34292c.setValue(this, f34289f[2], aVar);
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13283h9(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f34290a = wo1.m43739a(0, (Function1) null, 2);
        this.f34291b = wo1.m43738a(Float.valueOf(0.0f), C13285b.f34299b);
        this.f34292c = wo1.m43740b(C13284a.NO_SCALE, (Function1) null, 2);
        this.f34293d = new Matrix();
        this.f34294e = true;
        super.setScaleType(ImageView.ScaleType.MATRIX);
        if (isInEditMode()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12066R.styleable.AspectImageView, i, 0);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…ageView, defStyleAttr, 0)");
            try {
                setGravity(obtainStyledAttributes.getInt(C12066R.styleable.AspectImageView_android_gravity, 0));
                setAspectRatio(obtainStyledAttributes.getFloat(C12066R.styleable.AspectImageView_aspectRatio, 0.0f));
                setImageScale(C13284a.values()[obtainStyledAttributes.getInteger(C12066R.styleable.AspectImageView_imageScale, 0)]);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }
}
