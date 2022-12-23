package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.mbridge.msdk.foundation.tools.l */
/* compiled from: SameBase64Tool */
public class C6348l {

    /* renamed from: a */
    private static final String f15742a = C6348l.class.getSimpleName();

    /* renamed from: b */
    private static Map<Character, Character> f15743b;

    /* renamed from: c */
    private static Map<Character, Character> f15744c;

    /* renamed from: d */
    private static char[] f15745d = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* renamed from: e */
    private static byte[] f15746e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.f10113VT, Ascii.f10102FF, Ascii.f10100CR, Ascii.f10110SO, Ascii.f10109SI, Ascii.DLE, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.f10101EM, -1, -1, -1, -1, -1, -1, Ascii.SUB, Ascii.ESC, Ascii.f10103FS, Ascii.f10104GS, Ascii.f10108RS, Ascii.f10112US, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    static {
        f15743b = null;
        f15744c = null;
        HashMap hashMap = new HashMap();
        f15744c = hashMap;
        hashMap.put('v', 'A');
        f15744c.put('S', 'B');
        f15744c.put('o', 'C');
        f15744c.put('a', 'D');
        f15744c.put('j', 'E');
        f15744c.put('c', 'F');
        f15744c.put('7', 'G');
        f15744c.put('d', 'H');
        f15744c.put('R', 'I');
        f15744c.put('z', 'J');
        f15744c.put('p', 'K');
        f15744c.put('W', 'L');
        f15744c.put('i', 'M');
        f15744c.put('f', 'N');
        f15744c.put('G', 'O');
        f15744c.put('y', 'P');
        f15744c.put('N', 'Q');
        f15744c.put('x', 'R');
        f15744c.put('Z', 'S');
        f15744c.put('n', 'T');
        f15744c.put('V', 'U');
        f15744c.put('5', 'V');
        f15744c.put('k', 'W');
        f15744c.put('+', 'X');
        f15744c.put('D', 'Y');
        f15744c.put('H', 'Z');
        f15744c.put('L', 'a');
        f15744c.put('Y', 'b');
        f15744c.put('h', 'c');
        f15744c.put('J', 'd');
        f15744c.put('4', 'e');
        f15744c.put('6', 'f');
        f15744c.put('l', 'g');
        f15744c.put('t', 'h');
        f15744c.put('0', 'i');
        f15744c.put('U', 'j');
        f15744c.put('3', 'k');
        f15744c.put('Q', 'l');
        f15744c.put('r', 'm');
        f15744c.put('g', 'n');
        f15744c.put('E', 'o');
        f15744c.put('u', 'p');
        f15744c.put('q', 'q');
        f15744c.put('8', 'r');
        f15744c.put('s', 's');
        f15744c.put('w', 't');
        f15744c.put('/', 'u');
        f15744c.put('X', 'v');
        f15744c.put('M', 'w');
        f15744c.put('e', 'x');
        f15744c.put('B', 'y');
        f15744c.put('A', 'z');
        f15744c.put('T', '0');
        f15744c.put('2', '1');
        f15744c.put('F', '2');
        f15744c.put('b', '3');
        f15744c.put('9', '4');
        f15744c.put('P', '5');
        f15744c.put('1', '6');
        f15744c.put('O', 55);
        f15744c.put('I', '8');
        f15744c.put('K', '9');
        f15744c.put('m', '+');
        f15744c.put(67, '/');
        HashMap hashMap2 = new HashMap();
        f15743b = hashMap2;
        hashMap2.put('A', 'v');
        f15743b.put('B', 'S');
        f15743b.put(67, 'o');
        f15743b.put('D', 'a');
        f15743b.put('E', 'j');
        f15743b.put('F', 'c');
        f15743b.put(71, 55);
        f15743b.put('H', 'd');
        f15743b.put('I', 'R');
        f15743b.put('J', 'z');
        f15743b.put('K', 'p');
        f15743b.put('L', 'W');
        f15743b.put('M', 'i');
        f15743b.put('N', 'f');
        f15743b.put('O', 71);
        f15743b.put('P', 'y');
        f15743b.put('Q', 'N');
        f15743b.put('R', 'x');
        f15743b.put('S', 'Z');
        f15743b.put('T', 'n');
        f15743b.put('U', 'V');
        f15743b.put('V', '5');
        f15743b.put('W', 'k');
        f15743b.put('X', '+');
        f15743b.put('Y', 'D');
        f15743b.put('Z', 'H');
        f15743b.put('a', 'L');
        f15743b.put('b', 'Y');
        f15743b.put('c', 'h');
        f15743b.put('d', 'J');
        f15743b.put('e', '4');
        f15743b.put('f', '6');
        f15743b.put('g', 'l');
        f15743b.put('h', 't');
        f15743b.put('i', '0');
        f15743b.put('j', 'U');
        f15743b.put('k', '3');
        f15743b.put('l', 'Q');
        f15743b.put('m', 'r');
        f15743b.put('n', 'g');
        f15743b.put('o', 'E');
        f15743b.put('p', 'u');
        f15743b.put('q', 'q');
        f15743b.put('r', '8');
        f15743b.put('s', 's');
        f15743b.put('t', 'w');
        f15743b.put('u', '/');
        f15743b.put('v', 'X');
        f15743b.put('w', 'M');
        f15743b.put('x', 'e');
        f15743b.put('y', 'B');
        f15743b.put('z', 'A');
        f15743b.put('0', 'T');
        f15743b.put('1', '2');
        f15743b.put('2', 70);
        f15743b.put('3', 'b');
        f15743b.put('4', '9');
        f15743b.put('5', 'P');
        f15743b.put('6', '1');
        f15743b.put(55, 'O');
        f15743b.put('8', 'I');
        f15743b.put('9', 'K');
        f15743b.put('+', 'm');
        f15743b.put('/', 67);
    }

    private C6348l() {
    }

    /* renamed from: a */
    public static String m16088a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            int i2 = i + 1;
            byte b = bArr[i] & 255;
            if (i2 == length) {
                stringBuffer.append(f15745d[b >>> 2]);
                stringBuffer.append(f15745d[(b & 3) << 4]);
                stringBuffer.append("==");
                break;
            }
            int i3 = i2 + 1;
            byte b2 = bArr[i2] & 255;
            if (i3 == length) {
                stringBuffer.append(f15745d[b >>> 2]);
                stringBuffer.append(f15745d[((b & 3) << 4) | ((b2 & 240) >>> 4)]);
                stringBuffer.append(f15745d[(b2 & Ascii.f10109SI) << 2]);
                stringBuffer.append("=");
                break;
            }
            int i4 = i3 + 1;
            byte b3 = bArr[i3] & 255;
            stringBuffer.append(f15745d[b >>> 2]);
            stringBuffer.append(f15745d[((b & 3) << 4) | ((b2 & 240) >>> 4)]);
            stringBuffer.append(f15745d[((b2 & Ascii.f10109SI) << 2) | ((b3 & 192) >>> 6)]);
            stringBuffer.append(f15745d[b3 & 63]);
            i = i4;
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static String m16087a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return C6362r.m16162b(str);
    }

    /* renamed from: b */
    public static String m16089b(String str) {
        return C6362r.m16160a(str);
    }
}
