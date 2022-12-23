package com.fyber.inneractive.sdk.player.p059c.p063d.p068e;

import com.fyber.inneractive.sdk.player.p059c.C3290h;
import com.fyber.inneractive.sdk.player.p059c.p062c.C3227a;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3269g;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3276m;
import com.fyber.inneractive.sdk.player.p059c.p063d.p068e.C3353h;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3540e;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.e.b */
final class C3345b extends C3353h {

    /* renamed from: a */
    C3540e f8845a;

    /* renamed from: d */
    private C3346a f8846d;

    C3345b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo19141a(boolean z) {
        super.mo19141a(z);
        if (z) {
            this.f8845a = null;
            this.f8846d = null;
        }
    }

    /* renamed from: a */
    private static boolean m8276a(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo19140a(C3548k kVar) {
        int i;
        int i2;
        int i3;
        int i4;
        if (!m8276a(kVar.f9625a)) {
            return -1;
        }
        int i5 = (kVar.f9625a[2] & 255) >> 4;
        switch (i5) {
            case 1:
                i = 192;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                i2 = 576;
                i3 = i5 - 2;
                break;
            case 6:
            case 7:
                kVar.mo19388d(4);
                long j = (long) kVar.f9625a[kVar.f9626b];
                int i6 = 7;
                while (true) {
                    if (i6 >= 0) {
                        int i7 = 1 << i6;
                        if ((((long) i7) & j) != 0) {
                            i6--;
                        } else if (i6 < 6) {
                            j &= (long) (i7 - 1);
                            i4 = 7 - i6;
                        } else if (i6 == 7) {
                            i4 = 1;
                        }
                    }
                }
                i4 = 0;
                if (i4 != 0) {
                    int i8 = 1;
                    while (i8 < i4) {
                        byte b = kVar.f9625a[kVar.f9626b + i8];
                        if ((b & 192) == 128) {
                            j = (j << 6) | ((long) (b & 63));
                            i8++;
                        } else {
                            throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
                        }
                    }
                    kVar.f9626b += i4;
                    int d = i5 == 6 ? kVar.mo19387d() : kVar.mo19389e();
                    kVar.mo19386c(0);
                    i = d + 1;
                    break;
                } else {
                    throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
                }
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i2 = 256;
                i3 = i5 - 8;
                break;
            default:
                i = -1;
                break;
        }
        i = i2 << i3;
        return (long) i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo19142a(C3548k kVar, long j, C3353h.C3354a aVar) throws IOException, InterruptedException {
        C3548k kVar2 = kVar;
        C3353h.C3354a aVar2 = aVar;
        byte[] bArr = kVar2.f9625a;
        if (this.f8845a == null) {
            this.f8845a = new C3540e(bArr);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 9, kVar2.f9627c);
            copyOfRange[4] = Byte.MIN_VALUE;
            List singletonList = Collections.singletonList(copyOfRange);
            C3540e eVar = this.f8845a;
            aVar2.f8887a = C3290h.m8115a((String) null, "audio/flac", -1, eVar.f9600g * eVar.f9598e, this.f8845a.f9599f, this.f8845a.f9598e, singletonList, (C3227a) null, (String) null);
        } else {
            if ((bArr[0] & Byte.MAX_VALUE) == 3) {
                C3346a aVar3 = new C3346a();
                this.f8846d = aVar3;
                kVar2.mo19388d(1);
                int g = kVar.mo19393g() / 18;
                aVar3.f8847a = new long[g];
                aVar3.f8848b = new long[g];
                for (int i = 0; i < g; i++) {
                    aVar3.f8847a[i] = kVar.mo19398l();
                    aVar3.f8848b[i] = kVar.mo19398l();
                    kVar2.mo19388d(2);
                }
            } else if (m8276a(bArr)) {
                C3346a aVar4 = this.f8846d;
                if (aVar4 != null) {
                    aVar4.f8849c = j;
                    aVar2.f8888b = this.f8846d;
                }
                return false;
            }
        }
        return true;
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.e.b$a */
    private class C3346a implements C3351f, C3276m {

        /* renamed from: a */
        long[] f8847a;

        /* renamed from: b */
        long[] f8848b;

        /* renamed from: c */
        long f8849c = -1;

        /* renamed from: e */
        private long f8851e = -1;

        /* renamed from: a */
        public final C3276m mo19138a() {
            return this;
        }

        /* renamed from: b_ */
        public final boolean mo18995b_() {
            return true;
        }

        public C3346a() {
        }

        /* renamed from: a */
        public final long mo19137a(C3269g gVar) throws IOException, InterruptedException {
            long j = this.f8851e;
            if (j < 0) {
                return -1;
            }
            long j2 = -(j + 2);
            this.f8851e = -1;
            return j2;
        }

        /* renamed from: a_ */
        public final long mo19139a_(long j) {
            long b = C3345b.this.mo19151b(j);
            this.f8851e = this.f8847a[C3560t.m8874a(this.f8847a, b, true)];
            return b;
        }

        /* renamed from: a */
        public final long mo18993a(long j) {
            return this.f8849c + this.f8848b[C3560t.m8874a(this.f8847a, C3345b.this.mo19151b(j), true)];
        }

        /* renamed from: b */
        public final long mo18994b() {
            C3540e eVar = C3345b.this.f8845a;
            return (eVar.f9601h * 1000000) / ((long) eVar.f9598e);
        }
    }
}
