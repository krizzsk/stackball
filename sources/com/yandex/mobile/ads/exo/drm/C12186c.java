package com.yandex.mobile.ads.exo.drm;

import com.yandex.mobile.ads.impl.j40;
import java.io.IOException;

/* renamed from: com.yandex.mobile.ads.exo.drm.c */
public interface C12186c<T extends j40> {

    /* renamed from: com.yandex.mobile.ads.exo.drm.c$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$a(C12186c cVar) {
            return false;
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.drm.c$a */
    public static class C12187a extends IOException {
        public C12187a(Throwable th) {
            super(th);
        }
    }

    /* renamed from: a */
    boolean mo64848a();

    /* renamed from: b */
    int mo64858b();

    /* renamed from: c */
    T mo64859c();

    /* renamed from: d */
    C12187a mo64860d();

    /* renamed from: e */
    void mo64849e();

    void release();
}
