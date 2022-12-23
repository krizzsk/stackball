package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.plugins.PluginErrorDetails;
import com.yandex.metrica.plugins.YandexMetricaPlugins;

/* renamed from: com.yandex.metrica.impl.ob.p3 */
public final class C11619p3 implements YandexMetricaPlugins {

    /* renamed from: a */
    private final C11818ug f27878a;

    public C11619p3(C11818ug ugVar) {
        this.f27878a = ugVar;
    }

    public void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        this.f27878a.mo63793a(pluginErrorDetails, str);
    }

    public void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        this.f27878a.mo63792a(pluginErrorDetails);
    }

    public void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f27878a.mo63794a(str, str2, pluginErrorDetails);
    }
}
