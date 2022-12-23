package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.p2 */
public final class C14242p2 {

    /* renamed from: c */
    private static final Object f38443c = new Object();

    /* renamed from: d */
    private static volatile C14242p2 f38444d;

    /* renamed from: a */
    private final List<String> f38445a = new ArrayList();

    /* renamed from: b */
    private final List<String> f38446b = new ArrayList();

    private C14242p2() {
    }

    /* renamed from: b */
    public static C14242p2 m40636b() {
        if (f38444d == null) {
            synchronized (f38443c) {
                if (f38444d == null) {
                    f38444d = new C14242p2();
                }
            }
        }
        return f38444d;
    }

    /* renamed from: a */
    public void mo69297a(String str) {
        synchronized (f38443c) {
            this.f38446b.add(str);
        }
    }

    /* renamed from: c */
    public List<String> mo69299c() {
        ArrayList arrayList;
        synchronized (f38443c) {
            arrayList = new ArrayList(this.f38445a);
        }
        return arrayList;
    }

    /* renamed from: a */
    public List<String> mo69296a() {
        ArrayList arrayList;
        synchronized (f38443c) {
            arrayList = new ArrayList(this.f38446b);
        }
        return arrayList;
    }

    /* renamed from: b */
    public void mo69298b(String str) {
        synchronized (f38443c) {
            this.f38445a.add(str);
        }
    }
}
