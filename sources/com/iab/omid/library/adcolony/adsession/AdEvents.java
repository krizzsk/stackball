package com.iab.omid.library.adcolony.adsession;

import com.iab.omid.library.adcolony.adsession.media.VastProperties;
import com.iab.omid.library.adcolony.p092d.C4581e;

public final class AdEvents {

    /* renamed from: a */
    private final C4560a f10227a;

    private AdEvents(C4560a aVar) {
        this.f10227a = aVar;
    }

    public static AdEvents createAdEvents(AdSession adSession) {
        C4560a aVar = (C4560a) adSession;
        C4581e.m9613a((Object) adSession, "AdSession is null");
        C4581e.m9618d(aVar);
        C4581e.m9616b(aVar);
        AdEvents adEvents = new AdEvents(aVar);
        aVar.getAdSessionStatePublisher().mo38624a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C4581e.m9616b(this.f10227a);
        C4581e.m9620f(this.f10227a);
        if (!this.f10227a.mo38547e()) {
            try {
                this.f10227a.start();
            } catch (Exception unused) {
            }
        }
        if (this.f10227a.mo38547e()) {
            this.f10227a.mo38544b();
        }
    }

    public void loaded() {
        C4581e.m9617c(this.f10227a);
        C4581e.m9620f(this.f10227a);
        this.f10227a.mo38545c();
    }

    public void loaded(VastProperties vastProperties) {
        C4581e.m9613a((Object) vastProperties, "VastProperties is null");
        C4581e.m9617c(this.f10227a);
        C4581e.m9620f(this.f10227a);
        this.f10227a.mo38543a(vastProperties.mo38568a());
    }
}
