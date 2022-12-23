package com.yandex.mobile.ads.impl;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

public class q91 extends View {

    /* renamed from: a */
    private final n91 f39031a;

    /* renamed from: b */
    private final bw0<C14369b> f39032b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ValueAnimator f39033c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ValueAnimator f39034d;

    /* renamed from: e */
    private final C14371d f39035e;

    /* renamed from: f */
    private final C14372e f39036f;

    /* renamed from: g */
    private long f39037g;

    /* renamed from: h */
    private AccelerateDecelerateInterpolator f39038h;

    /* renamed from: i */
    private boolean f39039i;

    /* renamed from: j */
    private float f39040j;

    /* renamed from: k */
    private float f39041k;

    /* renamed from: l */
    private Drawable f39042l;

    /* renamed from: m */
    private Drawable f39043m;

    /* renamed from: n */
    private Drawable f39044n;

    /* renamed from: o */
    private Drawable f39045o;

    /* renamed from: p */
    private float f39046p;

    /* renamed from: q */
    private Drawable f39047q;

    /* renamed from: r */
    private md1 f39048r;

    /* renamed from: s */
    private Float f39049s;

    /* renamed from: t */
    private Drawable f39050t;

    /* renamed from: u */
    private md1 f39051u;

    /* renamed from: v */
    private int f39052v;

    /* renamed from: w */
    private int f39053w;

    /* renamed from: x */
    private final C14368a f39054x;

    /* renamed from: y */
    private C14370c f39055y;

    /* renamed from: z */
    private boolean f39056z;

    /* renamed from: com.yandex.mobile.ads.impl.q91$a */
    private final class C14368a {

        /* renamed from: a */
        final /* synthetic */ q91 f39057a;

