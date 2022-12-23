package com.ogury.p245ed.internal;

import java.net.URLDecoder;

/* renamed from: com.ogury.ed.internal.gn */
public final class C8264gn {
    /* renamed from: a */
    public static final String m23206a(String str) {
        C8467mq.m23881b(str, "<this>");
        try {
            String decode = URLDecoder.decode(str, "UTF-8");
            C8467mq.m23878a((Object) decode, "{\n        URLDecoder.decode(this, \"UTF-8\")\n    }");
            return decode;
        } catch (Exception unused) {
            return "";
        }
    }
}
