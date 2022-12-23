package com.fyber.inneractive.sdk.p033c;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.p045e.C2900c;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.fyber.inneractive.sdk.c.d */
public final class C2730d {

    /* renamed from: a */
    public final Set<C2731a> f6416a;

    /* renamed from: com.fyber.inneractive.sdk.c.d$a */
    public interface C2731a {
        /* renamed from: a */
        boolean mo17973a(InneractiveAdSpot inneractiveAdSpot);

        /* renamed from: b */
        C2900c mo17974b(InneractiveAdSpot inneractiveAdSpot);
    }

    /* renamed from: com.fyber.inneractive.sdk.c.d$b */
    private static class C2732b {

        /* renamed from: a */
        public static C2730d f6417a = new C2730d((byte) 0);
    }

    /* synthetic */ C2730d(byte b) {
        this();
    }

    private C2730d() {
        this.f6416a = new HashSet();
    }

    /* renamed from: a */
    public final C2900c mo17971a(InneractiveAdSpot inneractiveAdSpot) {
        for (C2731a next : this.f6416a) {
            if (next.mo17973a(inneractiveAdSpot)) {
                return next.mo17974b(inneractiveAdSpot);
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo17972a(C2731a aVar) {
        this.f6416a.add(aVar);
    }
}
