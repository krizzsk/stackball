package com.ironsource.sdk.p155k;

import android.os.Handler;
import android.os.Message;
import com.ironsource.environment.C5505a;
import com.ironsource.sdk.p150g.C6014e;
import com.ironsource.sdk.p151h.C6020c;
import com.ironsource.sdk.utils.Logger;

/* renamed from: com.ironsource.sdk.k.a */
public final class C6036a extends Handler {

    /* renamed from: a */
    public C6041c f14790a;

    public final void handleMessage(Message message) {
        if (this.f14790a == null) {
            Logger.m14957i("DownloadHandler", "OnPreCacheCompletion listener is null, msg: " + message.toString());
            return;
        }
        try {
            if (message.what != 1016) {
                this.f14790a.mo42315a((C6020c) message.obj, new C6014e(message.what, C5505a.C55061.m13068a(message.what)));
                return;
            }
            this.f14790a.mo42314a((C6020c) message.obj);
        } catch (Throwable th) {
            Logger.m14957i("DownloadHandler", "handleMessage | Got exception: " + th.getMessage());
            th.printStackTrace();
        }
    }
}
