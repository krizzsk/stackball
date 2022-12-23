package com.ogury.p244cm.internal;

import android.content.Context;
import com.appsflyer.internal.referrer.Payload;
import com.ogury.core.OguryError;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p244cm.internal.aacab;

/* renamed from: com.ogury.cm.internal.aaabb */
public final class aaabb {

    /* renamed from: a */
    private bbbbb f20304a = new bbbbb();

    /* renamed from: b */
    private aabbc f20305b = new aabbc();

    /* renamed from: c */
    private final acbca f20306c = new acbca();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public aabbb f20307d = new aabbb(this.f20310g, (abaab) null, 2, (bbabb) null);

    /* renamed from: e */
    private abacc f20308e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public abacc f20309f;

    /* renamed from: g */
    private Context f20310g;

    /* renamed from: h */
    private String f20311h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f20312i;

    /* renamed from: com.ogury.cm.internal.aaabb$aaaaa */
    public static final class aaaaa implements acabb {

        /* renamed from: a */
        final /* synthetic */ aaabb f20313a;

        /* renamed from: b */
        final /* synthetic */ aaacc f20314b;

        /* renamed from: com.ogury.cm.internal.aaabb$aaaaa$aaaaa  reason: collision with other inner class name */
        static final class C15670aaaaa extends bbaca implements bbaaa<babcc> {

            /* renamed from: a */
            final /* synthetic */ aaaaa f20315a;

            /* renamed from: b */
            final /* synthetic */ String f20316b;

            /* renamed from: c */
            final /* synthetic */ int f20317c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15670aaaaa(aaaaa aaaaa, String str, int i) {
                super(0);
                this.f20315a = aaaaa;
                this.f20316b = str;
                this.f20317c = i;
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo52622a() {
                aacab.aaaaa aaaaa = aacab.f20365a;
                final OguryError a = aacab.aaaaa.m21776a(this.f20316b);
                abbac abbac = abbac.f20408a;
                abbac.m21817b().mo52670a(new bbaaa<babcc>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C15670aaaaa f20318a;

                    {
                        this.f20318a = r1;
                    }

                    /* renamed from: a */
                    public final /* synthetic */ Object mo52622a() {
                        int i = this.f20318a.f20317c;
                        if (400 <= i && 499 >= i) {
                            OguryIntegrationLogger.m22104d("[Consent][External] Sending failed. Servers could not process the request (error code: " + a.getErrorCode() + ", message: " + a.getMessage() + ')');
                            this.f20318a.f20315a.f20313a.f20307d.mo52652a(this.f20318a.f20315a.f20314b, false);
                        } else {
                            OguryIntegrationLogger.m22104d("[Consent][External] Sending failed (HTTP status code: " + this.f20318a.f20317c + ')');
                        }
                        OguryIntegrationLogger.m22105e("[Consent][External] Failed to pass external consent data");
                        aabca aabca = aabca.f20358a;
                        aabca.m21762a("ERROR");
                        return babcc.f20603a;
                    }
                });
                return babcc.f20603a;
            }
        }

        aaaaa(aaabb aaabb, aaacc aaacc) {
            this.f20313a = aaabb;
            this.f20314b = aaacc;
        }

        /* renamed from: a */
        public final void mo52618a(int i, String str) {
            bbabc.m22051b(str, "error");
            abbac abbac = abbac.f20408a;
            abbac.m21816a().mo52670a(new C15670aaaaa(this, str, i));
        }

        /* renamed from: a */
        public final void mo52619a(String str) {
            bbabc.m22051b(str, Payload.RESPONSE);
            OguryIntegrationLogger.m22104d("[Consent][External] Sending succeed. External consent data successfully passed!");
            this.f20313a.f20307d.mo52652a(this.f20314b, true);
            int i = aaabc.f20323a[acbca.m21953a(str).ordinal()];
            if (i == 1 || i == 2) {
                aabca aabca = aabca.f20358a;
                aabca.m21760a();
            }
            aabca aabca2 = aabca.f20358a;
            aabca.m21762a("COMPLETE");
        }
    }

    /* renamed from: com.ogury.cm.internal.aaabb$aaaab */
    static final class aaaab extends bbaca implements bbaaa<babcc> {

        /* renamed from: a */
        final /* synthetic */ aaabb f20320a;

        /* renamed from: b */
        final /* synthetic */ aaacc f20321b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaaab(aaabb aaabb, aaacc aaacc) {
            super(0);
            this.f20320a = aaabb;
            this.f20321b = aaacc;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo52622a() {
            if (aaabb.m21716a(this.f20320a, this.f20321b)) {
                aabca aabca = aabca.f20358a;
                aabca.m21762a("PASSING");
                this.f20320a.f20309f.mo52670a(new bbaaa<babcc>(this) {

                    /* renamed from: a */
                    final /* synthetic */ aaaab f20322a;

                    {
                        this.f20322a = r1;
                    }

                    /* renamed from: a */
                    public final /* synthetic */ Object mo52622a() {
                        aaabb.m21715a(this.f20322a.f20320a, this.f20322a.f20320a.f20312i, this.f20322a.f20321b);
                        return babcc.f20603a;
                    }
                });
            }
            return babcc.f20603a;
        }
    }

    public aaabb(Context context, String str, String str2) {
        bbabc.m22051b(context, "context");
        bbabc.m22051b(str, "assetKey");
        bbabc.m22051b(str2, "consentToken");
        this.f20310g = context;
        this.f20311h = str;
        this.f20312i = str2;
        abbac abbac = abbac.f20408a;
        this.f20308e = abbac.m21816a();
        abbac abbac2 = abbac.f20408a;
        this.f20309f = abbac.m21817b();
    }

    /* renamed from: a */
    public static final /* synthetic */ void m21715a(aaabb aaabb, String str, aaacc aaacc) {
        OguryIntegrationLogger.m22104d("[Consent][External] Sending consent data to Ogury servers...");
        aaabb.f20305b.mo52655a(aaabb.f20310g, aaabb.f20311h, str, aaacc, new aaaaa(aaabb, aaacc));
    }

    /* renamed from: a */
    public static final /* synthetic */ boolean m21716a(aaabb aaabb, aaacc aaacc) {
        String str;
        if (!bbbbb.m22066a(aaabb.f20310g)) {
            OguryIntegrationLogger.m22105e("[Consent][External] Failed to pass external consent data (no Internet connection)");
            return false;
        }
        OguryIntegrationLogger.m22104d("[Consent][External] Internet connection is OK");
        if (!aaabb.f20307d.mo52653a(aaacc)) {
            str = "[Consent][External] This Consent data has never been passed. It can be sent.";
        } else if (aaabb.f20307d.mo52654b(aaacc)) {
            str = "[Consent][External] Consent data should be resent (cache expired)";
        } else {
            OguryIntegrationLogger.m22104d("[Consent][External] Consent data do not need to be passed (already sent)");
            return false;
        }
        OguryIntegrationLogger.m22104d(str);
        return true;
    }

    /* renamed from: a */
    public final void mo52634a(aaacc aaacc) {
        bbabc.m22051b(aaacc, "externalConsentData");
        this.f20308e.mo52670a(new aaaab(this, aaacc));
    }
}
