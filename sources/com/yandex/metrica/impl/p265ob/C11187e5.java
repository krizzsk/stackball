package com.yandex.metrica.impl.p265ob;

import java.util.LinkedList;

/* renamed from: com.yandex.metrica.impl.ob.e5 */
public class C11187e5 extends C11231f5<C11737s5> {

    /* renamed from: a */
    private final C10154C5 f26795a;

    /* renamed from: b */
    private final C11188e6 f26796b;

    /* renamed from: c */
    private final C11973y5 f26797c;

    public C11187e5(C11229f4 f4Var) {
        this.f26795a = new C10154C5(f4Var);
        this.f26796b = new C11188e6(f4Var);
        this.f26797c = new C11973y5(f4Var);
    }

    /* renamed from: a */
    public C11102c5<C11737s5> mo62686a(int i) {
        LinkedList linkedList = new LinkedList();
        int ordinal = C11413k1.m29450a(i).ordinal();
        if (ordinal == 1) {
            linkedList.add(this.f26795a);
        } else if (ordinal == 3) {
            linkedList.add(this.f26797c);
        } else if (ordinal == 40) {
            linkedList.add(this.f26796b);
            linkedList.add(this.f26795a);
        }
        return new C11102c5<>(linkedList);
    }
}
