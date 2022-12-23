package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.C12135y;
import com.yandex.mobile.ads.impl.h41;

/* renamed from: com.yandex.mobile.ads.impl.r3 */
public class C14437r3 implements j41 {
    /* renamed from: a */
    public h41.C13276b mo67924a() {
        return h41.C13276b.FORCED_IMPRESSION_TRACKING_FAILURE;
    }

    /* renamed from: b */
    public h41.C13276b mo67926b() {
        return h41.C13276b.IMPRESSION_TRACKING_START;
    }

    /* renamed from: a */
    public h41.C13276b mo67925a(C12135y.C12136a aVar) {
        if (C12135y.C12136a.SUCCESS == aVar) {
            return h41.C13276b.IMPRESSION_TRACKING_SUCCESS;
        }
        return h41.C13276b.IMPRESSION_TRACKING_FAILURE;
    }
}
