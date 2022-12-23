package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import com.tapjoy.TapjoyConstants;

public final class h11 {
    /* renamed from: a */
    public static final long m36764a(long j) {
        long j2;
        long j3;
        long j4;
        if (j < 0) {
            return 0;
        }
        long j5 = 100;
        if (j < 100) {
            j3 = 20;
            j4 = j / 20;
        } else {
            if (j < 1000) {
                j2 = j / 100;
            } else {
                j5 = 2000;
                if (j < 2000) {
                    j3 = 200;
                    j4 = j / 200;
                } else if (j < 5000) {
                    j3 = 500;
                    j4 = j / 500;
                } else if (j < TapjoyConstants.TIMER_INCREMENT) {
                    return (j / 1000) * 1000;
                } else {
                    if (j < SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US) {
                        j2 = j / 2000;
                    } else if (j < 50000) {
                        return (j / 5000) * 5000;
                    } else {
                        return 50000;
                    }
                }
            }
            return j2 * j5;
        }
        return j3 * j4;
    }
}
