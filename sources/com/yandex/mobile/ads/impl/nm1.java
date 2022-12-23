package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.ProgressBar;
import androidx.core.view.ViewCompat;

public class nm1 {

    /* renamed from: a */
    private final l11 f37863a = new l11();

    nm1() {
    }

    /* renamed from: a */
    public mm1 mo69065a(Context context) {
        ProgressBar a = this.f37863a.mo68308a(context);
        a.setVisibility(8);
        mm1 mm1 = new mm1(context, a);
        mm1.addView(a);
        mm1.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        return mm1;
    }
}
