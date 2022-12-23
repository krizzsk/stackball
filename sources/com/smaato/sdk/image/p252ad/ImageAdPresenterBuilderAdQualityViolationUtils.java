package com.smaato.sdk.image.p252ad;

import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.network.exception.HttpsOnlyPolicyViolationException;
import com.smaato.sdk.core.network.exception.HttpsOnlyPolicyViolationOnRedirectException;
import com.smaato.sdk.core.resourceloader.ResourceLoaderException;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.SdkComponentException;
import com.smaato.sdk.core.violationreporter.AdQualityViolationException;

/* renamed from: com.smaato.sdk.image.ad.ImageAdPresenterBuilderAdQualityViolationUtils */
public final class ImageAdPresenterBuilderAdQualityViolationUtils {
    public final ResourceLoaderException substituteReasonWithAdQualityViolationExceptionIfRequired(SomaApiContext somaApiContext, ResourceLoaderException resourceLoaderException) {
        Objects.requireNonNull(somaApiContext);
        Objects.requireNonNull(resourceLoaderException);
        Exception reason = resourceLoaderException.getReason();
        while (reason instanceof SdkComponentException) {
            reason = ((SdkComponentException) reason).getReason();
        }
        if (reason instanceof HttpsOnlyPolicyViolationException) {
            return new ResourceLoaderException(resourceLoaderException.getErrorType(), new AdQualityViolationException("SOMAAdSSLViolationTypeImageNotHttps", somaApiContext, ((HttpsOnlyPolicyViolationException) reason).violatedUrl, somaApiContext.getApiAdResponse().getRequestUrl()));
        } else if (!(reason instanceof HttpsOnlyPolicyViolationOnRedirectException)) {
            return resourceLoaderException;
        } else {
            HttpsOnlyPolicyViolationOnRedirectException httpsOnlyPolicyViolationOnRedirectException = (HttpsOnlyPolicyViolationOnRedirectException) reason;
            return new ResourceLoaderException(resourceLoaderException.getErrorType(), new AdQualityViolationException("SOMAAdSSLViolationTypeImageNotHttpsRedirect", somaApiContext, httpsOnlyPolicyViolationOnRedirectException.violatedUrl, httpsOnlyPolicyViolationOnRedirectException.originalUrl));
        }
    }
}
