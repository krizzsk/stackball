package com.applovin.communicator;

import android.content.Context;
import com.applovin.impl.communicator.C1159a;
import com.applovin.impl.communicator.MessagingServiceImpl;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import java.util.Collections;
import java.util.List;

public final class AppLovinCommunicator {

    /* renamed from: a */
    private static AppLovinCommunicator f1626a;

    /* renamed from: b */
    private static final Object f1627b = new Object();

    /* renamed from: c */
    private C1469j f1628c;

    /* renamed from: d */
    private C1505q f1629d;

    /* renamed from: e */
    private final C1159a f1630e;

    /* renamed from: f */
    private final MessagingServiceImpl f1631f;

    private AppLovinCommunicator(Context context) {
        this.f1630e = new C1159a(context);
        this.f1631f = new MessagingServiceImpl(context);
    }

    /* renamed from: a */
    private void m1275a(String str) {
        C1505q qVar = this.f1629d;
        if (qVar != null) {
            qVar.mo13277b("AppLovinCommunicator", str);
        }
    }

    public static AppLovinCommunicator getInstance(Context context) {
        synchronized (f1627b) {
            if (f1626a == null) {
                f1626a = new AppLovinCommunicator(context.getApplicationContext());
            }
        }
        return f1626a;
    }

    /* renamed from: a */
    public void mo11640a(C1469j jVar) {
        this.f1628c = jVar;
        this.f1629d = jVar.mo13139v();
        m1275a("Attached SDK instance: " + jVar + "...");
    }

    public AppLovinCommunicatorMessagingService getMessagingService() {
        return this.f1631f;
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        subscribe(appLovinCommunicatorSubscriber, (List<String>) Collections.singletonList(str));
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String next : list) {
            if (this.f1630e.mo12096a(appLovinCommunicatorSubscriber, next)) {
                this.f1631f.maybeFlushStickyMessages(next);
            } else {
                m1275a("Unable to subscribe " + appLovinCommunicatorSubscriber + " to topic: " + next);
            }
        }
    }

    public String toString() {
        return "AppLovinCommunicator{sdk=" + this.f1628c + '}';
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        unsubscribe(appLovinCommunicatorSubscriber, (List<String>) Collections.singletonList(str));
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String next : list) {
            m1275a("Unsubscribing " + appLovinCommunicatorSubscriber + " from topic: " + next);
            this.f1630e.mo12097b(appLovinCommunicatorSubscriber, next);
        }
    }
}
