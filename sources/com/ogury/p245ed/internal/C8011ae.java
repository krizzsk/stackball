package com.ogury.p245ed.internal;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* renamed from: com.ogury.ed.internal.ae */
public final class C8011ae implements C8531q {

    /* renamed from: a */
    public static final C8013a f20810a = new C8013a((byte) 0);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ViewGroup f20811b;

    /* renamed from: c */
    private final C8056bc f20812c;

    /* renamed from: d */
    private C8532r f20813d;

    /* renamed from: e */
    private C8054ba f20814e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final ViewTreeObserver.OnScrollChangedListener f20815f;

    /* renamed from: g */
    private final View f20816g;

    private C8011ae(ViewGroup viewGroup, C8056bc bcVar) {
        C8467mq.m23881b(viewGroup, "adContainer");
        C8467mq.m23881b(bcVar, "rectHelper");
        this.f20811b = viewGroup;
        this.f20812c = bcVar;
        this.f20814e = new C8054ba(viewGroup);
        this.f20815f = new ViewTreeObserver.OnScrollChangedListener() {
            public final void onScrollChanged() {
                C8011ae.m22267c(C8011ae.this);
            }
        };
        this.f20811b.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {

            /* renamed from: a */
            final /* synthetic */ C8011ae f20817a;

            {
                this.f20817a = r1;
            }

            public final void onViewDetachedFromWindow(View view) {
                this.f20817a.f20811b.getViewTreeObserver().removeOnScrollChangedListener(this.f20817a.f20815f);
            }

            public final void onViewAttachedToWindow(View view) {
                ViewTreeObserver viewTreeObserver = this.f20817a.f20811b.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f20817a.f20815f);
                }
            }
        });
        this.f20816g = this.f20811b.getRootView();
    }

    public /* synthetic */ C8011ae(ViewGroup viewGroup) {
        this(viewGroup, new C8056bc());
    }

    /* renamed from: c */
    private C8532r m22266c() {
        return this.f20813d;
    }

    /* renamed from: a */
    public final void mo53122a(C8532r rVar) {
        this.f20813d = rVar;
    }

    /* renamed from: com.ogury.ed.internal.ae$a */
    public static final class C8013a {
        public /* synthetic */ C8013a(byte b) {
            this();
        }

        private C8013a() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final void m22267c(C8011ae aeVar) {
        C8467mq.m23881b(aeVar, "this$0");
        aeVar.mo53121a();
    }

    /* renamed from: a */
    private final int m22262a(Rect rect) {
        Rect rect2 = new Rect();
        this.f20816g.getHitRect(rect2);
        if (!this.f20811b.getLocalVisibleRect(rect2) || this.f20811b.getWindowToken() == null) {
            return 0;
        }
        return rect.width() * rect.height();
    }

    /* renamed from: d */
    private final C8278gy m22268d() {
        C8278gy gyVar = new C8278gy();
        Rect a = C8056bc.m22438a(this.f20811b);
        int measuredWidth = this.f20811b.getMeasuredWidth() * this.f20811b.getMeasuredHeight();
        if (measuredWidth != 0) {
            gyVar.mo53629a(100.0f - ((((float) (measuredWidth - m22262a(a))) * 100.0f) / ((float) measuredWidth)));
        }
        if (gyVar.mo53633c() == 0.0f) {
            gyVar.mo53630a((Rect) null);
        } else {
            gyVar.mo53630a(a);
        }
        return gyVar;
    }

    /* renamed from: a */
    public final void mo53121a() {
        int childCount = this.f20811b.getChildCount();
        if (childCount > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                View childAt = this.f20811b.getChildAt(i);
                if (childAt instanceof C8362jh) {
                    C8362jh jhVar = (C8362jh) childAt;
                    if (jhVar.getContainsMraid()) {
                        m22264a(jhVar, m22268d());
                    }
                }
                if (i2 < childCount) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private final void m22264a(C8362jh jhVar, C8278gy gyVar) {
        if (jhVar.mo53819h()) {
            this.f20814e.mo53204a(gyVar);
            jhVar.getMraidCommandExecutor().mo53638a(gyVar);
            C8532r c = m22266c();
            if (c != null) {
                c.mo53126a(gyVar.mo53633c());
            }
        }
    }

    /* renamed from: b */
    public final void mo53123b() {
        mo53122a((C8532r) null);
    }
}
