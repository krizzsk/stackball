package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public interface l50 extends i31 {

    /* renamed from: com.yandex.mobile.ads.impl.l50$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$a(l50 _this, C15055wl wlVar) {
            Intrinsics.checkNotNullParameter(wlVar, "subscription");
            if (!Intrinsics.areEqual((Object) wlVar, (Object) C15055wl.f42027a)) {
                _this.mo65869a().add(wlVar);
            }
        }

        public static void $default$b(l50 _this) {
            for (C15055wl close : _this.mo65869a()) {
                close.close();
            }
            _this.mo65869a().clear();
        }

        public static void $default$release(l50 _this) {
            _this.mo65871b();
        }
    }

    /* renamed from: a */
    List<C15055wl> mo65869a();

    /* renamed from: a */
    void mo65870a(C15055wl wlVar);

    /* renamed from: b */
    void mo65871b();

    void release();
}
