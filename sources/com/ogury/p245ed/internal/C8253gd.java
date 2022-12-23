package com.ogury.p245ed.internal;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.ogury.ed.internal.gd */
public final class C8253gd {
    /* renamed from: a */
    public static final List<String> m23184a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return C8394km.m23756a();
        }
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }
}
