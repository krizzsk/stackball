package com.iab.omid.library.vungle.adsession.media;

import com.iab.omid.library.vungle.adsession.AdSession;
import com.iab.omid.library.vungle.adsession.C4857a;
import com.iab.omid.library.vungle.p126b.C4866f;
import com.iab.omid.library.vungle.p128d.C4874b;
import com.iab.omid.library.vungle.p128d.C4878e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

public final class MediaEvents {
    private final C4857a adSession;

    private MediaEvents(C4857a aVar) {
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
        C4857a aVar = (C4857a) adSession2;
        C4878e.m10925a((Object) adSession2, "AdSession is null");
        C4878e.m10933g(aVar);
        C4878e.m10924a(aVar);
        C4878e.m10928b(aVar);
        C4878e.m10931e(aVar);
        MediaEvents mediaEvents = new MediaEvents(aVar);
        aVar.getAdSessionStatePublisher().mo39745a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) {
        C4878e.m10925a((Object) interactionType, "InteractionType is null");
        C4878e.m10929c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4874b.m10909a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().mo39748a("adUserInteraction", jSONObject);
    }

    public void bufferFinish() {
        C4878e.m10929c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo39746a("bufferFinish");
    }

    public void bufferStart() {
        C4878e.m10929c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo39746a(TJAdUnitConstants.String.VIDEO_BUFFER_START);
    }

    public void complete() {
        C4878e.m10929c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo39746a("complete");
    }

    public void firstQuartile() {
        C4878e.m10929c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo39746a(TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE);
    }

    public void midpoint() {
        C4878e.m10929c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo39746a("midpoint");
    }

    public void pause() {
        C4878e.m10929c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo39746a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public void playerStateChange(PlayerState playerState) {
        C4878e.m10925a((Object) playerState, "PlayerState is null");
        C4878e.m10929c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4874b.m10909a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().mo39748a("playerStateChange", jSONObject);
    }

    public void resume() {
        C4878e.m10929c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo39746a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public void skipped() {
        C4878e.m10929c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo39746a(TJAdUnitConstants.String.VIDEO_SKIPPED);
    }

    public void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C4878e.m10929c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4874b.m10909a(jSONObject, "duration", Float.valueOf(f));
        C4874b.m10909a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C4874b.m10909a(jSONObject, "deviceVolume", Float.valueOf(C4866f.m10873a().mo39730d()));
        this.adSession.getAdSessionStatePublisher().mo39748a("start", jSONObject);
    }

    public void thirdQuartile() {
        C4878e.m10929c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo39746a(TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE);
    }

    public void volumeChange(float f) {
        confirmValidVolume(f);
        C4878e.m10929c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4874b.m10909a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C4874b.m10909a(jSONObject, "deviceVolume", Float.valueOf(C4866f.m10873a().mo39730d()));
        this.adSession.getAdSessionStatePublisher().mo39748a("volumeChange", jSONObject);
    }
}
