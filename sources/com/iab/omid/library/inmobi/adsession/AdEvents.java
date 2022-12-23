package com.iab.omid.library.inmobi.adsession;

import com.iab.omid.library.inmobi.p104d.C4680e;

public final class AdEvents {
    private final C4660a adSession;

    private AdEvents(C4660a aVar) {
        this.adSession = aVar;
    }

    public static AdEvents createAdEvents(AdSession adSession2) {
        C4660a aVar = (C4660a) adSession2;
        C4680e.m10054a((Object) adSession2, "AdSession is null");
        C4680e.m10059d(aVar);
        C4680e.m10057b(aVar);
        AdEvents adEvents = new AdEvents(aVar);
        aVar.getAdSessionStatePublisher().mo38990a(adEvents);
        return adEvents;
    }

    public final void impressionOccurred() {
        C4680e.m10057b(this.adSession);
        C4680e.m10061f(this.adSession);
        if (!this.adSession.mo38924d()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.mo38924d()) {
            this.adSession.mo38922b();
        }
    }
}
