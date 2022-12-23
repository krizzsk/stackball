package com.yandex.metrica.impl.p265ob;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.j1 */
public class C11363j1 {

    /* renamed from: com.yandex.metrica.impl.ob.j1$a */
    static class C11364a extends RuntimeException {
        public C11364a(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    public static String m29251a(int i) {
        Map<String, Integer> map = C10095A2.f24303a;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : C10095A2.f24303a.entrySet()) {
            if (((Integer) next.getValue()).intValue() == i) {
                arrayList.add(next.getKey());
            }
        }
        if (arrayList.size() == 1) {
            return (String) arrayList.get(0);
        }
        if (arrayList.size() == 0) {
            return "unknown";
        }
        return String.format("One of %s", new Object[]{arrayList});
    }

    /* renamed from: a */
    public static boolean m29252a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
