package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.chartboost.sdk.impl.f0 */
public class C1911f0 {

    /* renamed from: a */
    private String f4799a;

    /* renamed from: b */
    private ArrayList<C1902c0> f4800b;

    public C1911f0() {
        this.f4799a = "";
        this.f4800b = new ArrayList<>();
    }

    /* renamed from: a */
    private String m4524a() {
        Iterator<C1902c0> it = this.f4800b.iterator();
        String str = "";
        int i = 0;
        while (it.hasNext()) {
            str = "Bid " + i + " : " + it.next().toString() + "\n";
            i++;
        }
        return str;
    }

    /* renamed from: b */
    public ArrayList<C1902c0> mo14597b() {
        return this.f4800b;
    }

    public String toString() {
        return "seat: " + this.f4799a + "\nbid: " + m4524a() + "\n";
    }

    public C1911f0(String str, ArrayList<C1902c0> arrayList) {
        this.f4799a = str;
        this.f4800b = arrayList;
    }
}
