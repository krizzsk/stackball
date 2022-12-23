package com.fyber.inneractive.sdk.p029a.p030a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.a.a.d */
final class C2695d extends PriorityQueue<C2691b> {

    /* renamed from: a */
    private int f6359a;

    C2695d(int i) {
        super(1, new C2697e());
        this.f6359a = i;
    }

    /* renamed from: a */
    public final boolean add(C2691b bVar) {
        boolean add = super.add(bVar);
        if (size() > this.f6359a) {
            poll();
        }
        return add;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final JSONArray mo17901a(int i, boolean z) {
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = new ArrayList(this);
        Collections.sort(arrayList, new Comparator<C2691b>() {
            public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                C2691b bVar = (C2691b) obj;
                C2691b bVar2 = (C2691b) obj2;
                if (bVar == null || bVar2 == null) {
                    return 0;
                }
                return bVar2.f6355d - bVar.f6355d > 0 ? 1 : -1;
            }
        });
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            jSONArray.put(((C2691b) it.next()).mo17899a(false, z));
            i2++;
            if (i2 >= i) {
                break;
            }
        }
        return jSONArray;
    }

    public final int size() {
        return super.size();
    }
}
