package com.ogury.p245ed.internal;

import android.content.Context;
import android.util.Log;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p245ed.internal.C8112cp;
import com.ogury.p245ed.internal.C8122cw;
import com.ogury.p245ed.internal.C8219fc;
import com.ogury.p245ed.internal.C8229fk;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import p269io.presage.common.PresageSdkInitCallback;

/* renamed from: com.ogury.ed.internal.de */
public final class C8134de {

    /* renamed from: a */
    public static final C8135a f21072a = new C8135a((byte) 0);

    /* renamed from: b */
    private final C8112cp.C8113a f21073b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C8229fk.C8230a f21074c;

    /* renamed from: d */
    private final C8219fc.C8220a f21075d;

    /* renamed from: e */
    private final C8147di f21076e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C8233fn f21077f;

    /* renamed from: g */
    private final C8370jp f21078g;

    /* renamed from: h */
    private final C8144df f21079h;

    /* renamed from: i */
    private final C8262gm f21080i;

    /* renamed from: j */
    private final C8130db f21081j;

    /* renamed from: k */
    private final C8126cz f21082k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f21083l;

    /* renamed from: m */
    private List<PresageSdkInitCallback> f21084m;

    /* renamed from: d */
    public static String m22679d() {
        return "4.2.0";
    }

    private C8134de(C8112cp.C8113a aVar, C8229fk.C8230a aVar2, C8219fc.C8220a aVar3, C8147di diVar, C8233fn fnVar, C8370jp jpVar, C8144df dfVar, C8262gm gmVar, C8130db dbVar, C8126cz czVar) {
        C8467mq.m23881b(aVar, "completableFactory");
        C8467mq.m23881b(aVar2, "profigDaoFactory");
        C8467mq.m23881b(aVar3, "profigFactory");
        C8467mq.m23881b(diVar, "measurementsEventsLogger");
        C8467mq.m23881b(fnVar, "profigGateway");
        C8467mq.m23881b(jpVar, "omidSdk");
        C8467mq.m23881b(dfVar, "sdkIntegrationChecker");
        C8467mq.m23881b(gmVar, "topActivityMonitor");
        C8467mq.m23881b(dbVar, "crashReportWrapper");
        C8467mq.m23881b(czVar, "consentEventBus");
        this.f21073b = aVar;
        this.f21074c = aVar2;
        this.f21075d = aVar3;
        this.f21076e = diVar;
        this.f21077f = fnVar;
        this.f21078g = jpVar;
        this.f21079h = dfVar;
        this.f21080i = gmVar;
        this.f21081j = dbVar;
        this.f21082k = czVar;
        List<PresageSdkInitCallback> synchronizedList = Collections.synchronizedList(new LinkedList());
        C8467mq.m23878a((Object) synchronizedList, "synchronizedList(LinkedList())");
        this.f21084m = synchronizedList;
    }

    public /* synthetic */ C8134de() {
        this(C8112cp.f21042a, C8229fk.f21305a, C8219fc.f21271a, C8147di.f21106a, C8233fn.f21330a, C8370jp.f21621a, C8144df.f21099a, C8262gm.f21374a, new C8130db(), C8126cz.f21060a);
    }

    /* renamed from: com.ogury.ed.internal.de$a */
    public static final class C8135a {
        public /* synthetic */ C8135a(byte b) {
            this();
        }

        private C8135a() {
        }
    }

    /* renamed from: a */
    public final void mo53294a(C8125cy cyVar) {
        C8467mq.m23881b(cyVar, "adsConfig");
        OguryIntegrationLogger.m22104d("[Ads][setup] Starting...");
        Context a = cyVar.mo53292a();
        m22663a(a);
        C8144df.m22704a(a);
        int i = this.f21083l;
        if (i == 0 || i == 3) {
            this.f21083l = 2;
            CharSequence b = cyVar.mo53293b();
            if (!(b == null || b.length() == 0)) {
                C8112cp.C8113a.m22614a(new C8138d(this, a, cyVar)).mo53279a((C8432lk<? super Throwable, C8386ke>) new C8139e(this)).mo53280a((C8431lj<C8386ke>) new C8140f(this, a));
                return;
            }
            OguryIntegrationLogger.m22105e("[Ads][setup] Failed to set up (invalid asset key: \"" + cyVar.mo53293b() + "\")");
            Log.e("Presage", "PresageSdk.init() error", new IllegalArgumentException("The api key is null empty. Please provide a valid api key"));
            this.f21083l = 0;
            return;
        }
        OguryIntegrationLogger.m22104d("[Ads][setup] Already setting up or set up");
    }

