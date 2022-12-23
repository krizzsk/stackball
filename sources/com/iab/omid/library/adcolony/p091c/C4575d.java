package com.iab.omid.library.adcolony.p091c;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.adcolony.p091c.C4571a;
import com.iab.omid.library.adcolony.p092d.C4577b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.c.d */
public class C4575d implements C4571a {

    /* renamed from: a */
    private final int[] f10314a = new int[2];

    /* renamed from: a */
    private void m9583a(ViewGroup viewGroup, JSONObject jSONObject, C4571a.C4572a aVar) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aVar.mo38617a(viewGroup.getChildAt(i), this, jSONObject);
        }
    }

    /* renamed from: b */
    private void m9584b(ViewGroup viewGroup, JSONObject jSONObject, C4571a.C4572a aVar) {
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
                aVar.mo38617a((View) it2.next(), this, jSONObject);
            }
        }
    }

    /* renamed from: a */
    public JSONObject mo38615a(View view) {
        if (view == null) {
            return C4577b.m9592a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f10314a);
        int[] iArr = this.f10314a;
        return C4577b.m9592a(iArr[0], iArr[1], width, height);
    }

    /* renamed from: a */
    public void mo38616a(View view, JSONObject jSONObject, C4571a.C4572a aVar, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z || Build.VERSION.SDK_INT < 21) {
                m9583a(viewGroup, jSONObject, aVar);
            } else {
                m9584b(viewGroup, jSONObject, aVar);
            }
        }
    }
}
