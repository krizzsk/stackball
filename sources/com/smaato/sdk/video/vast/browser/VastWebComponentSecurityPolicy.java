package com.smaato.sdk.video.vast.browser;

import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.UrlCreator;
import com.smaato.sdk.core.util.Objects;

public class VastWebComponentSecurityPolicy {
    private final String baseUrl;
    private final Logger logger;
    private final UrlCreator urlCreator;

    public VastWebComponentSecurityPolicy(Logger logger2, String str, UrlCreator urlCreator2) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.baseUrl = (String) Objects.requireNonNull(str);
        this.urlCreator = (UrlCreator) Objects.requireNonNull(urlCreator2);
    }

    public boolean validateUrl(SomaApiContext somaApiContext, String str) {
        if ((somaApiContext == null && str.startsWith(this.baseUrl)) || !this.urlCreator.isSupportedForNetworking(str)) {
            return true;
        }
        String extractScheme = this.urlCreator.extractScheme(str);
        boolean z = this.urlCreator.isSecureScheme(extractScheme) || (this.urlCreator.isInsecureScheme(extractScheme) && somaApiContext != null && !somaApiContext.isHttpsOnly());
        if (!z) {
            this.logger.error(LogDomain.VAST, "Invalid url or violation of httpsOnly rule: Url: %s , SomaApiContext: %s", str, somaApiContext);
        }
        return z;
    }
}
