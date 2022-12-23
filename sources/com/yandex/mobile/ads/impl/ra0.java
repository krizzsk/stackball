package com.yandex.mobile.ads.impl;

import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.internal.security.CertificateUtil;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Buffer;

public final class ra0 {
    /* renamed from: a */
    public static final String m41511a(String str) {
        InetAddress inetAddress;
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i = 0;
        int i2 = -1;
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) CertificateUtil.DELIMITER, false, 2, (Object) null)) {
            if (!StringsKt.startsWith$default(str, "[", false, 2, (Object) null) || !StringsKt.endsWith$default(str, "]", false, 2, (Object) null)) {
                inetAddress = m41512a(str, 0, str.length());
            } else {
                inetAddress = m41512a(str, 1, str.length() - 1);
            }
            if (inetAddress == null) {
                return null;
            }
            byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                Intrinsics.checkNotNullExpressionValue(address, IntegrityManager.INTEGRITY_TYPE_ADDRESS);
                int i3 = 0;
                int i4 = 0;
                while (i3 < address.length) {
                    int i5 = i3;
                    while (i5 < 16 && address[i5] == 0 && address[i5 + 1] == 0) {
                        i5 += 2;
                    }
                    int i6 = i5 - i3;
                    if (i6 > i4 && i6 >= 4) {
                        i2 = i3;
                        i4 = i6;
                    }
                    i3 = i5 + 2;
                }
                Buffer buffer = new Buffer();
                while (i < address.length) {
                    if (i == i2) {
                        buffer.writeByte(58);
                        i += i4;
                        if (i == 16) {
                            buffer.writeByte(58);
                        }
                    } else {
                        if (i > 0) {
                            buffer.writeByte(58);
                        }
                        byte b = address[i];
                        byte[] bArr = jh1.f35305a;
                        buffer.writeHexadecimalUnsignedLong((long) (((b & 255) << 8) | (address[i + 1] & 255)));
                        i += 2;
                    }
                }
                return buffer.readUtf8();
            } else if (address.length == 4) {
                return inetAddress.getHostAddress();
            } else {
                throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
            }
        } else {
            try {
                String ascii = IDN.toASCII(str);
                Intrinsics.checkNotNullExpressionValue(ascii, "toASCII(host)");
                Locale locale = Locale.US;
                Intrinsics.checkNotNullExpressionValue(locale, "US");
                String lowerCase = ascii.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                if (length > 0) {
                    int i7 = 0;
                    while (true) {
                        int i8 = i7 + 1;
                        char charAt = lowerCase.charAt(i7);
                        if (Intrinsics.compare((int) charAt, 31) <= 0) {
                            break;
                        } else if (Intrinsics.compare((int) charAt, 127) >= 0) {
                            break;
                        } else if (StringsKt.indexOf$default((CharSequence) " #%/:?@[\\]", charAt, 0, false, 6, (Object) null) != -1) {
                            break;
                        } else if (i8 >= length) {
                            break;
                        } else {
                            i7 = i8;
                        }
                    }
                    i = 1;
                }
                if (i != 0) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00df A[LOOP:0: B:1:0x000e->B:60:0x00df, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f2 A[EDGE_INSN: B:71:0x00f2->B:61:0x00f2 ?: BREAK  
    EDGE_INSN: B:72:0x00f2->B:61:0x00f2 ?: BREAK  , RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.net.InetAddress m41512a(java.lang.String r20, int r21, int r22) {
        /*
            r6 = r20
            r7 = r22
            r8 = 16
            byte[] r9 = new byte[r8]
            r10 = -1
            r12 = r21
            r13 = 0
            r14 = -1
            r15 = -1
        L_0x000e:
            r16 = 0
            if (r12 >= r7) goto L_0x00f3
            if (r13 != r8) goto L_0x0015
            return r16
        L_0x0015:
            int r5 = r12 + 2
            r4 = 255(0xff, float:3.57E-43)
            r3 = 4
            if (r5 > r7) goto L_0x0045
            r17 = 0
            r18 = 4
            r19 = 0
            java.lang.String r1 = "::"
            r0 = r20
            r2 = r12
            r11 = 4
            r3 = r17
            r11 = 255(0xff, float:3.57E-43)
            r4 = r18
            r11 = r5
            r5 = r19
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0045
            if (r14 == r10) goto L_0x003a
            return r16
        L_0x003a:
            int r13 = r13 + 2
            if (r11 != r7) goto L_0x0041
            r14 = r13
            goto L_0x00f3
        L_0x0041:
            r15 = r11
            r14 = r13
            goto L_0x00c2
        L_0x0045:
            if (r13 == 0) goto L_0x00c1
            r3 = 0
            r4 = 4
            r5 = 0
            java.lang.String r1 = ":"
            r0 = r20
            r2 = r12
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0059
            int r12 = r12 + 1
            goto L_0x00c1
        L_0x0059:
            r3 = 0
            r4 = 4
            r5 = 0
            java.lang.String r1 = "."
            r0 = r20
            r2 = r12
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00c0
            int r0 = r13 + -2
            r1 = r0
        L_0x006a:
            if (r15 >= r7) goto L_0x00b3
            if (r1 != r8) goto L_0x006f
            goto L_0x00b9
        L_0x006f:
            if (r1 == r0) goto L_0x007c
            char r2 = r6.charAt(r15)
            r3 = 46
            if (r2 == r3) goto L_0x007a
            goto L_0x00b9
        L_0x007a:
            int r15 = r15 + 1
        L_0x007c:
            r2 = r15
            r3 = 0
        L_0x007e:
            if (r2 >= r7) goto L_0x00a6
            char r4 = r6.charAt(r2)
            r5 = 48
            int r11 = kotlin.jvm.internal.Intrinsics.compare((int) r4, (int) r5)
            if (r11 < 0) goto L_0x00a6
            r11 = 57
            int r11 = kotlin.jvm.internal.Intrinsics.compare((int) r4, (int) r11)
            if (r11 <= 0) goto L_0x0095
            goto L_0x00a6
        L_0x0095:
            if (r3 != 0) goto L_0x009a
            if (r15 == r2) goto L_0x009a
            goto L_0x00b9
        L_0x009a:
            int r3 = r3 * 10
            int r3 = r3 + r4
            int r3 = r3 - r5
            r4 = 255(0xff, float:3.57E-43)
            if (r3 <= r4) goto L_0x00a3
            goto L_0x00b9
        L_0x00a3:
            int r2 = r2 + 1
            goto L_0x007e
        L_0x00a6:
            int r4 = r2 - r15
            if (r4 != 0) goto L_0x00ab
            goto L_0x00b9
        L_0x00ab:
            int r4 = r1 + 1
            byte r3 = (byte) r3
            r9[r1] = r3
            r15 = r2
            r1 = r4
            goto L_0x006a
        L_0x00b3:
            r2 = 4
            int r0 = r0 + r2
            if (r1 != r0) goto L_0x00b9
            r0 = 1
            goto L_0x00ba
        L_0x00b9:
            r0 = 0
        L_0x00ba:
            if (r0 != 0) goto L_0x00bd
            return r16
        L_0x00bd:
            int r13 = r13 + 2
            goto L_0x00f3
        L_0x00c0:
            return r16
        L_0x00c1:
            r15 = r12
        L_0x00c2:
            r12 = r15
            r0 = 0
        L_0x00c4:
            if (r12 >= r7) goto L_0x00d7
            char r1 = r6.charAt(r12)
            int r1 = com.yandex.mobile.ads.impl.jh1.m37807a((char) r1)
            if (r1 != r10) goto L_0x00d1
            goto L_0x00d7
        L_0x00d1:
            int r0 = r0 << 4
            int r0 = r0 + r1
            int r12 = r12 + 1
            goto L_0x00c4
        L_0x00d7:
            int r1 = r12 - r15
            if (r1 == 0) goto L_0x00f2
            r2 = 4
            if (r1 <= r2) goto L_0x00df
            goto L_0x00f2
        L_0x00df:
            int r1 = r13 + 1
            int r2 = r0 >>> 8
            r3 = 255(0xff, float:3.57E-43)
            r2 = r2 & r3
            byte r2 = (byte) r2
            r9[r13] = r2
            int r13 = r1 + 1
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r9[r1] = r0
            goto L_0x000e
        L_0x00f2:
            return r16
        L_0x00f3:
            if (r13 == r8) goto L_0x0105
            if (r14 != r10) goto L_0x00f8
            return r16
        L_0x00f8:
            int r0 = r13 - r14
            int r1 = 16 - r0
            java.lang.System.arraycopy(r9, r14, r9, r1, r0)
            int r8 = r8 - r13
            int r8 = r8 + r14
            r0 = 0
            java.util.Arrays.fill(r9, r14, r8, r0)
        L_0x0105:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ra0.m41512a(java.lang.String, int, int):java.net.InetAddress");
    }
}
