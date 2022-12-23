package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* renamed from: com.yandex.mobile.ads.impl.cf */
public class C12731cf {

    /* renamed from: a */
    private final ck1<VideoAd> f31909a;

    /* renamed from: b */
    private final View.OnClickListener f31910b;

    public C12731cf(Context context, og0 og0, ck1<VideoAd> ck1, ln1 ln1, oj1 oj1) {
        this.f31909a = ck1;
        this.f31910b = new tf0(context, og0, ck1, ln1, oj1);
    }

    /* renamed from: a */
    public void mo66278a(View view) {
        if (!TextUtils.isEmpty(this.f31909a.mo66321a().mo67784b())) {
            view.setOnClickListener(this.f31910b);
        } else {
            view.setVisibility(8);
        }
    }
}
