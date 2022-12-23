package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.p267ad.InstreamAdPlayer;
import kotlin.jvm.internal.Intrinsics;

public final class if0 {

    /* renamed from: a */
    private final ng1 f34846a;

    /* renamed from: b */
    private final ff0 f34847b = ff0.f33351c.mo67003a();

    public if0(ng1 ng1) {
        Intrinsics.checkNotNullParameter(ng1, "unifiedInstreamAdBinder");
        this.f34846a = ng1;
    }

    /* renamed from: a */
    public final void mo67779a(InstreamAdPlayer instreamAdPlayer) {
        Intrinsics.checkNotNullParameter(instreamAdPlayer, "player");
        ng1 a = this.f34847b.mo67000a(instreamAdPlayer);
        if (!Intrinsics.areEqual((Object) this.f34846a, (Object) a)) {
            if (a != null) {
                a.invalidateAdPlayer();
            }
            this.f34847b.mo67001a(instreamAdPlayer, this.f34846a);
        }
    }

    /* renamed from: b */
    public final void mo67780b(InstreamAdPlayer instreamAdPlayer) {
        Intrinsics.checkNotNullParameter(instreamAdPlayer, "player");
        this.f34847b.mo67002b(instreamAdPlayer);
    }
}