    /* renamed from: com.ogury.ed.internal.de$d */
    static final class C8138d extends C8468mr implements C8431lj<C8386ke> {

        /* renamed from: a */
        final /* synthetic */ C8134de f21087a;

        /* renamed from: b */
        final /* synthetic */ Context f21088b;

        /* renamed from: c */
        final /* synthetic */ C8125cy f21089c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8138d(C8134de deVar, Context context, C8125cy cyVar) {
            super(0);
            this.f21087a = deVar;
            this.f21088b = context;
            this.f21089c = cyVar;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo53190a() {
            m22692b();
            return C8386ke.f21633a;
        }

        /* renamed from: b */
        private void m22692b() {
            C8229fk.C8230a unused = this.f21087a.f21074c;
            C8229fk a = C8229fk.C8230a.m23074a(this.f21088b);
            C8134de.m22674b(a, this.f21089c);
            this.f21087a.m22664a(this.f21088b, a);
        }
    }

    /* renamed from: com.ogury.ed.internal.de$e */
    static final class C8139e extends C8468mr implements C8432lk<Throwable, C8386ke> {

        /* renamed from: a */
        final /* synthetic */ C8134de f21090a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8139e(C8134de deVar) {
            super(1);
            this.f21090a = deVar;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo53077a(Object obj) {
            m22694a((Throwable) obj);
            return C8386ke.f21633a;
        }

        /* renamed from: a */
        private void m22694a(Throwable th) {
            C8467mq.m23881b(th, "it");
            this.f21090a.f21083l = 3;
            OguryIntegrationLogger.m22105e(C8467mq.m23873a("[Ads][setup] Failed to set up ", (Object) th.getMessage()));
            this.f21090a.m22682g();
        }
    }

    /* renamed from: com.ogury.ed.internal.de$f */
    static final class C8140f extends C8468mr implements C8431lj<C8386ke> {

        /* renamed from: a */
        final /* synthetic */ C8134de f21091a;

        /* renamed from: b */
        final /* synthetic */ Context f21092b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8140f(C8134de deVar, Context context) {
            super(0);
            this.f21091a = deVar;
            this.f21092b = context;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo53190a() {
            m22696b();
            return C8386ke.f21633a;
        }

        /* renamed from: b */
        private void m22696b() {
            OguryIntegrationLogger.m22104d("[Ads][setup] Completed!");
            this.f21091a.f21083l = 1;
            this.f21091a.m22681f();
            this.f21091a.m22671b(this.f21092b);
        }
    }

