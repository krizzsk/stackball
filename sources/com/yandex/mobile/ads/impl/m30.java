package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.appsflyer.ServerParameters;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

class m30 {

    /* renamed from: a */
    private final C14564s6 f37170a;

    /* renamed from: b */
    private final l30 f37171b;

    /* renamed from: c */
    private final n71 f37172c = new n71();

    /* renamed from: d */
    private final y71 f37173d = new y71();

    /* renamed from: e */
    private final C13715kl f37174e = new C13715kl();

    /* renamed from: f */
    private final uj0 f37175f;

    /* renamed from: g */
    private final C14654t6 f37176g = new C14654t6();

    /* renamed from: h */
    private final n30 f37177h;

    m30(Context context, C14645t1 t1Var) {
        this.f37170a = t1Var.mo70099e();
        this.f37171b = t1Var.mo70104j();
        this.f37175f = uj0.m42700a(context);
        this.f37177h = new n30();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo68559a(Context context, Uri.Builder builder) {
        String str;
        Location a;
        m39239a(builder, "app_id", context.getPackageName());
        String str2 = null;
        try {
            str = String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Exception unused) {
            str = null;
        }
        m39239a(builder, ServerParameters.APP_VERSION_CODE, str);
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused2) {
        }
        m39239a(builder, ServerParameters.APP_VERSION_NAME, str2);
        m39239a(builder, ServerParameters.SDK_DATA_SDK_VERSION, this.f37172c.mo68931a());
        m39239a(builder, "sdk_version_name", this.f37172c.mo68932b());
        this.f37177h.getClass();
        byte[] decode = Base64.decode("ZGV2aWNlX3R5cGU=", 0);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(\"ZGV2aWNlX3R5cGU=\",\n      Base64.DEFAULT)");
        m39239a(builder, new String(decode, Charsets.UTF_8), this.f37174e.mo68248a(context));
        m39239a(builder, "locale", this.f37174e.mo68249b(context));
        this.f37177h.getClass();
        byte[] decode2 = Base64.decode("bWFudWZhY3R1cmVy", 0);
        Intrinsics.checkNotNullExpressionValue(decode2, "decode(\"bWFudWZhY3R1cmVy\",\n      Base64.DEFAULT)");
        String str3 = new String(decode2, Charsets.UTF_8);
        this.f37174e.getClass();
        m39239a(builder, str3, Build.MANUFACTURER);
        this.f37177h.getClass();
        byte[] decode3 = Base64.decode("bW9kZWw=", 0);
        Intrinsics.checkNotNullExpressionValue(decode3, "decode(\"bW9kZWw=\", Base64.DEFAULT)");
        String str4 = new String(decode3, Charsets.UTF_8);
        this.f37174e.getClass();
        m39239a(builder, str4, Build.MODEL);
        this.f37177h.getClass();
        byte[] decode4 = Base64.decode("b3NfbmFtZQ==", 0);
        Intrinsics.checkNotNullExpressionValue(decode4, "decode(\"b3NfbmFtZQ==\", Base64.DEFAULT)");
        String str5 = new String(decode4, Charsets.UTF_8);
        this.f37174e.getClass();
        m39239a(builder, str5, "android");
        this.f37177h.getClass();
        byte[] decode5 = Base64.decode("b3NfdmVyc2lvbg==", 0);
        Intrinsics.checkNotNullExpressionValue(decode5, "decode(\"b3NfdmVyc2lvbg==\",\n      Base64.DEFAULT)");
        String str6 = new String(decode5, Charsets.UTF_8);
        this.f37174e.getClass();
        m39239a(builder, str6, Build.VERSION.RELEASE);
        if (!this.f37173d.mo71005a(context) && (a = this.f37175f.mo70352a()) != null) {
            m39239a(builder, "location_timestamp", String.valueOf(a.getTime()));
            m39239a(builder, ServerParameters.LAT_KEY, String.valueOf(a.getLatitude()));
            m39239a(builder, ServerParameters.LON_KEY, String.valueOf(a.getLongitude()));
            m39239a(builder, "precision", String.valueOf(a.getAccuracy()));
        }
        if (!this.f37173d.mo71005a(context)) {
            this.f37177h.getClass();
            byte[] decode6 = Base64.decode("ZGV2aWNlLWlk", 0);
            Intrinsics.checkNotNullExpressionValue(decode6, "decode(\"ZGV2aWNlLWlk\", Base64.DEFAULT)");
            m39239a(builder, new String(decode6, Charsets.UTF_8), this.f37171b.mo68318c());
            C14743u6 a2 = this.f37170a.mo69889a();
            if (a2 != null) {
                boolean b = a2.mo70293b();
                String a3 = a2.mo70292a();
                boolean a4 = this.f37176g.mo70130a(a3);
                if (!b && a4) {
                    m39239a(builder, "google_aid", a3);
                }
            }
            C14743u6 b2 = this.f37170a.mo69892b();
            if (b2 != null) {
                boolean b3 = b2.mo70293b();
                String a5 = b2.mo70292a();
                boolean a6 = this.f37176g.mo70130a(a5);
                if (!b3 && a6) {
                    m39239a(builder, "huawei_oaid", a5);
                }
            }
        }
    }

    /* renamed from: a */
    private void m39239a(Uri.Builder builder, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            builder.appendQueryParameter(str, str2);
        }
    }
}
