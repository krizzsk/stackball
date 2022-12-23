package com.p243my.target;

import java.util.ArrayList;

/* renamed from: com.my.target.m2 */
public class C7541m2 {

    /* renamed from: a */
    public final ArrayList<C7560n2> f18983a = new ArrayList<>();

    /* renamed from: b */
    public int f18984b = 60;

    /* renamed from: c */
    public static final C7541m2 m19763c() {
        return new C7541m2();
    }

    /* renamed from: a */
    public int mo50845a() {
        return this.f18984b;
    }

    /* renamed from: a */
    public void mo50846a(int i) {
        this.f18984b = i;
    }

    /* renamed from: a */
    public void mo50847a(C7560n2 n2Var) {
        int size = this.f18983a.size();
        for (int i = 0; i < size; i++) {
            if (n2Var.mo50970f() > this.f18983a.get(i).mo50970f()) {
                this.f18983a.add(i, n2Var);
                return;
            }
        }
        this.f18983a.add(n2Var);
    }

    /* renamed from: b */
    public boolean mo50848b() {
        return !this.f18983a.isEmpty();
    }

    /* renamed from: d */
    public C7560n2 mo50849d() {
        if (this.f18983a.isEmpty()) {
            return null;
        }
        return this.f18983a.remove(0);
    }
}
