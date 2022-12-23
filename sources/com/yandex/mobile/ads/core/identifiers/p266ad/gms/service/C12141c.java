package com.yandex.mobile.ads.core.identifiers.p266ad.gms.service;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.mobile.ads.core.identifiers.ad.gms.service.c */
class C12141c implements ServiceConnection {

    /* renamed from: a */
    private final BlockingQueue<IBinder> f29441a = new LinkedBlockingQueue();

    C12141c() {
    }

    /* renamed from: a */
    public IBinder mo64720a() throws InterruptedException {
        return this.f29441a.poll(5, TimeUnit.SECONDS);
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.f29441a.put(iBinder);
        } catch (InterruptedException unused) {
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        try {
            this.f29441a.clear();
        } catch (UnsupportedOperationException unused) {
        }
    }
}
