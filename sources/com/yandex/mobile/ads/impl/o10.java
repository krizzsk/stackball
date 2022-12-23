package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.Map;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;

public class o10 {

    /* renamed from: a */
    private final C12903dm f38050a;

    /* renamed from: b */
    private final u10 f38051b;

    /* renamed from: c */
    private final C12985en f38052c;

    /* renamed from: d */
    private final C14769um f38053d;

    /* renamed from: e */
    private final Map<C14889vg, Integer> f38054e = C13050fg.m36014a();

    @Inject
    public o10(C12903dm dmVar, u10 u10, C12985en enVar, C14769um umVar) {
        Intrinsics.checkNotNullParameter(dmVar, "logger");
        Intrinsics.checkNotNullParameter(u10, "visibilityListener");
        Intrinsics.checkNotNullParameter(enVar, "divActionHandler");
        Intrinsics.checkNotNullParameter(umVar, "divActionBeaconSender");
        this.f38050a = dmVar;
        this.f38051b = u10;
        this.f38052c = enVar;
        this.f38053d = umVar;
    }

    /* renamed from: a */
    public void mo69095a(C13513jm jmVar, View view, m10 m10) {
        Intrinsics.checkNotNullParameter(jmVar, "scope");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(m10, "action");
        C14889vg a = C15049wg.m43640a(jmVar, m10);
        Map<C14889vg, Integer> map = this.f38054e;
        int i = map.get(a);
        boolean z = false;
        if (i == null) {
            i = 0;
            map.put(a, 0);
        }
        int intValue = i.intValue();
        int intValue2 = m10.f37154c.mo66924a(jmVar.mo66388b()).intValue();
        if (intValue2 == 0 || intValue < intValue2) {
            C12985en d = jmVar.mo68034d();
            if (d != null) {
                z = d.mo66848a(m10, (d10) jmVar);
            }
            if (!z && !this.f38052c.mo66848a(m10, (d10) jmVar)) {
                this.f38050a.mo66627a(jmVar, view, m10);
                this.f38053d.mo70372a(m10, jmVar.mo66388b());
            }
            this.f38054e.put(a, Integer.valueOf(intValue + 1));
            ii0 ii0 = ii0.f34887a;
        }
    }

    /* renamed from: a */
    public void mo69096a(Map<View, ? extends C15177xl> map) {
        Intrinsics.checkNotNullParameter(map, "visibleViews");
        this.f38051b.mo65600a(map);
    }
}
