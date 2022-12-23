package com.inmobi.media;

import org.json.JSONObject;

/* renamed from: com.inmobi.media.fj */
/* compiled from: PkConfig */
public class C5260fj extends C5238ex {
    private static final String DEFAULT_ALGORITHM = "rsa";
    private static final String DEFAULT_EXPONENT = "010001";
    private static final String DEFAULT_MODULUS = "E72409364B865B757E1D6B8DB73011BBB1D20C1A9F931ADD3C4C09E2794CE102F8AA7F2D50EB88F9880A576E6C7B0E95712CAE9416F7BACB798564627846E93B";
    private static final String DEFAULT_VERSION = "1";
    private String alg = DEFAULT_ALGORITHM;

    /* renamed from: e */
    public String f12041e = DEFAULT_EXPONENT;

    /* renamed from: m */
    public String f12042m = DEFAULT_MODULUS;
    public String ver = "1";

    /* renamed from: b */
    public String mo40557b() {
        return "pk";
    }

    /* renamed from: a */
    public static C5352hm<C5260fj> m12037a() {
        return new C5352hm<>();
    }

    C5260fj(String str) {
        super(str);
    }

    /* renamed from: d */
    public boolean mo40559d() {
        return (this.f12041e.trim().length() == 0 || this.f12042m.trim().length() == 0 || this.alg.trim().length() == 0 || this.ver.trim().length() == 0) ? false : true;
    }

    /* renamed from: c */
    public JSONObject mo40558c() {
        return new C5352hm().mo40711a(this);
    }
}
