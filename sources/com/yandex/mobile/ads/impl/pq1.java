package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C13413ii;
import com.yandex.mobile.ads.video.models.p268ad.C15561a;
import com.yandex.mobile.ads.video.models.p268ad.C15566b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class pq1 {

    /* renamed from: a */
    private final tq1 f38805a = new tq1();

    /* renamed from: b */
    private final lj1 f38806b;

    /* renamed from: c */
    private final ue1 f38807c = new ue1();

    public pq1(lj1 lj1) {
        this.f38806b = lj1;
    }

    /* renamed from: a */
    public List<C13413ii> mo69422a(lj1 lj1) {
        List<C13413ii> e = this.f38806b.mo68458e();
        ArrayList arrayList = new ArrayList();
        for (C13413ii a : e) {
            arrayList.addAll(this.f38807c.mo70343a(a));
        }
        ArrayList arrayList2 = new ArrayList();
        for (C13413ii next : lj1.mo68458e()) {
            this.f38805a.getClass();
            ArrayList arrayList3 = new ArrayList();
            for (C13413ii e2 : e) {
                arrayList3.addAll(e2.mo67787e());
            }
            HashSet hashSet = new HashSet();
            for (C15561a a2 : next.mo67787e()) {
                hashSet.add(a2.mo71970a());
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                C15561a aVar = (C15561a) it.next();
                String a3 = aVar.mo71970a();
                if (!hashSet.contains(a3)) {
                    arrayList4.add(aVar);
                    hashSet.add(a3);
                }
            }
            arrayList2.add(new C13413ii.C13414a().mo67802b((Collection<C15566b>) next.mo67789f()).mo67798a((Collection<C15561a>) next.mo67787e()).mo67799a((List<qe1>) arrayList).mo67797a(next.mo67784b()).mo67794a(next.mo67790g()).mo67793a(next.mo67786d()).mo67798a((Collection<C15561a>) arrayList4).mo67799a(this.f38807c.mo70343a(next)).mo67800a());
        }
        return arrayList2;
    }
}
