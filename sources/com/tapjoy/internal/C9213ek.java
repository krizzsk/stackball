package com.tapjoy.internal;

import com.google.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: com.tapjoy.internal.ek */
public final class C9213ek {

    /* renamed from: a */
    final C9433it f22618a;

    /* renamed from: b */
    private long f22619b = 0;

    /* renamed from: c */
    private long f22620c = Long.MAX_VALUE;

    /* renamed from: d */
    private int f22621d;

    /* renamed from: e */
    private int f22622e = 2;

    /* renamed from: f */
    private int f22623f = -1;

    /* renamed from: g */
    private long f22624g = -1;

    /* renamed from: h */
    private C9192eg f22625h;

    public C9213ek(C9433it itVar) {
        this.f22618a = itVar;
    }

    /* renamed from: a */
    public final long mo58000a() {
        if (this.f22622e == 2) {
            int i = this.f22621d + 1;
            this.f22621d = i;
            if (i <= 65) {
                long j = this.f22624g;
                this.f22624g = -1;
                this.f22622e = 6;
                return j;
            }
            throw new IOException("Wire recursion limit exceeded");
        }
        throw new IllegalStateException("Unexpected call to beginMessage()");
    }

    /* renamed from: a */
    public final void mo58001a(long j) {
        if (this.f22622e == 6) {
            int i = this.f22621d - 1;
            this.f22621d = i;
            if (i < 0 || this.f22624g != -1) {
                throw new IllegalStateException("No corresponding call to beginMessage()");
            } else if (this.f22619b == this.f22620c || i == 0) {
                this.f22620c = j;
            } else {
                throw new IOException("Expected to end at " + this.f22620c + " but was " + this.f22619b);
            }
        } else {
            throw new IllegalStateException("Unexpected call to endMessage()");
        }
    }

    /* renamed from: b */
    public final int mo58002b() {
        int i = this.f22622e;
        if (i == 7) {
            this.f22622e = 2;
            return this.f22623f;
        } else if (i == 6) {
            while (this.f22619b < this.f22620c && !this.f22618a.mo58387b()) {
                int i2 = m24653i();
                if (i2 != 0) {
                    int i3 = i2 >> 3;
                    this.f22623f = i3;
                    int i4 = i2 & 7;
                    if (i4 == 0) {
                        this.f22625h = C9192eg.VARINT;
                        this.f22622e = 0;
                        return this.f22623f;
                    } else if (i4 == 1) {
                        this.f22625h = C9192eg.FIXED64;
                        this.f22622e = 1;
                        return this.f22623f;
                    } else if (i4 == 2) {
                        this.f22625h = C9192eg.LENGTH_DELIMITED;
                        this.f22622e = 2;
                        int i5 = m24653i();
                        if (i5 < 0) {
                            throw new ProtocolException("Negative length: " + i5);
                        } else if (this.f22624g == -1) {
                            long j = this.f22620c;
                            this.f22624g = j;
                            long j2 = this.f22619b + ((long) i5);
                            this.f22620c = j2;
                            if (j2 <= j) {
                                return this.f22623f;
                            }
                            throw new EOFException();
                        } else {
                            throw new IllegalStateException();
                        }
                    } else if (i4 == 3) {
                        m24651a(i3);
                    } else if (i4 == 4) {
                        throw new ProtocolException("Unexpected end group");
                    } else if (i4 == 5) {
                        this.f22625h = C9192eg.FIXED32;
                        this.f22622e = 5;
                        return this.f22623f;
                    } else {
                        throw new ProtocolException("Unexpected field encoding: " + i4);
                    }
                } else {
                    throw new ProtocolException("Unexpected tag 0");
                }
            }
            return -1;
        } else {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
    }

    /* renamed from: c */
    public final C9192eg mo58003c() {
        return this.f22625h;
    }

    /* renamed from: a */
    private void m24651a(int i) {
        while (this.f22619b < this.f22620c && !this.f22618a.mo58387b()) {
            int i2 = m24653i();
            if (i2 != 0) {
                int i3 = i2 >> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    this.f22622e = 0;
                    mo58005e();
                } else if (i4 == 1) {
                    this.f22622e = 1;
                    mo58007g();
                } else if (i4 == 2) {
                    long i5 = (long) m24653i();
                    this.f22619b += i5;
                    this.f22618a.mo58395d(i5);
                } else if (i4 == 3) {
                    m24651a(i3);
                } else if (i4 != 4) {
                    if (i4 == 5) {
                        this.f22622e = 5;
                        mo58006f();
                    } else {
                        throw new ProtocolException("Unexpected field encoding: " + i4);
                    }
                } else if (i3 != i) {
                    throw new ProtocolException("Unexpected end group");
                } else {
                    return;
                }
            } else {
                throw new ProtocolException("Unexpected tag 0");
            }
        }
        throw new EOFException();
    }