    /* renamed from: a */
    private final void m22663a(Context context) {
        try {
            this.f21080i.mo53612a(context);
        } catch (Throwable th) {
            C8261gl.m23201a(th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m22674b(C8229fk fkVar, C8125cy cyVar) {
        String b = cyVar.mo53293b();
        C8467mq.m23877a((Object) b);
        fkVar.mo53517e(b);
    }

    /* renamed from: a */
    public final boolean mo53296a() {
        return this.f21083l == 2;
    }

    /* renamed from: b */
    public final boolean mo53297b() {
        return this.f21083l == 1;
    }

    /* renamed from: e */
    private boolean m22680e() {
        return this.f21083l == 0;
    }

    /* renamed from: c */
    public final boolean mo53298c() {
        return this.f21083l == 3;
    }

    /* renamed from: a */
    public final void mo53295a(PresageSdkInitCallback presageSdkInitCallback) {
        C8467mq.m23881b(presageSdkInitCallback, "presageSdkInitCallback");
        if (mo53297b()) {
            presageSdkInitCallback.onSdkInitialized();
        } else if (mo53296a()) {
            this.f21084m.add(presageSdkInitCallback);
        } else if (m22680e()) {
            presageSdkInitCallback.onSdkNotInitialized();
        } else if (mo53298c()) {
            presageSdkInitCallback.onSdkInitFailed();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m22664a(Context context, C8229fk fkVar) {
        if (!m22677c(context)) {
            Context applicationContext = context.getApplicationContext();
            String i = fkVar.mo53521i();
            if (!C8467mq.m23880a((Object) i, (Object) "")) {
                C8219fc.C8220a aVar = this.f21075d;
                C8467mq.m23878a((Object) applicationContext, "appContext");
                C8219fc a = aVar.mo53483a(applicationContext);
                a.mo53482b();
                C8126cz.m22648b((C8431lj<C8386ke>) new C8141g(this, a));
                C8147di.m22715a(applicationContext);
                C8130db.m22653a(applicationContext, i);
                return;
            }
            OguryIntegrationLogger.m22105e("[Ads][setup] Failed to set up (invalid asset key: \"" + i + "\")");
            IllegalStateException illegalStateException = new IllegalStateException("There is no api key. Please call PresageSdk.init(context, apiKey) before trying to load or display an ad");
            Log.e("Presage", "Init Error", illegalStateException);
            throw illegalStateException;
        }
        OguryIntegrationLogger.m22105e("[Ads][setup] The app is not in main application process");
        throw new IllegalStateException("The app is not in main application process");
    }

    /* renamed from: com.ogury.ed.internal.de$g */
    static final class C8141g extends C8468mr implements C8431lj<C8386ke> {

        /* renamed from: a */
        final /* synthetic */ C8134de f21093a;

        /* renamed from: b */
        final /* synthetic */ C8219fc f21094b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8141g(C8134de deVar, C8219fc fcVar) {
            super(0);
            this.f21093a = deVar;
            this.f21094b = fcVar;
        }

        /* renamed from: b */
        private void m22698b() {
            C8134de.m22673b(this.f21094b);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo53190a() {
            m22698b();
            return C8386ke.f21633a;
        }
    }

    /* renamed from: com.ogury.ed.internal.de$b */
    static final class C8136b extends C8468mr implements C8431lj<C8386ke> {

        /* renamed from: a */
        final /* synthetic */ C8219fc f21085a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8136b(C8219fc fcVar) {
            super(0);
            this.f21085a = fcVar;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo53190a() {
            m22688b();
            return C8386ke.f21633a;
        }

        /* renamed from: b */
        private void m22688b() {
            this.f21085a.mo53481a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m22673b(C8219fc fcVar) {
        C8122cw.C8123a aVar = C8122cw.f21054a;
        C8122cw.C8123a.m22639a(new C8136b(fcVar)).mo53286b(C8137c.f21086a);
    }

    /* renamed from: com.ogury.ed.internal.de$c */
    static final class C8137c extends C8468mr implements C8432lk<C8386ke, C8386ke> {

        /* renamed from: a */
        public static final C8137c f21086a = new C8137c();

        C8137c() {
            super(1);
        }

        /* renamed from: a */
        private static void m22690a(C8386ke keVar) {
            C8467mq.m23881b(keVar, "it");
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo53077a(Object obj) {
            m22690a((C8386ke) obj);
            return C8386ke.f21633a;
        }
    }

    /* renamed from: com.ogury.ed.internal.de$h */
    static final class C8142h extends C8468mr implements C8431lj<C8232fm> {

        /* renamed from: a */
        final /* synthetic */ C8134de f21095a;

        /* renamed from: b */
        final /* synthetic */ Context f21096b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8142h(C8134de deVar, Context context) {
            super(0);
            this.f21095a = deVar;
            this.f21096b = context;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C8232fm mo53190a() {
            C8233fn unused = this.f21095a.f21077f;
            return C8233fn.m23113a(this.f21096b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m22671b(Context context) {
        C8122cw.C8123a aVar = C8122cw.f21054a;
        C8122cw.C8123a.m22639a(new C8142h(this, context)).mo53286b(new C8143i(this, context));
    }

    /* renamed from: com.ogury.ed.internal.de$i */
    static final class C8143i extends C8468mr implements C8432lk<C8232fm, C8386ke> {

        /* renamed from: a */
        final /* synthetic */ C8134de f21097a;

        /* renamed from: b */
        final /* synthetic */ Context f21098b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8143i(C8134de deVar, Context context) {
            super(1);
            this.f21097a = deVar;
            this.f21098b = context;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo53077a(Object obj) {
            m22702a((C8232fm) obj);
            return C8386ke.f21633a;
        }

        /* renamed from: a */
        private void m22702a(C8232fm fmVar) {
            C8134de.m22675b(fmVar, this.f21098b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m22675b(C8232fm fmVar, Context context) {
        if (fmVar != null && fmVar.mo53536c()) {
            C8370jp.m23725a(context);
        }
    }

    /* renamed from: c */
    private final boolean m22677c(Context context) {
        return !mo53297b() && !C8259gj.m23197a(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m22681f() {
        for (PresageSdkInitCallback onSdkInitialized : this.f21084m) {
            onSdkInitialized.onSdkInitialized();
        }
        this.f21084m.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m22682g() {
        for (PresageSdkInitCallback onSdkInitFailed : this.f21084m) {
            onSdkInitFailed.onSdkInitFailed();
        }
        this.f21084m.clear();
    }
}
