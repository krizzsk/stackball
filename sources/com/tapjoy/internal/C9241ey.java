package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.ey */
public enum C9241ey implements C9215em {
    APP(0),
    CAMPAIGN(1),
    CUSTOM(2),
    USAGES(3);
    
    public static final C9197ej ADAPTER = null;

    /* renamed from: a */
    private final int f22745a;

    static {
        ADAPTER = new C9242a();
    }

    private C9241ey(int i) {
        this.f22745a = i;
    }

    /* renamed from: a */
    public static C9241ey m24833a(int i) {
        if (i == 0) {
            return APP;
        }
        if (i == 1) {
            return CAMPAIGN;
        }
        if (i == 2) {
            return CUSTOM;
        }
        if (i != 3) {
            return null;
        }
        return USAGES;
    }

    /* renamed from: a */
    public final int mo58014a() {
        return this.f22745a;
    }

    /* renamed from: com.tapjoy.internal.ey$a */
    static final class C9242a extends C9191ef {
        C9242a() {
            super(C9241ey.class);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C9215em mo57984a(int i) {
            return C9241ey.m24833a(i);
        }
    }
}
