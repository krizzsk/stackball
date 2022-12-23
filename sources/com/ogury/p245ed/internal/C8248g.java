package com.ogury.p245ed.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.facebook.internal.NativeProtocol;
import com.ogury.p245ed.internal.C8507o;

/* renamed from: com.ogury.ed.internal.g */
public final class C8248g extends FrameLayout implements C8530p {

    /* renamed from: a */
    public static final C8249a f21355a = new C8249a((byte) 0);

    /* renamed from: b */
    private int f21356b;

    /* renamed from: c */
    private int f21357c;

    /* renamed from: d */
    private final C8058be f21358d = new C8058be();

    /* renamed from: e */
    private C8477n f21359e;

    /* renamed from: f */
    private C8350iz f21360f;

    /* renamed from: g */
    private C8432lk<? super C8248g, C8386ke> f21361g;

    /* renamed from: h */
    private C8432lk<? super C8248g, C8386ke> f21362h;

    /* renamed from: i */
    private C8431lj<C8386ke> f21363i;

    /* renamed from: j */
    private C8431lj<C8386ke> f21364j;

    /* renamed from: k */
    private C8431lj<C8386ke> f21365k;

    /* renamed from: l */
    private C8431lj<C8386ke> f21366l;

    /* renamed from: m */
    private C8431lj<C8386ke> f21367m;

    /* renamed from: n */
    private boolean f21368n;

    /* renamed from: o */
    private boolean f21369o;

