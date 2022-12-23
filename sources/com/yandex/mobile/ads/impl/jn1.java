package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public class jn1 {

    /* renamed from: a */
    private final Context f35411a;

    /* renamed from: b */
    private final kn1 f35412b = new kn1();

    /* renamed from: c */
    private final pn1 f35413c = new pn1();

    public jn1(Context context) {
        this.f35411a = context.getApplicationContext();
    }

    /* renamed from: a */
    public void mo68069a(in1 in1, String str) {
        List list = in1.mo65493a().get(str);
        if (list != null) {
            m37929a(list);
        }
    }

    /* renamed from: a */
    public void mo68070a(in1 in1, String str, Map<String, String> map) {
        List<String> list = in1.mo65493a().get(str);
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str2 : list) {
                this.f35412b.getClass();
                for (Map.Entry next : map.entrySet()) {
                    str2 = str2.replace((CharSequence) next.getKey(), (CharSequence) next.getValue());
                }
                arrayList.add(str2);
            }
            m37929a(arrayList);
        }
    }

    /* renamed from: a */
    private void m37929a(List<String> list) {
        this.f35413c.getClass();
        Intrinsics.checkNotNullParameter(list, "trackingUrls");
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (!Intrinsics.areEqual((Object) (String) next, (Object) "about:blank")) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            lm1.m38835a(this.f35411a).mo68491a((String) it.next(), (r41<fv0>) null);
        }
    }
}
