package com.fyber.inneractive.sdk.p049h;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.fyber.inneractive.sdk.config.p034a.C2767s;
import com.fyber.inneractive.sdk.config.p034a.p035a.C2745e;
import com.fyber.inneractive.sdk.util.C3656k;
import com.fyber.inneractive.sdk.util.IAlog;
import java.net.UnknownHostException;
import java.util.Comparator;
import java.util.Locale;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.fyber.inneractive.sdk.h.t */
public final class C2979t implements C2978s {

    /* renamed from: g */
    private static final ThreadFactory f7253g = new ThreadFactory() {

        /* renamed from: a */
        private final AtomicInteger f7260a = new AtomicInteger(100);

        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format(Locale.ENGLISH, "FyberMarketplace-Network-%02d", new Object[]{Integer.valueOf(this.f7260a.getAndIncrement())}));
        }
    };

    /* renamed from: a */
    BlockingQueue<C2988y<?>> f7254a = new PriorityBlockingQueue(100, this.f7258e);

    /* renamed from: b */
    public volatile boolean f7255b = false;

    /* renamed from: c */
    public final ThreadPoolExecutor f7256c = new ThreadPoolExecutor(6, 6, 1000, TimeUnit.SECONDS, new LinkedBlockingQueue(100), f7253g);

    /* renamed from: d */
    public final Runnable f7257d = new Runnable() {
        public final void run() {
            C2979t.m6663a(C2979t.this);
        }
    };

    /* renamed from: e */
    private final C2983a f7258e = new C2983a((byte) 0);

    /* renamed from: f */
    private final Handler f7259f = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public final void mo18441a(C2988y<?> yVar) {
        this.f7254a.offer(yVar);
        yVar.mo18391a(C2946ai.f7091b);
    }

    /* renamed from: b */
    private static <T> C2935a<T> m6665b(C2988y<T> yVar) {
        try {
            if (yVar.mo18399l() || yVar.mo18397i() == null) {
                return null;
            }
            return yVar.mo18398j();
        } catch (Exception e) {
            IAlog.m9032a("failed fetching cache data", (Throwable) e, new Object[0]);
            yVar.mo18393a(null, e, true);
            return null;
        }
    }

    /* renamed from: c */
    private static void m6666c(C2988y<?> yVar) {
        try {
            yVar.mo18400n();
        } catch (Exception unused) {
        }
        yVar.mo18391a(C2946ai.f7093d);
    }

    /* renamed from: a */
    private static <T> void m6664a(C2988y<T> yVar, C2986w<T> wVar) {
        try {
            if (!yVar.mo18399l() && wVar != null) {
                yVar.mo18393a(wVar.mo18446a(), (Exception) null, false);
            }
        } catch (Exception e) {
            IAlog.m9032a("failed notifying the listener request complete", (Throwable) e, new Object[0]);
            yVar.mo18393a(null, e, false);
        }
    }

    /* renamed from: a */
    private static <T> C2986w<T> m6662a(C2988y<T> yVar, C2958g gVar) throws Exception {
        if (gVar == null) {
            return null;
        }
        try {
            if (yVar.mo18399l()) {
                return null;
            }
            if (gVar.f7116a == 200) {
                return yVar.mo18405a(gVar.f7117b, gVar.f7118c, gVar.f7116a);
            }
            if (gVar.f7116a == 304) {
                yVar.mo18393a(null, (Exception) new C2955d(), false);
                return null;
            }
            yVar.mo18393a(null, (Exception) new C2947aj(gVar.f7116a), false);
            return null;
        } catch (Exception e) {
            IAlog.m9032a("failed parsing network request", (Throwable) e, new Object[0]);
            throw e;
        }
    }

    /* renamed from: a */
    private C2958g m6661a(final C2988y<?> yVar, C2935a<?> aVar) throws Exception {
        String str;
        C2745e eVar;
        try {
            if (yVar.mo18399l()) {
                return null;
            }
            if (aVar != null) {
                str = aVar.f7058a;
            } else {
                str = "";
            }
            C2767s o = yVar.mo18401o();
            if (!(o == null || (eVar = (C2745e) o.mo18010a(C2745e.class)) == null || !eVar.mo17984a("should_use_is_network_connected", false))) {
                if (!C3656k.m9089b()) {
                    throw new C2951b("No network connection");
                }
            }
            return yVar.mo18390a(str);
        } catch (C2951b | UnknownHostException e) {
            IAlog.m9032a("failed sending network request", e, new Object[0]);
            if (yVar.mo18407g()) {
                this.f7259f.postDelayed(new Runnable() {
                    public final void run() {
                        IAlog.m9034b("retrying network request", new Object[0]);
                        C2979t.this.mo18441a((C2988y<?>) yVar);
                    }
                }, (long) yVar.mo18408h());
            }
            throw e;
        } catch (Exception e2) {
            IAlog.m9032a("failed sending network request", (Throwable) e2, new Object[0]);
            throw e2;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.h.t$a */
    private static class C2983a implements Comparator<C2988y> {
        private C2983a() {
        }

        /* synthetic */ C2983a(byte b) {
            this();
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return (((C2988y) obj).mo18410m() - 1) - (((C2988y) obj2).mo18410m() - 1);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m6663a(C2979t tVar) {
        C2988y yVar;
        C2986w wVar;
        Process.setThreadPriority(10);
        while (tVar.f7255b) {
            C2986w wVar2 = null;
            try {
                yVar = tVar.f7254a.take();
            } catch (InterruptedException unused) {
                if (!tVar.f7255b) {
                    Thread.currentThread().interrupt();
                }
                yVar = null;
            }
            if (yVar != null && !yVar.mo18399l()) {
                yVar.mo18391a(C2946ai.f7092c);
                C2935a b = m6665b(yVar);
                if (!(b == null || b.f7059b == null || yVar.mo18399l())) {
                    yVar.mo18393a(b.f7059b, (Exception) null, true);
                }
                try {
                    C2958g a = tVar.m6661a((C2988y<?>) yVar, (C2935a<?>) b);
                    wVar = m6662a(yVar, a);
                    try {
                        if (!(yVar.mo18399l() || yVar.mo18397i() == null || wVar == null || a == null || a.f7116a != 200)) {
                            yVar.mo18392a(wVar, yVar.mo18397i(), a.f7119d);
                        }
                    } catch (Exception e) {
                        try {
                            IAlog.m9032a("Failed cache network response data", (Throwable) e, new Object[0]);
                        } catch (Exception e2) {
                            e = e2;
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    wVar = null;
                    try {
                        yVar.mo18393a(null, e, false);
                        m6664a(yVar, wVar);
                        m6666c(yVar);
                    } catch (Throwable th) {
                        th = th;
                        wVar2 = wVar;
                        m6664a(yVar, wVar2);
                        m6666c(yVar);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    m6664a(yVar, wVar2);
                    m6666c(yVar);
                    throw th;
                }
                m6664a(yVar, wVar);
                m6666c(yVar);
            }
        }
    }
}
