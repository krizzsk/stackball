package com.adcolony.sdk;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.adcolony.sdk.r0 */
class C0795r0 extends InputStream {

    /* renamed from: a */
    InputStream f1338a;

    /* renamed from: b */
    int f1339b;

    C0795r0(InputStream inputStream, int i, int i2) throws IOException {
        this.f1338a = inputStream;
        while (i > 0) {
            i -= (int) inputStream.skip((long) i);
        }
        this.f1339b = i2;
    }

    public int available() throws IOException {
        int available = this.f1338a.available();
        int i = this.f1339b;
        return available <= i ? available : i;
    }

    public void close() throws IOException {
        this.f1338a.close();
    }

    public int read() throws IOException {
        int i = this.f1339b;
        if (i == 0) {
            return -1;
        }
        this.f1339b = i - 1;
        return this.f1338a.read();
    }

    public long skip(long j) throws IOException {
        int i = (int) j;
        if (i <= 0) {
            return 0;
        }
        int i2 = this.f1339b;
        if (i > i2) {
            i = i2;
        }
        this.f1339b = i2 - i;
        while (i > 0) {
            i -= (int) this.f1338a.skip(j);
        }
        return j;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f1339b;
        if (i3 == 0) {
            return -1;
        }
        if (i2 > i3) {
            i2 = i3;
        }
        int read = this.f1338a.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        this.f1339b -= read;
        return read;
    }
}
