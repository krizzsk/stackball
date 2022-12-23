package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.flurry.sdk.dy */
public final class C2589dy<T> implements C2587dw<T> {

    /* renamed from: a */
    private final String f6061a;

    /* renamed from: b */
    private final int f6062b;

    /* renamed from: c */
    private final C2592dz<T> f6063c;

    public C2589dy(String str, int i, C2592dz<T> dzVar) {
        this.f6061a = str;
        this.f6062b = i;
        this.f6063c = dzVar;
    }

    /* renamed from: a */
    public final void mo17563a(OutputStream outputStream, T t) throws IOException {
        if (outputStream != null && this.f6063c != null) {
            C25901 r0 = new DataOutputStream(outputStream) {
                public final void close() {
                }
            };
            r0.writeUTF(this.f6061a);
            r0.writeInt(this.f6062b);
            this.f6063c.mo17575a(this.f6062b).mo17563a(r0, t);
            r0.flush();
        }
    }

    /* renamed from: a */
    public final T mo17562a(InputStream inputStream) throws IOException {
        if (inputStream == null || this.f6063c == null) {
            return null;
        }
        C25912 r0 = new DataInputStream(inputStream) {
            public final void close() {
            }
        };
        String readUTF = r0.readUTF();
        if (this.f6061a.equals(readUTF)) {
            return this.f6063c.mo17575a(r0.readInt()).mo17562a(r0);
        }
        throw new IOException("Signature: " + readUTF + " is invalid");
    }
}
