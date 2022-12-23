package com.ogury.p244cm.internal;

import com.ogury.p244cm.internal.aacaa;

/* renamed from: com.ogury.cm.internal.aacba */
public final class aacba {

    /* renamed from: a */
    public static final aacba f20368a = new aacba();

    private aacba() {
    }

    /* renamed from: a */
    public static String m21779a(int i) {
        aacbb aacbb = aacbb.f20369a;
        String a = aacbb.m21781a(i);
        if (a != null) {
            String obj = bbcbc.m22100c(a).toString();
            if (obj != null) {
                String substring = obj.substring(1);
                bbabc.m22048a((Object) substring, "(this as java.lang.String).substring(startIndex)");
                return substring;
            }
            throw new babca("null cannot be cast to non-null type java.lang.String");
        }
        throw new babca("null cannot be cast to non-null type kotlin.CharSequence");
    }

    /* renamed from: a */
    public static String m21780a(String str) {
        bbabc.m22051b(str, "responseArray");
        int i = 0;
        Object[] array = aacaa.aaaaa.m21769a(aacaa.aaaaa.m21772b(str)).toArray(new Integer[0]);
        if (array != null) {
            int length = array.length;
            String str2 = "";
            while (i < length) {
                int intValue = ((Number) array[i]).intValue();
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                aacbb aacbb = aacbb.f20369a;
                String a = aacbb.m21781a(intValue);
                if (a != null) {
                    sb.append(bbcbc.m22100c(a).toString());
                    str2 = sb.toString();
                    i++;
                } else {
                    throw new babca("null cannot be cast to non-null type kotlin.CharSequence");
                }
            }
            return str2;
        }
        throw new babca("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
