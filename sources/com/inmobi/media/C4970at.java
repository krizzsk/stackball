package com.inmobi.media;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.appsflyer.internal.referrer.Payload;
import com.inmobi.media.C4949ai;
import com.inmobi.media.C5220ev;
import com.inmobi.media.C5239ey;
import com.inmobi.media.C5334hb;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.smaato.sdk.video.vast.model.C8937Ad;
import com.squareup.picasso.Callback;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.inmobi.media.at */
/* compiled from: AssetStore */
public final class C4970at implements C5239ey.C5242c {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String f11259b = C4970at.class.getSimpleName();

    /* renamed from: m */
    private static final Object f11260m = new Object();

    /* renamed from: a */
    public ExecutorService f11261a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C4967ar f11262c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C5220ev.C5224a f11263d;

    /* renamed from: e */
    private C5220ev.C5232i f11264e;

    /* renamed from: f */
    private ExecutorService f11265f;

    /* renamed from: g */
    private C4976a f11266g;

    /* renamed from: h */
    private HandlerThread f11267h;

    /* renamed from: i */
    private AtomicBoolean f11268i;

    /* renamed from: j */
    private AtomicBoolean f11269j;

    /* renamed from: k */
    private ConcurrentHashMap<String, C4949ai> f11270k;

    /* renamed from: l */
    private C5334hb.C5338c f11271l;

    /* renamed from: n */
    private List<C4951aj> f11272n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C4969as f11273o;

    /* renamed from: com.inmobi.media.at$b */
    /* compiled from: AssetStore */
    static class C4978b {

        /* renamed from: a */
        static final C4970at f11286a = new C4970at((byte) 0);
    }

    /* synthetic */ C4970at(byte b) {
        this();
    }

    private C4970at() {
        this.f11268i = new AtomicBoolean(false);
        this.f11269j = new AtomicBoolean(false);
        this.f11272n = new ArrayList();
        this.f11273o = new C4969as() {
            /* renamed from: a */
            public final void mo40120a(C5300gd gdVar, String str, C4949ai aiVar) {
                String unused = C4970at.f11259b;
                C4949ai a = new C4949ai.C4950a().mo40058a(aiVar.f11192d, str, gdVar, C4970at.this.f11263d.maxRetries, C4970at.this.f11263d.timeToLive).mo40059a();
                C4967ar unused2 = C4970at.this.f11262c;
                C4967ar.m11265b(a);
                a.f11199k = aiVar.f11199k;
                a.f11189a = aiVar.f11189a;
                C4970at.this.m11280a(a, true);
                try {
                    C4970at.m11297c(C4970at.this);
                } catch (Exception e) {
                    String unused3 = C4970at.f11259b;
                    C5275fn.m12068a().mo40590a(new C5308gk(e));
                }
            }

            /* renamed from: a */
            public final void mo40119a(C4949ai aiVar) {
                String unused = C4970at.f11259b;
                C4970at.this.m11299c(aiVar.f11192d);
                if (aiVar.f11191c <= 0) {
                    String unused2 = C4970at.f11259b;
                    C4970at.this.m11280a(aiVar, false);
                    C4967ar unused3 = C4970at.this.f11262c;
                    C4967ar.m11269c(aiVar);
                } else {
                    String unused4 = C4970at.f11259b;
                    aiVar.f11194f = System.currentTimeMillis();
                    C4967ar unused5 = C4970at.this.f11262c;
                    C4967ar.m11265b(aiVar);
                    if (!C5328gx.m12274a()) {
                        C4970at.this.m11280a(aiVar, false);
                    }
                }
                try {
                    C4970at.m11297c(C4970at.this);
                } catch (Exception e) {
                    String unused6 = C4970at.f11259b;
                    C5275fn.m12068a().mo40590a(new C5308gk(e));
                }
            }
        };
        C5220ev evVar = (C5220ev) C5239ey.m11987a(CampaignUnit.JSON_KEY_ADS, C5314go.m12211f(), this);
        this.f11263d = evVar.assetCache;
        this.f11264e = evVar.vastVideo;
        this.f11262c = C4967ar.m11264a();
        this.f11261a = Executors.newCachedThreadPool(new C5326gv(f11259b + "-AP"));
        this.f11265f = Executors.newFixedThreadPool(1, new C5326gv(f11259b + "-AD"));
        HandlerThread handlerThread = new HandlerThread("assetFetcher");
        this.f11267h = handlerThread;
        handlerThread.start();
        this.f11266g = new C4976a(this.f11267h.getLooper(), this);
        this.f11271l = new C5334hb.C5338c() {
            /* renamed from: a */
            public final void mo40125a(boolean z) {
                if (z) {
                    C4970at.m11297c(C4970at.this);
                } else {
                    C4970at.this.m11312j();
                }
            }
        };
        this.f11270k = new ConcurrentHashMap<>(2, 0.9f, 2);
    }

    /* renamed from: a */
    public static C4970at m11277a() {
        return C4978b.f11286a;
    }

