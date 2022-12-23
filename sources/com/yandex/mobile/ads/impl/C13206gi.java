package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import java.util.Locale;

/* renamed from: com.yandex.mobile.ads.impl.gi */
public class C13206gi {

    /* renamed from: a */
    private final n11 f34007a = new n11();

    /* renamed from: a */
    public void mo67309a(TextView textView, long j, long j2) {
        this.f34007a.getClass();
        long ceil = (long) Math.ceil((double) (((float) (j - j2)) / 1000.0f));
        textView.setText(String.format(Locale.US, "%02d:%02d", new Object[]{Long.valueOf(ceil / 60), Long.valueOf(ceil % 60)}));
    }
}
