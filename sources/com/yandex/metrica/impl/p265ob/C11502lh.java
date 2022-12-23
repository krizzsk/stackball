package com.yandex.metrica.impl.p265ob;

import android.net.Uri;
import com.appsflyer.ServerParameters;
import com.facebook.appevents.AppEventsConstants;

/* renamed from: com.yandex.metrica.impl.ob.lh */
public class C11502lh implements C11565nh<C11279gc> {
    /* renamed from: a */
    public void mo63307a(Uri.Builder builder, C11279gc gcVar) {
        m29766a(builder, "adv_id", "limit_ad_tracking", gcVar.mo62960a().f26600a);
        m29766a(builder, ServerParameters.OAID, "limit_oaid_tracking", gcVar.mo62961b().f26600a);
        m29766a(builder, "yandex_adv_id", "limit_yandex_adv_id_tracking", gcVar.mo62962c().f26600a);
    }

    /* renamed from: a */
    private void m29766a(Uri.Builder builder, String str, String str2, C11037ac acVar) {
        String str3 = "";
        if (acVar == null) {
            builder.appendQueryParameter(str, str3);
            builder.appendQueryParameter(str2, str3);
            return;
        }
        builder.appendQueryParameter(str, C10585O2.m27105b(acVar.f26512b));
        Boolean bool = acVar.f26513c;
        if (bool != null) {
            str3 = bool.booleanValue() ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        builder.appendQueryParameter(str2, str3);
    }
}
