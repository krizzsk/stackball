package com.ironsource.sdk.controller;

import java.util.ArrayList;

/* renamed from: com.ironsource.sdk.controller.b */
public final class C5858b {

    /* renamed from: a */
    private int f14289a = C5859a.f14292a;

    /* renamed from: b */
    private ArrayList f14290b = new ArrayList();

    /* renamed from: c */
    private String f14291c;

    /* renamed from: com.ironsource.sdk.controller.b$a */
    enum C5859a {
        ;
        

        /* renamed from: a */
        public static final int f14292a = 1;

        /* renamed from: b */
        public static final int f14293b = 2;

        static {
            f14294c = new int[]{1, 2};
        }
    }

    public C5858b(String str) {
        this.f14291c = str;
    }

    /* renamed from: a */
    public final synchronized void mo42242a() {
        this.f14289a = C5859a.f14293b;
    }

    /* renamed from: a */
    public final synchronized void mo42243a(Runnable runnable) {
        if (this.f14289a != C5859a.f14293b) {
            this.f14290b.add(runnable);
        } else {
            runnable.run();
        }
    }

    /* renamed from: b */
    public final synchronized void mo42244b() {
        Object[] array = this.f14290b.toArray();
        for (int i = 0; i < array.length; i++) {
            ((Runnable) array[i]).run();
            array[i] = null;
        }
        this.f14290b.clear();
    }
}
