package com.yandex.metrica.impl.p265ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.V9 */
public class C10835V9<T> implements C10879W9<T> {

    /* renamed from: a */
    private final C10879W9<T> f26001a;

    /* renamed from: b */
    private final C11218en f26002b;

    public C10835V9(C10879W9<T> w9, C11218en enVar) {
        this.f26001a = w9;
        this.f26002b = enVar;
    }

    /* renamed from: a */
    public byte[] mo61715a(T t) {
        try {
            return this.f26002b.mo62846a(this.f26001a.mo61715a(t));
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    /* renamed from: a */
    public T mo61391a(byte[] bArr) throws IOException {
        try {
            C11218en enVar = this.f26002b;
            enVar.getClass();
            return this.f26001a.mo61391a(enVar.mo62847a(bArr, 0, bArr.length));
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* renamed from: a */
    public T mo61390a() {
        return this.f26001a.mo61390a();
    }
}
