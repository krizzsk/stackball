package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.AdPodInfo;
import com.yandex.mobile.ads.video.playback.model.MediaFile;
import com.yandex.mobile.ads.video.playback.model.SkipInfo;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import org.json.JSONObject;

public class mg0 implements VideoAd {

    /* renamed from: a */
    private final MediaFile f37368a;

    /* renamed from: b */
    private final AdPodInfo f37369b;

    /* renamed from: c */
    private final SkipInfo f37370c;

    /* renamed from: d */
    private final String f37371d;

    /* renamed from: e */
    private final JSONObject f37372e;

    public mg0(MediaFile mediaFile, AdPodInfo adPodInfo, SkipInfo skipInfo, String str, JSONObject jSONObject) {
        this.f37370c = skipInfo;
        this.f37368a = mediaFile;
        this.f37369b = adPodInfo;
        this.f37371d = str;
        this.f37372e = jSONObject;
    }

    /* renamed from: a */
    public JSONObject mo68683a() {
        return this.f37372e;
    }

    public AdPodInfo getAdPodInfo() {
        return this.f37369b;
    }

    public String getInfo() {
        return this.f37371d;
    }

    public MediaFile getMediaFile() {
        return this.f37368a;
    }

    public SkipInfo getSkipInfo() {
        return this.f37370c;
    }
}
