package com.ironsource.mediationsdk.model;

/* renamed from: com.ironsource.mediationsdk.model.m */
public final class C5729m {

    /* renamed from: a */
    public boolean f13766a;

    /* renamed from: b */
    public boolean f13767b;

    /* renamed from: c */
    public boolean f13768c;

    /* renamed from: d */
    public C5731n f13769d;

    /* renamed from: e */
    public int f13770e;

    /* renamed from: f */
    public int f13771f;

    /* renamed from: com.ironsource.mediationsdk.model.m$a */
    public static class C5730a {

        /* renamed from: a */
        public boolean f13772a = true;

        /* renamed from: b */
        private boolean f13773b = false;

        /* renamed from: c */
        private boolean f13774c = false;

        /* renamed from: d */
        private C5731n f13775d = null;

        /* renamed from: e */
        private int f13776e = 0;

        /* renamed from: f */
        private int f13777f = 0;

        /* renamed from: a */
        public final C5730a mo41981a(boolean z, int i) {
            this.f13774c = z;
            this.f13777f = i;
            return this;
        }

        /* renamed from: a */
        public final C5730a mo41982a(boolean z, C5731n nVar, int i) {
            this.f13773b = z;
            if (nVar == null) {
                nVar = C5731n.PER_DAY;
            }
            this.f13775d = nVar;
            this.f13776e = i;
            return this;
        }

        /* renamed from: a */
        public final C5729m mo41983a() {
            return new C5729m(this.f13772a, this.f13773b, this.f13774c, this.f13775d, this.f13776e, this.f13777f, (byte) 0);
        }
    }

    private C5729m(boolean z, boolean z2, boolean z3, C5731n nVar, int i, int i2) {
        this.f13766a = z;
        this.f13767b = z2;
        this.f13768c = z3;
        this.f13769d = nVar;
        this.f13770e = i;
        this.f13771f = i2;
    }

    /* synthetic */ C5729m(boolean z, boolean z2, boolean z3, C5731n nVar, int i, int i2, byte b) {
        this(z, z2, z3, nVar, i, i2);
    }
}
