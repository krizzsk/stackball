package com.ogury.p245ed.internal;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.tapjoy.TJAdUnitConstants;

/* renamed from: com.ogury.ed.internal.hb */
public final class C8282hb {

    /* renamed from: a */
    public static final C8283a f21400a = new C8283a((byte) 0);

    /* renamed from: b */
    private final C8362jh f21401b;

    public C8282hb(C8362jh jhVar) {
        C8467mq.m23881b(jhVar, "webView");
        this.f21401b = jhVar;
    }

    /* renamed from: com.ogury.ed.internal.hb$a */
    public static final class C8283a {
        public /* synthetic */ C8283a(byte b) {
            this();
        }

        private C8283a() {
        }
    }

    /* renamed from: a */
    public final C8362jh mo53634a() {
        return this.f21401b;
    }

    /* renamed from: a */
    public final void mo53640a(String str, String str2) {
        C8467mq.m23881b(str, "command");
        C8467mq.m23881b(str2, "message");
        C8362jh jhVar = this.f21401b;
        C8284hc hcVar = C8284hc.f21402a;
        C8365jk.m23714a(jhVar, C8284hc.m23291a(str, str2));
    }

    /* renamed from: a */
    public final void mo53635a(int i) {
        C8362jh jhVar = this.f21401b;
        C8284hc hcVar = C8284hc.f21402a;
        C8365jk.m23714a(jhVar, C8284hc.m23286a(i));
    }

    /* renamed from: b */
    public final void mo53644b() {
        C8362jh jhVar = this.f21401b;
        C8284hc hcVar = C8284hc.f21402a;
        C8365jk.m23714a(jhVar, C8284hc.m23285a());
    }

    /* renamed from: a */
    public final void mo53641a(String str, boolean z) {
        C8467mq.m23881b(str, "orientation");
        C8362jh jhVar = this.f21401b;
        C8284hc hcVar = C8284hc.f21402a;
        C8365jk.m23714a(jhVar, C8284hc.m23292a(str, z));
    }

    /* renamed from: a */
    public final void mo53643a(boolean z, String str) {
        C8467mq.m23881b(str, "forceOrientation");
        C8362jh jhVar = this.f21401b;
        C8284hc hcVar = C8284hc.f21402a;
        C8365jk.m23714a(jhVar, C8284hc.m23295a(z, str));
    }

    /* renamed from: a */
    public final void mo53636a(int i, int i2) {
        C8362jh jhVar = this.f21401b;
        C8284hc hcVar = C8284hc.f21402a;
        C8365jk.m23714a(jhVar, C8284hc.m23287a(i, i2));
    }

    /* renamed from: a */
    public final void mo53639a(String str) {
        C8467mq.m23881b(str, "placementType");
        C8362jh jhVar = this.f21401b;
        C8284hc hcVar = C8284hc.f21402a;
        C8365jk.m23714a(jhVar, C8284hc.m23290a(str));
    }

    /* renamed from: a */
    public final void mo53642a(boolean z) {
        C8362jh jhVar = this.f21401b;
        C8284hc hcVar = C8284hc.f21402a;
        C8365jk.m23714a(jhVar, C8284hc.m23294a(z));
    }

    /* renamed from: b */
    public final void mo53645b(int i, int i2) {
        C8362jh jhVar = this.f21401b;
        C8284hc hcVar = C8284hc.f21402a;
        C8365jk.m23714a(jhVar, C8284hc.m23297b(i, i2));
    }

    /* renamed from: a */
    public final void mo53637a(int i, int i2, int i3, int i4) {
        C8362jh jhVar = this.f21401b;
        C8284hc hcVar = C8284hc.f21402a;
        C8365jk.m23714a(jhVar, C8284hc.m23288a(i, i2, i3, i4));
    }

    /* renamed from: b */
    public final void mo53646b(int i, int i2, int i3, int i4) {
        C8362jh jhVar = this.f21401b;
        C8284hc hcVar = C8284hc.f21402a;
        C8365jk.m23714a(jhVar, C8284hc.m23298b(i, i2, i3, i4));
    }

    /* renamed from: c */
    public final void mo53651c(int i, int i2, int i3, int i4) {
        C8362jh jhVar = this.f21401b;
        C8284hc hcVar = C8284hc.f21402a;
        C8365jk.m23714a(jhVar, C8284hc.m23303c(i, i2, i3, i4));
    }

    /* renamed from: c */
    public final void mo53650c(int i, int i2) {
        C8362jh jhVar = this.f21401b;
        C8284hc hcVar = C8284hc.f21402a;
        C8365jk.m23714a(jhVar, C8284hc.m23302c(i, i2));
    }

    /* renamed from: b */
    public final void mo53647b(String str) {
        C8467mq.m23881b(str, "state");
        C8362jh jhVar = this.f21401b;
        C8284hc hcVar = C8284hc.f21402a;
        C8365jk.m23714a(jhVar, C8284hc.m23299b(str));
        this.f21401b.setAdState(str);
    }

    /* renamed from: b */
    public final void mo53648b(String str, String str2) {
        C8467mq.m23881b(str, TJAdUnitConstants.String.CALLBACK_ID);
        C8467mq.m23881b(str2, IronSourceConstants.EVENTS_RESULT);
        C8362jh jhVar = this.f21401b;
        C8284hc hcVar = C8284hc.f21402a;
        C8365jk.m23714a(jhVar, C8284hc.m23300b(str, str2));
    }

    /* renamed from: a */
    public final void mo53638a(C8278gy gyVar) {
        C8467mq.m23881b(gyVar, "adExposure");
        C8362jh jhVar = this.f21401b;
        C8284hc hcVar = C8284hc.f21402a;
        C8365jk.m23714a(jhVar, C8284hc.m23289a(gyVar));
        m23265b(gyVar);
    }

    /* renamed from: b */
    private final void m23265b(C8278gy gyVar) {
        if (gyVar.mo53633c() < 50.0f) {
            mo53642a(false);
        } else if (!this.f21401b.mo53805b()) {
            mo53642a(true);
        }
    }

    /* renamed from: c */
    public final void mo53649c() {
        C8362jh jhVar = this.f21401b;
        C8284hc hcVar = C8284hc.f21402a;
        C8365jk.m23714a(jhVar, C8284hc.m23301c());
    }

    /* renamed from: c */
    public final void mo53652c(String str) {
        C8467mq.m23881b(str, "url");
        C8362jh jhVar = this.f21401b;
        C8284hc hcVar = C8284hc.f21402a;
        C8365jk.m23714a(jhVar, C8284hc.m23304c(str));
    }
}
