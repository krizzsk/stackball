package com.amazon.device.ads;

import android.graphics.Rect;

public interface ExtendedAdListener extends AdListener {
    void onAdExpired(C0898Ad ad);

    void onAdResized(C0898Ad ad, Rect rect);
}
