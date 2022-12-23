package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;

final class e21 implements f21 {
    /* renamed from: a */
    public void mo66742a(int i, o30 o30) {
        Intrinsics.checkNotNullParameter(o30, IronSourceConstants.EVENTS_ERROR_CODE);
    }

    /* renamed from: a */
    public boolean mo66743a(int i, List<o90> list) {
        Intrinsics.checkNotNullParameter(list, "requestHeaders");
        return true;
    }

    /* renamed from: a */
    public boolean mo66744a(int i, List<o90> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "responseHeaders");
        return true;
    }

    /* renamed from: a */
    public boolean mo66745a(int i, BufferedSource bufferedSource, int i2, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(bufferedSource, "source");
        bufferedSource.skip((long) i2);
        return true;
    }
}
