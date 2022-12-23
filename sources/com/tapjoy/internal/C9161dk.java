package com.tapjoy.internal;

import android.view.View;
import com.tapjoy.internal.C9158di;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.tapjoy.internal.dk */
public final class C9161dk implements C9158di {

    /* renamed from: a */
    private final C9158di f22522a;

    public C9161dk(C9158di diVar) {
        this.f22522a = diVar;
    }

    /* renamed from: a */
    public final JSONObject mo57956a(View view) {
        return C9163dm.m24531a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public final void mo57957a(View view, JSONObject jSONObject, C9158di.C9159a aVar, boolean z) {
        View rootView;
        ArrayList arrayList = new ArrayList();
        C9150dd a = C9150dd.m24507a();
        if (a != null) {
            Collection<C9145cz> unmodifiableCollection = Collections.unmodifiableCollection(a.f22500b);
            IdentityHashMap identityHashMap = new IdentityHashMap((unmodifiableCollection.size() * 2) + 3);
            for (C9145cz c : unmodifiableCollection) {
                View c2 = c.mo57930c();
                if (c2 != null && C9167dp.m24547b(c2) && (rootView = c2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a2 = C9167dp.m24546a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C9167dp.m24546a((View) arrayList.get(size - 1)) > a2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            aVar.mo57958a((View) it.next(), this.f22522a, jSONObject);
        }
    }
}
