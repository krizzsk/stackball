package com.ogury.p245ed.internal;

import android.util.Base64;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ogury.core.internal.network.OguryNetworkResponse;
import com.ogury.p245ed.internal.C8122cw;
import com.smaato.sdk.video.vast.model.C8937Ad;
import p269io.presage.common.AdConfig;

/* renamed from: com.ogury.ed.internal.dm */
public final class C8158dm {

    /* renamed from: a */
    public static final C8159a f21117a = new C8159a((byte) 0);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C8171dv f21118b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C8207ev f21119c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C8210ex f21120d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C8188ee f21121e;

    private C8158dm(C8171dv dvVar, C8207ev evVar, C8210ex exVar, C8188ee eeVar) {
        this.f21118b = dvVar;
        this.f21119c = evVar;
        this.f21120d = exVar;
        this.f21121e = eeVar;
    }

    private /* synthetic */ C8158dm(C8171dv dvVar, C8207ev evVar) {
        this(dvVar, evVar, C8210ex.f21258a, C8188ee.f21207a);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C8158dm(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            com.ogury.p245ed.internal.C8467mq.m23881b(r3, r0)
            com.ogury.ed.internal.dw r0 = com.ogury.p245ed.internal.C8172dw.f21148a
            com.ogury.ed.internal.dv r0 = com.ogury.p245ed.internal.C8172dw.m22770a(r3)
            com.ogury.ed.internal.ev$a r1 = com.ogury.p245ed.internal.C8207ev.f21255a
            com.ogury.ed.internal.ev r3 = com.ogury.p245ed.internal.C8207ev.C8208a.m22960a(r3)
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p245ed.internal.C8158dm.<init>(android.content.Context):void");
    }

    /* renamed from: com.ogury.ed.internal.dm$a */
    public static final class C8159a {
        public /* synthetic */ C8159a(byte b) {
            this();
        }

        private C8159a() {
        }
    }

    /* renamed from: a */
    public final C8122cw<C8192ei> mo53308a(C8193ej ejVar, AdConfig adConfig, String str, C8203es esVar) {
        C8467mq.m23881b(ejVar, C8937Ad.AD_TYPE);
        C8467mq.m23881b(str, DataKeys.USER_ID);
        C8122cw.C8123a aVar = C8122cw.f21054a;
        return C8122cw.C8123a.m22639a(new C8160b(this, ejVar, adConfig, str, esVar));
    }

    /* renamed from: com.ogury.ed.internal.dm$b */
    static final class C8160b extends C8468mr implements C8431lj<C8192ei> {

        /* renamed from: a */
        final /* synthetic */ C8158dm f21122a;

        /* renamed from: b */
        final /* synthetic */ C8193ej f21123b;

        /* renamed from: c */
        final /* synthetic */ AdConfig f21124c;

        /* renamed from: d */
        final /* synthetic */ String f21125d;

        /* renamed from: e */
        final /* synthetic */ C8203es f21126e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8160b(C8158dm dmVar, C8193ej ejVar, AdConfig adConfig, String str, C8203es esVar) {
            super(0);
            this.f21122a = dmVar;
            this.f21123b = ejVar;
            this.f21124c = adConfig;
            this.f21125d = str;
            this.f21126e = esVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C8192ei mo53190a() {
            OguryNetworkResponse a = this.f21122a.f21118b.mo53320a(this.f21123b, this.f21124c, this.f21125d, this.f21126e);
            if (a instanceof OguryNetworkResponse.Success) {
                C8188ee unused = this.f21122a.f21121e;
                String responseBody = ((OguryNetworkResponse.Success) a).getResponseBody();
                C8467mq.m23878a((Object) responseBody, "response.responseBody");
                C8192ei a2 = C8188ee.m22861a(responseBody, this.f21123b, this.f21126e);
                this.f21122a.f21120d.mo53452a(a2.mo53402a(), this.f21122a.f21119c, this.f21122a.f21118b);
                return a2;
            } else if (a instanceof OguryNetworkResponse.Failure) {
                Throwable exception = ((OguryNetworkResponse.Failure) a).getException();
                C8467mq.m23878a((Object) exception, "response.exception");
                throw exception;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: com.ogury.ed.internal.dm$c */
    static final class C8161c extends C8468mr implements C8431lj<C8192ei> {

        /* renamed from: a */
        final /* synthetic */ String f21127a;

        /* renamed from: b */
        final /* synthetic */ C8158dm f21128b;

        /* renamed from: c */
        final /* synthetic */ C8193ej f21129c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8161c(String str, C8158dm dmVar, C8193ej ejVar) {
            super(0);
            this.f21127a = str;
            this.f21128b = dmVar;
            this.f21129c = ejVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C8192ei mo53190a() {
            byte[] decode = Base64.decode(this.f21127a, 2);
            C8467mq.m23878a((Object) decode, "decode(adMarkup, Base64.NO_WRAP)");
            String str = new String(decode, C8506nz.f21713a);
            if (str.length() > 0) {
                C8188ee unused = this.f21128b.f21121e;
                C8192ei a = C8188ee.m22861a(str, this.f21129c, (C8203es) null);
                this.f21128b.f21120d.mo53452a(a.mo53402a(), this.f21128b.f21119c, this.f21128b.f21118b);
                if (!C8394km.m23765b(a.mo53402a())) {
                    return a;
                }
                throw new IllegalStateException("No available ads.");
            }
            throw new IllegalStateException("AdMarkup must not be empty.");
        }
    }

    /* renamed from: a */
    public final C8122cw<C8192ei> mo53309a(String str, C8193ej ejVar) {
        C8467mq.m23881b(str, "adMarkup");
        C8467mq.m23881b(ejVar, C8937Ad.AD_TYPE);
        C8122cw.C8123a aVar = C8122cw.f21054a;
        return C8122cw.C8123a.m22639a(new C8161c(str, this, ejVar));
    }
}
