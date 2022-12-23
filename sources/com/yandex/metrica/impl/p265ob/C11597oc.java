package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.oc */
public class C11597oc implements C11560nc {

    /* renamed from: a */
    private final int f27845a;

    /* renamed from: b */
    private final int f27846b;

    /* renamed from: c */
    private int f27847c = 0;

    public C11597oc(int i, int i2) {
        this.f27845a = i;
        this.f27846b = i2;
    }

    /* renamed from: a */
    public int mo63376a() {
        return this.f27846b;
    }

    /* renamed from: b */
    public boolean mo63377b() {
        int i = this.f27847c;
        this.f27847c = i + 1;
        return i < this.f27845a;
    }

    /* renamed from: c */
    public void mo63378c() {
        this.f27847c = 0;
    }
}
