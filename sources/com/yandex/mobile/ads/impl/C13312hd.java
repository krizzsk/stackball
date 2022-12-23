package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C12966ed;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.yandex.mobile.ads.impl.hd */
public final class C13312hd implements C13207gj {

    /* renamed from: a */
    private final C12966ed f34366a;

    /* renamed from: b */
    private final long f34367b;

    /* renamed from: c */
    private final int f34368c;

    /* renamed from: d */
    private C13504jj f34369d;

    /* renamed from: e */
    private long f34370e;

    /* renamed from: f */
    private File f34371f;

    /* renamed from: g */
    private OutputStream f34372g;

    /* renamed from: h */
    private long f34373h;

    /* renamed from: i */
    private long f34374i;

    /* renamed from: j */
    private m51 f34375j;

    /* renamed from: com.yandex.mobile.ads.impl.hd$a */
    public static class C13313a extends C12966ed.C12967a {
        public C13313a(IOException iOException) {
            super((Throwable) iOException);
        }
    }

    public C13312hd(C12966ed edVar, long j) {
        this(edVar, j, 20480);
    }

    /* renamed from: b */
    private void m36922b() throws IOException {
        long j = this.f34369d.f35328g;
        long j2 = -1;
        if (j != -1) {
            j2 = Math.min(j - this.f34374i, this.f34370e);
        }
        C12966ed edVar = this.f34366a;
        C13504jj jjVar = this.f34369d;
        this.f34371f = edVar.mo66807a(jjVar.f35329h, jjVar.f35326e + this.f34374i, j2);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f34371f);
        if (this.f34368c > 0) {
            m51 m51 = this.f34375j;
            if (m51 == null) {
                this.f34375j = new m51(fileOutputStream, this.f34368c);
            } else {
                m51.mo68578a(fileOutputStream);
            }
            this.f34372g = this.f34375j;
        } else {
            this.f34372g = fileOutputStream;
        }
        this.f34373h = 0;
    }

    /* renamed from: a */
    public void mo67310a(C13504jj jjVar) throws C13313a {
        if (jjVar.f35328g != -1 || !jjVar.mo68007b(2)) {
            this.f34369d = jjVar;
            this.f34370e = jjVar.mo68007b(4) ? this.f34367b : Long.MAX_VALUE;
            this.f34374i = 0;
            try {
                m36922b();
            } catch (IOException e) {
                throw new C13313a(e);
            }
        } else {
            this.f34369d = null;
        }
    }

    public void close() throws C13313a {
        if (this.f34369d != null) {
            try {
                m36921a();
            } catch (IOException e) {
                throw new C13313a(e);
            }
        }
    }

    public C13312hd(C12966ed edVar, long j, int i) {
        C13479j9.m37709b(j > 0 || j == -1, "fragmentSize must be positive or C.LENGTH_UNSET.");
        int i2 = (j > -1 ? 1 : (j == -1 ? 0 : -1));
        if (i2 != 0 && j < 2097152) {
            bk0.m34270b("CacheDataSink", "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        this.f34366a = (C12966ed) C13479j9.m37703a(edVar);
        this.f34367b = i2 == 0 ? Long.MAX_VALUE : j;
        this.f34368c = i;
    }

    /* renamed from: a */
    public void mo67311a(byte[] bArr, int i, int i2) throws C13313a {
        if (this.f34369d != null) {
            int i3 = 0;
            while (i3 < i2) {
                try {
                    if (this.f34373h == this.f34370e) {
                        m36921a();
                        m36922b();
                    }
                    int min = (int) Math.min((long) (i2 - i3), this.f34370e - this.f34373h);
                    this.f34372g.write(bArr, i + i3, min);
                    i3 += min;
                    long j = (long) min;
                    this.f34373h += j;
                    this.f34374i += j;
                } catch (IOException e) {
                    throw new C13313a(e);
                }
            }
        }
    }

    /* renamed from: a */
    private void m36921a() throws IOException {
        OutputStream outputStream = this.f34372g;
        if (outputStream != null) {
            try {
                outputStream.flush();
                ih1.m37379a((Closeable) this.f34372g);
                this.f34372g = null;
                File file = this.f34371f;
                this.f34371f = null;
                this.f34366a.mo66809a(file, this.f34373h);
            } catch (Throwable th) {
                ih1.m37379a((Closeable) this.f34372g);
                this.f34372g = null;
                File file2 = this.f34371f;
                this.f34371f = null;
                file2.delete();
                throw th;
            }
        }
    }
}
