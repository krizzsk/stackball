package com.iab.omid.library.inmobi.p103c;

import android.view.View;
import com.iab.omid.library.inmobi.adsession.C4660a;
import com.iab.omid.library.inmobi.p102b.C4662a;
import com.iab.omid.library.inmobi.p103c.C4670a;
import com.iab.omid.library.inmobi.p104d.C4676b;
import com.iab.omid.library.inmobi.p104d.C4681f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.c.c */
public class C4673c implements C4670a {

    /* renamed from: a */
    private final C4670a f10531a;

    public C4673c(C4670a aVar) {
        this.f10531a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<View> mo38986a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C4662a a = C4662a.m9971a();
        if (a != null) {
            Collection<C4660a> c = a.mo38950c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            for (C4660a c2 : c) {
                View c3 = c2.mo38923c();
                if (c3 != null && C4681f.m10066c(c3) && (rootView = c3.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a2 = C4681f.m10064a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C4681f.m10064a(arrayList.get(size - 1)) > a2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public JSONObject mo38981a(View view) {
        return C4676b.m10033a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public void mo38982a(View view, JSONObject jSONObject, C4670a.C4671a aVar, boolean z) {
        Iterator<View> it = mo38986a().iterator();
        while (it.hasNext()) {
            aVar.mo38983a(it.next(), this.f10531a, jSONObject);
        }
    }
}
