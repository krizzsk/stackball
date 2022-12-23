package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;
import com.yandex.mobile.ads.video.playback.model.MediaFile;

public class eg0 implements MediaFile {

    /* renamed from: a */
    private final InstreamAdBreakPosition f32969a;

    /* renamed from: b */
    private final String f32970b;

    /* renamed from: c */
    private final int f32971c;

    /* renamed from: d */
    private final int f32972d;

    public eg0(InstreamAdBreakPosition instreamAdBreakPosition, String str, int i, int i2) {
        this.f32969a = instreamAdBreakPosition;
        this.f32970b = str;
        this.f32971c = i;
        this.f32972d = i2;
    }

    /* renamed from: a */
    public InstreamAdBreakPosition mo66823a() {
        return this.f32969a;
    }

    public int getAdHeight() {
        return this.f32972d;
    }

    public int getAdWidth() {
        return this.f32971c;
    }

    public String getUrl() {
        return this.f32970b;
    }
}
