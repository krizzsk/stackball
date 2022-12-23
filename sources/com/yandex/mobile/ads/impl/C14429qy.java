package com.yandex.mobile.ads.impl;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.GestureDetectorCompat;
import com.tapjoy.TJAdUnitConstants;
import com.yandex.mobile.ads.impl.l50;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.qy */
public final class C14429qy extends FrameLayout implements C15334zo, l50 {

    /* renamed from: a */
    private C14729ty f39318a;

    /* renamed from: b */
    private final C14430a f39319b;

    /* renamed from: c */
    private final GestureDetectorCompat f39320c;

    /* renamed from: d */
    private Function0<Unit> f39321d;

    /* renamed from: e */
    private C13358hy f39322e;

    /* renamed from: f */
    private C15177xl f39323f;

    /* renamed from: g */
    private C15196xo f39324g;

    /* renamed from: h */
    private final List<C15055wl> f39325h;

    /* renamed from: i */
    private boolean f39326i;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C14429qy(Context context) {
        this(context, (AttributeSet) null, 0, 6);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C14429qy(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14429qy(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: a */
    public List<C15055wl> mo65869a() {
        return this.f39325h;
    }

    /* renamed from: a */
    public /* synthetic */ void mo65870a(C15055wl wlVar) {
        l50.CC.$default$a(this, wlVar);
    }

    /* renamed from: b */
    public /* synthetic */ void mo65871b() {
        l50.CC.$default$b(this);
    }

    /* renamed from: c */
    public final C15177xl mo69657c() {
        return this.f39323f;
    }

    public boolean canScrollHorizontally(int i) {
        if (super.canScrollHorizontally(i)) {
            return true;
        }
        if (getChildCount() < 1 || this.f39321d == null) {
            return super.canScrollHorizontally(i);
        }
        View childAt = getChildAt(0);
        if (i < 0) {
            if (childAt.getTranslationX() <= ((float) childAt.getWidth())) {
                return true;
            }
        } else if ((-childAt.getTranslationX()) <= ((float) childAt.getWidth())) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final C13358hy mo69659d() {
        return this.f39322e;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f39326i) {
            super.dispatchDraw(canvas);
            return;
        }
        C15196xo xoVar = this.f39324g;
        if (xoVar != null) {
            int save = canvas.save();
            try {
                xoVar.mo70928a(canvas);
                super.dispatchDraw(canvas);
                xoVar.mo70929b(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        } else {
            super.dispatchDraw(canvas);
        }
    }

    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.f39326i = true;
        C15196xo xoVar = this.f39324g;
        if (xoVar != null) {
            int save = canvas.save();
            try {
                xoVar.mo70928a(canvas);
                super.draw(canvas);
                xoVar.mo70929b(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        } else {
            super.draw(canvas);
        }
        this.f39326i = false;
    }

    /* renamed from: e */
    public final C14729ty mo69662e() {
        return this.f39318a;
    }

    /* renamed from: f */
    public final String mo69663f() {
        C14729ty tyVar = this.f39318a;
        if (tyVar == null) {
            return null;
        }
        return tyVar.mo70245a();
    }

    /* renamed from: g */
    public final Function0<Unit> mo69664g() {
        return this.f39321d;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "event");
        if (this.f39321d == null) {
            requestDisallowInterceptTouchEvent(false);
            return false;
        }
        this.f39320c.onTouchEvent(motionEvent);
        requestDisallowInterceptTouchEvent(this.f39319b.mo69673b());
        if (this.f39319b.mo69673b()) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C15196xo xoVar = this.f39324g;
        if (xoVar != null) {
            xoVar.mo70927a(i, i2);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "event");
        if (this.f39321d == null) {
            requestDisallowInterceptTouchEvent(false);
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.f39319b.mo69672a();
        }
        if (this.f39320c.onTouchEvent(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void release() {
        mo65871b();
        C15196xo xoVar = this.f39324g;
        if (xoVar != null) {
            xoVar.mo65871b();
        }
    }

    public final void setActiveStateDiv$div_release(C15177xl xlVar) {
        this.f39323f = xlVar;
    }

    public void setBorder(C15066wo woVar, j50 j50) {
        Intrinsics.checkNotNullParameter(j50, "resolver");
        C15196xo xoVar = this.f39324g;
        C15196xo xoVar2 = null;
        if (!Intrinsics.areEqual((Object) woVar, (Object) xoVar == null ? null : xoVar.mo70930d())) {
            C15196xo xoVar3 = this.f39324g;
            if (xoVar3 != null) {
                xoVar3.mo65871b();
            }
            if (woVar != null) {
                DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
                xoVar2 = new C15196xo(displayMetrics, this, j50, woVar);
            }
            this.f39324g = xoVar2;
            invalidate();
        }
    }

    public final void setDivState$div_release(C13358hy hyVar) {
        this.f39322e = hyVar;
    }

    public final void setPath(C14729ty tyVar) {
        this.f39318a = tyVar;
    }

    public final void setSwipeOutCallback(Function0<Unit> function0) {
        this.f39321d = function0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14429qy(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        C14430a aVar = new C14430a(this);
        this.f39319b = aVar;
        this.f39320c = new GestureDetectorCompat(context, aVar, new Handler(Looper.getMainLooper()));
        this.f39325h = new ArrayList();
    }

    /* renamed from: com.yandex.mobile.ads.impl.qy$a */
    private final class C14430a extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        final /* synthetic */ C14429qy f39327a;

        /* renamed from: com.yandex.mobile.ads.impl.qy$a$a */
        public static final class C14431a extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ C14429qy f39328a;

            C14431a(C14429qy qyVar) {
                this.f39328a = qyVar;
            }

            public void onAnimationEnd(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, TJAdUnitConstants.String.SPLIT_VIEW_ANIMATION);
                Function0<Unit> g = this.f39328a.mo69664g();
                if (g != null) {
                    g.invoke();
                }
            }
        }

        public C14430a(C14429qy qyVar) {
            Intrinsics.checkNotNullParameter(qyVar, "this$0");
            this.f39327a = qyVar;
        }

        /* renamed from: c */
        private final View m41455c() {
            if (this.f39327a.getChildCount() > 0) {
                return this.f39327a.getChildAt(0);
            }
            return null;
        }

        /* renamed from: a */
        public final void mo69672a() {
            C14431a aVar;
            float f;
            float f2;
            View c = m41455c();
            if (c != null) {
                if (Math.abs(c.getTranslationX()) > ((float) (c.getWidth() / 2))) {
                    f2 = (Math.abs(((float) c.getWidth()) - c.getTranslationX()) * 300.0f) / ((float) c.getWidth());
                    f = Math.signum(c.getTranslationX()) * ((float) c.getWidth());
                    aVar = new C14431a(this.f39327a);
                } else {
                    f2 = (Math.abs(c.getTranslationX()) * 300.0f) / ((float) c.getWidth());
                    aVar = null;
                    f = 0.0f;
                }
                c.animate().cancel();
                c.animate().setDuration((long) MathUtils.clamp(f2, 0.0f, 300.0f)).translationX(f).setListener(aVar).start();
            }
        }

        /* renamed from: b */
        public final boolean mo69673b() {
            View c = m41455c();
            return !((c == null ? 0.0f : c.getTranslationX()) == 0.0f);
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            Intrinsics.checkNotNullParameter(motionEvent, "e1");
            Intrinsics.checkNotNullParameter(motionEvent2, "e2");
            View c = m41455c();
            boolean z = false;
            if (c == null) {
                return false;
            }
            int signum = (int) Math.signum(f);
            if ((c.getTranslationX() == 0.0f) && Math.abs(f) > ((float) 2) * Math.abs(f2) && m41454a(c, motionEvent.getX(), motionEvent.getY(), signum)) {
                return false;
            }
            c.setTranslationX(MathUtils.clamp(c.getTranslationX() - f, -((float) c.getWidth()), (float) c.getWidth()));
            if (c.getTranslationX() == 0.0f) {
                z = true;
            }
            return !z;
        }

        /* renamed from: a */
        private final boolean m41454a(View view, float f, float f2, int i) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount() - 1;
                if (childCount >= 0) {
                    while (true) {
                        int i2 = childCount - 1;
                        View childAt = viewGroup.getChildAt(childCount);
                        if (f >= ((float) childAt.getLeft()) && f < ((float) childAt.getRight()) && f2 >= ((float) childAt.getTop()) && f2 < ((float) childAt.getBottom())) {
                            Intrinsics.checkNotNullExpressionValue(childAt, "child");
                            if (m41454a(childAt, f - ((float) childAt.getLeft()), f2 - ((float) childAt.getTop()), i)) {
                                return true;
                            }
                        }
                        if (i2 < 0) {
                            break;
                        }
                        childCount = i2;
                    }
                }
            }
            return view.canScrollHorizontally(i);
        }
    }
}
