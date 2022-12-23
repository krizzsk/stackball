package com.fyber.inneractive.sdk.player.p059c.p060a;

import android.os.Handler;
import com.fyber.inneractive.sdk.player.p059c.p061b.C3224c;

/* renamed from: com.fyber.inneractive.sdk.player.c.a.d */
public interface C3194d {

    /* renamed from: com.fyber.inneractive.sdk.player.c.a.d$a */
    public static final class C3195a {

        /* renamed from: a */
        final Handler f7943a = null;

        /* renamed from: b */
        final C3194d f7944b = null;

        /* renamed from: a */
        public final void mo18910a(final C3224c cVar) {
            if (this.f7944b != null) {
                this.f7943a.post(new Runnable() {
                    public final void run() {
                        cVar.mo18965a();
                    }
                });
            }
        }
    }
}
