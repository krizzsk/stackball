package com.iab.omid.library.corpmailru.adsession.media;

import com.iab.omid.library.corpmailru.adsession.AdSession;
import com.iab.omid.library.corpmailru.adsession.C4610a;
import com.iab.omid.library.corpmailru.p096b.C4619f;
import com.iab.omid.library.corpmailru.p098d.C4627b;
import com.iab.omid.library.corpmailru.p098d.C4631e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

public final class MediaEvents {
    private final C4610a adSession;

    private MediaEvents(C4610a aVar) {
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
        C4610a aVar = (C4610a) adSession2;
        C4631e.m9837a((Object) adSession2, "AdSession is null");
        C4631e.m9845g(aVar);
        C4631e.m9836a(aVar);
        C4631e.m9840b(aVar);
        C4631e.m9843e(aVar);
        MediaEvents mediaEvents = new MediaEvents(aVar);
        aVar.getAdSessionStatePublisher().mo38823a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) {
        C4631e.m9837a((Object) interactionType, "InteractionType is null");
        C4631e.m9841c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4627b.m9821a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().mo38826a("adUserInteraction", jSONObject);
    }

    public void bufferFinish() {
        C4631e.m9841c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo38824a("bufferFinish");
    }

    public void bufferStart() {
        C4631e.m9841c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo38824a(TJAdUnitConstants.String.VIDEO_BUFFER_START);
    }

    public void complete() {
        C4631e.m9841c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo38824a("complete");
    }

    public void firstQuartile() {
        C4631e.m9841c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo38824a(TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE);
    }

    public void midpoint() {
        C4631e.m9841c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo38824a("midpoint");
    }

    public void pause() {
        C4631e.m9841c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo38824a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public void playerStateChange(PlayerState playerState) {
        C4631e.m9837a((Object) playerState, "PlayerState is null");
        C4631e.m9841c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4627b.m9821a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().mo38826a("playerStateChange", jSONObject);
    }

    public void resume() {
        C4631e.m9841c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo38824a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public void skipped() {
        C4631e.m9841c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo38824a(TJAdUnitConstants.String.VIDEO_SKIPPED);
    }

    public void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C4631e.m9841c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4627b.m9821a(jSONObject, "duration", Float.valueOf(f));
        C4627b.m9821a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C4627b.m9821a(jSONObject, "deviceVolume", Float.valueOf(C4619f.m9785a().mo38808d()));
        this.adSession.getAdSessionStatePublisher().mo38826a("start", jSONObject);
    }

    public void thirdQuartile() {
        C4631e.m9841c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo38824a(TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE);
    }

    public void volumeChange(float f) {
        confirmValidVolume(f);
        C4631e.m9841c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4627b.m9821a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C4627b.m9821a(jSONObject, "deviceVolume", Float.valueOf(C4619f.m9785a().mo38808d()));
        this.adSession.getAdSessionStatePublisher().mo38826a("volumeChange", jSONObject);
    }
}
