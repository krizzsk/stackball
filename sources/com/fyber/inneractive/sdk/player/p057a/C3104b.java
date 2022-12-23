package com.fyber.inneractive.sdk.player.p057a;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.player.a.b */
abstract class C3104b {

    /* renamed from: a */
    private Map<String, String> f7632a = new HashMap();

    /* renamed from: a */
    public abstract int mo18676a(C3103a aVar);

    protected C3104b() {
    }

    /* renamed from: a */
    public Map<String, String> mo18677a() {
        return this.f7632a;
    }

    /* renamed from: com.fyber.inneractive.sdk.player.a.b$a */
    enum C3105a {
        ;
        

        /* renamed from: a */
        public static final int f7633a = 1;

        /* renamed from: b */
        public static final int f7634b = 2;

        /* renamed from: c */
        public static final int f7635c = 3;

        static {
            f7636d = new int[]{1, 2, 3};
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18678a(String str, String str2) {
        this.f7632a.put(str, str2);
    }
}