        public C14368a(q91 q91) {
            Intrinsics.checkNotNullParameter(q91, "this$0");
            this.f39057a = q91;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.q91$b */
    public interface C14369b {

        /* renamed from: com.yandex.mobile.ads.impl.q91$b$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$a(C14369b bVar, float f) {
            }

            public static void $default$a(C14369b bVar, Float f) {
            }
        }

        /* renamed from: a */
        void mo69549a(float f);

        /* renamed from: a */
        void mo69550a(Float f);
    }

    /* renamed from: com.yandex.mobile.ads.impl.q91$c */
    private enum C14370c {
        THUMB,
        THUMB_SECONDARY
    }

    /* renamed from: com.yandex.mobile.ads.impl.q91$d */
    public static final class C14371d implements Animator.AnimatorListener {

        /* renamed from: a */
        private float f39061a;

        /* renamed from: b */
        private boolean f39062b;

        /* renamed from: c */
        final /* synthetic */ q91 f39063c;

        C14371d(q91 q91) {
            this.f39063c = q91;
        }

        /* renamed from: a */
        public final float mo69551a() {
            return this.f39061a;
        }

        public void onAnimationCancel(Animator animator) {
            this.f39062b = true;
        }

        public void onAnimationEnd(Animator animator) {
            this.f39063c.f39033c = null;
            if (!this.f39062b) {
                this.f39063c.m41136a(Float.valueOf(this.f39061a), this.f39063c.mo69527g());
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            this.f39062b = false;
        }

        /* renamed from: a */
        public final void mo69552a(float f) {
            this.f39061a = f;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.q91$e */
    public static final class C14372e implements Animator.AnimatorListener {

        /* renamed from: a */
        private Float f39064a;

        /* renamed from: b */
        private boolean f39065b;

        /* renamed from: c */
        final /* synthetic */ q91 f39066c;

        C14372e(q91 q91) {
            this.f39066c = q91;
        }

        /* renamed from: a */
        public final Float mo69557a() {
            return this.f39064a;
        }

        public void onAnimationCancel(Animator animator) {
            this.f39065b = true;
        }

        public void onAnimationEnd(Animator animator) {
            this.f39066c.f39034d = null;
            if (!this.f39065b) {
                q91 q91 = this.f39066c;
                q91.m41137a(this.f39064a, q91.mo69526f());
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            this.f39065b = false;
        }

        /* renamed from: a */
        public final void mo69558a(Float f) {
            this.f39064a = f;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public q91(Context context) {
        this(context, (AttributeSet) null, 0, 6);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public q91(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q91(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final void m41142c(q91 q91, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(q91, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue != null) {
            q91.f39049s = Float.valueOf(((Float) animatedValue).floatValue());
            q91.postInvalidateOnAnimation();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m41143d(q91 q91, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(q91, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue != null) {
            q91.f39046p = ((Float) animatedValue).floatValue();
            q91.postInvalidateOnAnimation();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r0 = r0.getBounds();
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m41144e() {
        /*
            r4 = this;
            int r0 = r4.f39053w
            r1 = -1
            if (r0 != r1) goto L_0x0057
            android.graphics.drawable.Drawable r0 = r4.f39042l
            r1 = 0
            if (r0 != 0) goto L_0x000b
            goto L_0x0011
        L_0x000b:
            android.graphics.Rect r0 = r0.getBounds()
            if (r0 != 0) goto L_0x0013
        L_0x0011:
            r0 = 0
            goto L_0x0017
        L_0x0013:
            int r0 = r0.width()
        L_0x0017:
            android.graphics.drawable.Drawable r2 = r4.f39043m
            if (r2 != 0) goto L_0x001c
            goto L_0x0022
        L_0x001c:
            android.graphics.Rect r2 = r2.getBounds()
            if (r2 != 0) goto L_0x0024
        L_0x0022:
            r2 = 0
            goto L_0x0028
        L_0x0024:
            int r2 = r2.width()
        L_0x0028:
            int r0 = java.lang.Math.max(r0, r2)
            android.graphics.drawable.Drawable r2 = r4.f39047q
            if (r2 != 0) goto L_0x0031
            goto L_0x0037
        L_0x0031:
            android.graphics.Rect r2 = r2.getBounds()
            if (r2 != 0) goto L_0x0039
        L_0x0037:
            r2 = 0
            goto L_0x003d
        L_0x0039:
            int r2 = r2.width()
        L_0x003d:
            android.graphics.drawable.Drawable r3 = r4.f39050t
            if (r3 != 0) goto L_0x0042
            goto L_0x004d
        L_0x0042:
            android.graphics.Rect r3 = r3.getBounds()
            if (r3 != 0) goto L_0x0049
            goto L_0x004d
        L_0x0049:
            int r1 = r3.width()
        L_0x004d:
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            r4.f39053w = r0
        L_0x0057:
            int r0 = r4.f39053w
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.q91.m41144e():int");
    }

    /* renamed from: h */
    private final boolean m41145h() {
        return this.f39049s != null;
    }

    /* renamed from: i */
    private final void m41146i() {
        m41131a(m41129a(this.f39046p), false, true);
        if (m41145h()) {
            Float f = this.f39049s;
            m41138a(f == null ? null : Float.valueOf(m41129a(f.floatValue())), false, true);
        }
    }

    /* renamed from: j */
    private final void m41147j() {
        m41131a((float) MathKt.roundToInt(this.f39046p), false, true);
        Float f = this.f39049s;
        if (f != null) {
            m41138a(Float.valueOf((float) MathKt.roundToInt(f.floatValue())), false, true);
        }
    }

    public static /* synthetic */ void setThumbSecondaryValue$default(q91 q91, Float f, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = q91.f39039i;
            }
            q91.setThumbSecondaryValue(f, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setThumbSecondaryValue");
    }

    public static /* synthetic */ void setThumbValue$default(q91 q91, float f, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = q91.f39039i;
            }
            q91.setThumbValue(f, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setThumbValue");
    }

    /* renamed from: f */
    public final Float mo69526f() {
        return this.f39049s;
    }

    /* renamed from: g */
    public final float mo69527g() {
        return this.f39046p;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.getBounds();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getSuggestedMinimumHeight() {
        /*
            r7 = this;
            android.graphics.drawable.Drawable r0 = r7.f39044n
            r1 = 0
            if (r0 != 0) goto L_0x0006
            goto L_0x000c
        L_0x0006:
            android.graphics.Rect r0 = r0.getBounds()
            if (r0 != 0) goto L_0x000e
        L_0x000c:
            r0 = 0
            goto L_0x0012
        L_0x000e:
            int r0 = r0.height()
        L_0x0012:
            android.graphics.drawable.Drawable r2 = r7.f39045o
            if (r2 != 0) goto L_0x0017
            goto L_0x001d
        L_0x0017:
            android.graphics.Rect r2 = r2.getBounds()
            if (r2 != 0) goto L_0x001f
        L_0x001d:
            r2 = 0
            goto L_0x0023
        L_0x001f:
            int r2 = r2.height()
        L_0x0023:
            int r0 = java.lang.Math.max(r0, r2)
            int r0 = r0 / 2
            android.graphics.drawable.Drawable r2 = r7.f39047q
            if (r2 != 0) goto L_0x002e
            goto L_0x0034
        L_0x002e:
            android.graphics.Rect r2 = r2.getBounds()
            if (r2 != 0) goto L_0x0036
        L_0x0034:
            r2 = 0
            goto L_0x003a
        L_0x0036:
            int r2 = r2.height()
        L_0x003a:
            android.graphics.drawable.Drawable r3 = r7.f39050t
            if (r3 != 0) goto L_0x003f
            goto L_0x0045
        L_0x003f:
            android.graphics.Rect r3 = r3.getBounds()
            if (r3 != 0) goto L_0x0047
        L_0x0045:
            r3 = 0
            goto L_0x004b
        L_0x0047:
            int r3 = r3.height()
        L_0x004b:
            int r2 = java.lang.Math.max(r2, r3)
            int r2 = r2 / 2
            int r0 = java.lang.Math.max(r2, r0)
            com.yandex.mobile.ads.impl.md1 r2 = r7.f39048r
            if (r2 != 0) goto L_0x005b
            r2 = 0
            goto L_0x005f
        L_0x005b:
            int r2 = r2.mo68651b()
        L_0x005f:
            com.yandex.mobile.ads.impl.md1 r3 = r7.f39048r
            if (r3 != 0) goto L_0x0065
            r3 = 0
            goto L_0x0069
        L_0x0065:
            int r3 = r3.mo68649a()
        L_0x0069:
            com.yandex.mobile.ads.impl.md1 r4 = r7.f39051u
            if (r4 != 0) goto L_0x006f
            r4 = 0
            goto L_0x0073
        L_0x006f:
            int r4 = r4.mo68651b()
        L_0x0073:
            com.yandex.mobile.ads.impl.md1 r5 = r7.f39051u
            if (r5 != 0) goto L_0x0078
            goto L_0x007c
        L_0x0078:
            int r1 = r5.mo68649a()
        L_0x007c:
            int r2 = r2 / 2
            int r5 = r2 - r3
            int r4 = r4 / 2
            int r6 = r4 - r1
            int r5 = java.lang.Math.max(r5, r6)
            int r5 = java.lang.Math.max(r0, r5)
            int r2 = r2 + r3
            int r4 = r4 + r1
            int r1 = java.lang.Math.max(r2, r4)
            int r0 = java.lang.Math.max(r0, r1)
            int r5 = r5 + r0
            int r1 = r5 / 2
            int r1 = r1 - r0
            r7.f39052v = r1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.q91.getSuggestedMinimumHeight():int");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r1 = r1.getBounds();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getSuggestedMinimumWidth() {
        /*
            r4 = this;
            float r0 = r4.f39041k
            float r1 = r4.f39040j
            float r0 = r0 - r1
            r1 = 1
            float r1 = (float) r1
            float r0 = r0 + r1
            int r0 = (int) r0
            android.graphics.drawable.Drawable r1 = r4.f39044n
            r2 = 0
            if (r1 != 0) goto L_0x000f
            goto L_0x0015
        L_0x000f:
            android.graphics.Rect r1 = r1.getBounds()
            if (r1 != 0) goto L_0x0017
        L_0x0015:
            r1 = 0
            goto L_0x001b
        L_0x0017:
            int r1 = r1.width()
        L_0x001b:
            int r1 = r1 * r0
            android.graphics.drawable.Drawable r3 = r4.f39045o
            if (r3 != 0) goto L_0x0022
            goto L_0x0028
        L_0x0022:
            android.graphics.Rect r3 = r3.getBounds()
            if (r3 != 0) goto L_0x002a
        L_0x0028:
            r3 = 0
            goto L_0x002e
        L_0x002a:
            int r3 = r3.width()
        L_0x002e:
            int r3 = r3 * r0
            int r0 = java.lang.Math.max(r1, r3)
            android.graphics.drawable.Drawable r1 = r4.f39047q
            if (r1 != 0) goto L_0x0039
            goto L_0x003f
        L_0x0039:
            android.graphics.Rect r1 = r1.getBounds()
            if (r1 != 0) goto L_0x0041
        L_0x003f:
            r1 = 0
            goto L_0x0045
        L_0x0041:
            int r1 = r1.width()
        L_0x0045:
            android.graphics.drawable.Drawable r3 = r4.f39050t
            if (r3 != 0) goto L_0x004a
            goto L_0x0050
        L_0x004a:
            android.graphics.Rect r3 = r3.getBounds()
            if (r3 != 0) goto L_0x0052
        L_0x0050:
            r3 = 0
            goto L_0x0056
        L_0x0052:
            int r3 = r3.width()
        L_0x0056:
            int r1 = java.lang.Math.max(r1, r3)
            int r0 = java.lang.Math.max(r1, r0)
            com.yandex.mobile.ads.impl.md1 r1 = r4.f39048r
            if (r1 != 0) goto L_0x0064
            r1 = 0
            goto L_0x0068
        L_0x0064:
            int r1 = r1.getIntrinsicWidth()
        L_0x0068:
            com.yandex.mobile.ads.impl.md1 r3 = r4.f39051u
            if (r3 != 0) goto L_0x006d
            goto L_0x0071
        L_0x006d:
            int r2 = r3.getIntrinsicWidth()
        L_0x0071:
            int r1 = java.lang.Math.max(r1, r2)
            int r0 = java.lang.Math.max(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.q91.getSuggestedMinimumWidth():int");
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        Drawable drawable;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(((float) getPaddingLeft()) + ((float) (m41144e() / 2)), ((float) getPaddingTop()) + ((float) this.f39052v));
        this.f39031a.mo68942a(canvas, this.f39045o);
        C14368a aVar = this.f39054x;
        if (!aVar.f39057a.m41145h()) {
            f = aVar.f39057a.f39040j;
        } else {
            q91 q91 = aVar.f39057a;
            float f3 = q91.f39046p;
            Float f4 = q91.f39049s;
            if (f4 == null) {
                f = f3;
            } else {
                f4.floatValue();
                f = Math.min(f3, f4.floatValue());
            }
        }
        C14368a aVar2 = this.f39054x;
        if (!aVar2.f39057a.m41145h()) {
            f2 = aVar2.f39057a.f39046p;
        } else {
            q91 q912 = aVar2.f39057a;
            float f5 = q912.f39046p;
            Float f6 = q912.f39049s;
            if (f6 == null) {
                f2 = f5;
            } else {
                f6.floatValue();
                f2 = Math.max(f5, f6.floatValue());
            }
        }
        this.f39031a.mo68944a(canvas, this.f39044n, m41140b(f), m41140b(f2));
        int i = (int) this.f39040j;
        int i2 = (int) this.f39041k;
        if (i <= i2) {
            while (true) {
                int i3 = i + 1;
                if (i <= ((int) f2) && ((int) f) <= i) {
                    drawable = this.f39042l;
                } else {
                    drawable = this.f39043m;
                }
                this.f39031a.mo68943a(canvas, drawable, m41140b((float) i));
                if (i == i2) {
                    break;
                }
                i = i3;
            }
        }
        n91 n91 = this.f39031a;
        int b = m41140b(this.f39046p);
        Drawable drawable2 = this.f39047q;
        int i4 = (int) this.f39046p;
        md1 md1 = this.f39048r;
        n91.getClass();
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        n91.mo68943a(canvas, drawable2, b);
        if (md1 != null) {
            md1.mo68650a(String.valueOf(i4));
            n91.mo68943a(canvas, md1, b);
        }
        if (m41145h()) {
            n91 n912 = this.f39031a;
            Float f7 = this.f39049s;
            Intrinsics.checkNotNull(f7);
            int b2 = m41140b(f7.floatValue());
            Drawable drawable3 = this.f39050t;
            Float f8 = this.f39049s;
            Intrinsics.checkNotNull(f8);
            int floatValue = (int) f8.floatValue();
            md1 md12 = this.f39051u;
            n912.getClass();
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            n912.mo68943a(canvas, drawable3, b2);
            if (md12 != null) {
                md12.mo68650a(String.valueOf(floatValue));
                n912.mo68943a(canvas, md12, b2);
            }
        }
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth() + getPaddingLeft() + getPaddingRight();
        int suggestedMinimumHeight = getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            suggestedMinimumWidth = Math.min(suggestedMinimumWidth, size);
        } else if (mode == 1073741824) {
            suggestedMinimumWidth = size;
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            suggestedMinimumHeight = Math.min(suggestedMinimumHeight, size2);
        } else if (mode2 == 1073741824) {
            suggestedMinimumHeight = size2;
        }
        setMeasuredDimension(suggestedMinimumWidth, suggestedMinimumHeight);
        this.f39031a.mo68941a(((suggestedMinimumWidth - getPaddingLeft()) - getPaddingRight()) - m41144e(), (suggestedMinimumHeight - getPaddingTop()) - getPaddingBottom());
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C14370c cVar;
        Intrinsics.checkNotNullParameter(motionEvent, "ev");
        if (!this.f39056z) {
            return false;
        }
        int x = (((int) motionEvent.getX()) - getPaddingLeft()) - (m41144e() / 2);
        int action = motionEvent.getAction();
        if (action == 0) {
            if (!m41145h()) {
                cVar = C14370c.THUMB;
            } else {
                int abs = Math.abs(x - m41140b(this.f39046p));
                Float f = this.f39049s;
                Intrinsics.checkNotNull(f);
                if (abs < Math.abs(x - m41140b(f.floatValue()))) {
                    cVar = C14370c.THUMB;
                } else {
                    cVar = C14370c.THUMB_SECONDARY;
                }
            }
            this.f39055y = cVar;
            m41132a(cVar, m41130a(x), this.f39039i);
            return true;
        } else if (action == 1) {
            m41132a(this.f39055y, m41130a(x), this.f39039i);
            return true;
        } else if (action != 2) {
            return false;
        } else {
            m41132a(this.f39055y, m41130a(x), false);
            getParent().requestDisallowInterceptTouchEvent(true);
            return true;
        }
    }

    public final void setActiveTickMarkDrawable(Drawable drawable) {
        this.f39042l = drawable;
        this.f39053w = -1;
        m41147j();
        invalidate();
    }

    public final void setActiveTrackDrawable(Drawable drawable) {
        this.f39044n = drawable;
        invalidate();
    }

    public final void setAnimationDuration(long j) {
        if (this.f39037g != j && j >= 0) {
            this.f39037g = j;
        }
    }

    public final void setAnimationEnabled(boolean z) {
        this.f39039i = z;
    }

    public final void setAnimationInterpolator(AccelerateDecelerateInterpolator accelerateDecelerateInterpolator) {
        Intrinsics.checkNotNullParameter(accelerateDecelerateInterpolator, "<set-?>");
        this.f39038h = accelerateDecelerateInterpolator;
    }

    public final void setInactiveTickMarkDrawable(Drawable drawable) {
        this.f39043m = drawable;
        this.f39053w = -1;
        m41147j();
        invalidate();
    }

    public final void setInactiveTrackDrawable(Drawable drawable) {
        this.f39045o = drawable;
        invalidate();
    }

    public final void setInteractive(boolean z) {
        this.f39056z = z;
    }

    public final void setMaxValue(float f) {
        if (!(this.f39041k == f)) {
            setMinValue(Math.min(this.f39040j, f - 1.0f));
            this.f39041k = f;
            m41146i();
            invalidate();
        }
    }

    public final void setMinValue(float f) {
        if (!(this.f39040j == f)) {
            setMaxValue(Math.max(this.f39041k, 1.0f + f));
            this.f39040j = f;
            m41146i();
            invalidate();
        }
    }

    public final void setThumbDrawable(Drawable drawable) {
        this.f39047q = drawable;
        this.f39053w = -1;
        invalidate();
    }

    public final void setThumbSecondTextDrawable(md1 md1) {
        this.f39051u = md1;
    }

    public final void setThumbSecondaryDrawable(Drawable drawable) {
        this.f39050t = drawable;
        this.f39053w = -1;
        invalidate();
    }

    public final void setThumbSecondaryValue(Float f, boolean z) {
        m41138a(f, z, true);
    }

    public final void setThumbTextDrawable(md1 md1) {
        this.f39048r = md1;
    }

    public final void setThumbValue(float f, boolean z) {
        m41131a(f, z, true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q91(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f39031a = new n91();
        this.f39032b = new bw0<>();
        this.f39035e = new C14371d(this);
        this.f39036f = new C14372e(this);
        this.f39037g = 300;
        this.f39038h = new AccelerateDecelerateInterpolator();
        this.f39039i = true;
        this.f39041k = 100.0f;
        this.f39046p = this.f39040j;
        this.f39053w = -1;
        this.f39054x = new C14368a(this);
        this.f39055y = C14370c.THUMB;
        this.f39056z = true;
    }

    /* renamed from: b */
    private final int m41140b(float f) {
        return (int) (((f - this.f39040j) * ((float) (((getWidth() - getPaddingLeft()) - getPaddingRight()) - m41144e()))) / (this.f39041k - this.f39040j));
    }

    /* renamed from: b */
    private final float m41139b(int i) {
        return ((((float) i) * (this.f39041k - this.f39040j)) / ((float) (((getWidth() - getPaddingLeft()) - getPaddingRight()) - m41144e()))) + this.f39040j;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m41136a(Float f, float f2) {
        if (!Intrinsics.areEqual(f, f2)) {
            for (C14369b a : this.f39032b) {
                a.mo69549a(f2);
            }
        }
    }

    /* renamed from: d */
    public final void mo69525d() {
        this.f39032b.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m41137a(Float f, Float f2) {
        if (!Intrinsics.areEqual(f, f2)) {
            for (C14369b a : this.f39032b) {
                a.mo69550a(f2);
            }
        }
    }

    /* renamed from: a */
    private final void m41138a(Float f, boolean z, boolean z2) {
        ValueAnimator valueAnimator;
        Float f2;
        Float valueOf = f == null ? null : Float.valueOf(m41129a(f.floatValue()));
        if (!Intrinsics.areEqual(this.f39049s, valueOf)) {
            if (!z || !this.f39039i || (f2 = this.f39049s) == null || valueOf == null) {
                if (z2 && (valueAnimator = this.f39034d) != null) {
                    valueAnimator.cancel();
                }
                if (z2 || this.f39034d == null) {
                    this.f39036f.mo69558a(this.f39049s);
                    this.f39049s = valueOf;
                    m41137a(this.f39036f.mo69557a(), this.f39049s);
                }
            } else {
                if (this.f39034d == null) {
                    this.f39036f.mo69558a(f2);
                }
                ValueAnimator valueAnimator2 = this.f39034d;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                Float f3 = this.f39049s;
                Intrinsics.checkNotNull(f3);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f3.floatValue(), valueOf.floatValue()});
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        q91.m41142c(q91.this, valueAnimator);
                    }
                });
                ofFloat.addListener(this.f39036f);
                Intrinsics.checkNotNullExpressionValue(ofFloat, "");
                ofFloat.setDuration(this.f39037g);
                ofFloat.setInterpolator(this.f39038h);
                ofFloat.start();
                this.f39034d = ofFloat;
            }
            invalidate();
        }
    }

    /* renamed from: a */
    public final void mo69524a(C14369b bVar) {
        Intrinsics.checkNotNullParameter(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f39032b.mo66132a(bVar);
    }

    /* renamed from: a */
    private final void m41132a(C14370c cVar, float f, boolean z) {
        int ordinal = cVar.ordinal();
        if (ordinal == 0) {
            m41131a(f, z, false);
        } else if (ordinal == 1) {
            m41138a(Float.valueOf(f), z, false);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    private final float m41130a(int i) {
        if (this.f39043m == null && this.f39042l == null) {
            return m41139b(i);
        }
        return (float) MathKt.roundToInt(m41139b(i));
    }

    /* renamed from: a */
    private final float m41129a(float f) {
        return Math.min(Math.max(f, this.f39040j), this.f39041k);
    }

    /* renamed from: a */
    private final void m41131a(float f, boolean z, boolean z2) {
        ValueAnimator valueAnimator;
        float min = Math.min(Math.max(f, this.f39040j), this.f39041k);
        float f2 = this.f39046p;
        if (!(f2 == min)) {
            if (!z || !this.f39039i) {
                if (z2 && (valueAnimator = this.f39033c) != null) {
                    valueAnimator.cancel();
                }
                if (z2 || this.f39033c == null) {
                    this.f39035e.mo69552a(this.f39046p);
                    this.f39046p = min;
                    m41136a(Float.valueOf(this.f39035e.mo69551a()), this.f39046p);
                }
            } else {
                if (this.f39033c == null) {
                    this.f39035e.mo69552a(f2);
                }
                ValueAnimator valueAnimator2 = this.f39033c;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f39046p, min});
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        q91.m41143d(q91.this, valueAnimator);
                    }
                });
                ofFloat.addListener(this.f39035e);
                Intrinsics.checkNotNullExpressionValue(ofFloat, "");
                ofFloat.setDuration(this.f39037g);
                ofFloat.setInterpolator(this.f39038h);
                ofFloat.start();
                this.f39033c = ofFloat;
            }
            invalidate();
        }
    }
}
