package com.iab.omid.library.ironsrc.p109c;

import android.view.View;
import com.iab.omid.library.ironsrc.adsession.C4708a;
import com.iab.omid.library.ironsrc.p108b.C4710a;
import com.iab.omid.library.ironsrc.p109c.C4719a;
import com.iab.omid.library.ironsrc.p110d.C4725b;
import com.iab.omid.library.ironsrc.p110d.C4730f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.c.c */
public class C4722c implements C4719a {

    /* renamed from: a */
    private final C4719a f10642a;

    public C4722c(C4719a aVar) {
        this.f10642a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<View> mo39166a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C4710a a = C4710a.m10179a();
        if (a != null) {
            Collection<C4708a> c = a.mo39126c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            for (C4708a d : c) {
                View d2 = d.mo39092d();
                if (d2 != null && C4730f.m10280c(d2) && (rootView = d2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a2 = C4730f.m10278a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C4730f.m10278a(arrayList.get(size - 1)) > a2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public JSONObject mo39161a(View view) {
        return C4725b.m10247a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public void mo39162a(View view, JSONObject jSONObject, C4719a.C4720a aVar, boolean z) {
        Iterator<View> it = mo39166a().iterator();
        while (it.hasNext()) {
            aVar.mo39163a(it.next(), this.f10642a, jSONObject);
        }
    }
}
