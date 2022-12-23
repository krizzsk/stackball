package com.yandex.mobile.ads.impl;

import androidx.collection.ArrayMap;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class g11 {

    /* renamed from: a */
    private final C13158a f33831a = new C13158a();

    /* renamed from: b */
    private final C13158a f33832b = new C13158a();

    /* renamed from: c */
    private final ArrayMap<String, C13158a> f33833c = new ArrayMap<>();

    /* renamed from: com.yandex.mobile.ads.impl.g11$a */
    private static final class C13158a {

        /* renamed from: a */
        private long f33834a;

        /* renamed from: b */
        private int f33835b;

        /* renamed from: a */
        public final long mo67154a() {
            return this.f33834a;
        }

        /* renamed from: b */
        public final long mo67156b() {
            int i = this.f33835b;
            if (i == 0) {
                return 0;
            }
            return this.f33834a / ((long) i);
        }

        /* renamed from: c */
        public final int mo67158c() {
            return this.f33835b;
        }

        /* renamed from: d */
        public final void mo67159d() {
            this.f33834a = 0;
            this.f33835b = 0;
        }

        /* renamed from: a */
        public final void mo67155a(long j) {
            this.f33834a += j;
        }

        /* renamed from: b */
        public final void mo67157b(long j) {
            this.f33834a += j;
            this.f33835b++;
        }
    }

    /* renamed from: a */
    public final void mo67149a(long j) {
        this.f33831a.mo67157b(j);
    }

    /* renamed from: b */
    public final void mo67152b(long j) {
        this.f33831a.mo67155a(j);
        if (j >= 1000000) {
            this.f33832b.mo67157b(j);
        }
    }

    /* renamed from: c */
    public final boolean mo67153c() {
        if (this.f33832b.mo67158c() > 0) {
            return true;
        }
        for (Map.Entry<String, C13158a> value : this.f33833c.entrySet()) {
            if (((C13158a) value.getValue()).mo67158c() > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo67150a(String str, long j) {
        Intrinsics.checkNotNullParameter(str, "viewName");
        this.f33831a.mo67157b(j);
        ArrayMap<String, C13158a> arrayMap = this.f33833c;
        C13158a aVar = arrayMap.get(str);
        if (aVar == null) {
            aVar = new C13158a();
            arrayMap.put(str, aVar);
        }
        aVar.mo67157b(j);
    }

    /* renamed from: b */
    public final Map<String, Object> mo67151b() {
        HashMap hashMap = new HashMap();
        hashMap.put("view obtaining - total count", Integer.valueOf(this.f33831a.mo67158c()));
        hashMap.put("view obtaining - total time (µs)", Long.valueOf(h11.m36764a(this.f33831a.mo67154a() / 1000)));
        for (Map.Entry next : this.f33833c.entrySet()) {
            String str = (String) next.getKey();
            C13158a aVar = (C13158a) next.getValue();
            if (aVar.mo67158c() > 0) {
                hashMap.put("blocking view obtaining for " + str + " - count", Integer.valueOf(aVar.mo67158c()));
                hashMap.put("blocking view obtaining for " + str + " - avg time (µs)", Long.valueOf(h11.m36764a(aVar.mo67156b() / 1000)));
            }
        }
        if (this.f33832b.mo67158c() > 0) {
            hashMap.put("long view requests - count", Integer.valueOf(this.f33832b.mo67158c()));
            hashMap.put("long view requests - avg time (µs)", Long.valueOf(h11.m36764a(this.f33832b.mo67156b() / 1000)));
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo67148a() {
        this.f33831a.mo67159d();
        this.f33832b.mo67159d();
        for (Map.Entry<String, C13158a> value : this.f33833c.entrySet()) {
            ((C13158a) value.getValue()).mo67159d();
        }
    }
}
