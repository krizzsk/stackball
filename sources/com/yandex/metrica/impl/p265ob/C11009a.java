package com.yandex.metrica.impl.p265ob;

import com.google.common.base.Ascii;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.a */
public final class C11009a {

    /* renamed from: a */
    private final byte[] f26486a;

    /* renamed from: b */
    private int f26487b;

    /* renamed from: c */
    private int f26488c;

    /* renamed from: d */
    private int f26489d;

    /* renamed from: e */
    private int f26490e;

    /* renamed from: f */
    private int f26491f;

    /* renamed from: g */
    private int f26492g = Integer.MAX_VALUE;

    /* renamed from: h */
    private int f26493h;

    private C11009a(byte[] bArr, int i, int i2) {
        this.f26486a = bArr;
        this.f26487b = i;
        this.f26488c = i2 + i;
        this.f26490e = i;
    }

    /* renamed from: a */
    public static C11009a m28418a(byte[] bArr, int i, int i2) {
        return new C11009a(bArr, i, i2);
    }

    /* renamed from: m */
    private void m28419m() {
        int i = this.f26488c + this.f26489d;
        this.f26488c = i;
        int i2 = this.f26492g;
        if (i > i2) {
            int i3 = i - i2;
            this.f26489d = i3;
            this.f26488c = i - i3;
            return;
        }
        this.f26489d = 0;
    }

    /* renamed from: b */
    public void mo62613b(int i) {
        this.f26492g = i;
        m28419m();
    }

    /* renamed from: c */
    public boolean mo62615c() throws IOException {
        return mo62624h() != 0;
    }

    /* renamed from: d */
    public byte[] mo62616d() throws IOException {
        int h = mo62624h();
        int i = this.f26488c;
        int i2 = this.f26490e;
        if (h > i - i2 || h <= 0) {
            return mo62617d(h);
        }
        byte[] bArr = new byte[h];
        System.arraycopy(this.f26486a, i2, bArr, 0, h);
        this.f26490e += h;
        return bArr;
    }

    /* renamed from: e */
    public void mo62619e(int i) {
        int i2 = this.f26490e;
        int i3 = this.f26487b;
        if (i > i2 - i3) {
            throw new IllegalArgumentException("Position " + i + " is beyond current " + (this.f26490e - this.f26487b));
        } else if (i >= 0) {
            this.f26490e = i3 + i;
        } else {
            throw new IllegalArgumentException("Bad position " + i);
        }
    }

