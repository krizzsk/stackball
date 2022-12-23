package com.yandex.mobile.ads.exo.drm;

import android.os.Looper;
import com.yandex.mobile.ads.exo.drm.C12186c;
import com.yandex.mobile.ads.impl.j40;
import com.yandex.mobile.ads.impl.pg1;

/* renamed from: com.yandex.mobile.ads.exo.drm.d */
public interface C12188d<T extends j40> {

    /* renamed from: a */
    public static final C12188d<j40> f29588a = new C12189a();

    /* renamed from: com.yandex.mobile.ads.exo.drm.d$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static C12186c $default$a(C12188d dVar, Looper looper, int i) {
            return null;
        }

        public static void $default$b(C12188d dVar) {
        }

        public static void $default$release(C12188d dVar) {
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.drm.d$a */
    class C12189a implements C12188d<j40> {
        C12189a() {
        }

        /* renamed from: a */
        public /* synthetic */ C12186c<T> mo64850a(Looper looper, int i) {
            return CC.$default$a(this, looper, i);
        }

        /* renamed from: a */
        public C12186c<j40> mo64851a(Looper looper, DrmInitData drmInitData) {
            return new C12190e(new C12186c.C12187a(new pg1(1)));
        }

        /* renamed from: a */
        public boolean mo64853a(DrmInitData drmInitData) {
            return false;
        }

        /* renamed from: b */
        public Class<j40> mo64854b(DrmInitData drmInitData) {
            return null;
        }

        /* renamed from: b */
        public /* synthetic */ void mo64855b() {
            CC.$default$b(this);
        }

        public /* synthetic */ void release() {
            CC.$default$release(this);
        }
    }

    /* renamed from: a */
    C12186c<T> mo64850a(Looper looper, int i);

    /* renamed from: a */
    C12186c<T> mo64851a(Looper looper, DrmInitData drmInitData);

    /* renamed from: a */
    boolean mo64853a(DrmInitData drmInitData);

    /* renamed from: b */
    Class<? extends j40> mo64854b(DrmInitData drmInitData);

    /* renamed from: b */
    void mo64855b();

    void release();
}
