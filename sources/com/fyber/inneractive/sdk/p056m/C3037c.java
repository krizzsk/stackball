package com.fyber.inneractive.sdk.p056m;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.p056m.C3059g;
import com.fyber.inneractive.sdk.util.C3629aj;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.m.c */
public final class C3037c extends WebView {

    /* renamed from: a */
    C3038a f7481a;

    /* renamed from: b */
    private boolean f7482b = false;

    /* renamed from: c */
    private boolean f7483c;

    /* renamed from: d */
    private C3059g f7484d;

    /* renamed from: e */
    private final C3629aj f7485e = new C3629aj();

    /* renamed from: f */
    private int f7486f;

    /* renamed from: g */
    private int f7487g;

    /* renamed from: com.fyber.inneractive.sdk.m.c$a */
    public interface C3038a {
        /* renamed from: a */
        void mo18545a(boolean z);

        /* renamed from: o */
        void mo18597o();

        /* renamed from: p */
        void mo18598p();
    }

    C3037c() {
        super((Context) null);
    }

    C3037c(Context context) {
        super(context.getApplicationContext());
    }

    public final void setTapListener(C3059g.C3060a aVar) {
        this.f7484d = new C3059g(aVar, getContext());
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C3059g gVar = this.f7484d;
        if (gVar != null) {
            gVar.onTouch(this, motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            this.f7485e.mo19549a(motionEvent.getX(), motionEvent.getY());
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setListener(C3038a aVar) {
        this.f7481a = aVar;
    }

    public final boolean getIsVisible() {
        return this.f7483c;
    }

    public final void destroy() {
        try {
            super.destroy();
        } catch (Throwable unused) {
        }
        this.f7481a = null;
    }

    /* renamed from: a */
    public final void mo18579a(String str) {
        IAlog.m9034b("injecting JS: %s", str);
        if (str != null) {
            try {
                loadUrl("javascript:" + str);
            } catch (Exception unused) {
                IAlog.m9034b("Failed to inject JS", new Object[0]);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f7482b) {
            this.f7482b = true;
            C3038a aVar = this.f7481a;
            if (aVar != null) {
                aVar.mo18597o();
            }
            mo18580a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        mo18580a();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f7483c = false;
        if (this.f7482b) {
            this.f7482b = false;
            C3038a aVar = this.f7481a;
            if (aVar != null) {
                aVar.mo18598p();
            }
            mo18580a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        mo18580a();
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        IAlog.m9033a("onWindowFocusChanged with: %s", Boolean.valueOf(z));
        mo18580a();
    }

    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 8) {
            m7169a(false);
        } else {
            mo18580a();
        }
    }

    /* renamed from: a */
    public final boolean mo18580a() {
        boolean z = false;
        IAlog.m9033a("updateVisibility called - is = %s hwf = %s atw = %swinToken - %s app token - %s", Boolean.valueOf(isShown()), Boolean.valueOf(hasWindowFocus()), Boolean.valueOf(this.f7482b), getWindowToken(), getApplicationWindowToken());
        if (getWindowToken() != getApplicationWindowToken()) {
            if (getWindowVisibility() != 8 && isShown() && this.f7482b) {
                z = true;
            }
            return m7169a(z);
        }
        if (isShown() && hasWindowFocus() && this.f7482b) {
            z = true;
        }
        return m7169a(z);
    }

    /* renamed from: a */
    private boolean m7169a(boolean z) {
        if (z) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                Rect rect = new Rect();
                viewGroup.getHitRect(rect);
                if (!getLocalVisibleRect(rect) && getWindowToken() == getApplicationWindowToken()) {
                    IAlog.m9033a("updateVisibility - Cannot find local visible rect. Scrolled out?", new Object[0]);
                    z = false;
                }
            } else {
                IAlog.m9033a("updateVisibility - No parent available", new Object[0]);
            }
        }
        if (this.f7483c == z) {
            return false;
        }
        this.f7483c = z;
        C3038a aVar = this.f7481a;
        if (aVar != null) {
            aVar.mo18545a(z);
        }
        return true;
    }

    public final int getWidthDp() {
        return this.f7486f;
    }

    public final void setWidthDp(int i) {
        this.f7486f = i;
    }

    public final int getHeightDp() {
        return this.f7487g;
    }

    public final void setHeightDp(int i) {
        this.f7487g = i;
    }

    public final C3629aj getLastClickedLocation() {
        return this.f7485e;
    }
}
