package com.applovin.impl.communicator;

import android.content.Context;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorMessagingService;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

public class MessagingServiceImpl implements AppLovinCommunicatorMessagingService {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f2134a;

    /* renamed from: b */
    private final ScheduledThreadPoolExecutor f2135b;

    /* renamed from: c */
    private final Queue<CommunicatorMessageImpl> f2136c = new LinkedList();

    /* renamed from: d */
    private final Object f2137d = new Object();

    public MessagingServiceImpl(Context context) {
        this.f2134a = context;
        this.f2135b = m1816a();
    }

    /* renamed from: a */
    private Queue<CommunicatorMessageImpl> m1815a(String str) {
        LinkedList linkedList;
        synchronized (this.f2137d) {
            linkedList = new LinkedList();
            for (CommunicatorMessageImpl communicatorMessageImpl : this.f2136c) {
                if (communicatorMessageImpl.mo12090a() && communicatorMessageImpl.getTopic().equals(str)) {
                    linkedList.add(communicatorMessageImpl);
                }
            }
        }
        return linkedList;
    }

    /* renamed from: a */
    private ScheduledThreadPoolExecutor m1816a() {
        return new ScheduledThreadPoolExecutor(4, new ThreadFactory() {
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, "AppLovinSdk:com.applovin.communicator");
                thread.setPriority(10);
                thread.setDaemon(true);
                return thread;
            }
        });
    }

    /* renamed from: a */
    private void m1817a(final CommunicatorMessageImpl communicatorMessageImpl) {
        this.f2135b.execute(new Runnable() {
            public void run() {
                AppLovinBroadcastManager.getInstance(MessagingServiceImpl.this.f2134a).sendBroadcastSync(communicatorMessageImpl, (Map<String, Object>) null);
            }
        });
    }

    public void maybeFlushStickyMessages(String str) {
        for (CommunicatorMessageImpl a : m1815a(str)) {
            m1817a(a);
        }
    }

    public void publish(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        m1817a((CommunicatorMessageImpl) appLovinCommunicatorMessage);
        synchronized (this.f2137d) {
            this.f2136c.add(appLovinCommunicatorMessage);
        }
    }

    public String toString() {
        return "MessagingServiceImpl{}";
    }
}
