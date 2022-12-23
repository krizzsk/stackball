package com.yandex.metrica;

public class FeaturesResult {
    private final Boolean libSslEnabled;

    public FeaturesResult(Boolean bool) {
        this.libSslEnabled = bool;
    }

    public Boolean getLibSslEnabled() {
        return this.libSslEnabled;
    }
}
