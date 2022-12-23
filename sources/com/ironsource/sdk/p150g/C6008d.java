package com.ironsource.sdk.p150g;

import com.ironsource.mediationsdk.model.C5718b;
import com.ironsource.mediationsdk.model.C5719c;
import com.ironsource.mediationsdk.model.C5721e;
import com.ironsource.mediationsdk.model.C5722f;
import com.ironsource.mediationsdk.model.C5735r;
import com.ironsource.mediationsdk.utils.C5788a;
import com.ironsource.mediationsdk.utils.C5806n;

/* renamed from: com.ironsource.sdk.g.d */
public class C6008d {

    /* renamed from: a */
    private C5722f f14743a;

    /* renamed from: b */
    private C5735r f14744b;

    /* renamed from: c */
    private C5806n f14745c;

    /* renamed from: d */
    private boolean f14746d;

    /* renamed from: e */
    private C5719c f14747e;

    /* renamed from: f */
    private C5788a f14748f;

    /* renamed from: g */
    private C5721e f14749g;

    /* renamed from: h */
    private C5718b f14750h;

    /* renamed from: com.ironsource.sdk.g.d$a */
    public enum C6009a {
        ;
        

        /* renamed from: a */
        public static final int f14751a = 1;

        /* renamed from: b */
        public static final int f14752b = 2;

        /* renamed from: c */
        public static final int f14753c = 3;

        static {
            f14754d = new int[]{1, 2, 3};
        }

        /* renamed from: a */
        public static int[] m14847a() {
            return (int[]) f14754d.clone();
        }
    }

    /* renamed from: com.ironsource.sdk.g.d$b */
    public enum C6010b {
        None,
        Loaded,
        Ready,
        f14758d
    }

    /* renamed from: com.ironsource.sdk.g.d$c */
    public enum C6011c {
        Web,
        Native
    }

    /* renamed from: com.ironsource.sdk.g.d$d */
    public enum C6012d {
        MODE_0(0),
        MODE_1(1),
        MODE_2(2),
        MODE_3(3);
        

        /* renamed from: d */
        public int f14768d;

        private C6012d(int i) {
            this.f14768d = i;
        }
    }

    /* renamed from: com.ironsource.sdk.g.d$e */
    public enum C6013e {
        Banner,
        OfferWall,
        Interstitial,
        OfferWallCredits,
        RewardedVideo,
        None
    }

    public C6008d() {
        this.f14743a = new C5722f();
    }

    public C6008d(C5722f fVar, C5735r rVar, C5806n nVar, boolean z, C5719c cVar, C5788a aVar, C5721e eVar, C5718b bVar) {
        this.f14743a = fVar;
        this.f14744b = rVar;
        this.f14745c = nVar;
        this.f14746d = z;
        this.f14747e = cVar;
        this.f14748f = aVar;
        this.f14749g = eVar;
        this.f14750h = bVar;
    }

    /* renamed from: a */
    public C5722f mo42549a() {
        return this.f14743a;
    }

    /* renamed from: b */
    public C5735r mo42550b() {
        return this.f14744b;
    }

    /* renamed from: c */
    public C5806n mo42551c() {
        return this.f14745c;
    }

    /* renamed from: d */
    public boolean mo42552d() {
        return this.f14746d;
    }

    /* renamed from: e */
    public C5719c mo42553e() {
        return this.f14747e;
    }

    /* renamed from: f */
    public C5788a mo42554f() {
        return this.f14748f;
    }

    /* renamed from: g */
    public C5721e mo42555g() {
        return this.f14749g;
    }

    /* renamed from: h */
    public C5718b mo42556h() {
        return this.f14750h;
    }
}
