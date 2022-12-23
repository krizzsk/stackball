package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.yandex.mobile.ads.impl.jc */
public class C13486jc {

    /* renamed from: a */
    private final Executor f35215a = Executors.newSingleThreadExecutor();

    /* renamed from: com.yandex.mobile.ads.impl.jc$a */
    private static final class C13487a implements Runnable {

        /* renamed from: b */
        private final Handler f35216b = new Handler(Looper.getMainLooper());

        /* renamed from: c */
        private final C14269pc f35217c = new C14269pc();

        /* renamed from: d */
        private final Bitmap f35218d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final C13488b f35219e;

        C13487a(Bitmap bitmap, C13488b bVar) {
            this.f35218d = bitmap;
            this.f35219e = bVar;
        }

        public void run() {
            this.f35216b.post(new C13404ic(this, this.f35217c.mo69348a(this.f35218d)));
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.jc$b */
    public interface C13488b {
        /* renamed from: a */
        void mo67965a(Bitmap bitmap);
    }

    /* renamed from: a */
    public void mo67963a(Bitmap bitmap, C13488b bVar) {
        this.f35215a.execute(new C13487a(bitmap, bVar));
    }
}
