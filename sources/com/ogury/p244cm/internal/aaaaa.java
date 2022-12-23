package com.ogury.p244cm.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.appsflyer.internal.referrer.Payload;
import com.ogury.core.OguryError;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.core.internal.crash.CrashConfig;
import com.ogury.core.internal.crash.OguryCrashReport;
import com.ogury.core.internal.crash.SdkInfo;
import com.ogury.p244cm.OguryChoiceManager;
import com.ogury.p244cm.OguryConsentListener;
import com.ogury.p244cm.internal.aacaa;
import com.ogury.p244cm.internal.aacab;
import java.util.Date;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.ogury.cm.internal.aaaaa */
public final class aaaaa implements aacbc {

    /* renamed from: a */
    private bbbbb f20253a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f20254b;

    /* renamed from: c */
    private Handler f20255c;

    /* renamed from: d */
    private ababb f20256d;

    /* renamed from: e */
    private abbbb f20257e;

    /* renamed from: f */
    private abcba f20258f;

    /* renamed from: g */
    private baccc f20259g;

    /* renamed from: h */
    private com.ogury.p244cm.aaaac f20260h;

    /* renamed from: i */
    private accba f20261i;

    /* renamed from: j */
    private aacca f20262j;

    /* renamed from: k */
    private boolean f20263k;

    /* renamed from: l */
    private String f20264l;

    /* renamed from: m */
    private final aaaac f20265m;

    /* renamed from: n */
    private final babac f20266n;

    /* renamed from: com.ogury.cm.internal.aaaaa$aaaaa  reason: collision with other inner class name */
    public static final class C15667aaaaa implements babaa {

        /* renamed from: a */
        final /* synthetic */ CountDownLatch f20267a;

        C15667aaaaa(CountDownLatch countDownLatch) {
            this.f20267a = countDownLatch;
        }

        /* renamed from: a */
        public final void mo52617a() {
            this.f20267a.countDown();
        }
    }

    /* renamed from: com.ogury.cm.internal.aaaaa$aaaab */
    public static final class aaaab implements ababa {

        /* renamed from: a */
        final /* synthetic */ aaaaa f20268a;

        /* renamed from: b */
        final /* synthetic */ CountDownLatch f20269b;

        aaaab(aaaaa aaaaa, CountDownLatch countDownLatch) {
            this.f20268a = aaaaa;
            this.f20269b = countDownLatch;
        }

        /* renamed from: a */
        public final void mo52607a(String str) {
            bbabc.m22051b(str, "aaid");
            this.f20268a.mo52614a(str);
            this.f20269b.countDown();
        }
    }

    /* renamed from: com.ogury.cm.internal.aaaaa$aaaac */
    public static final class aaaac implements acabb {

        /* renamed from: a */
        final /* synthetic */ aaaaa f20270a;

        /* renamed from: b */
        final /* synthetic */ Context f20271b;

        aaaac(aaaaa aaaaa, Context context) {
            this.f20270a = aaaaa;
            this.f20271b = context;
        }

        /* renamed from: a */
        public final void mo52618a(int i, String str) {
            OguryError oguryError;
            bbabc.m22051b(str, "error");
            if (i == 0 || (500 <= i && 599 >= i)) {
                oguryError = new OguryError(3, str);
            } else {
                aacab.aaaaa aaaaa = aacab.f20365a;
                oguryError = aacab.aaaaa.m21776a(str);
            }
            aaaaa.m21663a(this.f20270a, oguryError);
            baaba.f20569a.endDataSourceConnections();
            Context context = this.f20271b;
            String message = oguryError.getMessage();
            String a = this.f20270a.f20254b;
            if (message != null && bbabc.m22050a((Object) message, (Object) aacaa.aaaaa.m21775e("assetKey-unknown"))) {
                accba.m21963b(context, a);
            }
            aaaaa aaaaa2 = this.f20270a;
            aaaaa.m21661a(aaaaa2, this.f20271b, aaaaa2.f20254b);
        }

