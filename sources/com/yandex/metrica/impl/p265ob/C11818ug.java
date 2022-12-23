package com.yandex.metrica.impl.p265ob;

import android.util.Log;
import com.yandex.metrica.C12041j;
import com.yandex.metrica.plugins.PluginErrorDetails;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.ug */
public final class C11818ug {

    /* renamed from: a */
    private final C11769sn f28386a;

    /* renamed from: b */
    private final C11791tg f28387b;

    /* renamed from: c */
    private final C11530mg f28388c;

    /* renamed from: d */
    private final C11986yg f28389d;

    /* renamed from: e */
    private final C12041j f28390e;

    /* renamed from: com.yandex.metrica.impl.ob.ug$a */
    static final class C11819a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11818ug f28391a;

        /* renamed from: b */
        final /* synthetic */ PluginErrorDetails f28392b;

        /* renamed from: c */
        final /* synthetic */ String f28393c;

        C11819a(C11818ug ugVar, PluginErrorDetails pluginErrorDetails, String str) {
            this.f28391a = ugVar;
            this.f28392b = pluginErrorDetails;
            this.f28393c = str;
        }

        public final void run() {
            C11818ug.m30528a(this.f28391a).getPluginExtension().reportError(this.f28392b, this.f28393c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ug$b */
    static final class C11820b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11818ug f28394a;

        /* renamed from: b */
        final /* synthetic */ String f28395b;

        /* renamed from: c */
        final /* synthetic */ String f28396c;

        /* renamed from: d */
        final /* synthetic */ PluginErrorDetails f28397d;

        C11820b(C11818ug ugVar, String str, String str2, PluginErrorDetails pluginErrorDetails) {
            this.f28394a = ugVar;
            this.f28395b = str;
            this.f28396c = str2;
            this.f28397d = pluginErrorDetails;
        }

        public final void run() {
            C11818ug.m30528a(this.f28394a).getPluginExtension().reportError(this.f28395b, this.f28396c, this.f28397d);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ug$c */
    static final class C11821c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11818ug f28398a;

        /* renamed from: b */
        final /* synthetic */ PluginErrorDetails f28399b;

        C11821c(C11818ug ugVar, PluginErrorDetails pluginErrorDetails) {
            this.f28398a = ugVar;
            this.f28399b = pluginErrorDetails;
        }

        public final void run() {
            C11818ug.m30528a(this.f28398a).getPluginExtension().reportUnhandledException(this.f28399b);
        }
    }

    public C11818ug(C11769sn snVar, C11791tg tgVar, C11530mg mgVar, C11986yg ygVar, C12041j jVar) {
        this.f28386a = snVar;
        this.f28387b = tgVar;
        this.f28388c = mgVar;
        this.f28389d = ygVar;
        this.f28390e = jVar;
    }

    /* renamed from: a */
    public final void mo63792a(PluginErrorDetails pluginErrorDetails) {
        this.f28388c.mo61590a(null);
        this.f28389d.mo61062a().reportUnhandledException(pluginErrorDetails);
        C12041j jVar = this.f28390e;
        Intrinsics.checkNotNull(pluginErrorDetails);
        jVar.getClass();
        ((C11725rn) this.f28386a).execute(new C11821c(this, pluginErrorDetails));
    }

    public C11818ug(C11769sn snVar) {
        this(snVar, new C11791tg());
    }

    private C11818ug(C11769sn snVar, C11791tg tgVar) {
        this(snVar, tgVar, new C11530mg(tgVar), new C11986yg(), new C12041j(tgVar, new C10908X2()));
    }

    /* renamed from: a */
    public final void mo63793a(PluginErrorDetails pluginErrorDetails, String str) {
        this.f28388c.mo61590a(null);
        if (!this.f28389d.mo61062a().mo64194a(pluginErrorDetails, str)) {
            Log.w("AppMetrica", "Error stacktrace must be non empty");
            return;
        }
        C12041j jVar = this.f28390e;
        Intrinsics.checkNotNull(pluginErrorDetails);
        jVar.getClass();
        ((C11725rn) this.f28386a).execute(new C11819a(this, pluginErrorDetails, str));
    }

    /* renamed from: a */
    public final void mo63794a(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f28388c.mo61590a(null);
        this.f28389d.mo61062a().reportError(str, str2, pluginErrorDetails);
        C12041j jVar = this.f28390e;
        Intrinsics.checkNotNull(str);
        jVar.getClass();
        ((C11725rn) this.f28386a).execute(new C11820b(this, str, str2, pluginErrorDetails));
    }

    /* renamed from: a */
    public static final C10794U0 m30528a(C11818ug ugVar) {
        ugVar.f28387b.getClass();
        C11479l3 k = C11479l3.m29698k();
        Intrinsics.checkNotNull(k);
        Intrinsics.checkNotNullExpressionValue(k, "provider.peekInitializedImpl()!!");
        C11773t1 d = k.mo63266d();
        Intrinsics.checkNotNull(d);
        Intrinsics.checkNotNullExpressionValue(d, "provider.peekInitialized…rterApiConsumerProvider!!");
        C10794U0 b = d.mo63697b();
        Intrinsics.checkNotNullExpressionValue(b, "provider.peekInitialized…erProvider!!.mainReporter");
        return b;
    }
}
