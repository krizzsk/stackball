package com.iab.omid.library.smaato.adsession;

import com.iab.omid.library.smaato.p122d.C4829e;

public final class AdEvents {
    private final C4809a adSession;

    private AdEvents(C4809a aVar) {
        this.adSession = aVar;
    }

    public static AdEvents createAdEvents(AdSession adSession2) {
        C4809a aVar = (C4809a) adSession2;
        C4829e.m10712a((Object) adSession2, "AdSession is null");
        C4829e.m10717d(aVar);
        C4829e.m10715b(aVar);
        AdEvents adEvents = new AdEvents(aVar);
        aVar.getAdSessionStatePublisher().mo39555a(adEvents);
        return adEvents;
    }

    public final void impressionOccurred() {
        C4829e.m10715b(this.adSession);
        C4829e.m10719f(this.adSession);
        if (!this.adSession.mo39490d()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.mo39490d()) {
            this.adSession.mo39488b();
        }
    }
}
