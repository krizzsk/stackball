package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.yandex.mobile.ads.C12066R;

public class l11 {

    /* renamed from: a */
    private final C14393ql f36495a = new C14393ql();

    l11() {
    }

    /* renamed from: a */
    public ProgressBar mo68308a(Context context) {
        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setIndeterminateDrawable(context.getResources().getDrawable(C12066R.C12067drawable.yandex_ads_video_progress_bar_background));
        int a = this.f36495a.mo69618a(context, 45.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a, a);
        layoutParams.gravity = 17;
        progressBar.setLayoutParams(layoutParams);
        return progressBar;
    }
}
