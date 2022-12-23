package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.video.VideoEvents;

/* renamed from: com.inmobi.media.dp */
/* compiled from: AdEventHandler */
final class C5130dp {

    /* renamed from: a */
    VideoEvents f11776a;

    /* renamed from: b */
    private AdEvents f11777b;

    public C5130dp(AdSession adSession, String str) {
        if (((str.hashCode() == -1191784049 && str.equals("native_video_ad")) ? (char) 0 : 65535) == 0) {
            this.f11776a = VideoEvents.createVideoEvents(adSession);
        }
        this.f11777b = AdEvents.createAdEvents(adSession);
    }

    /* renamed from: a */
    public final void mo40407a() {
        AdEvents adEvents = this.f11777b;
        if (adEvents != null) {
            adEvents.impressionOccurred();
        }
    }
}
