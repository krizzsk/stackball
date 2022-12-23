package com.ogury.p245ed.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ogury.ed.internal.id */
public final class C8320id {

    /* renamed from: a */
    public static final C8320id f21501a = new C8320id();

    /* renamed from: b */
    private static final Map<String, C8319ic> f21502b = new ConcurrentHashMap();

    /* renamed from: c */
    private static Handler f21503c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private static final Runnable f21504d = $$Lambda$id$clsWNa_MEVgRz0b4PPKC1NFHoZg.INSTANCE;

    /* renamed from: e */
    private static Integer f21505e;

    /* renamed from: f */
    private static C8233fn f21506f = C8233fn.f21330a;

    private C8320id() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m23481d() {
        m23479c();
    }

    /* renamed from: a */
    public static void m23474a(C8324ig igVar) {
        C8467mq.m23881b(igVar, "presageAdGateway");
        Iterator<Map.Entry<String, C8319ic>> it = f21502b.entrySet().iterator();
        while (it.hasNext()) {
            if (C8467mq.m23880a(((C8319ic) it.next().getValue()).mo53728a().get(), (Object) igVar)) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public static void m23475a(String str) {
        C8467mq.m23881b(str, "cacheId");
        Iterator<Map.Entry<String, C8319ic>> it = f21502b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (C8467mq.m23880a(next.getKey(), (Object) str)) {
                it.remove();
                C8324ig igVar = (C8324ig) ((C8319ic) next.getValue()).mo53728a().get();
                if (igVar != null) {
                    igVar.mo53738b(((C8319ic) next.getValue()).mo53730c());
                }
            }
        }
    }

    /* renamed from: a */
    public static void m23473a(C8319ic icVar) {
        C8467mq.m23881b(icVar, "mraidCacheItem");
        m23478b(icVar);
        f21502b.put(icVar.mo53730c().mo53330a(), icVar);
        m23477b();
    }

    /* renamed from: b */
    private static void m23478b(C8319ic icVar) {
        if (f21505e == null) {
            Context context = icVar.mo53729b().getContext();
            C8467mq.m23878a((Object) context, "mraidCacheItem.webView.context");
            C8232fm a = C8233fn.m23113a(context);
            if (a != null) {
                f21505e = a.mo53545f() > 0 ? Integer.valueOf(a.mo53545f()) : null;
            }
        }
    }

    /* renamed from: a */
    public static void m23472a() {
        Iterator<Map.Entry<String, C8319ic>> it = f21502b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (m23480c((C8319ic) next.getValue())) {
                it.remove();
                C8147di diVar = C8147di.f21106a;
                C8147di.m22716a((C8146dh) new C8157dl("expired", ((C8319ic) next.getValue()).mo53730c()));
                C8324ig igVar = (C8324ig) ((C8319ic) next.getValue()).mo53728a().get();
                if (igVar != null) {
                    igVar.mo53737a(((C8319ic) next.getValue()).mo53730c());
                }
            }
        }
    }

    /* renamed from: c */
    private static boolean m23480c(C8319ic icVar) {
        Context context = icVar.mo53729b().getContext();
        C8467mq.m23878a((Object) context, "mraidCacheItem.webView.context");
        C8232fm a = C8233fn.m23113a(context);
        return a != null && System.currentTimeMillis() - icVar.mo53731d() > a.mo53551j();
    }

    /* renamed from: b */
    public static C8362jh m23476b(String str) {
        C8467mq.m23881b(str, "cacheId");
        C8362jh jhVar = null;
        if (f21502b.containsKey(str)) {
            C8319ic icVar = f21502b.get(str);
            if (icVar != null) {
                jhVar = icVar.mo53729b();
            }
            f21502b.remove(str);
        }
        return jhVar;
    }

    /* renamed from: b */
    private static void m23477b() {
        Iterator<Map.Entry<String, C8319ic>> it = f21502b.entrySet().iterator();
        while (it.hasNext()) {
            if (((C8319ic) it.next().getValue()).mo53728a().get() == null) {
                it.remove();
            }
        }
        f21503c.removeCallbacksAndMessages((Object) null);
        if (!f21502b.isEmpty()) {
            f21503c.postDelayed(f21504d, 1200000);
        }
    }

    /* renamed from: c */
    private static void m23479c() {
        C8467mq.m23873a("clean cache ", (Object) Integer.valueOf(f21502b.size()));
        m23472a();
        m23477b();
        C8467mq.m23873a("after cache ", (Object) Integer.valueOf(f21502b.size()));
    }
}
