package com.yandex.mobile.ads.impl;

import android.app.ActivityManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public class i81 {

    /* renamed from: a */
    private final int f34766a;

    public i81(Context context) {
        this.f34766a = m37303a(context);
    }

    /* renamed from: a */
    private int m37303a(Context context) {
        try {
            return ((ActivityManager) context.getSystemService("activity")).getLauncherLargeIconSize();
        } catch (Exception unused) {
            return Math.round(context.getResources().getDimension(17104896));
        }
    }

    /* renamed from: a */
    public List<hd0> mo67751a(pq0 pq0) {
        ArrayList arrayList = new ArrayList();
        m37304a(pq0.mo69415e(), arrayList);
        List<C13690k9> b = pq0.mo69407b();
        if (b != null) {
            for (C13690k9 a : b) {
                m37304a(a.mo68166a(), arrayList);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private List<hd0> m37304a(ej0 ej0, List<hd0> list) {
        List<C13370i> a;
        if (!(ej0 == null || (a = ej0.mo66834a()) == null)) {
            for (C13370i next : a) {
                if (next instanceof f81) {
                    String b = ((f81) next).mo66938b();
                    hd0 hd0 = new hd0();
                    hd0.mo67522b(b);
                    hd0.mo67517a(this.f34766a);
                    hd0.mo67521b(this.f34766a);
                    list.add(hd0);
                }
            }
        }
        return list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public hd0 mo67750a(String str) {
        hd0 hd0 = new hd0();
        hd0.mo67522b(str);
        hd0.mo67517a(this.f34766a);
        hd0.mo67521b(this.f34766a);
        return hd0;
    }
}
