package com.fyber.inneractive.sdk.player.p059c.p078j.p079a;

import com.fyber.inneractive.sdk.player.p059c.p078j.C3504f;
import com.fyber.inneractive.sdk.player.p059c.p078j.C3509i;
import com.fyber.inneractive.sdk.player.p059c.p078j.p079a.C3480a;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3535a;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3552o;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.fyber.inneractive.sdk.player.c.j.a.b */
public final class C3483b implements C3504f {

    /* renamed from: a */
    private final C3480a f9414a;

    /* renamed from: b */
    private final long f9415b;

    /* renamed from: c */
    private final int f9416c;

    /* renamed from: d */
    private C3509i f9417d;

    /* renamed from: e */
    private File f9418e;

    /* renamed from: f */
    private OutputStream f9419f;

    /* renamed from: g */
    private FileOutputStream f9420g;

    /* renamed from: h */
    private long f9421h;

    /* renamed from: i */
    private long f9422i;

    /* renamed from: j */
    private C3552o f9423j;

    /* renamed from: com.fyber.inneractive.sdk.player.c.j.a.b$a */
    public static class C3484a extends C3480a.C3481a {
        public C3484a(IOException iOException) {
            super(iOException);
        }
    }

    public C3483b(C3480a aVar, long j, int i) {
        this.f9414a = (C3480a) C3535a.m8781a(aVar);
        this.f9415b = j;
        this.f9416c = i;
    }

    /* renamed from: a */
    public final void mo19322a(C3509i iVar) throws C3484a {
        if (iVar.f9502e != -1 || iVar.mo19345a(2)) {
            this.f9417d = iVar;
            this.f9422i = 0;
            try {
                m8653b();
            } catch (IOException e) {
                throw new C3484a(e);
            }
        } else {
            this.f9417d = null;
        }
    }

    /* renamed from: a */
    public final void mo19323a(byte[] bArr, int i, int i2) throws C3484a {
        if (this.f9417d != null) {
            int i3 = 0;
            while (i3 < i2) {
                try {
                    if (this.f9421h == this.f9415b) {
                        m8654c();
                        m8653b();
                    }
                    int min = (int) Math.min((long) (i2 - i3), this.f9415b - this.f9421h);
                    this.f9419f.write(bArr, i + i3, min);
                    i3 += min;
                    long j = (long) min;
                    this.f9421h += j;
                    this.f9422i += j;
                } catch (IOException e) {
                    throw new C3484a(e);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo19321a() throws C3484a {
        if (this.f9417d != null) {
            try {
                m8654c();
            } catch (IOException e) {
                throw new C3484a(e);
            }
        }
    }

    /* renamed from: b */
    private void m8653b() throws IOException {
        long j;
        if (this.f9417d.f9502e == -1) {
            j = this.f9415b;
        } else {
            j = Math.min(this.f9417d.f9502e - this.f9422i, this.f9415b);
        }
        C3480a aVar = this.f9414a;
        String str = this.f9417d.f9503f;
        this.f9418e = aVar.mo19312a(str, this.f9422i + this.f9417d.f9500c, j);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f9418e);
        this.f9420g = fileOutputStream;
        if (this.f9416c > 0) {
            C3552o oVar = this.f9423j;
            if (oVar == null) {
                this.f9423j = new C3552o(this.f9420g, this.f9416c);
            } else {
                oVar.mo19414a(fileOutputStream);
            }
            this.f9419f = this.f9423j;
        } else {
            this.f9419f = fileOutputStream;
        }
        this.f9421h = 0;
    }

    /* renamed from: c */
    private void m8654c() throws IOException {
        OutputStream outputStream = this.f9419f;
        if (outputStream != null) {
            try {
                outputStream.flush();
                this.f9420g.getFD().sync();
                C3560t.m8881a((Closeable) this.f9419f);
                this.f9419f = null;
                File file = this.f9418e;
                this.f9418e = null;
                this.f9414a.mo19314a(file);
            } catch (Throwable th) {
                C3560t.m8881a((Closeable) this.f9419f);
                this.f9419f = null;
                File file2 = this.f9418e;
                this.f9418e = null;
                file2.delete();
                throw th;
            }
        }
    }
}
