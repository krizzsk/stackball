package com.ogury.core.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: OguryBroadcastEventBus.kt */
public final class OguryBroadcastEventBus implements OguryEventBus {
    private final List<C7941b> callbacks = new ArrayList();
    private final Handler mainThreadHandler = new Handler(Looper.getMainLooper());

    /* renamed from: com.ogury.core.internal.OguryBroadcastEventBus$b */
    /* compiled from: OguryBroadcastEventBus.kt */
    static final class C7903b extends C7922aj implements C7918af<C7941b, Boolean> {

        /* renamed from: a */
        private /* synthetic */ OguryBroadcastEventBus f20672a;

        /* renamed from: b */
        private /* synthetic */ OguryEventCallback f20673b;

        /* renamed from: c */
        private /* synthetic */ String f20674c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7903b(OguryBroadcastEventBus oguryBroadcastEventBus, OguryEventCallback oguryEventCallback, String str) {
            super(1);
            this.f20672a = oguryBroadcastEventBus;
            this.f20673b = oguryEventCallback;
            this.f20674c = str;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo52870a(Object obj) {
            C7941b bVar = (C7941b) obj;
            C7921ai.m22144b(bVar, "it");
            return Boolean.valueOf(C7921ai.m22143a((Object) bVar.mo52908b(), (Object) this.f20673b) && C7921ai.m22143a((Object) bVar.mo52907a(), (Object) this.f20674c));
        }
    }

    public final void dispatch(String str, String str2) {
        C7921ai.m22144b(str, "event");
        C7921ai.m22144b(str2, "message");
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.callbacks) {
            Collection arrayList = new ArrayList();
            for (Object next : this.callbacks) {
                if (C7921ai.m22143a((Object) ((C7941b) next).mo52907a(), (Object) str)) {
                    arrayList.add(next);
                }
            }
            for (C7941b sendEventOnMainThread : (List) arrayList) {
                sendEventOnMainThread(sendEventOnMainThread, str2, currentTimeMillis);
            }
            C7979g gVar = C7979g.f20769a;
        }
    }

    /* renamed from: com.ogury.core.internal.OguryBroadcastEventBus$a */
    /* compiled from: OguryBroadcastEventBus.kt */
    static final class C7902a implements Runnable {

        /* renamed from: a */
        private /* synthetic */ C7941b f20669a;

        /* renamed from: b */
        private /* synthetic */ String f20670b;

        /* renamed from: c */
        private /* synthetic */ long f20671c;

        C7902a(C7941b bVar, String str, long j) {
            this.f20669a = bVar;
            this.f20670b = str;
            this.f20671c = j;
        }

        public final void run() {
            this.f20669a.mo52908b().onNewEvent(this.f20669a.mo52907a(), this.f20670b, this.f20671c);
        }
    }

    private final void sendEventOnMainThread(C7941b bVar, String str, long j) {
        this.mainThreadHandler.post(new C7902a(bVar, str, j));
    }

    public final void register(String str, OguryEventCallback oguryEventCallback) {
        C7921ai.m22144b(str, "event");
        C7921ai.m22144b(oguryEventCallback, "callback");
        synchronized (this.callbacks) {
            this.callbacks.add(new C7941b(str, oguryEventCallback));
            C7979g gVar = C7979g.f20769a;
        }
    }

    public final void unregister(String str, OguryEventCallback oguryEventCallback) {
        C7921ai.m22144b(str, "event");
        C7921ai.m22144b(oguryEventCallback, "callback");
        synchronized (this.callbacks) {
            C7983k.m22238a(this.callbacks, new C7903b(this, oguryEventCallback, str));
        }
    }
}
