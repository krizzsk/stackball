package com.yandex.mobile.ads.impl;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

public final class tl0 {

    /* renamed from: a */
    private final ts1 f40351a;

    private tl0(ts1 ts1) {
        this.f40351a = ts1;
    }

    /* renamed from: a */
    private void m42367a(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
    }

    /* renamed from: a */
    public void mo70194a(ih0 ih0) {
        wt1.m43869b(this.f40351a);
        JSONObject jSONObject = new JSONObject();
        ft1.m36312a(jSONObject, "interactionType", ih0);
        vt1.m43343a().mo70583a(this.f40351a.mo70228i().mo69867e(), "adUserInteraction", jSONObject);
    }

    /* renamed from: b */
    public void mo70195b() {
        wt1.m43869b(this.f40351a);
        vt1.m43343a().mo70583a(this.f40351a.mo70228i().mo69867e(), TJAdUnitConstants.String.VIDEO_BUFFER_START, (JSONObject) null);
    }

    /* renamed from: c */
    public void mo70197c() {
        wt1.m43869b(this.f40351a);
        vt1.m43343a().mo70583a(this.f40351a.mo70228i().mo69867e(), "complete", (JSONObject) null);
    }

    /* renamed from: d */
    public void mo70198d() {
        wt1.m43869b(this.f40351a);
        vt1.m43343a().mo70583a(this.f40351a.mo70228i().mo69867e(), TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE, (JSONObject) null);
    }

    /* renamed from: e */
    public void mo70199e() {
        wt1.m43869b(this.f40351a);
        vt1.m43343a().mo70583a(this.f40351a.mo70228i().mo69867e(), "midpoint", (JSONObject) null);
    }

    /* renamed from: f */
    public void mo70200f() {
        wt1.m43869b(this.f40351a);
        vt1.m43343a().mo70583a(this.f40351a.mo70228i().mo69867e(), CampaignEx.JSON_NATIVE_VIDEO_PAUSE, (JSONObject) null);
    }

    /* renamed from: g */
    public void mo70201g() {
        wt1.m43869b(this.f40351a);
        vt1.m43343a().mo70583a(this.f40351a.mo70228i().mo69867e(), CampaignEx.JSON_NATIVE_VIDEO_RESUME, (JSONObject) null);
    }

    /* renamed from: h */
    public void mo70202h() {
        wt1.m43869b(this.f40351a);
        vt1.m43343a().mo70583a(this.f40351a.mo70228i().mo69867e(), TJAdUnitConstants.String.VIDEO_SKIPPED, (JSONObject) null);
    }

    /* renamed from: i */
    public void mo70203i() {
        wt1.m43869b(this.f40351a);
        vt1.m43343a().mo70583a(this.f40351a.mo70228i().mo69867e(), TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo70192a() {
        wt1.m43869b(this.f40351a);
        vt1.m43343a().mo70583a(this.f40351a.mo70228i().mo69867e(), "bufferFinish", (JSONObject) null);
    }

    /* renamed from: b */
    public void mo70196b(float f) {
        m42367a(f);
        wt1.m43869b(this.f40351a);
        JSONObject jSONObject = new JSONObject();
        ft1.m36312a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        ft1.m36312a(jSONObject, "deviceVolume", Float.valueOf(bu1.m34401a().mo66126d()));
        vt1.m43343a().mo70583a(this.f40351a.mo70228i().mo69867e(), "volumeChange", jSONObject);
    }

    /* renamed from: a */
    public static tl0 m42366a(C14165o4 o4Var) {
        ts1 ts1 = (ts1) o4Var;
        if (!ts1.mo70231l()) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        } else if (ts1.mo70226g()) {
            throw new IllegalStateException("AdSession is started");
        } else if (ts1.mo70229j()) {
            throw new IllegalStateException("AdSession is finished");
        } else if (ts1.mo70228i().mo69866d() == null) {
            tl0 tl0 = new tl0(ts1);
            ts1.mo70228i().mo69859a(tl0);
            return tl0;
        } else {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
    }

    /* renamed from: a */
    public void mo70193a(float f, float f2) {
        if (f > 0.0f) {
            m42367a(f2);
            wt1.m43869b(this.f40351a);
            JSONObject jSONObject = new JSONObject();
            ft1.m36312a(jSONObject, "duration", Float.valueOf(f));
            ft1.m36312a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
            ft1.m36312a(jSONObject, "deviceVolume", Float.valueOf(bu1.m34401a().mo66126d()));
            vt1.m43343a().mo70583a(this.f40351a.mo70228i().mo69867e(), "start", jSONObject);
            return;
        }
        throw new IllegalArgumentException("Invalid Media duration");
    }
}
