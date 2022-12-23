package com.tapjoy.internal;

import com.tapjoy.internal.C9235ew;
import java.util.Map;

/* renamed from: com.tapjoy.internal.ik */
public final class C9420ik extends C9417ii {

    /* renamed from: c */
    private final C9235ew.C9236a f23402c = new C9235ew.C9236a();

    /* renamed from: d */
    private C9241ey f23403d = null;

    /* renamed from: c */
    public final String mo57905c() {
        return this.f23403d == C9241ey.USAGES ? "api/v1/usages" : "api/v1/cevs";
    }

    /* renamed from: a */
    public final boolean mo58360a(C9232ev evVar) {
        if (this.f23403d == null) {
            this.f23403d = evVar.f22695n;
        } else if (evVar.f22695n != this.f23403d) {
            return false;
        }
        this.f23402c.f22735c.add(evVar);
        return true;
    }

    /* renamed from: g */
    public final int mo58361g() {
        return this.f23402c.f22735c.size();
    }

    /* renamed from: e */
    public final Map mo57907e() {
        Map e = super.mo57907e();
        e.put("events", new C9100bm(C9379hp.m25204a(this.f23402c.mo58093b())));
        return e;
    }
}
