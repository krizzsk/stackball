package com.iab.omid.library.inmobi.p103c;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.p103c.C4670a;
import com.iab.omid.library.inmobi.p104d.C4676b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.c.d */
public class C4674d implements C4670a {

    /* renamed from: a */
    private final int[] f10532a = new int[2];

    /* renamed from: a */
    private void m10024a(ViewGroup viewGroup, JSONObject jSONObject, C4670a.C4671a aVar) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aVar.mo38983a(viewGroup.getChildAt(i), this, jSONObject);
        }
    }

    /* renamed from: b */
    private void m10025b(ViewGroup viewGroup, JSONObject jSONObject, C4670a.C4671a aVar) {
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
                aVar.mo38983a((View) it2.next(), this, jSONObject);
            }
        }
    }

    /* renamed from: a */
    public JSONObject mo38981a(View view) {
        if (view == null) {
            return C4676b.m10033a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f10532a);
        int[] iArr = this.f10532a;
        return C4676b.m10033a(iArr[0], iArr[1], width, height);
    }

    /* renamed from: a */
    public void mo38982a(View view, JSONObject jSONObject, C4670a.C4671a aVar, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z || Build.VERSION.SDK_INT < 21) {
                m10024a(viewGroup, jSONObject, aVar);
            } else {
                m10025b(viewGroup, jSONObject, aVar);
            }
        }
    }
}