    /* renamed from: a */
    public final void mo40121a(C5238ex exVar) {
        C5220ev evVar = (C5220ev) exVar;
        this.f11263d = evVar.assetCache;
        this.f11264e = evVar.vastVideo;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m11287a(String str) {
        boolean z;
        for (int i = 0; i < this.f11272n.size(); i++) {
            C4951aj ajVar = this.f11272n.get(i);
            Set<C5005ba> set = ajVar.f11210b;
            Set<String> set2 = ajVar.f11211c;
            Iterator<C5005ba> it = set.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f11356b.equals(str)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z && !set2.contains(str)) {
                ajVar.f11211c.add(str);
                ajVar.f11212d++;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public synchronized void m11294b(String str) {
        boolean z;
        for (int i = 0; i < this.f11272n.size(); i++) {
            C4951aj ajVar = this.f11272n.get(i);
            Iterator<C5005ba> it = ajVar.f11210b.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f11356b.equals(str)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                ajVar.f11213e++;
            }
        }
    }

    /* renamed from: a */
    private synchronized void m11279a(C4949ai aiVar) {
        boolean z;
        for (int i = 0; i < this.f11272n.size(); i++) {
            C4951aj ajVar = this.f11272n.get(i);
            Iterator<C5005ba> it = ajVar.f11210b.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f11356b.equals(aiVar.f11192d)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z && !ajVar.f11209a.contains(aiVar)) {
                ajVar.f11209a.add(aiVar);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m11281a(C4951aj ajVar) {
        if (!this.f11272n.contains(ajVar)) {
            this.f11272n.add(ajVar);
        }
    }

    /* renamed from: a */
    private synchronized void m11288a(List<C4951aj> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.f11272n.remove(list.get(i));
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f8, code lost:
        r8.f11200l = 7;
        r8.f11191c = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0100, code lost:
        if (r11.exists() == false) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0102, code lost:
        r11.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0105, code lost:
        r4.disconnect();
        com.inmobi.media.C5328gx.m12271a((java.io.Closeable) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0167, code lost:
        r8.f11200l = 0;
        r10.f11220a.mo40119a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0170, code lost:
        r8.f11200l = 8;
        r10.f11220a.mo40119a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0179, code lost:
        r8.f11200l = 8;
        r10.f11220a.mo40119a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0182, code lost:
        r8.f11200l = 3;
        r10.f11220a.mo40119a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x018c, code lost:
        r8.f11200l = 4;
        r10.f11220a.mo40119a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0196, code lost:
        r8.f11200l = 4;
        r10.f11220a.mo40119a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        return true;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[ExcHandler: IOException (unused java.io.IOException), SYNTHETIC, Splitter:B:10:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[ExcHandler: ProtocolException (unused java.net.ProtocolException), SYNTHETIC, Splitter:B:10:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[ExcHandler: MalformedURLException (unused java.net.MalformedURLException), SYNTHETIC, Splitter:B:10:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[ExcHandler: FileNotFoundException (unused java.io.FileNotFoundException), SYNTHETIC, Splitter:B:10:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[ExcHandler: SocketTimeoutException (unused java.net.SocketTimeoutException), SYNTHETIC, Splitter:B:10:0x0052] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m11289a(com.inmobi.media.C4949ai r24, com.inmobi.media.C4969as r25) {
        /*
            r23 = this;
            r1 = r23
            r8 = r24
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.inmobi.media.ai> r0 = r1.f11270k
            java.lang.String r2 = r8.f11192d
            java.lang.Object r0 = r0.putIfAbsent(r2, r8)
            com.inmobi.media.ai r0 = (com.inmobi.media.C4949ai) r0
            r9 = 0
            if (r0 != 0) goto L_0x01ab
            com.inmobi.media.ak r10 = new com.inmobi.media.ak
            r0 = r25
            r10.<init>(r0)
            com.inmobi.media.ev$i r0 = r1.f11264e
            long r2 = r0.vastMaxAssetSize
            com.inmobi.media.ev$i r0 = r1.f11264e
            java.util.List<java.lang.String> r0 = r0.allowedContentType
            boolean r4 = com.inmobi.media.C5328gx.m12274a()
            r12 = 8
            if (r4 != 0) goto L_0x0032
            r8.f11200l = r12
            com.inmobi.media.as r0 = r10.f11220a
            r0.mo40119a(r8)
        L_0x002f:
            r2 = 1
            goto L_0x01aa
        L_0x0032:
            java.lang.String r4 = r8.f11192d
            java.lang.String r5 = ""
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x01a0
            java.lang.String r4 = r8.f11192d
            boolean r4 = android.webkit.URLUtil.isValidUrl(r4)
            if (r4 != 0) goto L_0x0046
            goto L_0x01a0
        L_0x0046:
            int r4 = r0.size()
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.Object[] r0 = r0.toArray(r4)
            java.lang.String[] r0 = (java.lang.String[]) r0
            long r21 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            java.net.URL r4 = new java.net.URL     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            java.lang.String r5 = r8.f11192d     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            r4.<init>(r5)     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            java.net.URLConnection r4 = r4.openConnection()     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            java.lang.String r5 = "GET"
            r4.setRequestMethod(r5)     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            r5 = 60000(0xea60, float:8.4078E-41)
            r4.setConnectTimeout(r5)     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            r4.setReadTimeout(r5)     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            int r5 = r4.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            r6 = 400(0x190, float:5.6E-43)
            if (r5 >= r6) goto L_0x00aa
            java.lang.String r5 = r4.getContentType()     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            int r6 = r0.length     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            r7 = 0
        L_0x007f:
            if (r7 >= r6) goto L_0x009c
            r15 = r0[r7]     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            if (r5 == 0) goto L_0x0099
            java.util.Locale r11 = java.util.Locale.ENGLISH     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            java.lang.String r11 = r15.toLowerCase(r11)     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            java.util.Locale r15 = java.util.Locale.ENGLISH     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            java.lang.String r15 = r5.toLowerCase(r15)     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            boolean r11 = r11.equals(r15)     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            if (r11 == 0) goto L_0x0099
            r0 = 1
            goto L_0x009d
        L_0x0099:
            int r7 = r7 + 1
            goto L_0x007f
        L_0x009c:
            r0 = 0
        L_0x009d:
            if (r0 != 0) goto L_0x00aa
            r0 = 6
            r8.f11200l = r0     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            r8.f11191c = r9     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            com.inmobi.media.as r0 = r10.f11220a     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            r0.mo40119a(r8)     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            goto L_0x002f
        L_0x00aa:
            int r0 = r4.getContentLength()     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            long r5 = (long) r0     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            r0 = 7
            r15 = 0
            int r7 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r7 < 0) goto L_0x00c5
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x00c5
            r8.f11200l = r0     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            r8.f11191c = r9     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            com.inmobi.media.as r0 = r10.f11220a     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            r0.mo40119a(r8)     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            goto L_0x002f
        L_0x00c5:
            r4.connect()     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            java.lang.String r5 = r8.f11192d     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            java.io.File r11 = com.inmobi.media.C5314go.m12189a((java.lang.String) r5)     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            boolean r5 = r11.exists()     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            if (r5 == 0) goto L_0x00d7
            r11.delete()     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
        L_0x00d7:
            java.io.InputStream r5 = r4.getInputStream()     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            r7.<init>(r11)     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            r6.<init>(r7)     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            r17 = r15
        L_0x00eb:
            int r15 = r5.read(r7)     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            if (r15 <= 0) goto L_0x012d
            long r13 = (long) r15     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            long r17 = r17 + r13
            int r13 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
            if (r13 <= 0) goto L_0x0129
            r8.f11200l = r0     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            r8.f11191c = r9     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            boolean r0 = r11.exists()     // Catch:{ Exception -> 0x010c, SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170 }
            if (r0 == 0) goto L_0x0105
            r11.delete()     // Catch:{ Exception -> 0x010c, SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170 }
        L_0x0105:
            r4.disconnect()     // Catch:{ Exception -> 0x010c, SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170 }
            com.inmobi.media.C5328gx.m12271a((java.io.Closeable) r6)     // Catch:{ Exception -> 0x010c, SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170 }
            goto L_0x0119
        L_0x010c:
            r0 = move-exception
            com.inmobi.media.fn r2 = com.inmobi.media.C5275fn.m12068a()     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            com.inmobi.media.gk r3 = new com.inmobi.media.gk     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            r3.<init>(r0)     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            r2.mo40590a((com.inmobi.media.C5308gk) r3)     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
        L_0x0119:
            long r19 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            r15 = r21
            com.inmobi.media.C4952ak.m11177a(r15, r17, r19)     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            com.inmobi.media.as r0 = r10.f11220a     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            r0.mo40119a(r8)     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            goto L_0x002f
        L_0x0129:
            r6.write(r7, r9, r15)     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            goto L_0x00eb
        L_0x012d:
            r6.flush()     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            r4.disconnect()     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            com.inmobi.media.C5328gx.m12271a((java.io.Closeable) r6)     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            r15 = r21
            r19 = r13
            com.inmobi.media.C4952ak.m11177a(r15, r17, r19)     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            com.inmobi.media.gd r0 = new com.inmobi.media.gd     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            r0.<init>()     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            java.util.Map r2 = r4.getHeaderFields()     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            r0.f12147c = r2     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            r2 = r24
            r3 = r11
            r4 = r21
            r6 = r13
            java.lang.String r2 = com.inmobi.media.C4952ak.m11176a(r2, r3, r4, r6)     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            r8.f11199k = r2     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            long r13 = r13 - r21
            r8.f11189a = r13     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            com.inmobi.media.as r2 = r10.f11220a     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            java.lang.String r3 = r11.getAbsolutePath()     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            r2.mo40120a(r0, r3, r8)     // Catch:{ SocketTimeoutException -> 0x0196, FileNotFoundException -> 0x018c, MalformedURLException -> 0x0182, ProtocolException -> 0x0179, IOException -> 0x0170, Exception -> 0x0167 }
            goto L_0x002f
        L_0x0167:
            r8.f11200l = r9
            com.inmobi.media.as r0 = r10.f11220a
            r0.mo40119a(r8)
            goto L_0x002f
        L_0x0170:
            r8.f11200l = r12
            com.inmobi.media.as r0 = r10.f11220a
            r0.mo40119a(r8)
            goto L_0x002f
        L_0x0179:
            r8.f11200l = r12
            com.inmobi.media.as r0 = r10.f11220a
            r0.mo40119a(r8)
            goto L_0x002f
        L_0x0182:
            r2 = 3
            r8.f11200l = r2
            com.inmobi.media.as r0 = r10.f11220a
            r0.mo40119a(r8)
            goto L_0x002f
        L_0x018c:
            r2 = 4
            r8.f11200l = r2
            com.inmobi.media.as r0 = r10.f11220a
            r0.mo40119a(r8)
            goto L_0x002f
        L_0x0196:
            r2 = 4
            r8.f11200l = r2
            com.inmobi.media.as r0 = r10.f11220a
            r0.mo40119a(r8)
            goto L_0x002f
        L_0x01a0:
            r2 = 3
            r8.f11200l = r2
            com.inmobi.media.as r0 = r10.f11220a
            r0.mo40119a(r8)
            goto L_0x002f
        L_0x01aa:
            return r2
        L_0x01ab:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4970at.m11289a(com.inmobi.media.ai, com.inmobi.media.as):boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m11299c(String str) {
        this.f11270k.remove(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m11280a(C4949ai aiVar, boolean z) {
        m11279a(aiVar);
        m11299c(aiVar.f11192d);
        if (z) {
            m11287a(aiVar.f11192d);
            m11304f();
            return;
        }
        m11294b(aiVar.f11192d);
        m11307g();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public synchronized void m11304f() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f11272n.size(); i++) {
            C4951aj ajVar = this.f11272n.get(i);
            if (ajVar.f11212d == ajVar.f11210b.size()) {
                try {
                    C4980au a = ajVar.mo40060a();
                    if (a != null) {
                        a.mo40114b(ajVar);
                    }
                    arrayList.add(ajVar);
                } catch (Exception e) {
                    C5275fn.m12068a().mo40590a(new C5308gk(e));
                }
            }
        }
        m11288a((List<C4951aj>) arrayList);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public synchronized void m11307g() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f11272n.size(); i++) {
            C4951aj ajVar = this.f11272n.get(i);
            if (ajVar.f11213e > 0) {
                try {
                    C4980au a = ajVar.mo40060a();
                    if (a != null) {
                        a.mo40113a(ajVar);
                    }
                    arrayList.add(ajVar);
                } catch (Exception e) {
                    C5275fn.m12068a().mo40590a(new C5308gk(e));
                }
            }
        }
        m11288a((List<C4951aj>) arrayList);
    }

    /* renamed from: b */
    public final void mo40122b() {
        this.f11269j.set(false);
        if (!C5328gx.m12274a()) {
            m11309h();
            m11311i();
            return;
        }
        synchronized (f11260m) {
            if (this.f11268i.compareAndSet(false, true)) {
                if (this.f11267h == null) {
                    HandlerThread handlerThread = new HandlerThread("assetFetcher");
                    this.f11267h = handlerThread;
                    handlerThread.start();
                }
                if (this.f11266g == null) {
                    this.f11266g = new C4976a(this.f11267h.getLooper(), this);
                }
                if (C4967ar.m11268c().isEmpty()) {
                    m11312j();
                } else {
                    m11309h();
                    m11311i();
                    this.f11266g.sendEmptyMessage(1);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo40123c() {
        this.f11269j.set(true);
        m11312j();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ad, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40124d() {
        /*
            r11 = this;
            java.lang.Object r0 = f11260m
            monitor-enter(r0)
            java.util.List r1 = com.inmobi.media.C4967ar.m11271d()     // Catch:{ all -> 0x00ae }
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x00ae }
            if (r2 == 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            return
        L_0x000f:
            java.util.Iterator r2 = r1.iterator()     // Catch:{ all -> 0x00ae }
        L_0x0013:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00ae }
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0033
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00ae }
            com.inmobi.media.ai r3 = (com.inmobi.media.C4949ai) r3     // Catch:{ all -> 0x00ae }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00ae }
            long r8 = r3.f11196h     // Catch:{ all -> 0x00ae }
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r4 = 0
        L_0x002d:
            if (r4 == 0) goto L_0x0013
            m11292b((com.inmobi.media.C4949ai) r3)     // Catch:{ all -> 0x00ae }
            goto L_0x0013
        L_0x0033:
            java.util.List r2 = com.inmobi.media.C4967ar.m11271d()     // Catch:{ all -> 0x00ae }
            r6 = 0
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00ae }
        L_0x003d:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00ae }
            if (r3 == 0) goto L_0x0056
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00ae }
            com.inmobi.media.ai r3 = (com.inmobi.media.C4949ai) r3     // Catch:{ all -> 0x00ae }
            java.io.File r8 = new java.io.File     // Catch:{ all -> 0x00ae }
            java.lang.String r3 = r3.f11193e     // Catch:{ all -> 0x00ae }
            r8.<init>(r3)     // Catch:{ all -> 0x00ae }
            long r8 = r8.length()     // Catch:{ all -> 0x00ae }
            long r6 = r6 + r8
            goto L_0x003d
        L_0x0056:
            com.inmobi.media.ev$a r2 = r11.f11263d     // Catch:{ all -> 0x00ae }
            long r2 = r2.maxCacheSize     // Catch:{ all -> 0x00ae }
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 <= 0) goto L_0x0068
            com.inmobi.media.ai r2 = com.inmobi.media.C4967ar.m11266b()     // Catch:{ all -> 0x00ae }
            if (r2 == 0) goto L_0x0068
            m11292b((com.inmobi.media.C4949ai) r2)     // Catch:{ all -> 0x00ae }
            goto L_0x0033
        L_0x0068:
            android.content.Context r2 = com.inmobi.media.C5314go.m12203c()     // Catch:{ all -> 0x00ae }
            java.io.File r2 = com.inmobi.media.C5314go.m12198b((android.content.Context) r2)     // Catch:{ all -> 0x00ae }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x00ae }
            if (r3 == 0) goto L_0x00ac
            java.io.File[] r2 = r2.listFiles()     // Catch:{ all -> 0x00ae }
            if (r2 == 0) goto L_0x00ac
            int r3 = r2.length     // Catch:{ all -> 0x00ae }
            r6 = 0
        L_0x007e:
            if (r6 >= r3) goto L_0x00ac
            r7 = r2[r6]     // Catch:{ all -> 0x00ae }
            java.util.Iterator r8 = r1.iterator()     // Catch:{ all -> 0x00ae }
        L_0x0086:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x00ae }
            if (r9 == 0) goto L_0x00a0
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x00ae }
            com.inmobi.media.ai r9 = (com.inmobi.media.C4949ai) r9     // Catch:{ all -> 0x00ae }
            java.lang.String r10 = r7.getAbsolutePath()     // Catch:{ all -> 0x00ae }
            java.lang.String r9 = r9.f11193e     // Catch:{ all -> 0x00ae }
            boolean r9 = r10.equals(r9)     // Catch:{ all -> 0x00ae }
            if (r9 == 0) goto L_0x0086
            r8 = 1
            goto L_0x00a1
        L_0x00a0:
            r8 = 0
        L_0x00a1:
            if (r8 != 0) goto L_0x00a9
            r7.getAbsolutePath()     // Catch:{ all -> 0x00ae }
            r7.delete()     // Catch:{ all -> 0x00ae }
        L_0x00a9:
            int r6 = r6 + 1
            goto L_0x007e
        L_0x00ac:
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            return
        L_0x00ae:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4970at.mo40124d():void");
    }

    /* renamed from: b */
    private static void m11292b(C4949ai aiVar) {
        C4967ar.m11269c(aiVar);
        File file = new File(aiVar.f11193e);
        if (file.exists()) {
            file.delete();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m11296c(C4949ai aiVar) {
        File file = new File(aiVar.f11193e);
        long min = Math.min(System.currentTimeMillis() + (aiVar.f11196h - aiVar.f11194f), System.currentTimeMillis() + (this.f11263d.timeToLive * 1000));
        C4949ai.C4950a aVar = new C4949ai.C4950a();
        String str = aiVar.f11192d;
        String str2 = aiVar.f11193e;
        int i = this.f11263d.maxRetries;
        long j = aiVar.f11197i;
        aVar.f11203c = str;
        aVar.f11204d = str2;
        aVar.f11202b = i;
        aVar.f11207g = min;
        aVar.f11208h = j;
        C4949ai a = aVar.mo40059a();
        a.f11194f = System.currentTimeMillis();
        C4967ar.m11265b(a);
        a.f11199k = C4952ak.m11176a(aiVar, file, aiVar.f11194f, aiVar.f11194f);
        a.f11198j = true;
        m11280a(a, true);
    }

    /* renamed from: com.inmobi.media.at$c */
    /* compiled from: AssetStore */
    class C4979c implements InvocationHandler {

        /* renamed from: b */
        private CountDownLatch f11288b;

        /* renamed from: c */
        private String f11289c;

        /* renamed from: d */
        private long f11290d;

        /* renamed from: e */
        private String f11291e;

        C4979c(CountDownLatch countDownLatch, String str, long j, String str2) {
            this.f11288b = countDownLatch;
            this.f11289c = str;
            this.f11290d = j;
            this.f11291e = str2;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            String unused = C4970at.f11259b;
            if (method == null) {
                return null;
            }
            if ("onSuccess".equalsIgnoreCase(method.getName())) {
                HashMap hashMap = new HashMap();
                hashMap.put(Payload.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - this.f11290d));
                hashMap.put("size", 0);
                hashMap.put("assetType", "image");
                hashMap.put("networkType", C5342he.m12330b());
                hashMap.put(C8937Ad.AD_TYPE, this.f11291e);
                C5309gl.m12169a().mo40652a("AssetDownloaded", (Map<String, Object>) hashMap);
                C4970at.this.m11287a(this.f11289c);
                this.f11288b.countDown();
                return null;
            } else if (!"onError".equalsIgnoreCase(method.getName())) {
                return null;
            } else {
                C4970at.this.m11294b(this.f11289c);
                this.f11288b.countDown();
                return null;
            }
        }
    }

    /* renamed from: h */
    private void m11309h() {
        C5334hb.m12304a();
        C5334hb.m12305a(this.f11271l, "android.net.conn.CONNECTIVITY_CHANGE");
        if (Build.VERSION.SDK_INT >= 23) {
            C5334hb.m12304a();
            C5334hb.m12309b(this.f11271l);
        }
    }

    /* renamed from: i */
    private void m11311i() {
        C5334hb.m12304a().mo40704a("android.net.conn.CONNECTIVITY_CHANGE", this.f11271l);
        if (Build.VERSION.SDK_INT >= 23) {
            C5334hb.m12304a().mo40703a(this.f11271l);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m11312j() {
        synchronized (f11260m) {
            this.f11268i.set(false);
            this.f11270k.clear();
            if (this.f11267h != null) {
                this.f11267h.getLooper().quit();
                this.f11267h.interrupt();
                this.f11267h = null;
                this.f11266g = null;
            }
        }
    }

    /* renamed from: com.inmobi.media.at$a */
    /* compiled from: AssetStore */
    static final class C4976a extends Handler {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public WeakReference<C4970at> f11283a;

        /* renamed from: b */
        private final C4969as f11284b = new C4969as() {
            /* renamed from: a */
            public final void mo40120a(C5300gd gdVar, String str, C4949ai aiVar) {
                C4970at atVar = (C4970at) C4976a.this.f11283a.get();
                if (atVar != null) {
                    String unused = C4970at.f11259b;
                    C4949ai a = new C4949ai.C4950a().mo40058a(aiVar.f11192d, str, gdVar, atVar.f11263d.maxRetries, atVar.f11263d.timeToLive).mo40059a();
                    C4967ar unused2 = atVar.f11262c;
                    C4967ar.m11265b(a);
                    a.f11199k = aiVar.f11199k;
                    a.f11189a = aiVar.f11189a;
                    atVar.m11280a(a, true);
                    C4976a.this.m11321a();
                    return;
                }
                String unused3 = C4970at.f11259b;
            }

            /* renamed from: a */
            public final void mo40119a(C4949ai aiVar) {
                C4970at atVar = (C4970at) C4976a.this.f11283a.get();
                if (atVar != null) {
                    String unused = C4970at.f11259b;
                    atVar.m11299c(aiVar.f11192d);
                    if (aiVar.f11191c > 0) {
                        aiVar.f11191c--;
                        aiVar.f11194f = System.currentTimeMillis();
                        C4967ar unused2 = atVar.f11262c;
                        C4967ar.m11265b(aiVar);
                        C4976a.this.m11324b();
                        return;
                    }
                    atVar.m11280a(aiVar, false);
                    C4976a.this.m11322a(aiVar);
                    return;
                }
                String unused3 = C4970at.f11259b;
            }
        };

        C4976a(Looper looper, C4970at atVar) {
            super(looper);
            this.f11283a = new WeakReference<>(atVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
            com.inmobi.media.C4970at.m11302e();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
            return;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x0110 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r10) {
            /*
                r9 = this;
                java.lang.ref.WeakReference<com.inmobi.media.at> r0 = r9.f11283a     // Catch:{ Exception -> 0x0114 }
                java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0114 }
                com.inmobi.media.at r0 = (com.inmobi.media.C4970at) r0     // Catch:{ Exception -> 0x0114 }
                int r1 = r10.what     // Catch:{ Exception -> 0x0114 }
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == r4) goto L_0x0085
                if (r1 == r2) goto L_0x002d
                r2 = 3
                if (r1 == r2) goto L_0x0028
                r2 = 4
                if (r1 == r2) goto L_0x0018
                return
            L_0x0018:
                if (r0 == 0) goto L_0x0024
                java.lang.Object r10 = r10.obj     // Catch:{ Exception -> 0x0114 }
                com.inmobi.media.ai r10 = (com.inmobi.media.C4949ai) r10     // Catch:{ Exception -> 0x0114 }
                com.inmobi.media.C4967ar unused = r0.f11262c     // Catch:{ Exception -> 0x0114 }
                com.inmobi.media.C4967ar.m11269c(r10)     // Catch:{ Exception -> 0x0114 }
            L_0x0024:
                r9.m11324b()     // Catch:{ Exception -> 0x0114 }
                return
            L_0x0028:
                r9.m11324b()     // Catch:{ Exception -> 0x0114 }
                goto L_0x0113
            L_0x002d:
                if (r0 == 0) goto L_0x0113
                java.lang.Object r10 = r10.obj     // Catch:{ Exception -> 0x0114 }
                java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x0114 }
                com.inmobi.media.C4967ar unused = r0.f11262c     // Catch:{ Exception -> 0x0114 }
                com.inmobi.media.ai r10 = com.inmobi.media.C4967ar.m11267b((java.lang.String) r10)     // Catch:{ Exception -> 0x0114 }
                if (r10 != 0) goto L_0x0040
                r9.m11324b()     // Catch:{ Exception -> 0x0114 }
                return
            L_0x0040:
                boolean r1 = r10.mo40053a()     // Catch:{ Exception -> 0x0114 }
                if (r1 != 0) goto L_0x007b
                com.inmobi.media.C5220ev.C5224a unused = r0.f11263d     // Catch:{ Exception -> 0x0114 }
                int r1 = r10.f11191c     // Catch:{ Exception -> 0x0114 }
                if (r1 != 0) goto L_0x0058
                r1 = 11
                r10.f11200l = r1     // Catch:{ Exception -> 0x0114 }
                r0.m11280a((com.inmobi.media.C4949ai) r10, (boolean) r3)     // Catch:{ Exception -> 0x0114 }
                r9.m11322a((com.inmobi.media.C4949ai) r10)     // Catch:{ Exception -> 0x0114 }
                return
            L_0x0058:
                boolean r1 = com.inmobi.media.C5328gx.m12274a()     // Catch:{ Exception -> 0x0114 }
                if (r1 != 0) goto L_0x0065
                r0.m11280a((com.inmobi.media.C4949ai) r10, (boolean) r3)     // Catch:{ Exception -> 0x0114 }
                r0.m11312j()     // Catch:{ Exception -> 0x0114 }
                return
            L_0x0065:
                com.inmobi.media.as r1 = r9.f11284b     // Catch:{ Exception -> 0x0114 }
                boolean r10 = r0.m11289a((com.inmobi.media.C4949ai) r10, (com.inmobi.media.C4969as) r1)     // Catch:{ Exception -> 0x0114 }
                if (r10 == 0) goto L_0x0074
                java.lang.String unused = com.inmobi.media.C4970at.f11259b     // Catch:{ Exception -> 0x0114 }
                java.lang.String unused = com.inmobi.media.C4970at.f11259b     // Catch:{ Exception -> 0x0114 }
                return
            L_0x0074:
                java.lang.String unused = com.inmobi.media.C4970at.f11259b     // Catch:{ Exception -> 0x0114 }
                r9.m11324b()     // Catch:{ Exception -> 0x0114 }
                return
            L_0x007b:
                java.lang.String unused = com.inmobi.media.C4970at.f11259b     // Catch:{ Exception -> 0x0114 }
                r9.m11321a()     // Catch:{ Exception -> 0x0114 }
                r0.m11280a((com.inmobi.media.C4949ai) r10, (boolean) r4)     // Catch:{ Exception -> 0x0114 }
                return
            L_0x0085:
                if (r0 == 0) goto L_0x0113
                com.inmobi.media.ev$a r10 = r0.f11263d     // Catch:{ Exception -> 0x0114 }
                if (r10 != 0) goto L_0x009c
                java.lang.String r10 = "ads"
                java.lang.String r1 = com.inmobi.media.C5314go.m12211f()     // Catch:{ Exception -> 0x0114 }
                r5 = 0
                com.inmobi.media.ex r10 = com.inmobi.media.C5239ey.m11987a(r10, r1, r5)     // Catch:{ Exception -> 0x0114 }
                com.inmobi.media.ev r10 = (com.inmobi.media.C5220ev) r10     // Catch:{ Exception -> 0x0114 }
                com.inmobi.media.ev$a r10 = r10.assetCache     // Catch:{ Exception -> 0x0114 }
            L_0x009c:
                com.inmobi.media.C4967ar unused = r0.f11262c     // Catch:{ Exception -> 0x0114 }
                java.util.List r1 = com.inmobi.media.C4967ar.m11268c()     // Catch:{ Exception -> 0x0114 }
                int r5 = r1.size()     // Catch:{ Exception -> 0x0114 }
                if (r5 > 0) goto L_0x00b0
                java.lang.String unused = com.inmobi.media.C4970at.f11259b     // Catch:{ Exception -> 0x0114 }
                r0.m11312j()     // Catch:{ Exception -> 0x0114 }
                return
            L_0x00b0:
                java.lang.String unused = com.inmobi.media.C4970at.f11259b     // Catch:{ Exception -> 0x0114 }
                java.lang.Object r3 = r1.get(r3)     // Catch:{ Exception -> 0x0114 }
                com.inmobi.media.ai r3 = (com.inmobi.media.C4949ai) r3     // Catch:{ Exception -> 0x0114 }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x0114 }
            L_0x00bd:
                boolean r5 = r1.hasNext()     // Catch:{ Exception -> 0x0114 }
                if (r5 == 0) goto L_0x00d0
                java.lang.Object r5 = r1.next()     // Catch:{ Exception -> 0x0114 }
                com.inmobi.media.ai r5 = (com.inmobi.media.C4949ai) r5     // Catch:{ Exception -> 0x0114 }
                boolean r6 = r0.f11270k.containsKey(r3.f11192d)     // Catch:{ Exception -> 0x0114 }
                if (r6 != 0) goto L_0x00bd
                r3 = r5
            L_0x00d0:
                android.os.Message r1 = android.os.Message.obtain()     // Catch:{ Exception -> 0x0114 }
                r1.what = r4     // Catch:{ Exception -> 0x0114 }
                long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0114 }
                long r6 = r3.f11194f     // Catch:{ Exception -> 0x0114 }
                long r4 = r4 - r6
                int r6 = r10.retryInterval     // Catch:{ Exception -> 0x0110 }
                int r6 = r6 * 1000
                long r6 = (long) r6     // Catch:{ Exception -> 0x0110 }
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 >= 0) goto L_0x00f0
                int r10 = r10.retryInterval     // Catch:{ Exception -> 0x0110 }
                int r10 = r10 * 1000
                long r2 = (long) r10     // Catch:{ Exception -> 0x0110 }
                long r2 = r2 - r4
                r9.sendMessageDelayed(r1, r2)     // Catch:{ Exception -> 0x0110 }
                return
            L_0x00f0:
                boolean r0 = r0.f11270k.containsKey(r3.f11192d)     // Catch:{ Exception -> 0x0110 }
                if (r0 == 0) goto L_0x00ff
                int r10 = r10.retryInterval     // Catch:{ Exception -> 0x0110 }
                int r10 = r10 * 1000
                long r2 = (long) r10     // Catch:{ Exception -> 0x0110 }
                r9.sendMessageDelayed(r1, r2)     // Catch:{ Exception -> 0x0110 }
                return
            L_0x00ff:
                java.lang.String unused = com.inmobi.media.C4970at.f11259b     // Catch:{ Exception -> 0x0110 }
                android.os.Message r10 = android.os.Message.obtain()     // Catch:{ Exception -> 0x0110 }
                r10.what = r2     // Catch:{ Exception -> 0x0110 }
                java.lang.String r0 = r3.f11192d     // Catch:{ Exception -> 0x0110 }
                r10.obj = r0     // Catch:{ Exception -> 0x0110 }
                r9.sendMessage(r10)     // Catch:{ Exception -> 0x0110 }
                return
            L_0x0110:
                java.lang.String unused = com.inmobi.media.C4970at.f11259b     // Catch:{ Exception -> 0x0114 }
            L_0x0113:
                return
            L_0x0114:
                r10 = move-exception
                java.lang.String unused = com.inmobi.media.C4970at.f11259b
                com.inmobi.media.fn r0 = com.inmobi.media.C5275fn.m12068a()
                com.inmobi.media.gk r1 = new com.inmobi.media.gk
                r1.<init>(r10)
                r0.mo40590a((com.inmobi.media.C5308gk) r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4970at.C4976a.handleMessage(android.os.Message):void");
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m11322a(C4949ai aiVar) {
            try {
                Message obtain = Message.obtain();
                obtain.what = 4;
                obtain.obj = aiVar;
                sendMessage(obtain);
            } catch (Exception unused) {
                String unused2 = C4970at.f11259b;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m11321a() {
            try {
                sendEmptyMessage(3);
            } catch (Exception unused) {
                String unused2 = C4970at.f11259b;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m11324b() {
            try {
                sendEmptyMessage(1);
            } catch (Exception unused) {
                String unused2 = C4970at.f11259b;
            }
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m11297c(C4970at atVar) {
        if (!atVar.f11269j.get()) {
            atVar.mo40122b();
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m11293b(C4970at atVar, final String str) {
        C4949ai a = C4967ar.m11263a(str);
        if (a == null || !a.mo40053a()) {
            C4949ai a2 = new C4949ai.C4950a().mo40057a(str, atVar.f11263d.maxRetries, atVar.f11263d.timeToLive).mo40059a();
            if (C4967ar.m11263a(str) == null) {
                atVar.f11262c.mo40118a(a2);
            }
            atVar.f11265f.execute(new Runnable() {
                public final void run() {
                    C4967ar unused = C4970at.this.f11262c;
                    C4949ai a = C4967ar.m11263a(str);
                    if (a == null) {
                        return;
                    }
                    if (a.mo40053a()) {
                        C4970at.this.m11296c(a);
                        return;
                    }
                    C4970at atVar = C4970at.this;
                    if (atVar.m11289a(a, atVar.f11273o)) {
                        String unused2 = C4970at.f11259b;
                    } else {
                        String unused3 = C4970at.f11259b;
                    }
                }
            });
            return;
        }
        atVar.m11296c(a);
    }

    /* renamed from: a */
    static /* synthetic */ void m11286a(C4970at atVar, List list, String str) {
        CountDownLatch countDownLatch = new CountDownLatch(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            try {
                C5075cl.m11515a(C5314go.m12203c()).load(str2).fetch((Callback) C5075cl.m11517a((InvocationHandler) new C4979c(countDownLatch, str2, SystemClock.elapsedRealtime(), str)));
            } catch (Exception unused) {
                countDownLatch.countDown();
            }
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException unused2) {
        }
    }
}
