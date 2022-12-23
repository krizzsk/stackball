package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.webkit.URLUtil;
import com.p243my.target.ads.Reward;
import com.yandex.mobile.ads.common.AdActivity;
import com.yandex.mobile.ads.impl.h41;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.yandex.mobile.ads.impl.l0 */
public final class C13823l0 {

    /* renamed from: com.yandex.mobile.ads.impl.l0$a */
    static final class C13824a {

        /* renamed from: a */
        static final AtomicLong f36483a = new AtomicLong(SystemClock.elapsedRealtime() - 2000);
    }

    /* renamed from: a */
    public static void m38539a(Context context, k41 k41, String str, ResultReceiver resultReceiver, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("click_type", Reward.DEFAULT);
        ((C13198gf) k41).mo67277b(h41.C13276b.CLICK, hashMap);
        if (resultReceiver != null) {
            resultReceiver.send(9, (Bundle) null);
        }
        if (context != null) {
            AtomicLong atomicLong = C13824a.f36483a;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long andSet = elapsedRealtime - C13824a.f36483a.getAndSet(elapsedRealtime);
            if (!(andSet < 0 || andSet > 1000)) {
                return;
            }
            if (z && yg1.m44321a(str)) {
                m38540a(context, str, resultReceiver);
            } else if (yg1.m44320a(context, str, true)) {
                if (resultReceiver != null) {
                    resultReceiver.send(7, (Bundle) null);
                }
            } else if (URLUtil.isNetworkUrl(str)) {
                m38540a(context, str, resultReceiver);
            }
        }
    }

    /* renamed from: a */
    private static void m38540a(Context context, String str, ResultReceiver resultReceiver) {
        if (context != null) {
            Intent intent = new Intent(context, AdActivity.class);
            intent.putExtra("window_type", "window_type_browser");
            intent.putExtra("extra_receiver", C13278h5.m36798a(resultReceiver));
            intent.putExtra("extra_browser_url", str);
            intent.addFlags(268435456);
            try {
                context.startActivity(intent);
            } catch (Exception e) {
                e.toString();
            }
        }
    }
}
