package com.ogury.p245ed.internal;

import android.graphics.Rect;
import android.view.View;
import com.ogury.p245ed.internal.C8350iz;
import java.util.List;

/* renamed from: com.ogury.ed.internal.be */
public final class C8058be {

    /* renamed from: a */
    private final C8056bc f20929a;

    /* renamed from: b */
    private final C8067bl f20930b;

    /* renamed from: c */
    private final List<C8066bk> f20931c;

    private C8058be(C8056bc bcVar, C8067bl blVar) {
        C8467mq.m23881b(bcVar, "rectHelper");
        C8467mq.m23881b(blVar, "screenRotationAdjustment");
        this.f20929a = bcVar;
        this.f20930b = blVar;
        this.f20931c = C8394km.m23757b(new C8065bj(), new C8062bg(), this.f20930b, new C8064bi(1.0f));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C8058be() {
        /*
            r4 = this;
            com.ogury.ed.internal.bc r0 = new com.ogury.ed.internal.bc
            r0.<init>()
            com.ogury.ed.internal.bl r1 = new com.ogury.ed.internal.bl
            android.content.res.Resources r2 = android.content.res.Resources.getSystem()
            android.content.res.Configuration r2 = r2.getConfiguration()
            java.lang.String r3 = "getSystem().configuration"
            com.ogury.p245ed.internal.C8467mq.m23878a((java.lang.Object) r2, (java.lang.String) r3)
            r1.<init>(r2)
            r4.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p245ed.internal.C8058be.<init>():void");
    }

    /* renamed from: a */
    public final C8350iz mo53205a(View view, C8350iz izVar) {
        if (izVar == null || view == null) {
            return null;
        }
        Rect g = izVar.mo53792g();
        Rect c = C8056bc.m22440c(view);
        g.offset(c.left, c.top);
        C8350iz a = m22442a(view, g);
        if (a != null) {
            a.mo53789e(izVar.mo53791f());
        }
        return a;
    }

    /* renamed from: com.ogury.ed.internal.be$a */
    /* synthetic */ class C8059a extends C8466mp implements C8432lk<C8248g, C8386ke> {
        C8059a(Object obj) {
            super(1, obj, C8058be.class, "onMouseUp", "onMouseUp(Lio/presage/ads/viewer/AdLayout;)V");
        }

        /* renamed from: a */
        private void m22447a(C8248g gVar) {
            C8467mq.m23881b(gVar, "p0");
            ((C8058be) this.f21679a).m22444a(gVar);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo53077a(Object obj) {
            m22447a((C8248g) obj);
            return C8386ke.f21633a;
        }
    }

    /* renamed from: a */
    public final C8350iz mo53206a(C8248g gVar, View view) {
        C8467mq.m23881b(gVar, "adLayout");
        C8467mq.m23881b(view, TtmlNode.RUBY_CONTAINER);
        Rect c = C8056bc.m22440c(gVar);
        gVar.setOnMouseUpListener(new C8059a(this));
        return m22442a(view, c);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m22444a(C8248g gVar) {
        this.f20930b.mo53212a(C8056bc.m22440c(gVar));
    }

    /* renamed from: a */
    private final C8350iz m22442a(View view, Rect rect) {
        Rect c = C8056bc.m22440c(view);
        if (C8057bd.m22441a(view, c)) {
            return null;
        }
        for (C8066bk a : this.f20931c) {
            a.mo53208a(rect, c);
        }
        this.f20930b.mo53212a(rect);
        rect.offset(-c.left, -c.top);
        C8350iz.C8351a aVar = C8350iz.f21570a;
        return C8350iz.C8351a.m23655a(rect);
    }
}
