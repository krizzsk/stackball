package com.yandex.metrica.impl.p265ob;

import java.nio.charset.Charset;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* renamed from: com.yandex.metrica.impl.ob.z7 */
public final class C12018z7 implements C11194ea<Map<String, ? extends String>, C10431Kf[]> {
    /* renamed from: a */
    public Object mo61049a(Object obj) {
        C10431Kf[] kfArr = (C10431Kf[]) obj;
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public C10431Kf[] mo61050b(Map<String, String> map) {
        int size = map.size();
        C10431Kf[] kfArr = new C10431Kf[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            kfArr[i2] = new C10431Kf();
        }
        for (Map.Entry next : map.entrySet()) {
            C10431Kf kf = kfArr[i];
            String str = (String) next.getKey();
            Charset charset = Charsets.UTF_8;
            if (str != null) {
                byte[] bytes = str.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                kf.f25058b = bytes;
                C10431Kf kf2 = kfArr[i];
                String str2 = (String) next.getValue();
                Charset charset2 = Charsets.UTF_8;
                if (str2 != null) {
                    byte[] bytes2 = str2.getBytes(charset2);
                    Intrinsics.checkNotNullExpressionValue(bytes2, "(this as java.lang.String).getBytes(charset)");
                    kf2.f25059c = bytes2;
                    i++;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return kfArr;
    }
}
