package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.webview.C6381a;

public class ProgressBar extends View implements C6381a {

    /* renamed from: a */
    Runnable f15823a = new Runnable() {
        public final void run() {
            ProgressBar.this.invalidate();
        }
    };

    /* renamed from: b */
    private Rect f15824b = new Rect();

    /* renamed from: c */
    private float f15825c;

    /* renamed from: d */
    private float f15826d = 0.95f;

    /* renamed from: e */
    private long f15827e;

    /* renamed from: f */
    private float f15828f;

    /* renamed from: g */
    private boolean f15829g;

    /* renamed from: h */
    private float f15830h;

    /* renamed from: i */
    private float f15831i;

    /* renamed from: j */
    private float f15832j;

    /* renamed from: k */
    private long f15833k;

    /* renamed from: l */
    private int f15834l;

    /* renamed from: m */
    private int f15835m;

    /* renamed from: n */
    private int f15836n;

    /* renamed from: o */
    private int f15837o;

    /* renamed from: p */
    private long f15838p = 25;

    /* renamed from: q */
    private Drawable f15839q;

    /* renamed from: r */
    private Drawable f15840r;

    /* renamed from: s */
    private Drawable f15841s;

    /* renamed from: t */
    private Drawable f15842t;

    /* renamed from: u */
    private boolean f15843u = false;

    /* renamed from: v */
    private C6381a.C6382a f15844v;

    /* renamed from: w */
    private Handler f15845w = new Handler(Looper.getMainLooper());

    /* renamed from: x */
    private boolean f15846x;

    /* renamed from: y */
    private boolean f15847y = false;

    public Bitmap getDrawingCache(boolean z) {
        return null;
    }

    public ProgressBar(Context context) {
        super(context);
        setWillNotDraw(false);
    }

