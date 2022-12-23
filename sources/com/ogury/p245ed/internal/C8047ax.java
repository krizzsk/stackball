package com.ogury.p245ed.internal;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.ogury.p245ed.internal.C8122cw;
import java.util.List;

/* renamed from: com.ogury.ed.internal.ax */
public final class C8047ax implements C8531q {

    /* renamed from: a */
    public static final C8048a f20914a = new C8048a((byte) 0);

    /* renamed from: b */
    private final ViewGroup f20915b;

    /* renamed from: c */
    private final C8056bc f20916c;

    /* renamed from: d */
    private final C8055bb f20917d;

    /* renamed from: e */
    private final C8052az f20918e;

    /* renamed from: f */
    private C8114cq f20919f;

    /* renamed from: g */
    private C8532r f20920g;

    /* renamed from: h */
    private C8054ba f20921h;

    private C8047ax(ViewGroup viewGroup, C8056bc bcVar, C8055bb bbVar, C8052az azVar) {
        C8467mq.m23881b(viewGroup, "adContainer");
        C8467mq.m23881b(bcVar, "webViewHelper");
        C8467mq.m23881b(bbVar, "overlapCalculator");
        C8467mq.m23881b(azVar, "viewHierarchy");
        this.f20915b = viewGroup;
        this.f20916c = bcVar;
        this.f20917d = bbVar;
        this.f20918e = azVar;
        this.f20919f = new C8114cq();
        this.f20921h = new C8054ba(this.f20915b);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C8047ax(android.view.ViewGroup r4) {
        /*
            r3 = this;
            com.ogury.ed.internal.bc r0 = new com.ogury.ed.internal.bc
            r0.<init>()
            com.ogury.ed.internal.bb r1 = new com.ogury.ed.internal.bb
            r1.<init>(r0)
            com.ogury.ed.internal.az r2 = new com.ogury.ed.internal.az
            r2.<init>()
            r3.<init>(r4, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p245ed.internal.C8047ax.<init>(android.view.ViewGroup):void");
    }

    /* renamed from: c */
    private C8532r m22414c() {
        return this.f20920g;
    }

    /* renamed from: a */
    public final void mo53122a(C8532r rVar) {
        this.f20920g = rVar;
    }

    /* renamed from: com.ogury.ed.internal.ax$a */
    public static final class C8048a {
        public /* synthetic */ C8048a(byte b) {
            this();
        }

        private C8048a() {
        }
    }

    /* renamed from: a */
    public final void mo53121a() {
        this.f20919f.mo53281a();
        int childCount = this.f20915b.getChildCount();
        if (childCount > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                View childAt = this.f20915b.getChildAt(i);
                if ((childAt instanceof C8362jh) && ((C8362jh) childAt).getContainsMraid()) {
                    C8122cw.C8123a aVar = C8122cw.f21054a;
                    this.f20919f.mo53282a(C8122cw.C8123a.m22639a(new C8049b(this, childAt)).mo53286b(new C8050c(this, childAt)));
                }
                if (i2 < childCount) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: com.ogury.ed.internal.ax$b */
    static final class C8049b extends C8468mr implements C8431lj<C8278gy> {

        /* renamed from: a */
        final /* synthetic */ C8047ax f20922a;

        /* renamed from: b */
        final /* synthetic */ View f20923b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8049b(C8047ax axVar, View view) {
            super(0);
            this.f20922a = axVar;
            this.f20923b = view;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C8278gy mo53190a() {
            C8047ax axVar = this.f20922a;
            View view = this.f20923b;
            C8467mq.m23878a((Object) view, "child");
            return axVar.m22411a((C8362jh) view);
        }
    }

    /* renamed from: com.ogury.ed.internal.ax$c */
    static final class C8050c extends C8468mr implements C8432lk<C8278gy, C8386ke> {

        /* renamed from: a */
        final /* synthetic */ C8047ax f20924a;

        /* renamed from: b */
        final /* synthetic */ View f20925b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8050c(C8047ax axVar, View view) {
            super(1);
            this.f20924a = axVar;
            this.f20925b = view;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo53077a(Object obj) {
            m22420a((C8278gy) obj);
            return C8386ke.f21633a;
        }

        /* renamed from: a */
        private void m22420a(C8278gy gyVar) {
            C8467mq.m23881b(gyVar, "it");
            C8047ax axVar = this.f20924a;
            View view = this.f20925b;
            C8467mq.m23878a((Object) view, "child");
            axVar.m22413a((C8362jh) view, gyVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m22413a(C8362jh jhVar, C8278gy gyVar) {
        if (jhVar.mo53819h()) {
            this.f20921h.mo53204a(gyVar);
            jhVar.getMraidCommandExecutor().mo53638a(gyVar);
            C8532r c = m22414c();
            if (c != null) {
                c.mo53126a(gyVar.mo53633c());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C8278gy m22411a(C8362jh jhVar) {
        C8278gy gyVar = new C8278gy();
        View rootView = this.f20915b.getRootView();
        if (rootView != null) {
            ViewGroup viewGroup = (ViewGroup) rootView;
            Rect a = C8056bc.m22438a(jhVar);
            Rect b = C8056bc.m22439b(this.f20915b);
            a.bottom = a.top + jhVar.getMeasuredHeight();
            a.right = a.left + jhVar.getMeasuredWidth();
            if (!a.intersect(b)) {
                return gyVar;
            }
            List<Rect> a2 = C8055bb.m22436a((List<? extends View>) this.f20918e.mo53202a(viewGroup, (WebView) jhVar), a);
            int a3 = C8055bb.m22434a(a, a2);
            int measuredWidth = jhVar.getMeasuredWidth() * jhVar.getMeasuredHeight();
            int a4 = measuredWidth - C8051ay.m22422a(a);
            boolean z = false;
            if (a4 < 0) {
                a4 = 0;
            }
            float f = (float) measuredWidth;
            if (measuredWidth != 0) {
                gyVar.mo53629a(100.0f - ((((float) (a3 + a4)) * 100.0f) / f));
            } else {
                gyVar.mo53629a(0.0f);
            }
            if (gyVar.mo53633c() == 0.0f) {
                z = true;
            }
            if (!z) {
                C8051ay.m22425a(a2, b);
                C8051ay.m22424a(a, b);
                gyVar.mo53631a(a2);
                gyVar.mo53630a(a);
            }
            return gyVar;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: b */
    public final void mo53123b() {
        mo53122a((C8532r) null);
        this.f20919f.mo53281a();
    }
}
