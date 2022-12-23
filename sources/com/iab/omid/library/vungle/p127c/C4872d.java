package com.iab.omid.library.vungle.p127c;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.vungle.p127c.C4868a;
import com.iab.omid.library.vungle.p128d.C4874b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.c.d */
public class C4872d implements C4868a {

    /* renamed from: a */
    private final int[] f10976a = new int[2];

    /* renamed from: a */
    private void m10895a(ViewGroup viewGroup, JSONObject jSONObject, C4868a.C4869a aVar) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aVar.mo39733a(viewGroup.getChildAt(i), this, jSONObject);
        }
    }

    /* renamed from: b */
    private void m10896b(ViewGroup viewGroup, JSONObject jSONObject, C4868a.C4869a aVar) {
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
                aVar.mo39733a((View) it2.next(), this, jSONObject);
            }
        }
    }

    /* renamed from: a */
    public JSONObject mo39731a(View view) {
        if (view == null) {
            return C4874b.m10904a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f10976a);
        int[] iArr = this.f10976a;
        return C4874b.m10904a(iArr[0], iArr[1], width, height);
    }

    /* renamed from: a */
    public void mo39732a(View view, JSONObject jSONObject, C4868a.C4869a aVar, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z || Build.VERSION.SDK_INT < 21) {
                m10895a(viewGroup, jSONObject, aVar);
            } else {
                m10896b(viewGroup, jSONObject, aVar);
            }
        }
    }
}