    /* renamed from: f */
    public boolean mo62621f(int i) throws IOException {
        int l;
        int i2 = i & 7;
        if (i2 == 0) {
            mo62624h();
            return true;
        } else if (i2 == 1) {
            mo62622g();
            return true;
        } else if (i2 == 2) {
            mo62623g(mo62624h());
            return true;
        } else if (i2 == 3) {
            do {
                l = mo62628l();
                if (l == 0 || !mo62621f(l)) {
                    mo62610a(C11256g.m29011a(i >>> 3, 4));
                }
                l = mo62628l();
                break;
            } while (!mo62621f(l));
            mo62610a(C11256g.m29011a(i >>> 3, 4));
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                mo62620f();
                return true;
            }
            throw new C11124d("Protocol message tag had invalid wire type.");
        }
    }

    /* renamed from: g */
    public long mo62622g() throws IOException {
        byte e = mo62618e();
        byte e2 = mo62618e();
        return ((((long) e2) & 255) << 8) | (((long) e) & 255) | ((((long) mo62618e()) & 255) << 16) | ((((long) mo62618e()) & 255) << 24) | ((((long) mo62618e()) & 255) << 32) | ((((long) mo62618e()) & 255) << 40) | ((((long) mo62618e()) & 255) << 48) | ((((long) mo62618e()) & 255) << 56);
    }

    /* renamed from: h */
    public int mo62624h() throws IOException {
        int i;
        byte e = mo62618e();
        if (e >= 0) {
            return e;
        }
        byte b = e & Byte.MAX_VALUE;
        byte e2 = mo62618e();
        if (e2 >= 0) {
            i = e2 << 7;
        } else {
            b |= (e2 & Byte.MAX_VALUE) << 7;
            byte e3 = mo62618e();
            if (e3 >= 0) {
                i = e3 << Ascii.f10110SO;
            } else {
                b |= (e3 & Byte.MAX_VALUE) << Ascii.f10110SO;
                byte e4 = mo62618e();
                if (e4 >= 0) {
                    i = e4 << Ascii.NAK;
                } else {
                    byte b2 = b | ((e4 & Byte.MAX_VALUE) << Ascii.NAK);
                    byte e5 = mo62618e();
                    byte b3 = b2 | (e5 << Ascii.f10103FS);
                    if (e5 >= 0) {
                        return b3;
                    }
                    for (int i2 = 0; i2 < 5; i2++) {
                        if (mo62618e() >= 0) {
                            return b3;
                        }
                    }
                    throw new C11124d("CodedInputStream encountered a malformed varint.");
                }
            }
        }
        return b | i;
    }

    /* renamed from: i */
    public long mo62625i() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte e = mo62618e();
            j |= ((long) (e & Byte.MAX_VALUE)) << i;
            if ((e & 128) == 0) {
                return j;
            }
        }
        throw new C11124d("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: j */
    public int mo62626j() throws IOException {
        int h = mo62624h();
        return (-(h & 1)) ^ (h >>> 1);
    }

    /* renamed from: k */
    public String mo62627k() throws IOException {
        int h = mo62624h();
        if (h > this.f26488c - this.f26490e || h <= 0) {
            return new String(mo62617d(h), "UTF-8");
        }
        String str = new String(this.f26486a, this.f26490e, h, "UTF-8");
        this.f26490e += h;
        return str;
    }

    /* renamed from: l */
    public int mo62628l() throws IOException {
        if (this.f26490e == this.f26488c) {
            this.f26491f = 0;
            return 0;
        }
        int h = mo62624h();
        this.f26491f = h;
        if (h != 0) {
            return h;
        }
        throw new C11124d("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: a */
    public void mo62610a(int i) throws C11124d {
        if (this.f26491f != i) {
            throw new C11124d("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* renamed from: c */
    public int mo62614c(int i) throws C11124d {
        if (i >= 0) {
            int i2 = i + this.f26490e;
            int i3 = this.f26492g;
            if (i2 <= i3) {
                this.f26492g = i2;
                m28419m();
                return i3;
            }
            throw C11124d.m28665b();
        }
        throw C11124d.m28664a();
    }

    /* renamed from: b */
    public int mo62612b() {
        return this.f26490e - this.f26487b;
    }

    /* renamed from: a */
    public void mo62611a(C11169e eVar) throws IOException {
        int h = mo62624h();
        if (this.f26493h < 64) {
            int c = mo62614c(h);
            this.f26493h++;
            eVar.mo61539a(this);
            mo62610a(0);
            this.f26493h--;
            this.f26492g = c;
            m28419m();
            return;
        }
        throw new C11124d("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: g */
    public void mo62623g(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.f26490e;
            int i3 = i2 + i;
            int i4 = this.f26492g;
            if (i3 > i4) {
                mo62623g(i4 - i2);
                throw C11124d.m28665b();
            } else if (i <= this.f26488c - i2) {
                this.f26490e = i3;
            } else {
                throw C11124d.m28665b();
            }
        } else {
            throw C11124d.m28664a();
        }
    }

    /* renamed from: f */
    public int mo62620f() throws IOException {
        return (mo62618e() & 255) | ((mo62618e() & 255) << 8) | ((mo62618e() & 255) << Ascii.DLE) | ((mo62618e() & 255) << Ascii.CAN);
    }

    /* renamed from: e */
    public byte mo62618e() throws IOException {
        int i = this.f26490e;
        if (i != this.f26488c) {
            byte[] bArr = this.f26486a;
            this.f26490e = i + 1;
            return bArr[i];
        }
        throw C11124d.m28665b();
    }

    /* renamed from: d */
    public byte[] mo62617d(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.f26490e;
            int i3 = i2 + i;
            int i4 = this.f26492g;
            if (i3 > i4) {
                mo62623g(i4 - i2);
                throw C11124d.m28665b();
            } else if (i <= this.f26488c - i2) {
                byte[] bArr = new byte[i];
                System.arraycopy(this.f26486a, i2, bArr, 0, i);
                this.f26490e += i;
                return bArr;
            } else {
                throw C11124d.m28665b();
            }
        } else {
            throw C11124d.m28664a();
        }
    }

    /* renamed from: a */
    public int mo62609a() {
        int i = this.f26492g;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.f26490e;
    }
}