        /* renamed from: a */
        public final void mo52619a(String str) {
            bbabc.m22051b(str, Payload.RESPONSE);
            abbba.m21828b(abbba.m21849r());
            abbba abbba = abbba.f20411a;
            abbba.m21836f().mo52747a(str, true);
            abbba abbba2 = abbba.f20411a;
            if (abbba.m21848q()) {
                aaaaa.m21660a(this.f20270a, this.f20271b);
            } else {
                aaaaa aaaaa = this.f20270a;
                abbba abbba3 = abbba.f20411a;
                aaaaa.m21663a(aaaaa, abbba.m21840i().mo52750b());
            }
            accba.m21965c(this.f20271b);
            aaaaa aaaaa2 = this.f20270a;
            aaaaa.m21661a(aaaaa2, this.f20271b, aaaaa2.f20254b);
        }
    }

    /* renamed from: com.ogury.cm.internal.aaaaa$aaaba */
    static final class aaaba implements Runnable {

        /* renamed from: a */
        final /* synthetic */ bbaaa f20272a;

        aaaba(bbaaa bbaaa) {
            this.f20272a = bbaaa;
        }

        public final void run() {
            this.f20272a.mo52622a();
        }
    }

    /* renamed from: com.ogury.cm.internal.aaaaa$aaabb */
    static final class aaabb implements Runnable {

        /* renamed from: a */
        final /* synthetic */ aaaaa f20273a;

        /* renamed from: b */
        final /* synthetic */ Context f20274b;

        aaabb(aaaaa aaaaa, Context context) {
            this.f20273a = aaaaa;
            this.f20274b = context;
        }

        public final void run() {
            aaaaa.m21668b(this.f20273a, this.f20274b);
        }
    }

    /* renamed from: com.ogury.cm.internal.aaaaa$aaabc */
    public static final class aaabc implements abbbb {

        /* renamed from: a */
        final /* synthetic */ aaaaa f20275a;

        /* renamed from: b */
        final /* synthetic */ OguryConsentListener f20276b;

        /* renamed from: com.ogury.cm.internal.aaaaa$aaabc$aaaaa  reason: collision with other inner class name */
        static final class C15668aaaaa extends bbaca implements bbaaa<babcc> {

            /* renamed from: a */
            final /* synthetic */ aaabc f20277a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15668aaaaa(aaabc aaabc) {
                super(0);
                this.f20277a = aaabc;
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo52622a() {
                OguryConsentListener oguryConsentListener = this.f20277a.f20276b;
                abbba abbba = abbba.f20411a;
                oguryConsentListener.onComplete(abbba.m21830c().mo52676a());
                return babcc.f20603a;
            }
        }

        /* renamed from: com.ogury.cm.internal.aaaaa$aaabc$aaaab */
        static final class aaaab extends bbaca implements bbaaa<babcc> {

            /* renamed from: a */
            final /* synthetic */ aaabc f20278a;

            /* renamed from: b */
            final /* synthetic */ OguryError f20279b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            aaaab(aaabc aaabc, OguryError oguryError) {
                super(0);
                this.f20278a = aaabc;
                this.f20279b = oguryError;
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo52622a() {
                this.f20278a.f20276b.onError(this.f20279b);
                return babcc.f20603a;
            }
        }

        aaabc(aaaaa aaaaa, OguryConsentListener oguryConsentListener) {
            this.f20275a = aaaaa;
            this.f20276b = oguryConsentListener;
        }

        /* renamed from: a */
        public final void mo52605a(OguryError oguryError) {
            bbabc.m22051b(oguryError, "error");
            OguryIntegrationLogger.m22105e("[Consent][sync] Failed to sync consent data (" + oguryError.getMessage() + ')');
            this.f20275a.mo52615a(false);
            aaaaa.m21662a(this.f20275a, (bbaaa) new aaaab(this, oguryError));
            aabca aabca = aabca.f20358a;
            aabca.m21762a("ERROR");
        }

