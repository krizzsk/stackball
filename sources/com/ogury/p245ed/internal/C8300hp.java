package com.ogury.p245ed.internal;

import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.ogury.ed.internal.hp */
public final class C8300hp {

    /* renamed from: a */
    private final Map<String, C8362jh> f21436a;

    /* renamed from: b */
    private final Map<String, C8313hx> f21437b;

    public C8300hp(Map<String, C8362jh> map, Map<String, C8313hx> map2) {
        C8467mq.m23881b(map, "webViewsMap");
        C8467mq.m23881b(map2, "webViewStates");
        this.f21436a = map;
        this.f21437b = map2;
    }

    /* renamed from: e */
    private final List<C8362jh> m23370e() {
        List<C8362jh> arrayList = new ArrayList<>();
        for (C8362jh next : this.f21436a.values()) {
            C8313hx hxVar = this.f21437b.get(C8296hn.m23337b(next));
            if (hxVar != null && hxVar.mo53716d()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo53679a() {
        for (C8362jh d : m23370e()) {
            d.mo53807d();
        }
    }

    /* renamed from: a */
    public final void mo53680a(String str, boolean z, boolean z2, String str2, String str3, String str4) {
        C8467mq.m23881b(str, "event");
        C8467mq.m23881b(str2, "webViewId");
        C8467mq.m23881b(str3, "url");
        C8467mq.m23881b(str4, "pageTitle");
        for (C8362jh a : m23370e()) {
            C8284hc hcVar = C8284hc.f21402a;
            C8365jk.m23714a(a, C8284hc.m23293a(str, z, z2, str2, str3, str4));
        }
    }

    /* renamed from: b */
    public final void mo53681b() {
        for (C8362jh a : m23370e()) {
            C8284hc hcVar = C8284hc.f21402a;
            C8365jk.m23714a(a, C8284hc.m23296b());
        }
    }

    /* renamed from: c */
    public final void mo53682c() {
        for (C8362jh e : m23370e()) {
            e.mo53808e();
        }
    }

    /* renamed from: a */
    public static void m23369a(C8362jh jhVar, String str, String str2) {
        C8467mq.m23881b(jhVar, "webView");
        C8467mq.m23881b(str, TJAdUnitConstants.String.CALLBACK_ID);
        C8467mq.m23881b(str2, "webViewId");
        C8284hc hcVar = C8284hc.f21402a;
        C8365jk.m23714a(jhVar, C8284hc.m23300b(str, "{webviewId:\"" + str2 + "\"}"));
    }

    /* renamed from: d */
    public final boolean mo53683d() {
        Iterable<C8313hx> values = this.f21437b.values();
        if ((values instanceof Collection) && ((Collection) values).isEmpty()) {
            return true;
        }
        for (C8313hx b : values) {
            if (b.mo53714b()) {
                return false;
            }
        }
        return true;
    }
}
