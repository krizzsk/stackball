package com.fyber.inneractive.sdk.player.p083e;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.config.C2809u;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.C3629aj;
import com.fyber.inneractive.sdk.util.C3630ak;
import com.fyber.inneractive.sdk.util.C3657l;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.e.a */
public abstract class C3596a extends RelativeLayout implements C3600e {

    /* renamed from: a */
    protected final C3629aj f9789a;

    /* renamed from: b */
    protected int f9790b;

    /* renamed from: c */
    protected C2809u f9791c;

    /* renamed from: d */
    protected UnitDisplayType f9792d;

    /* renamed from: e */
    protected boolean f9793e;

    /* renamed from: f */
    protected boolean f9794f;

    /* renamed from: g */
    protected C3601f f9795g;

    /* renamed from: h */
    public boolean f9796h;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo19485a(C3630ak akVar, int i, int i2);

    public C3596a(Context context) {
        super(context, (AttributeSet) null, 0);
        this.f9789a = new C3629aj();
        this.f9790b = 0;
        this.f9793e = false;
        this.f9794f = false;
        this.f9796h = false;
        this.f9790b = Math.min(C3657l.m9133x(), C3657l.m9132w());
    }

    public void setListener(C3601f fVar) {
        this.f9795g = fVar;
    }

    public void setUnitConfig(C2809u uVar) {
        this.f9791c = uVar;
        this.f9792d = uVar.mo18067d() == null ? uVar.mo18070g().mo18080h() : UnitDisplayType.DEFAULT;
    }

    /* renamed from: a */
    public void mo19484a() {
        if (this.f9795g != null) {
            this.f9795g = null;
        }
    }

    /* renamed from: b */
    public final boolean mo19486b() {
        return this.f9793e;
    }

    /* renamed from: c */
    public final void mo19487c() {
        boolean z = isShown() && hasWindowFocus() && this.f9794f && !this.f9796h;
        if (z) {
            z = getGlobalVisibleRect(new Rect());
        }
        if (z != this.f9793e && this.f9795g != null) {
            IAlog.m9034b("%supdateVisibility changing to %s", IAlog.m9029a((Object) this), Boolean.valueOf(z));
            this.f9793e = z;
            this.f9795g.mo18808e(z);
        }
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (equals(view)) {
            IAlog.m9034b("%sgot onVisibilityChanged with %d", IAlog.m9029a((Object) this), Integer.valueOf(i));
            mo19487c();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        IAlog.m9034b("%sgot onWindowFocusChanged with: %s", IAlog.m9029a((Object) this), Boolean.valueOf(z));
        mo19487c();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        IAlog.m9034b("%sGot onAttachedToWindow: mIsAttached = %s", IAlog.m9029a((Object) this), Boolean.valueOf(this.f9794f));
        this.f9794f = true;
        C3601f fVar = this.f9795g;
        if (fVar != null) {
            fVar.mo18816l();
        }
        mo19487c();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        IAlog.m9034b("%sGot onDetachedFromWindow: mIsAttached = %s", IAlog.m9029a((Object) this), Boolean.valueOf(this.f9794f));
        this.f9794f = false;
        C3601f fVar = this.f9795g;
        if (fVar != null) {
            fVar.mo18845o();
        }
        mo19487c();
    }
}
