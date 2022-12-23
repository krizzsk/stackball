package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.al1;
import com.yandex.mobile.ads.impl.h41;
import com.yandex.mobile.ads.impl.jl1;
import com.yandex.mobile.ads.impl.xk1;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

public final class gl1 implements jl1.C13511a, al1.C12395a {

    /* renamed from: k */
    static final /* synthetic */ KProperty<Object>[] f34021k;
    @Deprecated

    /* renamed from: l */
    private static final long f34022l = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: a */
    private final C15230y2 f34023a;

    /* renamed from: b */
    private final ln1 f34024b;

    /* renamed from: c */
    private final jl1 f34025c;

    /* renamed from: d */
    private final al1 f34026d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final il1 f34027e;

    /* renamed from: f */
    private final pm1 f34028f;

    /* renamed from: g */
    private final wy0 f34029g = new wy0(false);

    /* renamed from: h */
    private boolean f34030h;

    /* renamed from: i */
    private final ReadWriteProperty f34031i;

    /* renamed from: j */
    private final ReadWriteProperty f34032j;

    /* renamed from: com.yandex.mobile.ads.impl.gl1$a */
    public static final class C13211a extends ObservableProperty<h41.C13275a> {

        /* renamed from: a */
        final /* synthetic */ gl1 f34033a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13211a(Object obj, Object obj2, gl1 gl1) {
            super(null);
            this.f34033a = gl1;
        }

        /* access modifiers changed from: protected */
        public void afterChange(KProperty<?> kProperty, h41.C13275a aVar, h41.C13275a aVar2) {
            Intrinsics.checkNotNullParameter(kProperty, "property");
            h41.C13275a aVar3 = aVar;
            this.f34033a.f34027e.mo67828a(aVar2);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.gl1$b */
    public static final class C13212b extends ObservableProperty<h41.C13275a> {

        /* renamed from: a */
        final /* synthetic */ gl1 f34034a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13212b(Object obj, Object obj2, gl1 gl1) {
            super(null);
            this.f34034a = gl1;
        }

        /* access modifiers changed from: protected */
        public void afterChange(KProperty<?> kProperty, h41.C13275a aVar, h41.C13275a aVar2) {
            Intrinsics.checkNotNullParameter(kProperty, "property");
            h41.C13275a aVar3 = aVar;
            this.f34034a.f34027e.mo67830b(aVar2);
        }
    }

    static {
        Class<gl1> cls = gl1.class;
        f34021k = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "adParameterManager", "getAdParameterManager()Lcom/yandex/mobile/ads/core/report/Report$ReportParameterManager;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "requestParameterManager", "getRequestParameterManager()Lcom/yandex/mobile/ads/core/report/Report$ReportParameterManager;"))};
    }

    public gl1(Context context, ck1<?> ck1, C15230y2 y2Var, ll1 ll1, rn1 rn1, ym1 ym1, ln1 ln1) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ck1, "videoAdInfo");
        Intrinsics.checkNotNullParameter(y2Var, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(ll1, "videoAdStatusController");
        Intrinsics.checkNotNullParameter(rn1, "videoViewProvider");
        Intrinsics.checkNotNullParameter(ym1, "renderValidator");
        Intrinsics.checkNotNullParameter(ln1, "videoTracker");
        this.f34023a = y2Var;
        this.f34024b = ln1;
        this.f34025c = new jl1(ym1, this);
        this.f34026d = new al1(ll1, this);
        this.f34027e = new il1(context, y2Var);
        this.f34028f = new pm1(ck1, rn1);
        Delegates delegates = Delegates.INSTANCE;
        this.f34031i = new C13211a((Object) null, (Object) null, this);
        Delegates delegates2 = Delegates.INSTANCE;
        this.f34032j = new C13212b((Object) null, (Object) null, this);
    }

    /* renamed from: g */
    private final void m36641g() {
        this.f34025c.mo68024b();
        this.f34026d.mo65800b();
        this.f34029g.mo70770a();
    }

    /* renamed from: b */
    public final void mo67323b(h41.C13275a aVar) {
        this.f34032j.setValue(this, f34021k[1], aVar);
    }

    /* renamed from: c */
    public final void mo67324c() {
        m36641g();
    }

    /* renamed from: d */
    public final void mo67325d() {
        m36641g();
    }

    /* renamed from: e */
    public final void mo67326e() {
        this.f34030h = false;
        this.f34027e.mo67831b((Map<String, ? extends Object>) null);
        m36641g();
    }

    /* renamed from: f */
    public final void mo67327f() {
        this.f34025c.mo68023a();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m36640b(gl1 gl1) {
        Intrinsics.checkNotNullParameter(gl1, "this$0");
        gl1.mo67322a(new xk1(xk1.C15176a.f42591i, new C15054wk()));
    }

    /* renamed from: a */
    public final void mo67321a(h41.C13275a aVar) {
        this.f34031i.setValue(this, f34021k[0], aVar);
    }

    /* renamed from: a */
    public void mo67320a() {
        this.f34025c.mo68024b();
        this.f34023a.mo70970b(C15139x2.VIDEO_AD_RENDERING);
        this.f34024b.mo65760b();
        this.f34026d.mo65799a();
        this.f34029g.mo70771a(f34022l, new xy0() {
            /* renamed from: a */
            public final void mo65511a() {
                gl1.m36640b(gl1.this);
            }
        });
    }

    /* renamed from: b */
    public void mo65801b() {
        this.f34027e.mo67831b((Map<String, ? extends Object>) this.f34028f.mo66063a());
        this.f34023a.mo70965a(C15139x2.VIDEO_AD_RENDERING);
        if (!this.f34030h) {
            this.f34030h = true;
            this.f34027e.mo67827a();
        }
    }

    /* renamed from: a */
    public final void mo67322a(xk1 xk1) {
        Intrinsics.checkNotNullParameter(xk1, "error");
        m36641g();
        if (!this.f34030h) {
            this.f34030h = true;
            String name = xk1.mo70909a().name();
            if (name != null) {
                String lowerCase = name.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                String message = xk1.mo70910b().getMessage();
                if (message == null) {
                    message = "";
                }
                this.f34027e.mo67829a(lowerCase, message);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }
}
