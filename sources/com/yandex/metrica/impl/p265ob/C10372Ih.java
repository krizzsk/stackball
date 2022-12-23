package com.yandex.metrica.impl.p265ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p265ob.C11993ym;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Ih */
public class C10372Ih {
    /* renamed from: a */
    public List<C10341Hh> mo61543a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray optJSONArray = new C11993ym.C11994a(str).optJSONArray("sdk_list");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject jSONObject = optJSONArray.getJSONObject(i);
                    String optString = jSONObject.optString("name");
                    if (!TextUtils.isEmpty(optString)) {
                        JSONArray optJSONArray2 = jSONObject.optJSONArray("classes");
                        ArrayList arrayList2 = new ArrayList();
                        if (optJSONArray2 != null) {
                            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                                try {
                                    String optString2 = optJSONArray2.getJSONObject(i2).optString("name");
                                    if (!TextUtils.isEmpty(optString2)) {
                                        arrayList2.add(optString2);
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                        }
                        if (!C10796U2.m27896b((Collection) arrayList2)) {
                            arrayList.add(new C10341Hh(optString, arrayList2));
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return arrayList;
    }
}
