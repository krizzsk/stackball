package com.yandex.mobile.ads.impl;

import com.facebook.share.internal.ShareConstants;
import com.yandex.mobile.ads.impl.m41;
import com.yandex.mobile.ads.impl.o41;
import com.yandex.mobile.ads.impl.q90;
import java.io.IOException;
import java.net.URL;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

public final class kw0 {

    /* renamed from: a */
    private final wg1 f36439a;

    public kw0(wg1 wg1) {
        this.f36439a = wg1;
    }

    /* renamed from: a */
    public final m41 mo68279a(l41<?> l41, Map<String, String> map) {
        rn0 rn0;
        Intrinsics.checkNotNullParameter(l41, ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID);
        Intrinsics.checkNotNullParameter(map, "additionalHeaders");
        wg1 wg1 = this.f36439a;
        Intrinsics.checkNotNullParameter(l41, ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID);
        String l = l41.mo67768l();
        if (wg1 != null) {
            String a = wg1.mo65926a(l);
            if (a != null) {
                l = a;
            } else {
                throw new IOException(Intrinsics.stringPlus("URL blocked by rewriter: ", l));
            }
        }
        URL url = new URL(l);
        q90.C14367b bVar = q90.f39028c;
        Map<String, String> e = l41.mo67426e();
        Intrinsics.checkNotNullExpressionValue(e, "request.headers");
        Map<String, String> mutableMap = MapsKt.toMutableMap(MapsKt.plus(map, e));
        if (!mutableMap.containsKey("Content-Type")) {
            mutableMap.put("Content-Type", "application/x-www-form-urlencoded; charset=" + "UTF-8");
        }
        Unit unit = Unit.INSTANCE;
        q90 a2 = bVar.mo69522a(mutableMap);
        Intrinsics.checkNotNullParameter(l41, ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID);
        if (l41.mo68344f() == -1) {
            rn0 = rn0.GET;
        } else {
            switch (l41.mo68344f()) {
                case 0:
                    rn0 = rn0.GET;
                    break;
                case 1:
                    rn0 = rn0.POST;
                    break;
                case 2:
                    rn0 = rn0.PUT;
                    break;
                case 3:
                    rn0 = rn0.DELETE;
                    break;
                case 4:
                    rn0 = rn0.f39520g;
                    break;
                case 5:
                    rn0 = rn0.OPTIONS;
                    break;
                case 6:
                    rn0 = rn0.TRACE;
                    break;
                case 7:
                    rn0 = rn0.PATCH;
                    break;
                default:
                    throw new IllegalStateException("Unknown method type.");
            }
        }
        byte[] b = l41.mo67767b();
        return new m41.C13954a().mo68575a(url).mo68571a(a2).mo68573a(rn0.mo69796a(), b == null ? null : o41.C14166a.m40287a(o41.f38088a, b, 0, 0, 7)).mo68576a();
    }
}
