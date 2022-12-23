package com.smaato.sdk.openmeasurement;

import com.iab.omid.library.smaato.adsession.VerificationScriptResource;
import com.smaato.sdk.core.analytics.ViewabilityVerificationResource;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.core.util.p251fi.Function;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

final class OMVideoResourceMapper implements Function<List<ViewabilityVerificationResource>, List<VerificationScriptResource>> {
    private final String frameworkName;

    OMVideoResourceMapper(String str) {
        this.frameworkName = (String) Objects.requireNonNull(str);
    }

    public final List<VerificationScriptResource> apply(List<ViewabilityVerificationResource> list) {
        URL parseUrl;
        VerificationScriptResource verificationScriptResource;
        ArrayList arrayList = new ArrayList();
        for (ViewabilityVerificationResource next : list) {
            if (next.getApiFramework().equals(this.frameworkName) && next.isNoBrowser() && (parseUrl = parseUrl(next.getJsScriptUrl())) != null) {
                String vendor = next.getVendor();
                String parameters = next.getParameters();
                if (TextUtils.isEmpty(parameters) && TextUtils.isEmpty(vendor)) {
                    verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(parseUrl);
                } else if (TextUtils.isEmpty(parameters)) {
                    verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(vendor, parseUrl);
                } else {
                    verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithParameters(vendor, parseUrl, parameters);
                }
                arrayList.add(verificationScriptResource);
            }
        }
        return arrayList;
    }

    private static URL parseUrl(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException unused) {
            return null;
        }
    }
}
