package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.yandex.mobile.ads.impl.lx0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.eu */
public final class C13008eu {
    /* renamed from: a */
    public static final lx0 m35819a(Uri uri, int i, int i2) {
        boolean z;
        String queryParameter = uri.getQueryParameter("overflow");
        if (queryParameter == null) {
            z = true;
        } else {
            z = Intrinsics.areEqual((Object) queryParameter, (Object) "clamp");
        }
        if (z) {
            return new lx0.C13912a(i, i2);
        }
        if (Intrinsics.areEqual((Object) queryParameter, (Object) "ring")) {
            return new lx0.C13913b(i, i2);
        }
        return new lx0.C13912a(i, i2);
    }

    /* renamed from: a */
    public static final C14468rl m35820a(String str) {
        if (Intrinsics.areEqual((Object) str, (Object) "set_previous_item")) {
            return C14468rl.PREVIOUS;
        }
        if (Intrinsics.areEqual((Object) str, (Object) "set_next_item")) {
            return C14468rl.NEXT;
        }
        return C14468rl.NEXT;
    }
}
