package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.C14307pr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.wu */
public final class C15117wu implements C14307pr {

    /* renamed from: b */
    private static final Object f42293b = new Object();

    /* renamed from: c */
    private static volatile C15117wu f42294c;

    /* renamed from: a */
    private final List<C14307pr> f42295a = new ArrayList();

    private C15117wu() {
    }

    /* renamed from: a */
    public static C15117wu m43870a() {
        if (f42294c == null) {
            synchronized (f42293b) {
                if (f42294c == null) {
                    f42294c = new C15117wu();
                }
            }
        }
        return f42294c;
    }

    /* renamed from: a */
    public /* synthetic */ void mo67620a(C13513jm jmVar, C14697tn tnVar) {
        C14307pr.CC.$default$a(this, jmVar, tnVar);
    }

    /* renamed from: b */
    public void mo70755b(C14307pr prVar) {
        synchronized (f42293b) {
            this.f42295a.remove(prVar);
        }
    }

    /* renamed from: c */
    public /* synthetic */ void mo67623c(C13513jm jmVar, View view, C14697tn tnVar) {
        C14307pr.CC.$default$c(this, jmVar, view, tnVar);
    }

    /* renamed from: b */
    public void mo67622b(C13513jm jmVar, View view, C14697tn tnVar) {
        ArrayList arrayList = new ArrayList();
        synchronized (f42293b) {
            for (C14307pr next : this.f42295a) {
                if (next.mo67621a(tnVar)) {
                    arrayList.add(next);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C14307pr) it.next()).mo67622b(jmVar, view, tnVar);
        }
    }

    /* renamed from: a */
    public void mo70754a(C14307pr prVar) {
        synchronized (f42293b) {
            this.f42295a.add(prVar);
        }
    }

    /* renamed from: a */
    public boolean mo67621a(C14697tn tnVar) {
        ArrayList arrayList = new ArrayList();
        synchronized (f42293b) {
            arrayList.addAll(this.f42295a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((C14307pr) it.next()).mo67621a(tnVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo67619a(C13513jm jmVar, View view, C14697tn tnVar) {
        ArrayList arrayList = new ArrayList();
        synchronized (f42293b) {
            for (C14307pr next : this.f42295a) {
                if (next.mo67621a(tnVar)) {
                    arrayList.add(next);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C14307pr) it.next()).mo67619a(jmVar, view, tnVar);
        }
    }
}
