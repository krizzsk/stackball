package com.yandex.mobile.ads.impl;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.vs1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

public class rt1 implements vs1 {

    /* renamed from: a */
    private final int[] f39715a = new int[2];

    /* renamed from: a */
    public JSONObject mo68510a(View view) {
        if (view == null) {
            return ft1.m36309a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f39715a);
        int[] iArr = this.f39715a;
        return ft1.m36309a(iArr[0], iArr[1], width, height);
    }

    /* renamed from: a */
    public void mo68511a(View view, JSONObject jSONObject, vs1.C14932a aVar, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            if (!z || Build.VERSION.SDK_INT < 21) {
                while (i < viewGroup.getChildCount()) {
                    ((gf1) aVar).mo67295a(viewGroup.getChildAt(i), this, jSONObject, z2);
                    i++;
                }
                return;
            }
            HashMap hashMap = new HashMap();
            while (i < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i);
                ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
                i++;
            }
            ArrayList arrayList2 = new ArrayList(hashMap.keySet());
            Collections.sort(arrayList2);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((ArrayList) hashMap.get((Float) it.next())).iterator();
                while (it2.hasNext()) {
                    ((gf1) aVar).mo67295a((View) it2.next(), this, jSONObject, z2);
                }
            }
        }
    }
}
