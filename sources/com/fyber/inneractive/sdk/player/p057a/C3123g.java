package com.fyber.inneractive.sdk.player.p057a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.p034a.C2767s;
import com.fyber.inneractive.sdk.config.p034a.p035a.C2746f;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.p049h.C2972o;
import com.fyber.inneractive.sdk.p051j.C3018e;
import com.fyber.inneractive.sdk.player.p057a.C3104b;
import com.fyber.inneractive.sdk.player.p057a.C3106c;
import com.fyber.inneractive.sdk.util.C3626ag;
import com.fyber.inneractive.sdk.util.C3627ah;
import com.fyber.inneractive.sdk.util.C3662m;
import com.fyber.inneractive.sdk.util.IAlog;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.tapjoy.TJAdUnitConstants;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.fyber.inneractive.sdk.player.a.g */
public final class C3123g implements C3627ah {

    /* renamed from: a */
    String f7707a = ("MediaDownloader-" + hashCode());

    /* renamed from: b */
    C3106c f7708b;

    /* renamed from: c */
    C3106c.C3113d f7709c;

    /* renamed from: d */
    C3104b f7710d;

    /* renamed from: e */
    final String f7711e;

    /* renamed from: f */
    C3103a f7712f;

    /* renamed from: g */
    C3134e f7713g;

    /* renamed from: h */
    C3131b f7714h;

    /* renamed from: i */
    Handler f7715i;

    /* renamed from: j */
    final Object f7716j = new Object();

    /* renamed from: k */
    String f7717k;

    /* renamed from: l */
    boolean f7718l = false;

    /* renamed from: m */
    boolean f7719m = false;

    /* renamed from: n */
    boolean f7720n = false;

    /* renamed from: o */
    public C3133d f7721o;

    /* renamed from: p */
    final C2767s f7722p;

    /* renamed from: q */
    private HandlerThread f7723q;

    /* renamed from: r */
    private volatile boolean f7724r = false;

    /* renamed from: s */
    private String f7725s = null;

    /* renamed from: com.fyber.inneractive.sdk.player.a.g$d */
    public interface C3133d {
        /* renamed from: a */
        void mo18727a(File file);

        /* renamed from: b */
        boolean mo18728b(File file);
    }

    /* renamed from: com.fyber.inneractive.sdk.player.a.g$e */
    public interface C3134e {
        /* renamed from: a */
        void mo18706a(C3103a aVar, Exception exc);
    }

