package com.smaato.sdk.core.violationreporter;

import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.util.Objects;

public final class AdQualityViolationException extends Exception {
    public final String adQualityViolationType;
    public final String originalUrl;
    public final SomaApiContext somaApiContext;
    public final String violatedUrl;

    public AdQualityViolationException(String str, SomaApiContext somaApiContext2, String str2, String str3) {
        this.adQualityViolationType = (String) Objects.requireNonNull(str);
        this.somaApiContext = (SomaApiContext) Objects.requireNonNull(somaApiContext2);
        this.violatedUrl = (String) Objects.requireNonNull(str2);
        this.originalUrl = (String) Objects.requireNonNull(str3);
    }

    public final String toString() {
        return "AdQualityViolationException{adQualityViolationType=" + this.adQualityViolationType + ", somaApiContext=" + this.somaApiContext + ", violatedUrl='" + this.violatedUrl + '\'' + ", originalUrl='" + this.originalUrl + '\'' + '}';
    }
}
