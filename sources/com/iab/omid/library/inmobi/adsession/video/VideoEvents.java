package com.iab.omid.library.inmobi.adsession.video;

import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.C4660a;
import com.iab.omid.library.inmobi.p102b.C4669e;
import com.iab.omid.library.inmobi.p104d.C4676b;
import com.iab.omid.library.inmobi.p104d.C4680e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

public final class VideoEvents {
    private final C4660a adSession;

    private VideoEvents(C4660a aVar) {
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
        C4660a aVar = (C4660a) adSession2;
        C4680e.m10054a((Object) adSession2, "AdSession is null");
        C4680e.m10062g(aVar);
        C4680e.m10053a(aVar);
        C4680e.m10057b(aVar);
        C4680e.m10060e(aVar);
        VideoEvents videoEvents = new VideoEvents(aVar);
        aVar.getAdSessionStatePublisher().mo38994a(videoEvents);
        return videoEvents;
    }

    public final void adUserInteraction(InteractionType interactionType) {
        C4680e.m10054a((Object) interactionType, "InteractionType is null");
        C4680e.m10058c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4676b.m10037a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().mo38997a("adUserInteraction", jSONObject);
    }

    public final void bufferFinish() {
        C4680e.m10058c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo38995a("bufferFinish");
    }

    public final void bufferStart() {
        C4680e.m10058c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo38995a(TJAdUnitConstants.String.VIDEO_BUFFER_START);
    }

    public final void complete() {
        C4680e.m10058c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo38995a("complete");
    }

    public final void firstQuartile() {
        C4680e.m10058c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo38995a(TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE);
    }

    public final void loaded(VastProperties vastProperties) {
        C4680e.m10054a((Object) vastProperties, "VastProperties is null");
        C4680e.m10057b(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo38997a("loaded", vastProperties.toJSON());
    }

    public final void midpoint() {
        C4680e.m10058c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo38995a("midpoint");
    }

    public final void pause() {
        C4680e.m10058c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo38995a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public final void playerStateChange(PlayerState playerState) {
        C4680e.m10054a((Object) playerState, "PlayerState is null");
        C4680e.m10058c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4676b.m10037a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().mo38997a("playerStateChange", jSONObject);
    }

    public final void resume() {
        C4680e.m10058c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo38995a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public final void skipped() {
        C4680e.m10058c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo38995a(TJAdUnitConstants.String.VIDEO_SKIPPED);
    }

    public final void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C4680e.m10058c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4676b.m10037a(jSONObject, "duration", Float.valueOf(f));
        C4676b.m10037a(jSONObject, "videoPlayerVolume", Float.valueOf(f2));
        C4676b.m10037a(jSONObject, "deviceVolume", Float.valueOf(C4669e.m10008a().mo38980d()));
        this.adSession.getAdSessionStatePublisher().mo38997a("start", jSONObject);
    }

    public final void thirdQuartile() {
        C4680e.m10058c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo38995a(TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE);
    }

    public final void volumeChange(float f) {
        confirmValidVolume(f);
        C4680e.m10058c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4676b.m10037a(jSONObject, "videoPlayerVolume", Float.valueOf(f));
        C4676b.m10037a(jSONObject, "deviceVolume", Float.valueOf(C4669e.m10008a().mo38980d()));
        this.adSession.getAdSessionStatePublisher().mo38997a("volumeChange", jSONObject);
    }
}
