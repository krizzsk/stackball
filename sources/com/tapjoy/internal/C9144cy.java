package com.tapjoy.internal;

import java.net.URL;

/* renamed from: com.tapjoy.internal.cy */
public final class C9144cy {

    /* renamed from: a */
    public final String f22475a;

    /* renamed from: b */
    public final URL f22476b;

    /* renamed from: c */
    public final String f22477c;

    private C9144cy(String str, URL url, String str2) {
        this.f22475a = str;
        this.f22476b = url;
        this.f22477c = str2;
    }

    /* renamed from: a */
    public static C9144cy m24481a(String str, URL url, String str2) {
        C9166do.m24544a(str, "VendorKey is null or empty");
        C9166do.m24543a((Object) url, "ResourceURL is null");
        C9166do.m24544a(str2, "VerificationParameters is null or empty");
        return new C9144cy(str, url, str2);
    }

    /* renamed from: a */
    public static C9144cy m24482a(URL url) {
        C9166do.m24543a((Object) url, "ResourceURL is null");
        return new C9144cy((String) null, url, (String) null);
    }
}
