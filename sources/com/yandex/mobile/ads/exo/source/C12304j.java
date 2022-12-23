package com.yandex.mobile.ads.exo.source;

import com.yandex.mobile.ads.exo.source.C12306k;
import com.yandex.mobile.ads.impl.C13383i7;
import com.yandex.mobile.ads.impl.C13416ik;
import com.yandex.mobile.ads.impl.C13477j7;
import com.yandex.mobile.ads.impl.C14387qj;
import com.yandex.mobile.ads.impl.C14463ri;
import com.yandex.mobile.ads.impl.C15174xj;
import com.yandex.mobile.ads.impl.fy0;
import com.yandex.mobile.ads.impl.ke1;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.exo.source.j */
class C12304j {

    /* renamed from: a */
    private final C13477j7 f30177a;

    /* renamed from: b */
    private final int f30178b;

    /* renamed from: c */
    private final fy0 f30179c = new fy0(32);

    /* renamed from: d */
    private C12305a f30180d;

    /* renamed from: e */
    private C12305a f30181e;

    /* renamed from: f */
    private C12305a f30182f;

    /* renamed from: g */
    private long f30183g;

    /* renamed from: com.yandex.mobile.ads.exo.source.j$a */
    private static final class C12305a {

        /* renamed from: a */
        public final long f30184a;

        /* renamed from: b */
        public final long f30185b;

        /* renamed from: c */
        public boolean f30186c;

        /* renamed from: d */
        public C13383i7 f30187d;

        /* renamed from: e */
        public C12305a f30188e;

        public C12305a(long j, int i) {
            this.f30184a = j;
            this.f30185b = j + ((long) i);
        }

        /* renamed from: a */
        public int mo65332a(long j) {
            return ((int) (j - this.f30184a)) + this.f30187d.f34753b;
        }
    }

    public C12304j(C13477j7 j7Var) {
        this.f30177a = j7Var;
        int b = ((C15174xj) j7Var).mo70903b();
        this.f30178b = b;
        C12305a aVar = new C12305a(0, b);
        this.f30180d = aVar;
        this.f30181e = aVar;
        this.f30182f = aVar;
    }

