package com.yandex.mobile.ads.impl;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.yandex.mobile.ads.impl.r7 */
public final class C14442r7 {

    /* renamed from: a */
    public static final C14442r7 f39371a = new C14442r7();

    /* renamed from: b */
    private static final CopyOnWriteArraySet<Logger> f39372b = new CopyOnWriteArraySet<>();

    /* renamed from: c */
    private static final Map<String, String> f39373c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package packageR = hw0.class.getPackage();
        String name = packageR == null ? null : packageR.getName();
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = hw0.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = mb0.class.getName();
        Intrinsics.checkNotNullExpressionValue(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = cd1.class.getName();
        Intrinsics.checkNotNullExpressionValue(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttplib.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f39373c = MapsKt.toMap(linkedHashMap);
    }

    private C14442r7() {
    }

    /* renamed from: a */
    public final void mo69700a(String str, int i, String str2, Throwable th) {
        int min;
        Intrinsics.checkNotNullParameter(str, "loggerName");
        Intrinsics.checkNotNullParameter(str2, "message");
        String str3 = f39373c.get(str);
        if (str3 == null) {
            str3 = StringsKt.take(str, 23);
        }
        if (Log.isLoggable(str3, i)) {
            if (th != null) {
                str2 = str2 + 10 + Log.getStackTraceString(th);
            }
            int i2 = 0;
            int length = str2.length();
            while (i2 < length) {
                int indexOf$default = StringsKt.indexOf$default((CharSequence) str2, 10, i2, false, 4, (Object) null);
                if (indexOf$default == -1) {
                    indexOf$default = length;
                }
                while (true) {
                    min = Math.min(indexOf$default, i2 + 4000);
                    String substring = str2.substring(i2, min);
                    Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(i, str3, substring);
                    if (min >= indexOf$default) {
                        break;
                    }
                    i2 = min;
                }
                i2 = min + 1;
            }
        }
    }

    /* renamed from: a */
    public final void mo69699a() {
        Level level;
        for (Map.Entry next : f39373c.entrySet()) {
            String str = (String) next.getValue();
            Logger logger = Logger.getLogger((String) next.getKey());
            if (f39372b.add(logger)) {
                logger.setUseParentHandlers(false);
                if (Log.isLoggable(str, 3)) {
                    level = Level.FINE;
                } else if (Log.isLoggable(str, 4)) {
                    level = Level.INFO;
                } else {
                    level = Level.WARNING;
                }
                logger.setLevel(level);
                logger.addHandler(C14565s7.f39863a);
            }
        }
    }
}
