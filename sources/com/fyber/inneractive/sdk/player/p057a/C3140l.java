package com.fyber.inneractive.sdk.player.p057a;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: com.fyber.inneractive.sdk.player.a.l */
final class C3140l implements Closeable {

    /* renamed from: a */
    final Charset f7757a;

    /* renamed from: b */
    int f7758b;

    /* renamed from: c */
    private final InputStream f7759c;

    /* renamed from: d */
    private byte[] f7760d;

    /* renamed from: e */
    private int f7761e;

    public C3140l(InputStream inputStream, Charset charset) {
        this(inputStream, charset, (byte) 0);
    }

    private C3140l(InputStream inputStream, Charset charset, byte b) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (charset.equals(C3142m.f7763a)) {
            this.f7759c = inputStream;
            this.f7757a = charset;
            this.f7760d = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public final void close() throws IOException {
        synchronized (this.f7759c) {
            if (this.f7760d != null) {
                this.f7760d = null;
                this.f7759c.close();
            }
        }
    }

    /* renamed from: a */
    public final String mo18731a() throws IOException {
        int i;
        int i2;
        synchronized (this.f7759c) {
            if (this.f7760d != null) {
                if (this.f7761e >= this.f7758b) {
                    m7407b();
                }
                for (int i3 = this.f7761e; i3 != this.f7758b; i3++) {
                    if (this.f7760d[i3] == 10) {
                        if (i3 != this.f7761e) {
                            i2 = i3 - 1;
                            if (this.f7760d[i2] == 13) {
                                String str = new String(this.f7760d, this.f7761e, i2 - this.f7761e, this.f7757a.name());
                                this.f7761e = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(this.f7760d, this.f7761e, i2 - this.f7761e, this.f7757a.name());
                        this.f7761e = i3 + 1;
                        return str2;
                    }
                }
                C31411 r1 = new ByteArrayOutputStream((this.f7758b - this.f7761e) + 80) {
                    public final String toString() {
                        try {
                            return new String(this.buf, 0, (this.count <= 0 || this.buf[this.count + -1] != 13) ? this.count : this.count - 1, C3140l.this.f7757a.name());
                        } catch (UnsupportedEncodingException e) {
                            throw new AssertionError(e);
                        }
                    }
                };
                loop1:
                while (true) {
                    r1.write(this.f7760d, this.f7761e, this.f7758b - this.f7761e);
                    this.f7758b = -1;
                    m7407b();
                    i = this.f7761e;
                    while (true) {
                        if (i != this.f7758b) {
                            if (this.f7760d[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                if (i != this.f7761e) {
                    r1.write(this.f7760d, this.f7761e, i - this.f7761e);
                }
                this.f7761e = i + 1;
                String byteArrayOutputStream = r1.toString();
                return byteArrayOutputStream;
            }
            throw new IOException("LineReader is closed");
        }
    }

    /* renamed from: b */
    private void m7407b() throws IOException {
        InputStream inputStream = this.f7759c;
        byte[] bArr = this.f7760d;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f7761e = 0;
            this.f7758b = read;
            return;
        }
        throw new EOFException();
    }
}
