package com.iab.omid.library.corpmailru.p097c;

import android.view.View;
import com.iab.omid.library.corpmailru.adsession.C4610a;
import com.iab.omid.library.corpmailru.p096b.C4612a;
import com.iab.omid.library.corpmailru.p097c.C4621a;
import com.iab.omid.library.corpmailru.p098d.C4627b;
import com.iab.omid.library.corpmailru.p098d.C4632f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.corpmailru.c.c */
public class C4624c implements C4621a {

    /* renamed from: a */
    private final C4621a f10426a;

    public C4624c(C4621a aVar) {
        this.f10426a = aVar;
    }

    /* renamed from: a */
    public ArrayList<View> mo38814a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C4612a a = C4612a.m9745a();
        if (a != null) {
            Collection<C4610a> c = a.mo38766c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            for (C4610a d : c) {
                View d2 = d.mo38732d();
                if (d2 != null && C4632f.m9849c(d2) && (rootView = d2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a2 = C4632f.m9847a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C4632f.m9847a(arrayList.get(size - 1)) > a2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public JSONObject mo38809a(View view) {
        return C4627b.m9816a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public void mo38810a(View view, JSONObject jSONObject, C4621a.C4622a aVar, boolean z) {
        Iterator<View> it = mo38814a().iterator();
        while (it.hasNext()) {
            aVar.mo38811a(it.next(), this.f10426a, jSONObject);
        }
    }
}
