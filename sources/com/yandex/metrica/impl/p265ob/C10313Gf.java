package com.yandex.metrica.impl.p265ob;

import android.util.SparseArray;
import com.yandex.metrica.impl.p265ob.C11042ag;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.Gf */
public class C10313Gf {

    /* renamed from: c */
    private static final int[] f24783c = {0, 1, 2, 3};

    /* renamed from: a */
    private final SparseArray<HashMap<String, C11042ag.C11043a>> f24784a;

    /* renamed from: b */
    private int f24785b;

    public C10313Gf() {
        this(f24783c);
    }

    /* renamed from: a */
    public C11042ag.C11043a mo61393a(int i, String str) {
        return (C11042ag.C11043a) this.f24784a.get(i).get(str);
    }

    /* renamed from: b */
    public void mo61395b() {
        this.f24785b++;
    }

    /* renamed from: c */
    public C11042ag mo61396c() {
        C11042ag agVar = new C11042ag();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f24784a.size(); i++) {
            SparseArray<HashMap<String, C11042ag.C11043a>> sparseArray = this.f24784a;
            for (C11042ag.C11043a add : sparseArray.get(sparseArray.keyAt(i)).values()) {
                arrayList.add(add);
            }
        }
        agVar.f26522b = (C11042ag.C11043a[]) arrayList.toArray(new C11042ag.C11043a[arrayList.size()]);
        return agVar;
    }

    C10313Gf(int[] iArr) {
        this.f24784a = new SparseArray<>();
        this.f24785b = 0;
        for (int put : iArr) {
            this.f24784a.put(put, new HashMap());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo61394a(C11042ag.C11043a aVar) {
        this.f24784a.get(aVar.f26525c).put(new String(aVar.f26524b), aVar);
    }

    /* renamed from: a */
    public int mo61392a() {
        return this.f24785b;
    }
}
