package com.inmobi.media;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.inmobi.media.gv */
/* compiled from: InMobiThreadFactory */
public final class C5326gv implements ThreadFactory {

    /* renamed from: a */
    private String f12210a;

    public C5326gv(String str) {
        this.f12210a = "TIM-".concat(String.valueOf(str));
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f12210a);
    }
}
