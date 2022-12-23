package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import com.yandex.mobile.ads.impl.l50;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.at */
public final class C12417at extends h90 implements C15334zo, bf1, l50 {

    /* renamed from: e */
    private C14924vs f30678e;

    /* renamed from: f */
    private k31 f30679f;

    /* renamed from: g */
    private C15196xo f30680g;

    /* renamed from: h */
    private boolean f30681h;

    /* renamed from: i */
    private final List<C15055wl> f30682i;

    /* renamed from: j */
    private boolean f30683j;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C12417at(Context context) {
        this(context, (AttributeSet) null, 0, 6);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C12417at(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12417at(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: a */
    public List<C15055wl> mo65869a() {
        return this.f30682i;
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
        return this.f30681h;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f30683j) {
            super.dispatchDraw(canvas);
            return;
        }
        C15196xo xoVar = this.f30680g;
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
        this.f30683j = true;
        C15196xo xoVar = this.f30680g;
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
        this.f30683j = false;
    }

    /* renamed from: g */
    public final C14924vs mo65875g() {
        return this.f30678e;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C15196xo xoVar = this.f30680g;
        if (xoVar != null) {
            xoVar.mo70927a(i, i2);
        }
    }

    public void onViewRemoved(View view) {
        Intrinsics.checkNotNullParameter(view, "child");
        super.onViewRemoved(view);
        k31 k31 = this.f30679f;
        if (k31 != null) {
            i10.m37254a(k31, view);
        }
    }

    public void release() {
        mo65871b();
        C15196xo xoVar = this.f30680g;
        if (xoVar != null) {
            xoVar.mo65871b();
        }
    }

    public void setBorder(C15066wo woVar, j50 j50) {
        Intrinsics.checkNotNullParameter(j50, "resolver");
        C15196xo xoVar = this.f30680g;
        C15196xo xoVar2 = null;
        if (!Intrinsics.areEqual((Object) woVar, (Object) xoVar == null ? null : xoVar.mo70930d())) {
            C15196xo xoVar3 = this.f30680g;
            if (xoVar3 != null) {
                xoVar3.mo65871b();
            }
            if (woVar != null) {
                DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
                xoVar2 = new C15196xo(displayMetrics, this, j50, woVar);
            }
            this.f30680g = xoVar2;
            invalidate();
        }
    }

    public final void setDiv$div_release(C14924vs vsVar) {
        this.f30678e = vsVar;
    }

    public final void setReleaseViewVisitor$div_release(k31 k31) {
        this.f30679f = k31;
    }

    public void setTransient(boolean z) {
        this.f30681h = z;
        invalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12417at(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30682i = new ArrayList();
    }
}
