package com.adcolony.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Vibrator;
import com.adcolony.sdk.C0580a0;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;

/* renamed from: com.adcolony.sdk.s0 */
class C0800s0 {

    /* renamed from: com.adcolony.sdk.s0$a */
    class C0801a implements C0685f0 {
        C0801a() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            boolean unused = C0800s0.this.m802f(d0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.s0$b */
    class C0802b implements C0685f0 {
        C0802b() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            boolean unused = C0800s0.this.m794a(d0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.s0$c */
    class C0803c implements C0685f0 {
        C0803c() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0800s0.this.mo9868c(d0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.s0$d */
    class C0804d implements C0685f0 {
        C0804d() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            boolean unused = C0800s0.this.m805n(d0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.s0$e */
    class C0805e implements C0685f0 {
        C0805e() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            boolean unused = C0800s0.this.m804j(d0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.s0$f */
    class C0806f implements C0685f0 {
        C0806f() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            boolean unused = C0800s0.this.m803i(d0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.s0$g */
    class C0807g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f1360a;

        C0807g(String str) {
            this.f1360a = str;
        }

        public void run() {
            C0897z0 b = C0894y.m1151b();
            C0894y.m1148a(b, "type", "open_hook");
            C0894y.m1148a(b, "message", this.f1360a);
            new C0645d0("CustomMessage.controller_send", 0, b).mo9536d();
        }
    }

    /* renamed from: com.adcolony.sdk.s0$h */
    class C0808h implements C0685f0 {
        C0808h() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0800s0.this.mo9872h(d0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.s0$i */
    class C0809i implements C0685f0 {
        C0809i() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0800s0.this.mo9875m(d0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.s0$j */
    class C0810j implements C0685f0 {
        C0810j() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0800s0.this.mo9873k(d0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.s0$k */
    class C0811k implements C0685f0 {
        C0811k() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0800s0.this.mo9876o(d0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.s0$l */
    class C0812l implements C0685f0 {
        C0812l() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0800s0.this.mo9871g(d0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.s0$m */
    class C0813m implements C0685f0 {
        C0813m() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0800s0.this.mo9870e(d0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.s0$n */
    class C0814n implements C0685f0 {
        C0814n() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0800s0.this.mo9869d(d0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.s0$o */
    class C0815o implements C0685f0 {
        C0815o() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0800s0.this.mo9866b(d0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.s0$p */
    class C0816p implements C0685f0 {
        C0816p() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0800s0.this.mo9874l(d0Var);
        }
    }

    C0800s0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public boolean m802f(C0645d0 d0Var) {
        C0897z0 b = d0Var.mo9532b();
        C0612d d = C0578a.m143c().mo9597d();
        String h = C0894y.m1169h(b, "ad_session_id");
        AdColonyInterstitial adColonyInterstitial = d.mo9509f().get(h);
        AdColonyAdView adColonyAdView = d.mo9506d().get(h);
        if ((adColonyInterstitial == null || adColonyInterstitial.getListener() == null || adColonyInterstitial.mo9330d() == null) && (adColonyAdView == null || adColonyAdView.getListener() == null)) {
            return false;
        }
        if (adColonyAdView == null) {
            new C0645d0("AdUnit.make_in_app_purchase", adColonyInterstitial.mo9330d().mo9469k()).mo9536d();
        }
        mo9865a(h);
        m797b(h);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public boolean m803i(C0645d0 d0Var) {
        C0897z0 b = d0Var.mo9532b();
        String h = C0894y.m1169h(C0894y.m1167f(b, "clickOverride"), "url");
        String h2 = C0894y.m1169h(b, "ad_session_id");
        C0612d d = C0578a.m143c().mo9597d();
        AdColonyInterstitial adColonyInterstitial = d.mo9509f().get(h2);
        AdColonyAdView adColonyAdView = d.mo9506d().get(h2);
        if (adColonyInterstitial != null) {
            adColonyInterstitial.mo9325b(h);
            return true;
        } else if (adColonyAdView == null) {
            return false;
        } else {
            adColonyAdView.setClickOverride(h);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public boolean m804j(C0645d0 d0Var) {
        int i;
        C0897z0 b = d0Var.mo9532b();
        String h = C0894y.m1169h(b, "ad_session_id");
        int d = C0894y.m1163d(b, "orientation");
        C0612d d2 = C0578a.m143c().mo9597d();
        AdColonyAdView adColonyAdView = d2.mo9506d().get(h);
        AdColonyInterstitial adColonyInterstitial = d2.mo9509f().get(h);
        Context b2 = C0578a.m141b();
        if (adColonyAdView != null) {
            adColonyAdView.setOrientation(d);
        } else if (adColonyInterstitial != null) {
            adColonyInterstitial.mo9316a(d);
        }
        if (adColonyInterstitial == null && adColonyAdView == null) {
            new C0580a0.C0581a().mo9419a("Invalid ad session id sent with set orientation properties message: ").mo9419a(h).mo9421a(C0580a0.f192j);
            return false;
        } else if (!(b2 instanceof C0585b)) {
            return true;
        } else {
            C0585b bVar = (C0585b) b2;
            if (adColonyAdView == null) {
                i = adColonyInterstitial.mo9335g();
            } else {
                i = adColonyAdView.getOrientation();
            }
            bVar.mo9423a(i);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public boolean m805n(C0645d0 d0Var) {
        AdColonyAdView adColonyAdView = C0578a.m143c().mo9597d().mo9506d().get(C0894y.m1169h(d0Var.mo9532b(), "ad_session_id"));
        if (adColonyAdView == null) {
            return false;
        }
        adColonyAdView.setNoCloseButton(C0894y.m1155b(d0Var.mo9532b(), "use_custom_close"));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo9871g(C0645d0 d0Var) {
        C0897z0 b = C0894y.m1151b();
        C0897z0 b2 = d0Var.mo9532b();
        String h = C0894y.m1169h(b2, "url");
        String h2 = C0894y.m1169h(b2, "ad_session_id");
        AdColonyAdView adColonyAdView = C0578a.m143c().mo9597d().mo9506d().get(h2);
        if (adColonyAdView != null && !adColonyAdView.getTrustedDemandSource() && !adColonyAdView.mo9221c()) {
            return false;
        }
        if (h.startsWith("browser")) {
            h = h.replaceFirst("browser", "http");
        }
        if (h.startsWith("safari")) {
            h = h.replaceFirst("safari", "http");
        }
        m799d(h);
        if (C0849u0.m912a(new Intent("android.intent.action.VIEW", Uri.parse(h)))) {
            C0894y.m1158b(b, "success", true);
            d0Var.mo9530a(b).mo9536d();
            mo9867c(h2);
            mo9865a(h2);
            m797b(h2);
            return true;
        }
        C0849u0.m917a("Failed to launch browser.", 0);
        C0894y.m1158b(b, "success", false);
        d0Var.mo9530a(b).mo9536d();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo9872h(C0645d0 d0Var) {
        C0897z0 b = C0894y.m1151b();
        C0897z0 b2 = d0Var.mo9532b();
        String h = C0894y.m1169h(b2, "product_id");
        String h2 = C0894y.m1169h(b2, "ad_session_id");
        if (h.equals("")) {
            h = C0894y.m1169h(b2, "handle");
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(h));
        m799d(h);
        if (C0849u0.m912a(intent)) {
            C0894y.m1158b(b, "success", true);
            d0Var.mo9530a(b).mo9536d();
            mo9867c(h2);
            mo9865a(h2);
            m797b(h2);
            return true;
        }
        C0849u0.m917a("Unable to open.", 0);
        C0894y.m1158b(b, "success", false);
        d0Var.mo9530a(b).mo9536d();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo9873k(C0645d0 d0Var) {
        C0897z0 b = d0Var.mo9532b();
        C0897z0 b2 = C0894y.m1151b();
        String h = C0894y.m1169h(b, "ad_session_id");
        C0895y0 a = C0894y.m1136a(b, "recipients");
        String str = "";
        for (int i = 0; i < a.mo10032c(); i++) {
            if (i != 0) {
                str = str + ";";
            }
            str = str + C0894y.m1164d(a, i);
        }
        if (C0849u0.m912a(new Intent("android.intent.action.VIEW", Uri.parse("smsto:" + str)).putExtra("sms_body", C0894y.m1169h(b, "body")))) {
            C0894y.m1158b(b2, "success", true);
            d0Var.mo9530a(b2).mo9536d();
            mo9867c(h);
            mo9865a(h);
            m797b(h);
            return true;
        }
        C0849u0.m917a("Failed to create sms.", 0);
        C0894y.m1158b(b2, "success", false);
        d0Var.mo9530a(b2).mo9536d();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo9874l(C0645d0 d0Var) {
        C0897z0 b = C0894y.m1151b();
        C0897z0 b2 = d0Var.mo9532b();
        Intent type = new Intent("android.intent.action.SEND").setType(WebRequest.CONTENT_TYPE_PLAIN_TEXT);
        Intent putExtra = type.putExtra("android.intent.extra.TEXT", C0894y.m1169h(b2, "text") + " " + C0894y.m1169h(b2, "url"));
        String h = C0894y.m1169h(b2, "ad_session_id");
        if (C0849u0.m913a(putExtra, true)) {
            C0894y.m1158b(b, "success", true);
            d0Var.mo9530a(b).mo9536d();
            mo9867c(h);
            mo9865a(h);
            m797b(h);
            return true;
        }
        C0849u0.m917a("Unable to create social post.", 0);
        C0894y.m1158b(b, "success", false);
        d0Var.mo9530a(b).mo9536d();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo9875m(C0645d0 d0Var) {
        C0897z0 b = C0894y.m1151b();
        C0897z0 b2 = d0Var.mo9532b();
        Intent intent = new Intent("android.intent.action.DIAL");
        Intent data = intent.setData(Uri.parse("tel:" + C0894y.m1169h(b2, "phone_number")));
        String h = C0894y.m1169h(b2, "ad_session_id");
        if (C0849u0.m912a(data)) {
            C0894y.m1158b(b, "success", true);
            d0Var.mo9530a(b).mo9536d();
            mo9867c(h);
            mo9865a(h);
            m797b(h);
            return true;
        }
        C0849u0.m917a("Failed to dial number.", 0);
        C0894y.m1158b(b, "success", false);
        d0Var.mo9530a(b).mo9536d();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo9876o(C0645d0 d0Var) {
        Context b = C0578a.m141b();
        if (b == null) {
            return false;
        }
        int a = C0894y.m1132a(d0Var.mo9532b(), "length_ms", (int) TJAdUnitConstants.DEFAULT_VOLUME_CHECK_INTERVAL);
        C0897z0 b2 = C0894y.m1151b();
        C0895y0 e = C0849u0.m941e(b);
        boolean z = false;
        for (int i = 0; i < e.mo10032c(); i++) {
            if (C0894y.m1164d(e, i).equals("android.permission.VIBRATE")) {
                z = true;
            }
        }
        if (!z) {
            new C0580a0.C0581a().mo9419a("No vibrate permission detected.").mo9421a(C0580a0.f189g);
            C0894y.m1158b(b2, "success", false);
            d0Var.mo9530a(b2).mo9536d();
            return false;
        }
        try {
            Vibrator vibrator = (Vibrator) b.getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate((long) a);
                C0894y.m1158b(b2, "success", true);
                d0Var.mo9530a(b2).mo9536d();
                return true;
            }
        } catch (Exception unused) {
            new C0580a0.C0581a().mo9419a("Vibrate command failed.").mo9421a(C0580a0.f189g);
        }
        C0894y.m1158b(b2, "success", false);
        d0Var.mo9530a(b2).mo9536d();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9864a() {
        C0578a.m139a("System.open_store", (C0685f0) new C0808h());
        C0578a.m139a("System.telephone", (C0685f0) new C0809i());
        C0578a.m139a("System.sms", (C0685f0) new C0810j());
        C0578a.m139a("System.vibrate", (C0685f0) new C0811k());
        C0578a.m139a("System.open_browser", (C0685f0) new C0812l());
        C0578a.m139a("System.mail", (C0685f0) new C0813m());
        C0578a.m139a("System.launch_app", (C0685f0) new C0814n());
        C0578a.m139a("System.create_calendar_event", (C0685f0) new C0815o());
        C0578a.m139a("System.social_post", (C0685f0) new C0816p());
        C0578a.m139a("System.make_in_app_purchase", (C0685f0) new C0801a());
        C0578a.m139a("System.close", (C0685f0) new C0802b());
        C0578a.m139a("System.expand", (C0685f0) new C0803c());
        C0578a.m139a("System.use_custom_close", (C0685f0) new C0804d());
        C0578a.m139a("System.set_orientation_properties", (C0685f0) new C0805e());
        C0578a.m139a("System.click_override", (C0685f0) new C0806f());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01ed  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo9866b(com.adcolony.sdk.C0645d0 r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            com.adcolony.sdk.z0 r2 = com.adcolony.sdk.C0894y.m1151b()
            com.adcolony.sdk.z0 r3 = r25.mo9532b()
            java.lang.String r4 = "ad_session_id"
            java.lang.String r4 = com.adcolony.sdk.C0894y.m1169h(r3, r4)
            java.lang.String r5 = "params"
            com.adcolony.sdk.z0 r3 = com.adcolony.sdk.C0894y.m1167f(r3, r5)
            java.lang.String r5 = "recurrence"
            com.adcolony.sdk.z0 r5 = com.adcolony.sdk.C0894y.m1167f(r3, r5)
            com.adcolony.sdk.y0 r6 = com.adcolony.sdk.C0894y.m1134a()
            com.adcolony.sdk.y0 r7 = com.adcolony.sdk.C0894y.m1134a()
            com.adcolony.sdk.y0 r8 = com.adcolony.sdk.C0894y.m1134a()
            java.lang.String r9 = "description"
            java.lang.String r10 = com.adcolony.sdk.C0894y.m1169h(r3, r9)
            java.lang.String r11 = "location"
            com.adcolony.sdk.C0894y.m1169h(r3, r11)
            java.lang.String r11 = "start"
            java.lang.String r11 = com.adcolony.sdk.C0894y.m1169h(r3, r11)
            java.lang.String r12 = "end"
            java.lang.String r12 = com.adcolony.sdk.C0894y.m1169h(r3, r12)
            java.lang.String r13 = "summary"
            java.lang.String r3 = com.adcolony.sdk.C0894y.m1169h(r3, r13)
            java.lang.String r13 = ""
            if (r5 == 0) goto L_0x0078
            int r14 = r5.mo10070c()
            if (r14 <= 0) goto L_0x0078
            java.lang.String r6 = "expires"
            java.lang.String r6 = com.adcolony.sdk.C0894y.m1169h(r5, r6)
            java.lang.String r7 = "frequency"
            java.lang.String r7 = com.adcolony.sdk.C0894y.m1169h(r5, r7)
            java.util.Locale r8 = java.util.Locale.getDefault()
            java.lang.String r7 = r7.toUpperCase(r8)
            java.lang.String r8 = "daysInWeek"
            com.adcolony.sdk.y0 r8 = com.adcolony.sdk.C0894y.m1136a((com.adcolony.sdk.C0897z0) r5, (java.lang.String) r8)
            java.lang.String r14 = "daysInMonth"
            com.adcolony.sdk.y0 r14 = com.adcolony.sdk.C0894y.m1136a((com.adcolony.sdk.C0897z0) r5, (java.lang.String) r14)
            java.lang.String r15 = "daysInYear"
            com.adcolony.sdk.y0 r15 = com.adcolony.sdk.C0894y.m1136a((com.adcolony.sdk.C0897z0) r5, (java.lang.String) r15)
            goto L_0x007d
        L_0x0078:
            r14 = r7
            r15 = r8
            r7 = r13
            r8 = r6
            r6 = r7
        L_0x007d:
            boolean r13 = r3.equals(r13)
            if (r13 == 0) goto L_0x0084
            r3 = r10
        L_0x0084:
            java.util.Date r11 = com.adcolony.sdk.C0849u0.m946g(r11)
            java.util.Date r12 = com.adcolony.sdk.C0849u0.m946g(r12)
            java.util.Date r6 = com.adcolony.sdk.C0849u0.m946g(r6)
            java.lang.String r13 = "success"
            if (r11 == 0) goto L_0x0206
            if (r12 != 0) goto L_0x0098
            goto L_0x0206
        L_0x0098:
            long r0 = r11.getTime()
            r16 = r13
            long r12 = r12.getTime()
            r17 = 0
            if (r6 == 0) goto L_0x00b5
            long r19 = r6.getTime()
            long r21 = r11.getTime()
            long r19 = r19 - r21
            r21 = 1000(0x3e8, double:4.94E-321)
            long r19 = r19 / r21
            goto L_0x00b7
        L_0x00b5:
            r19 = r17
        L_0x00b7:
            java.lang.String r6 = "DAILY"
            boolean r6 = r7.equals(r6)
            r21 = 1
            if (r6 == 0) goto L_0x00cd
            r17 = 86400(0x15180, double:4.26873E-319)
            long r19 = r19 / r17
        L_0x00c6:
            long r17 = r19 + r21
        L_0x00c8:
            r19 = r12
            r11 = r17
            goto L_0x00f7
        L_0x00cd:
            java.lang.String r6 = "WEEKLY"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x00db
            r17 = 604800(0x93a80, double:2.98811E-318)
            long r19 = r19 / r17
            goto L_0x00c6
        L_0x00db:
            java.lang.String r6 = "MONTHLY"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x00e9
            r17 = 2629800(0x2820a8, double:1.299294E-317)
            long r19 = r19 / r17
            goto L_0x00c6
        L_0x00e9:
            java.lang.String r6 = "YEARLY"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x00c8
            r17 = 31557600(0x1e187e0, double:1.5591526E-316)
            long r19 = r19 / r17
            goto L_0x00c6
        L_0x00f7:
            java.lang.String r6 = "endTime"
            java.lang.String r13 = "beginTime"
            r17 = r4
            java.lang.String r4 = "title"
            r18 = r2
            java.lang.String r2 = "vnd.android.cursor.item/event"
            r21 = r6
            java.lang.String r6 = "android.intent.action.EDIT"
            if (r5 == 0) goto L_0x01aa
            int r5 = r5.mo10070c()
            if (r5 <= 0) goto L_0x01aa
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r22 = r0
            java.lang.String r0 = "FREQ="
            r5.append(r0)
            r5.append(r7)
            java.lang.String r0 = ";COUNT="
            r5.append(r0)
            r5.append(r11)
            java.lang.String r0 = r5.toString()
            int r1 = r8.mo10032c()     // Catch:{ JSONException -> 0x0184 }
            if (r1 == 0) goto L_0x0148
            java.lang.String r1 = com.adcolony.sdk.C0849u0.m910a((com.adcolony.sdk.C0895y0) r8)     // Catch:{ JSONException -> 0x0184 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0184 }
            r5.<init>()     // Catch:{ JSONException -> 0x0184 }
            r5.append(r0)     // Catch:{ JSONException -> 0x0184 }
            java.lang.String r7 = ";BYDAY="
            r5.append(r7)     // Catch:{ JSONException -> 0x0184 }
            r5.append(r1)     // Catch:{ JSONException -> 0x0184 }
            java.lang.String r0 = r5.toString()     // Catch:{ JSONException -> 0x0184 }
        L_0x0148:
            int r1 = r14.mo10032c()     // Catch:{ JSONException -> 0x0184 }
            if (r1 == 0) goto L_0x0166
            java.lang.String r1 = com.adcolony.sdk.C0849u0.m928b((com.adcolony.sdk.C0895y0) r14)     // Catch:{ JSONException -> 0x0184 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0184 }
            r5.<init>()     // Catch:{ JSONException -> 0x0184 }
            r5.append(r0)     // Catch:{ JSONException -> 0x0184 }
            java.lang.String r7 = ";BYMONTHDAY="
            r5.append(r7)     // Catch:{ JSONException -> 0x0184 }
            r5.append(r1)     // Catch:{ JSONException -> 0x0184 }
            java.lang.String r0 = r5.toString()     // Catch:{ JSONException -> 0x0184 }
        L_0x0166:
            int r1 = r15.mo10032c()     // Catch:{ JSONException -> 0x0184 }
            if (r1 == 0) goto L_0x0184
            java.lang.String r1 = com.adcolony.sdk.C0849u0.m928b((com.adcolony.sdk.C0895y0) r15)     // Catch:{ JSONException -> 0x0184 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0184 }
            r5.<init>()     // Catch:{ JSONException -> 0x0184 }
            r5.append(r0)     // Catch:{ JSONException -> 0x0184 }
            java.lang.String r7 = ";BYYEARDAY="
            r5.append(r7)     // Catch:{ JSONException -> 0x0184 }
            r5.append(r1)     // Catch:{ JSONException -> 0x0184 }
            java.lang.String r0 = r5.toString()     // Catch:{ JSONException -> 0x0184 }
        L_0x0184:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r6)
            android.content.Intent r1 = r1.setType(r2)
            android.content.Intent r1 = r1.putExtra(r4, r3)
            android.content.Intent r1 = r1.putExtra(r9, r10)
            r7 = r22
            android.content.Intent r1 = r1.putExtra(r13, r7)
            r11 = r19
            r5 = r21
            android.content.Intent r1 = r1.putExtra(r5, r11)
            java.lang.String r2 = "rrule"
            android.content.Intent r0 = r1.putExtra(r2, r0)
            goto L_0x01c8
        L_0x01aa:
            r7 = r0
            r11 = r19
            r5 = r21
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r6)
            android.content.Intent r0 = r0.setType(r2)
            android.content.Intent r0 = r0.putExtra(r4, r3)
            android.content.Intent r0 = r0.putExtra(r9, r10)
            android.content.Intent r0 = r0.putExtra(r13, r7)
            android.content.Intent r0 = r0.putExtra(r5, r11)
        L_0x01c8:
            boolean r0 = com.adcolony.sdk.C0849u0.m912a((android.content.Intent) r0)
            if (r0 == 0) goto L_0x01ed
            r0 = 1
            r2 = r16
            r1 = r18
            com.adcolony.sdk.C0894y.m1158b((com.adcolony.sdk.C0897z0) r1, (java.lang.String) r2, (boolean) r0)
            r3 = r25
            com.adcolony.sdk.d0 r1 = r3.mo9530a((com.adcolony.sdk.C0897z0) r1)
            r1.mo9536d()
            r4 = r24
            r1 = r17
            r4.mo9867c((java.lang.String) r1)
            r4.mo9865a((java.lang.String) r1)
            r4.m797b((java.lang.String) r1)
            return r0
        L_0x01ed:
            r4 = r24
            r3 = r25
            r2 = r16
            r1 = r18
            r0 = 0
            java.lang.String r5 = "Unable to create Calendar Event."
            com.adcolony.sdk.C0849u0.m917a((java.lang.String) r5, (int) r0)
            com.adcolony.sdk.C0894y.m1158b((com.adcolony.sdk.C0897z0) r1, (java.lang.String) r2, (boolean) r0)
            com.adcolony.sdk.d0 r1 = r3.mo9530a((com.adcolony.sdk.C0897z0) r1)
            r1.mo9536d()
            return r0
        L_0x0206:
            r4 = r24
            r3 = r1
            r1 = r2
            r2 = r13
            r0 = 0
            java.lang.String r5 = "Unable to create Calendar Event"
            com.adcolony.sdk.C0849u0.m917a((java.lang.String) r5, (int) r0)
            com.adcolony.sdk.C0894y.m1158b((com.adcolony.sdk.C0897z0) r1, (java.lang.String) r2, (boolean) r0)
            com.adcolony.sdk.d0 r1 = r3.mo9530a((com.adcolony.sdk.C0897z0) r1)
            r1.mo9536d()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0800s0.mo9866b(com.adcolony.sdk.d0):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo9868c(C0645d0 d0Var) {
        C0897z0 b = d0Var.mo9532b();
        Context b2 = C0578a.m141b();
        if (b2 != null && C0578a.m145e()) {
            String h = C0894y.m1169h(b, "ad_session_id");
            C0693i c = C0578a.m143c();
            AdColonyAdView adColonyAdView = c.mo9597d().mo9506d().get(h);
            if (adColonyAdView != null && ((adColonyAdView.getTrustedDemandSource() || adColonyAdView.mo9221c()) && c.mo9608l() != adColonyAdView)) {
                adColonyAdView.setExpandMessage(d0Var);
                adColonyAdView.setExpandedWidth(C0894y.m1163d(b, "width"));
                adColonyAdView.setExpandedHeight(C0894y.m1163d(b, "height"));
                adColonyAdView.setOrientation(C0894y.m1132a(b, "orientation", -1));
                adColonyAdView.setNoCloseButton(C0894y.m1155b(b, "use_custom_close"));
                c.mo9585a(adColonyAdView);
                c.mo9590a(adColonyAdView.getContainer());
                Intent intent = new Intent(b2, AdColonyAdViewActivity.class);
                m797b(h);
                mo9865a(h);
                C0849u0.m912a(intent);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo9869d(C0645d0 d0Var) {
        C0897z0 b = C0894y.m1151b();
        C0897z0 b2 = d0Var.mo9532b();
        String h = C0894y.m1169h(b2, "ad_session_id");
        if (C0894y.m1155b(b2, CampaignEx.JSON_KEY_DEEP_LINK_URL)) {
            return mo9872h(d0Var);
        }
        Context b3 = C0578a.m141b();
        if (b3 == null) {
            return false;
        }
        if (C0849u0.m912a(b3.getPackageManager().getLaunchIntentForPackage(C0894y.m1169h(b2, "handle")))) {
            C0894y.m1158b(b, "success", true);
            d0Var.mo9530a(b).mo9536d();
            mo9867c(h);
            mo9865a(h);
            m797b(h);
            return true;
        }
        C0849u0.m917a("Failed to launch external application.", 0);
        C0894y.m1158b(b, "success", false);
        d0Var.mo9530a(b).mo9536d();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo9870e(C0645d0 d0Var) {
        C0897z0 b = C0894y.m1151b();
        C0897z0 b2 = d0Var.mo9532b();
        C0895y0 a = C0894y.m1136a(b2, "recipients");
        boolean b3 = C0894y.m1155b(b2, TJAdUnitConstants.String.HTML);
        String h = C0894y.m1169h(b2, "subject");
        String h2 = C0894y.m1169h(b2, "body");
        String h3 = C0894y.m1169h(b2, "ad_session_id");
        String[] strArr = new String[a.mo10032c()];
        for (int i = 0; i < a.mo10032c(); i++) {
            strArr[i] = C0894y.m1164d(a, i);
        }
        Intent intent = new Intent("android.intent.action.SEND");
        if (!b3) {
            intent.setType("plain/text");
        }
        intent.putExtra("android.intent.extra.SUBJECT", h).putExtra("android.intent.extra.TEXT", h2).putExtra("android.intent.extra.EMAIL", strArr);
        if (C0849u0.m912a(intent)) {
            C0894y.m1158b(b, "success", true);
            d0Var.mo9530a(b).mo9536d();
            mo9867c(h3);
            mo9865a(h3);
            m797b(h3);
            return true;
        }
        C0849u0.m917a("Failed to send email.", 0);
        C0894y.m1158b(b, "success", false);
        d0Var.mo9530a(b).mo9536d();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9867c(String str) {
        C0612d d = C0578a.m143c().mo9597d();
        AdColonyInterstitial adColonyInterstitial = d.mo9509f().get(str);
        if (adColonyInterstitial == null || adColonyInterstitial.getListener() == null) {
            AdColonyAdView adColonyAdView = d.mo9506d().get(str);
            AdColonyAdViewListener listener = adColonyAdView != null ? adColonyAdView.getListener() : null;
            if (adColonyAdView != null && listener != null) {
                listener.onLeftApplication(adColonyAdView);
                return;
            }
            return;
        }
        adColonyInterstitial.getListener().onLeftApplication(adColonyInterstitial);
    }

    /* renamed from: d */
    private void m799d(String str) {
        if (!C0849u0.m915a((Runnable) new C0807g(str))) {
            new C0580a0.C0581a().mo9419a("Executing ADCSystem.sendOpenCustomMessage failed").mo9421a(C0580a0.f192j);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m794a(C0645d0 d0Var) {
        String h = C0894y.m1169h(d0Var.mo9532b(), "ad_session_id");
        Activity activity = C0578a.m141b() instanceof Activity ? (Activity) C0578a.m141b() : null;
        boolean z = activity instanceof AdColonyAdViewActivity;
        if (!(activity instanceof C0585b)) {
            return false;
        }
        if (z) {
            ((AdColonyAdViewActivity) activity).mo9247b();
            return true;
        }
        C0897z0 b = C0894y.m1151b();
        C0894y.m1148a(b, "id", h);
        new C0645d0("AdSession.on_request_close", ((C0585b) activity).f205d, b).mo9536d();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9865a(String str) {
        C0612d d = C0578a.m143c().mo9597d();
        AdColonyInterstitial adColonyInterstitial = d.mo9509f().get(str);
        if (adColonyInterstitial == null || adColonyInterstitial.getListener() == null || !adColonyInterstitial.mo9340i()) {
            AdColonyAdView adColonyAdView = d.mo9506d().get(str);
            AdColonyAdViewListener listener = adColonyAdView != null ? adColonyAdView.getListener() : null;
            if (adColonyAdView != null && listener != null && adColonyAdView.mo9221c()) {
                listener.onClicked(adColonyAdView);
                return;
            }
            return;
        }
        adColonyInterstitial.getListener().onClicked(adColonyInterstitial);
    }

    /* renamed from: b */
    private boolean m797b(String str) {
        if (C0578a.m143c().mo9597d().mo9506d().get(str) == null) {
            return false;
        }
        C0897z0 b = C0894y.m1151b();
        C0894y.m1148a(b, "ad_session_id", str);
        new C0645d0("MRAID.on_event", 1, b).mo9536d();
        return true;
    }
}
