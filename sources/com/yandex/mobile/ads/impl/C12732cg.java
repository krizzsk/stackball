package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import com.inmobi.sdk.InMobiSdk;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.cg */
public final class C12732cg {

    /* renamed from: a */
    private final q41 f31915a;

    public C12732cg(q41 q41) {
        Intrinsics.checkNotNullParameter(q41, "requestHelper");
        this.f31915a = q41;
    }

    /* renamed from: a */
    public final void mo66282a(Context context, Uri.Builder builder) {
        Integer num;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(builder, "builder");
        C12878dg a = C12878dg.f32563g.mo66579a(context);
        this.f31915a.mo69487a(builder, "gdpr", a.mo66575j());
        this.f31915a.mo69487a(builder, InMobiSdk.IM_GDPR_CONSENT_IAB, a.mo66574i());
        this.f31915a.mo69487a(builder, "parsed_purpose_consents", a.mo66576k());
        this.f31915a.mo69487a(builder, "parsed_vendor_consents", a.mo66577l());
        q41 q41 = this.f31915a;
        Boolean valueOf = Boolean.valueOf(a.mo66573h());
        if (valueOf == null) {
            num = null;
        } else {
            valueOf.booleanValue();
            num = Integer.valueOf(valueOf.booleanValue() ? 1 : 0);
        }
        q41.getClass();
        if (num != null) {
            q41.mo69487a(builder, "cmp_present", Integer.toString(num.intValue()));
        }
    }
}
