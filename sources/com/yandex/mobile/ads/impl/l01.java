package com.yandex.mobile.ads.impl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class l01 extends ByteArrayOutputStream {

    /* renamed from: b */
    private final C12724cd f36484b;

    public l01(C12724cd cdVar, int i) {
        this.f36484b = cdVar;
        this.buf = cdVar.mo66255a(Math.max(i, 256));
    }

    /* renamed from: a */
    private void m38541a(int i) {
        int i2 = this.count + i;
        if (i2 > this.buf.length) {
            byte[] a = this.f36484b.mo66255a(i2 * 2);
            System.arraycopy(this.buf, 0, a, 0, this.count);
            this.f36484b.mo66254a(this.buf);
            this.buf = a;
        }
    }

    public void close() throws IOException {
        this.f36484b.mo66254a(this.buf);
        this.buf = null;
        super.close();
    }

    public void finalize() {
        this.f36484b.mo66254a(this.buf);
    }

    public synchronized void write(byte[] bArr, int i, int i2) {
        m38541a(i2);
        super.write(bArr, i, i2);
    }

    public synchronized void write(int i) {
        m38541a(1);
        super.write(i);
    }
}
