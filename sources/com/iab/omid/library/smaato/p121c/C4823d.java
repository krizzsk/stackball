package com.iab.omid.library.smaato.p121c;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.smaato.p121c.C4819a;
import com.iab.omid.library.smaato.p122d.C4825b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.smaato.c.d */
public class C4823d implements C4819a {

    /* renamed from: a */
    private final int[] f10868a = new int[2];

    /* renamed from: a */
    private void m10683a(ViewGroup viewGroup, JSONObject jSONObject, C4819a.C4820a aVar) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aVar.mo39549a(viewGroup.getChildAt(i), this, jSONObject);
        }
    }

    /* renamed from: b */
    private void m10684b(ViewGroup viewGroup, JSONObject jSONObject, C4819a.C4820a aVar) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
            if (arrayList == null) {
                arrayList = new ArrayList();
                hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
            }
            arrayList.add(childAt);
        }
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) hashMap.get((Float) it.next())).iterator();
            while (it2.hasNext()) {
                aVar.mo39549a((View) it2.next(), this, jSONObject);
            }
        }
    }

    /* renamed from: a */
    public JSONObject mo39547a(View view) {
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f10868a);
        int[] iArr = this.f10868a;
        return C4825b.m10692a(iArr[0], iArr[1], width, height);
    }

    /* renamed from: a */
    public void mo39548a(View view, JSONObject jSONObject, C4819a.C4820a aVar, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z || Build.VERSION.SDK_INT < 21) {
                m10683a(viewGroup, jSONObject, aVar);
            } else {
                m10684b(viewGroup, jSONObject, aVar);
            }
        }
    }
}
