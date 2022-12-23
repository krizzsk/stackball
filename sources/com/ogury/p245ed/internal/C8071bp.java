package com.ogury.p245ed.internal;

import android.graphics.Rect;
import android.view.ViewGroup;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ogury.ed.internal.bp */
public final class C8071bp {

    /* renamed from: a */
    public static final C8071bp f20954a = new C8071bp();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static C8056bc f20955b = new C8056bc();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Map<String, Rect> f20956c = new LinkedHashMap();

    private C8071bp() {
    }

    /* renamed from: a */
    public static Rect m22486a(String str) {
        C8467mq.m23881b(str, "adUnitId");
        return f20956c.get(str);
    }

    /* renamed from: com.ogury.ed.internal.bp$a */
    static final class C8072a extends C8468mr implements C8431lj<C8386ke> {

        /* renamed from: a */
        final /* synthetic */ C8248g f20957a;

        /* renamed from: b */
        final /* synthetic */ String f20958b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8072a(C8248g gVar, String str) {
            super(0);
            this.f20957a = gVar;
            this.f20958b = str;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo53190a() {
            m22491b();
            return C8386ke.f21633a;
        }

        /* renamed from: b */
        private void m22491b() {
            C8056bc unused = C8071bp.f20955b;
            C8071bp.f20956c.put(this.f20958b, C8056bc.m22438a(this.f20957a));
        }
    }

    /* renamed from: a */
    public static void m22489a(C8248g gVar, String str) {
        C8467mq.m23881b(gVar, "adLayout");
        C8467mq.m23881b(str, "adUnitId");
        gVar.setOnOverlayPositionChanged(new C8072a(gVar, str));
    }

    /* renamed from: a */
    public static Rect m22487a(String str, C8248g gVar) {
        C8467mq.m23881b(str, "adUnitId");
        C8467mq.m23881b(gVar, "adLayout");
        Rect a = m22486a(str);
        if (a == null) {
            return null;
        }
        Rect rect = new Rect(a);
        ViewGroup parentAsViewGroup = gVar.getParentAsViewGroup();
        if (parentAsViewGroup != null) {
            rect.top -= C8056bc.m22440c(parentAsViewGroup).top;
        }
        return rect;
    }
}
