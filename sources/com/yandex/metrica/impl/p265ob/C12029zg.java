package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.plugins.PluginErrorDetails;
import com.yandex.metrica.plugins.StackTraceItem;
import java.util.Collection;

/* renamed from: com.yandex.metrica.impl.ob.zg */
public class C12029zg implements IPluginReporter {

    /* renamed from: a */
    private final C11829uo<PluginErrorDetails> f28895a = new C11726ro(new C11697qo("Error details"));

    /* renamed from: b */
    private final C11829uo<String> f28896b = new C11726ro(new C11666po("Error identifier"));

    /* renamed from: c */
    private final C11829uo<Collection<StackTraceItem>> f28897c = new C11613oo("Stacktrace");

    /* renamed from: a */
    public boolean mo64194a(PluginErrorDetails pluginErrorDetails, String str) {
        this.f28895a.mo61590a(pluginErrorDetails);
        return this.f28897c.mo61590a(pluginErrorDetails.getStacktrace()).mo63695b();
    }

    public void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        this.f28895a.mo61590a(pluginErrorDetails);
    }

    public void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        this.f28895a.mo61590a(pluginErrorDetails);
    }

    public void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f28896b.mo61590a(str);
    }
}
