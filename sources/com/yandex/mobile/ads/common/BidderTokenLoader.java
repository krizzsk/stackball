package com.yandex.mobile.ads.common;

import android.content.Context;
import com.yandex.mobile.ads.impl.ur1;

public final class BidderTokenLoader {
    private BidderTokenLoader() {
    }

    public static void loadBidderToken(Context context, BidderTokenLoadListener bidderTokenLoadListener) {
        ur1.m42818a().mo70396b(context, bidderTokenLoadListener);
    }
}
