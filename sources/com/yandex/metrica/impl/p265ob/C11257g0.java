package com.yandex.metrica.impl.p265ob;

import android.content.ComponentName;
import android.content.Context;
import com.yandex.metrica.PreloadInfoContentProvider;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.JvmStatic;

/* renamed from: com.yandex.metrica.impl.ob.g0 */
public final class C11257g0 {

    /* renamed from: a */
    private static volatile CountDownLatch f26931a;

    /* renamed from: b */
    private static volatile PreloadInfoContentProvider f26932b;

    @JvmStatic
    /* renamed from: a */
    public static final void m29015a(PreloadInfoContentProvider preloadInfoContentProvider) {
        f26931a = new CountDownLatch(1);
        f26932b = preloadInfoContentProvider;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m29013a() {
        CountDownLatch countDownLatch = f26931a;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m29014a(Context context) {
        CountDownLatch countDownLatch = f26931a;
        if (countDownLatch != null) {
            countDownLatch.await(1, TimeUnit.SECONDS);
            try {
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, PreloadInfoContentProvider.class), 2, 1);
                PreloadInfoContentProvider preloadInfoContentProvider = f26932b;
                if (preloadInfoContentProvider != null) {
                    preloadInfoContentProvider.disable();
                }
            } catch (Throwable unused) {
            }
            f26931a = null;
        }
    }
}