        /* renamed from: a */
        public final void mo52606a(String str) {
            bbabc.m22051b(str, Payload.RESPONSE);
            OguryIntegrationLogger.m22104d("[Consent][sync] Consent data successfully synced!");
            StringBuilder sb = new StringBuilder("[Consent][data] Answer: ");
            abbba abbba = abbba.f20411a;
            sb.append(abbba.m21830c().mo52676a().name());
            OguryIntegrationLogger.m22104d(sb.toString());
            StringBuilder sb2 = new StringBuilder("[Consent][data] IAB string: ");
            abbba abbba2 = abbba.f20411a;
            sb2.append(abbba.m21830c().mo52680c().mo52698a());
            OguryIntegrationLogger.m22104d(sb2.toString());
            StringBuilder sb3 = new StringBuilder("[Consent][data] USP string: ");
            abbba abbba3 = abbba.f20411a;
            sb3.append(abbba.m21830c().mo52681d().mo52688a());
            OguryIntegrationLogger.m22104d(sb3.toString());
            StringBuilder sb4 = new StringBuilder("[Consent][data] Has paid: ");
            abbba abbba4 = abbba.f20411a;
            sb4.append(abbba.m21830c().mo52679b());
            OguryIntegrationLogger.m22104d(sb4.toString());
            this.f20275a.mo52615a(false);
            aaaaa.m21662a(this.f20275a, (bbaaa) new C15668aaaaa(this));
            aabca aabca = aabca.f20358a;
            aabca.m21762a("COMPLETE");
        }
    }

    public aaaaa() {
        this((aaaac) null, (babac) null, 3, (bbabb) null);
    }

