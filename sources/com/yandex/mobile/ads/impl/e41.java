package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.Button;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.C12066R;

class e41 {

    /* renamed from: a */
    private final C14393ql f32903a = new C14393ql();

    e41() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Button mo66763a(Context context) {
        Button button = new Button(context);
        button.setBackground(context.getResources().getDrawable(C12066R.C12067drawable.yandex_ads_video_ic_replay));
        int a = this.f32903a.mo69618a(context, 90.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a, a);
        layoutParams.gravity = 17;
        button.setLayoutParams(layoutParams);
        return button;
    }
}
