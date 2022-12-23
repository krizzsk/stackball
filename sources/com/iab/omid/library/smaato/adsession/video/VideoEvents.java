package com.iab.omid.library.smaato.adsession.video;

import com.iab.omid.library.smaato.adsession.AdSession;
import com.iab.omid.library.smaato.adsession.C4809a;
import com.iab.omid.library.smaato.p120b.C4818e;
import com.iab.omid.library.smaato.p122d.C4825b;
import com.iab.omid.library.smaato.p122d.C4829e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

public final class VideoEvents {
    private final C4809a adSession;

    private VideoEvents(C4809a aVar) {
        this.adSession = aVar;
    }

    private void confirmValidDuration(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Invalid Video duration");
        }
    }

    private void confirmValidVolume(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Invalid Video volume");
        }
    }

    public static VideoEvents createVideoEvents(AdSession adSession2) {
        C4809a aVar = (C4809a) adSession2;
        C4829e.m10712a((Object) adSession2, "AdSession is null");
        C4829e.m10720g(aVar);
        C4829e.m10711a(aVar);
        C4829e.m10715b(aVar);
        C4829e.m10718e(aVar);
        VideoEvents videoEvents = new VideoEvents(aVar);
        aVar.getAdSessionStatePublisher().mo39559a(videoEvents);
        return videoEvents;
    }

    public final void adUserInteraction(InteractionType interactionType) {
        C4829e.m10712a((Object) interactionType, "InteractionType is null");
        C4829e.m10716c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4825b.m10696a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().mo39562a("adUserInteraction", jSONObject);
    }

    public final void bufferFinish() {
        C4829e.m10716c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo39560a("bufferFinish");
    }

    public final void bufferStart() {
        C4829e.m10716c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo39560a(TJAdUnitConstants.String.VIDEO_BUFFER_START);
    }

    public final void complete() {
        C4829e.m10716c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo39560a("complete");
    }

    public final void firstQuartile() {
        C4829e.m10716c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo39560a(TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE);
    }

    public final void loaded(VastProperties vastProperties) {
        C4829e.m10712a((Object) vastProperties, "VastProperties is null");
        C4829e.m10715b(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo39562a("loaded", vastProperties.toJSON());
    }

    public final void midpoint() {
        C4829e.m10716c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo39560a("midpoint");
    }

    public final void pause() {
        C4829e.m10716c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo39560a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public final void playerStateChange(PlayerState playerState) {
        C4829e.m10712a((Object) playerState, "PlayerState is null");
        C4829e.m10716c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4825b.m10696a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().mo39562a("playerStateChange", jSONObject);
    }

    public final void resume() {
        C4829e.m10716c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo39560a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public final void skipped() {
        C4829e.m10716c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo39560a(TJAdUnitConstants.String.VIDEO_SKIPPED);
    }

    public final void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C4829e.m10716c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4825b.m10696a(jSONObject, "duration", Float.valueOf(f));
        C4825b.m10696a(jSONObject, "videoPlayerVolume", Float.valueOf(f2));
        C4825b.m10696a(jSONObject, "deviceVolume", Float.valueOf(C4818e.m10668a().mo39546d()));
        this.adSession.getAdSessionStatePublisher().mo39562a("start", jSONObject);
    }

    public final void thirdQuartile() {
        C4829e.m10716c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo39560a(TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE);
    }

    public final void volumeChange(float f) {
        confirmValidVolume(f);
        C4829e.m10716c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4825b.m10696a(jSONObject, "videoPlayerVolume", Float.valueOf(f));
        C4825b.m10696a(jSONObject, "deviceVolume", Float.valueOf(C4818e.m10668a().mo39546d()));
        this.adSession.getAdSessionStatePublisher().mo39562a("volumeChange", jSONObject);
    }
}
