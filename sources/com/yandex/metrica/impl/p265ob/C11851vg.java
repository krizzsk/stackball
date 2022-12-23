package com.yandex.metrica.impl.p265ob;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.util.Log;
import android.webkit.WebView;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.C10086i;
import com.yandex.metrica.C12041j;
import com.yandex.metrica.C12043l;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IReporter;
import com.yandex.metrica.ReporterConfig;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.impl.p265ob.C11962y;
import com.yandex.metrica.profile.UserProfile;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.vg */
public final class C11851vg extends C11564ng {

    /* renamed from: i */
    private final C11717rg f28488i;

    /* renamed from: j */
    private final C11986yg f28489j;

    /* renamed from: k */
    private final C11949xg f28490k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C10353I2 f28491l;

    /* renamed from: com.yandex.metrica.impl.ob.vg$A */
    class C11852A implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11962y.C11965c f28492a;

        C11852A(C11962y.C11965c cVar) {
            this.f28492a = cVar;
        }

        public void run() {
            C11851vg.m30601a(C11851vg.this).mo61674a(this.f28492a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$B */
    class C11853B implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f28494a;

        C11853B(String str) {
            this.f28494a = str;
        }

        public void run() {
            C11851vg.m30601a(C11851vg.this).reportEvent(this.f28494a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$C */
    class C11854C implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f28496a;

        /* renamed from: b */
        final /* synthetic */ String f28497b;

        C11854C(String str, String str2) {
            this.f28496a = str;
            this.f28497b = str2;
        }

        public void run() {
            C11851vg.m30601a(C11851vg.this).reportEvent(this.f28496a, this.f28497b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$D */
    class C11855D implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f28499a;

        /* renamed from: b */
        final /* synthetic */ List f28500b;

        C11855D(String str, List list) {
            this.f28499a = str;
            this.f28500b = list;
        }

        public void run() {
            C11851vg.m30601a(C11851vg.this).reportEvent(this.f28499a, (Map<String, Object>) C10796U2.m27884a(this.f28500b));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$E */
    class C11856E implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f28502a;

        /* renamed from: b */
        final /* synthetic */ Throwable f28503b;

        C11856E(String str, Throwable th) {
            this.f28502a = str;
            this.f28503b = th;
        }

        public void run() {
            C11851vg.m30601a(C11851vg.this).reportError(this.f28502a, this.f28503b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$a */
    class C11857a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f28505a;

        /* renamed from: b */
        final /* synthetic */ String f28506b;

        /* renamed from: c */
        final /* synthetic */ Throwable f28507c;

        C11857a(String str, String str2, Throwable th) {
            this.f28505a = str;
            this.f28506b = str2;
            this.f28507c = th;
        }

        public void run() {
            C11851vg.m30601a(C11851vg.this).reportError(this.f28505a, this.f28506b, this.f28507c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$b */
    class C11858b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Throwable f28509a;

        C11858b(Throwable th) {
            this.f28509a = th;
        }

        public void run() {
            C11851vg.m30601a(C11851vg.this).reportUnhandledException(this.f28509a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$c */
    class C11859c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f28511a;

        C11859c(String str) {
            this.f28511a = str;
        }

        public void run() {
            C11851vg.m30601a(C11851vg.this).mo61580c(this.f28511a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$d */
    class C11860d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Intent f28513a;

        C11860d(Intent intent) {
            this.f28513a = intent;
        }

        public void run() {
            C11851vg.m30603c(C11851vg.this).mo63696a().mo63564a(this.f28513a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$e */
    class C11861e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f28515a;

        C11861e(String str) {
            this.f28515a = str;
        }

        public void run() {
            C11851vg.m30603c(C11851vg.this).mo63696a().mo63565a(this.f28515a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$f */
    class C11862f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Intent f28517a;

        C11862f(Intent intent) {
            this.f28517a = intent;
        }

        public void run() {
            C11851vg.m30603c(C11851vg.this).mo63696a().mo63564a(this.f28517a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$g */
    class C11863g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f28519a;

        C11863g(String str) {
            this.f28519a = str;
        }

        public void run() {
            C11851vg.m30601a(C11851vg.this).mo61675a(this.f28519a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$h */
    class C11864h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Location f28521a;

        C11864h(Location location) {
            this.f28521a = location;
        }

        public void run() {
            C11791tg e = C11851vg.this.mo63383e();
            Location location = this.f28521a;
            e.getClass();
            C11479l3.m29685a(location);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$i */
    class C11865i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f28523a;

        C11865i(boolean z) {
            this.f28523a = z;
        }

        public void run() {
            C11791tg e = C11851vg.this.mo63383e();
            boolean z = this.f28523a;
            e.getClass();
            C11479l3.m29688a(z);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$j */
    class C11866j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f28525a;

        C11866j(boolean z) {
            this.f28525a = z;
        }

        public void run() {
            C11791tg e = C11851vg.this.mo63383e();
            boolean z = this.f28525a;
            e.getClass();
            C11479l3.m29688a(z);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$k */
    class C11867k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f28527a;

        /* renamed from: b */
        final /* synthetic */ YandexMetricaConfig f28528b;

        /* renamed from: c */
        final /* synthetic */ C12043l f28529c;

        C11867k(Context context, YandexMetricaConfig yandexMetricaConfig, C12043l lVar) {
            this.f28527a = context;
            this.f28528b = yandexMetricaConfig;
            this.f28529c = lVar;
        }

        public void run() {
            C11791tg e = C11851vg.this.mo63383e();
            Context context = this.f28527a;
            e.getClass();
            C11479l3.m29684a(context).mo63262b(this.f28528b, C11851vg.this.mo63381c().mo63754a(this.f28529c));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$l */
    class C11868l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f28531a;

        C11868l(boolean z) {
            this.f28531a = z;
        }

        public void run() {
            C11791tg e = C11851vg.this.mo63383e();
            boolean z = this.f28531a;
            e.getClass();
            C11479l3.m29692c(z);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$m */
    class C11869m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f28533a;

        C11869m(String str) {
            this.f28533a = str;
        }

        public void run() {
            C11791tg e = C11851vg.this.mo63383e();
            String str = this.f28533a;
            e.getClass();
            C11479l3.m29686a(str);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$n */
    class C11870n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ UserProfile f28535a;

        C11870n(UserProfile userProfile) {
            this.f28535a = userProfile;
        }

        public void run() {
            C11851vg.m30601a(C11851vg.this).reportUserProfile(this.f28535a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$o */
    class C11871o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Revenue f28537a;

        C11871o(Revenue revenue) {
            this.f28537a = revenue;
        }

        public void run() {
            C11851vg.m30601a(C11851vg.this).reportRevenue(this.f28537a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$p */
    class C11872p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ECommerceEvent f28539a;

        C11872p(ECommerceEvent eCommerceEvent) {
            this.f28539a = eCommerceEvent;
        }

        public void run() {
            C11851vg.m30601a(C11851vg.this).reportECommerce(this.f28539a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$q */
    class C11873q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DeferredDeeplinkParametersListener f28541a;

        C11873q(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
            this.f28541a = deferredDeeplinkParametersListener;
        }

        public void run() {
            C11851vg.this.mo63383e().getClass();
            C11479l3.m29698k().mo63258a(this.f28541a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$r */
    class C11874r implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DeferredDeeplinkListener f28543a;

        C11874r(DeferredDeeplinkListener deferredDeeplinkListener) {
            this.f28543a = deferredDeeplinkListener;
        }

        public void run() {
            C11851vg.this.mo63383e().getClass();
            C11479l3.m29698k().mo63257a(this.f28543a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$s */
    class C11875s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AppMetricaDeviceIDListener f28545a;

        C11875s(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
            this.f28545a = appMetricaDeviceIDListener;
        }

        public void run() {
            C11851vg.this.mo63383e().getClass();
            C11479l3.m29698k().mo63261b(this.f28545a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$t */
    class C11876t implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f28547a;

        /* renamed from: b */
        final /* synthetic */ String f28548b;

        C11876t(String str, String str2) {
            this.f28547a = str;
            this.f28548b = str2;
        }

        public void run() {
            C11791tg e = C11851vg.this.mo63383e();
            String str = this.f28547a;
            String str2 = this.f28548b;
            e.getClass();
            C11479l3.m29687a(str, str2);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$u */
    class C11877u implements Runnable {
        C11877u() {
        }

        public void run() {
            C11851vg.m30601a(C11851vg.this).mo61673a(C11851vg.this.mo63386h());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$v */
    class C11878v implements Runnable {
        C11878v() {
        }

        public void run() {
            C11851vg.m30601a(C11851vg.this).sendEventsBuffer();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$w */
    class C11879w implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f28552a;

        /* renamed from: b */
        final /* synthetic */ String f28553b;

        C11879w(String str, String str2) {
            this.f28552a = str;
            this.f28553b = str2;
        }

        public void run() {
            C11851vg.m30601a(C11851vg.this).mo61574a(this.f28552a, this.f28553b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$x */
    class C11880x implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f28555a;

        C11880x(String str) {
            this.f28555a = str;
        }

        public void run() {
            C11851vg.m30601a(C11851vg.this).mo61579b(this.f28555a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$y */
    class C11881y implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f28557a;

        C11881y(Activity activity) {
            this.f28557a = activity;
        }

        public void run() {
            C11851vg.this.f28491l.mo61477b(this.f28557a, C11851vg.m30601a(C11851vg.this));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vg$z */
    class C11882z implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f28559a;

        C11882z(Activity activity) {
            this.f28559a = activity;
        }

        public void run() {
            C11851vg.this.f28491l.mo61475a(this.f28559a, C11851vg.m30601a(C11851vg.this));
        }
    }

    public C11851vg(C11769sn snVar) {
        this(new C11791tg(), snVar, new C11986yg(), new C11949xg(), new C10908X2());
    }

    /* renamed from: a */
    public void mo63850a(Context context, YandexMetricaConfig yandexMetricaConfig) {
        C12043l lVar;
        this.f28489j.mo64157a(context, yandexMetricaConfig);
        C11949xg xgVar = this.f28490k;
        if (yandexMetricaConfig instanceof C12043l) {
            lVar = (C12043l) yandexMetricaConfig;
        } else {
            lVar = new C12043l(yandexMetricaConfig);
        }
        C12043l a = xgVar.mo64079a(lVar);
        mo63385g().mo64232a(context, (YandexMetricaConfig) a);
        ((C11725rn) mo63382d()).execute(new C11867k(context, yandexMetricaConfig, a));
        mo63383e().getClass();
        C11479l3.m29697j();
    }

    /* renamed from: c */
    public void mo63872c(Activity activity) {
        mo63379a().mo61590a(null);
        this.f28489j.getClass();
        mo63385g().getClass();
        ((C11725rn) mo63382d()).execute(new C11881y(activity));
    }

    /* renamed from: d */
    public void mo63875d(String str) {
        mo63379a().mo61590a(null);
        this.f28489j.mo64167c(str);
        mo63385g().getClass();
        ((C11725rn) mo63382d()).execute(new C11859c(str));
    }

    /* renamed from: e */
    public void mo63876e(String str) {
        mo63379a().mo61590a(null);
        this.f28489j.mo64164a(str);
        ((C11725rn) mo63382d()).execute(new C11863g(str));
    }

    /* renamed from: f */
    public void mo63877f(String str) {
        this.f28489j.getClass();
        mo63385g().getClass();
        ((C11725rn) mo63382d()).execute(new C11869m(str));
    }

    /* renamed from: i */
    public void mo63878i() {
        mo63379a().mo61590a(null);
        this.f28489j.getClass();
        mo63385g().getClass();
        ((C11725rn) mo63382d()).execute(new C11878v());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C11851vg(com.yandex.metrica.impl.p265ob.C11791tg r14, com.yandex.metrica.impl.p265ob.C11769sn r15, com.yandex.metrica.impl.p265ob.C11986yg r16, com.yandex.metrica.impl.p265ob.C11949xg r17, com.yandex.metrica.impl.p265ob.C10908X2 r18) {
        /*
            r13 = this;
            r1 = r14
            com.yandex.metrica.impl.ob.mg r5 = new com.yandex.metrica.impl.ob.mg
            r5.<init>(r14)
            com.yandex.metrica.impl.ob.rg r6 = new com.yandex.metrica.impl.ob.rg
            r6.<init>(r14)
            com.yandex.metrica.j r8 = new com.yandex.metrica.j
            r7 = r18
            r8.<init>(r14, r7)
            com.yandex.metrica.impl.ob.qg r9 = com.yandex.metrica.impl.p265ob.C11684qg.m30108a()
            com.yandex.metrica.impl.ob.Y r0 = com.yandex.metrica.impl.p265ob.C10941Y.m28234g()
            com.yandex.metrica.impl.ob.u0 r10 = r0.mo62502f()
            com.yandex.metrica.impl.ob.Y r0 = com.yandex.metrica.impl.p265ob.C10941Y.m28234g()
            com.yandex.metrica.impl.ob.I2 r11 = r0.mo62506k()
            com.yandex.metrica.impl.ob.Y r0 = com.yandex.metrica.impl.p265ob.C10941Y.m28234g()
            com.yandex.metrica.impl.ob.i0 r12 = r0.mo62501e()
            r0 = r13
            r2 = r15
            r3 = r16
            r4 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11851vg.<init>(com.yandex.metrica.impl.ob.tg, com.yandex.metrica.impl.ob.sn, com.yandex.metrica.impl.ob.yg, com.yandex.metrica.impl.ob.xg, com.yandex.metrica.impl.ob.X2):void");
    }

    /* renamed from: b */
    public void mo63870b(String str) {
        mo63379a().mo61590a(null);
        this.f28489j.reportEvent(str);
        mo63385g().getClass();
        ((C11725rn) mo63382d()).execute(new C11853B(str));
    }

    /* renamed from: b */
    public void mo63871b(String str, String str2) {
        mo63379a().mo61590a(null);
        this.f28489j.reportEvent(str, str2);
        mo63385g().getClass();
        ((C11725rn) mo63382d()).execute(new C11854C(str, str2));
    }

    /* renamed from: c */
    public void mo63874c(String str, String str2) {
        mo63379a().mo61590a(null);
        if (!this.f28489j.mo64170f(str)) {
            Log.w("AppMetrica", "Impossible to report event because parameters are invalid.");
            return;
        }
        mo63385g().getClass();
        ((C11725rn) mo63382d()).execute(new C11879w(str, str2));
    }

    /* renamed from: b */
    public void mo63868b(Activity activity) {
        Intent intent = null;
        mo63379a().mo61590a(null);
        this.f28489j.mo64166c(activity);
        mo63385g().getClass();
        if (activity != null) {
            try {
                intent = activity.getIntent();
            } catch (Throwable unused) {
            }
        }
        ((C11725rn) mo63382d()).execute(new C11860d(intent));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C11851vg(C11791tg tgVar, C11769sn snVar, C11986yg ygVar, C11949xg xgVar, C11530mg mgVar, C11717rg rgVar, C10908X2 x2, C12041j jVar, C11684qg qgVar, C11801u0 u0Var, C10353I2 i2, C11328i0 i0Var) {
        super(tgVar, snVar, mgVar, x2, jVar, qgVar, u0Var, i0Var);
        this.f28490k = xgVar;
        this.f28489j = ygVar;
        this.f28488i = rgVar;
        this.f28491l = i2;
    }

    /* renamed from: c */
    public void mo63873c(String str) {
        if (this.f28488i.mo63602a().mo63695b() && this.f28489j.mo64171g(str)) {
            mo63385g().getClass();
            ((C11725rn) mo63382d()).execute(new C11880x(str));
        }
    }

    /* renamed from: b */
    public void mo63869b(Context context, boolean z) {
        this.f28489j.mo64165b(context);
        mo63385g().mo64235c(context);
        ((C11725rn) mo63382d()).execute(new C11868l(z));
    }

    /* renamed from: c */
    static C11773t1 m30603c(C11851vg vgVar) {
        vgVar.mo63383e().getClass();
        return C11479l3.m29698k().mo63266d();
    }

    /* renamed from: a */
    public void mo63847a(Activity activity) {
        mo63379a().mo61590a(null);
        this.f28489j.getClass();
        mo63385g().getClass();
        ((C11725rn) mo63382d()).execute(new C11882z(activity));
    }

    /* renamed from: a */
    public void mo63848a(Application application) {
        mo63379a().mo61590a(null);
        this.f28489j.mo64154a(application);
        C11962y.C11965c a = mo63385g().mo64230a(application);
        ((C11725rn) mo63382d()).execute(new C11852A(a));
    }

    /* renamed from: a */
    public void mo63865a(String str, Map<String, Object> map) {
        mo63379a().mo61590a(null);
        this.f28489j.reportEvent(str, map);
        mo63385g().getClass();
        List<Map.Entry<String, Object>> a = C10796U2.m27882a(map);
        ((C11725rn) mo63382d()).execute(new C11855D(str, a));
    }

    /* renamed from: a */
    public void mo63864a(String str, Throwable th) {
        mo63379a().mo61590a(null);
        this.f28489j.reportError(str, th);
        mo63385g().getClass();
        if (th == null) {
            th = new C10742S6();
            th.fillInStackTrace();
        }
        ((C11725rn) mo63382d()).execute(new C11856E(str, th));
    }

    /* renamed from: a */
    public void mo63863a(String str, String str2, Throwable th) {
        mo63379a().mo61590a(null);
        this.f28489j.reportError(str, str2, th);
        ((C11725rn) mo63382d()).execute(new C11857a(str, str2, th));
    }

    /* renamed from: a */
    public void mo63866a(Throwable th) {
        mo63379a().mo61590a(null);
        this.f28489j.reportUnhandledException(th);
        mo63385g().getClass();
        ((C11725rn) mo63382d()).execute(new C11858b(th));
    }

    /* renamed from: a */
    public void mo63861a(String str) {
        mo63379a().mo61590a(null);
        this.f28489j.mo64169e(str);
        mo63385g().getClass();
        ((C11725rn) mo63382d()).execute(new C11861e(str));
    }

    /* renamed from: a */
    public void mo63852a(Intent intent) {
        mo63379a().mo61590a(null);
        this.f28489j.mo64159a(intent);
        mo63385g().getClass();
        ((C11725rn) mo63382d()).execute(new C11862f(intent));
    }

    /* renamed from: a */
    public void mo63853a(Location location) {
        this.f28489j.getClass();
        mo63385g().getClass();
        ((C11725rn) mo63382d()).execute(new C11864h(location));
    }

    /* renamed from: a */
    public void mo63867a(boolean z) {
        this.f28489j.getClass();
        mo63385g().getClass();
        ((C11725rn) mo63382d()).execute(new C11865i(z));
    }

    /* renamed from: a */
    public void mo63851a(Context context, boolean z) {
        this.f28489j.mo64155a(context);
        mo63385g().mo64234b(context);
        ((C11725rn) mo63382d()).execute(new C11866j(z));
    }

    /* renamed from: a */
    public void mo63860a(UserProfile userProfile) {
        mo63379a().mo61590a(null);
        this.f28489j.reportUserProfile(userProfile);
        mo63385g().getClass();
        ((C11725rn) mo63382d()).execute(new C11870n(userProfile));
    }

    /* renamed from: a */
    public void mo63858a(Revenue revenue) {
        mo63379a().mo61590a(null);
        this.f28489j.reportRevenue(revenue);
        mo63385g().getClass();
        ((C11725rn) mo63382d()).execute(new C11871o(revenue));
    }

    /* renamed from: a */
    public void mo63859a(ECommerceEvent eCommerceEvent) {
        mo63379a().mo61590a(null);
        this.f28489j.reportECommerce(eCommerceEvent);
        mo63385g().getClass();
        ((C11725rn) mo63382d()).execute(new C11872p(eCommerceEvent));
    }

    /* renamed from: a */
    public void mo63857a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        mo63379a().mo61590a(null);
        this.f28489j.mo64163a(deferredDeeplinkParametersListener);
        mo63385g().getClass();
        ((C11725rn) mo63382d()).execute(new C11873q(deferredDeeplinkParametersListener));
    }

    /* renamed from: a */
    public void mo63856a(DeferredDeeplinkListener deferredDeeplinkListener) {
        mo63379a().mo61590a(null);
        this.f28489j.mo64162a(deferredDeeplinkListener);
        mo63385g().getClass();
        ((C11725rn) mo63382d()).execute(new C11874r(deferredDeeplinkListener));
    }

    /* renamed from: a */
    public void mo63855a(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        mo63379a().mo61590a(null);
        this.f28489j.mo64161a(appMetricaDeviceIDListener);
        mo63385g().getClass();
        ((C11725rn) mo63382d()).execute(new C11875s(appMetricaDeviceIDListener));
    }

    /* renamed from: a */
    public IReporter mo63846a(Context context, String str) {
        this.f28489j.mo64158a(context, str);
        mo63380b().mo63025a(context);
        return mo63384f().mo63547a(context, str);
    }

    /* renamed from: a */
    public void mo63849a(Context context, ReporterConfig reporterConfig) {
        this.f28489j.mo64156a(context, reporterConfig);
        C10086i a = C10086i.m25952a(reporterConfig);
        mo63385g().mo64231a(context);
        mo63384f().mo63546a(context, a);
    }

    /* renamed from: a */
    public void mo63862a(String str, String str2) {
        this.f28489j.mo64168d(str);
        mo63385g().getClass();
        ((C11725rn) mo63382d()).execute(new C11876t(str, str2));
    }

    /* renamed from: a */
    public void mo63854a(WebView webView) {
        mo63379a().mo61590a(null);
        this.f28489j.mo64160a(webView);
        mo63385g().mo64233a(webView, this);
        ((C11725rn) mo63382d()).execute(new C11877u());
    }

    /* renamed from: a */
    static C10794U0 m30601a(C11851vg vgVar) {
        vgVar.mo63383e().getClass();
        return C11479l3.m29698k().mo63266d().mo63697b();
    }
}
