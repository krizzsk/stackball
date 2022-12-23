package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.lj1;
import com.yandex.mobile.ads.impl.yj1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public class rq1 {

    /* renamed from: a */
    private final Context f39538a;

    /* renamed from: b */
    private final lj1 f39539b;

    /* renamed from: c */
    private final pq1 f39540c;

    /* renamed from: d */
    private final uj1 f39541d = new uj1();

    /* renamed from: e */
    private final qq1 f39542e = new qq1();

    /* renamed from: f */
    private final sq1 f39543f = new sq1();

    public rq1(Context context, lj1 lj1) {
        this.f39538a = context.getApplicationContext();
        this.f39539b = lj1;
        this.f39540c = new pq1(lj1);
    }

    /* renamed from: a */
    public List<lj1> mo69806a(List<lj1> list) {
        ArrayList arrayList = new ArrayList();
        for (lj1 next : list) {
            List<C13413ii> a = this.f39540c.mo69422a(next);
            qq1 qq1 = this.f39542e;
            lj1 lj1 = this.f39539b;
            qq1.getClass();
            Intrinsics.checkNotNullParameter(next, "videoAd");
            Intrinsics.checkNotNullParameter(lj1, "wrapperVideoAd");
            yj1 k = next.mo68466k();
            Intrinsics.checkNotNullExpressionValue(k, "videoAd.videoAdExtensions");
            yj1 k2 = lj1.mo68466k();
            Intrinsics.checkNotNullExpressionValue(k2, "wrapperVideoAd.videoAdExtensions");
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(k.mo71091a());
            arrayList2.addAll(k2.mo71091a());
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(k.mo71092b());
            arrayList3.addAll(k2.mo71092b());
            yj1 a2 = new yj1.C15255a().mo71093a(arrayList2).mo71095b(arrayList3).mo71094a();
            sq1 sq1 = this.f39543f;
            lj1 lj12 = this.f39539b;
            sq1.getClass();
            Intrinsics.checkNotNullParameter(next, "inlineVideoAd");
            Intrinsics.checkNotNullParameter(lj12, "wrapperVideoAd");
            List<lj1> listOf = CollectionsKt.listOf(next, lj12);
            ArrayList arrayList4 = new ArrayList();
            for (lj1 l : listOf) {
                ro1 l2 = l.mo68467l();
                List<String> a3 = l2 == null ? null : l2.mo69799a();
                if (a3 == null) {
                    a3 = CollectionsKt.emptyList();
                }
                CollectionsKt.addAll(arrayList4, a3);
            }
            ro1 ro1 = new ro1(arrayList4);
            this.f39541d.getClass();
            Map<String, List<String>> g = next.mo68461g();
            uj1 uj1 = this.f39541d;
            lj1 lj13 = this.f39539b;
            uj1.getClass();
            Map<String, List<String>> g2 = lj13.mo68461g();
            List<vi1> d = next.mo68457d();
            List<vi1> d2 = this.f39539b.mo68457d();
            ArrayList arrayList5 = new ArrayList(d);
            arrayList5.addAll(d2);
            arrayList.add(new lj1.C13860a(this.f39538a, next.mo68469n()).mo68480b((Collection<C13413ii>) a).mo68477a(g).mo68474a(next.mo68455b()).mo68479b(next.mo68456c()).mo68481c(next.mo68460f()).mo68482d(next.mo68464i()).mo68483e(next.mo68465j()).mo68471a(a2).mo68470a(ro1).mo68472a(next.mo68468m()).mo68477a(g2).mo68476a((Collection<vi1>) arrayList5).mo68478a());
        }
        return arrayList;
    }
}
