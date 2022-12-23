package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.instream.InstreamAdBinder;
import com.yandex.mobile.ads.instream.player.content.VideoPlayer;
import com.yandex.mobile.ads.instream.player.p267ad.InstreamAdPlayer;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.fc */
public class C13042fc {

    /* renamed from: a */
    private final Context f33293a;

    /* renamed from: b */
    private final InstreamAdPlayer f33294b;

    /* renamed from: c */
    private final VideoPlayer f33295c;

    public C13042fc(Context context, InstreamAdPlayer instreamAdPlayer, VideoPlayer videoPlayer) {
        this.f33293a = context.getApplicationContext();
        this.f33294b = instreamAdPlayer;
        this.f33295c = videoPlayer;
    }

    /* renamed from: a */
    public C12965ec mo66951a(ViewGroup viewGroup, List<bk1> list, InstreamAd instreamAd) {
        return new C12965ec(viewGroup, list, new InstreamAdBinder(this.f33293a, instreamAd, this.f33294b, this.f33295c));
    }
}
