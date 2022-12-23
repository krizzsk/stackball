package com.yandex.metrica.impl.p265ob;

import android.content.ContentValues;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.N3 */
public final class C10536N3 implements C11170e0<Map<String, ? extends String>> {
    public Object invoke(Object obj) {
        String asString = ((ContentValues) obj).getAsString("clids");
        HashMap<String, String> d = C11993ym.m30990d(asString);
        if (C11993ym.m30991d((Map<String, String>) d)) {
            return d;
        }
        C10122B2.m26040b("Passed clids (" + asString + ") are invalid.", new Object[0]);
        return null;
    }
}
