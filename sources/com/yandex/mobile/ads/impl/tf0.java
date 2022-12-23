package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

public class tf0 implements View.OnClickListener {

    /* renamed from: a */
    private final ln1 f40303a;

    /* renamed from: b */
    private final ck1<VideoAd> f40304b;

    /* renamed from: c */
    private final oj1 f40305c;

    /* renamed from: d */
    private final C14340q1 f40306d;

    public tf0(Context context, og0 og0, ck1<VideoAd> ck1, ln1 ln1, oj1 oj1) {
        this.f40304b = ck1;
        this.f40303a = ln1;
        this.f40305c = oj1;
        this.f40306d = new xf0(context, og0, ck1).mo70895a();
    }

    public void onClick(View view) {
        this.f40303a.mo65769k();
        this.f40305c.mo69174a(this.f40304b.mo66323c());
        String b = this.f40304b.mo66321a().mo67784b();
        if (!TextUtils.isEmpty(b)) {
            this.f40306d.mo66065a(view.getContext(), b);
        }
    }
}
