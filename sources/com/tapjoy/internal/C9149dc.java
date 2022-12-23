package com.tapjoy.internal;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

/* renamed from: com.tapjoy.internal.dc */
public final class C9149dc {

    /* renamed from: a */
    private final C9145cz f22497a;

    private C9149dc(C9145cz czVar) {
        this.f22497a = czVar;
    }

    /* renamed from: b */
    private static void m24494b(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Invalid Video volume");
        }
    }

    /* renamed from: a */
    public static C9149dc m24493a(C9138cs csVar) {
        C9145cz czVar = (C9145cz) csVar;
        C9166do.m24543a((Object) csVar, "AdSession is null");
        if (!(C9142cw.NATIVE == czVar.f22478a.f22456b)) {
            throw new IllegalStateException("Cannot create VideoEvents for JavaScript AdSession");
        } else if (!czVar.f22481d) {
            C9166do.m24542a(czVar);
            if (czVar.f22480c.f22531c == null) {
                C9149dc dcVar = new C9149dc(czVar);
                czVar.f22480c.f22531c = dcVar;
                return dcVar;
            }
            throw new IllegalStateException("VideoEvents already exists for AdSession");
        } else {
            throw new IllegalStateException("AdSession is started");
        }
    }

    /* renamed from: a */
    public final void mo57938a(C9148db dbVar) {
        C9166do.m24543a((Object) dbVar, "VastProperties is null");
        C9166do.m24542a(this.f22497a);
        this.f22497a.f22480c.mo57964a("loaded", dbVar.mo57934a());
    }

    /* renamed from: a */
    public final void mo57937a(float f, float f2) {
        if (f > 0.0f) {
            m24494b(f2);
            C9166do.m24545b(this.f22497a);
            JSONObject jSONObject = new JSONObject();
            C9163dm.m24535a(jSONObject, "duration", Float.valueOf(f));
            C9163dm.m24535a(jSONObject, "videoPlayerVolume", Float.valueOf(f2));
            C9163dm.m24535a(jSONObject, "deviceVolume", Float.valueOf(C9157dh.m24521a().f22515a));
            this.f22497a.f22480c.mo57964a("start", jSONObject);
            return;
        }
        throw new IllegalArgumentException("Invalid Video duration");
    }

    /* renamed from: a */
    public final void mo57935a() {
        C9166do.m24545b(this.f22497a);
        this.f22497a.f22480c.mo57963a(TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE);
    }

    /* renamed from: b */
    public final void mo57939b() {
        C9166do.m24545b(this.f22497a);
        this.f22497a.f22480c.mo57963a("midpoint");
    }

    /* renamed from: c */
    public final void mo57940c() {
        C9166do.m24545b(this.f22497a);
        this.f22497a.f22480c.mo57963a(TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE);
    }

    /* renamed from: d */
    public final void mo57941d() {
        C9166do.m24545b(this.f22497a);
        this.f22497a.f22480c.mo57963a("complete");
    }

    /* renamed from: e */
    public final void mo57942e() {
        C9166do.m24545b(this.f22497a);
        this.f22497a.f22480c.mo57963a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    /* renamed from: f */
    public final void mo57943f() {
        C9166do.m24545b(this.f22497a);
        this.f22497a.f22480c.mo57963a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    /* renamed from: g */
    public final void mo57944g() {
        C9166do.m24545b(this.f22497a);
        this.f22497a.f22480c.mo57963a(TJAdUnitConstants.String.VIDEO_BUFFER_START);
    }

    /* renamed from: h */
    public final void mo57945h() {
        C9166do.m24545b(this.f22497a);
        this.f22497a.f22480c.mo57963a("bufferFinish");
    }

    /* renamed from: i */
    public final void mo57946i() {
        C9166do.m24545b(this.f22497a);
        this.f22497a.f22480c.mo57963a(TJAdUnitConstants.String.VIDEO_SKIPPED);
    }

    /* renamed from: a */
    public final void mo57936a(float f) {
        m24494b(f);
        C9166do.m24545b(this.f22497a);
        JSONObject jSONObject = new JSONObject();
        C9163dm.m24535a(jSONObject, "videoPlayerVolume", Float.valueOf(f));
        C9163dm.m24535a(jSONObject, "deviceVolume", Float.valueOf(C9157dh.m24521a().f22515a));
        this.f22497a.f22480c.mo57964a("volumeChange", jSONObject);
    }
}
