package com.applovin.impl.communicator;

import android.content.Context;
import android.content.Intent;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1505q;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.communicator.b */
public class C1160b implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private boolean f2144a = true;

    /* renamed from: b */
    private final String f2145b;

    /* renamed from: c */
    private final WeakReference<AppLovinCommunicatorSubscriber> f2146c;

    /* renamed from: d */
    private final Set<CommunicatorMessageImpl> f2147d = new LinkedHashSet();

    /* renamed from: e */
    private final Object f2148e = new Object();

    C1160b(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        this.f2145b = str;
        this.f2146c = new WeakReference<>(appLovinCommunicatorSubscriber);
    }

    /* renamed from: a */
    public String mo12098a() {
        return this.f2145b;
    }

    /* renamed from: a */
    public void mo12099a(boolean z) {
        this.f2144a = z;
    }

    /* renamed from: b */
    public AppLovinCommunicatorSubscriber mo12100b() {
        return (AppLovinCommunicatorSubscriber) this.f2146c.get();
    }

    /* renamed from: c */
    public boolean mo12101c() {
        return this.f2144a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1160b)) {
            return false;
        }
        C1160b bVar = (C1160b) obj;
        if (mo12098a().equals(bVar.mo12098a())) {
            if (this.f2146c.get() != null) {
                if (((AppLovinCommunicatorSubscriber) this.f2146c.get()).equals(bVar.f2146c.get())) {
                    return true;
                }
            } else if (this.f2146c.get() == bVar.f2146c.get()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f2145b.hashCode() * 31) + (this.f2146c.get() != null ? ((AppLovinCommunicatorSubscriber) this.f2146c.get()).hashCode() : 0);
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        if (mo12100b() == null) {
            C1505q.m3345i("AppLovinCommunicator", "Message received for GC'd subscriber");
            return;
        }
        CommunicatorMessageImpl communicatorMessageImpl = (CommunicatorMessageImpl) intent;
        boolean z = false;
        synchronized (this.f2148e) {
            if (!this.f2147d.contains(communicatorMessageImpl)) {
                this.f2147d.add(communicatorMessageImpl);
                z = true;
            }
        }
        if (z) {
            mo12100b().onMessageReceived((AppLovinCommunicatorMessage) communicatorMessageImpl);
        }
    }
}
