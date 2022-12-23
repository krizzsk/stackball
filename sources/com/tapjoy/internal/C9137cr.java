package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.cr */
public final class C9137cr {

    /* renamed from: a */
    private final C9145cz f22454a;

    private C9137cr(C9145cz czVar) {
        this.f22454a = czVar;
    }

    /* renamed from: a */
    public static C9137cr m24472a(C9138cs csVar) {
        C9145cz czVar = (C9145cz) csVar;
        C9166do.m24543a((Object) csVar, "AdSession is null");
        if (czVar.f22480c.f22530b == null) {
            C9166do.m24542a(czVar);
            C9137cr crVar = new C9137cr(czVar);
            czVar.f22480c.f22530b = crVar;
            return crVar;
        }
        throw new IllegalStateException("AdEvents already exists for AdSession");
    }

    /* renamed from: a */
    public final void mo57924a() {
        C9166do.m24542a(this.f22454a);
        if (C9142cw.NATIVE == this.f22454a.f22478a.f22455a) {
            if (!this.f22454a.mo57931d()) {
                try {
                    this.f22454a.mo57925a();
                } catch (Exception unused) {
                }
            }
            if (this.f22454a.mo57931d()) {
                C9145cz czVar = this.f22454a;
                if (!czVar.f22484g) {
                    C9155dg.m24515a().mo57953a(czVar.f22480c.mo57966c(), "publishImpressionEvent", new Object[0]);
                    czVar.f22484g = true;
                    return;
                }
                throw new IllegalStateException("Impression event can only be sent once");
            }
            return;
        }
        throw new IllegalStateException("Impression event is not expected from the Native AdSession");
    }
}
