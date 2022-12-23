package com.iab.omid.library.adcolony.p091c;

import android.view.View;
import com.iab.omid.library.adcolony.adsession.C4560a;
import com.iab.omid.library.adcolony.p090b.C4562a;
import com.iab.omid.library.adcolony.p091c.C4571a;
import com.iab.omid.library.adcolony.p092d.C4577b;
import com.iab.omid.library.adcolony.p092d.C4582f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.c.c */
public class C4574c implements C4571a {

    /* renamed from: a */
    private final C4571a f10313a;

    public C4574c(C4571a aVar) {
        this.f10313a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<View> mo38620a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C4562a a = C4562a.m9524a();
        if (a != null) {
            Collection<C4560a> c = a.mo38580c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            for (C4560a d : c) {
                View d2 = d.mo38546d();
                if (d2 != null && C4582f.m9625c(d2) && (rootView = d2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a2 = C4582f.m9623a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C4582f.m9623a(arrayList.get(size - 1)) > a2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public JSONObject mo38615a(View view) {
        return C4577b.m9592a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public void mo38616a(View view, JSONObject jSONObject, C4571a.C4572a aVar, boolean z) {
        Iterator<View> it = mo38620a().iterator();
        while (it.hasNext()) {
            aVar.mo38617a(it.next(), this.f10313a, jSONObject);
        }
    }
}
