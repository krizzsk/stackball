package com.iab.omid.library.ironsrc.adsession;

import com.iab.omid.library.ironsrc.adsession.media.VastProperties;
import com.iab.omid.library.ironsrc.p110d.C4729e;

public final class AdEvents {
    private final C4708a adSession;

    private AdEvents(C4708a aVar) {
        this.adSession = aVar;
    }

    public static AdEvents createAdEvents(AdSession adSession2) {
        C4708a aVar = (C4708a) adSession2;
        C4729e.m10268a((Object) adSession2, "AdSession is null");
        C4729e.m10273d(aVar);
        C4729e.m10271b(aVar);
        AdEvents adEvents = new AdEvents(aVar);
        aVar.getAdSessionStatePublisher().mo39170a(adEvents);
        return adEvents;
    }

    public final void impressionOccurred() {
        C4729e.m10271b(this.adSession);
        C4729e.m10275f(this.adSession);
        if (!this.adSession.mo39093e()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.mo39093e()) {
            this.adSession.mo39090b();
        }
    }

    public final void loaded() {
        C4729e.m10272c(this.adSession);
        C4729e.m10275f(this.adSession);
        this.adSession.mo39091c();
    }

    public final void loaded(VastProperties vastProperties) {
        C4729e.m10268a((Object) vastProperties, "VastProperties is null");
        C4729e.m10272c(this.adSession);
        C4729e.m10275f(this.adSession);
        this.adSession.mo39089a(vastProperties.mo39114a());
    }
}
