package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.yandex.mobile.ads.impl.l50;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.ey */
public class C13016ey extends ca1 implements C15334zo, dx0, bf1, l50 {

    /* renamed from: c */
    private C15196xo f33181c;

    /* renamed from: d */
    private boolean f33182d;

    /* renamed from: e */
    private C13111fs f33183e;

    /* renamed from: f */
    private cx0 f33184f;

    /* renamed from: g */
    private final List<C15055wl> f33185g;

    /* renamed from: h */
    private boolean f33186h;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C13016ey(Context context) {
        this(context, (AttributeSet) null, 0, 6);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C13016ey(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13016ey(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: a */
    public List<C15055wl> mo65869a() {
        return this.f33185g;
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
    public boolean mo65872c() {
        return this.f33182d;
    }

    /* renamed from: d */
    public C13111fs mo66883d() {
        return this.f33183e;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f33186h) {
            super.dispatchDraw(canvas);
            return;
        }
        C15196xo xoVar = this.f33181c;
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
        this.f33186h = true;
        C15196xo xoVar = this.f33181c;
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
        this.f33186h = false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        Intrinsics.checkNotNullParameter(motionEvent, "event");
        cx0 cx0 = this.f33184f;
        if (cx0 == null) {
            z = false;
        } else {
            z = cx0.mo66357a(this, motionEvent);
        }
        if (z || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C15196xo xoVar = this.f33181c;
        if (xoVar != null) {
            xoVar.mo70927a(i, i2);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "event");
        cx0 cx0 = this.f33184f;
        if (cx0 != null) {
            cx0.mo66357a(this, motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void release() {
        mo65871b();
        C15196xo xoVar = this.f33181c;
        if (xoVar != null) {
            xoVar.mo65871b();
        }
    }

    public void setBorder(C15066wo woVar, j50 j50) {
        Intrinsics.checkNotNullParameter(j50, "resolver");
        C15196xo xoVar = this.f33181c;
        C15196xo xoVar2 = null;
        if (!Intrinsics.areEqual((Object) woVar, (Object) xoVar == null ? null : xoVar.mo70930d())) {
            C15196xo xoVar3 = this.f33181c;
            if (xoVar3 != null) {
                xoVar3.mo65871b();
            }
            if (woVar != null) {
                DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
                xoVar2 = new C15196xo(displayMetrics, this, j50, woVar);
            }
            this.f33181c = xoVar2;
            invalidate();
        }
    }

    public void setDiv(C13111fs fsVar) {
        this.f33183e = fsVar;
    }

    public void setOnInterceptTouchEventListener(cx0 cx0) {
        this.f33184f = cx0;
    }

    public void setTransient(boolean z) {
        this.f33182d = z;
        invalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13016ey(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f33185g = new ArrayList();
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
    }
}
