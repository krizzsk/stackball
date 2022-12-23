package com.iab.omid.library.vungle.p127c;

import android.view.View;
import com.iab.omid.library.vungle.adsession.C4857a;
import com.iab.omid.library.vungle.p126b.C4859a;
import com.iab.omid.library.vungle.p127c.C4868a;
import com.iab.omid.library.vungle.p128d.C4874b;
import com.iab.omid.library.vungle.p128d.C4879f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.c.c */
public class C4871c implements C4868a {

    /* renamed from: a */
    private final C4868a f10975a;

    public C4871c(C4868a aVar) {
        this.f10975a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<View> mo39736a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C4859a a = C4859a.m10833a();
        if (a != null) {
            Collection<C4857a> c = a.mo39688c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            for (C4857a d : c) {
                View d2 = d.mo39654d();
                if (d2 != null && C4879f.m10937c(d2) && (rootView = d2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a2 = C4879f.m10935a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C4879f.m10935a(arrayList.get(size - 1)) > a2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public JSONObject mo39731a(View view) {
        return C4874b.m10904a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public void mo39732a(View view, JSONObject jSONObject, C4868a.C4869a aVar, boolean z) {
        Iterator<View> it = mo39736a().iterator();
        while (it.hasNext()) {
            aVar.mo39733a(it.next(), this.f10975a, jSONObject);
        }
    }
}
