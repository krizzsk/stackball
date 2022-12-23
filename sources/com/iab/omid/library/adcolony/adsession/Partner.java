package com.iab.omid.library.adcolony.adsession;

import com.iab.omid.library.adcolony.p092d.C4581e;

public class Partner {

    /* renamed from: a */
    private final String f10252a;

    /* renamed from: b */
    private final String f10253b;

    private Partner(String str, String str2) {
        this.f10252a = str;
        this.f10253b = str2;
    }

    public static Partner createPartner(String str, String str2) {
        C4581e.m9615a(str, "Name is null or empty");
        C4581e.m9615a(str2, "Version is null or empty");
        return new Partner(str, str2);
    }

    public String getName() {
        return this.f10252a;
    }

    public String getVersion() {
        return this.f10253b;
    }
}
