package com.yandex.mobile.ads.impl;

import java.util.Locale;

public class wi1 extends RuntimeException {

    /* renamed from: b */
    private final vi1 f42016b;

    /* renamed from: c */
    private final C15052a f42017c;

    /* renamed from: com.yandex.mobile.ads.impl.wi1$a */
    public enum C15052a {
        VERIFICATION_NOT_SUPPORTED(2),
        ERROR_RESOURCE_LOAD(3);
        

        /* renamed from: b */
        private final int f42021b;

        private C15052a(int i) {
            this.f42021b = i;
        }

        /* renamed from: a */
        public int mo70709a() {
            return this.f42021b;
        }
    }

    public wi1(vi1 vi1, C15052a aVar) {
        super("Verification not executed with reason = " + aVar.name().toLowerCase(Locale.US));
        this.f42016b = vi1;
        this.f42017c = aVar;
    }

    /* renamed from: a */
    public C15052a mo70707a() {
        return this.f42017c;
    }

    /* renamed from: b */
    public vi1 mo70708b() {
        return this.f42016b;
    }
}