    private C3123g(C3106c cVar, String str, C3104b bVar, int i, C2767s sVar) {
        this.f7708b = cVar;
        this.f7711e = str;
        this.f7717k = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(this.f7711e).toLowerCase(Locale.US));
        this.f7710d = bVar;
        this.f7722p = sVar;
        this.f7714h = new C3131b(String.format("MediaDownloader-%s-A", new Object[]{mo18720d()}), i);
        this.f7723q = new HandlerThread(String.format("MediaDownloader-%s-A", new Object[]{mo18720d()}));
    }

    /* renamed from: a */
    static C3123g m7383a(C3106c cVar, String str, int i, C2767s sVar, C3134e eVar) {
        C2746f fVar;
        C3104b bVar;
        int i2 = 0;
        boolean a = IAConfigManager.m5929c().f6586a.mo18049a("validateHasVideoTracks", false);
        if (sVar == null) {
            fVar = null;
        } else {
            fVar = (C2746f) sVar.mo18010a(C2746f.class);
        }
        if (fVar != null) {
            int[] iArr = C31296.f7732a;
            C2746f.C2749b bVar2 = C2746f.C2749b.LEGACY;
            String a2 = fVar.mo17982a("v_type", C2746f.C2749b.LEGACY.f6482d);
            C2746f.C2749b[] values = C2746f.C2749b.values();
            int length = values.length;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                C2746f.C2749b bVar3 = values[i2];
                if (TextUtils.equals(bVar3.f6482d, a2.toLowerCase(Locale.US))) {
                    bVar2 = bVar3;
                    break;
                }
                i2++;
            }
            int i3 = iArr[bVar2.ordinal()];
            bVar = i3 != 1 ? i3 != 2 ? new C3136i(a) : new C3135h() : new C3137j();
        } else {
            bVar = new C3136i(a);
        }
        C3123g gVar = new C3123g(cVar, str, bVar, i, sVar);
        gVar.f7713g = eVar;
        return gVar;
    }

    /* renamed from: com.fyber.inneractive.sdk.player.a.g$6 */
    static /* synthetic */ class C31296 {

        /* renamed from: a */
        static final /* synthetic */ int[] f7732a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.fyber.inneractive.sdk.config.a.a.f$b[] r0 = com.fyber.inneractive.sdk.config.p034a.p035a.C2746f.C2749b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7732a = r0
                com.fyber.inneractive.sdk.config.a.a.f$b r1 = com.fyber.inneractive.sdk.config.p034a.p035a.C2746f.C2749b.NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7732a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fyber.inneractive.sdk.config.a.a.f$b r1 = com.fyber.inneractive.sdk.config.p034a.p035a.C2746f.C2749b.EXTRACTOR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f7732a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fyber.inneractive.sdk.config.a.a.f$b r1 = com.fyber.inneractive.sdk.config.p034a.p035a.C2746f.C2749b.LEGACY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p057a.C3123g.C31296.<clinit>():void");
        }
    }

    /* renamed from: a */
    public final void mo18715a() {
        this.f7720n = true;
        HandlerThread handlerThread = this.f7723q;
        if (handlerThread != null) {
            handlerThread.start();
            C3626ag agVar = new C3626ag(this.f7723q.getLooper(), this);
            this.f7715i = agVar;
            agVar.post(new Runnable() {
                public final void run() {
                    try {
                        C3123g.this.f7709c = C3123g.this.f7708b.mo18680a(C3123g.this.mo18720d());
                        if (C3123g.this.f7709c == null) {
                            C3106c.C3109a c = C3123g.this.f7708b.mo18683c(C3123g.this.mo18720d());
                            if (c == null) {
                                C3123g.this.f7718l = true;
                            }
                            if (c != null) {
                                IAlog.m9033a("%s | start | got an editor for %s", C3123g.this.f7707a, C3123g.this.mo18720d());
                                c.mo18691b();
                            }
                        }
                    } catch (IOException e) {
                        IAlog.m9032a(String.format("%s | Exception raised starting a new caching process for %s", new Object[]{C3123g.this.f7707a, C3123g.this.mo18720d()}), (Throwable) e, new Object[0]);
                        C2972o.m6654a("Exception raised starting a new caching process", e.getMessage(), (InneractiveAdRequest) null, (C3018e) null);
                    }
                    if (C3123g.this.f7709c != null || C3123g.this.f7718l) {
                        C3123g.m7385a(C3123g.this, true);
                    } else if (C3123g.this.f7714h != null) {
                        C3123g.this.f7714h.start();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo18718b() {
        C3662m.m9137a().post(new Runnable() {
            public final void run() {
                if (C3123g.this.f7713g != null) {
                    C3123g.this.f7713g.mo18706a(C3123g.this.f7712f, (Exception) null);
                }
            }
        });
    }

    /* renamed from: a */
    private void m7386a(final Exception exc) {
        C3662m.m9137a().post(new Runnable() {
            public final void run() {
                if (C3123g.this.f7713g != null) {
                    C3123g.this.f7713g.mo18706a(C3123g.this.f7712f, exc);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo18717a(boolean z) {
        C3131b bVar = this.f7714h;
        if (bVar != null) {
            bVar.f7733a.compareAndSet(false, true);
            this.f7714h = null;
        }
        HandlerThread handlerThread = this.f7723q;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        this.f7715i = null;
        if (z) {
            try {
                this.f7708b.mo18687d(mo18720d());
            } catch (IOException e) {
                IAlog.m9032a("failed to remove cache key", (Throwable) e, new Object[0]);
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.a.g$b */
    private class C3131b extends Thread {

        /* renamed from: a */
        AtomicBoolean f7733a = new AtomicBoolean(false);

        /* renamed from: c */
        private InputStream f7735c;

        /* renamed from: d */
        private boolean f7736d = false;

        /* renamed from: e */
        private boolean f7737e = false;

        /* renamed from: f */
        private long f7738f = -1;

        /* renamed from: g */
        private long f7739g = 0;

        /* renamed from: h */
        private C3106c.C3109a f7740h;

        /* renamed from: i */
        private int f7741i;

        /* renamed from: j */
        private int f7742j;

        /* renamed from: k */
        private int f7743k;

        /* renamed from: l */
        private int f7744l;

        C3131b(String str, int i) {
            super(str);
            this.f7741i = i;
            this.f7742j = C3123g.this.f7722p != null ? ((C2746f) C3123g.this.f7722p.mo18010a(C2746f.class)).mo17981a("dl_retries", 10) : 10;
            this.f7743k = C3123g.this.f7722p != null ? ((C2746f) C3123g.this.f7722p.mo18010a(C2746f.class)).mo17981a("dl_retry_delay", (int) TJAdUnitConstants.DEFAULT_VOLUME_CHECK_INTERVAL) : TJAdUnitConstants.DEFAULT_VOLUME_CHECK_INTERVAL;
            this.f7744l = C3123g.this.f7722p != null ? ((C2746f) C3123g.this.f7722p.mo18010a(C2746f.class)).mo17981a("second_checkpoint", 25) : 25;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(11:82|83|86|87|88|89|90|91|92|(1:94)|95) */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x01c4, code lost:
            if (r15 != null) goto L_0x01c6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
            r15.disconnect();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x020f, code lost:
            if (r15 == null) goto L_0x01c9;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x007b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x01f7 */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x00af A[Catch:{ c -> 0x00ce, all -> 0x007b, all -> 0x01d4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00b1 A[Catch:{ c -> 0x00ce, all -> 0x007b, all -> 0x01d4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x01fd A[Catch:{ all -> 0x0212, all -> 0x021b }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r19 = this;
                r8 = r19
                java.lang.String r0 = "%s | Starting a fresh download for %s"
                r9 = 2
                java.lang.Object[] r1 = new java.lang.Object[r9]
                com.fyber.inneractive.sdk.player.a.g r2 = com.fyber.inneractive.sdk.player.p057a.C3123g.this
                java.lang.String r2 = r2.f7707a
                r10 = 0
                r1[r10] = r2
                com.fyber.inneractive.sdk.player.a.g r2 = com.fyber.inneractive.sdk.player.p057a.C3123g.this
                java.lang.String r2 = r2.mo18720d()
                r11 = 1
                r1[r11] = r2
                com.fyber.inneractive.sdk.util.IAlog.m9033a(r0, r1)
                com.fyber.inneractive.sdk.util.c r0 = com.fyber.inneractive.sdk.util.C3645c.m9069a()
                java.nio.ByteBuffer r12 = r0.mo19569b()
                r13 = 0
                java.net.URL r0 = new java.net.URL     // Catch:{ all -> 0x01d9 }
                com.fyber.inneractive.sdk.player.a.g r1 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x01d9 }
                java.lang.String r1 = r1.f7711e     // Catch:{ all -> 0x01d9 }
                r0.<init>(r1)     // Catch:{ all -> 0x01d9 }
                java.lang.String r1 = "%s | opening an editor for %s"
                java.lang.Object[] r2 = new java.lang.Object[r9]     // Catch:{ all -> 0x01d9 }
                com.fyber.inneractive.sdk.player.a.g r3 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x01d9 }
                java.lang.String r3 = r3.f7707a     // Catch:{ all -> 0x01d9 }
                r2[r10] = r3     // Catch:{ all -> 0x01d9 }
                com.fyber.inneractive.sdk.player.a.g r3 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x01d9 }
                java.lang.String r3 = r3.mo18720d()     // Catch:{ all -> 0x01d9 }
                r2[r11] = r3     // Catch:{ all -> 0x01d9 }
                com.fyber.inneractive.sdk.util.IAlog.m9033a(r1, r2)     // Catch:{ all -> 0x01d9 }
                com.fyber.inneractive.sdk.player.a.g r1 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x01d9 }
                com.fyber.inneractive.sdk.player.a.c r1 = r1.f7708b     // Catch:{ all -> 0x01d9 }
                com.fyber.inneractive.sdk.player.a.g r2 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x01d9 }
                java.lang.String r2 = r2.mo18720d()     // Catch:{ all -> 0x01d9 }
                com.fyber.inneractive.sdk.player.a.c$a r1 = r1.mo18683c((java.lang.String) r2)     // Catch:{ all -> 0x01d9 }
                r8.f7740h = r1     // Catch:{ all -> 0x01d9 }
                java.io.OutputStream r14 = r1.mo18690a()     // Catch:{ all -> 0x01d9 }
                int r1 = r8.f7742j     // Catch:{ all -> 0x01d6 }
                int r1 = r1 - r11
                r15 = r13
            L_0x0059:
                if (r1 <= 0) goto L_0x00d0
                java.util.concurrent.atomic.AtomicBoolean r2 = r8.f7733a     // Catch:{ all -> 0x01d4 }
                boolean r2 = r2.compareAndSet(r10, r10)     // Catch:{ all -> 0x01d4 }
                if (r2 == 0) goto L_0x00d0
                if (r15 == 0) goto L_0x0068
                r15.disconnect()     // Catch:{ all -> 0x0068 }
            L_0x0068:
                int r16 = r1 + -1
                long r17 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01d4 }
                long r5 = r8.f7738f     // Catch:{ c -> 0x00ce, all -> 0x007b }
                int r7 = r8.f7741i     // Catch:{ c -> 0x00ce, all -> 0x007b }
                r1 = r19
                r2 = r14
                r3 = r0
                r4 = r12
                java.net.HttpURLConnection r15 = r1.m7395a(r2, r3, r4, r5, r7)     // Catch:{ c -> 0x00ce, all -> 0x007b }
            L_0x007b:
                java.io.InputStream r1 = r8.f7735c     // Catch:{ all -> 0x01d4 }
                com.fyber.inneractive.sdk.player.p057a.C3142m.m7409a((java.io.Closeable) r1)     // Catch:{ all -> 0x01d4 }
                java.lang.String r1 = "%s Downloaded %d out of %d for key %s"
                r2 = 4
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x01d4 }
                com.fyber.inneractive.sdk.player.a.g r3 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x01d4 }
                java.lang.String r3 = r3.f7707a     // Catch:{ all -> 0x01d4 }
                r2[r10] = r3     // Catch:{ all -> 0x01d4 }
                long r3 = r8.f7738f     // Catch:{ all -> 0x01d4 }
                java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x01d4 }
                r2[r11] = r3     // Catch:{ all -> 0x01d4 }
                long r3 = r8.f7739g     // Catch:{ all -> 0x01d4 }
                java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x01d4 }
                r2[r9] = r3     // Catch:{ all -> 0x01d4 }
                r3 = 3
                com.fyber.inneractive.sdk.player.a.g r4 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x01d4 }
                java.lang.String r4 = r4.mo18720d()     // Catch:{ all -> 0x01d4 }
                r2[r3] = r4     // Catch:{ all -> 0x01d4 }
                com.fyber.inneractive.sdk.util.IAlog.m9033a(r1, r2)     // Catch:{ all -> 0x01d4 }
                long r1 = r8.f7738f     // Catch:{ all -> 0x01d4 }
                long r3 = r8.f7739g     // Catch:{ all -> 0x01d4 }
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 < 0) goto L_0x00b1
                r1 = 0
                goto L_0x0059
            L_0x00b1:
                long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01d4 }
                long r1 = r1 - r17
                int r3 = r8.f7743k     // Catch:{ all -> 0x01d4 }
                long r3 = (long) r3     // Catch:{ all -> 0x01d4 }
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 >= 0) goto L_0x00cb
                int r1 = r8.f7743k     // Catch:{ all -> 0x01d4 }
                long r1 = (long) r1     // Catch:{ all -> 0x01d4 }
                long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01d4 }
                long r3 = r3 - r17
                long r1 = r1 - r3
                java.lang.Thread.sleep(r1)     // Catch:{ all -> 0x01d4 }
            L_0x00cb:
                r1 = r16
                goto L_0x0059
            L_0x00ce:
                r0 = move-exception
                throw r0     // Catch:{ all -> 0x01d4 }
            L_0x00d0:
                com.fyber.inneractive.sdk.player.a.g r0 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x01d4 }
                java.lang.Object r1 = r0.f7716j     // Catch:{ all -> 0x01d4 }
                monitor-enter(r1)     // Catch:{ all -> 0x01d4 }
                long r2 = r8.f7739g     // Catch:{ all -> 0x01d1 }
                long r4 = r8.f7738f     // Catch:{ all -> 0x01d1 }
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 > 0) goto L_0x0173
                java.util.concurrent.atomic.AtomicBoolean r0 = r8.f7733a     // Catch:{ all -> 0x01d1 }
                boolean r0 = r0.compareAndSet(r11, r11)     // Catch:{ all -> 0x01d1 }
                if (r0 == 0) goto L_0x00e7
                goto L_0x0173
            L_0x00e7:
                java.lang.String r0 = "%s | committing to cache - %s"
                java.lang.Object[] r2 = new java.lang.Object[r9]     // Catch:{ all -> 0x01d1 }
                com.fyber.inneractive.sdk.player.a.g r3 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x01d1 }
                java.lang.String r3 = r3.f7707a     // Catch:{ all -> 0x01d1 }
                r2[r10] = r3     // Catch:{ all -> 0x01d1 }
                com.fyber.inneractive.sdk.player.a.g r3 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x01d1 }
                java.lang.String r3 = r3.mo18720d()     // Catch:{ all -> 0x01d1 }
                r2[r11] = r3     // Catch:{ all -> 0x01d1 }
                com.fyber.inneractive.sdk.util.IAlog.m9033a(r0, r2)     // Catch:{ all -> 0x01d1 }
                com.fyber.inneractive.sdk.player.p057a.C3142m.m7409a((java.io.Closeable) r14)     // Catch:{ all -> 0x01d1 }
                com.fyber.inneractive.sdk.player.a.g r0 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x01d1 }
                com.fyber.inneractive.sdk.player.a.a r0 = r0.f7712f     // Catch:{ all -> 0x01d1 }
                if (r0 == 0) goto L_0x014e
                com.fyber.inneractive.sdk.player.a.g r0 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x01d1 }
                com.fyber.inneractive.sdk.player.a.a r0 = r0.f7712f     // Catch:{ all -> 0x01d1 }
                java.lang.Object r2 = r0.f7628e     // Catch:{ all -> 0x01d1 }
                monitor-enter(r2)     // Catch:{ all -> 0x01d1 }
                com.fyber.inneractive.sdk.player.a.c$a r0 = r8.f7740h     // Catch:{ all -> 0x014b }
                boolean r3 = r0.f7657c     // Catch:{ all -> 0x014b }
                if (r3 == 0) goto L_0x0121
                com.fyber.inneractive.sdk.player.a.c r3 = com.fyber.inneractive.sdk.player.p057a.C3106c.this     // Catch:{ all -> 0x014b }
                r3.m7335a(r0, r10)     // Catch:{ all -> 0x014b }
                com.fyber.inneractive.sdk.player.a.c r3 = com.fyber.inneractive.sdk.player.p057a.C3106c.this     // Catch:{ all -> 0x014b }
                com.fyber.inneractive.sdk.player.a.c$b r4 = r0.f7655a     // Catch:{ all -> 0x014b }
                java.lang.String r4 = r4.f7661a     // Catch:{ all -> 0x014b }
                r3.mo18687d((java.lang.String) r4)     // Catch:{ all -> 0x014b }
                goto L_0x0126
            L_0x0121:
                com.fyber.inneractive.sdk.player.a.c r3 = com.fyber.inneractive.sdk.player.p057a.C3106c.this     // Catch:{ all -> 0x014b }
                r3.m7335a(r0, r11)     // Catch:{ all -> 0x014b }
            L_0x0126:
                r0.f7658d = r11     // Catch:{ all -> 0x014b }
                com.fyber.inneractive.sdk.player.a.g r0 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x014b }
                com.fyber.inneractive.sdk.player.a.c r0 = r0.f7708b     // Catch:{ all -> 0x014b }
                r0.mo18684c()     // Catch:{ all -> 0x014b }
                com.fyber.inneractive.sdk.player.a.g r0 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x014b }
                com.fyber.inneractive.sdk.player.a.a r0 = r0.f7712f     // Catch:{ all -> 0x014b }
                com.fyber.inneractive.sdk.player.a.g r3 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x014b }
                com.fyber.inneractive.sdk.player.a.c r3 = r3.f7708b     // Catch:{ all -> 0x014b }
                com.fyber.inneractive.sdk.player.a.g r4 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x014b }
                java.lang.String r4 = r4.mo18720d()     // Catch:{ all -> 0x014b }
                java.io.File r3 = r3.mo18681b((java.lang.String) r4)     // Catch:{ all -> 0x014b }
                r0.f7624a = r3     // Catch:{ all -> 0x014b }
                monitor-exit(r2)     // Catch:{ all -> 0x014b }
                com.fyber.inneractive.sdk.player.a.g r0 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x01d1 }
                com.fyber.inneractive.sdk.player.a.a r0 = r0.f7712f     // Catch:{ all -> 0x01d1 }
                r0.f7626c = r10     // Catch:{ all -> 0x01d1 }
                goto L_0x019a
            L_0x014b:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x014b }
                throw r0     // Catch:{ all -> 0x01d1 }
            L_0x014e:
                com.fyber.inneractive.sdk.player.a.g r0 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x01d1 }
                com.fyber.inneractive.sdk.player.a.g r2 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x01d1 }
                java.lang.String r2 = r2.mo18720d()     // Catch:{ all -> 0x01d1 }
                com.fyber.inneractive.sdk.player.a.g r3 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x01d1 }
                java.lang.String r3 = r3.f7711e     // Catch:{ all -> 0x01d1 }
                com.fyber.inneractive.sdk.player.a.g r4 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x01d1 }
                com.fyber.inneractive.sdk.player.a.c r4 = r4.f7708b     // Catch:{ all -> 0x01d1 }
                com.fyber.inneractive.sdk.player.a.g r5 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x01d1 }
                java.lang.String r5 = r5.mo18720d()     // Catch:{ all -> 0x01d1 }
                java.io.File r4 = r4.mo18681b((java.lang.String) r5)     // Catch:{ all -> 0x01d1 }
                com.fyber.inneractive.sdk.player.a.g r5 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x01d1 }
                java.lang.String r5 = r5.f7717k     // Catch:{ all -> 0x01d1 }
                com.fyber.inneractive.sdk.player.a.a r2 = com.fyber.inneractive.sdk.player.p057a.C3103a.m7325a(r2, r3, r4, r11, r5)     // Catch:{ all -> 0x01d1 }
                r0.f7712f = r2     // Catch:{ all -> 0x01d1 }
                goto L_0x019a
            L_0x0173:
                com.fyber.inneractive.sdk.player.a.c$a r0 = r8.f7740h     // Catch:{ all -> 0x01d1 }
                r0.mo18691b()     // Catch:{ all -> 0x01d1 }
                com.fyber.inneractive.sdk.player.a.g r0 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x01d1 }
                com.fyber.inneractive.sdk.player.a.c r0 = r0.f7708b     // Catch:{ all -> 0x01d1 }
                com.fyber.inneractive.sdk.player.a.g r2 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x01d1 }
                java.lang.String r2 = r2.mo18720d()     // Catch:{ all -> 0x01d1 }
                r0.mo18687d((java.lang.String) r2)     // Catch:{ all -> 0x01d1 }
                java.lang.String r0 = "%s | aborting cache - %s"
                java.lang.Object[] r2 = new java.lang.Object[r9]     // Catch:{ all -> 0x01d1 }
                com.fyber.inneractive.sdk.player.a.g r3 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x01d1 }
                java.lang.String r3 = r3.f7707a     // Catch:{ all -> 0x01d1 }
                r2[r10] = r3     // Catch:{ all -> 0x01d1 }
                com.fyber.inneractive.sdk.player.a.g r3 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x01d1 }
                java.lang.String r3 = r3.mo18720d()     // Catch:{ all -> 0x01d1 }
                r2[r11] = r3     // Catch:{ all -> 0x01d1 }
                com.fyber.inneractive.sdk.util.IAlog.m9033a(r0, r2)     // Catch:{ all -> 0x01d1 }
            L_0x019a:
                monitor-exit(r1)     // Catch:{ all -> 0x01d1 }
                com.fyber.inneractive.sdk.player.a.g r0 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x01d4 }
                r0.f7720n = r10     // Catch:{ all -> 0x01d4 }
                if (r15 == 0) goto L_0x01a4
                r15.disconnect()     // Catch:{ all -> 0x01d4 }
            L_0x01a4:
                java.util.concurrent.atomic.AtomicBoolean r0 = r8.f7733a     // Catch:{ all -> 0x01d4 }
                boolean r0 = r0.compareAndSet(r10, r10)     // Catch:{ all -> 0x01d4 }
                if (r0 == 0) goto L_0x01c1
                com.fyber.inneractive.sdk.player.a.g r0 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x01d4 }
                android.os.Handler r0 = r0.f7715i     // Catch:{ all -> 0x01d4 }
                if (r0 == 0) goto L_0x01c1
                long r0 = r8.f7738f     // Catch:{ all -> 0x01d4 }
                long r2 = r8.f7739g     // Catch:{ all -> 0x01d4 }
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 < 0) goto L_0x01c1
                com.fyber.inneractive.sdk.player.a.g r0 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x01d4 }
                android.os.Handler r0 = r0.f7715i     // Catch:{ all -> 0x01d4 }
                r0.sendEmptyMessage(r9)     // Catch:{ all -> 0x01d4 }
            L_0x01c1:
                com.fyber.inneractive.sdk.player.p057a.C3142m.m7409a((java.io.Closeable) r14)
                if (r15 == 0) goto L_0x01c9
            L_0x01c6:
                r15.disconnect()     // Catch:{ all -> 0x01c9 }
            L_0x01c9:
                com.fyber.inneractive.sdk.util.c r0 = com.fyber.inneractive.sdk.util.C3645c.m9069a()
                r0.mo19568a(r12)
                return
            L_0x01d1:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x01d1 }
                throw r0     // Catch:{ all -> 0x01d4 }
            L_0x01d4:
                r0 = move-exception
                goto L_0x01dc
            L_0x01d6:
                r0 = move-exception
                r15 = r13
                goto L_0x01dc
            L_0x01d9:
                r0 = move-exception
                r14 = r13
                r15 = r14
            L_0x01dc:
                java.lang.String r1 = "%s | mDownloadRunnable exception raised during download"
                java.lang.Object[] r2 = new java.lang.Object[r11]     // Catch:{ all -> 0x0212 }
                com.fyber.inneractive.sdk.player.a.g r3 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x0212 }
                java.lang.String r3 = r3.f7707a     // Catch:{ all -> 0x0212 }
                r2[r10] = r3     // Catch:{ all -> 0x0212 }
                com.fyber.inneractive.sdk.util.IAlog.m9032a((java.lang.String) r1, (java.lang.Throwable) r0, (java.lang.Object[]) r2)     // Catch:{ all -> 0x0212 }
                java.lang.String r1 = "mDownloadRunnable exception raised during download"
                java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x0212 }
                com.fyber.inneractive.sdk.p049h.C2972o.m6654a(r1, r2, r13, r13)     // Catch:{ all -> 0x0212 }
                com.fyber.inneractive.sdk.player.a.c$a r1 = r8.f7740h     // Catch:{ Exception -> 0x01f7 }
                r1.mo18691b()     // Catch:{ Exception -> 0x01f7 }
            L_0x01f7:
                com.fyber.inneractive.sdk.player.a.g r1 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x0212 }
                android.os.Handler r1 = r1.f7715i     // Catch:{ all -> 0x0212 }
                if (r1 == 0) goto L_0x020c
                com.fyber.inneractive.sdk.player.a.g r1 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x0212 }
                android.os.Handler r1 = r1.f7715i     // Catch:{ all -> 0x0212 }
                com.fyber.inneractive.sdk.player.a.g r2 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x0212 }
                android.os.Handler r2 = r2.f7715i     // Catch:{ all -> 0x0212 }
                android.os.Message r0 = r2.obtainMessage(r11, r0)     // Catch:{ all -> 0x0212 }
                r1.sendMessage(r0)     // Catch:{ all -> 0x0212 }
            L_0x020c:
                com.fyber.inneractive.sdk.player.p057a.C3142m.m7409a((java.io.Closeable) r14)
                if (r15 == 0) goto L_0x01c9
                goto L_0x01c6
            L_0x0212:
                r0 = move-exception
                com.fyber.inneractive.sdk.player.p057a.C3142m.m7409a((java.io.Closeable) r14)
                if (r15 == 0) goto L_0x021b
                r15.disconnect()     // Catch:{ all -> 0x021b }
            L_0x021b:
                com.fyber.inneractive.sdk.util.c r1 = com.fyber.inneractive.sdk.util.C3645c.m9069a()
                r1.mo19568a(r12)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p057a.C3123g.C3131b.run():void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:42:0x013a  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x01ef A[EDGE_INSN: B:74:0x01ef->B:70:0x01ef ?: BREAK  , SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.net.HttpURLConnection m7395a(java.io.OutputStream r20, java.net.URL r21, java.nio.ByteBuffer r22, long r23, int r25) throws java.io.IOException, com.fyber.inneractive.sdk.player.p057a.C3123g.C3130a {
            /*
                r19 = this;
                r0 = r19
                java.net.URLConnection r1 = r21.openConnection()
                java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1
                r2 = 0
                r4 = 0
                r5 = 1
                int r6 = (r23 > r2 ? 1 : (r23 == r2 ? 0 : -1))
                if (r6 <= 0) goto L_0x0023
                java.lang.Object[] r7 = new java.lang.Object[r5]
                java.lang.Long r8 = java.lang.Long.valueOf(r23)
                r7[r4] = r8
                java.lang.String r8 = "bytes=%d-"
                java.lang.String r7 = java.lang.String.format(r8, r7)
                java.lang.String r8 = "Range"
                r1.addRequestProperty(r8, r7)
            L_0x0023:
                com.fyber.inneractive.sdk.player.a.g r7 = com.fyber.inneractive.sdk.player.p057a.C3123g.this
                com.fyber.inneractive.sdk.config.a.s r7 = r7.f7722p
                if (r7 == 0) goto L_0x005f
                com.fyber.inneractive.sdk.player.a.g r7 = com.fyber.inneractive.sdk.player.p057a.C3123g.this
                com.fyber.inneractive.sdk.config.a.s r7 = r7.f7722p
                java.lang.Class<com.fyber.inneractive.sdk.config.a.a.f> r8 = com.fyber.inneractive.sdk.config.p034a.p035a.C2746f.class
                com.fyber.inneractive.sdk.config.a.a.d r7 = r7.mo18010a(r8)
                com.fyber.inneractive.sdk.config.a.a.f r7 = (com.fyber.inneractive.sdk.config.p034a.p035a.C2746f) r7
                java.lang.String r8 = "url_conn_connection_timeout"
                java.lang.Integer r7 = r7.mo17986c(r8)
                com.fyber.inneractive.sdk.player.a.g r8 = com.fyber.inneractive.sdk.player.p057a.C3123g.this
                com.fyber.inneractive.sdk.config.a.s r8 = r8.f7722p
                java.lang.Class<com.fyber.inneractive.sdk.config.a.a.f> r9 = com.fyber.inneractive.sdk.config.p034a.p035a.C2746f.class
                com.fyber.inneractive.sdk.config.a.a.d r8 = r8.mo18010a(r9)
                com.fyber.inneractive.sdk.config.a.a.f r8 = (com.fyber.inneractive.sdk.config.p034a.p035a.C2746f) r8
                java.lang.String r9 = "url_conn_read_timeout"
                java.lang.Integer r8 = r8.mo17986c(r9)
                if (r7 == 0) goto L_0x0056
                int r7 = r7.intValue()
                r1.setConnectTimeout(r7)
            L_0x0056:
                if (r8 == 0) goto L_0x005f
                int r7 = r8.intValue()
                r1.setReadTimeout(r7)
            L_0x005f:
                r1.connect()
                int r7 = r1.getResponseCode()
                r8 = 3
                java.lang.Object[] r8 = new java.lang.Object[r8]
                com.fyber.inneractive.sdk.player.a.g r9 = com.fyber.inneractive.sdk.player.p057a.C3123g.this
                java.lang.String r9 = r9.f7707a
                r8[r4] = r9
                com.fyber.inneractive.sdk.player.a.g r9 = com.fyber.inneractive.sdk.player.p057a.C3123g.this
                java.lang.String r9 = r9.mo18720d()
                r8[r5] = r9
                java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
                r10 = 2
                r8[r10] = r9
                java.lang.String r9 = "%s http response code for %s is %d"
                com.fyber.inneractive.sdk.util.IAlog.m9033a(r9, r8)
                r8 = 200(0xc8, float:2.8E-43)
                if (r7 == r8) goto L_0x0099
                r9 = 206(0xce, float:2.89E-43)
                if (r7 == r9) goto L_0x0099
                if (r6 > 0) goto L_0x008e
                goto L_0x0099
            L_0x008e:
                r1.disconnect()
                com.fyber.inneractive.sdk.player.a.g$a r1 = new com.fyber.inneractive.sdk.player.a.g$a
                java.lang.String r2 = "HTTP status code != 200"
                r1.<init>(r2)
                throw r1
            L_0x0099:
                int r9 = r1.getContentLength()
                long r11 = (long) r9
                r13 = 36700160(0x2300000, double:1.81322883E-316)
                int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r9 > 0) goto L_0x01f0
                if (r6 > 0) goto L_0x00a9
                r0.f7739g = r11
            L_0x00a9:
                java.io.InputStream r9 = r1.getInputStream()
                r0.f7735c = r9
                r9 = 100
                int r15 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
                if (r15 > 0) goto L_0x00b9
                r13 = 716800(0xaf000, double:3.541463E-318)
                goto L_0x00be
            L_0x00b9:
                int r13 = r9 / r25
                long r13 = (long) r13
                long r13 = r11 / r13
            L_0x00be:
                if (r15 > 0) goto L_0x00c4
                r4 = 716800(0xaf000, double:3.541463E-318)
                goto L_0x00d0
            L_0x00c4:
                int r15 = r0.f7744l
                int r15 = r25 + r15
                if (r15 <= r9) goto L_0x00cc
                r15 = r25
            L_0x00cc:
                int r9 = r9 / r15
                long r4 = (long) r9
                long r4 = r11 / r4
            L_0x00d0:
                com.fyber.inneractive.sdk.util.C3645c.m9069a()
                byte[] r9 = com.fyber.inneractive.sdk.util.C3645c.m9070b(r22)
                long r11 = r0.f7739g
                int r16 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
                if (r16 <= 0) goto L_0x00e8
                long r11 = r0.f7738f
                r16 = -1
                int r18 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
                if (r18 != 0) goto L_0x00e8
                r0.f7738f = r2
                goto L_0x012f
            L_0x00e8:
                if (r6 <= 0) goto L_0x012f
                if (r7 != r8) goto L_0x012f
                r0.f7738f = r2
                java.lang.Object[] r6 = new java.lang.Object[r10]
                com.fyber.inneractive.sdk.player.a.g r7 = com.fyber.inneractive.sdk.player.p057a.C3123g.this
                java.lang.String r7 = r7.f7707a
                r8 = 0
                r6[r8] = r7
                com.fyber.inneractive.sdk.player.a.g r7 = com.fyber.inneractive.sdk.player.p057a.C3123g.this
                java.lang.String r7 = r7.mo18720d()
                r8 = 1
                r6[r8] = r7
                java.lang.String r7 = "%s | Server rejected Range header for %s | restarting"
                com.fyber.inneractive.sdk.util.IAlog.m9033a(r7, r6)
                com.fyber.inneractive.sdk.player.p057a.C3142m.m7409a((java.io.Closeable) r20)
                com.fyber.inneractive.sdk.player.a.c$a r6 = r0.f7740h
                r6.mo18691b()
                com.fyber.inneractive.sdk.player.a.g r6 = com.fyber.inneractive.sdk.player.p057a.C3123g.this
                com.fyber.inneractive.sdk.player.a.c r6 = r6.f7708b
                com.fyber.inneractive.sdk.player.a.g r7 = com.fyber.inneractive.sdk.player.p057a.C3123g.this
                java.lang.String r7 = r7.mo18720d()
                r6.mo18687d((java.lang.String) r7)
                com.fyber.inneractive.sdk.player.a.g r6 = com.fyber.inneractive.sdk.player.p057a.C3123g.this
                com.fyber.inneractive.sdk.player.a.c r6 = r6.f7708b
                com.fyber.inneractive.sdk.player.a.g r7 = com.fyber.inneractive.sdk.player.p057a.C3123g.this
                java.lang.String r7 = r7.mo18720d()
                com.fyber.inneractive.sdk.player.a.c$a r6 = r6.mo18683c((java.lang.String) r7)
                java.io.OutputStream r7 = r6.mo18690a()
                r0.f7740h = r6
                goto L_0x0131
            L_0x012f:
                r7 = r20
            L_0x0131:
                java.io.InputStream r6 = r0.f7735c
                int r6 = r6.read(r9)
                r8 = -1
                if (r6 == r8) goto L_0x01ef
                java.util.concurrent.atomic.AtomicBoolean r8 = r0.f7733a
                r11 = 1
                boolean r8 = r8.compareAndSet(r11, r11)
                if (r8 == 0) goto L_0x015b
                java.lang.Object[] r2 = new java.lang.Object[r10]
                com.fyber.inneractive.sdk.player.a.g r3 = com.fyber.inneractive.sdk.player.p057a.C3123g.this
                java.lang.String r3 = r3.f7707a
                r8 = 0
                r2[r8] = r3
                com.fyber.inneractive.sdk.player.a.g r3 = com.fyber.inneractive.sdk.player.p057a.C3123g.this
                java.lang.String r3 = r3.mo18720d()
                r2[r11] = r3
                java.lang.String r3 = "%s | aborting download for cache %s"
                com.fyber.inneractive.sdk.util.IAlog.m9033a(r3, r2)
                goto L_0x01ef
            L_0x015b:
                r8 = 0
                r7.write(r9, r8, r6)
                long r11 = r0.f7738f
                long r2 = (long) r6
                long r11 = r11 + r2
                r0.f7738f = r11
                boolean r2 = r0.f7736d
                if (r2 != 0) goto L_0x0170
                int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r2 >= 0) goto L_0x016e
                goto L_0x0170
            L_0x016e:
                r2 = 1
                goto L_0x017b
            L_0x0170:
                boolean r2 = r0.f7737e
                if (r2 != 0) goto L_0x01eb
                long r2 = r0.f7738f
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto L_0x01eb
                goto L_0x016e
            L_0x017b:
                r0.f7736d = r2
                long r11 = r0.f7738f
                int r3 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r3 < 0) goto L_0x0185
                r0.f7737e = r2
            L_0x0185:
                com.fyber.inneractive.sdk.player.a.g r2 = com.fyber.inneractive.sdk.player.p057a.C3123g.this
                com.fyber.inneractive.sdk.player.a.a r2 = r2.f7712f
                if (r2 != 0) goto L_0x01da
                com.fyber.inneractive.sdk.player.a.g r2 = com.fyber.inneractive.sdk.player.p057a.C3123g.this
                java.lang.String r3 = r2.mo18720d()
                com.fyber.inneractive.sdk.player.a.g r6 = com.fyber.inneractive.sdk.player.p057a.C3123g.this
                java.lang.String r6 = r6.f7711e
                com.fyber.inneractive.sdk.player.a.g r8 = com.fyber.inneractive.sdk.player.p057a.C3123g.this
                com.fyber.inneractive.sdk.player.a.c r8 = r8.f7708b
                com.fyber.inneractive.sdk.player.a.g r11 = com.fyber.inneractive.sdk.player.p057a.C3123g.this
                java.lang.String r11 = r11.mo18720d()
                r8.mo18682b()
                com.fyber.inneractive.sdk.player.p057a.C3106c.m7344e((java.lang.String) r11)
                java.util.LinkedHashMap<java.lang.String, com.fyber.inneractive.sdk.player.a.c$b> r8 = r8.f7639b
                java.lang.Object r8 = r8.get(r11)
                com.fyber.inneractive.sdk.player.a.c$b r8 = (com.fyber.inneractive.sdk.player.p057a.C3106c.C3111b) r8
                if (r8 != 0) goto L_0x01b1
                r8 = 0
                goto L_0x01b6
            L_0x01b1:
                r11 = 0
                java.io.File r8 = r8.mo18699b((int) r11)
            L_0x01b6:
                com.fyber.inneractive.sdk.player.a.g r11 = com.fyber.inneractive.sdk.player.p057a.C3123g.this
                java.lang.String r11 = r11.f7717k
                r12 = 1
                com.fyber.inneractive.sdk.player.a.a r3 = com.fyber.inneractive.sdk.player.p057a.C3103a.m7325a(r3, r6, r8, r12, r11)
                r2.f7712f = r3
                long r2 = r0.f7739g
                r11 = 0
                int r6 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
                if (r6 <= 0) goto L_0x01da
                com.fyber.inneractive.sdk.player.a.g r2 = com.fyber.inneractive.sdk.player.p057a.C3123g.this
                com.fyber.inneractive.sdk.player.a.a r2 = r2.f7712f
                long r11 = r0.f7739g
                java.lang.String r3 = java.lang.String.valueOf(r11)
                java.util.Map<java.lang.String, java.lang.String> r2 = r2.f7629f
                java.lang.String r6 = "http.file.length"
                r2.put(r6, r3)
            L_0x01da:
                com.fyber.inneractive.sdk.player.a.g r2 = com.fyber.inneractive.sdk.player.p057a.C3123g.this
                android.os.Handler r2 = r2.f7715i
                if (r2 == 0) goto L_0x01eb
                r7.flush()
                com.fyber.inneractive.sdk.player.a.g r2 = com.fyber.inneractive.sdk.player.p057a.C3123g.this
                android.os.Handler r2 = r2.f7715i
                r3 = 4
                r2.sendEmptyMessage(r3)
            L_0x01eb:
                r2 = 0
                goto L_0x0131
            L_0x01ef:
                return r1
            L_0x01f0:
                com.fyber.inneractive.sdk.player.a.g$c r1 = new com.fyber.inneractive.sdk.player.a.g$c
                java.lang.Object[] r2 = new java.lang.Object[r10]
                java.text.NumberFormat r3 = java.text.NumberFormat.getInstance()
                java.lang.String r3 = r3.format(r13)
                r4 = 0
                r2[r4] = r3
                java.text.NumberFormat r3 = java.text.NumberFormat.getInstance()
                java.lang.String r3 = r3.format(r11)
                r4 = 1
                r2[r4] = r3
                java.lang.String r3 = "File size to big for cache (max=%s current=%s)"
                java.lang.String r2 = java.lang.String.format(r3, r2)
                r1.<init>(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p057a.C3123g.C3131b.m7395a(java.io.OutputStream, java.net.URL, java.nio.ByteBuffer, long, int):java.net.HttpURLConnection");
        }
    }

    /* renamed from: d */
    public final String mo18720d() {
        if (this.f7725s == null) {
            this.f7725s = m7384a(this.f7711e);
        }
        return this.f7725s;
    }

    /* renamed from: a */
    private static String m7384a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                stringBuffer.append(Integer.toHexString((b & 255) | 256).substring(1));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException unused) {
            return m7387b(str);
        } catch (NullPointerException unused2) {
            return "";
        }
    }

    /* renamed from: b */
    private static String m7387b(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(SameMD5.TAG);
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                stringBuffer.append(Integer.toHexString((b & 255) | 256).substring(1));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException unused) {
            return str.replaceAll("\\W+", "");
        }
    }

    /* renamed from: a */
    public final void mo18413a(Message message) {
        if (message.what == 4 && !this.f7712f.f7631h) {
            synchronized (this.f7716j) {
                IAlog.m9033a("%s | reading from cache 1 - %s", this.f7707a, mo18720d());
                int a = this.f7710d.mo18676a(this.f7712f);
                if (a == C3104b.C3105a.f7635c) {
                    m7386a((Exception) new C3130a("Failed cache validation"));
                    mo18717a(true);
                } else if (a == C3104b.C3105a.f7634b) {
                    this.f7724r = true;
                } else {
                    this.f7712f.f7631h = true;
                    mo18716a(this.f7712f);
                    this.f7712f.mo18674a(this.f7710d.mo18677a());
                    mo18718b();
                }
            }
        } else if (message.what == 1) {
            if (message.obj instanceof Exception) {
                m7386a((Exception) message.obj);
            } else {
                m7386a((Exception) new C3130a("download failed"));
            }
            mo18717a(false);
        } else if (message.what == 2) {
            if (this.f7724r) {
                synchronized (this.f7716j) {
                    IAlog.m9033a("%s | reading from cache 2 - %s", this.f7707a, mo18720d());
                    if (this.f7710d.mo18676a(this.f7712f) == C3104b.C3105a.f7635c) {
                        m7386a((Exception) new C3130a("Failed cache validation after downloading complete file"));
                        mo18717a(true);
                    } else {
                        mo18716a(this.f7712f);
                        this.f7712f.mo18674a(this.f7710d.mo18677a());
                        mo18718b();
                    }
                }
            } else {
                C3662m.m9137a().post(new Runnable() {
                    public final void run() {
                        C3123g.this.mo18717a(false);
                    }
                });
            }
            IAlog.m9033a("%s | Download success for cache key %s", this.f7707a, mo18720d());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo18716a(C3103a aVar) {
        C3133d dVar;
        if (aVar != null && (dVar = this.f7721o) != null && !dVar.mo18728b(aVar.mo18672a())) {
            this.f7721o.mo18727a(aVar.mo18672a());
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.a.g$a */
    private static class C3130a extends Exception {
        public C3130a() {
        }

        public C3130a(String str) {
            super(str);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.a.g$c */
    public static class C3132c extends C3130a {
        public C3132c() {
        }

        public C3132c(String str) {
            super(str);
        }
    }

    /* renamed from: c */
    public final void mo18719c() {
        mo18717a(this.f7720n);
    }

    /* renamed from: a */
    static /* synthetic */ void m7385a(C3123g gVar, boolean z) {
        C31252 r0 = new Runnable() {
            /* JADX WARNING: Removed duplicated region for block: B:25:0x0070  */
            /* JADX WARNING: Removed duplicated region for block: B:27:0x0076  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r7 = this;
                    r0 = 1
                    r1 = 0
                    com.fyber.inneractive.sdk.player.a.g r2 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ IOException -> 0x0050 }
                    com.fyber.inneractive.sdk.player.a.c$d r2 = r2.f7709c     // Catch:{ IOException -> 0x0050 }
                    if (r2 != 0) goto L_0x001a
                    com.fyber.inneractive.sdk.player.a.g r2 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ IOException -> 0x0050 }
                    com.fyber.inneractive.sdk.player.a.c r2 = r2.f7708b     // Catch:{ IOException -> 0x0050 }
                    com.fyber.inneractive.sdk.player.a.g r3 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ IOException -> 0x0050 }
                    java.lang.String r3 = r3.mo18720d()     // Catch:{ IOException -> 0x0050 }
                    com.fyber.inneractive.sdk.player.a.c$d r2 = r2.mo18680a((java.lang.String) r3)     // Catch:{ IOException -> 0x0050 }
                    com.fyber.inneractive.sdk.player.a.g r3 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ IOException -> 0x0050 }
                    r3.f7709c = r2     // Catch:{ IOException -> 0x0050 }
                L_0x001a:
                    com.fyber.inneractive.sdk.player.a.g r2 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ IOException -> 0x0050 }
                    com.fyber.inneractive.sdk.player.a.c$d r2 = r2.f7709c     // Catch:{ IOException -> 0x0050 }
                    if (r2 != 0) goto L_0x004e
                    com.fyber.inneractive.sdk.player.a.g r2 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ IOException -> 0x0050 }
                    com.fyber.inneractive.sdk.player.a.c r2 = r2.f7708b     // Catch:{ IOException -> 0x0050 }
                    com.fyber.inneractive.sdk.player.a.g r3 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ IOException -> 0x0050 }
                    java.lang.String r3 = r3.mo18720d()     // Catch:{ IOException -> 0x0050 }
                    com.fyber.inneractive.sdk.player.a.c$a r2 = r2.mo18683c((java.lang.String) r3)     // Catch:{ IOException -> 0x0050 }
                    if (r2 != 0) goto L_0x0032
                    r3 = 1
                    goto L_0x0033
                L_0x0032:
                    r3 = 0
                L_0x0033:
                    if (r2 == 0) goto L_0x006e
                    r2.mo18691b()     // Catch:{ IOException -> 0x004c }
                    com.fyber.inneractive.sdk.player.a.g r2 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ IOException -> 0x004c }
                    com.fyber.inneractive.sdk.player.a.c$d r2 = r2.f7709c     // Catch:{ IOException -> 0x004c }
                    if (r2 != 0) goto L_0x006e
                    com.fyber.inneractive.sdk.player.a.g r2 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ IOException -> 0x004c }
                    com.fyber.inneractive.sdk.player.a.g$b r2 = r2.f7714h     // Catch:{ IOException -> 0x004c }
                    if (r2 == 0) goto L_0x006e
                    com.fyber.inneractive.sdk.player.a.g r2 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ IOException -> 0x004c }
                    com.fyber.inneractive.sdk.player.a.g$b r2 = r2.f7714h     // Catch:{ IOException -> 0x004c }
                    r2.start()     // Catch:{ IOException -> 0x004c }
                    return
                L_0x004c:
                    r2 = move-exception
                    goto L_0x0052
                L_0x004e:
                    r3 = 0
                    goto L_0x006e
                L_0x0050:
                    r2 = move-exception
                    r3 = 0
                L_0x0052:
                    java.lang.String r4 = "%s | Exception raised waiting on availbility for %s"
                    r5 = 2
                    java.lang.Object[] r5 = new java.lang.Object[r5]
                    com.fyber.inneractive.sdk.player.a.g r6 = com.fyber.inneractive.sdk.player.p057a.C3123g.this
                    java.lang.String r6 = r6.f7707a
                    r5[r1] = r6
                    com.fyber.inneractive.sdk.player.a.g r6 = com.fyber.inneractive.sdk.player.p057a.C3123g.this
                    java.lang.String r6 = r6.mo18720d()
                    r5[r0] = r6
                    java.lang.String r4 = java.lang.String.format(r4, r5)
                    java.lang.Object[] r5 = new java.lang.Object[r1]
                    com.fyber.inneractive.sdk.util.IAlog.m9032a((java.lang.String) r4, (java.lang.Throwable) r2, (java.lang.Object[]) r5)
                L_0x006e:
                    if (r3 == 0) goto L_0x0076
                    com.fyber.inneractive.sdk.player.a.g r0 = com.fyber.inneractive.sdk.player.p057a.C3123g.this
                    com.fyber.inneractive.sdk.player.p057a.C3123g.m7385a(r0, r1)
                    return
                L_0x0076:
                    com.fyber.inneractive.sdk.player.a.g r2 = com.fyber.inneractive.sdk.player.p057a.C3123g.this
                    r2.f7719m = r0
                    com.fyber.inneractive.sdk.player.a.g r0 = com.fyber.inneractive.sdk.player.p057a.C3123g.this
                    r0.f7720n = r1
                    com.fyber.inneractive.sdk.player.a.g r0 = com.fyber.inneractive.sdk.player.p057a.C3123g.this
                    java.lang.String r2 = r0.mo18720d()
                    com.fyber.inneractive.sdk.player.a.g r3 = com.fyber.inneractive.sdk.player.p057a.C3123g.this
                    java.lang.String r3 = r3.f7711e
                    com.fyber.inneractive.sdk.player.a.g r4 = com.fyber.inneractive.sdk.player.p057a.C3123g.this
                    com.fyber.inneractive.sdk.player.a.c r4 = r4.f7708b
                    com.fyber.inneractive.sdk.player.a.g r5 = com.fyber.inneractive.sdk.player.p057a.C3123g.this
                    java.lang.String r5 = r5.mo18720d()
                    java.io.File r4 = r4.mo18681b((java.lang.String) r5)
                    com.fyber.inneractive.sdk.player.a.g r5 = com.fyber.inneractive.sdk.player.p057a.C3123g.this
                    java.lang.String r5 = r5.f7717k
                    com.fyber.inneractive.sdk.player.a.a r2 = com.fyber.inneractive.sdk.player.p057a.C3103a.m7325a(r2, r3, r4, r1, r5)
                    r0.f7712f = r2
                    com.fyber.inneractive.sdk.player.a.g r0 = com.fyber.inneractive.sdk.player.p057a.C3123g.this
                    com.fyber.inneractive.sdk.player.a.a r0 = r0.f7712f
                    java.lang.Object r0 = r0.f7628e
                    monitor-enter(r0)
                    com.fyber.inneractive.sdk.player.a.g r2 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x00e1 }
                    com.fyber.inneractive.sdk.player.a.a r2 = r2.f7712f     // Catch:{ all -> 0x00e1 }
                    boolean r2 = r2.mo18675b()     // Catch:{ all -> 0x00e1 }
                    if (r2 == 0) goto L_0x00da
                    com.fyber.inneractive.sdk.player.a.g r1 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x00e1 }
                    com.fyber.inneractive.sdk.player.a.b r1 = r1.f7710d     // Catch:{ all -> 0x00e1 }
                    com.fyber.inneractive.sdk.player.a.g r2 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x00e1 }
                    com.fyber.inneractive.sdk.player.a.a r2 = r2.f7712f     // Catch:{ all -> 0x00e1 }
                    r1.mo18676a(r2)     // Catch:{ all -> 0x00e1 }
                    com.fyber.inneractive.sdk.player.a.g r1 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x00e1 }
                    com.fyber.inneractive.sdk.player.a.a r1 = r1.f7712f     // Catch:{ all -> 0x00e1 }
                    com.fyber.inneractive.sdk.player.a.g r2 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x00e1 }
                    com.fyber.inneractive.sdk.player.a.b r2 = r2.f7710d     // Catch:{ all -> 0x00e1 }
                    java.util.Map r2 = r2.mo18677a()     // Catch:{ all -> 0x00e1 }
                    r1.mo18674a((java.util.Map<java.lang.String, java.lang.String>) r2)     // Catch:{ all -> 0x00e1 }
                    com.fyber.inneractive.sdk.player.a.g r1 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x00e1 }
                    com.fyber.inneractive.sdk.player.a.g r2 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x00e1 }
                    com.fyber.inneractive.sdk.player.a.a r2 = r2.f7712f     // Catch:{ all -> 0x00e1 }
                    r1.mo18716a((com.fyber.inneractive.sdk.player.p057a.C3103a) r2)     // Catch:{ all -> 0x00e1 }
                    com.fyber.inneractive.sdk.player.a.g r1 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x00e1 }
                    r1.mo18718b()     // Catch:{ all -> 0x00e1 }
                    goto L_0x00df
                L_0x00da:
                    com.fyber.inneractive.sdk.player.a.g r2 = com.fyber.inneractive.sdk.player.p057a.C3123g.this     // Catch:{ all -> 0x00e1 }
                    com.fyber.inneractive.sdk.player.p057a.C3123g.m7385a(r2, r1)     // Catch:{ all -> 0x00e1 }
                L_0x00df:
                    monitor-exit(r0)     // Catch:{ all -> 0x00e1 }
                    return
                L_0x00e1:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x00e1 }
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p057a.C3123g.C31252.run():void");
            }
        };
        Handler handler = gVar.f7715i;
        if (handler == null) {
            return;
        }
        if (z) {
            handler.postAtFrontOfQueue(r0);
        } else {
            handler.postDelayed(r0, 4);
        }
    }
}
