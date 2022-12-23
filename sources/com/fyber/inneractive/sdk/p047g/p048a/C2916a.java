package com.fyber.inneractive.sdk.p047g.p048a;

import com.fyber.inneractive.sdk.p051j.C3022i;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/* renamed from: com.fyber.inneractive.sdk.g.a.a */
public final class C2916a implements C3022i {

    /* renamed from: a */
    public String f6940a;

    /* renamed from: b */
    public String f6941b;

    /* renamed from: c */
    public int f6942c;

    /* renamed from: d */
    Map<C2933r, List<String>> f6943d = new HashMap();

    /* renamed from: e */
    public PriorityQueue<C2928m> f6944e;

    /* renamed from: f */
    public PriorityQueue<C2917b> f6945f;

    /* renamed from: g */
    public C2917b f6946g = null;

    /* renamed from: h */
    public int f6947h = 0;

    /* renamed from: i */
    public int f6948i = 0;

    public C2916a(Comparator<C2928m> comparator, Comparator<C2917b> comparator2) {
        this.f6944e = new PriorityQueue<>(1, comparator);
        this.f6945f = new PriorityQueue<>(1, comparator2);
    }

    /* renamed from: a */
    public final List<String> mo18376a(C2933r rVar) {
        Map<C2933r, List<String>> map;
        if (rVar == null || (map = this.f6943d) == null) {
            return null;
        }
        return map.get(rVar);
    }

    /* renamed from: a */
    public final C2928m mo18375a() {
        return this.f6944e.poll();
    }

    /* renamed from: a */
    public final void mo18377a(C2933r rVar, String str) {
        List list = this.f6943d.get(rVar);
        if (list == null) {
            list = new ArrayList();
            this.f6943d.put(rVar, list);
        }
        list.add(str);
    }

    /* renamed from: b */
    public final List<C2928m> mo18378b() {
        return new ArrayList(this.f6944e);
    }
}
