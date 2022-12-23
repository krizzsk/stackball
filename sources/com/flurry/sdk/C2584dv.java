package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.flurry.sdk.dv */
public final class C2584dv<T> implements C2587dw<List<T>> {

    /* renamed from: a */
    C2587dw<T> f6058a;

    public C2584dv(C2587dw<T> dwVar) {
        this.f6058a = dwVar;
    }

    /* renamed from: a */
    public final void mo17563a(OutputStream outputStream, List<T> list) throws IOException {
        if (outputStream != null) {
            C25851 r0 = new DataOutputStream(outputStream) {
                public final void close() {
                }
            };
            int size = list != null ? list.size() : 0;
            r0.writeInt(size);
            for (int i = 0; i < size; i++) {
                this.f6058a.mo17563a(outputStream, list.get(i));
            }
            r0.flush();
        }
    }

    /* renamed from: b */
    public final List<T> mo17562a(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        int readInt = new DataInputStream(inputStream) {
            public final void close() {
            }
        }.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        int i = 0;
        while (i < readInt) {
            T a = this.f6058a.mo17562a(inputStream);
            if (a != null) {
                arrayList.add(a);
                i++;
            } else {
                throw new IOException("Missing record.");
            }
        }
        return arrayList;
    }
}
