package com.ogury.p245ed.internal;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: com.ogury.ed.internal.fb */
public final class C8218fb {

    /* renamed from: a */
    public static final C8218fb f21270a = new C8218fb();

    private C8218fb() {
    }

    /* renamed from: a */
    public static String m23007a(String str) {
        C8467mq.m23881b(str, "s");
        try {
            MessageDigest instance = MessageDigest.getInstance(SameMD5.TAG);
            C8467mq.m23878a((Object) instance, "getInstance(\"MD5\")");
            Charset forName = Charset.forName("US-ASCII");
            C8467mq.m23878a((Object) forName, "forName(\"US-ASCII\")");
            byte[] bytes = str.getBytes(forName);
            C8467mq.m23878a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            instance.update(bytes, 0, str.length());
            byte[] digest = instance.digest();
            BigInteger bigInteger = new BigInteger(1, digest);
            C8472mv mvVar = C8472mv.f21701a;
            String format = String.format("%0" + (digest.length << 1) + 'x', Arrays.copyOf(new Object[]{bigInteger}, 1));
            C8467mq.m23878a((Object) format, "java.lang.String.format(format, *args)");
            return format;
        } catch (NoSuchAlgorithmException e) {
            C8129da daVar = C8129da.f21066a;
            C8129da.m22652a(e);
            return "";
        }
    }
}
