package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.environment.C5527g;
import com.ironsource.sdk.controller.C5923w;
import com.ironsource.sdk.p152i.C6023a;
import com.ironsource.sdk.p153j.C6035g;

/* renamed from: com.ironsource.sdk.controller.i */
public final class C5890i extends FrameLayout implements C6035g {

    /* renamed from: a */
    Context f14392a;

    /* renamed from: b */
    C5923w f14393b;

    public C5890i(Context context) {
        super(context);
        this.f14392a = context;
        setClickable(true);
    }

    /* renamed from: a */
    static /* synthetic */ ViewGroup m14535a(C5890i iVar) {
        Activity activity = (Activity) iVar.f14392a;
        if (activity != null) {
            return (ViewGroup) activity.getWindow().getDecorView();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo42304a() {
        int identifier;
        try {
            if (this.f14392a == null || (identifier = this.f14392a.getResources().getIdentifier("status_bar_height", "dimen", "android")) <= 0) {
                return 0;
            }
            return this.f14392a.getResources().getDimensionPixelSize(identifier);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo42305b() {
        Activity activity = (Activity) this.f14392a;
        try {
            if (Build.VERSION.SDK_INT > 9) {
                Rect rect = new Rect();
                activity.getWindow().getDecorView().getDrawingRect(rect);
                Rect rect2 = new Rect();
                activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
                if (C5527g.m13167p(activity) == 1) {
                    if (rect.bottom - rect2.bottom > 0) {
                        return rect.bottom - rect2.bottom;
                    }
                    return 0;
                } else if (rect.right - rect2.right > 0) {
                    return rect.right - rect2.right;
                }
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f14393b.mo42348j();
        this.f14393b.mo42339a(true, "main");
    }

    public final boolean onBackButtonPressed() {
        new C6023a();
        return C6023a.m14869a((Activity) this.f14392a);
    }

    public final void onCloseRequested() {
        ((Activity) this.f14392a).runOnUiThread(new Runnable() {
            public final void run() {
                ViewGroup a = C5890i.m14535a(C5890i.this);
                if (a != null) {
                    a.removeView(C5890i.this);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f14393b.mo42347i();
        this.f14393b.mo42339a(false, "main");
        C5923w wVar = this.f14393b;
        if (wVar != null) {
            wVar.f14510j = C5923w.C5973g.Gone;
            this.f14393b.f14514n = null;
            this.f14393b.f14524x = null;
        }
        removeAllViews();
    }

    public final void onOrientationChanged(String str, int i) {
    }
}
