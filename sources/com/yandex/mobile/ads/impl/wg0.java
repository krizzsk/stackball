package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBinder;
import com.yandex.mobile.ads.instream.player.content.VideoPlayer;
import kotlin.jvm.internal.Intrinsics;

public final class wg0 {

    /* renamed from: a */
    private final InstreamAdBinder f42010a;

    /* renamed from: b */
    private final vg0 f42011b = vg0.f41288c.mo70489a();

    public wg0(InstreamAdBinder instreamAdBinder) {
        Intrinsics.checkNotNullParameter(instreamAdBinder, "instreamAdBinder");
        this.f42010a = instreamAdBinder;
    }

    /* renamed from: a */
    public final void mo70702a(VideoPlayer videoPlayer) {
        Intrinsics.checkNotNullParameter(videoPlayer, "player");
        InstreamAdBinder a = this.f42011b.mo70486a(videoPlayer);
        if (!Intrinsics.areEqual((Object) this.f42010a, (Object) a)) {
            if (a != null) {
                a.invalidateVideoPlayer();
            }
            this.f42011b.mo70487a(videoPlayer, this.f42010a);
        }
    }

    /* renamed from: b */
    public final void mo70703b(VideoPlayer videoPlayer) {
        Intrinsics.checkNotNullParameter(videoPlayer, "player");
        this.f42011b.mo70488b(videoPlayer);
    }
}
