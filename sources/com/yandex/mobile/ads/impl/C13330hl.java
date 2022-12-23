package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.C12066R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.hl */
public class C13330hl<V extends ViewGroup> implements C12982el<V> {

    /* renamed from: a */
    private final List<Integer> f34447a;

    /* renamed from: b */
    private final z61 f34448b = new z61();

    /* renamed from: c */
    private final bo1 f34449c = new bo1();

    /* renamed from: d */
    private final mf1 f34450d = new mf1();

    /* renamed from: e */
    private final qq0 f34451e = new qq0();

    /* renamed from: f */
    private final C14279ph f34452f = new C14279ph();

    /* renamed from: g */
    private final xo1 f34453g = new xo1();

    /* renamed from: h */
    private final int f34454h;

    public C13330hl(int i, List<Integer> list) {
        this.f34454h = i;
        this.f34447a = list;
    }

    /* renamed from: a */
    public void mo65684a(V v) {
        this.f34448b.mo71160a(v);
        C14279ph phVar = this.f34452f;
        List<Integer> list = this.f34447a;
        phVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Integer intValue : list) {
            View findViewById = v.findViewById(intValue.intValue());
            if (findViewById != null) {
                arrayList.add(findViewById);
            }
        }
        this.f34453g.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (view.getVisibility() != 8) {
                arrayList2.add(view);
            }
        }
        List<View> a = this.f34450d.mo68681a(arrayList2);
        ArrayList arrayList3 = (ArrayList) a;
        if (arrayList3.size() > 0) {
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).setVisibility(8);
            }
            this.f34448b.mo71160a(v);
        }
        arrayList2.removeAll(a);
        View findViewById2 = v.findViewById(this.f34454h);
        this.f34451e.getClass();
        View findViewById3 = v.findViewById(C12066R.C12068id.design_degradation_reference_view);
        if (findViewById2 != null && findViewById3 != null) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                View view2 = (View) it3.next();
                if (!this.f34449c.mo66102a(findViewById2, findViewById3)) {
                    view2.setVisibility(8);
                    this.f34448b.mo71160a(v);
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo65685c() {
    }
}
