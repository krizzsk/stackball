package com.p243my.tracker.obfuscated;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* renamed from: com.my.tracker.obfuscated.o0 */
public final class C7860o0 {

    /* renamed from: a */
    public static final Charset f20128a = Charset.forName("UTF-8");

    /* renamed from: a */
    static int m21464a(double d, OutputStream outputStream) {
        long doubleToRawLongBits = Double.doubleToRawLongBits(d);
        outputStream.write(((int) doubleToRawLongBits) & 255);
        outputStream.write(((int) (doubleToRawLongBits >> 8)) & 255);
        outputStream.write(((int) (doubleToRawLongBits >> 16)) & 255);
        outputStream.write(((int) (doubleToRawLongBits >> 24)) & 255);
        outputStream.write(((int) (doubleToRawLongBits >> 32)) & 255);
        outputStream.write(((int) (doubleToRawLongBits >> 40)) & 255);
        outputStream.write(((int) (doubleToRawLongBits >> 48)) & 255);
        outputStream.write(((int) (doubleToRawLongBits >> 56)) & 255);
        return 8;
    }

    /* renamed from: a */
    static int m21465a(float f, OutputStream outputStream) {
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        outputStream.write(floatToRawIntBits & 255);
        outputStream.write((floatToRawIntBits >> 8) & 255);
        outputStream.write((floatToRawIntBits >> 16) & 255);
        outputStream.write((floatToRawIntBits >> 24) & 255);
        return 4;
    }

    /* renamed from: a */
    public static int m21466a(int i, double d, OutputStream outputStream) {
        return m21468a(i, 1, outputStream) + m21464a(d, outputStream);
    }

    /* renamed from: a */
    public static int m21467a(int i, float f, OutputStream outputStream) {
        return m21468a(i, 5, outputStream) + m21465a(f, outputStream);
    }

    /* renamed from: a */
    static int m21468a(int i, int i2, OutputStream outputStream) {
        return m21471a((i << 3) | i2, outputStream);
    }

    /* renamed from: a */
    public static int m21469a(int i, long j, OutputStream outputStream) {
        return m21468a(i, 0, outputStream) + m21475a(j, outputStream);
    }

    /* renamed from: a */
    public static int m21470a(int i, ByteArrayOutputStream byteArrayOutputStream, OutputStream outputStream) {
        if (byteArrayOutputStream == null) {
            return 0;
        }
        return m21468a(i, 2, outputStream) + m21476a(byteArrayOutputStream, outputStream);
    }

    /* renamed from: a */
    static int m21471a(int i, OutputStream outputStream) {
        int i2 = 0;
        while (true) {
            i2++;
            if ((i & -128) == 0) {
                outputStream.write(i);
                return i2;
            }
            outputStream.write((i & 127) | 128);
            i >>>= 7;
        }
    }

    /* renamed from: a */
    public static int m21472a(int i, String str, OutputStream outputStream) {
        if (str == null) {
            return 0;
        }
        return m21468a(i, 2, outputStream) + m21477a(str, outputStream);
    }

    /* renamed from: a */
    public static int m21473a(int i, byte[] bArr, OutputStream outputStream) {
        if (bArr == null) {
            return 0;
        }
        return m21468a(i, 2, outputStream) + m21478a(bArr, outputStream);
    }

    /* renamed from: a */
    public static int m21474a(int i, String[] strArr, OutputStream outputStream) {
        if (strArr == null) {
            return 0;
        }
        int i2 = 0;
        for (String a : strArr) {
            i2 += m21472a(i, a, outputStream);
        }
        return i2;
    }

    /* renamed from: a */
    static int m21475a(long j, OutputStream outputStream) {
        int i = 0;
        while (true) {
            i++;
            if ((-128 & j) == 0) {
                outputStream.write((int) j);
                return i;
            }
            outputStream.write(((int) (127 & j)) | 128);
            j >>>= 7;
        }
    }

    /* renamed from: a */
    static int m21476a(ByteArrayOutputStream byteArrayOutputStream, OutputStream outputStream) {
        int size = byteArrayOutputStream.size();
        int b = m21480b(size, outputStream) + size;
        byteArrayOutputStream.writeTo(outputStream);
        return b;
    }

    /* renamed from: a */
    static int m21477a(String str, OutputStream outputStream) {
        return m21478a(str.getBytes(f20128a), outputStream);
    }

    /* renamed from: a */
    static int m21478a(byte[] bArr, OutputStream outputStream) {
        int b = m21480b(bArr.length, outputStream) + bArr.length;
        outputStream.write(bArr);
        return b;
    }

    /* renamed from: b */
    public static int m21479b(int i, int i2, OutputStream outputStream) {
        return m21468a(i, 0, outputStream) + m21480b(i2, outputStream);
    }

    /* renamed from: b */
    static int m21480b(int i, OutputStream outputStream) {
        return i < 0 ? m21475a((long) i, outputStream) : m21471a(i, outputStream);
    }
}
