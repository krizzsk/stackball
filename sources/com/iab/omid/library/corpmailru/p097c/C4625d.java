package com.iab.omid.library.corpmailru.p097c;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.corpmailru.p097c.C4621a;
import com.iab.omid.library.corpmailru.p098d.C4627b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.corpmailru.c.d */
public class C4625d implements C4621a {

    /* renamed from: a */
    private final int[] f10427a = new int[2];

    /* renamed from: a */
    private void m9807a(ViewGroup viewGroup, JSONObject jSONObject, C4621a.C4622a aVar) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aVar.mo38811a(viewGroup.getChildAt(i), this, jSONObject);
        }
    }

    /* renamed from: b */
    private void m9808b(ViewGroup viewGroup, JSONObject jSONObject, C4621a.C4622a aVar) {
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
                aVar.mo38811a((View) it2.next(), this, jSONObject);
            }
        }
    }

    /* renamed from: a */
    public JSONObject mo38809a(View view) {
        if (view == null) {
            return C4627b.m9816a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f10427a);
        int[] iArr = this.f10427a;
        return C4627b.m9816a(iArr[0], iArr[1], width, height);
    }

    /* renamed from: a */
    public void mo38810a(View view, JSONObject jSONObject, C4621a.C4622a aVar, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z || Build.VERSION.SDK_INT < 21) {
                m9807a(viewGroup, jSONObject, aVar);
            } else {
                m9808b(viewGroup, jSONObject, aVar);
            }
        }
    }
}
