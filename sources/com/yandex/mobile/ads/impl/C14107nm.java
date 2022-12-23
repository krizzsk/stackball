package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import android.view.View;
import com.yandex.mobile.ads.impl.ov0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.nm */
public final class C14107nm {

    /* renamed from: a */
    private final Function0<ea0> f37848a;

    /* renamed from: b */
    private final Function0<o31> f37849b;

    /* renamed from: c */
    private String f37850c;

    /* renamed from: d */
    private Long f37851d;

    /* renamed from: e */
    private Long f37852e;

    /* renamed from: f */
    private Long f37853f;

    /* renamed from: g */
    private Long f37854g;

    /* renamed from: h */
    private Long f37855h;

    /* renamed from: i */
    private final Lazy f37856i = LazyKt.lazy(LazyThreadSafetyMode.NONE, C14110c.f37859b);

    /* renamed from: j */
    private final Lazy f37857j = LazyKt.lazy(LazyThreadSafetyMode.NONE, new C14109b(this));

    /* renamed from: com.yandex.mobile.ads.impl.nm$a */
    private final class C14108a implements ov0.C14227b {

        /* renamed from: a */
        final /* synthetic */ C14107nm f37858a;

        public C14108a(C14107nm nmVar) {
            Intrinsics.checkNotNullParameter(nmVar, "this$0");
            this.f37858a = nmVar;
        }

        /* renamed from: a */
        public void mo69058a() {
            this.f37858a.mo69050d();
        }

        /* renamed from: b */
        public void mo69059b() {
            this.f37858a.mo69051e();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.nm$b */
    /* synthetic */ class C14109b extends FunctionReferenceImpl implements Function0<C14108a> {
        C14109b(Object obj) {
            super(0, obj, C14108a.class, "<init>", "<init>(Lcom/yandex/div/histogram/Div2ViewHistogramReporter;)V", 0);
        }

        /* renamed from: a */
        public final C14108a invoke() {
            return new C14108a((C14107nm) this.receiver);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.nm$c */
    /* synthetic */ class C14110c extends FunctionReferenceImpl implements Function0<p31> {

        /* renamed from: b */
        public static final C14110c f37859b = new C14110c();

        C14110c() {
            super(0, p31.class, "<init>", "<init>()V", 0);
        }

        public Object invoke() {
            return new p31();
        }
    }

    public C14107nm(Function0<? extends ea0> function0, Function0<o31> function02) {
        Intrinsics.checkNotNullParameter(function0, "histogramReporter");
        Intrinsics.checkNotNullParameter(function02, "renderConfig");
        this.f37848a = function0;
        this.f37849b = function02;
    }

    /* renamed from: a */
    public final void mo69047a(String str) {
        this.f37850c = str;
    }

    /* renamed from: b */
    public final void mo69048b() {
        Long l = this.f37851d;
        p31 a = m40108a();
        if (l != null) {
            long uptimeMillis = SystemClock.uptimeMillis() - l.longValue();
            a.mo69312d(uptimeMillis);
            ea0.m35609a(this.f37848a.invoke(), "Div.Binding", uptimeMillis, this.f37850c, (String) null, (ba0) null, 24, (Object) null);
        }
        this.f37851d = null;
    }

    /* renamed from: c */
    public final void mo69049c() {
        this.f37851d = Long.valueOf(SystemClock.uptimeMillis());
    }

    /* renamed from: d */
    public final void mo69050d() {
        Long l = this.f37855h;
        if (l != null) {
            m40108a().mo69306a(SystemClock.uptimeMillis() - l.longValue());
        }
        p31 a = m40108a();
        o31 invoke = this.f37849b.invoke();
        ea0 invoke2 = this.f37848a.invoke();
        ea0.m35609a(invoke2, "Div.Render.Total", a.mo69311d(), this.f37850c, (String) null, invoke.mo69104d(), 8, (Object) null);
        ea0.m35609a(invoke2, "Div.Render.Measure", a.mo69309c(), this.f37850c, (String) null, invoke.mo69103c(), 8, (Object) null);
        ea0.m35609a(invoke2, "Div.Render.Layout", a.mo69307b(), this.f37850c, (String) null, invoke.mo69102b(), 8, (Object) null);
        ea0.m35609a(invoke2, "Div.Render.Draw", a.mo69305a(), this.f37850c, (String) null, invoke.mo69101a(), 8, (Object) null);
        this.f37854g = null;
        this.f37853f = null;
        this.f37855h = null;
        m40108a().mo69313e();
    }

    /* renamed from: e */
    public final void mo69051e() {
        this.f37855h = Long.valueOf(SystemClock.uptimeMillis());
    }

    /* renamed from: f */
    public final void mo69052f() {
        Long l = this.f37854g;
        if (l != null) {
            m40108a().mo69308b(SystemClock.uptimeMillis() - l.longValue());
        }
    }

    /* renamed from: g */
    public final void mo69053g() {
        this.f37854g = Long.valueOf(SystemClock.uptimeMillis());
    }

    /* renamed from: h */
    public final void mo69054h() {
        Long l = this.f37853f;
        if (l != null) {
            m40108a().mo69310c(SystemClock.uptimeMillis() - l.longValue());
        }
    }

    /* renamed from: i */
    public final void mo69055i() {
        this.f37853f = Long.valueOf(SystemClock.uptimeMillis());
    }

    /* renamed from: j */
    public final void mo69056j() {
        Long l = this.f37852e;
        p31 a = m40108a();
        if (l != null) {
            long uptimeMillis = SystemClock.uptimeMillis() - l.longValue();
            a.mo69314e(uptimeMillis);
            ea0.m35609a(this.f37848a.invoke(), "Div.Rebinding", uptimeMillis, this.f37850c, (String) null, (ba0) null, 24, (Object) null);
        }
        this.f37852e = null;
    }

    /* renamed from: k */
    public final void mo69057k() {
        this.f37852e = Long.valueOf(SystemClock.uptimeMillis());
    }

    /* renamed from: a */
    private final p31 m40108a() {
        return (p31) this.f37856i.getValue();
    }

    /* renamed from: a */
    public final void mo69046a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ov0.f38388e.mo69273a(view, (C14108a) this.f37857j.getValue());
    }
}
