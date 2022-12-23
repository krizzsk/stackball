package com.yandex.mobile.ads.core.identifiers.p266ad.huawei;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.yandex.mobile.ads.core.identifiers.p266ad.huawei.OpenDeviceIdentifierService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.mobile.ads.core.identifiers.ad.huawei.b */
public class C12146b implements ServiceConnection {

    /* renamed from: a */
    private final BlockingQueue<OpenDeviceIdentifierService> f29453a = new LinkedBlockingQueue();

    C12146b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public OpenDeviceIdentifierService mo64731a() throws InterruptedException {
        return this.f29453a.poll(5, TimeUnit.SECONDS);
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.f29453a.put(OpenDeviceIdentifierService.Stub.asInterface(iBinder));
        } catch (Exception unused) {
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        try {
            this.f29453a.clear();
        } catch (UnsupportedOperationException unused) {
        }
    }
}
