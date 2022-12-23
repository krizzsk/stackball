package com.yandex.mobile.ads.impl;

import android.widget.ProgressBar;

/* renamed from: com.yandex.mobile.ads.impl.w7 */
public class C15034w7 {
    /* renamed from: a */
    public void mo70655a(ProgressBar progressBar, long j, long j2, boolean z) {
        progressBar.clearAnimation();
        if (j > 0) {
            int i = (int) j;
            progressBar.setMax(i);
            if (z && j2 == 0) {
                progressBar.setProgress(i);
            }
            long progress = (long) progressBar.getProgress();
            if (z) {
                j2 = j - j2;
            }
            i11 i11 = new i11(progressBar, (int) progress, (int) j2);
            i11.setDuration(200);
            progressBar.startAnimation(i11);
        }
    }
}