    private aaaaa(aaaac aaaac2, babac babac) {
        bbabc.m22051b(aaaac2, "clientConsentImplTcf");
        bbabc.m22051b(babac, "clientConsentImplCcpafV1");
        this.f20265m = aaaac2;
        this.f20266n = babac;
        this.f20253a = new bbbbb();
        this.f20254b = "";
        this.f20255c = new Handler(Looper.getMainLooper());
        this.f20256d = ababb.f20396a;
        this.f20258f = new abcba();
        this.f20259g = new baccc();
        this.f20260h = com.ogury.p244cm.aaaac.f20238a;
        abbba abbba = abbba.f20411a;
        this.f20261i = abbba.m21834e();
        this.f20262j = new aaccb(this);
        this.f20264l = "";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aaaaa(aaaac aaaac2, babac babac, int i, bbabb bbabb) {
        this((i & 1) != 0 ? new aaaba() : aaaac2, (i & 2) != 0 ? new babac() : babac);
    }

    /* renamed from: a */
    private final acabb m21656a(Context context) {
        return new aaaac(this, context);
    }

    /* renamed from: a */
    private final void m21658a(Context context, String str, acabc acabc) {
        this.f20263k = true;
        this.f20254b = str;
        aabca aabca = aabca.f20358a;
        aabca.m21762a("ASKING");
        OguryIntegrationLogger.m22104d("[Consent][sync] Syncing...");
        if (bbbbb.m22066a(context)) {
            this.f20262j.mo52657a(context, acabc, new CountDownLatch(2));
            return;
        }
        abbbb abbbb = this.f20257e;
        if (abbbb == null) {
            bbabc.m22049a("consentCallback");
        }
        abbbb.mo52605a(new OguryError(0, "No internet connection"));
    }

    /* renamed from: a */
    private final void m21659a(OguryConsentListener oguryConsentListener) {
        this.f20257e = new aaabc(this, oguryConsentListener);
    }

    /* renamed from: a */
    public static final /* synthetic */ void m21660a(aaaaa aaaaa, Context context) {
        aaaaa.f20255c.post(new aaabb(aaaaa, context));
        abbba abbba = abbba.f20411a;
        abbba.m21832d().mo52745a(context);
        aaaaa.f20261i.mo52755a(context, aaaaa.f20254b);
    }

    /* renamed from: a */
    public static final /* synthetic */ void m21661a(aaaaa aaaaa, Context context, String str) {
        aaaaa.f20259g.mo52835a(context);
        bbabc.m22051b(context, "context");
        bbabc.m22051b(str, "assetKey");
        try {
            abbba abbba = abbba.f20411a;
            SdkInfo sdkInfo = new SdkInfo("3.3.0", str, abbba.m21846o());
            abbba abbba2 = abbba.f20411a;
            OguryCrashReport.start("consent", context, sdkInfo, new CrashConfig(abbba.m21838g().mo52682a(), context.getPackageName(), 5, 50));
        } catch (Throwable unused) {
            abbbc abbbc = abbbc.f20427a;
            abbbc.m21856b("crash report init failed");
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ void m21662a(aaaaa aaaaa, bbaaa bbaaa) {
        Thread currentThread = Thread.currentThread();
        Looper mainLooper = Looper.getMainLooper();
        bbabc.m22048a((Object) mainLooper, "Looper.getMainLooper()");
        if (bbabc.m22050a((Object) currentThread, (Object) mainLooper.getThread())) {
            bbaaa.mo52622a();
        } else {
            aaaaa.f20255c.post(new aaaba(bbaaa));
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ void m21663a(aaaaa aaaaa, OguryError oguryError) {
        abbbb abbbb = aaaaa.f20257e;
        if (abbbb == null) {
            bbabc.m22049a("consentCallback");
        }
        abbbb.mo52605a(oguryError);
    }

    /* renamed from: a */
    private final void m21665a(acabc acabc, Context context) {
        OguryIntegrationLogger.m22104d("[Consent][sync] Syncing consent data from servers...");
        abcba.m21904a(context, this.f20254b, acabc, m21656a(context));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m21666a(OguryError oguryError) {
        baaba.f20569a.endDataSourceConnections();
        abbba abbba = abbba.f20411a;
        if (abbba.m21830c().mo52676a() != OguryChoiceManager.Answer.NO_ANSWER) {
            abbbb abbbb = this.f20257e;
            if (abbbb == null) {
                bbabc.m22049a("consentCallback");
            }
            abbba abbba2 = abbba.f20411a;
            abbbb.mo52606a(abbba.m21830c().mo52676a().toString());
            return;
        }
        abbbb abbbb2 = this.f20257e;
        if (abbbb2 == null) {
            bbabc.m22049a("consentCallback");
        }
        abbbb2.mo52605a(oguryError);
    }

    /* renamed from: b */
    private static void m21667b(Context context) {
        abbba abbba = abbba.f20411a;
        Context applicationContext = context.getApplicationContext();
        bbabc.m22048a((Object) applicationContext, "context.applicationContext");
        String packageName = applicationContext.getPackageName();
        bbabc.m22048a((Object) packageName, "context.applicationContext.packageName");
        abbba.m21833d(packageName);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void m21668b(com.ogury.p244cm.internal.aaaaa r6, android.content.Context r7) {
        /*
            com.ogury.cm.internal.abbba r0 = com.ogury.p244cm.internal.abbba.f20411a
            java.lang.String r0 = com.ogury.p244cm.internal.abbba.m21843l()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            if (r0 == 0) goto L_0x0068
            boolean r0 = com.ogury.p244cm.internal.bbbbb.m22066a(r7)
            java.lang.String r3 = "consentCallback"
            if (r0 != 0) goto L_0x0030
            com.ogury.cm.internal.abbbb r0 = r6.f20257e
            if (r0 != 0) goto L_0x0024
            com.ogury.p244cm.internal.bbabc.m22049a((java.lang.String) r3)
        L_0x0024:
            com.ogury.core.OguryError r1 = new com.ogury.core.OguryError
            java.lang.String r4 = "No internet connection"
            r1.<init>(r2, r4)
            r0.mo52605a((com.ogury.core.OguryError) r1)
        L_0x002e:
            r1 = 0
            goto L_0x005b
        L_0x0030:
            com.ogury.cm.internal.abbba r0 = com.ogury.p244cm.internal.abbba.f20411a
            java.lang.String r0 = com.ogury.p244cm.internal.abbba.m21841j()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0040
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 == 0) goto L_0x005b
            com.ogury.cm.internal.abbbb r0 = r6.f20257e
            if (r0 != 0) goto L_0x004a
            com.ogury.p244cm.internal.bbabc.m22049a((java.lang.String) r3)
        L_0x004a:
            com.ogury.core.OguryError r1 = new com.ogury.core.OguryError
            r4 = 4
            java.lang.String r5 = "Missing consent configuration"
            r1.<init>(r4, r5)
            r0.mo52605a((com.ogury.core.OguryError) r1)
            com.ogury.cm.internal.abbbc r0 = com.ogury.p244cm.internal.abbbc.f20427a
            com.ogury.p244cm.internal.abbbc.m21856b(r5)
            goto L_0x002e
        L_0x005b:
            if (r1 == 0) goto L_0x0067
            com.ogury.cm.internal.abbbb r6 = r6.f20257e
            if (r6 != 0) goto L_0x0064
            com.ogury.p244cm.internal.bbabc.m22049a((java.lang.String) r3)
        L_0x0064:
            com.ogury.p244cm.aaaac.m21641a((android.content.Context) r7, (com.ogury.p244cm.internal.abbbb) r6)
        L_0x0067:
            return
        L_0x0068:
            r7 = 0
            r6.m21666a(new com.ogury.core.OguryError(4, "Consent not received"))
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p244cm.internal.aaaaa.m21668b(com.ogury.cm.internal.aaaaa, android.content.Context):void");
    }

    /* renamed from: a */
    public final aaaac mo52610a() {
        return this.f20265m;
    }

    /* renamed from: a */
    public final void mo52611a(Context context, acabc acabc, CountDownLatch countDownLatch) {
        boolean z;
        acabc acabc2;
        bbabc.m22051b(context, "context");
        bbabc.m22051b(acabc, "requestType");
        bbabc.m22051b(countDownLatch, "countDownLatch");
        abbba abbba = abbba.f20411a;
        abbba.m21835e(this.f20264l);
        String str = this.f20254b;
        this.f20261i.mo52756a(str, context);
        this.f20254b = str;
        if (acabc == acabc.EDIT) {
            acabc2 = acabc.EDIT;
        } else {
            String d = accba.m21966d(context);
            boolean z2 = false;
            if (bbcbc.m22087a(d) || (!bbabc.m22050a((Object) d, (Object) this.f20254b))) {
                z = false;
            } else {
                m21666a(new OguryError(1, aacaa.aaaaa.m21775e("assetKey-unknown")));
                z = true;
            }
            if (!z) {
                abbba abbba2 = abbba.f20411a;
                boolean z3 = !abbba.m21839h().after(new Date());
                boolean z4 = baaba.f20569a.tokenExistsForActiveProduct();
                boolean a = accba.m21962a(context);
                boolean z5 = z4 && !a;
                boolean z6 = !z4 && a;
                aacac aacac = aacac.f20366a;
                boolean a2 = bbabc.m22050a((Object) aacac.m21777a("IS_CHILD_UNDER_COPPA"), (Object) Boolean.TRUE);
                aacac aacac2 = aacac.f20366a;
                boolean a3 = bbabc.m22050a((Object) aacac.m21777a("IS_UNDER_AGE_OF_GDPR_CONSENT"), (Object) Boolean.TRUE);
                if (z3 || z5 || z6 || a2 || a3) {
                    z2 = true;
                }
                if (z2) {
                    OguryIntegrationLogger.m22104d("[Consent][sync] Consent cache needs to be synced with servers");
                    acabc2 = acabc.ASK;
                } else {
                    m21666a(new OguryError(4, "Consent not received"));
                    return;
                }
            } else {
                return;
            }
        }
        m21665a(acabc2, context);
    }

    /* renamed from: a */
    public final void mo52612a(Context context, String str, OguryConsentListener oguryConsentListener) {
        bbabc.m22051b(context, "context");
        bbabc.m22051b(str, "assetKey");
        bbabc.m22051b(oguryConsentListener, "oguryConsentListener");
        OguryIntegrationLogger.m22104d("[Consent] Syncing consent data...");
        if (!this.f20263k) {
            m21667b(context);
            m21659a(oguryConsentListener);
            m21658a(context, str, acabc.ASK);
        }
    }

    /* renamed from: a */
    public final void mo52613a(Context context, CountDownLatch countDownLatch) {
        bbabc.m22051b(context, "context");
        bbabc.m22051b(countDownLatch, "countDownLatch");
        ababb.m21806a(context, new aaaab(this, countDownLatch));
        baaba.f20569a.startDataSourceConnections(context);
        baaba.f20569a.queryPurchase(new C15667aaaaa(countDownLatch));
    }

    /* renamed from: a */
    public final void mo52614a(String str) {
        bbabc.m22051b(str, "<set-?>");
        this.f20264l = str;
    }

    /* renamed from: a */
    public final void mo52615a(boolean z) {
        this.f20263k = false;
    }

    /* renamed from: b */
    public final void mo52616b(Context context, String str, OguryConsentListener oguryConsentListener) {
        bbabc.m22051b(context, "context");
        bbabc.m22051b(str, "assetKey");
        bbabc.m22051b(oguryConsentListener, "oguryConsentListener");
        OguryIntegrationLogger.m22104d("[Consent] Syncing consent data...");
        if (!this.f20263k) {
            m21667b(context);
            m21659a(oguryConsentListener);
            m21658a(context, str, acabc.EDIT);
        }
    }
}
