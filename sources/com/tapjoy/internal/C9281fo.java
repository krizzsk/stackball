package com.tapjoy.internal;

import android.util.Base64;
import com.tapjoy.TapjoyUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;
import java.util.zip.CRC32;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.fo */
public final class C9281fo {

    /* renamed from: a */
    public final C9282a f22948a;

    /* renamed from: b */
    public final String f22949b;

    /* renamed from: c */
    public final String f22950c;

    /* renamed from: d */
    public final String f22951d;

    /* renamed from: e */
    private final String f22952e;

    /* renamed from: f */
    private final int f22953f;

    /* renamed from: com.tapjoy.internal.fo$a */
    public enum C9282a {
        SDK_ANDROID((byte) 2),
        RPC_ANALYTICS((byte) 49);
        

        /* renamed from: a */
        public byte f22955a;

        private C9282a(byte b) {
            this.f22955a = b;
        }

        @Nullable
        /* renamed from: a */
        public static C9282a m24891a(byte b) {
            for (C9282a aVar : values()) {
                if (aVar.f22955a == b) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public C9281fo(String str) {
        int length = str.length();
        if (!str.matches("[A-Za-z0-9\\-_]*") || length < 60 || (length & 3) != 0) {
            throw new IllegalArgumentException("The given API key was malformed.");
        }
        try {
            byte[] decode = Base64.decode(str, 8);
            int length2 = decode.length;
            ByteBuffer wrap = ByteBuffer.wrap(decode);
            wrap.order(ByteOrder.BIG_ENDIAN);
            int length3 = decode.length - 4;
            int i = wrap.getInt(length3);
            CRC32 crc32 = new CRC32();
            crc32.update(decode, 0, length3);
            if (i == ((int) crc32.getValue())) {
                this.f22952e = str;
                this.f22949b = new UUID(wrap.getLong(0), wrap.getLong(8)).toString();
                this.f22953f = wrap.get(16);
                this.f22948a = C9282a.m24891a(wrap.get(17));
                this.f22950c = str.substring(24, 44);
                int i2 = this.f22953f;
                if (i2 == 1) {
                    this.f22951d = null;
                } else if (i2 != 2 || this.f22948a != C9282a.SDK_ANDROID) {
                    throw new IllegalArgumentException("The given API key was not supported.");
                } else if (length2 >= 57) {
                    byte[] bArr = new byte[12];
                    System.arraycopy(decode, 33, bArr, 0, 12);
                    this.f22951d = TapjoyUtil.convertToHex(bArr);
                } else {
                    throw new IllegalArgumentException("The given API key was invalid.");
                }
            } else {
                throw new IllegalArgumentException("The given API key was invalid.");
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("The given API key was malformed.", e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9281fo) {
            return this.f22952e.equals(((C9281fo) obj).f22952e);
        }
        return false;
    }

    public final String toString() {
        return this.f22952e;
    }

    /* renamed from: a */
    public static String m24890a(String str) {
        if (str.regionMatches(13, "-8000-8000-", 0, 11)) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str.substring(0, 8));
            stringBuffer.append(str.substring(24, 30));
            stringBuffer.append(str.substring(9, 13));
            stringBuffer.append(str.substring(30));
            return stringBuffer.toString();
        }
        throw new IllegalArgumentException("The given UUID did not come from 5Rocks.");
    }
}
