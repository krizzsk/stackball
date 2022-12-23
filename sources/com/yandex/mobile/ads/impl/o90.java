package com.yandex.mobile.ads.impl;

import com.facebook.internal.security.CertificateUtil;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

public final class o90 {

    /* renamed from: d */
    public static final ByteString f38117d = ByteString.Companion.encodeUtf8(CertificateUtil.DELIMITER);

    /* renamed from: e */
    public static final ByteString f38118e = ByteString.Companion.encodeUtf8(":status");

    /* renamed from: f */
    public static final ByteString f38119f = ByteString.Companion.encodeUtf8(":method");

    /* renamed from: g */
    public static final ByteString f38120g = ByteString.Companion.encodeUtf8(":path");

    /* renamed from: h */
    public static final ByteString f38121h = ByteString.Companion.encodeUtf8(":scheme");

    /* renamed from: i */
    public static final ByteString f38122i = ByteString.Companion.encodeUtf8(":authority");

    /* renamed from: a */
    public final ByteString f38123a;

    /* renamed from: b */
    public final ByteString f38124b;

    /* renamed from: c */
    public final int f38125c;

    public o90(ByteString byteString, ByteString byteString2) {
        Intrinsics.checkNotNullParameter(byteString, "name");
        Intrinsics.checkNotNullParameter(byteString2, "value");
        this.f38123a = byteString;
        this.f38124b = byteString2;
        this.f38125c = byteString.size() + 32 + byteString2.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o90)) {
            return false;
        }
        o90 o90 = (o90) obj;
        return Intrinsics.areEqual((Object) this.f38123a, (Object) o90.f38123a) && Intrinsics.areEqual((Object) this.f38124b, (Object) o90.f38124b);
    }

    public int hashCode() {
        return (this.f38123a.hashCode() * 31) + this.f38124b.hashCode();
    }

    public String toString() {
        return this.f38123a.utf8() + ": " + this.f38124b.utf8();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public o90(String str, String str2) {
        this(ByteString.Companion.encodeUtf8(str), ByteString.Companion.encodeUtf8(str2));
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "value");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public o90(ByteString byteString, String str) {
        this(byteString, ByteString.Companion.encodeUtf8(str));
        Intrinsics.checkNotNullParameter(byteString, "name");
        Intrinsics.checkNotNullParameter(str, "value");
    }
}
