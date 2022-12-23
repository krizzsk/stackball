package com.iab.omid.library.ironsrc.p109c;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.ironsrc.p109c.C4719a;
import com.iab.omid.library.ironsrc.p110d.C4725b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.c.d */
public class C4723d implements C4719a {

    /* renamed from: a */
    private final int[] f10643a = new int[2];

    /* renamed from: a */
    private void m10238a(ViewGroup viewGroup, JSONObject jSONObject, C4719a.C4720a aVar) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aVar.mo39163a(viewGroup.getChildAt(i), this, jSONObject);
        }
    }

    /* renamed from: b */
    private void m10239b(ViewGroup viewGroup, JSONObject jSONObject, C4719a.C4720a aVar) {
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
                aVar.mo39163a((View) it2.next(), this, jSONObject);
            }
        }
    }

    /* renamed from: a */
    public JSONObject mo39161a(View view) {
        if (view == null) {
            return C4725b.m10247a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f10643a);
        int[] iArr = this.f10643a;
        return C4725b.m10247a(iArr[0], iArr[1], width, height);
    }

    /* renamed from: a */
    public void mo39162a(View view, JSONObject jSONObject, C4719a.C4720a aVar, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z || Build.VERSION.SDK_INT < 21) {
                m10238a(viewGroup, jSONObject, aVar);
            } else {
                m10239b(viewGroup, jSONObject, aVar);
            }
        }
    }
}
