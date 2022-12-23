package com.yandex.mobile.ads.instream.exoplayer;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.source.ads.AdsLoader;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import com.google.android.exoplayer2.ui.AdViewProvider;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.yandex.mobile.ads.impl.C14653t5;
import com.yandex.mobile.ads.impl.bk1;
import com.yandex.mobile.ads.impl.qk1;
import com.yandex.mobile.ads.impl.wf0;
import com.yandex.mobile.ads.instream.InstreamAdRequestConfiguration;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class YandexAdsLoader implements AdsLoader {
    public static final String AD_TAG_URI = "yandex://ad_tag";

    /* renamed from: a */
    private final wf0 f43563a;

    public YandexAdsLoader(Context context, InstreamAdRequestConfiguration instreamAdRequestConfiguration) {
        this.f43563a = new C14653t5(context, instreamAdRequestConfiguration).mo70128a();
    }

    public void handlePrepareComplete(AdsMediaSource adsMediaSource, int i, int i2) {
        this.f43563a.mo70689a(i, i2);
    }

    public void handlePrepareError(AdsMediaSource adsMediaSource, int i, int i2, IOException iOException) {
        this.f43563a.mo70690a(i, i2, iOException);
    }

    public void release() {
        this.f43563a.mo70688a();
    }

    public void requestAds(ViewGroup viewGroup) {
        this.f43563a.mo70691a(viewGroup, (List<bk1>) Collections.emptyList());
    }

    public void setPlayer(Player player) {
        this.f43563a.mo70692a(player);
    }

    public void setSupportedContentTypes(int... iArr) {
    }

    public void setVideoAdPlaybackListener(qk1 qk1) {
        this.f43563a.mo70694a(qk1);
    }

    public void start(AdsMediaSource adsMediaSource, DataSpec dataSpec, Object obj, AdViewProvider adViewProvider, AdsLoader.EventListener eventListener) {
        if (eventListener != null) {
            this.f43563a.mo70693a(eventListener, adViewProvider, obj);
        }
    }

    public void stop(AdsMediaSource adsMediaSource, AdsLoader.EventListener eventListener) {
        this.f43563a.mo70695b();
    }
}
