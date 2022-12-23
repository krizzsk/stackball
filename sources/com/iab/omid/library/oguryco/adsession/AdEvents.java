package com.iab.omid.library.oguryco.adsession;

import com.iab.omid.library.oguryco.adsession.media.VastProperties;
import com.iab.omid.library.oguryco.p116d.C4780e;

public final class AdEvents {
    private final C4758a adSession;

    private AdEvents(C4758a aVar) {
        this.adSession = aVar;
    }

    public static AdEvents createAdEvents(AdSession adSession2) {
        C4758a aVar = (C4758a) adSession2;
        C4780e.m10497a((Object) adSession2, "AdSession is null");
        C4780e.m10502d(aVar);
        C4780e.m10500b(aVar);
        AdEvents adEvents = new AdEvents(aVar);
        aVar.getAdSessionStatePublisher().mo39384a(adEvents);
        return adEvents;
    }

    public final void impressionOccurred() {
        C4780e.m10500b(this.adSession);
        C4780e.m10504f(this.adSession);
        if (!this.adSession.mo39281e()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.mo39281e()) {
            this.adSession.mo39278b();
        }
    }

    public final void loaded() {
        C4780e.m10501c(this.adSession);
        C4780e.m10504f(this.adSession);
        this.adSession.mo39279c();
    }

    public final void loaded(VastProperties vastProperties) {
        C4780e.m10501c(this.adSession);
        C4780e.m10504f(this.adSession);
        this.adSession.mo39277a(vastProperties.mo39303a());
    }
}
