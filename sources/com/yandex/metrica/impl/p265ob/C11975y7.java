package com.yandex.metrica.impl.p265ob;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* renamed from: com.yandex.metrica.impl.ob.y7 */
public final class C11975y7 implements C11194ea<String, byte[]> {
    /* renamed from: a */
    public Object mo61049a(Object obj) {
        byte[] bArr = (byte[]) obj;
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public byte[] mo61050b(String str) {
        if (Intrinsics.areEqual((Object) "native", (Object) str)) {
            str = "JVM";
        }
        Charset charset = Charsets.UTF_8;
        if (str != null) {
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            return bytes;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }
}
