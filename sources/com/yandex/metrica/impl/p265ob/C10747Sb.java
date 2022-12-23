package com.yandex.metrica.impl.p265ob;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.yandex.metrica.impl.ob.Sb */
public class C10747Sb implements C10780Tb, C10806Ub {

    /* renamed from: a */
    private final Set<Integer> f25769a;

    /* renamed from: b */
    private AtomicLong f25770b;

    public C10747Sb(C11782t8 t8Var) {
        HashSet hashSet = new HashSet();
        this.f25769a = hashSet;
        hashSet.add(Integer.valueOf(C11413k1.EVENT_TYPE_FIRST_ACTIVATION.mo63170b()));
        hashSet.add(Integer.valueOf(C11413k1.EVENT_TYPE_APP_UPDATE.mo63170b()));
        hashSet.add(Integer.valueOf(C11413k1.EVENT_TYPE_INIT.mo63170b()));
        hashSet.add(Integer.valueOf(C11413k1.EVENT_TYPE_IDENTITY.mo63170b()));
        hashSet.add(Integer.valueOf(C11413k1.EVENT_TYPE_SEND_REFERRER.mo63170b()));
        t8Var.mo63710a((C10806Ub) this);
        this.f25770b = new AtomicLong(t8Var.mo63704a((Set<Integer>) hashSet));
    }

    /* renamed from: a */
    public boolean mo62227a() {
        return this.f25770b.get() > 0;
    }

    /* renamed from: b */
    public void mo62228b(List<Integer> list) {
        int i = 0;
        for (Integer intValue : list) {
            if (this.f25769a.contains(Integer.valueOf(intValue.intValue()))) {
                i++;
            }
        }
        this.f25770b.addAndGet((long) (-i));
    }

    /* renamed from: a */
    public void mo62226a(List<Integer> list) {
        int i = 0;
        for (Integer intValue : list) {
            if (this.f25769a.contains(Integer.valueOf(intValue.intValue()))) {
                i++;
            }
        }
        this.f25770b.addAndGet((long) i);
    }
}
