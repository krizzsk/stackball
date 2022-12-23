package com.yandex.mobile.ads.exo;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.yandex.mobile.ads.exo.f */
class C12214f extends Handler {

    /* renamed from: a */
    final /* synthetic */ C12215g f29731a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C12214f(C12215g gVar, Looper looper) {
        super(looper);
        this.f29731a = gVar;
    }

    public void handleMessage(Message message) {
        this.f29731a.mo64906a(message);
    }
}
