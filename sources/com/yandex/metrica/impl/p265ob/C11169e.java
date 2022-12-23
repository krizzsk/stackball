package com.yandex.metrica.impl.p265ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.e */
public abstract class C11169e {

    /* renamed from: a */
    protected volatile int f26754a = -1;

    /* renamed from: a */
    public static final byte[] m28804a(C11169e eVar) {
        int a = eVar.mo61538a();
        eVar.f26754a = a;
        byte[] bArr = new byte[a];
        try {
            C11056b a2 = C11056b.m28530a(bArr, 0, a);
            eVar.mo61540a(a2);
            a2.mo62661a();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo61538a() {
        return 0;
    }

    /* renamed from: a */
    public abstract C11169e mo61539a(C11009a aVar) throws IOException;

    /* renamed from: a */
    public void mo61540a(C11056b bVar) throws IOException {
    }

    public String toString() {
        return C11220f.m28897a(this);
    }

    /* renamed from: a */
    public static final <T extends C11169e> T m28803a(T t, byte[] bArr) throws C11124d {
        try {
            C11009a a = C11009a.m28418a(bArr, 0, bArr.length);
            t.mo61539a(a);
            a.mo62610a(0);
            return t;
        } catch (C11124d e) {
            throw e;
        } catch (IOException unused) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }
}
