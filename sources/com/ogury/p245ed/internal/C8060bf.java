package com.ogury.p245ed.internal;

import android.graphics.Rect;
import android.view.ViewGroup;

/* renamed from: com.ogury.ed.internal.bf */
public final class C8060bf {

    /* renamed from: a */
    public static final C8061a f20932a = new C8061a((byte) 0);

    /* renamed from: b */
    private final C8064bi f20933b;

    /* renamed from: c */
    private final int f20934c;

    private C8060bf(C8064bi biVar) {
        C8467mq.m23881b(biVar, "minVisibilityAdjustmentGateway");
        this.f20933b = biVar;
        this.f20934c = C8258gi.m23195b(50);
    }

    public /* synthetic */ C8060bf() {
        this(new C8064bi(0.75f));
    }

    /* renamed from: com.ogury.ed.internal.bf$a */
    public static final class C8061a {
        public /* synthetic */ C8061a(byte b) {
            this();
        }

        private C8061a() {
        }
    }

    /* renamed from: a */
    public final boolean mo53207a(ViewGroup viewGroup, C8350iz izVar) {
        C8467mq.m23881b(viewGroup, "adLayout");
        C8467mq.m23881b(izVar, "resizeProps");
        if (izVar.mo53782b() < this.f20934c || izVar.mo53784c() < this.f20934c) {
            return false;
        }
        Rect rect = new Rect();
        viewGroup.getWindowVisibleDisplayFrame(rect);
        Rect a = m22449a(rect, izVar);
        C8063bh b = this.f20933b.mo53211b(a, rect);
        float b2 = b.mo53210b();
        if (b2 < 0.5f) {
            return false;
        }
        if (!izVar.mo53781a() && b2 < 0.75f) {
            return false;
        }
        if (!izVar.mo53781a() || b2 >= 0.75f) {
            return true;
        }
        if (!b.mo53209a()) {
            return false;
        }
        m22450a(izVar, a, rect);
        return true;
    }

    /* renamed from: a */
    private static void m22450a(C8350iz izVar, Rect rect, Rect rect2) {
        izVar.mo53785c(rect.left - rect2.left);
        izVar.mo53787d(rect.top - rect2.top);
        izVar.mo53779a(rect.width());
        izVar.mo53783b(rect.height());
    }

    /* renamed from: a */
    private static Rect m22449a(Rect rect, C8350iz izVar) {
        Rect rect2 = new Rect();
        rect2.left = rect.left + izVar.mo53786d();
        rect2.top = rect.top + izVar.mo53788e();
        rect2.right = rect2.left + izVar.mo53782b();
        rect2.bottom = rect2.top + izVar.mo53784c();
        return rect2;
    }
}
