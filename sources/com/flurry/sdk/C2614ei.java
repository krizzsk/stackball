package com.flurry.sdk;

import com.facebook.internal.security.CertificateUtil;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.flurry.sdk.ei */
public final class C2614ei implements ThreadFactory {

    /* renamed from: a */
    private final ThreadGroup f6143a;

    /* renamed from: b */
    private final int f6144b = 1;

    public C2614ei(String str) {
        this.f6143a = new ThreadGroup(str);
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f6143a, runnable);
        thread.setName(this.f6143a.getName() + CertificateUtil.DELIMITER + thread.getId());
        thread.setPriority(this.f6144b);
        return thread;
    }
}
