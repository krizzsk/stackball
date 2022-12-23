package com.fyber.inneractive.sdk.player;

import android.content.Context;
import com.fyber.inneractive.sdk.config.p034a.C2767s;
import com.fyber.inneractive.sdk.config.p034a.p035a.C2746f;
import com.fyber.inneractive.sdk.player.p058b.C3153a;
import com.fyber.inneractive.sdk.player.p058b.C3157d;
import com.fyber.inneractive.sdk.player.p058b.C3161f;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.e */
public final class C3310e {
    /* renamed from: a */
    public static final C3161f m8192a(Context context, C2767s sVar) {
        C3157d dVar;
        boolean z;
        if (sVar != null) {
            try {
                z = ((C2746f) sVar.mo18010a(C2746f.class)).mo17984a("use_fmp_cache_mechanism", false);
            } catch (Throwable th) {
                if (IAlog.f9870a <= 3) {
                    IAlog.m9034b("Failed creating exo player", new Object[0]);
                    th.printStackTrace();
                }
                dVar = null;
            }
        } else {
            z = false;
        }
        dVar = new C3157d(context, z, sVar);
        return dVar == null ? new C3153a(context) : dVar;
    }
}
