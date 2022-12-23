package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11658ph;
import com.yandex.metrica.impl.p265ob.C11831v0;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.U1 */
public abstract class C10795U1<T extends C11658ph> extends C10907X1<T, C11831v0.C11832a> {

    /* renamed from: o */
    private final C11325hn f25902o;

    /* renamed from: p */
    private final C11889vm f25903p;

    /* renamed from: q */
    private final C10616Om f25904q;

    public C10795U1(T t) {
        this(new C11772t0(), new C11325hn(), new C11889vm(), new C10580Nm(), t);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public abstract void mo61730C();

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public abstract void mo61731D();

    /* renamed from: a */
    public void mo62252a(byte[] bArr) {
        super.mo62252a(bArr);
    }

    /* renamed from: c */
    public boolean mo62328c(byte[] bArr) {
        byte[] a;
        try {
            this.f25903p.getClass();
            byte[] b = C10823V0.m27969b(bArr);
            if (b == null || (a = this.f25902o.mo63023a(b)) == null) {
                return false;
            }
            super.mo62252a(a);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: p */
    public boolean mo62265p() {
        boolean p = super.mo62265p();
        mo62248a(this.f25904q.mo61840a());
        return p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public boolean mo61648r() {
        C11831v0.C11832a aVar = (C11831v0.C11832a) mo62463B();
        boolean z = aVar != null && "accepted".equals(aVar.f28443a);
        if (z) {
            mo61730C();
        } else if (mo62263m()) {
            mo61731D();
        }
        return z;
    }

    public C10795U1(C10737S1 s1, C11325hn hnVar, C11889vm vmVar, C10616Om om, T t) {
        super(s1, t);
        this.f25902o = hnVar;
        this.f25903p = vmVar;
        this.f25904q = om;
        t.mo63514a(hnVar);
    }
}
