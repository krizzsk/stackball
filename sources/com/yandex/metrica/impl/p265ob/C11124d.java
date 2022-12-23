package com.yandex.metrica.impl.p265ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.d */
public class C11124d extends IOException {
    public C11124d(String str) {
        super(str);
    }

    /* renamed from: a */
    static C11124d m28664a() {
        return new C11124d("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: b */
    static C11124d m28665b() {
        return new C11124d("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
}
