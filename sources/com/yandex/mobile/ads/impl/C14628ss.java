package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Canvas;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.impl.l50;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.ss */
public class C14628ss extends lj0 implements C15334zo, bf1, l50 {

    /* renamed from: i */
    private C13885ls f40118i;

    /* renamed from: j */
    private Uri f40119j;

    /* renamed from: k */
    private C15196xo f40120k;

    /* renamed from: l */
    private boolean f40121l;

    /* renamed from: m */
    private final List<C15055wl> f40122m;

    /* renamed from: n */
    private boolean f40123n;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C14628ss(Context context) {
        this(context, (AttributeSet) null, 0, 6);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C14628ss(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14628ss(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: a */
    public List<C15055wl> mo65869a() {
        return this.f40122m;
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
        return this.f40121l;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f40123n) {
            super.dispatchDraw(canvas);
            return;
        }
        C15196xo xoVar = this.f40120k;
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
        this.f40123n = true;
        C15196xo xoVar = this.f40120k;
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
        this.f40123n = false;
    }

    /* renamed from: h */
    public final C13885ls mo70050h() {
        return this.f40118i;
    }

    /* renamed from: i */
    public final Uri mo70051i() {
        return this.f40119j;
    }

    /* renamed from: j */
    public void mo70052j() {
        setTag(C12066R.C12068id.image_loaded_flag, (Object) null);
        this.f40119j = null;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C15196xo xoVar = this.f40120k;
        if (xoVar != null) {
            xoVar.mo70927a(i, i2);
        }
    }

    public void release() {
        mo65871b();
        C15196xo xoVar = this.f40120k;
        if (xoVar != null) {
            xoVar.mo65871b();
        }
    }

    public void setBorder(C15066wo woVar, j50 j50) {
        Intrinsics.checkNotNullParameter(j50, "resolver");
        C15196xo xoVar = this.f40120k;
        C15196xo xoVar2 = null;
        if (!Intrinsics.areEqual((Object) woVar, (Object) xoVar == null ? null : xoVar.mo70930d())) {
            C15196xo xoVar3 = this.f40120k;
            if (xoVar3 != null) {
                xoVar3.mo65871b();
            }
            if (woVar != null) {
                DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
                xoVar2 = new C15196xo(displayMetrics, this, j50, woVar);
            }
            this.f40120k = xoVar2;
            invalidate();
        }
    }

    public final void setDiv$div_release(C13885ls lsVar) {
        this.f40118i = lsVar;
    }

    public final void setGifUrl$div_release(Uri uri) {
        this.f40119j = uri;
    }

    public void setTransient(boolean z) {
        this.f40121l = z;
        invalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14628ss(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f40122m = new ArrayList();
        setCropToPadding(true);
    }
}
