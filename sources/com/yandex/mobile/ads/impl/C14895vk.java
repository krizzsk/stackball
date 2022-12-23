package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.impl.qj1;
import com.yandex.mobile.ads.instream.view.InstreamMuteView;
import com.yandex.mobile.ads.video.playback.view.VideoAdControlsContainer;

/* renamed from: com.yandex.mobile.ads.impl.vk */
public class C14895vk {

    /* renamed from: a */
    private final r61<VideoAdControlsContainer> f41309a = new r61<>();

    /* renamed from: a */
    public qj1 mo70500a(Context context, ViewGroup viewGroup) {
        VideoAdControlsContainer a = this.f41309a.mo69698a(context, VideoAdControlsContainer.class, C12066R.layout.yandex_ads_internal_instream_controls_skin, viewGroup);
        if (a == null) {
            return null;
        }
        View findViewById = a.findViewById(C12066R.C12068id.instream_call_to_action);
        return new qj1.C14389b(a).mo69612a((ImageView) a.findViewById(C12066R.C12068id.instream_advertiser)).mo69611a(findViewById).mo69615a((iq0) (InstreamMuteView) a.findViewById(C12066R.C12068id.instream_mute)).mo69613a((ProgressBar) a.findViewById(C12066R.C12068id.instream_progress_display_view)).mo69617b(a.findViewById(C12066R.C12068id.instream_skip)).mo69616a();
    }
}
