package com.iab.omid.library.corpmailru.adsession;

import com.iab.omid.library.corpmailru.adsession.media.VastProperties;
import com.iab.omid.library.corpmailru.p098d.C4631e;

public final class AdEvents {
    private final C4610a adSession;

    private AdEvents(C4610a aVar) {
        this.adSession = aVar;
    }

    public static AdEvents createAdEvents(AdSession adSession2) {
        C4610a aVar = (C4610a) adSession2;
        C4631e.m9837a((Object) adSession2, "AdSession is null");
        C4631e.m9842d(aVar);
        C4631e.m9840b(aVar);
        AdEvents adEvents = new AdEvents(aVar);
        aVar.getAdSessionStatePublisher().mo38818a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C4631e.m9840b(this.adSession);
        C4631e.m9844f(this.adSession);
        if (!this.adSession.mo38733e()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.mo38733e()) {
            this.adSession.mo38730b();
        }
    }

    public void loaded() {
        C4631e.m9841c(this.adSession);
        C4631e.m9844f(this.adSession);
        this.adSession.mo38731c();
    }

    public void loaded(VastProperties vastProperties) {
        C4631e.m9837a((Object) vastProperties, "VastProperties is null");
        C4631e.m9841c(this.adSession);
        C4631e.m9844f(this.adSession);
        this.adSession.mo38729a(vastProperties.mo38754a());
    }
}
