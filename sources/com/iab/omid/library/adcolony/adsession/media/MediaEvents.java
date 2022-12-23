package com.iab.omid.library.adcolony.adsession.media;

import com.iab.omid.library.adcolony.adsession.AdSession;
import com.iab.omid.library.adcolony.adsession.C4560a;
import com.iab.omid.library.adcolony.p090b.C4569f;
import com.iab.omid.library.adcolony.p092d.C4577b;
import com.iab.omid.library.adcolony.p092d.C4581e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

public final class MediaEvents {

    /* renamed from: a */
    private final C4560a f10270a;

    private MediaEvents(C4560a aVar) {
        this.f10270a = aVar;
    }

    /* renamed from: a */
    private void m9516a(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Invalid Media duration");
        }
    }

    /* renamed from: b */
    private void m9517b(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
    }

    public static MediaEvents createMediaEvents(AdSession adSession) {
        C4560a aVar = (C4560a) adSession;
        C4581e.m9613a((Object) adSession, "AdSession is null");
        C4581e.m9621g(aVar);
        C4581e.m9612a(aVar);
        C4581e.m9616b(aVar);
        C4581e.m9619e(aVar);
        MediaEvents mediaEvents = new MediaEvents(aVar);
        aVar.getAdSessionStatePublisher().mo38629a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) {
        C4581e.m9613a((Object) interactionType, "InteractionType is null");
        C4581e.m9617c(this.f10270a);
        JSONObject jSONObject = new JSONObject();
        C4577b.m9597a(jSONObject, "interactionType", interactionType);
        this.f10270a.getAdSessionStatePublisher().mo38632a("adUserInteraction", jSONObject);
    }

    public void bufferFinish() {
        C4581e.m9617c(this.f10270a);
        this.f10270a.getAdSessionStatePublisher().mo38630a("bufferFinish");
    }

    public void bufferStart() {
        C4581e.m9617c(this.f10270a);
        this.f10270a.getAdSessionStatePublisher().mo38630a(TJAdUnitConstants.String.VIDEO_BUFFER_START);
    }

    public void complete() {
        C4581e.m9617c(this.f10270a);
        this.f10270a.getAdSessionStatePublisher().mo38630a("complete");
    }

    public void firstQuartile() {
        C4581e.m9617c(this.f10270a);
        this.f10270a.getAdSessionStatePublisher().mo38630a(TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE);
    }

    public void midpoint() {
        C4581e.m9617c(this.f10270a);
        this.f10270a.getAdSessionStatePublisher().mo38630a("midpoint");
    }

    public void pause() {
        C4581e.m9617c(this.f10270a);
        this.f10270a.getAdSessionStatePublisher().mo38630a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public void playerStateChange(PlayerState playerState) {
        C4581e.m9613a((Object) playerState, "PlayerState is null");
        C4581e.m9617c(this.f10270a);
        JSONObject jSONObject = new JSONObject();
        C4577b.m9597a(jSONObject, "state", playerState);
        this.f10270a.getAdSessionStatePublisher().mo38632a("playerStateChange", jSONObject);
    }

    public void resume() {
        C4581e.m9617c(this.f10270a);
        this.f10270a.getAdSessionStatePublisher().mo38630a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public void skipped() {
        C4581e.m9617c(this.f10270a);
        this.f10270a.getAdSessionStatePublisher().mo38630a(TJAdUnitConstants.String.VIDEO_SKIPPED);
    }

    public void start(float f, float f2) {
        m9516a(f);
        m9517b(f2);
        C4581e.m9617c(this.f10270a);
        JSONObject jSONObject = new JSONObject();
        C4577b.m9597a(jSONObject, "duration", Float.valueOf(f));
        C4577b.m9597a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C4577b.m9597a(jSONObject, "deviceVolume", Float.valueOf(C4569f.m9562a().mo38614d()));
        this.f10270a.getAdSessionStatePublisher().mo38632a("start", jSONObject);
    }

    public void thirdQuartile() {
        C4581e.m9617c(this.f10270a);
        this.f10270a.getAdSessionStatePublisher().mo38630a(TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE);
    }

    public void volumeChange(float f) {
        m9517b(f);
        C4581e.m9617c(this.f10270a);
        JSONObject jSONObject = new JSONObject();
        C4577b.m9597a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C4577b.m9597a(jSONObject, "deviceVolume", Float.valueOf(C4569f.m9562a().mo38614d()));
        this.f10270a.getAdSessionStatePublisher().mo38632a("volumeChange", jSONObject);
    }
}
