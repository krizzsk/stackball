package com.yandex.metrica.plugins;

public interface YandexMetricaPlugins {
    void reportError(PluginErrorDetails pluginErrorDetails, String str);

    void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails);

    void reportUnhandledException(PluginErrorDetails pluginErrorDetails);
}
