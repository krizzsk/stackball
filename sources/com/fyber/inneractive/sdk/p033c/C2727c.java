package com.fyber.inneractive.sdk.p033c;

import com.fyber.inneractive.sdk.p045e.C2897a;
import com.fyber.inneractive.sdk.p051j.C3014a;
import com.fyber.inneractive.sdk.p051j.C3015b;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;

/* renamed from: com.fyber.inneractive.sdk.c.c */
public final class C2727c {

    /* renamed from: a */
    public final HashMap<C3014a, C2729b> f6414a;

    /* renamed from: com.fyber.inneractive.sdk.c.c$a */
    private static class C2728a {

        /* renamed from: a */
        public static C2727c f6415a = new C2727c((byte) 0);
    }

    /* renamed from: com.fyber.inneractive.sdk.c.c$b */
    public interface C2729b {
        /* renamed from: a */
        C3015b mo17969a();

        /* renamed from: b */
        C2897a mo17970b();
    }

    /* synthetic */ C2727c(byte b) {
        this();
    }

    private C2727c() {
        this.f6414a = new HashMap<>();
    }

    /* renamed from: a */
    public final C3015b mo17965a(C3014a aVar) {
        C2729b bVar = this.f6414a.get(aVar);
        if (bVar != null) {
            return bVar.mo17969a();
        }
        return null;
    }

    /* renamed from: b */
    public final C2897a mo17967b(C3014a aVar) {
        C2729b bVar = this.f6414a.get(aVar);
        if (bVar != null) {
            return bVar.mo17970b();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo17966a(C3014a aVar, C2729b bVar) {
        if (this.f6414a.containsKey(aVar)) {
            IAlog.m9036d("Handler already exists for ad type %s! : %s", aVar, this.f6414a.get(aVar));
            return;
        }
        this.f6414a.put(aVar, bVar);
    }

    /* renamed from: c */
    public final boolean mo17968c(C3014a aVar) {
        return this.f6414a.containsKey(aVar);
    }
}
