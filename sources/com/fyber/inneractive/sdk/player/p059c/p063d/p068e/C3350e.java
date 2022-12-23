package com.fyber.inneractive.sdk.player.p059c.p063d.p068e;

import com.fyber.inneractive.sdk.player.p059c.C3295l;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3269g;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.e.e */
final class C3350e {

    /* renamed from: k */
    private static final int f8859k = C3560t.m8893e("OggS");

    /* renamed from: a */
    public int f8860a;

    /* renamed from: b */
    public int f8861b;

    /* renamed from: c */
    public long f8862c;

    /* renamed from: d */
    public long f8863d;

    /* renamed from: e */
    public long f8864e;

    /* renamed from: f */
    public long f8865f;

    /* renamed from: g */
    public int f8866g;

    /* renamed from: h */
    public int f8867h;

    /* renamed from: i */
    public int f8868i;

    /* renamed from: j */
    public final int[] f8869j = new int[255];

    /* renamed from: l */
    private final C3548k f8870l = new C3548k(255);

    C3350e() {
    }

    /* renamed from: a */
    public final void mo19144a() {
        this.f8860a = 0;
        this.f8861b = 0;
        this.f8862c = 0;
        this.f8863d = 0;
        this.f8864e = 0;
        this.f8865f = 0;
        this.f8866g = 0;
        this.f8867h = 0;
        this.f8868i = 0;
    }

    /* renamed from: a */
    public final boolean mo19145a(C3269g gVar, boolean z) throws IOException, InterruptedException {
        this.f8870l.mo19378a();
        mo19144a();
        if (!(gVar.mo19015d() == -1 || gVar.mo19015d() - gVar.mo19008b() >= 27) || !gVar.mo19011b(this.f8870l.f9625a, 0, 27, true)) {
            if (z) {
                return false;
            }
            throw new EOFException();
        } else if (this.f8870l.mo19394h() == ((long) f8859k)) {
            int d = this.f8870l.mo19387d();
            this.f8860a = d;
            if (d == 0) {
                this.f8861b = this.f8870l.mo19387d();
                C3548k kVar = this.f8870l;
                byte[] bArr = kVar.f9625a;
                int i = kVar.f9626b;
                kVar.f9626b = i + 1;
                byte[] bArr2 = kVar.f9625a;
                int i2 = kVar.f9626b;
                kVar.f9626b = i2 + 1;
                long j = (((long) bArr[i]) & 255) | ((((long) bArr2[i2]) & 255) << 8);
                byte[] bArr3 = kVar.f9625a;
                int i3 = kVar.f9626b;
                kVar.f9626b = i3 + 1;
                long j2 = j | ((((long) bArr3[i3]) & 255) << 16);
                byte[] bArr4 = kVar.f9625a;
                int i4 = kVar.f9626b;
                kVar.f9626b = i4 + 1;
                long j3 = j2 | ((((long) bArr4[i4]) & 255) << 24);
                byte[] bArr5 = kVar.f9625a;
                int i5 = kVar.f9626b;
                kVar.f9626b = i5 + 1;
                long j4 = j3 | ((((long) bArr5[i5]) & 255) << 32);
                byte[] bArr6 = kVar.f9625a;
                int i6 = kVar.f9626b;
                kVar.f9626b = i6 + 1;
                long j5 = j4 | ((((long) bArr6[i6]) & 255) << 40);
                byte[] bArr7 = kVar.f9625a;
                int i7 = kVar.f9626b;
                kVar.f9626b = i7 + 1;
                long j6 = j5 | ((((long) bArr7[i7]) & 255) << 48);
                byte[] bArr8 = kVar.f9625a;
                int i8 = kVar.f9626b;
                kVar.f9626b = i8 + 1;
                this.f8862c = j6 | ((255 & ((long) bArr8[i8])) << 56);
                this.f8863d = this.f8870l.mo19395i();
                this.f8864e = this.f8870l.mo19395i();
                this.f8865f = this.f8870l.mo19395i();
                int d2 = this.f8870l.mo19387d();
                this.f8866g = d2;
                this.f8867h = d2 + 27;
                this.f8870l.mo19378a();
                gVar.mo19014c(this.f8870l.f9625a, 0, this.f8866g);
                for (int i9 = 0; i9 < this.f8866g; i9++) {
                    this.f8869j[i9] = this.f8870l.mo19387d();
                    this.f8868i += this.f8869j[i9];
                }
                return true;
            } else if (z) {
                return false;
            } else {
                throw new C3295l("unsupported bit stream revision");
            }
        } else if (z) {
            return false;
        } else {
            throw new C3295l("expected OggS capture pattern at begin of page");
        }
    }
}
