package com.fyber.inneractive.sdk.p033c;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.p045e.C2899b;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.fyber.inneractive.sdk.c.b */
public final class C2724b {

    /* renamed from: a */
    public final Set<C2725a> f6412a;

    /* renamed from: com.fyber.inneractive.sdk.c.b$a */
    public interface C2725a {
        /* renamed from: a */
        C2899b mo17963a();

        /* renamed from: a */
        boolean mo17964a(InneractiveAdSpot inneractiveAdSpot);
    }

    /* renamed from: com.fyber.inneractive.sdk.c.b$b */
    private static class C2726b {

        /* renamed from: a */
        public static C2724b f6413a = new C2724b((byte) 0);
    }

    /* synthetic */ C2724b(byte b) {
        this();
    }

    private C2724b() {
        this.f6412a = new HashSet();
    }

    /* renamed from: a */
    public final C2899b mo17961a(InneractiveAdSpot inneractiveAdSpot) {
        for (C2725a next : this.f6412a) {
            if (next.mo17964a(inneractiveAdSpot)) {
                return next.mo17963a();
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo17962a(C2725a aVar) {
        this.f6412a.add(aVar);
    }
}
