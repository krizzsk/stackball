package com.iab.omid.library.adcolony.adsession;

import com.iab.omid.library.adcolony.p092d.C4581e;
import java.net.URL;

public final class VerificationScriptResource {

    /* renamed from: a */
    private final String f10254a;

    /* renamed from: b */
    private final URL f10255b;

    /* renamed from: c */
    private final String f10256c;

    private VerificationScriptResource(String str, URL url, String str2) {
        this.f10254a = str;
        this.f10255b = url;
        this.f10256c = str2;
    }

    public static VerificationScriptResource createVerificationScriptResourceWithParameters(String str, URL url, String str2) {
        C4581e.m9615a(str, "VendorKey is null or empty");
        C4581e.m9613a((Object) url, "ResourceURL is null");
        C4581e.m9615a(str2, "VerificationParameters is null or empty");
        return new VerificationScriptResource(str, url, str2);
    }

    public static VerificationScriptResource createVerificationScriptResourceWithoutParameters(URL url) {
        C4581e.m9613a((Object) url, "ResourceURL is null");
        return new VerificationScriptResource((String) null, url, (String) null);
    }

    public URL getResourceUrl() {
        return this.f10255b;
    }

    public String getVendorKey() {
        return this.f10254a;
    }

    public String getVerificationParameters() {
        return this.f10256c;
    }
}
