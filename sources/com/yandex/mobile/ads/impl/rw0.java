package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.appsflyer.internal.referrer.Payload;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.yandex.mobile.ads.impl.c51;
import kotlin.jvm.internal.Intrinsics;

public final class rw0 {

    /* renamed from: a */
    private final Context f39744a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final uw0 f39745b;

    /* renamed from: c */
    private final s41 f39746c = s41.m41806a();

    /* renamed from: d */
    private final l71 f39747d = l71.m38631c();

    public rw0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f39744a = context.getApplicationContext();
        this.f39745b = new uw0(context);
    }

    /* renamed from: a */
    public final void mo69831a(nw0 nw0) {
        Intrinsics.checkNotNullParameter(nw0, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        d71 a = this.f39747d.mo68362a(this.f39744a);
        Boolean bool = null;
        String h = a == null ? null : a.mo66459h();
        String b = this.f39745b.mo70421b();
        if (h != null) {
            bool = Boolean.valueOf(h.length() > 0);
        }
        if (!Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE) || Intrinsics.areEqual((Object) h, (Object) b)) {
            ((tw0) nw0).f40516a.m42179b();
            return;
        }
        C14544a aVar = new C14544a(this, h, nw0);
        rb1 rb1 = new rb1(0, h, aVar, aVar);
        rb1.mo68339b((Object) "om_sdk_js_request_tag");
        s41 s41 = this.f39746c;
        Context context = this.f39744a;
        synchronized (s41) {
            lv0.m39021a(context).mo70284a(rb1);
        }
    }

    /* renamed from: a */
    public final void mo69830a() {
        this.f39746c.mo69870a(this.f39744a, "om_sdk_js_request_tag");
    }

    /* renamed from: com.yandex.mobile.ads.impl.rw0$a */
    private final class C14544a implements c51.C12700b<String>, c51.C12699a {

        /* renamed from: a */
        private final String f39748a;

        /* renamed from: b */
        private final nw0 f39749b;

        /* renamed from: c */
        final /* synthetic */ rw0 f39750c;

        public C14544a(rw0 rw0, String str, nw0 nw0) {
            Intrinsics.checkNotNullParameter(rw0, "this$0");
            Intrinsics.checkNotNullParameter(str, "omSdkControllerUrl");
            Intrinsics.checkNotNullParameter(nw0, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.f39750c = rw0;
            this.f39748a = str;
            this.f39749b = nw0;
        }

        /* renamed from: a */
        public void mo64360a(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, Payload.RESPONSE);
            this.f39750c.f39745b.mo70420a(str);
            this.f39750c.f39745b.mo70422b(this.f39748a);
            this.f39749b.mo69083a();
        }

        /* renamed from: a */
        public void mo64579a(op1 op1) {
            Intrinsics.checkNotNullParameter(op1, "error");
            this.f39749b.mo69083a();
        }
    }
}
