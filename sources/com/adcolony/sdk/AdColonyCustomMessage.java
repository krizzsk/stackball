package com.adcolony.sdk;

public class AdColonyCustomMessage {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f123a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f124b;

    /* renamed from: com.adcolony.sdk.AdColonyCustomMessage$a */
    class C0573a implements Runnable {
        C0573a() {
        }

        public void run() {
            AdColony.m44c();
            C0897z0 b = C0894y.m1151b();
            C0894y.m1148a(b, "type", AdColonyCustomMessage.this.f123a);
            C0894y.m1148a(b, "message", AdColonyCustomMessage.this.f124b);
            new C0645d0("CustomMessage.native_send", 1, b).mo9536d();
        }
    }

    public AdColonyCustomMessage(String str, String str2) {
        if (C0849u0.m942e(str) || C0849u0.m942e(str2)) {
            this.f123a = str;
            this.f124b = str2;
        }
    }

    public String getMessage() {
        return this.f124b;
    }

    public String getType() {
        return this.f123a;
    }

    public void send() {
        AdColony.m40a((Runnable) new C0573a());
    }

    public AdColonyCustomMessage set(String str, String str2) {
        this.f123a = str;
        this.f124b = str2;
        return this;
    }
}
