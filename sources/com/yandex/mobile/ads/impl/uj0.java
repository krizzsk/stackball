package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.location.Location;
import java.util.ArrayList;
import java.util.Iterator;

public class uj0 {

    /* renamed from: d */
    private static final Object f40661d = new Object();

    /* renamed from: e */
    private static volatile uj0 f40662e;

    /* renamed from: a */
    private final Context f40663a;

    /* renamed from: b */
    private final xj0 f40664b = new xj0();

    /* renamed from: c */
    private final wj0 f40665c = new wj0();

    private uj0(Context context) {
        this.f40663a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static uj0 m42700a(Context context) {
        if (f40662e == null) {
            synchronized (f40661d) {
                if (f40662e == null) {
                    f40662e = new uj0(context);
                }
            }
        }
        return f40662e;
    }

    /* renamed from: a */
    public Location mo70352a() {
        Location a;
        synchronized (f40661d) {
            wj0 wj0 = this.f40665c;
            Context context = this.f40663a;
            wj0.getClass();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new pi0(context));
            d71 a2 = l71.m38631c().mo68362a(context);
            if (a2 != null && !a2.mo66472t()) {
                arrayList.add(g90.m36507a(context));
                arrayList.add(ha0.m36892a(context));
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Location a3 = ((vj0) it.next()).mo69369a();
                if (a3 != null) {
                    arrayList2.add(a3);
                }
            }
            a = this.f40664b.mo70907a(arrayList2);
        }
        return a;
    }
}
