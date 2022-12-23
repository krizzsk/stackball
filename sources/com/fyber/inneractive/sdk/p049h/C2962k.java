package com.fyber.inneractive.sdk.p049h;

import com.fyber.inneractive.sdk.config.C2739a;
import com.fyber.inneractive.sdk.config.C2808t;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.p034a.C2753e;
import com.fyber.inneractive.sdk.config.p034a.C2767s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveError;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.p037d.C2815a;
import com.fyber.inneractive.sdk.p049h.C2988y;
import com.fyber.inneractive.sdk.p051j.C3014a;
import com.fyber.inneractive.sdk.p051j.C3018e;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.FileNotFoundException;

/* renamed from: com.fyber.inneractive.sdk.h.k */
public final class C2962k {

    /* renamed from: a */
    public InneractiveAdRequest f7155a;

    /* renamed from: b */
    C2767s f7156b;

    /* renamed from: c */
    public C2965a f7157c;

    /* renamed from: d */
    final String f7158d;

    /* renamed from: e */
    public volatile boolean f7159e = false;

    /* renamed from: f */
    public final C2990z f7160f;

    /* renamed from: com.fyber.inneractive.sdk.h.k$a */
    public interface C2965a {
        /* renamed from: a */
        void mo18110a(InneractiveAdRequest inneractiveAdRequest, C3018e eVar);

        /* renamed from: a */
        void mo18111a(InneractiveAdRequest inneractiveAdRequest, C3018e eVar, InneractiveErrorCode inneractiveErrorCode);
    }

