package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import com.inmobi.media.C5149eb;

/* renamed from: com.inmobi.media.ed */
/* compiled from: GifView */
public class C5153ed extends ImageView implements C5149eb.C5150a {

    /* renamed from: a */
    private C5149eb f11829a;

    /* renamed from: b */
    private float f11830b;

    /* renamed from: c */
    private boolean f11831c;

    /* renamed from: d */
    private String f11832d;

    public C5153ed(Context context) {
        this(context, (byte) 0);
    }

    private C5153ed(Context context, byte b) {
        super(context, (AttributeSet) null);
        this.f11830b = 1.0f;
        this.f11831c = true;
        this.f11832d = "unspecified";
        setLayerType(1, (Paint) null);
    }

    public void setPaused(boolean z) {
        this.f11829a.mo40421a(z);
    }

    public void setGifImpl(C5149eb ebVar) {
        this.f11829a = ebVar;
        if (ebVar != null) {
            ebVar.mo40420a((C5149eb.C5150a) this);
            this.f11829a.mo40418a();
        }
        requestLayout();
    }

    public void setContentMode(String str) {
        this.f11832d = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0074  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private float[] m11809a(android.graphics.Canvas r10) {
        /*
            r9 = this;
            int r0 = r9.getWidth()
            float r0 = (float) r0
            int r1 = r9.getHeight()
            float r1 = (float) r1
            com.inmobi.media.eb r2 = r9.f11829a
            int r2 = r2.mo40422b()
            float r2 = (float) r2
            float r3 = r9.f11830b
            float r2 = r2 * r3
            com.inmobi.media.eb r3 = r9.f11829a
            int r3 = r3.mo40423c()
            float r3 = (float) r3
            float r4 = r9.f11830b
            float r3 = r3 * r4
            java.lang.String r4 = r9.f11832d
            int r5 = r4.hashCode()
            r6 = -1362001767(0xffffffffaed18099, float:-9.527063E-11)
            r7 = 0
            r8 = 1
            if (r5 == r6) goto L_0x003d
            r6 = 727618043(0x2b5e91fb, float:7.907283E-13)
            if (r5 == r6) goto L_0x0033
            goto L_0x0047
        L_0x0033:
            java.lang.String r5 = "aspectFill"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0047
            r4 = 0
            goto L_0x0048
        L_0x003d:
            java.lang.String r5 = "aspectFit"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0047
            r4 = 1
            goto L_0x0048
        L_0x0047:
            r4 = -1
        L_0x0048:
            r5 = 0
            r6 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L_0x0074
            if (r4 == r8) goto L_0x0056
            float r0 = r0 / r2
            float r1 = r1 / r3
            r10.scale(r0, r1)
            r0 = 0
            goto L_0x0092
        L_0x0056:
            float r4 = r1 / r3
            float r5 = r0 / r2
            float r4 = java.lang.Math.min(r4, r5)
            float r2 = r2 * r4
            float r0 = r0 - r2
            float r0 = r0 / r6
            float r2 = r9.f11830b
            float r5 = r4 * r2
            float r5 = r0 / r5
            float r3 = r3 * r4
            float r1 = r1 - r3
            float r1 = r1 / r6
            float r2 = r2 * r4
            float r0 = r1 / r2
            r10.scale(r4, r4)
            goto L_0x0091
        L_0x0074:
            float r4 = r1 / r3
            float r5 = r0 / r2
            float r4 = java.lang.Math.max(r4, r5)
            float r2 = r2 * r4
            float r0 = r0 - r2
            float r0 = r0 / r6
            float r2 = r9.f11830b
            float r5 = r4 * r2
            float r5 = r0 / r5
            float r3 = r3 * r4
            float r1 = r1 - r3
            float r1 = r1 / r6
            float r2 = r2 * r4
            float r0 = r1 / r2
            r10.scale(r4, r4)
        L_0x0091:
            r1 = r4
        L_0x0092:
            r10 = 3
            float[] r10 = new float[r10]
            r10[r7] = r5
            r10[r8] = r0
            r0 = 2
            r10[r0] = r1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5153ed.m11809a(android.graphics.Canvas):float[]");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.f11830b = getScale();
        Drawable drawable = getDrawable();
        int i3 = 0;
        int i4 = 1;
        if (drawable != null) {
            i3 = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (i3 <= 0) {
                i3 = 1;
            }
            if (intrinsicHeight > 0) {
                i4 = intrinsicHeight;
            }
        } else {
            C5149eb ebVar = this.f11829a;
            if (ebVar != null) {
                int b = ebVar.mo40422b();
                int c = this.f11829a.mo40423c();
                if (b <= 0) {
                    b = 1;
                }
                if (c > 0) {
                    i4 = c;
                }
                i3 = b;
            } else {
                i4 = 0;
            }
        }
        setMeasuredDimension(resolveSize(Math.max(i3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i), resolveSize(Math.max(i4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2));
    }

    private int getDensity() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (!(getContext() instanceof Activity)) {
            return 240;
        }
        ((Activity) getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.densityDpi;
    }

    private float getScale() {
        float density = ((float) getContext().getResources().getDisplayMetrics().densityDpi) / ((float) getDensity());
        this.f11830b = density;
        if (density < 0.1f) {
            this.f11830b = 0.1f;
        }
        if (this.f11830b > 5.0f) {
            this.f11830b = 5.0f;
        }
        return this.f11830b;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f11831c = getVisibility() == 0;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        C5149eb ebVar = this.f11829a;
        if (ebVar == null) {
            return;
        }
        if (ebVar.mo40424d()) {
            this.f11829a.mo40425e();
            m11811b(canvas);
            m11810b();
            return;
        }
        m11811b(canvas);
    }

    /* renamed from: b */
    private void m11811b(Canvas canvas) {
        canvas.save();
        float f = this.f11830b;
        canvas.scale(f, f);
        float[] a = m11809a(canvas);
        this.f11829a.mo40419a(canvas, a[0], a[1]);
        canvas.restore();
    }

    /* renamed from: b */
    private void m11810b() {
        if (!this.f11831c) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            postInvalidateOnAnimation();
        } else {
            invalidate();
        }
    }

    public void onScreenStateChanged(int i) {
        super.onScreenStateChanged(i);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.f11831c = z;
        m11810b();
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        this.f11831c = i == 0;
        m11810b();
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f11831c = i == 0;
        m11810b();
    }

    /* renamed from: a */
    public final void mo40434a() {
        invalidate();
    }
}
