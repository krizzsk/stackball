package com.yandex.mobile.ads.instream;

import com.yandex.mobile.ads.impl.d01;
import com.yandex.mobile.ads.impl.fn1;
import com.yandex.mobile.ads.impl.sm1;
import com.yandex.mobile.ads.instream.player.content.VideoPlayer;
import com.yandex.mobile.ads.instream.player.content.VideoPlayerListener;

/* renamed from: com.yandex.mobile.ads.instream.e */
public class C15419e implements d01 {

    /* renamed from: a */
    private final VideoPlayer f43560a;

    /* renamed from: b */
    private final fn1 f43561b = new fn1();

    /* renamed from: c */
    private final sm1 f43562c = new sm1();

    C15419e(VideoPlayer videoPlayer) {
        this.f43560a = videoPlayer;
    }

    /* renamed from: a */
    public fn1 mo71340a() {
        return this.f43561b;
    }

    /* renamed from: b */
    public long mo71342b() {
        return this.f43560a.getVideoDuration();
    }

    /* renamed from: c */
    public long mo71343c() {
        return this.f43560a.getVideoPosition();
    }

    /* renamed from: d */
    public void mo71344d() {
        this.f43560a.pauseVideo();
    }

    /* renamed from: e */
    public void mo71345e() {
        this.f43560a.prepareVideo();
    }

    /* renamed from: f */
    public void mo71346f() {
        this.f43560a.resumeVideo();
    }

    /* renamed from: g */
    public void mo71347g() {
        this.f43560a.setVideoPlayerListener(this.f43562c);
    }

    public float getVolume() {
        return this.f43560a.getVolume();
    }

    /* renamed from: h */
    public void mo71348h() {
        this.f43560a.setVideoPlayerListener((VideoPlayerListener) null);
        this.f43562c.mo70028b();
    }

    /* renamed from: a */
    public void mo71341a(VideoPlayerListener videoPlayerListener) {
        this.f43562c.mo70027a(videoPlayerListener);
    }
}
