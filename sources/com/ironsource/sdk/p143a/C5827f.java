package com.ironsource.sdk.p143a;

import com.ogury.p245ed.OguryAdFormatErrorCode;

/* renamed from: com.ironsource.sdk.a.f */
public final class C5827f {

    /* renamed from: a */
    public static C5828a f14160a = new C5828a(2001, m14401a("initsdk"));

    /* renamed from: b */
    public static C5828a f14161b = new C5828a(2002, m14401a("createcontrollerweb"));

    /* renamed from: c */
    public static C5828a f14162c = new C5828a(2003, m14401a("createcontrollernative"));

    /* renamed from: d */
    public static C5828a f14163d = new C5828a(2004, m14401a("controllerstageready"));

    /* renamed from: e */
    public static C5828a f14164e = new C5828a(2005, m14401a("loadad"));

    /* renamed from: f */
    public static C5828a f14165f = new C5828a(2006, m14401a("loadadfailed"));

    /* renamed from: g */
    public static C5828a f14166g = new C5828a(OguryAdFormatErrorCode.ACTIVITY_IN_BACKGROUND, m14401a("initproduct"));

    /* renamed from: h */
    public static C5828a f14167h = new C5828a(2008, m14401a("initproductfailed"));

    /* renamed from: i */
    public static C5828a f14168i = new C5828a(2009, m14401a("loadproduct"));

    /* renamed from: j */
    public static C5828a f14169j = new C5828a(OguryAdFormatErrorCode.SHOW_FAILED, m14401a("parseadmfailed"));

    /* renamed from: k */
    public static C5828a f14170k = new C5828a(2011, m14401a("loadadsuccess"));

    /* renamed from: l */
    public static C5828a f14171l = new C5828a(2013, m14401a("controllerfailed"));

    /* renamed from: m */
    public static C5828a f14172m = new C5828a(2014, m14401a("extractinstalledpackagesfailed"));

    /* renamed from: n */
    public static C5828a f14173n = new C5828a(2015, m14401a("appendnativefeaturesdatafailed"));

    /* renamed from: o */
    public static C5828a f14174o = new C5828a(2016, m14401a("adunitcouldnotloadtowebview"));

    /* renamed from: p */
    public static C5828a f14175p = new C5828a(2017, m14401a("webviewcleanupfailed"));

    /* renamed from: q */
    public static C5828a f14176q = new C5828a(2018, m14401a("removewebviewfailed"));

    /* renamed from: r */
    public static C5828a f14177r = new C5828a(2021, m14401a("fialedregactlifecycle"));

    /* renamed from: s */
    public static C5828a f14178s = new C5828a(2022, m14401a("loadcontrollerhtml"));

    /* renamed from: t */
    public static C5828a f14179t = new C5828a(2023, m14401a("controllerhtmlsuccess"));

    /* renamed from: u */
    public static C5828a f14180u = new C5828a(2024, m14401a("controllerhtmlfailed"));

    /* renamed from: v */
    public static C5828a f14181v = new C5828a(2025, m14401a("webviewcrashrpg"));

    /* renamed from: com.ironsource.sdk.a.f$a */
    public static class C5828a {

        /* renamed from: a */
        String f14182a;

        /* renamed from: b */
        int f14183b;

        C5828a(int i, String str) {
            this.f14183b = i;
            this.f14182a = str;
        }
    }

    static {
        new C5828a(2019, m14401a("adunitcouldnotloadtowebviewbanners"));
        new C5828a(2020, m14401a("banneralreadydestroyed"));
    }

    /* renamed from: a */
    private static String m14401a(String str) {
        return "n_" + str;
    }
}
