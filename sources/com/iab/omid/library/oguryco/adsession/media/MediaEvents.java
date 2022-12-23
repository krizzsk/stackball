package com.iab.omid.library.oguryco.adsession.media;

import com.iab.omid.library.oguryco.adsession.AdSession;
import com.iab.omid.library.oguryco.adsession.C4758a;
import com.iab.omid.library.oguryco.p114b.C4768f;
import com.iab.omid.library.oguryco.p116d.C4776b;
import com.iab.omid.library.oguryco.p116d.C4780e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

public final class MediaEvents {
    private final C4758a adSession;

    private MediaEvents(C4758a aVar) {
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
        C4758a aVar = (C4758a) adSession2;
        C4780e.m10497a((Object) adSession2, "AdSession is null");
        C4780e.m10505g(aVar);
        C4780e.m10496a(aVar);
        C4780e.m10500b(aVar);
        C4780e.m10503e(aVar);
        MediaEvents mediaEvents = new MediaEvents(aVar);
        aVar.getAdSessionStatePublisher().mo39389a(mediaEvents);
        return mediaEvents;
    }

    public final void adUserInteraction(InteractionType interactionType) {
        C4780e.m10497a((Object) interactionType, "InteractionType is null");
        C4780e.m10501c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4776b.m10481a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().mo39392a("adUserInteraction", jSONObject);
    }

    public final void bufferFinish() {
        C4780e.m10501c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo39390a("bufferFinish");
    }

    public final void bufferStart() {
        C4780e.m10501c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo39390a(TJAdUnitConstants.String.VIDEO_BUFFER_START);
    }

    public final void complete() {
        C4780e.m10501c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo39390a("complete");
    }

    public final void firstQuartile() {
        C4780e.m10501c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo39390a(TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE);
    }

    public final void loaded(VastProperties vastProperties) {
        C4780e.m10497a((Object) vastProperties, "VastProperties is null");
        C4780e.m10500b(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo39392a("loaded", vastProperties.mo39303a());
    }

    public final void midpoint() {
        C4780e.m10501c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo39390a("midpoint");
    }

    public final void pause() {
        C4780e.m10501c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo39390a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public final void playerStateChange(PlayerState playerState) {
        C4780e.m10497a((Object) playerState, "PlayerState is null");
        C4780e.m10501c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4776b.m10481a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().mo39392a("playerStateChange", jSONObject);
    }

    public final void resume() {
        C4780e.m10501c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo39390a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public final void skipped() {
        C4780e.m10501c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo39390a(TJAdUnitConstants.String.VIDEO_SKIPPED);
    }

    public final void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C4780e.m10501c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4776b.m10481a(jSONObject, "duration", Float.valueOf(f));
        C4776b.m10481a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C4776b.m10481a(jSONObject, "deviceVolume", Float.valueOf(C4768f.m10445a().mo39374d()));
        this.adSession.getAdSessionStatePublisher().mo39392a("start", jSONObject);
    }

    public final void thirdQuartile() {
        C4780e.m10501c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo39390a(TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE);
    }

    public final void volumeChange(float f) {
        confirmValidVolume(f);
        C4780e.m10501c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4776b.m10481a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C4776b.m10481a(jSONObject, "deviceVolume", Float.valueOf(C4768f.m10445a().mo39374d()));
        this.adSession.getAdSessionStatePublisher().mo39392a("volumeChange", jSONObject);
    }
}
