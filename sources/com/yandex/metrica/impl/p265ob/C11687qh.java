package com.yandex.metrica.impl.p265ob;

import android.net.Uri;
import android.text.TextUtils;
import com.appsflyer.ServerParameters;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.model.ReportDBAdapter;

/* renamed from: com.yandex.metrica.impl.ob.qh */
public class C11687qh extends C11658ph<C11384jh> {

    /* renamed from: b */
    private final C11502lh f28023b;

    /* renamed from: c */
    private C11319hh f28024c;

    /* renamed from: d */
    private long f28025d;

    public C11687qh() {
        this(new C11502lh());
    }

    /* renamed from: a */
    public void mo63551a(C11319hh hhVar) {
        this.f28024c = hhVar;
    }

    C11687qh(C11502lh lhVar) {
        this.f28023b = lhVar;
    }

    /* renamed from: a */
    public void mo63549a(long j) {
        this.f28025d = j;
    }

    /* renamed from: a */
    public void mo63550a(Uri.Builder builder, C11384jh jhVar) {
        mo63513a(builder);
        builder.path(ReportDBAdapter.ReportColumns.TABLE_NAME);
        C11319hh hhVar = this.f28024c;
        if (hhVar != null) {
            builder.appendQueryParameter("deviceid", C10585O2.m27103a(hhVar.f27059a, jhVar.mo62778g()));
            builder.appendQueryParameter("uuid", C10585O2.m27103a(this.f28024c.f27060b, jhVar.mo62795x()));
            m30114a(builder, "analytics_sdk_version", this.f28024c.f27061c);
            m30114a(builder, "analytics_sdk_version_name", this.f28024c.f27062d);
            builder.appendQueryParameter(ServerParameters.APP_VERSION_NAME, C10585O2.m27103a(this.f28024c.f27065g, jhVar.mo62777f()));
            builder.appendQueryParameter("app_build_number", C10585O2.m27103a(this.f28024c.f27067i, jhVar.mo62769b()));
            builder.appendQueryParameter(TapjoyConstants.TJC_DEVICE_OS_VERSION_NAME, C10585O2.m27103a(this.f28024c.f27068j, jhVar.mo62787p()));
            m30114a(builder, "os_api_level", this.f28024c.f27069k);
            m30114a(builder, "analytics_sdk_build_number", this.f28024c.f27063e);
            m30114a(builder, "analytics_sdk_build_type", this.f28024c.f27064f);
            m30114a(builder, "app_debuggable", this.f28024c.f27066h);
            builder.appendQueryParameter("locale", C10585O2.m27103a(this.f28024c.f27070l, jhVar.mo62783l()));
            builder.appendQueryParameter("is_rooted", C10585O2.m27103a(this.f28024c.f27071m, jhVar.mo62780i()));
            builder.appendQueryParameter("app_framework", C10585O2.m27103a(this.f28024c.f27072n, jhVar.mo62771c()));
            m30114a(builder, "attribution_id", this.f28024c.f27073o);
            C11319hh hhVar2 = this.f28024c;
            String str = hhVar2.f27064f;
            String str2 = hhVar2.f27074p;
            if (str != null && str.contains("source") && !TextUtils.isEmpty(str2)) {
                builder.appendQueryParameter("commit_hash", str2);
            }
        }
        builder.appendQueryParameter("api_key_128", jhVar.mo63072C());
        builder.appendQueryParameter("app_id", jhVar.mo62788q());
        builder.appendQueryParameter("app_platform", "android");
        builder.appendQueryParameter(ServerParameters.MODEL, jhVar.mo62785n());
        builder.appendQueryParameter("manufacturer", jhVar.mo62784m());
        builder.appendQueryParameter("screen_width", String.valueOf(jhVar.mo62793v()));
        builder.appendQueryParameter("screen_height", String.valueOf(jhVar.mo62792u()));
        builder.appendQueryParameter("screen_dpi", String.valueOf(jhVar.mo62791t()));
        builder.appendQueryParameter("scalefactor", String.valueOf(jhVar.mo62790s()));
        builder.appendQueryParameter(TapjoyConstants.TJC_DEVICE_TYPE_NAME, jhVar.mo62781j());
        m30114a(builder, "clids_set", jhVar.mo63075F());
        builder.appendQueryParameter("app_set_id", jhVar.mo62773d());
        builder.appendQueryParameter("app_set_id_scope", jhVar.mo62775e());
        this.f28023b.mo63307a(builder, jhVar.mo62762a());
        builder.appendQueryParameter(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, String.valueOf(this.f28025d));
    }

    /* renamed from: a */
    private void m30114a(Uri.Builder builder, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            builder.appendQueryParameter(str, str2);
        }
    }
}
