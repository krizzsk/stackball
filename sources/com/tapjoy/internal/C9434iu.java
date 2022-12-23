package com.tapjoy.internal;

import com.google.common.base.Ascii;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: com.tapjoy.internal.iu */
public class C9434iu implements Serializable, Comparable {

    /* renamed from: a */
    static final char[] f23448a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    public static final C9434iu f23449b = new C9434iu((byte[]) new byte[0].clone());

    /* renamed from: c */
    final byte[] f23450c;

    /* renamed from: d */
    transient int f23451d;

    /* renamed from: e */
    transient String f23452e;

    public /* synthetic */ int compareTo(Object obj) {
        C9434iu iuVar = (C9434iu) obj;
        int c = mo58413c();
        int c2 = iuVar.mo58413c();
        int min = Math.min(c, c2);
        for (int i = 0; i < min; i++) {
            byte a = mo58407a(i) & 255;
            byte a2 = iuVar.mo58407a(i) & 255;
            if (a != a2) {
                return a < a2 ? -1 : 1;
            }
        }
        if (c == c2) {
            return 0;
        }
        return c < c2 ? -1 : 1;
    }

    public C9434iu(byte[] bArr) {
        this.f23450c = bArr;
    }

    /* renamed from: a */
    public String mo58409a() {
        String str = this.f23452e;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f23450c, C9448je.f23478a);
        this.f23452e = str2;
        return str2;
    }

    /* renamed from: b */
    public String mo58412b() {
        byte[] bArr = this.f23450c;
        char[] cArr = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f23448a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & Ascii.f10109SI];
        }
        return new String(cArr);
    }

    /* renamed from: a */
    public C9434iu mo58408a(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.f23450c;
            if (i2 <= bArr.length) {
                int i3 = i2 - i;
                if (i3 < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else if (i == 0 && i2 == bArr.length) {
                    return this;
                } else {
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(this.f23450c, i, bArr2, 0, i3);
                    return new C9434iu(bArr2);
                }
            } else {
                throw new IllegalArgumentException("endIndex > length(" + this.f23450c.length + ")");
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0");
        }
    }

    /* renamed from: a */
    public byte mo58407a(int i) {
        return this.f23450c[i];
    }

    /* renamed from: c */
    public int mo58413c() {
        return this.f23450c.length;
    }

    /* renamed from: d */
    public byte[] mo58415d() {
        return (byte[]) this.f23450c.clone();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo58410a(C9431ir irVar) {
        byte[] bArr = this.f23450c;
        irVar.mo58378a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public boolean mo58411a(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.f23450c;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C9448je.m25406a(bArr2, i, bArr, i2, i3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9434iu) {
            C9434iu iuVar = (C9434iu) obj;
            int c = iuVar.mo58413c();
            byte[] bArr = this.f23450c;
            return c == bArr.length && iuVar.mo58411a(0, bArr, 0, bArr.length);
        }
    }

    public int hashCode() {
        int i = this.f23451d;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f23450c);
        this.f23451d = hashCode;
        return hashCode;
    }

    public String toString() {
        if (this.f23450c.length == 0) {
            return "[size=0]";
        }
        String a = mo58409a();
        int length = a.length();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                i = a.length();
                break;
            } else if (i2 == 64) {
                break;
            } else {
                int codePointAt = a.codePointAt(i);
                if ((!Character.isISOControl(codePointAt) || codePointAt == 10 || codePointAt == 13) && codePointAt != 65533) {
                    i2++;
                    i += Character.charCount(codePointAt);
                }
            }
        }
        i = -1;
        if (i != -1) {
            String replace = a.substring(0, i).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (i < a.length()) {
                return "[size=" + this.f23450c.length + " text=" + replace + "…]";
            }
            return "[text=" + replace + "]";
        } else if (this.f23450c.length <= 64) {
            return "[hex=" + mo58412b() + "]";
        } else {
            return "[size=" + this.f23450c.length + " hex=" + mo58408a(0, 64).mo58412b() + "…]";
        }
    }
}
