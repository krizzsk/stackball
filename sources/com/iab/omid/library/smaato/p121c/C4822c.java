package com.iab.omid.library.smaato.p121c;

import android.view.View;
import com.iab.omid.library.smaato.adsession.C4809a;
import com.iab.omid.library.smaato.p120b.C4811a;
import com.iab.omid.library.smaato.p121c.C4819a;
import com.iab.omid.library.smaato.p122d.C4825b;
import com.iab.omid.library.smaato.p122d.C4830f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.smaato.c.c */
public class C4822c implements C4819a {

    /* renamed from: a */
    private final C4819a f10867a;

    public C4822c(C4819a aVar) {
        this.f10867a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<View> mo39551a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C4811a a = C4811a.m10631a();
        if (a != null) {
            Collection<C4809a> c = a.mo39516c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            for (C4809a c2 : c) {
                View c3 = c2.mo39489c();
                if (c3 != null && C4830f.m10724c(c3) && (rootView = c3.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a2 = C4830f.m10722a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C4830f.m10722a(arrayList.get(size - 1)) > a2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public JSONObject mo39547a(View view) {
        return C4825b.m10692a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public void mo39548a(View view, JSONObject jSONObject, C4819a.C4820a aVar, boolean z) {
        Iterator<View> it = mo39551a().iterator();
        while (it.hasNext()) {
            aVar.mo39549a(it.next(), this.f10867a, jSONObject);
        }
    }
}
