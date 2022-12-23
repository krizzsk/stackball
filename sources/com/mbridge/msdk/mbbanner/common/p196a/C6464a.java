package com.mbridge.msdk.mbbanner.common.p196a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.tools.C6349m;

/* renamed from: com.mbridge.msdk.mbbanner.common.a.a */
/* compiled from: BannerReportData */
public final class C6464a {

    /* renamed from: a */
    private String f16104a;

    /* renamed from: b */
    private String f16105b;

    /* renamed from: c */
    private String f16106c;

    /* renamed from: d */
    private String f16107d;

    /* renamed from: e */
    private String f16108e;

    /* renamed from: f */
    private String f16109f;

    /* renamed from: g */
    private String f16110g;

    /* renamed from: h */
    private int f16111h;

    /* renamed from: i */
    private boolean f16112i;

    /* renamed from: a */
    public final C6464a mo44273a(boolean z) {
        this.f16112i = z;
        return this;
    }

    private C6464a() {
    }

    /* renamed from: a */
    public static C6464a m16573a() {
        return new C6464a();
    }

    /* renamed from: a */
    public final C6464a mo44272a(String str) {
        this.f16104a = str;
        return this;
    }

    /* renamed from: b */
    public final C6464a mo44274b(String str) {
        this.f16105b = str;
        return this;
    }

    /* renamed from: c */
    public final C6464a mo44276c(String str) {
        this.f16106c = str;
        return this;
    }

    /* renamed from: d */
    public final C6464a mo44277d(String str) {
        this.f16108e = str;
        return this;
    }

    /* renamed from: e */
    public final C6464a mo44278e(String str) {
        this.f16107d = str;
        return this;
    }

    /* renamed from: f */
    public final C6464a mo44279f(String str) {
        this.f16109f = str;
        return this;
    }

    /* renamed from: g */
    public final C6464a mo44280g(String str) {
        this.f16110g = str;
        return this;
    }

    /* renamed from: a */
    public final C6464a mo44271a(int i) {
        this.f16111h = i;
        return this;
    }

    /* renamed from: b */
    public final String mo44275b() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.f16105b)) {
            sb.append("unit_id=");
            sb.append(this.f16105b);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f16106c)) {
            sb.append("cid=");
            sb.append(this.f16106c);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f16107d)) {
            sb.append("rid=");
            sb.append(this.f16107d);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f16108e)) {
            sb.append("rid_n=");
            sb.append(this.f16108e);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f16109f)) {
            sb.append("creative_id=");
            sb.append(this.f16109f);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f16110g)) {
            sb.append("reason=");
            sb.append(this.f16110g);
            sb.append("&");
        }
        if (this.f16111h != 0) {
            sb.append("result=");
            sb.append(this.f16111h);
            sb.append("&");
        }
        if (this.f16112i) {
            sb.append("hb=1");
            sb.append("&");
        }
        sb.append("network_type=");
        sb.append(C6349m.m16123n(C6122a.m15302b().mo42895d()));
        sb.append("&");
        if (!TextUtils.isEmpty(this.f16104a)) {
            sb.append("key=");
            sb.append(this.f16104a);
        }
        return sb.toString();
    }
}
