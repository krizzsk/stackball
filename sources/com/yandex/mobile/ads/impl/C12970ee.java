package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.TextView;
import com.tapjoy.TJAdUnitConstants;
import com.yandex.mobile.ads.C12066R;
import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.impl.ee */
class C12970ee {
    C12970ee() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C15236y7<TextView> mo66821a(Context context) {
        return new C14278pg(Arrays.asList(new C15236y7[]{new C15239ya(TJAdUnitConstants.DEFAULT_VOLUME_CHECK_INTERVAL), new jd1(TJAdUnitConstants.DEFAULT_VOLUME_CHECK_INTERVAL, context.getResources().getColor(C12066R.color.yandex_ads_internal_text_color_white))}));
    }
}
