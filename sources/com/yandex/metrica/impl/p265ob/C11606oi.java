package com.yandex.metrica.impl.p265ob;

import android.util.Pair;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.oi */
public class C11606oi {

    /* renamed from: a */
    public final List<Pair<String, C11607a>> f27864a;

    /* renamed from: com.yandex.metrica.impl.ob.oi$a */
    public static class C11607a {

        /* renamed from: a */
        public final String f27865a;

        public C11607a(String str) {
            this.f27865a = str;
        }

        public String toString() {
            return this.f27865a;
        }
    }

    public C11606oi(List<Pair<String, C11607a>> list) {
        this.f27864a = list;
    }

    public String toString() {
        return "AttributionConfig{deeplinkConditions=" + this.f27864a + '}';
    }
}