    public ProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r10.f15846x != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r10.f15846x != false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        if (r10.f15846x != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        if (r10.f15846x != false) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r11) {
        /*
            r10 = this;
            boolean r0 = r10.f15843u
            r1 = 1
            if (r0 != 0) goto L_0x0007
            r10.f15843u = r1
        L_0x0007:
            long r2 = java.lang.System.currentTimeMillis()
            boolean r0 = r10.f15847y
            if (r0 == 0) goto L_0x0012
            r4 = 0
            goto L_0x0016
        L_0x0012:
            long r4 = r10.f15827e
            long r4 = r2 - r4
        L_0x0016:
            float r0 = (float) r4
            r6 = 1148846080(0x447a0000, float:1000.0)
            float r0 = r0 / r6
            float r0 = java.lang.Math.abs(r0)
            r10.f15828f = r0
            r10.f15827e = r2
            long r2 = r10.f15833k
            long r2 = r2 + r4
            r10.f15833k = r2
            boolean r0 = r10.f15829g
            r4 = 1045220557(0x3e4ccccd, float:0.2)
            r5 = 1028443341(0x3d4ccccd, float:0.05)
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 1053609165(0x3ecccccd, float:0.4)
            if (r0 != 0) goto L_0x005b
            r8 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0057
            int r0 = r10.f15836n
            if (r0 != r1) goto L_0x0045
            boolean r0 = r10.f15846x
            if (r0 == 0) goto L_0x0061
            goto L_0x005f
        L_0x0045:
            int r0 = r10.f15835m
            if (r0 != r1) goto L_0x0052
            boolean r0 = r10.f15846x
            if (r0 == 0) goto L_0x004e
            goto L_0x0061
        L_0x004e:
            r7 = 1045220557(0x3e4ccccd, float:0.2)
            goto L_0x0061
        L_0x0052:
            boolean r0 = r10.f15846x
            if (r0 == 0) goto L_0x0057
            goto L_0x004e
        L_0x0057:
            r7 = 1028443341(0x3d4ccccd, float:0.05)
            goto L_0x0061
        L_0x005b:
            boolean r0 = r10.f15846x
            if (r0 == 0) goto L_0x0061
        L_0x005f:
            r7 = 1065353216(0x3f800000, float:1.0)
        L_0x0061:
            r10.f15832j = r7
            float r0 = r10.f15831i
            float r1 = r10.f15828f
            float r7 = r7 * r1
            float r0 = r0 + r7
            r10.f15831i = r0
            boolean r1 = r10.f15829g
            if (r1 != 0) goto L_0x0078
            float r1 = r10.f15826d
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0078
            r10.f15831i = r1
        L_0x0078:
            android.graphics.Rect r0 = r10.f15824b
            float r1 = r10.f15831i
            float r2 = r10.f15825c
            float r1 = r1 * r2
            int r1 = (int) r1
            r0.right = r1
            android.os.Handler r0 = r10.f15845w
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            android.os.Handler r0 = r10.f15845w
            java.lang.Runnable r1 = r10.f15823a
            long r2 = r10.f15838p
            r0.postDelayed(r1, r2)
            super.draw(r11)
            float r0 = r10.f15828f
            boolean r1 = r10.f15829g
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x00d9
            float r1 = r10.f15830h
            float r7 = r10.f15825c
            r8 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 * r8
            float r1 = r1 / r7
            float r6 = r6 - r1
            r1 = 1132396544(0x437f0000, float:255.0)
            float r6 = r6 * r1
            int r1 = (int) r6
            if (r1 >= 0) goto L_0x00af
            r1 = 0
        L_0x00af:
            float r6 = r10.f15830h
            float r7 = r10.f15825c
            float r7 = r7 * r8
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x00bc
            r10.setVisible(r3)
        L_0x00bc:
            android.graphics.drawable.Drawable r6 = r10.f15840r
            if (r6 == 0) goto L_0x00c3
            r6.setAlpha(r1)
        L_0x00c3:
            android.graphics.drawable.Drawable r6 = r10.f15841s
            if (r6 == 0) goto L_0x00ca
            r6.setAlpha(r1)
        L_0x00ca:
            android.graphics.drawable.Drawable r6 = r10.f15839q
            if (r6 == 0) goto L_0x00d1
            r6.setAlpha(r1)
        L_0x00d1:
            r11.save()
            float r1 = r10.f15830h
            r11.translate(r1, r2)
        L_0x00d9:
            android.graphics.drawable.Drawable r1 = r10.f15840r
            if (r1 == 0) goto L_0x0101
            android.graphics.drawable.Drawable r1 = r10.f15839q
            if (r1 == 0) goto L_0x0101
            android.graphics.Rect r1 = r10.f15824b
            int r1 = r1.width()
            float r1 = (float) r1
            android.graphics.drawable.Drawable r6 = r10.f15839q
            int r6 = r6.getIntrinsicWidth()
            float r6 = (float) r6
            float r6 = r6 * r5
            float r1 = r1 - r6
            int r1 = (int) r1
            android.graphics.drawable.Drawable r5 = r10.f15840r
            int r6 = r5.getIntrinsicHeight()
            r5.setBounds(r3, r3, r1, r6)
            android.graphics.drawable.Drawable r1 = r10.f15840r
            r1.draw(r11)
        L_0x0101:
            boolean r1 = r10.f15829g
            if (r1 == 0) goto L_0x012a
            android.graphics.drawable.Drawable r1 = r10.f15841s
            if (r1 == 0) goto L_0x012a
            android.graphics.drawable.Drawable r5 = r10.f15839q
            if (r5 == 0) goto L_0x012a
            int r1 = r1.getIntrinsicWidth()
            android.graphics.drawable.Drawable r5 = r10.f15841s
            int r6 = r5.getIntrinsicHeight()
            r5.setBounds(r3, r3, r1, r6)
            r11.save()
            int r1 = -r1
            float r1 = (float) r1
            r11.translate(r1, r2)
            android.graphics.drawable.Drawable r1 = r10.f15841s
            r1.draw(r11)
            r11.restore()
        L_0x012a:
            android.graphics.drawable.Drawable r1 = r10.f15839q
            if (r1 == 0) goto L_0x0148
            r11.save()
            android.graphics.Rect r1 = r10.f15824b
            int r1 = r1.width()
            int r3 = r10.getWidth()
            int r1 = r1 - r3
            float r1 = (float) r1
            r11.translate(r1, r2)
            android.graphics.drawable.Drawable r1 = r10.f15839q
            r1.draw(r11)
            r11.restore()
        L_0x0148:
            boolean r1 = r10.f15829g
            if (r1 != 0) goto L_0x0194
            float r1 = r10.f15831i
            float r3 = r10.f15826d
            float r1 = r1 - r3
            float r1 = java.lang.Math.abs(r1)
            r3 = 925353388(0x3727c5ac, float:1.0E-5)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x0194
            android.graphics.drawable.Drawable r1 = r10.f15842t
            if (r1 == 0) goto L_0x0194
            int r3 = r10.f15834l
            float r3 = (float) r3
            float r0 = r0 * r4
            float r4 = r10.f15825c
            float r0 = r0 * r4
            float r3 = r3 + r0
            int r0 = (int) r3
            r10.f15834l = r0
            int r1 = r1.getIntrinsicWidth()
            int r0 = r0 + r1
            android.graphics.Rect r1 = r10.f15824b
            int r1 = r1.width()
            if (r0 < r1) goto L_0x0183
            android.graphics.drawable.Drawable r0 = r10.f15842t
            int r0 = r0.getIntrinsicWidth()
            int r0 = -r0
            r10.f15834l = r0
        L_0x0183:
            r11.save()
            int r0 = r10.f15834l
            float r0 = (float) r0
            r11.translate(r0, r2)
            android.graphics.drawable.Drawable r0 = r10.f15842t
            r0.draw(r11)
            r11.restore()
        L_0x0194:
            boolean r0 = r10.f15829g
            if (r0 == 0) goto L_0x019b
            r11.restore()
        L_0x019b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.webview.ProgressBar.draw(android.graphics.Canvas):void");
    }

    public void onThemeChange() {
        if (this.f15843u) {
            initResource(true);
        }
    }

    public void initResource(boolean z) {
        if (z || (this.f15842t == null && this.f15839q == null && this.f15840r == null && this.f15841s == null)) {
            Drawable drawable = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_highlight", "drawable", C6122a.m15302b().mo42884a()));
            this.f15842t = drawable;
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f15842t.getIntrinsicHeight());
            }
            Drawable drawable2 = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_head", "drawable", C6122a.m15302b().mo42884a()));
            this.f15839q = drawable2;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.f15839q.getIntrinsicHeight());
            }
            this.f15840r = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_tail", "drawable", C6122a.m15302b().mo42884a()));
            this.f15841s = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_end_animation", "drawable", C6122a.m15302b().mo42884a()));
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        Drawable drawable = this.f15842t;
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) (((double) drawable.getIntrinsicWidth()) * 1.5d), getHeight());
        }
        Drawable drawable2 = this.f15839q;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, getWidth(), getHeight());
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public void startEndAnimation() {
        if (!this.f15829g) {
            this.f15829g = true;
            this.f15830h = 0.0f;
        }
    }

    public void setProgress(float f, boolean z) {
        if (z && f >= 1.0f) {
            startEndAnimation();
        }
    }

    public void setVisible(boolean z) {
        if (z) {
            this.f15846x = true;
            this.f15827e = System.currentTimeMillis();
            this.f15828f = 0.0f;
            this.f15833k = 0;
            this.f15829g = false;
            this.f15830h = 0.0f;
            this.f15831i = 0.0f;
            this.f15825c = (float) getMeasuredWidth();
            this.f15847y = false;
            this.f15835m = 0;
            this.f15836n = 0;
            this.f15837o = 0;
            Drawable drawable = this.f15842t;
            if (drawable != null) {
                this.f15834l = -drawable.getIntrinsicWidth();
            } else {
                this.f15834l = 0;
            }
            Drawable drawable2 = this.f15840r;
            if (drawable2 != null) {
                drawable2.setAlpha(255);
            }
            Drawable drawable3 = this.f15841s;
            if (drawable3 != null) {
                drawable3.setAlpha(255);
            }
            Drawable drawable4 = this.f15839q;
            if (drawable4 != null) {
                drawable4.setAlpha(255);
            }
            setVisibility(0);
            invalidate();
            return;
        }
        setVisibility(4);
    }

    public float getProgress() {
        return this.f15831i;
    }

    public void setProgressBarListener(C6381a.C6382a aVar) {
        this.f15844v = aVar;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            C6381a.C6382a aVar = this.f15844v;
            if (aVar != null) {
                aVar.mo43997a(true);
                return;
            }
            return;
        }
        C6381a.C6382a aVar2 = this.f15844v;
        if (aVar2 != null) {
            aVar2.mo43997a(false);
        }
    }

    public void setProgressState(int i) {
        if (i == 5) {
            this.f15835m = 1;
            this.f15836n = 0;
            this.f15837o = 0;
            this.f15833k = 0;
        } else if (i == 6) {
            this.f15836n = 1;
            if (this.f15837o == 1) {
                startEndAnimation();
            }
            this.f15833k = 0;
        } else if (i == 7) {
            startEndAnimation();
        } else if (i == 8) {
            this.f15837o = 1;
            if (this.f15836n == 1) {
                startEndAnimation();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f15825c = (float) getMeasuredWidth();
    }

    public void setPaused(boolean z) {
        this.f15847y = z;
        if (!z) {
            this.f15827e = System.currentTimeMillis();
        }
    }
}
