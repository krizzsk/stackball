package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.ByteString;

public final class mb0 {

    /* renamed from: a */
    public static final mb0 f37283a = new mb0();

    /* renamed from: b */
    public static final ByteString f37284b = ByteString.Companion.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: c */
    private static final String[] f37285c = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: d */
    private static final String[] f37286d = new String[64];

    /* renamed from: e */
    private static final String[] f37287e;

    static {
        String[] strArr = new String[256];
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            String binaryString = Integer.toBinaryString(i2);
            Intrinsics.checkNotNullExpressionValue(binaryString, "toBinaryString(it)");
            strArr[i2] = StringsKt.replace$default(jh1.m37820a("%8s", binaryString), ' ', '0', false, 4, (Object) null);
        }
        f37287e = strArr;
        String[] strArr2 = f37286d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i3 = 0;
        while (i3 < 1) {
            int i4 = iArr[i3];
            i3++;
            String[] strArr3 = f37286d;
            strArr3[i4 | 8] = Intrinsics.stringPlus(strArr3[i4], "|PADDED");
        }
        String[] strArr4 = f37286d;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i5 = 0;
        while (i5 < 3) {
            int i6 = iArr2[i5];
            i5++;
            int i7 = 0;
            while (i7 < 1) {
                int i8 = iArr[i7];
                i7++;
                String[] strArr5 = f37286d;
                int i9 = i8 | i6;
                strArr5[i9] = strArr5[i8] + '|' + strArr5[i6];
                strArr5[i9 | 8] = strArr5[i8] + '|' + strArr5[i6] + "|PADDED";
            }
        }
        int length = f37286d.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = i + 1;
                String[] strArr6 = f37286d;
                if (strArr6[i] == null) {
                    strArr6[i] = f37287e[i];
                }
                if (i10 <= length) {
                    i = i10;
                } else {
                    return;
                }
            }
        }
    }

    private mb0() {
    }

    /* renamed from: a */
    public final String mo68639a(boolean z, int i, int i2, int i3, int i4) {
        String str;
        String str2;
        int i5 = i3;
        int i6 = i4;
        String a = mo68638a(i5);
        if (i6 == 0) {
            str = "";
        } else {
            if (!(i5 == 2 || i5 == 3)) {
                if (i5 == 4 || i5 == 6) {
                    str = i6 == 1 ? "ACK" : f37287e[i6];
                } else if (!(i5 == 7 || i5 == 8)) {
                    String[] strArr = f37286d;
                    if (i6 < strArr.length) {
                        str2 = strArr[i6];
                        Intrinsics.checkNotNull(str2);
                    } else {
                        str2 = f37287e[i6];
                    }
                    String str3 = str2;
                    str = (i5 != 5 || (i6 & 4) == 0) ? (i5 != 0 || (i6 & 32) == 0) ? str3 : StringsKt.replace$default(str3, "PRIORITY", "COMPRESSED", false, 4, (Object) null) : StringsKt.replace$default(str3, "HEADERS", "PUSH_PROMISE", false, 4, (Object) null);
                }
            }
            str = f37287e[i6];
        }
        return jh1.m37820a("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), a, str);
    }

    /* renamed from: a */
    public final String mo68638a(int i) {
        String[] strArr = f37285c;
        if (i < strArr.length) {
            return strArr[i];
        }
        return jh1.m37820a("0x%02x", Integer.valueOf(i));
    }
}