    /* renamed from: p */
    private C8350iz f21370p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8248g(Context context) {
        super(context);
        C8467mq.m23881b(context, "context");
        C8507o.C8508a aVar = C8507o.f21720a;
        this.f21359e = C8507o.C8508a.m23935a();
        setLayoutParams(new FrameLayout.LayoutParams(600, 600));
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C8248g.m23166a(C8248g.this, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
    }

    public final int getContainerHeight() {
        return this.f21356b;
    }

    public final void setContainerHeight(int i) {
        this.f21356b = i;
    }

    public final int getContainerWidth() {
        return this.f21357c;
    }

    public final void setContainerWidth(int i) {
        this.f21357c = i;
    }

    public final C8350iz getResizeProps() {
        return this.f21360f;
    }

    public final void setResizeProps(C8350iz izVar) {
        this.f21360f = izVar;
    }

    public final C8432lk<C8248g, C8386ke> getAdLayoutChangeListener() {
        return this.f21361g;
    }

    public final void setAdLayoutChangeListener(C8432lk<? super C8248g, C8386ke> lkVar) {
        this.f21361g = lkVar;
    }

    public final C8432lk<C8248g, C8386ke> getOnMouseUpListener() {
        return this.f21362h;
    }

    public final void setOnMouseUpListener(C8432lk<? super C8248g, C8386ke> lkVar) {
        this.f21362h = lkVar;
    }

    public final C8431lj<C8386ke> getOnWindowGainFocusListener() {
        return this.f21363i;
    }

    public final void setOnWindowGainFocusListener(C8431lj<C8386ke> ljVar) {
        this.f21363i = ljVar;
    }

    public final C8431lj<C8386ke> getOnWindowLoseFocusListener() {
        return this.f21364j;
    }

    public final void setOnWindowLoseFocusListener(C8431lj<C8386ke> ljVar) {
        this.f21364j = ljVar;
    }

    public final C8431lj<C8386ke> getOnAttachToWindowListener() {
        return this.f21365k;
    }

    public final void setOnAttachToWindowListener(C8431lj<C8386ke> ljVar) {
        this.f21365k = ljVar;
    }

    public final C8431lj<C8386ke> getOnDetachFromWindowListener() {
        return this.f21366l;
    }

    public final void setOnDetachFromWindowListener(C8431lj<C8386ke> ljVar) {
        this.f21366l = ljVar;
    }

    public final C8431lj<C8386ke> getOnOverlayPositionChanged() {
        return this.f21367m;
    }

    public final void setOnOverlayPositionChanged(C8431lj<C8386ke> ljVar) {
        this.f21367m = ljVar;
    }

    public final void setDisplayedInFullScreen(boolean z) {
        this.f21368n = z;
    }

    public final boolean getContainsOverlayAd() {
        return this.f21369o;
    }

    public final void setContainsOverlayAd(boolean z) {
        this.f21369o = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m23166a(C8248g gVar, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C8467mq.m23881b(gVar, "this$0");
        C8432lk<C8248g, C8386ke> adLayoutChangeListener = gVar.getAdLayoutChangeListener();
        if (adLayoutChangeListener != null) {
            adLayoutChangeListener.mo53077a(gVar);
        }
    }

    /* renamed from: com.ogury.ed.internal.g$a */
    public static final class C8249a {
        public /* synthetic */ C8249a(byte b) {
            this();
        }

        private C8249a() {
        }
    }

    public final void setupDrag(boolean z) {
        C8507o.C8508a aVar = C8507o.f21720a;
        this.f21359e = C8507o.C8508a.m23936a(this, z);
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        C8467mq.m23881b(view, "child");
        C8467mq.m23881b(layoutParams, NativeProtocol.WEB_DIALOG_PARAMS);
        if (!(view instanceof WebView) || getChildCount() <= 0) {
            super.addView(view, layoutParams);
        } else {
            super.addView(view, getChildCount() - 1, layoutParams);
        }
    }

    /* renamed from: a */
    public final void mo53570a() {
        ViewGroup parentAsViewGroup = getParentAsViewGroup();
        if (parentAsViewGroup != null) {
            parentAsViewGroup.removeView(this);
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C8467mq.m23881b(motionEvent, "ev");
        if (this.f21359e.mo53982a(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: b */
    public final void mo53573b() {
        C8431lj<C8386ke> ljVar;
        C8432lk<? super C8248g, C8386ke> lkVar = this.f21362h;
        if (lkVar != null) {
            lkVar.mo53077a(this);
        }
        C8432lk<? super C8248g, C8386ke> lkVar2 = this.f21361g;
        if (lkVar2 != null) {
            lkVar2.mo53077a(this);
        }
        if (m23171i() && (ljVar = this.f21367m) != null) {
            ljVar.mo53190a();
        }
    }

    /* renamed from: c */
    public final void mo53574c() {
        m23167a(this.f21360f);
    }

    /* renamed from: a */
    public final void mo53571a(Rect rect) {
        m23167a(C8353ja.m23669a(this.f21360f, rect));
    }

    /* renamed from: a */
    private final void m23167a(C8350iz izVar) {
        if (izVar != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                setX((float) izVar.mo53786d());
                setY((float) izVar.mo53788e());
                layoutParams2.width = izVar.mo53782b();
                layoutParams2.height = izVar.mo53784c();
                layoutParams2.gravity = izVar.mo53791f();
                setLayoutParams(layoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    /* renamed from: h */
    private final void m23170h() {
        setX(0.0f);
        setY(0.0f);
    }

    /* renamed from: d */
    public final void mo53575d() {
        m23170h();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = -1;
            layoutParams2.height = -1;
            setLayoutParams(layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public final void setInitialSize(C8350iz izVar) {
        C8467mq.m23881b(izVar, "initialSize");
        this.f21370p = izVar;
        m23170h();
        m23167a(izVar);
    }

    public final void setInitialSizeWithoutResizing(C8350iz izVar) {
        C8467mq.m23881b(izVar, "initialSize");
        this.f21370p = izVar;
    }

    /* renamed from: e */
    public final void mo53577e() {
        m23170h();
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            if (this.f21369o) {
                this.f21360f = this.f21358d.mo53205a((View) viewGroup, this.f21370p);
            } else {
                this.f21360f = this.f21370p;
            }
            m23165a(viewGroup);
        }
    }

    /* renamed from: a */
    private final void m23165a(ViewGroup viewGroup) {
        setContainerWidth(viewGroup.getMeasuredWidth());
        setContainerHeight(viewGroup.getMeasuredHeight());
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ViewGroup parentAsViewGroup = getParentAsViewGroup();
        if (parentAsViewGroup != null) {
            if (m23171i()) {
                m23168b(parentAsViewGroup);
                C8431lj<C8386ke> ljVar = this.f21367m;
                if (ljVar != null) {
                    ljVar.mo53190a();
                }
            }
            m23165a(parentAsViewGroup);
        }
    }

    /* renamed from: i */
    private final boolean m23171i() {
        return !this.f21368n && this.f21369o;
    }

    /* renamed from: b */
    private final void m23168b(ViewGroup viewGroup) {
        if (getContainerHeight() != viewGroup.getMeasuredHeight() || getContainerWidth() != viewGroup.getMeasuredWidth()) {
            m23169c(viewGroup);
        }
    }

    /* renamed from: c */
    private final void m23169c(ViewGroup viewGroup) {
        m23167a(this.f21358d.mo53206a(this, (View) viewGroup));
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        if (this.f21369o) {
            C8533s sVar = C8533s.f21743a;
            C8533s.m23983a(true);
        }
        super.onAttachedToWindow();
        C8431lj<C8386ke> ljVar = this.f21365k;
        if (ljVar != null) {
            ljVar.mo53190a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        this.f21368n = false;
        if (this.f21369o) {
            C8533s sVar = C8533s.f21743a;
            C8533s.m23983a(false);
        }
        super.onDetachedFromWindow();
        C8431lj<C8386ke> ljVar = this.f21366l;
        if (ljVar != null) {
            ljVar.mo53190a();
        }
    }

    public final ViewGroup getParentAsViewGroup() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            return (ViewGroup) parent;
        }
        return null;
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            C8431lj<C8386ke> ljVar = this.f21363i;
            if (ljVar != null) {
                ljVar.mo53190a();
                return;
            }
            return;
        }
        C8431lj<C8386ke> ljVar2 = this.f21364j;
        if (ljVar2 != null) {
            ljVar2.mo53190a();
        }
    }

    /* renamed from: f */
    public final void mo53578f() {
        this.f21361g = null;
        this.f21363i = null;
        this.f21364j = null;
        this.f21365k = null;
        this.f21366l = null;
        this.f21362h = null;
        this.f21367m = null;
        removeAllViews();
    }

    /* renamed from: g */
    public final boolean mo53579g() {
        Activity a = C8266gp.m23209a((View) this);
        if (a == null) {
            return true;
        }
        return a.hasWindowFocus();
    }
}
