package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.hj */
public interface C13325hj {

    /* renamed from: com.yandex.mobile.ads.impl.hj$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Map $default$b(C13325hj _this) {
            return Collections.emptyMap();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.hj$a */
    public interface C13326a {
        /* renamed from: a */
        C13325hj mo66840a();
    }

    /* renamed from: a */
    int mo65274a(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: a */
    long mo65275a(C13504jj jjVar) throws IOException;

    /* renamed from: a */
    Uri mo65276a();

    /* renamed from: a */
    void mo65277a(af1 af1);

    /* renamed from: b */
    Map<String, List<String>> mo65278b();

    void close() throws IOException;
}
