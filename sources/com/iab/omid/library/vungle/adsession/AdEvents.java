package com.iab.omid.library.vungle.adsession;

import com.iab.omid.library.vungle.adsession.media.VastProperties;
import com.iab.omid.library.vungle.p128d.C4878e;

public final class AdEvents {
    private final C4857a adSession;

    private AdEvents(C4857a aVar) {
        this.adSession = aVar;
    }

    public static AdEvents createAdEvents(AdSession adSession2) {
        C4857a aVar = (C4857a) adSession2;
        C4878e.m10925a((Object) adSession2, "AdSession is null");
        C4878e.m10930d(aVar);
        C4878e.m10928b(aVar);
        AdEvents adEvents = new AdEvents(aVar);
        aVar.getAdSessionStatePublisher().mo39740a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C4878e.m10928b(this.adSession);
        C4878e.m10932f(this.adSession);
        if (!this.adSession.mo39655e()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.mo39655e()) {
            this.adSession.mo39652b();
        }
    }

    public void loaded() {
        C4878e.m10929c(this.adSession);
        C4878e.m10932f(this.adSession);
        this.adSession.mo39653c();
    }

    public void loaded(VastProperties vastProperties) {
        C4878e.m10925a((Object) vastProperties, "VastProperties is null");
        C4878e.m10929c(this.adSession);
        C4878e.m10932f(this.adSession);
        this.adSession.mo39651a(vastProperties.mo39676a());
    }
}
