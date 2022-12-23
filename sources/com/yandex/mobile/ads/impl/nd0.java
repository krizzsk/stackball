package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

public final class nd0 {

    /* renamed from: a */
    private final dd0 f37795a = new dd0(new vg1());

    /* renamed from: a */
    public final List<hd0> mo69024a(JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                hd0 b = this.f37795a.mo65715a(jSONArray.getJSONObject(i));
                Intrinsics.checkNotNullExpressionValue(b, "imageParser.parseValue(jsonArray.getJSONObject(i))");
                arrayList.add(b);
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return arrayList;
    }
}
