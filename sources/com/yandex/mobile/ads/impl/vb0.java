package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class vb0 {

    /* renamed from: a */
    private final Map<String, String> f41239a = new HashMap();

    /* renamed from: b */
    private Map<String, String> f41240b;

    /* renamed from: a */
    public synchronized Map<String, String> mo70467a() {
        if (this.f41240b == null) {
            this.f41240b = Collections.unmodifiableMap(new HashMap(this.f41239a));
        }
        return this.f41240b;
    }
}
