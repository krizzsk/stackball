package com.yandex.metrica.impl.p265ob;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Gl */
class C10319Gl {

    /* renamed from: a */
    private C11722rl f24794a;

    C10319Gl() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo61404a(C11796tl tlVar, View view, C11356il ilVar) {
        C11722rl b = tlVar.mo63752b((C10893Wl) null, view, 0);
        this.f24794a = b;
        if (b != null) {
            m26417a(tlVar, b, view, 1, ilVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONObject mo61403a(C10437Kl kl, C11090bl blVar, int i) {
        C11722rl rlVar = this.f24794a;
        JSONObject jSONObject = rlVar != null ? rlVar.mo63608a(kl, blVar, i, 0).f28094c : null;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    /* renamed from: a */
    private void m26417a(C11796tl tlVar, C11722rl rlVar, View view, int i, C11356il ilVar) {
        ArrayList arrayList = (ArrayList) tlVar.mo63750a(view, i);
        if (arrayList.size() == 0) {
            ilVar.mo62092a(rlVar.mo63607a());
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View view2 = (View) it.next();
            C11722rl b = tlVar.mo63752b(rlVar.mo63607a(), view2, i);
            if (b != null) {
                rlVar.mo63609a(b);
                m26417a(tlVar, b, view2, i + 1, ilVar);
            }
        }
    }
}
