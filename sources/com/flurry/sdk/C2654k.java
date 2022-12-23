package com.flurry.sdk;

/* renamed from: com.flurry.sdk.k */
public final class C2654k {

    /* renamed from: a */
    final C2655a f6233a;

    /* renamed from: b */
    private int f6234b = m5759b();

    /* renamed from: com.flurry.sdk.k$a */
    public enum C2655a {
        TEN_SEC(10),
        THIRTY_SEC(30),
        THREE_MIN(180),
        ABANDON(0);
        

        /* renamed from: e */
        int f6240e;

        private C2655a(int i) {
            this.f6240e = i;
        }

        /* renamed from: a */
        public final C2655a mo17844a() {
            if (ordinal() == values().length - 1) {
                return this;
            }
            return values()[ordinal() + 1];
        }
    }

    public C2654k(C2655a aVar) {
        this.f6233a = aVar;
    }

    /* renamed from: b */
    private static int m5759b() {
        return (int) (System.currentTimeMillis() / 1000);
    }

    /* renamed from: a */
    public final int mo17843a() {
        return (this.f6233a.f6240e + this.f6234b) - m5759b();
    }
}
