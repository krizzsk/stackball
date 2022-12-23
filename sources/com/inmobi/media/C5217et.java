package com.inmobi.media;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.inmobi.media.C5177ek;

/* renamed from: com.inmobi.media.et */
/* compiled from: ScrollableDeckPagesContainer */
class C5217et extends C5177ek implements ViewPager.OnPageChangeListener {

    /* renamed from: b */
    private static final String f11987b = C5217et.class.getSimpleName();

    /* renamed from: a */
    C5177ek.C5178a f11988a;

    /* renamed from: c */
    private ViewPager f11989c;

    /* renamed from: d */
    private Point f11990d = new Point();

    /* renamed from: e */
    private Point f11991e = new Point();

    /* renamed from: f */
    private boolean f11992f;

    /* renamed from: g */
    private boolean f11993g = false;

    public C5217et(Context context) {
        super(context, (byte) 0);
        setClipChildren(false);
        setLayerType(1, (Paint) null);
        ViewPager viewPager = new ViewPager(getContext());
        this.f11989c = viewPager;
        viewPager.addOnPageChangeListener(this);
        addView(this.f11989c);
    }

    /* renamed from: a */
    public final void mo40473a(C5012bh bhVar, C5179el elVar, int i, int i2, C5177ek.C5178a aVar) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) C5198eq.m11897a(bhVar.mo40173a(0), (ViewGroup) this);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(20);
            layoutParams.setMarginEnd(20);
        } else {
            layoutParams.setMargins(20, 0, 20, 0);
        }
        layoutParams.gravity = i2;
        this.f11989c.setLayoutParams(layoutParams);
        this.f11989c.setAdapter((C5156ef) elVar);
        this.f11989c.setOffscreenPageLimit(2);
        this.f11989c.setPageMargin(16);
        this.f11989c.setCurrentItem(i);
        this.f11988a = aVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f11990d.x = i / 2;
        this.f11990d.y = i2 / 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getAction()
            if (r0 == 0) goto L_0x00b1
            r1 = 1
            if (r0 == r1) goto L_0x000b
            goto L_0x00c3
        L_0x000b:
            android.graphics.Point r0 = r8.f11991e
            int r0 = r0.x
            float r0 = (float) r0
            float r2 = r9.getX()
            androidx.viewpager.widget.ViewPager r3 = r8.f11989c
            int r3 = r3.getCurrentItem()
            androidx.viewpager.widget.ViewPager r4 = r8.f11989c
            androidx.viewpager.widget.PagerAdapter r4 = r4.getAdapter()
            int r4 = r4.getCount()
            androidx.viewpager.widget.ViewPager r5 = r8.f11989c
            int r5 = r5.getWidth()
            int r6 = r8.getWidth()
            r7 = 0
            if (r3 == 0) goto L_0x0060
            int r4 = r4 - r1
            if (r4 != r3) goto L_0x0035
            goto L_0x0060
        L_0x0035:
            int r1 = r6 - r5
            int r1 = r1 / 2
            float r1 = (float) r1
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x004b
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x004b
            float r1 = r1 - r2
            float r0 = (float) r5
            float r1 = r1 / r0
            double r0 = (double) r1
            double r0 = java.lang.Math.ceil(r0)
            goto L_0x0087
        L_0x004b:
            int r6 = r6 + r5
            int r6 = r6 / 2
            float r1 = (float) r6
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0089
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0089
            float r2 = r2 - r1
            float r0 = (float) r5
            float r2 = r2 / r0
            double r0 = (double) r2
            double r0 = java.lang.Math.ceil(r0)
            goto L_0x0074
        L_0x0060:
            int r6 = r6 - r5
            if (r3 != 0) goto L_0x0076
            float r1 = (float) r6
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0089
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0089
            float r2 = r2 - r1
            float r0 = (float) r5
            float r2 = r2 / r0
            double r0 = (double) r2
            double r0 = java.lang.Math.ceil(r0)
        L_0x0074:
            int r7 = (int) r0
            goto L_0x0089
        L_0x0076:
            float r1 = (float) r6
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0089
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0089
            float r1 = r1 - r2
            float r0 = (float) r5
            float r1 = r1 / r0
            double r0 = (double) r1
            double r0 = java.lang.Math.ceil(r0)
        L_0x0087:
            int r0 = (int) r0
            int r7 = -r0
        L_0x0089:
            if (r7 == 0) goto L_0x0099
            r0 = 3
            r9.setAction(r0)
            androidx.viewpager.widget.ViewPager r0 = r8.f11989c
            int r1 = r0.getCurrentItem()
            int r1 = r1 + r7
            r0.setCurrentItem(r1)
        L_0x0099:
            android.graphics.Point r0 = r8.f11990d
            int r0 = r0.x
            android.graphics.Point r1 = r8.f11991e
            int r1 = r1.x
            int r0 = r0 - r1
            float r0 = (float) r0
            android.graphics.Point r1 = r8.f11990d
            int r1 = r1.y
            android.graphics.Point r2 = r8.f11991e
            int r2 = r2.y
            int r1 = r1 - r2
            float r1 = (float) r1
            r9.offsetLocation(r0, r1)
            goto L_0x00da
        L_0x00b1:
            android.graphics.Point r0 = r8.f11991e
            float r1 = r9.getX()
            int r1 = (int) r1
            r0.x = r1
            android.graphics.Point r0 = r8.f11991e
            float r1 = r9.getY()
            int r1 = (int) r1
            r0.y = r1
        L_0x00c3:
            android.graphics.Point r0 = r8.f11990d
            int r0 = r0.x
            android.graphics.Point r1 = r8.f11991e
            int r1 = r1.x
            int r0 = r0 - r1
            float r0 = (float) r0
            android.graphics.Point r1 = r8.f11990d
            int r1 = r1.y
            android.graphics.Point r2 = r8.f11991e
            int r2 = r2.y
            int r1 = r1 - r2
            float r1 = (float) r1
            r9.offsetLocation(r0, r1)
        L_0x00da:
            androidx.viewpager.widget.ViewPager r0 = r8.f11989c
            boolean r9 = r0.dispatchTouchEvent(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5217et.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onPageScrolled(int i, float f, int i2) {
        if (this.f11992f) {
            invalidate();
        }
    }

    public void onPageSelected(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f11989c.getLayoutParams();
        C5177ek.C5178a aVar = this.f11988a;
        if (aVar != null) {
            layoutParams.gravity = aVar.mo40455a(i);
            this.f11989c.requestLayout();
        }
    }

    public void onPageScrollStateChanged(int i) {
        this.f11992f = i != 0;
    }
}
