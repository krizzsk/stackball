package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.yandex.mobile.ads.impl.l50;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.wv */
public class C15118wv extends co1 implements C15334zo, dx0, bf1, l50 {

    /* renamed from: b */
    private C14215ov f42301b;

    /* renamed from: c */
    private cx0 f42302c;

    /* renamed from: d */
    private C15196xo f42303d;

    /* renamed from: e */
    private boolean f42304e;

    /* renamed from: f */
    private final List<C15055wl> f42305f;

    /* renamed from: g */
    private boolean f42306g;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C15118wv(Context context) {
        this(context, (AttributeSet) null, 0, 6);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C15118wv(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15118wv(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: a */
    public List<C15055wl> mo65869a() {
        return this.f42305f;
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
        return this.f42304e;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f42306g) {
            super.dispatchDraw(canvas);
            return;
        }
        C15196xo xoVar = this.f42303d;
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
        this.f42306g = true;
        C15196xo xoVar = this.f42303d;
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
        this.f42306g = false;
    }

    /* renamed from: e */
    public C14215ov mo70763e() {
        return this.f42301b;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        Intrinsics.checkNotNullParameter(motionEvent, "event");
        cx0 cx0 = this.f42302c;
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
        C15196xo xoVar = this.f42303d;
        if (xoVar != null) {
            xoVar.mo70927a(i, i2);
        }
    }

    public void release() {
        mo65871b();
        C15196xo xoVar = this.f42303d;
        if (xoVar != null) {
            xoVar.mo65871b();
        }
    }

    public void setBorder(C15066wo woVar, j50 j50) {
        Intrinsics.checkNotNullParameter(j50, "resolver");
        C15196xo xoVar = this.f42303d;
        C15196xo xoVar2 = null;
        if (!Intrinsics.areEqual((Object) woVar, (Object) xoVar == null ? null : xoVar.mo70930d())) {
            C15196xo xoVar3 = this.f42303d;
            if (xoVar3 != null) {
                xoVar3.mo65871b();
            }
            if (woVar != null) {
                DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
                xoVar2 = new C15196xo(displayMetrics, this, j50, woVar);
            }
            this.f42303d = xoVar2;
            invalidate();
        }
    }

    public void setCurrentItem$div_release(int i) {
        mo66339d().setCurrentItem(i, false);
    }

    public void setDiv$div_release(C14215ov ovVar) {
        this.f42301b = ovVar;
    }

    public void setOnInterceptTouchEventListener(cx0 cx0) {
        this.f42302c = cx0;
    }

    public void setTransient(boolean z) {
        this.f42304e = z;
        invalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15118wv(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f42305f = new ArrayList();
    }
}
