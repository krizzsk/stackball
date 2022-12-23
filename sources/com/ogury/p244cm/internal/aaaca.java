package com.ogury.p244cm.internal;

import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p244cm.internal.aaacb;

/* renamed from: com.ogury.cm.internal.aaaca */
public final class aaaca implements aaacb.aaaaa {

    /* renamed from: a */
    private aaaaa f20324a;

    /* renamed from: b */
    private final aaacb f20325b;

    /* renamed from: com.ogury.cm.internal.aaaca$aaaaa */
    public interface aaaaa<T> {
        /* renamed from: a */
        void mo52637a(int i, String str);
    }

    public aaaca(aaacb aaacb) {
        bbabc.m22051b(aaacb, "tcfConsentDataStorageReader");
        this.f20325b = aaacb;
    }

    /* renamed from: b */
    private final void m21726b() {
        OguryIntegrationLogger.m22104d("[Consent][External] Checking consent data...");
        if (m21727c()) {
            OguryIntegrationLogger.m22104d("[Consent][External][data] Supported consent data");
            if (!m21728d()) {
                aaaaa aaaaa2 = this.f20324a;
                if (aaaaa2 != null) {
                    aaaaa2.mo52637a(this.f20325b.mo52638a(), this.f20325b.mo52642d());
                    return;
                }
                return;
            }
            OguryIntegrationLogger.m22104d("[Consent][External][data] Consent data already known (generated through Ogury CMP)");
            return;
        }
        OguryIntegrationLogger.m22104d("[Consent][External][data] Unsupported consent data");
    }

    /* renamed from: c */
    private final boolean m21727c() {
        int a = this.f20325b.mo52638a();
        boolean b = this.f20325b.mo52640b();
        boolean c = this.f20325b.mo52641c();
        OguryIntegrationLogger.m22104d("[Consent][External][data] Contains consent string: ".concat(String.valueOf(c)));
        OguryIntegrationLogger.m22104d("[Consent][External][data] GDPR applies: ".concat(String.valueOf(b)));
        OguryIntegrationLogger.m22104d("[Consent][External][data] TCF version: ".concat(String.valueOf(a)));
        return a >= 2 && b && c;
    }

    /* renamed from: d */
    private final boolean m21728d() {
        int e = this.f20325b.mo52643e();
        OguryIntegrationLogger.m22104d("[Consent][External][data] CMP SDK ID: ".concat(String.valueOf(e)));
        return this.f20325b.mo52638a() == 2 && e == 45;
    }

    /* renamed from: a */
    public final void mo52635a() {
        OguryIntegrationLogger.m22104d("[Consent][External] Change detected on the TCF consent string");
        m21726b();
    }

    /* renamed from: a */
    public final void mo52636a(aaaaa aaaaa2) {
        bbabc.m22051b(aaaaa2, "tcfConsentStringListener");
        OguryIntegrationLogger.m22104d("[Consent][External] Registering to TCF consent data changes");
        this.f20324a = aaaaa2;
        this.f20325b.mo52639a((aaacb.aaaaa) this);
        OguryIntegrationLogger.m22104d("[Consent][External] Searching for change on TCF consent data...");
        m21726b();
    }
}
