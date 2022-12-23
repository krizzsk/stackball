package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import com.yandex.mobile.ads.impl.l50;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.sv */
public final class C14633sv extends yx0 implements C15334zo, bf1, l50 {

    /* renamed from: f */
    private C15107wt f40132f;

    /* renamed from: g */
    private C15196xo f40133g;

    /* renamed from: h */
    private boolean f40134h;

    /* renamed from: i */
    private final List<C15055wl> f40135i;

    /* renamed from: j */
    private boolean f40136j;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C14633sv(Context context) {
        this(context, (AttributeSet) null, 0, 6);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C14633sv(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14633sv(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: a */
    public List<C15055wl> mo65869a() {
        return this.f40135i;
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
        return this.f40134h;
    }

    /* renamed from: d */
    public final C15107wt mo70057d() {
        return this.f40132f;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f40136j) {
            super.dispatchDraw(canvas);
            return;
        }
        C15196xo xoVar = this.f40133g;
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
        this.f40136j = true;
        C15196xo xoVar = this.f40133g;
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
        this.f40136j = false;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C15196xo xoVar = this.f40133g;
        if (xoVar != null) {
            xoVar.mo70927a(i, i2);
        }
    }

    public void release() {
        mo65871b();
        C15196xo xoVar = this.f40133g;
        if (xoVar != null) {
            xoVar.mo65871b();
        }
    }

    public void setBorder(C15066wo woVar, j50 j50) {
        Intrinsics.checkNotNullParameter(j50, "resolver");
        C15196xo xoVar = this.f40133g;
        C15196xo xoVar2 = null;
        if (!Intrinsics.areEqual((Object) woVar, (Object) xoVar == null ? null : xoVar.mo70930d())) {
            C15196xo xoVar3 = this.f40133g;
            if (xoVar3 != null) {
                xoVar3.mo65871b();
            }
            if (woVar != null) {
                DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
                xoVar2 = new C15196xo(displayMetrics, this, j50, woVar);
            }
            this.f40133g = xoVar2;
            invalidate();
        }
    }

    public final void setDiv$div_release(C15107wt wtVar) {
        this.f40132f = wtVar;
    }

    public void setTransient(boolean z) {
        this.f40134h = z;
        invalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14633sv(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f40135i = new ArrayList();
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
    }
}
