package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class aa1 {

    /* renamed from: a */
    private final String f30489a;

    /* renamed from: b */
    private final String f30490b;

    /* renamed from: c */
    private final String f30491c;

    /* renamed from: d */
    private final String f30492d;

    /* renamed from: e */
    private final C15300za f30493e;

    /* renamed from: f */
    private final s91 f30494f;

    /* renamed from: g */
    private final List<s91> f30495g;

    public aa1() {
        this((String) null, (String) null, (String) null, (String) null, (C15300za) null, (s91) null, (List) null, 127);
    }

    public aa1(String str, String str2, String str3, String str4, C15300za zaVar, s91 s91, List<s91> list) {
        this.f30489a = str;
        this.f30490b = str2;
        this.f30491c = str3;
        this.f30492d = str4;
        this.f30493e = zaVar;
        this.f30494f = s91;
        this.f30495g = list;
    }

    /* renamed from: a */
    public final C15300za mo65709a() {
        return this.f30493e;
    }

    /* renamed from: b */
    public final s91 mo65710b() {
        return this.f30494f;
    }

    /* renamed from: c */
    public final List<s91> mo65711c() {
        return this.f30495g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa1)) {
            return false;
        }
        aa1 aa1 = (aa1) obj;
        return Intrinsics.areEqual((Object) this.f30489a, (Object) aa1.f30489a) && Intrinsics.areEqual((Object) this.f30490b, (Object) aa1.f30490b) && Intrinsics.areEqual((Object) this.f30491c, (Object) aa1.f30491c) && Intrinsics.areEqual((Object) this.f30492d, (Object) aa1.f30492d) && Intrinsics.areEqual((Object) this.f30493e, (Object) aa1.f30493e) && Intrinsics.areEqual((Object) this.f30494f, (Object) aa1.f30494f) && Intrinsics.areEqual((Object) this.f30495g, (Object) aa1.f30495g);
    }

    public int hashCode() {
        String str = this.f30489a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f30490b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f30491c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f30492d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C15300za zaVar = this.f30493e;
        int hashCode5 = (hashCode4 + (zaVar == null ? 0 : zaVar.hashCode())) * 31;
        s91 s91 = this.f30494f;
        int hashCode6 = (hashCode5 + (s91 == null ? 0 : s91.hashCode())) * 31;
        List<s91> list = this.f30495g;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        return "SmartCenterSettings(colorWizButton=" + this.f30489a + ", colorWizButtonText=" + this.f30490b + ", colorWizBack=" + this.f30491c + ", colorWizBackRight=" + this.f30492d + ", backgroundColors=" + this.f30493e + ", smartCenter=" + this.f30494f + ", smartCenters=" + this.f30495g + ')';
    }

    public /* synthetic */ aa1(String str, String str2, String str3, String str4, C15300za zaVar, s91 s91, List list, int i) {
        this((String) null, (String) null, (String) null, (String) null, (C15300za) null, (s91) null, (List<s91>) null);
    }
}
