package com.iab.omid.library.inmobi.adsession;

import com.iab.omid.library.inmobi.p104d.C4680e;
import java.net.URL;

public final class VerificationScriptResource {
    private final URL resourceUrl;
    private final String vendorKey;
    private final String verificationParameters;

    private VerificationScriptResource(String str, URL url, String str2) {
        this.vendorKey = str;
        this.resourceUrl = url;
        this.verificationParameters = str2;
    }

    public static VerificationScriptResource createVerificationScriptResourceWithParameters(String str, URL url, String str2) {
        C4680e.m10056a(str, "VendorKey is null or empty");
        C4680e.m10054a((Object) url, "ResourceURL is null");
        C4680e.m10056a(str2, "VerificationParameters is null or empty");
        return new VerificationScriptResource(str, url, str2);
    }

    public static VerificationScriptResource createVerificationScriptResourceWithoutParameters(String str, URL url) {
        C4680e.m10056a(str, "VendorKey is null or empty");
        C4680e.m10054a((Object) url, "ResourceURL is null");
        return new VerificationScriptResource(str, url, (String) null);
    }

    public static VerificationScriptResource createVerificationScriptResourceWithoutParameters(URL url) {
        C4680e.m10054a((Object) url, "ResourceURL is null");
        return new VerificationScriptResource((String) null, url, (String) null);
    }

    public final URL getResourceUrl() {
        return this.resourceUrl;
    }

    public final String getVendorKey() {
        return this.vendorKey;
    }

    public final String getVerificationParameters() {
        return this.verificationParameters;
    }
}
