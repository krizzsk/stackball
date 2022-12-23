package com.iab.omid.library.oguryco.p115c;

import android.view.View;
import com.iab.omid.library.oguryco.adsession.C4758a;
import com.iab.omid.library.oguryco.p114b.C4760a;
import com.iab.omid.library.oguryco.p115c.C4770a;
import com.iab.omid.library.oguryco.p116d.C4776b;
import com.iab.omid.library.oguryco.p116d.C4781f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.oguryco.c.c */
public class C4773c implements C4770a {

    /* renamed from: a */
    private final C4770a f10763a;

    public C4773c(C4770a aVar) {
        this.f10763a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<View> mo39380a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C4760a a = C4760a.m10402a();
        if (a != null) {
            Collection<C4758a> c = a.mo39338c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            for (C4758a d : c) {
                View d2 = d.mo39280d();
                if (d2 != null && C4781f.m10509c(d2) && (rootView = d2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a2 = C4781f.m10507a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C4781f.m10507a(arrayList.get(size - 1)) > a2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public JSONObject mo39375a(View view) {
        return C4776b.m10476a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public void mo39376a(View view, JSONObject jSONObject, C4770a.C4771a aVar, boolean z) {
        Iterator<View> it = mo39380a().iterator();
        while (it.hasNext()) {
            aVar.mo39377a(it.next(), this.f10763a, jSONObject);
        }
    }
}
