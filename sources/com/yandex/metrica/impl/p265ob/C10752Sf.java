package com.yandex.metrica.impl.p265ob;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.Sf */
public final class C10752Sf extends C11169e {

    /* renamed from: b */
    public byte[] f25778b;

    public C10752Sf() {
        mo62232b();
    }

    /* renamed from: a */
    public void mo61540a(C11056b bVar) throws IOException {
        if (!Arrays.equals(this.f25778b, C11256g.f26930d)) {
            bVar.mo62668b(1, this.f25778b);
        }
    }

    /* renamed from: b */
    public C10752Sf mo62232b() {
        this.f25778b = C11256g.f26930d;
        this.f26754a = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo61538a() {
        if (!Arrays.equals(this.f25778b, C11256g.f26930d)) {
            return 0 + C11056b.m28526a(1, this.f25778b);
        }
        return 0;
    }

    /* renamed from: a */
    public C11169e mo61539a(C11009a aVar) throws IOException {
        while (true) {
            int l = aVar.mo62628l();
            if (l == 0) {
                break;
            } else if (l == 10) {
                this.f25778b = aVar.mo62616d();
            } else if (!aVar.mo62621f(l)) {
                break;
            }
        }
        return this;
    }
}
