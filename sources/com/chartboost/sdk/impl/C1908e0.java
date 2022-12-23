package com.chartboost.sdk.impl;

import com.chartboost.sdk.Model.C1837b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.chartboost.sdk.impl.e0 */
public class C1908e0 {

    /* renamed from: a */
    private String f4786a;

    /* renamed from: b */
    private String f4787b;

    /* renamed from: c */
    private String f4788c;

    /* renamed from: d */
    private String f4789d;

    /* renamed from: e */
    private ArrayList<C1911f0> f4790e;

    /* renamed from: f */
    private ArrayList<C1837b> f4791f;

    public C1908e0() {
        this.f4786a = "";
        this.f4787b = "";
        this.f4788c = "USD";
        this.f4789d = "";
        this.f4790e = new ArrayList<>();
        this.f4791f = new ArrayList<>();
    }

    /* renamed from: e */
    private String m4507e() {
        Iterator<C1911f0> it = this.f4790e.iterator();
        String str = "";
        int i = 0;
        while (it.hasNext()) {
            str = "Seatbid " + i + " : " + it.next().toString() + "\n";
            i++;
        }
        return str;
    }

    /* renamed from: a */
    public ArrayList<C1837b> mo14587a() {
        return this.f4791f;
    }

    /* renamed from: b */
    public HashMap<String, C1837b> mo14588b() {
        HashMap<String, C1837b> hashMap = new HashMap<>();
        Iterator<C1837b> it = this.f4791f.iterator();
        while (it.hasNext()) {
            C1837b next = it.next();
            hashMap.put(next.f4442b, next);
        }
        return hashMap;
    }

    /* renamed from: c */
    public String mo14589c() {
        return this.f4786a;
    }

    /* renamed from: d */
    public ArrayList<C1911f0> mo14590d() {
        return this.f4790e;
    }

    public String toString() {
        return "id: " + this.f4786a + "\nnbr: " + this.f4787b + "\ncurrency: " + this.f4788c + "\nbidId: " + this.f4789d + "\nseatbid: " + m4507e() + "\n";
    }

    public C1908e0(String str, String str2, String str3, String str4, ArrayList<C1911f0> arrayList, ArrayList<C1837b> arrayList2) {
        this.f4786a = str;
        this.f4787b = str2;
        this.f4788c = str3;
        this.f4789d = str4;
        this.f4790e = arrayList;
        this.f4791f = arrayList2;
    }
}
