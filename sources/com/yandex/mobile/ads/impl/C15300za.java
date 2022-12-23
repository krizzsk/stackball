package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.za */
public final class C15300za {

    /* renamed from: a */
    private final String f43067a;

    /* renamed from: b */
    private final String f43068b;

    /* renamed from: c */
    private final String f43069c;

    /* renamed from: d */
    private final String f43070d;

    public C15300za(String str, String str2, String str3, String str4) {
        this.f43067a = str;
        this.f43068b = str2;
        this.f43069c = str3;
        this.f43070d = str4;
    }

    /* renamed from: a */
    public final String mo71184a() {
        return this.f43070d;
    }

    /* renamed from: b */
    public final String mo71185b() {
        return this.f43069c;
    }

    /* renamed from: c */
    public final String mo71186c() {
        return this.f43068b;
    }

    /* renamed from: d */
    public final String mo71187d() {
        return this.f43067a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15300za)) {
            return false;
        }
        C15300za zaVar = (C15300za) obj;
        return Intrinsics.areEqual((Object) this.f43067a, (Object) zaVar.f43067a) && Intrinsics.areEqual((Object) this.f43068b, (Object) zaVar.f43068b) && Intrinsics.areEqual((Object) this.f43069c, (Object) zaVar.f43069c) && Intrinsics.areEqual((Object) this.f43070d, (Object) zaVar.f43070d);
    }

    public int hashCode() {
        String str = this.f43067a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f43068b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f43069c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f43070d;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "BackgroundColors(top=" + this.f43067a + ", right=" + this.f43068b + ", left=" + this.f43069c + ", bottom=" + this.f43070d + ')';
    }
}
