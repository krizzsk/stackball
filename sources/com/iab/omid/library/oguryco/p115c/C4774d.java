package com.iab.omid.library.oguryco.p115c;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.oguryco.p115c.C4770a;
import com.iab.omid.library.oguryco.p116d.C4776b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.oguryco.c.d */
public class C4774d implements C4770a {

    /* renamed from: a */
    private final int[] f10764a = new int[2];

    /* renamed from: a */
    private void m10467a(ViewGroup viewGroup, JSONObject jSONObject, C4770a.C4771a aVar) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aVar.mo39377a(viewGroup.getChildAt(i), this, jSONObject);
        }
    }

    /* renamed from: b */
    private void m10468b(ViewGroup viewGroup, JSONObject jSONObject, C4770a.C4771a aVar) {
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
                aVar.mo39377a((View) it2.next(), this, jSONObject);
            }
        }
    }

    /* renamed from: a */
    public JSONObject mo39375a(View view) {
        if (view == null) {
            return C4776b.m10476a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f10764a);
        int[] iArr = this.f10764a;
        return C4776b.m10476a(iArr[0], iArr[1], width, height);
    }

    /* renamed from: a */
    public void mo39376a(View view, JSONObject jSONObject, C4770a.C4771a aVar, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z || Build.VERSION.SDK_INT < 21) {
                m10467a(viewGroup, jSONObject, aVar);
            } else {
                m10468b(viewGroup, jSONObject, aVar);
            }
        }
    }
}
