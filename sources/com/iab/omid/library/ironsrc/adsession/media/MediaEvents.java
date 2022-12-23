package com.iab.omid.library.ironsrc.adsession.media;

import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.C4708a;
import com.iab.omid.library.ironsrc.p108b.C4717f;
import com.iab.omid.library.ironsrc.p110d.C4725b;
import com.iab.omid.library.ironsrc.p110d.C4729e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

public final class MediaEvents {
    private final C4708a adSession;

    private MediaEvents(C4708a aVar) {
        this.adSession = aVar;
    }

    private void confirmValidDuration(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Invalid Media duration");
        }
    }

    private void confirmValidVolume(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
    }

    public static MediaEvents createMediaEvents(AdSession adSession2) {
        C4708a aVar = (C4708a) adSession2;
        C4729e.m10268a((Object) adSession2, "AdSession is null");
        C4729e.m10276g(aVar);
        C4729e.m10267a(aVar);
        C4729e.m10271b(aVar);
        C4729e.m10274e(aVar);
        MediaEvents mediaEvents = new MediaEvents(aVar);
        aVar.getAdSessionStatePublisher().mo39175a(mediaEvents);
        return mediaEvents;
    }

    public final void adUserInteraction(InteractionType interactionType) {
        C4729e.m10268a((Object) interactionType, "InteractionType is null");
        C4729e.m10272c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4725b.m10252a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().mo39178a("adUserInteraction", jSONObject);
    }

    public final void bufferFinish() {
        C4729e.m10272c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo39176a("bufferFinish");
    }

    public final void bufferStart() {
        C4729e.m10272c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo39176a(TJAdUnitConstants.String.VIDEO_BUFFER_START);
    }

    public final void complete() {
        C4729e.m10272c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo39176a("complete");
    }

    public final void firstQuartile() {
        C4729e.m10272c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo39176a(TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE);
    }

    public final void midpoint() {
        C4729e.m10272c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo39176a("midpoint");
    }

    public final void pause() {
        C4729e.m10272c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo39176a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public final void playerStateChange(PlayerState playerState) {
        C4729e.m10268a((Object) playerState, "PlayerState is null");
        C4729e.m10272c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4725b.m10252a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().mo39178a("playerStateChange", jSONObject);
    }

    public final void resume() {
        C4729e.m10272c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo39176a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public final void skipped() {
        C4729e.m10272c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo39176a(TJAdUnitConstants.String.VIDEO_SKIPPED);
    }

    public final void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C4729e.m10272c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4725b.m10252a(jSONObject, "duration", Float.valueOf(f));
        C4725b.m10252a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C4725b.m10252a(jSONObject, "deviceVolume", Float.valueOf(C4717f.m10217a().mo39160d()));
        this.adSession.getAdSessionStatePublisher().mo39178a("start", jSONObject);
    }

    public final void thirdQuartile() {
        C4729e.m10272c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo39176a(TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE);
    }

    public final void volumeChange(float f) {
        confirmValidVolume(f);
        C4729e.m10272c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4725b.m10252a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C4725b.m10252a(jSONObject, "deviceVolume", Float.valueOf(C4717f.m10217a().mo39160d()));
        this.adSession.getAdSessionStatePublisher().mo39178a("volumeChange", jSONObject);
    }
}