    /* renamed from: d */
    public final int mo58004d() {
        int i = this.f22622e;
        if (i == 0 || i == 2) {
            int i2 = m24653i();
            m24652b(0);
            return i2;
        }
        throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.f22622e);
    }

    /* renamed from: i */
    private int m24653i() {
        int i;
        this.f22619b++;
        byte c = this.f22618a.mo58388c();
        if (c >= 0) {
            return c;
        }
        byte b = c & Byte.MAX_VALUE;
        this.f22619b++;
        byte c2 = this.f22618a.mo58388c();
        if (c2 >= 0) {
            i = c2 << 7;
        } else {
            b |= (c2 & Byte.MAX_VALUE) << 7;
            this.f22619b++;
            byte c3 = this.f22618a.mo58388c();
            if (c3 >= 0) {
                i = c3 << Ascii.f10110SO;
            } else {
                b |= (c3 & Byte.MAX_VALUE) << Ascii.f10110SO;
                this.f22619b++;
                byte c4 = this.f22618a.mo58388c();
                if (c4 >= 0) {
                    i = c4 << Ascii.NAK;
                } else {
                    byte b2 = b | ((c4 & Byte.MAX_VALUE) << Ascii.NAK);
                    this.f22619b++;
                    byte c5 = this.f22618a.mo58388c();
                    byte b3 = b2 | (c5 << Ascii.f10103FS);
                    if (c5 >= 0) {
                        return b3;
                    }
                    for (int i2 = 0; i2 < 5; i2++) {
                        this.f22619b++;
                        if (this.f22618a.mo58388c() >= 0) {
                            return b3;
                        }
                    }
                    throw new ProtocolException("Malformed VARINT");
                }
            }
        }
        return b | i;
    }

    /* renamed from: e */
    public final long mo58005e() {
        int i = this.f22622e;
        if (i == 0 || i == 2) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                this.f22619b++;
                byte c = this.f22618a.mo58388c();
                j |= ((long) (c & Byte.MAX_VALUE)) << i2;
                if ((c & 128) == 0) {
                    m24652b(0);
                    return j;
                }
            }
            throw new ProtocolException("WireInput encountered a malformed varint");
        }
        throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.f22622e);
    }

    /* renamed from: f */
    public final int mo58006f() {
        int i = this.f22622e;
        if (i == 5 || i == 2) {
            this.f22618a.mo58380a(4);
            this.f22619b += 4;
            int e = this.f22618a.mo58396e();
            m24652b(5);
            return e;
        }
        throw new ProtocolException("Expected FIXED32 or LENGTH_DELIMITED but was " + this.f22622e);
    }

    /* renamed from: g */
    public final long mo58007g() {
        int i = this.f22622e;
        if (i == 1 || i == 2) {
            this.f22618a.mo58380a(8);
            this.f22619b += 8;
            long f = this.f22618a.mo58400f();
            m24652b(1);
            return f;
        }
        throw new ProtocolException("Expected FIXED64 or LENGTH_DELIMITED but was " + this.f22622e);
    }

    /* renamed from: b */
    private void m24652b(int i) {
        if (this.f22622e == i) {
            this.f22622e = 6;
            return;
        }
        long j = this.f22619b;
        long j2 = this.f22620c;
        if (j > j2) {
            throw new IOException("Expected to end at " + this.f22620c + " but was " + this.f22619b);
        } else if (j == j2) {
            this.f22620c = this.f22624g;
            this.f22624g = -1;
            this.f22622e = 6;
        } else {
            this.f22622e = 7;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final long mo58008h() {
        if (this.f22622e == 2) {
            long j = this.f22620c - this.f22619b;
            this.f22618a.mo58380a(j);
            this.f22622e = 6;
            this.f22619b = this.f22620c;
            this.f22620c = this.f22624g;
            this.f22624g = -1;
            return j;
        }
        throw new ProtocolException("Expected LENGTH_DELIMITED but was " + this.f22622e);
    }
}
