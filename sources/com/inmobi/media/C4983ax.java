package com.inmobi.media;

import android.content.ContentValues;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.inmobi.media.C5220ev;
import com.inmobi.media.C5239ey;
import com.inmobi.media.C5303gg;
import com.inmobi.media.C5334hb;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.inmobi.media.ax */
/* compiled from: ClickManager */
public class C4983ax implements C5239ey.C5242c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f11303a = C4983ax.class.getSimpleName();

    /* renamed from: b */
    private static ExecutorService f11304b;

    /* renamed from: c */
    private static C4992b f11305c;

    /* renamed from: d */
    private static HandlerThread f11306d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static List<C4981av> f11307e = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static C4982aw f11308f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static AtomicBoolean f11309g = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static C5220ev.C5227d f11310h;

    /* renamed from: i */
    private static final Object f11311i = new Object();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public long f11312j = 0;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C5001e f11313k = new C5001e() {
        /* renamed from: a */
        public final void mo40141a(C4981av avVar) {
            if (avVar != null) {
                String unused = C4983ax.f11303a;
                C4982aw unused2 = C4983ax.f11308f;
                C4982aw.m11334a(avVar);
            }
        }

        /* renamed from: b */
        public final void mo40142b(C4981av avVar) {
            if (avVar != null) {
                String unused = C4983ax.f11303a;
                C4983ax.m11342a(avVar);
                C4983ax.this.mo40135b();
            }
        }
    };

    /* renamed from: com.inmobi.media.ax$a */
    /* compiled from: ClickManager */
    static class C4991a {

        /* renamed from: a */
        static final C4983ax f11329a = new C4983ax();
    }

    /* renamed from: com.inmobi.media.ax$e */
    /* compiled from: ClickManager */
    interface C5001e {
        /* renamed from: a */
        void mo40141a(C4981av avVar);

        /* renamed from: b */
        void mo40142b(C4981av avVar);
    }

    /* renamed from: a */
    public static C4983ax m11340a() {
        return C4991a.f11329a;
    }

    /* renamed from: a */
    public void mo40121a(C5238ex exVar) {
        f11310h = ((C5220ev) exVar).imai;
    }

    /* renamed from: b */
    public void mo40135b() {
        try {
            if (C5328gx.m12274a()) {
                synchronized (f11311i) {
                    if (f11309g.compareAndSet(false, true)) {
                        if (f11306d == null) {
                            HandlerThread handlerThread = new HandlerThread("pingHandlerThread");
                            f11306d = handlerThread;
                            handlerThread.start();
                        }
                        if (f11305c == null) {
                            f11305c = new C4992b(f11306d.getLooper());
                        }
                        if (C4982aw.m11335a()) {
                            f11309g.set(false);
                            m11352i();
                        } else {
                            Message obtain = Message.obtain();
                            obtain.what = 1;
                            f11305c.sendMessage(obtain);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void mo40134a(final String str, final boolean z) {
        new Thread() {
            public final void run() {
                try {
                    if (!((C5261fk) C5239ey.m11987a("root", C5314go.m12211f(), (C5239ey.C5242c) null)).mo40585i()) {
                        C4981av avVar = new C4981av(str, z, false, C4983ax.f11310h.maxRetries + 1);
                        String unused = C4983ax.f11303a;
                        C4983ax.m11343a(C4983ax.this, avVar);
                    }
                } catch (Exception unused2) {
                    String unused3 = C4983ax.f11303a;
                }
            }
        }.start();
    }

    /* renamed from: a */
    public void mo40133a(final String str, final Map<String, String> map, final boolean z) {
        new Thread() {
            public final void run() {
                try {
                    if (!((C5261fk) C5239ey.m11987a("root", C5314go.m12211f(), (C5239ey.C5242c) null)).mo40585i()) {
                        C4981av avVar = new C4981av(str, (Map<String, String>) map, z, C4983ax.f11310h.maxRetries + 1);
                        String unused = C4983ax.f11303a;
                        C4983ax.m11343a(C4983ax.this, avVar);
                    }
                } catch (Exception e) {
                    String unused2 = C4983ax.f11303a;
                    C5275fn.m12068a().mo40590a(new C5308gk(e));
                }
            }
        }.start();
    }

    /* renamed from: b */
    public void mo40136b(final String str, final boolean z) {
        new Thread() {
            public final void run() {
                try {
                    if (!((C5261fk) C5239ey.m11987a("root", C5314go.m12211f(), (C5239ey.C5242c) null)).mo40585i()) {
                        C4981av avVar = new C4981av(str, z, true, C4983ax.f11310h.maxRetries + 1);
                        String unused = C4983ax.f11303a;
                        C4983ax.m11343a(C4983ax.this, avVar);
                    }
                } catch (Exception unused2) {
                    String unused3 = C4983ax.f11303a;
                }
            }
        }.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static void m11352i() {
        try {
            f11309g.set(false);
            synchronized (f11311i) {
                if (!f11309g.get() && f11306d != null) {
                    f11306d.getLooper().quit();
                    f11306d.interrupt();
                    f11306d = null;
                    f11305c = null;
                }
            }
        } catch (Exception unused) {
        }
    }

    public C4983ax() {
        try {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 5, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C5326gv(f11303a));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            f11304b = threadPoolExecutor;
            HandlerThread handlerThread = new HandlerThread("pingHandlerThread");
            f11306d = handlerThread;
            handlerThread.start();
            f11305c = new C4992b(f11306d.getLooper());
            f11310h = ((C5220ev) C5239ey.m11987a(CampaignUnit.JSON_KEY_ADS, C5314go.m12211f(), this)).imai;
            f11308f = new C4982aw();
            C5334hb.m12304a().mo40703a((C5334hb.C5338c) new C5334hb.C5338c() {
                /* renamed from: a */
                public final void mo40125a(boolean z) {
                    if (z) {
                        C4983ax.this.mo40135b();
                    }
                }
            });
            if (Build.VERSION.SDK_INT >= 23) {
                C5334hb.m12304a().mo40704a("android.os.action.DEVICE_IDLE_MODE_CHANGED", (C5334hb.C5338c) new C5334hb.C5338c() {
                    /* renamed from: a */
                    public final void mo40125a(boolean z) {
                        if (!z) {
                            C4983ax.this.mo40135b();
                        }
                    }
                });
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: com.inmobi.media.ax$d */
    /* compiled from: ClickManager */
    static final class C5000d {

        /* renamed from: a */
        private C5001e f11344a;

        public C5000d(C5001e eVar) {
            this.f11344a = eVar;
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0068 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo40156a(com.inmobi.media.C4981av r8) {
            /*
                r7 = this;
                com.inmobi.media.gc r0 = new com.inmobi.media.gc     // Catch:{ Exception -> 0x009d }
                java.lang.String r1 = "GET"
                java.lang.String r2 = r8.f11293b     // Catch:{ Exception -> 0x009d }
                r0.<init>(r1, r2)     // Catch:{ Exception -> 0x009d }
                java.util.HashMap r1 = com.inmobi.media.C4983ax.m11346c(r8)     // Catch:{ Exception -> 0x009d }
                boolean r2 = r1.isEmpty()     // Catch:{ Exception -> 0x009d }
                if (r2 != 0) goto L_0x0016
                r0.mo40614a((java.util.Map<java.lang.String, java.lang.String>) r1)     // Catch:{ Exception -> 0x009d }
            L_0x0016:
                r1 = 0
                r0.f12142u = r1     // Catch:{ Exception -> 0x009d }
                r0.f12136o = r1     // Catch:{ Exception -> 0x009d }
                java.util.Map<java.lang.String, java.lang.String> r1 = r8.f11294c     // Catch:{ Exception -> 0x009d }
                r0.mo40616b(r1)     // Catch:{ Exception -> 0x009d }
                boolean r1 = r8.f11300i     // Catch:{ Exception -> 0x009d }
                r0.f12134m = r1     // Catch:{ Exception -> 0x009d }
                com.inmobi.media.ev$d r1 = com.inmobi.media.C4983ax.f11310h     // Catch:{ Exception -> 0x009d }
                int r1 = r1.pingTimeout     // Catch:{ Exception -> 0x009d }
                int r1 = r1 * 1000
                r0.f12132k = r1     // Catch:{ Exception -> 0x009d }
                com.inmobi.media.ev$d r1 = com.inmobi.media.C4983ax.f11310h     // Catch:{ Exception -> 0x009d }
                int r1 = r1.pingTimeout     // Catch:{ Exception -> 0x009d }
                int r1 = r1 * 1000
                r0.f12133l = r1     // Catch:{ Exception -> 0x009d }
                long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x009d }
                com.inmobi.media.ge r3 = new com.inmobi.media.ge     // Catch:{ Exception -> 0x009d }
                r3.<init>(r0)     // Catch:{ Exception -> 0x009d }
                com.inmobi.media.gd r3 = r3.mo40629a()     // Catch:{ Exception -> 0x009d }
                com.inmobi.media.hy r4 = com.inmobi.media.C5369hy.m12420a()     // Catch:{ Exception -> 0x0068 }
                long r5 = r0.mo40623h()     // Catch:{ Exception -> 0x0068 }
                r4.mo40732a(r5)     // Catch:{ Exception -> 0x0068 }
                com.inmobi.media.hy r0 = com.inmobi.media.C5369hy.m12420a()     // Catch:{ Exception -> 0x0068 }
                long r4 = r3.mo40628d()     // Catch:{ Exception -> 0x0068 }
                r0.mo40733b(r4)     // Catch:{ Exception -> 0x0068 }
                com.inmobi.media.hy r0 = com.inmobi.media.C5369hy.m12420a()     // Catch:{ Exception -> 0x0068 }
                long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0068 }
                long r4 = r4 - r1
                r0.mo40734c(r4)     // Catch:{ Exception -> 0x0068 }
                goto L_0x006b
            L_0x0068:
                java.lang.String unused = com.inmobi.media.C4983ax.f11303a     // Catch:{ Exception -> 0x009d }
            L_0x006b:
                boolean r0 = r3.mo40624a()     // Catch:{ Exception -> 0x009d }
                if (r0 == 0) goto L_0x0097
                com.inmobi.media.gb r0 = r3.f12145a     // Catch:{ Exception -> 0x009d }
                int r0 = r0.f12120a     // Catch:{ Exception -> 0x009d }
                r1 = -9
                if (r1 != r0) goto L_0x007f
                com.inmobi.media.ax$e r0 = r7.f11344a     // Catch:{ Exception -> 0x009d }
                r0.mo40141a(r8)     // Catch:{ Exception -> 0x009d }
                return
            L_0x007f:
                boolean r1 = r8.f11300i     // Catch:{ Exception -> 0x009d }
                if (r1 != 0) goto L_0x0091
                r1 = 303(0x12f, float:4.25E-43)
                if (r1 == r0) goto L_0x008b
                r1 = 302(0x12e, float:4.23E-43)
                if (r1 != r0) goto L_0x0091
            L_0x008b:
                com.inmobi.media.ax$e r0 = r7.f11344a     // Catch:{ Exception -> 0x009d }
                r0.mo40141a(r8)     // Catch:{ Exception -> 0x009d }
                return
            L_0x0091:
                com.inmobi.media.ax$e r0 = r7.f11344a     // Catch:{ Exception -> 0x009d }
                r0.mo40142b(r8)     // Catch:{ Exception -> 0x009d }
                return
            L_0x0097:
                com.inmobi.media.ax$e r0 = r7.f11344a     // Catch:{ Exception -> 0x009d }
                r0.mo40141a(r8)     // Catch:{ Exception -> 0x009d }
                return
            L_0x009d:
                java.lang.String unused = com.inmobi.media.C4983ax.f11303a
                com.inmobi.media.ax$e r0 = r7.f11344a
                com.inmobi.media.gb r1 = new com.inmobi.media.gb
                r2 = -1
                java.lang.String r3 = "Unknown error"
                r1.<init>(r2, r3)
                r0.mo40142b(r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4983ax.C5000d.mo40156a(com.inmobi.media.av):void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static HashMap<String, String> m11346c(C4981av avVar) {
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            int i = (f11310h.maxRetries - avVar.f11297f) + 1;
            if (i > 0) {
                hashMap.put("X-im-retry-count", String.valueOf(i));
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }

    /* renamed from: com.inmobi.media.ax$c */
    /* compiled from: ClickManager */
    static final class C4995c {

        /* renamed from: a */
        C5001e f11333a;

        public C4995c(C5001e eVar) {
            this.f11333a = eVar;
        }

        /* renamed from: a */
        public final void mo40144a(final C4981av avVar) {
            avVar.f11298g.set(false);
            final Handler handler = new Handler(Looper.getMainLooper());
            handler.post(new Runnable() {
                public final void run() {
                    C5299gc gcVar = new C5299gc("GET", avVar.f11293b);
                    gcVar.f12142u = false;
                    gcVar.f12136o = false;
                    HashMap b = C4983ax.m11346c(avVar);
                    if (!b.isEmpty()) {
                        gcVar.mo40614a((Map<String, String>) b);
                    }
                    C5303gg ggVar = new C5303gg(gcVar, new WebViewClient() {

                        /* renamed from: a */
                        AtomicBoolean f11337a = new AtomicBoolean(false);

                        /* renamed from: b */
                        boolean f11338b;

                        /* renamed from: c */
                        boolean f11339c;

                        public final void onPageStarted(final WebView webView, String str, Bitmap bitmap) {
                            this.f11339c = true;
                            this.f11338b = false;
                            new Thread(new Runnable() {
                                public final void run() {
                                    try {
                                        Thread.sleep((long) (C4983ax.f11310h.pingTimeout * 1000));
                                    } catch (InterruptedException unused) {
                                    }
                                    if (!C49971.this.f11337a.get()) {
                                        String unused2 = C4983ax.f11303a;
                                        avVar.f11298g.set(true);
                                        handler.post(new Runnable() {
                                            public final void run() {
                                                try {
                                                    C5303gg.C5304a aVar = (C5303gg.C5304a) webView;
                                                    if (aVar != null && !aVar.f12155a) {
                                                        webView.stopLoading();
                                                    }
                                                } catch (Throwable th) {
                                                    C5275fn.m12068a().mo40590a(new C5308gk(th));
                                                }
                                            }
                                        });
                                        C4995c.this.f11333a.mo40142b(avVar);
                                    }
                                }
                            }).start();
                        }

                        public final void onPageFinished(WebView webView, String str) {
                            this.f11337a.set(true);
                            if (!this.f11338b && !avVar.f11298g.get()) {
                                C4995c.this.f11333a.mo40141a(avVar);
                            }
                        }

                        public final void onReceivedError(WebView webView, int i, String str, String str2) {
                            this.f11338b = true;
                            C4995c.this.f11333a.mo40142b(avVar);
                        }

                        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                            this.f11338b = true;
                            C4995c.this.f11333a.mo40142b(avVar);
                        }

                        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                            this.f11338b = true;
                            C4995c.this.f11333a.mo40142b(avVar);
                        }

                        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                            return Build.VERSION.SDK_INT >= 21 && !avVar.f11300i && !webResourceRequest.getUrl().toString().equals(avVar.f11293b);
                        }

                        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                            return !avVar.f11300i && !str.equals(avVar.f11293b);
                        }

                        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                            if (Build.VERSION.SDK_INT < 26) {
                                return false;
                            }
                            webView.destroy();
                            return true;
                        }
                    });
                    try {
                        ggVar.f12154c = new C5303gg.C5304a(ggVar, C5314go.m12203c());
                        ggVar.f12154c.setWebViewClient(ggVar.f12153b);
                        ggVar.f12154c.getSettings().setJavaScriptEnabled(true);
                        ggVar.f12154c.getSettings().setCacheMode(2);
                        ggVar.f12154c.loadUrl(ggVar.f12152a.mo40621f(), ggVar.f12152a.mo40620e());
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    /* renamed from: com.inmobi.media.ax$b */
    /* compiled from: ClickManager */
    final class C4992b extends Handler {
        public C4992b(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            Message message2 = message;
            try {
                int i = message2.what;
                int i2 = 3;
                if (i == 1) {
                    String str = null;
                    if (!((C5261fk) C5239ey.m11987a("root", C5314go.m12211f(), (C5239ey.C5242c) null)).mo40585i()) {
                        C4982aw unused = C4983ax.f11308f;
                        int i3 = C4983ax.f11310h.maxEventBatch;
                        int i4 = C4983ax.f11310h.pingInterval;
                        ArrayList arrayList = new ArrayList();
                        C5306gi a = C5306gi.m12146a();
                        if (a.mo40633a("click") != 0) {
                            if (-1 != i3) {
                                str = Integer.toString(i3);
                            }
                            String[] strArr = C4982aw.f11301a;
                            List<ContentValues> a2 = a.mo40636a("click", strArr, (String) null, (String[]) null, "ts", "ts < " + (System.currentTimeMillis() - ((long) i4)), "ts ASC ", str);
                            a.mo40641b();
                            for (ContentValues a3 : a2) {
                                arrayList.add(C4982aw.m11332a(a3));
                            }
                        }
                        List unused2 = C4983ax.f11307e = arrayList;
                        if (C4983ax.f11307e.isEmpty()) {
                            C4982aw unused3 = C4983ax.f11308f;
                            if (C4982aw.m11335a()) {
                                C4983ax.f11309g.set(false);
                                return;
                            }
                            Message obtain = Message.obtain();
                            obtain.what = 1;
                            sendMessageDelayed(obtain, (long) (C4983ax.f11310h.pingInterval * 1000));
                            return;
                        }
                        C4981av avVar = (C4981av) C4983ax.f11307e.get(0);
                        Message obtain2 = Message.obtain();
                        obtain2.what = avVar.f11299h ? 3 : 2;
                        obtain2.obj = avVar;
                        long currentTimeMillis = System.currentTimeMillis() - avVar.f11295d;
                        if (currentTimeMillis < ((long) (C4983ax.f11310h.pingInterval * 1000))) {
                            sendMessageDelayed(obtain2, ((long) (C4983ax.f11310h.pingInterval * 1000)) - currentTimeMillis);
                        } else {
                            sendMessage(obtain2);
                        }
                    }
                } else if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            String unused4 = C4983ax.f11303a;
                            int i5 = message2.what;
                            return;
                        }
                        C4981av avVar2 = (C4981av) message2.obj;
                        String unused5 = C4983ax.f11303a;
                        C4982aw unused6 = C4983ax.f11308f;
                        C4982aw.m11334a(avVar2);
                        C4983ax.f11307e.remove(avVar2);
                        if (C4983ax.f11307e.isEmpty()) {
                            C4982aw unused7 = C4983ax.f11308f;
                            if (C4982aw.m11335a()) {
                                String unused8 = C4983ax.f11303a;
                                C4983ax.f11309g.set(false);
                                return;
                            }
                            Message obtain3 = Message.obtain();
                            obtain3.what = 1;
                            sendMessage(obtain3);
                            return;
                        }
                        C4981av avVar3 = (C4981av) C4983ax.f11307e.get(0);
                        Message obtain4 = Message.obtain();
                        if (!avVar3.f11299h) {
                            i2 = 2;
                        }
                        obtain4.what = i2;
                        obtain4.obj = avVar3;
                        sendMessage(obtain4);
                    } else if (!C5328gx.m12274a()) {
                        C4983ax.f11309g.set(false);
                        C4983ax.m11352i();
                    } else {
                        C4981av avVar4 = (C4981av) message2.obj;
                        if (avVar4.f11297f != 0 && !avVar4.mo40131a(C4983ax.f11310h.pingCacheExpiry)) {
                            if ((C4983ax.f11310h.maxRetries - avVar4.f11297f) + 1 == 0) {
                                String unused9 = C4983ax.f11303a;
                            } else {
                                String unused10 = C4983ax.f11303a;
                            }
                            new C4995c(new C5001e() {
                                /* renamed from: a */
                                public final void mo40141a(C4981av avVar) {
                                    C4992b.m11362a(C4992b.this, avVar);
                                }

                                /* renamed from: b */
                                public final void mo40142b(C4981av avVar) {
                                    String unused = C4983ax.f11303a;
                                    C4983ax.m11342a(avVar);
                                    C4992b.m11363b(C4992b.this, avVar);
                                }
                            }).mo40144a(avVar4);
                        }
                    }
                } else if (!C5328gx.m12274a()) {
                    C4983ax.f11309g.set(false);
                    C4983ax.m11352i();
                } else {
                    C4981av avVar5 = (C4981av) message2.obj;
                    if (avVar5.f11297f != 0 && !avVar5.mo40131a(C4983ax.f11310h.pingCacheExpiry)) {
                        if ((C4983ax.f11310h.maxRetries - avVar5.f11297f) + 1 == 0) {
                            String unused11 = C4983ax.f11303a;
                        } else {
                            String unused12 = C4983ax.f11303a;
                        }
                        new C5000d(new C5001e() {
                            /* renamed from: a */
                            public final void mo40141a(C4981av avVar) {
                                C4992b.m11362a(C4992b.this, avVar);
                            }

                            /* renamed from: b */
                            public final void mo40142b(C4981av avVar) {
                                String unused = C4983ax.f11303a;
                                C4983ax.m11342a(avVar);
                                C4992b.m11363b(C4992b.this, avVar);
                            }
                        }).mo40156a(avVar5);
                    }
                }
            } catch (Exception unused13) {
                String unused14 = C4983ax.f11303a;
            }
        }

        /* renamed from: a */
        static /* synthetic */ void m11362a(C4992b bVar, C4981av avVar) {
            Message obtain = Message.obtain();
            obtain.what = 4;
            obtain.obj = avVar;
            bVar.sendMessage(obtain);
        }

        /* renamed from: b */
        static /* synthetic */ void m11363b(C4992b bVar, C4981av avVar) {
            int indexOf = C4983ax.f11307e.indexOf(avVar);
            if (-1 != indexOf) {
                C4981av avVar2 = (C4981av) C4983ax.f11307e.get(indexOf == C4983ax.f11307e.size() + -1 ? 0 : indexOf + 1);
                Message obtain = Message.obtain();
                obtain.what = avVar2.f11299h ? 3 : 2;
                obtain.obj = avVar2;
                if (System.currentTimeMillis() - avVar2.f11295d < ((long) (C4983ax.f11310h.pingInterval * 1000))) {
                    bVar.sendMessageDelayed(obtain, (long) (C4983ax.f11310h.pingInterval * 1000));
                } else {
                    bVar.sendMessage(obtain);
                }
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m11343a(C4983ax axVar, final C4981av avVar) {
        f11308f.mo40132a(avVar, f11310h.maxDbEvents);
        if (!C5328gx.m12274a()) {
            f11309g.set(false);
            m11352i();
            return;
        }
        f11304b.submit(new Runnable() {
            public final void run() {
                long unused = C4983ax.this.f11312j = SystemClock.elapsedRealtime();
                if (avVar.f11299h) {
                    new C4995c(C4983ax.this.f11313k).mo40144a(avVar);
                } else {
                    new C5000d(C4983ax.this.f11313k).mo40156a(avVar);
                }
            }
        });
    }

    /* renamed from: a */
    static /* synthetic */ void m11342a(C4981av avVar) {
        if (avVar.f11297f > 0) {
            avVar.f11297f--;
            avVar.f11295d = System.currentTimeMillis();
            C5306gi a = C5306gi.m12146a();
            a.mo40639b("click", C4982aw.m11336b(avVar), "id = ?", new String[]{String.valueOf(avVar.f11292a)});
            a.mo40641b();
        }
    }
}
