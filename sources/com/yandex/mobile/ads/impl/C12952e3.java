package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.source.ads.AdsLoader;

/* renamed from: com.yandex.mobile.ads.impl.e3 */
public class C12952e3 {

    /* renamed from: a */
    private AdPlaybackState f32890a = AdPlaybackState.NONE;

    /* renamed from: b */
    private AdsLoader.EventListener f32891b;

    /* renamed from: a */
    public void mo66748a(AdsLoader.EventListener eventListener) {
        this.f32891b = eventListener;
    }

    /* renamed from: b */
    public void mo66749b() {
        this.f32891b = null;
        this.f32890a = AdPlaybackState.NONE;
    }

    /* renamed from: a */
    public AdPlaybackState mo66746a() {
        return this.f32890a;
    }

    /* renamed from: a */
    public void mo66747a(AdPlaybackState adPlaybackState) {
        this.f32890a = adPlaybackState;
        AdsLoader.EventListener eventListener = this.f32891b;
        if (eventListener != null) {
            eventListener.onAdPlaybackState(adPlaybackState);
        }
    }
}
