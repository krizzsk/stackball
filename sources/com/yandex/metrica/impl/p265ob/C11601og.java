package com.yandex.metrica.impl.p265ob;

import android.util.Log;
import com.yandex.metrica.C12041j;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.plugins.PluginErrorDetails;

/* renamed from: com.yandex.metrica.impl.ob.og */
public class C11601og implements IPluginReporter {

    /* renamed from: a */
    private final C12029zg f27849a;

    /* renamed from: b */
    private final C12041j f27850b;

    /* renamed from: c */
    private final C11769sn f27851c;

    /* renamed from: d */
    private final C10971Ym<C10868W0> f27852d;

    /* renamed from: com.yandex.metrica.impl.ob.og$a */
    class C11602a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PluginErrorDetails f27853a;

        C11602a(PluginErrorDetails pluginErrorDetails) {
            this.f27853a = pluginErrorDetails;
        }

        public void run() {
            C11601og.m29985a(C11601og.this).reportUnhandledException(this.f27853a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.og$b */
    class C11603b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PluginErrorDetails f27855a;

        /* renamed from: b */
        final /* synthetic */ String f27856b;

        C11603b(PluginErrorDetails pluginErrorDetails, String str) {
            this.f27855a = pluginErrorDetails;
            this.f27856b = str;
        }

        public void run() {
            C11601og.m29985a(C11601og.this).reportError(this.f27855a, this.f27856b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.og$c */
    class C11604c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f27858a;

        /* renamed from: b */
        final /* synthetic */ String f27859b;

        /* renamed from: c */
        final /* synthetic */ PluginErrorDetails f27860c;

        C11604c(String str, String str2, PluginErrorDetails pluginErrorDetails) {
            this.f27858a = str;
            this.f27859b = str2;
            this.f27860c = pluginErrorDetails;
        }

        public void run() {
            C11601og.m29985a(C11601og.this).reportError(this.f27858a, this.f27859b, this.f27860c);
        }
    }

    public C11601og(C12029zg zgVar, C12041j jVar, C11769sn snVar, C10971Ym<C10868W0> ym) {
        this.f27849a = zgVar;
        this.f27850b = jVar;
        this.f27851c = snVar;
        this.f27852d = ym;
    }

    /* renamed from: a */
    static IPluginReporter m29985a(C11601og ogVar) {
        return ogVar.f27852d.mo62554a().getPluginExtension();
    }

    public void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        if (!this.f27849a.mo64194a(pluginErrorDetails, str)) {
            Log.w("AppMetrica", "Error stacktrace must be non empty");
            return;
        }
        this.f27850b.getClass();
        ((C11725rn) this.f27851c).execute(new C11603b(pluginErrorDetails, str));
    }

    public void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        this.f27849a.reportUnhandledException(pluginErrorDetails);
        this.f27850b.getClass();
        ((C11725rn) this.f27851c).execute(new C11602a(pluginErrorDetails));
    }

    public void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f27849a.reportError(str, str2, pluginErrorDetails);
        this.f27850b.getClass();
        ((C11725rn) this.f27851c).execute(new C11604c(str, str2, pluginErrorDetails));
    }
}
