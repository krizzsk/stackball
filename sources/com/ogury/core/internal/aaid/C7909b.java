package com.ogury.core.internal.aaid;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import com.ogury.core.internal.C7921ai;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.ogury.core.internal.aaid.b */
/* compiled from: AdvertisingConnection.kt */
public final class C7909b implements ServiceConnection {

    /* renamed from: a */
    private final LinkedBlockingQueue<IBinder> f20681a = new LinkedBlockingQueue<>(1);

    /* renamed from: b */
    private boolean f20682b;

    public final void onServiceDisconnected(ComponentName componentName) {
        C7921ai.m22144b(componentName, "name");
    }

    /* renamed from: a */
    public final IBinder mo52885a() throws InterruptedException {
        if (!this.f20682b) {
            this.f20682b = true;
            IBinder take = this.f20681a.take();
            if (take != null) {
                return take;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.IBinder");
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C7921ai.m22144b(componentName, "name");
        C7921ai.m22144b(iBinder, NotificationCompat.CATEGORY_SERVICE);
        try {
            this.f20681a.put(iBinder);
        } catch (InterruptedException unused) {
        }
    }
}
