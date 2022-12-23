package com.yandex.mobile.ads.impl;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

public abstract class b40 {

    /* renamed from: a */
    public static final b40 f31222a = new C12568a();

    /* renamed from: com.yandex.mobile.ads.impl.b40$a */
    public static final class C12568a extends b40 {
        C12568a() {
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.b40$b */
    public interface C12569b {
        /* renamed from: a */
        b40 mo65537a(C12380ae aeVar);
    }

    /* renamed from: a */
    public void mo65964a(C12380ae aeVar, C13205gh ghVar) {
        Intrinsics.checkNotNullParameter(aeVar, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkNotNullParameter(ghVar, "connection");
    }

    /* renamed from: a */
    public void mo65965a(C12380ae aeVar, IOException iOException) {
        Intrinsics.checkNotNullParameter(aeVar, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkNotNullParameter(iOException, "ioe");
    }

    /* renamed from: b */
    public void mo65966b(C12380ae aeVar, IOException iOException) {
        Intrinsics.checkNotNullParameter(aeVar, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkNotNullParameter(iOException, "ioe");
    }
}
