package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import java.util.concurrent.TimeUnit;

public class kd1 {

    /* renamed from: a */
    private static final long f36101a = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: a */
    public void mo68200a(TextView textView, long j, long j2) {
        textView.setText(String.valueOf((int) Math.ceil((double) (((float) (j - j2)) / ((float) f36101a)))));
    }
}
