package com.yandex.mobile.ads.mediation.base;

import android.content.Context;
import java.util.Map;

public interface MediatedBidderTokenLoader {
    void loadBidderToken(Context context, Map<String, String> map, MediatedBidderTokenLoadListener mediatedBidderTokenLoadListener);
}