    public C2962k(InneractiveAdRequest inneractiveAdRequest, String str, C2767s sVar, C2965a aVar) {
        this.f7155a = inneractiveAdRequest;
        this.f7158d = str;
        this.f7157c = aVar;
        this.f7156b = sVar;
        C2990z zVar = new C2990z(new C2977r<C3018e>() {
            /* renamed from: a */
            public final /* synthetic */ void mo17908a(Object obj, Exception exc, boolean z) {
                InneractiveErrorCode inneractiveErrorCode;
                InneractiveErrorCode inneractiveErrorCode2;
                C3014a a;
                C3018e eVar = (C3018e) obj;
                if (exc == null) {
                    C2962k kVar = C2962k.this;
                    if (kVar.f7157c == null) {
                        return;
                    }
                    if (kVar.f7159e) {
                        IAlog.m9033a("IARemoteAdFetcher: ignoring response. Previous request was cancelled", new Object[0]);
                        return;
                    }
                    C2808t a2 = C2739a.m5956a(eVar.f7413p);
                    kVar.f7155a.setSelectedUnitConfig(a2);
                    if (a2 == null) {
                        inneractiveErrorCode2 = InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH;
                    } else {
                        inneractiveErrorCode2 = eVar.mo18271a(kVar.f7155a, kVar.f7156b);
                    }
                    C2753e a3 = C2753e.m5986a(eVar);
                    try {
                        a3.f6491b = Long.valueOf(IAConfigManager.m5940k());
                    } catch (NumberFormatException unused) {
                        IAlog.m9034b("invalid publisherId", new Object[0]);
                    }
                    kVar.f7156b.mo18011a(a3);
                    if (inneractiveErrorCode2 == null) {
                        kVar.f7157c.mo18110a(kVar.f7155a, eVar);
                        return;
                    }
                    if (a2 == null || inneractiveErrorCode2 == InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH) {
                        IAlog.m9037e("%sGot configuration mismatch!", IAlog.m9029a((Object) kVar));
                        IAConfigManager.m5938i();
                    }
                    if (!(eVar == null || inneractiveErrorCode2 == null || (a = C3014a.m7016a(eVar.f7406i)) == null)) {
                        new C2815a(eVar, kVar.f7155a, a == C3014a.RETURNED_ADTYPE_HTML ? "send_failed_display_creatives" : "send_failed_vast_creatives", kVar.f7156b.mo18013b()).mo18091a((InneractiveError) new InneractiveInfrastructureError(inneractiveErrorCode2, eVar.f7396B));
                    }
                    kVar.mo18431a(inneractiveErrorCode2, eVar);
                    return;
                }
                if (exc instanceof C2947aj) {
                    if (((C2947aj) exc).f7095a == 204) {
                        inneractiveErrorCode = InneractiveErrorCode.NO_FILL;
                    } else {
                        inneractiveErrorCode = InneractiveErrorCode.SERVER_INTERNAL_ERROR;
                    }
                } else if ((exc instanceof FileNotFoundException) || !(exc instanceof C2985v)) {
                    inneractiveErrorCode = InneractiveErrorCode.CONNECTION_ERROR;
                } else {
                    inneractiveErrorCode = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                }
                C2962k kVar2 = C2962k.this;
                if (kVar2.f7157c == null) {
                    return;
                }
                if (kVar2.f7159e) {
                    IAlog.m9033a("IARemoteAdFetcher: ignoring response. Previous request was cancelled", new Object[0]);
                } else {
                    kVar2.mo18431a(inneractiveErrorCode, eVar);
                }
            }
        }, this.f7155a, this.f7156b);
        this.f7160f = zVar;
        zVar.f7069f = new C2988y.C2989a() {
            /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
            /* JADX WARNING: Removed duplicated region for block: B:22:0x005c  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo18432a(java.lang.String r5) {
                /*
                    r4 = this;
                    int r0 = r5.hashCode()
                    r1 = -1392135285(0xffffffffad05b38b, float:-7.600041E-12)
                    r2 = 2
                    r3 = 1
                    if (r0 == r1) goto L_0x002a
                    r1 = 740780854(0x2c276b36, float:2.3791641E-12)
                    if (r0 == r1) goto L_0x0020
                    r1 = 1745989196(0x6811ae4c, float:2.7518334E24)
                    if (r0 == r1) goto L_0x0016
                    goto L_0x0034
                L_0x0016:
                    java.lang.String r0 = "sdkParsedResponse"
                    boolean r5 = r5.equals(r0)
                    if (r5 == 0) goto L_0x0034
                    r5 = 2
                    goto L_0x0035
                L_0x0020:
                    java.lang.String r0 = "sdkGotServerResponse"
                    boolean r5 = r5.equals(r0)
                    if (r5 == 0) goto L_0x0034
                    r5 = 1
                    goto L_0x0035
                L_0x002a:
                    java.lang.String r0 = "sdkInitNetworkRequest"
                    boolean r5 = r5.equals(r0)
                    if (r5 == 0) goto L_0x0034
                    r5 = 0
                    goto L_0x0035
                L_0x0034:
                    r5 = -1
                L_0x0035:
                    if (r5 == 0) goto L_0x005c
                    if (r5 == r3) goto L_0x004c
                    if (r5 == r2) goto L_0x003c
                    goto L_0x004b
                L_0x003c:
                    com.fyber.inneractive.sdk.f.c r5 = com.fyber.inneractive.sdk.p046f.C2912c.m6513a()
                    com.fyber.inneractive.sdk.h.k r0 = com.fyber.inneractive.sdk.p049h.C2962k.this
                    java.lang.String r0 = r0.f7158d
                    com.fyber.inneractive.sdk.f.f r5 = r5.mo18364a(r0)
                    r5.mo18368d()
                L_0x004b:
                    return
                L_0x004c:
                    com.fyber.inneractive.sdk.f.c r5 = com.fyber.inneractive.sdk.p046f.C2912c.m6513a()
                    com.fyber.inneractive.sdk.h.k r0 = com.fyber.inneractive.sdk.p049h.C2962k.this
                    java.lang.String r0 = r0.f7158d
                    com.fyber.inneractive.sdk.f.f r5 = r5.mo18364a(r0)
                    r5.mo18367c()
                    return
                L_0x005c:
                    com.fyber.inneractive.sdk.f.c r5 = com.fyber.inneractive.sdk.p046f.C2912c.m6513a()
                    com.fyber.inneractive.sdk.h.k r0 = com.fyber.inneractive.sdk.p049h.C2962k.this
                    java.lang.String r0 = r0.f7158d
                    com.fyber.inneractive.sdk.f.f r5 = r5.mo18364a(r0)
                    r5.mo18366b()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.p049h.C2962k.C29642.mo18432a(java.lang.String):void");
            }
        };
    }

    /* renamed from: a */
    public final void mo18431a(InneractiveErrorCode inneractiveErrorCode, C3018e eVar) {
        C2965a aVar;
        if (!this.f7159e && (aVar = this.f7157c) != null) {
            aVar.mo18111a(this.f7155a, eVar, inneractiveErrorCode);
        }
    }
}