    /* renamed from: a */
    public void mo65329a(C14387qj qjVar, C12306k.C12307a aVar) {
        int i;
        C14387qj qjVar2 = qjVar;
        C12306k.C12307a aVar2 = aVar;
        if (qjVar.mo69602h()) {
            long j = aVar2.f30216b;
            this.f30179c.mo67108c(1);
            m32389a(j, this.f30179c.f33778a, 1);
            long j2 = j + 1;
            byte b = this.f30179c.f33778a[0];
            boolean z = (b & 128) != 0;
            byte b2 = b & Byte.MAX_VALUE;
            C14463ri riVar = qjVar2.f39146c;
            byte[] bArr = riVar.f39464a;
            if (bArr == null) {
                riVar.f39464a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            m32389a(j2, riVar.f39464a, (int) b2);
            long j3 = j2 + ((long) b2);
            if (z) {
                this.f30179c.mo67108c(2);
                m32389a(j3, this.f30179c.f33778a, 2);
                j3 += 2;
                i = this.f30179c.mo67132x();
            } else {
                i = 1;
            }
            int[] iArr = riVar.f39465b;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = riVar.f39466c;
            if (iArr3 == null || iArr3.length < i) {
                iArr3 = new int[i];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i2 = i * 6;
                this.f30179c.mo67108c(i2);
                m32389a(j3, this.f30179c.f33778a, i2);
                j3 += (long) i2;
                this.f30179c.mo67112e(0);
                for (int i3 = 0; i3 < i; i3++) {
                    iArr2[i3] = this.f30179c.mo67132x();
                    iArr4[i3] = this.f30179c.mo67130v();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = aVar2.f30215a - ((int) (j3 - aVar2.f30216b));
            }
            ke1.C13702a aVar3 = aVar2.f30217c;
            riVar.mo69767a(i, iArr2, iArr4, aVar3.f36113b, riVar.f39464a, aVar3.f36112a, aVar3.f36114c, aVar3.f36115d);
            long j4 = aVar2.f30216b;
            int i4 = (int) (j3 - j4);
            aVar2.f30216b = j4 + ((long) i4);
            aVar2.f30215a -= i4;
        }
        if (qjVar.mo71017c()) {
            this.f30179c.mo67108c(4);
            m32389a(aVar2.f30216b, this.f30179c.f33778a, 4);
            int v = this.f30179c.mo67130v();
            aVar2.f30216b += 4;
            aVar2.f30215a -= 4;
            qjVar2.mo69601g(v);
            m32388a(aVar2.f30216b, qjVar2.f39147d, v);
            aVar2.f30216b += (long) v;
            int i5 = aVar2.f30215a - v;
            aVar2.f30215a = i5;
            ByteBuffer byteBuffer = qjVar2.f39150g;
            if (byteBuffer == null || byteBuffer.capacity() < i5) {
                qjVar2.f39150g = ByteBuffer.allocate(i5);
            } else {
                qjVar2.f39150g.clear();
            }
            m32388a(aVar2.f30216b, qjVar2.f39150g, aVar2.f30215a);
            return;
        }
        qjVar2.mo69601g(aVar2.f30215a);
        m32388a(aVar2.f30216b, qjVar2.f39147d, aVar2.f30215a);
    }

    /* renamed from: b */
    public void mo65330b() {
        C12305a aVar = this.f30180d;
        if (aVar.f30186c) {
            C12305a aVar2 = this.f30182f;
            int i = (aVar2.f30186c ? 1 : 0) + (((int) (aVar2.f30184a - aVar.f30184a)) / this.f30178b);
            C13383i7[] i7VarArr = new C13383i7[i];
            int i2 = 0;
            while (i2 < i) {
                i7VarArr[i2] = aVar.f30187d;
                aVar.f30187d = null;
                C12305a aVar3 = aVar.f30188e;
                aVar.f30188e = null;
                i2++;
                aVar = aVar3;
            }
            ((C15174xj) this.f30177a).mo70902a(i7VarArr);
        }
        C12305a aVar4 = new C12305a(0, this.f30178b);
        this.f30180d = aVar4;
        this.f30181e = aVar4;
        this.f30182f = aVar4;
        this.f30183g = 0;
        ((C15174xj) this.f30177a).mo70906e();
    }

    /* renamed from: c */
    public void mo65331c() {
        this.f30181e = this.f30180d;
    }

    /* renamed from: b */
    private int m32390b(int i) {
        C12305a aVar = this.f30182f;
        if (!aVar.f30186c) {
            C13383i7 a = ((C15174xj) this.f30177a).mo70899a();
            C12305a aVar2 = new C12305a(this.f30182f.f30185b, this.f30178b);
            aVar.f30187d = a;
            aVar.f30188e = aVar2;
            aVar.f30186c = true;
        }
        return Math.min(i, (int) (this.f30182f.f30185b - this.f30183g));
    }

    /* renamed from: a */
    public void mo65327a(long j) {
        C12305a aVar;
        if (j != -1) {
            while (true) {
                aVar = this.f30180d;
                if (j < aVar.f30185b) {
                    break;
                }
                ((C15174xj) this.f30177a).mo70901a(aVar.f30187d);
                C12305a aVar2 = this.f30180d;
                aVar2.f30187d = null;
                C12305a aVar3 = aVar2.f30188e;
                aVar2.f30188e = null;
                this.f30180d = aVar3;
            }
            if (this.f30181e.f30184a < aVar.f30184a) {
                this.f30181e = aVar;
            }
        }
    }

    /* renamed from: a */
    public long mo65326a() {
        return this.f30183g;
    }

    /* renamed from: a */
    public int mo65325a(C13416ik ikVar, int i, boolean z) throws IOException, InterruptedException {
        int b = m32390b(i);
        C12305a aVar = this.f30182f;
        int b2 = ikVar.mo67807b(aVar.f30187d.f34752a, aVar.mo65332a(this.f30183g), b);
        if (b2 != -1) {
            m32387a(b2);
            return b2;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: a */
    public void mo65328a(fy0 fy0, int i) {
        while (i > 0) {
            int b = m32390b(i);
            C12305a aVar = this.f30182f;
            fy0.mo67104a(aVar.f30187d.f34752a, aVar.mo65332a(this.f30183g), b);
            i -= b;
            m32387a(b);
        }
    }

    /* renamed from: a */
    private void m32388a(long j, ByteBuffer byteBuffer, int i) {
        while (true) {
            C12305a aVar = this.f30181e;
            if (j < aVar.f30185b) {
                break;
            }
            this.f30181e = aVar.f30188e;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (this.f30181e.f30185b - j));
            C12305a aVar2 = this.f30181e;
            byteBuffer.put(aVar2.f30187d.f34752a, aVar2.mo65332a(j), min);
            i -= min;
            j += (long) min;
            C12305a aVar3 = this.f30181e;
            if (j == aVar3.f30185b) {
                this.f30181e = aVar3.f30188e;
            }
        }
    }

    /* renamed from: a */
    private void m32389a(long j, byte[] bArr, int i) {
        while (true) {
            C12305a aVar = this.f30181e;
            if (j < aVar.f30185b) {
                break;
            }
            this.f30181e = aVar.f30188e;
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (this.f30181e.f30185b - j));
            C12305a aVar2 = this.f30181e;
            System.arraycopy(aVar2.f30187d.f34752a, aVar2.mo65332a(j), bArr, i - i2, min);
            i2 -= min;
            j += (long) min;
            C12305a aVar3 = this.f30181e;
            if (j == aVar3.f30185b) {
                this.f30181e = aVar3.f30188e;
            }
        }
    }

    /* renamed from: a */
    private void m32387a(int i) {
        long j = this.f30183g + ((long) i);
        this.f30183g = j;
        C12305a aVar = this.f30182f;
        if (j == aVar.f30185b) {
            this.f30182f = aVar.f30188e;
        }
    }
}
