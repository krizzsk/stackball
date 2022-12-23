package com.ogury.p245ed.internal;

/* renamed from: com.ogury.ed.internal.ep */
public final class C8200ep {

    /* renamed from: a */
    public static final C8200ep f21240a = new C8200ep();

    private C8200ep() {
    }

    /* renamed from: a */
    public static C8199eo m22932a(String str) {
        C8467mq.m23881b(str, "impressionSource");
        if (C8467mq.m23880a((Object) str, (Object) "sdk")) {
            return C8199eo.IMPRESSION_SOURCE_SDK;
        }
        C8467mq.m23880a((Object) str, (Object) "format");
        return C8199eo.IMPRESSION_SOURCE_FORMAT;
    }
}
