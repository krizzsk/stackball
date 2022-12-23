package com.mbridge.msdk.foundation.tools;

import com.google.common.base.Ascii;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.mbridge.msdk.foundation.tools.r */
/* compiled from: SameMVEncoder */
public final class C6362r {

    /* renamed from: a */
    private static Map<Character, Character> f15777a;

    /* renamed from: b */
    private static final char[] f15778b = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* renamed from: c */
    private static char[] f15779c = new char[f15778b.length];

    /* renamed from: d */
    private static final byte[] f15780d = new byte[128];

    static {
        HashMap hashMap = new HashMap();
        f15777a = hashMap;
        hashMap.put('A', 'v');
        f15777a.put('B', 'S');
        f15777a.put('C', 'o');
        f15777a.put('D', 'a');
        f15777a.put('E', 'j');
        f15777a.put('F', 'c');
        f15777a.put('G', '7');
        f15777a.put('H', 'd');
        f15777a.put('I', 'R');
        f15777a.put('J', 'z');
        f15777a.put('K', 'p');
        f15777a.put('L', 'W');
        f15777a.put('M', 'i');
        f15777a.put('N', 'f');
        f15777a.put('O', 'G');
        f15777a.put('P', 'y');
        f15777a.put('Q', 'N');
        f15777a.put('R', 'x');
        f15777a.put('S', 'Z');
        f15777a.put('T', 'n');
        f15777a.put('U', 'V');
        f15777a.put('V', '5');
        f15777a.put('W', 'k');
        f15777a.put('X', '+');
        f15777a.put('Y', 'D');
        f15777a.put('Z', 'H');
        f15777a.put('a', 'L');
        f15777a.put('b', 'Y');
        f15777a.put('c', 'h');
        f15777a.put('d', 'J');
        f15777a.put('e', '4');
        f15777a.put('f', '6');
        f15777a.put('g', 'l');
        f15777a.put('h', 't');
        f15777a.put('i', '0');
        f15777a.put('j', 'U');
        f15777a.put('k', '3');
        f15777a.put('l', 'Q');
        f15777a.put('m', 'r');
        f15777a.put('n', 'g');
        f15777a.put('o', 'E');
        f15777a.put('p', 'u');
        f15777a.put('q', 'q');
        f15777a.put('r', '8');
        f15777a.put('s', 's');
        f15777a.put('t', 'w');
        f15777a.put('u', '/');
        f15777a.put('v', 'X');
        f15777a.put('w', 'M');
        f15777a.put('x', 'e');
        f15777a.put('y', 'B');
        f15777a.put('z', 'A');
        f15777a.put('0', 'T');
        f15777a.put('1', '2');
        f15777a.put('2', 'F');
        f15777a.put('3', 'b');
        f15777a.put('4', '9');
        f15777a.put('5', 'P');
        f15777a.put('6', '1');
        f15777a.put(55, 'O');
        f15777a.put('8', 'I');
        f15777a.put('9', 'K');
        f15777a.put('+', 'm');
        f15777a.put('/', 67);
        int i = 0;
        int i2 = 0;
        while (true) {
            char[] cArr = f15778b;
            if (i2 >= cArr.length) {
                break;
            }
            f15779c[i2] = f15777a.get(Character.valueOf(cArr[i2])).charValue();
            i2++;
        }
        int i3 = 0;
        while (true) {
            byte[] bArr = f15780d;
            if (i3 >= bArr.length) {
                break;
            }
            bArr[i3] = Byte.MAX_VALUE;
            i3++;
        }
        while (true) {
            char[] cArr2 = f15779c;
            if (i < cArr2.length) {
                f15780d[cArr2[i]] = (byte) i;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static int m16159a(char[] cArr, byte[] bArr, int i) {
        try {
            char c = cArr[3] == '=' ? (char) 2 : 3;
            if (cArr[2] == '=') {
                c = 1;
            }
            byte b = f15780d[cArr[0]];
            byte b2 = f15780d[cArr[1]];
            byte b3 = f15780d[cArr[2]];
            byte b4 = f15780d[cArr[3]];
            if (c == 1) {
                bArr[i] = (byte) (((b << 2) & 252) | (3 & (b2 >> 4)));
                return 1;
            } else if (c == 2) {
                bArr[i] = (byte) ((3 & (b2 >> 4)) | ((b << 2) & 252));
                bArr[i + 1] = (byte) (((b2 << 4) & 240) | ((b3 >> 2) & 15));
                return 2;
            } else if (c == 3) {
                int i2 = i + 1;
                bArr[i] = (byte) (((b << 2) & 252) | ((b2 >> 4) & 3));
                bArr[i2] = (byte) (((b2 << 4) & 240) | ((b3 >> 2) & 15));
                bArr[i2 + 1] = (byte) ((b4 & 63) | ((b3 << 6) & 192));
                return 3;
            } else {
                throw new RuntimeException("Internal Error");
            }
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static String m16160a(String str) {
        byte[] c = m16163c(str);
        if (c == null || c.length <= 0) {
            return null;
        }
        return new String(c);
    }

    /* renamed from: c */
    private static byte[] m16163c(String str) {
        int i;
        try {
            int length = str.length();
            int i2 = 259;
            if (length < 259) {
                i2 = length;
            }
            char[] cArr = new char[i2];
            int i3 = ((length >> 2) * 3) + 3;
            byte[] bArr = new byte[i3];
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (i4 < length) {
                int i7 = i4 + 256;
                if (i7 <= length) {
                    str.getChars(i4, i7, cArr, i6);
                    i = i6 + 256;
                } else {
                    str.getChars(i4, length, cArr, i6);
                    i = (length - i4) + i6;
                }
                int i8 = i6;
                while (i6 < i) {
                    char c = cArr[i6];
                    if (c == '=' || (c < f15780d.length && f15780d[c] != Byte.MAX_VALUE)) {
                        int i9 = i8 + 1;
                        cArr[i8] = c;
                        if (i9 == 4) {
                            i5 += m16159a(cArr, bArr, i5);
                            i8 = 0;
                        } else {
                            i8 = i9;
                        }
                    }
                    i6++;
                }
                i4 = i7;
                i6 = i8;
            }
            if (i5 == i3) {
                return bArr;
            }
            byte[] bArr2 = new byte[i5];
            System.arraycopy(bArr, 0, bArr2, 0, i5);
            return bArr2;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m16162b(String str) {
        byte[] bytes = str.getBytes();
        return m16161a(bytes, 0, bytes.length);
    }

    /* renamed from: a */
    private static String m16161a(byte[] bArr, int i, int i2) {
        if (i2 <= 0) {
            return "";
        }
        try {
            char[] cArr = new char[(((i2 / 3) << 2) + 4)];
            int i3 = 0;
            while (i2 >= 3) {
                int i4 = ((bArr[i] & 255) << Ascii.DLE) + ((bArr[i + 1] & 255) << 8) + (bArr[i + 2] & 255);
                int i5 = i3 + 1;
                cArr[i3] = f15779c[i4 >> 18];
                int i6 = i5 + 1;
                cArr[i5] = f15779c[(i4 >> 12) & 63];
                int i7 = i6 + 1;
                cArr[i6] = f15779c[(i4 >> 6) & 63];
                i3 = i7 + 1;
                cArr[i7] = f15779c[i4 & 63];
                i += 3;
                i2 -= 3;
            }
            if (i2 == 1) {
                byte b = bArr[i] & 255;
                int i8 = i3 + 1;
                cArr[i3] = f15779c[b >> 2];
                int i9 = i8 + 1;
                cArr[i8] = f15779c[(b << 4) & 63];
                int i10 = i9 + 1;
                cArr[i9] = '=';
                i3 = i10 + 1;
                cArr[i10] = '=';
            } else if (i2 == 2) {
                int i11 = ((bArr[i] & 255) << 8) + (bArr[i + 1] & 255);
                int i12 = i3 + 1;
                cArr[i3] = f15779c[i11 >> 10];
                int i13 = i12 + 1;
                cArr[i12] = f15779c[(i11 >> 4) & 63];
                int i14 = i13 + 1;
                cArr[i13] = f15779c[(i11 << 2) & 63];
                i3 = i14 + 1;
                cArr[i14] = '=';
            }
            return new String(cArr, 0, i3);
        } catch (Exception unused) {
            return null;
        }
    }
}
