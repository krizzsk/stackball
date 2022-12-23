package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public final class lw0 {

    /* renamed from: a */
    private final xi1 f36934a;

    /* renamed from: b */
    private final qw0 f36935b;

    /* renamed from: c */
    private final yw0 f36936c = new yw0();

    public lw0(Context context, xi1 xi1) {
        this.f36934a = xi1;
        this.f36935b = new qw0(context);
    }

    /* renamed from: a */
    public C14165o4 mo68521a(List<vi1> list) throws IllegalStateException {
        ArrayList arrayList = new ArrayList();
        for (vi1 a : list) {
            try {
                arrayList.add(this.f36936c.mo71132a(a));
            } catch (wi1 e) {
                this.f36934a.mo66079a(e);
            } catch (Exception unused) {
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        C14353q4 a2 = C14353q4.m41073a(ry0.m41749a("Yandex", "5.2.0"), this.f36935b.mo69656a(), arrayList, (String) null, (String) null);
        C14280pi piVar = C14280pi.f38613d;
        yd0 yd0 = yd0.VIEWABLE;
        sx0 sx0 = sx0.NATIVE;
        return C14165o4.m40279a(C14253p4.m40668a(piVar, yd0, sx0, sx0, false), a2);
    }
}
