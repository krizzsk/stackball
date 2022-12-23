package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

public class yx0 extends View {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public je0 f42975a;

    /* renamed from: b */
    private ViewPager2 f42976b;

    /* renamed from: c */
    private RecyclerView.Adapter<?> f42977c;

    /* renamed from: d */
    private ViewPager2.OnPageChangeCallback f42978d;

    /* renamed from: e */
    private ge0 f42979e;

    /* renamed from: com.yandex.mobile.ads.impl.yx0$a */
    public /* synthetic */ class C15283a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f42980a;

        static {
            int[] iArr = new int[fe0.values().length];
            iArr[0] = 1;
            f42980a = iArr;
            int[] iArr2 = new int[ee0.values().length];
            iArr2[0] = 1;
            iArr2[1] = 2;
            iArr2[2] = 3;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.yx0$b */
    public static final class C15284b extends ViewPager2.OnPageChangeCallback {

        /* renamed from: a */
        final /* synthetic */ yx0 f42981a;

        C15284b(yx0 yx0) {
            this.f42981a = yx0;
        }

        public void onPageScrolled(int i, float f, int i2) {
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            je0 a = this.f42981a.f42975a;
            if (a != null) {
                a.mo67982b(i, f);
            }
            this.f42981a.invalidate();
        }

        public void onPageSelected(int i) {
            je0 a = this.f42981a.f42975a;
            if (a != null) {
                a.mo67981b(i);
            }
            this.f42981a.invalidate();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public yx0(Context context) {
        this(context, (AttributeSet) null, 0, 6);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public yx0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yx0(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
        je0 je0 = this.f42975a;
        if (je0 != null) {
            je0.mo67980a(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        ge0 ge0 = this.f42979e;
        float f = 0.0f;
        int k = (int) ((ge0 == null ? 0.0f : ge0.mo67266k()) + ((float) getPaddingTop()) + ((float) getPaddingBottom()));
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(k, size);
        } else if (mode != 1073741824) {
            size = k;
        }
        int mode2 = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i);
        ge0 ge02 = this.f42979e;
        float l = ge02 == null ? 0.0f : ge02.mo67267l();
        ge0 ge03 = this.f42979e;
        if (ge03 != null) {
            f = ge03.mo67269n();
        }
        RecyclerView.Adapter<?> adapter = this.f42977c;
        int itemCount = ((int) ((f * ((float) (adapter == null ? 0 : adapter.getItemCount()))) + l)) + getPaddingLeft() + getPaddingRight();
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(itemCount, size2);
        } else if (mode2 != 1073741824) {
            size2 = itemCount;
        }
        setMeasuredDimension(size2, size);
        je0 je0 = this.f42975a;
        if (je0 != null) {
            je0.mo67979a((size2 - getPaddingLeft()) - getPaddingRight(), (size - getPaddingTop()) - getPaddingBottom());
        }
    }

    public final void setStyle(ge0 ge0) {
        ce0 ce0;
        Intrinsics.checkNotNullParameter(ge0, "style");
        this.f42979e = ge0;
        if (C15283a.f42980a[ge0.mo67268m().ordinal()] == 1) {
            h61 h61 = new h61(ge0);
            int ordinal = ge0.mo67254a().ordinal();
            if (ordinal == 0) {
                ce0 = new v61(ge0);
            } else if (ordinal == 1) {
                ce0 = new oq1(ge0);
            } else if (ordinal == 2) {
                ce0 = new o91(ge0);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            je0 je0 = new je0(ge0, h61, ce0);
            this.f42975a = je0;
            je0.mo67979a((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            ViewPager2 viewPager2 = this.f42976b;
            if (viewPager2 != null) {
                ViewPager2.OnPageChangeCallback onPageChangeCallback = this.f42978d;
                if (!(onPageChangeCallback == null || viewPager2 == null)) {
                    viewPager2.unregisterOnPageChangeCallback(onPageChangeCallback);
                }
                mo71133a(viewPager2);
            }
            requestLayout();
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yx0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: a */
    public final void mo71133a(ViewPager2 viewPager2) {
        Intrinsics.checkNotNullParameter(viewPager2, "pager2");
        RecyclerView.Adapter<?> adapter = viewPager2.getAdapter();
        this.f42977c = adapter;
        if (adapter != null) {
            if (adapter != null) {
                je0 je0 = this.f42975a;
                if (je0 != null) {
                    je0.mo67983c(adapter.getItemCount());
                }
                invalidate();
            }
            je0 je02 = this.f42975a;
            if (je02 != null) {
                je02.mo67981b(viewPager2.getCurrentItem());
            }
            C15284b bVar = new C15284b(this);
            viewPager2.registerOnPageChangeCallback(bVar);
            this.f42978d = bVar;
            this.f42976b = viewPager2;
            return;
        }
        throw new IllegalStateException("Attached pager adapter is null!");
    }
}
