package com.yandex.metrica.impl.p265ob;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.facebook.internal.NativeProtocol;
import com.yandex.metrica.MetricaService;
import com.yandex.metrica.impl.p265ob.C10479M0;
import com.yandex.metrica.impl.p265ob.C11246fi;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.ji */
public class C11390ji implements Runnable, C11288gi {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ServiceConnection f27238a;

    /* renamed from: b */
    private final Handler f27239b;

    /* renamed from: c */
    private final Runnable f27240c;

    /* renamed from: d */
    private final HashMap<String, C11087bi> f27241d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Context f27242e;

    /* renamed from: f */
    private volatile boolean f27243f;

    /* renamed from: g */
    private ServerSocket f27244g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C10226Ei f27245h;

    /* renamed from: i */
    private C11890vn f27246i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C10868W0 f27247j;

    /* renamed from: k */
    private final C10479M0.C10483d f27248k;

    /* renamed from: l */
    private final C11001Zh f27249l;

    /* renamed from: m */
    private final C11001Zh f27250m;

    /* renamed from: n */
    private final C11246fi f27251n;

    /* renamed from: o */
    private final C12039zn f27252o;

    /* renamed from: p */
    private final C10864Vm<C10226Ei, List<Integer>> f27253p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final C10964Yh f27254q;

    /* renamed from: r */
    private final C11353ii f27255r;

    /* renamed from: s */
    private final String f27256s;

    /* renamed from: com.yandex.metrica.impl.ob.ji$a */
    class C11391a implements ServiceConnection {
        C11391a(C11390ji jiVar) {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ji$b */
    class C11392b extends Handler {
        C11392b(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 100) {
                C11390ji.this.mo63119c();
                try {
                    C11390ji.this.f27242e.unbindService(C11390ji.this.f27238a);
                } catch (Throwable unused) {
                    C11390ji.this.f27247j.reportEvent("socket_unbind_has_thrown_exception");
                }
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ji$c */
    class C11393c implements Runnable {
        C11393c() {
        }

        public void run() {
            C11390ji jiVar = C11390ji.this;
            C11390ji.m29355a(jiVar, jiVar.f27245h);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ji$d */
    class C11394d extends HashMap<String, C11087bi> {

        /* renamed from: com.yandex.metrica.impl.ob.ji$d$a */
        class C11395a implements C11087bi {
            C11395a() {
            }

            /* renamed from: a */
            public C11049ai mo62703a(Socket socket, Uri uri, C11320hi hiVar) {
                C11390ji jiVar = C11390ji.this;
                return new C10673Qh(socket, uri, jiVar, jiVar.f27245h, C11390ji.this.f27254q.mo62549a(), hiVar);
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.ji$d$b */
        class C11396b implements C11087bi {
            C11396b() {
            }

            /* renamed from: a */
            public C11049ai mo62703a(Socket socket, Uri uri, C11320hi hiVar) {
                C11390ji jiVar = C11390ji.this;
                return new C11161di(socket, uri, jiVar, jiVar.f27245h, hiVar);
            }
        }

        C11394d() {
            put("p", new C11395a());
            put("i", new C11396b());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ji$e */
    class C11397e implements Runnable {
        C11397e() {
        }

        public void run() {
            C11390ji.m29363f(C11390ji.this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ji$f */
    private enum C11398f {
        f27263a,
        SHOULD_RETRY,
        ORDINARY_FAIL
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C11390ji(android.content.Context r15, com.yandex.metrica.impl.p265ob.C10675Qi r16, com.yandex.metrica.impl.p265ob.C11246fi r17, com.yandex.metrica.impl.p265ob.C10864Vm<com.yandex.metrica.impl.p265ob.C10226Ei, java.util.List<java.lang.Integer>> r18, com.yandex.metrica.impl.p265ob.C10889Wh r19, com.yandex.metrica.impl.p265ob.C10889Wh r20, java.lang.String r21) {
        /*
            r14 = this;
            com.yandex.metrica.impl.ob.P0 r0 = com.yandex.metrica.impl.p265ob.C10619P0.m27164i()
            com.yandex.metrica.impl.ob.M0 r4 = r0.mo61881h()
            com.yandex.metrica.impl.ob.P0 r0 = com.yandex.metrica.impl.p265ob.C10619P0.m27164i()
            com.yandex.metrica.impl.ob.zn r5 = r0.mo61891s()
            com.yandex.metrica.impl.ob.W0 r6 = com.yandex.metrica.impl.p265ob.C10611Oh.m27142a()
            com.yandex.metrica.impl.ob.Zh r7 = new com.yandex.metrica.impl.ob.Zh
            java.lang.String r0 = "open"
            r1 = r19
            r7.<init>(r0, r1)
            com.yandex.metrica.impl.ob.Zh r8 = new com.yandex.metrica.impl.ob.Zh
            java.lang.String r0 = "port_already_in_use"
            r1 = r20
            r8.<init>(r0, r1)
            com.yandex.metrica.impl.ob.Yh r9 = new com.yandex.metrica.impl.ob.Yh
            r0 = r15
            r3 = r16
            r9.<init>(r15, r3)
            com.yandex.metrica.impl.ob.ii r10 = new com.yandex.metrica.impl.ob.ii
            r10.<init>()
            r1 = r14
            r2 = r15
            r11 = r17
            r12 = r18
            r13 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11390ji.<init>(android.content.Context, com.yandex.metrica.impl.ob.Qi, com.yandex.metrica.impl.ob.fi, com.yandex.metrica.impl.ob.Vm, com.yandex.metrica.impl.ob.Wh, com.yandex.metrica.impl.ob.Wh, java.lang.String):void");
    }

    /* renamed from: f */
    static void m29363f(C11390ji jiVar) {
        jiVar.getClass();
        Intent intent = new Intent(jiVar.f27242e, MetricaService.class);
        intent.setAction("com.yandex.metrica.ACTION_BIND_TO_LOCAL_SERVER");
        try {
            if (!jiVar.f27242e.bindService(intent, jiVar.f27238a, 1)) {
                jiVar.f27247j.reportEvent("socket_bind_has_failed");
            }
        } catch (Throwable unused) {
            jiVar.f27247j.reportEvent("socket_bind_has_thrown_exception");
        }
        C11890vn b = jiVar.f27252o.mo64208b(jiVar);
        jiVar.f27246i = b;
        b.start();
        jiVar.f27255r.mo63049d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        if (com.yandex.metrica.impl.p265ob.C10796U2.m27890a(26) == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        android.net.TrafficStats.setThreadStatsTag(40230);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        if (r5.f27244g == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r5 = this;
            monitor-enter(r5)
            com.yandex.metrica.impl.ob.Ei r0 = r5.f27245h     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x002a
            com.yandex.metrica.impl.ob.ji$f r0 = r5.m29352a((com.yandex.metrica.impl.p265ob.C10226Ei) r0)     // Catch:{ all -> 0x0084 }
            com.yandex.metrica.impl.ob.ji$f r1 = com.yandex.metrica.impl.p265ob.C11390ji.C11398f.SHOULD_RETRY     // Catch:{ all -> 0x0084 }
            if (r0 != r1) goto L_0x002a
            r0 = 0
            r5.f27243f = r0     // Catch:{ all -> 0x0084 }
            com.yandex.metrica.impl.ob.Ei r0 = r5.f27245h     // Catch:{ all -> 0x0084 }
            long r0 = r0.f24602j     // Catch:{ all -> 0x0084 }
            com.yandex.metrica.impl.ob.zn r2 = r5.f27252o     // Catch:{ all -> 0x0084 }
            com.yandex.metrica.impl.ob.sn r2 = r2.mo64207b()     // Catch:{ all -> 0x0084 }
            java.lang.Runnable r3 = r5.f27240c     // Catch:{ all -> 0x0084 }
            com.yandex.metrica.impl.ob.rn r2 = (com.yandex.metrica.impl.p265ob.C11725rn) r2     // Catch:{ all -> 0x0084 }
            r2.mo63612a((java.lang.Runnable) r3)     // Catch:{ all -> 0x0084 }
            java.lang.Runnable r3 = r5.f27240c     // Catch:{ all -> 0x0084 }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0084 }
            r2.mo63614a(r3, r0, r4)     // Catch:{ all -> 0x0084 }
            monitor-exit(r5)     // Catch:{ all -> 0x0084 }
            return
        L_0x002a:
            monitor-exit(r5)     // Catch:{ all -> 0x0084 }
            r0 = 26
            boolean r1 = com.yandex.metrica.impl.p265ob.C10796U2.m27890a((int) r0)
            if (r1 == 0) goto L_0x0039
            r1 = 40230(0x9d26, float:5.6374E-41)
            android.net.TrafficStats.setThreadStatsTag(r1)
        L_0x0039:
            java.net.ServerSocket r1 = r5.f27244g
            if (r1 == 0) goto L_0x0083
        L_0x003d:
            boolean r1 = r5.f27243f
            if (r1 == 0) goto L_0x0083
            monitor-enter(r5)
            boolean r1 = r5.f27243f     // Catch:{ all -> 0x0080 }
            r2 = 0
            if (r1 == 0) goto L_0x004a
            java.net.ServerSocket r1 = r5.f27244g     // Catch:{ all -> 0x0080 }
            goto L_0x004b
        L_0x004a:
            r1 = r2
        L_0x004b:
            monitor-exit(r5)     // Catch:{ all -> 0x0080 }
            if (r1 == 0) goto L_0x003d
            java.net.Socket r2 = r1.accept()     // Catch:{ all -> 0x0077 }
            com.yandex.metrica.impl.ob.hi r1 = new com.yandex.metrica.impl.ob.hi     // Catch:{ all -> 0x0077 }
            com.yandex.metrica.impl.ob.Nm r3 = new com.yandex.metrica.impl.ob.Nm     // Catch:{ all -> 0x0077 }
            r3.<init>()     // Catch:{ all -> 0x0077 }
            com.yandex.metrica.impl.ob.Mm r4 = new com.yandex.metrica.impl.ob.Mm     // Catch:{ all -> 0x0077 }
            r4.<init>()     // Catch:{ all -> 0x0077 }
            r1.<init>(r3, r4)     // Catch:{ all -> 0x0077 }
            boolean r3 = com.yandex.metrica.impl.p265ob.C10796U2.m27890a((int) r0)     // Catch:{ all -> 0x0077 }
            if (r3 == 0) goto L_0x006a
            android.net.TrafficStats.tagSocket(r2)     // Catch:{ all -> 0x0077 }
        L_0x006a:
            com.yandex.metrica.impl.ob.ci r3 = new com.yandex.metrica.impl.ob.ci     // Catch:{ all -> 0x0077 }
            java.util.HashMap<java.lang.String, com.yandex.metrica.impl.ob.bi> r4 = r5.f27241d     // Catch:{ all -> 0x0077 }
            r3.<init>(r2, r5, r4, r1)     // Catch:{ all -> 0x0077 }
            r3.mo62732a()     // Catch:{ all -> 0x0077 }
            if (r2 == 0) goto L_0x003d
            goto L_0x007a
        L_0x0077:
            if (r2 == 0) goto L_0x003d
        L_0x007a:
            r2.close()     // Catch:{ IOException -> 0x007e }
            goto L_0x003d
        L_0x007e:
            goto L_0x003d
        L_0x0080:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0080 }
            throw r0
        L_0x0083:
            return
        L_0x0084:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0084 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11390ji.run():void");
    }

    /* renamed from: c */
    private synchronized void m29360c(C10226Ei ei) {
        if (!this.f27243f && this.f27248k.mo61763a(ei.f24598f)) {
            this.f27243f = true;
        }
    }

    /* renamed from: a */
    public void mo63109a() {
        this.f27239b.removeMessages(100);
        this.f27255r.mo63050e();
    }

    /* renamed from: b */
    public synchronized void mo63116b() {
        if (this.f27243f) {
            mo63109a();
            Handler handler = this.f27239b;
            handler.sendMessageDelayed(handler.obtainMessage(100), TimeUnit.SECONDS.toMillis(this.f27245h.f24593a));
            this.f27255r.mo63048c();
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public synchronized void mo63110a(com.yandex.metrica.impl.p265ob.C10675Qi r1) {
        /*
            r0 = this;
            monitor-enter(r0)
            com.yandex.metrica.impl.ob.Ei r1 = r1.mo61998M()     // Catch:{ all -> 0x0012 }
            monitor-enter(r0)     // Catch:{ all -> 0x0012 }
            if (r1 == 0) goto L_0x000f
            r0.m29360c((com.yandex.metrica.impl.p265ob.C10226Ei) r1)     // Catch:{ all -> 0x000c }
            goto L_0x000f
        L_0x000c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            throw r1     // Catch:{ all -> 0x0012 }
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            monitor-exit(r0)
            return
        L_0x0012:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11390ji.mo63110a(com.yandex.metrica.impl.ob.Qi):void");
    }

    C11390ji(Context context, C10675Qi qi, C10479M0 m0, C12039zn znVar, C10868W0 w0, C11001Zh zh, C11001Zh zh2, C10964Yh yh, C11353ii iiVar, C11246fi fiVar, C10864Vm<C10226Ei, List<Integer>> vm, String str) {
        this.f27238a = new C11391a(this);
        this.f27239b = new C11392b(Looper.getMainLooper());
        this.f27240c = new C11393c();
        this.f27241d = new C11394d();
        this.f27242e = context;
        this.f27247j = w0;
        this.f27249l = zh;
        this.f27250m = zh2;
        this.f27251n = fiVar;
        this.f27253p = vm;
        this.f27252o = znVar;
        this.f27254q = yh;
        this.f27255r = iiVar;
        String format = String.format("[YandexUID%sServer]", new Object[]{str});
        this.f27256s = format;
        this.f27248k = m0.mo61755a(new C11397e(), znVar.mo64207b(), format);
        m29358b(qi.mo61998M());
        C10226Ei ei = this.f27245h;
        if (ei != null) {
            m29360c(ei);
        }
    }

    /* renamed from: a */
    static void m29355a(C11390ji jiVar, C10226Ei ei) {
        synchronized (jiVar) {
            if (ei != null) {
                jiVar.m29360c(ei);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo63119c() {
        /*
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            r2.f27243f = r0     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
            com.yandex.metrica.impl.ob.vn r0 = r2.f27246i     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
            r1 = 0
            if (r0 == 0) goto L_0x000e
            r0.mo63993d()     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
            r2.f27246i = r1     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
        L_0x000e:
            java.net.ServerSocket r0 = r2.f27244g     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
            if (r0 == 0) goto L_0x001b
            r0.close()     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
            r2.f27244g = r1     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
            goto L_0x001b
        L_0x0018:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x001b:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11390ji.mo63119c():void");
    }

    /* renamed from: a */
    private synchronized C11398f m29352a(C10226Ei ei) {
        C11398f fVar;
        Integer num;
        C11246fi.C11247a e;
        String message;
        Throwable cause;
        Throwable th;
        Iterator it = this.f27253p.mo61128a(ei).iterator();
        Integer num2 = null;
        fVar = C11398f.ORDINARY_FAIL;
        while (this.f27244g == null && it.hasNext()) {
            try {
                num = (Integer) it.next();
                if (num != null) {
                    try {
                        this.f27244g = this.f27251n.mo62149a(num.intValue());
                        fVar = C11398f.f27263a;
                        this.f27249l.mo62592a(this, num.intValue(), ei);
                    } catch (BindException unused) {
                        num2 = num;
                    } catch (C11246fi.C11247a e2) {
                        e = e2;
                        message = e.getMessage();
                        cause = e.getCause();
                        if (!(cause == null || message == null)) {
                            Map<String, Object> a = m29354a(num);
                            ((HashMap) a).put("exception", Log.getStackTraceString(cause));
                            this.f27247j.reportEvent(m29357b(message), a);
                        }
                        num2 = num;
                    } catch (Throwable th2) {
                        th = th2;
                        Map<String, Object> a2 = m29354a(num);
                        ((HashMap) a2).put("exception", Log.getStackTraceString(th));
                        this.f27247j.reportEvent(m29357b("open_error"), a2);
                        num2 = num;
                    }
                }
            } catch (BindException unused2) {
                fVar = C11398f.SHOULD_RETRY;
                this.f27250m.mo62592a(this, num2.intValue(), ei);
            } catch (C11246fi.C11247a e3) {
                C11246fi.C11247a aVar = e3;
                num = num2;
                e = aVar;
                message = e.getMessage();
                cause = e.getCause();
                Map<String, Object> a3 = m29354a(num);
                ((HashMap) a3).put("exception", Log.getStackTraceString(cause));
                this.f27247j.reportEvent(m29357b(message), a3);
                num2 = num;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                num = num2;
                th = th4;
                Map<String, Object> a22 = m29354a(num);
                ((HashMap) a22).put("exception", Log.getStackTraceString(th));
                this.f27247j.reportEvent(m29357b("open_error"), a22);
                num2 = num;
            }
            num2 = num;
        }
        return fVar;
    }

    /* renamed from: b */
    private void m29358b(C10226Ei ei) {
        this.f27245h = ei;
        if (ei != null) {
            this.f27248k.mo61761a(ei.f24597e);
        }
    }

    /* renamed from: b */
    public void mo63117b(int i, C11320hi hiVar) {
        this.f27247j.reportEvent(m29357b("sync_succeed"), m29353a(i, hiVar));
    }

    /* renamed from: b */
    public synchronized void mo63118b(C10675Qi qi) {
        this.f27254q.mo62550a(qi);
        C10226Ei M = qi.mo61998M();
        if (M != null) {
            this.f27245h = M;
            this.f27248k.mo61761a(M.f24597e);
            m29360c(M);
        } else {
            mo63119c();
            m29358b((C10226Ei) null);
        }
    }

    /* renamed from: b */
    private String m29357b(String str) {
        return "socket_" + str;
    }

    /* renamed from: a */
    private Map<String, Object> m29354a(Integer num) {
        String str;
        HashMap hashMap = new HashMap();
        if (num == null) {
            str = "";
        } else {
            str = String.valueOf(num);
        }
        hashMap.put("port", str);
        return hashMap;
    }

    /* renamed from: a */
    private Map<String, Object> m29353a(int i, C11320hi hiVar) {
        Map<String, Object> a = m29354a(Integer.valueOf(i));
        HashMap hashMap = (HashMap) a;
        hashMap.put("idle_interval", Double.valueOf(this.f27255r.mo63047b()));
        hashMap.put("background_interval", Double.valueOf(this.f27255r.mo63046a()));
        hashMap.put("request_read_time", Long.valueOf(hiVar.mo63019d()));
        hashMap.put("response_form_time", Long.valueOf(hiVar.mo63020e()));
        hashMap.put("response_send_time", Long.valueOf(hiVar.mo63021f()));
        return a;
    }

    /* renamed from: a */
    public void mo63113a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("uri", str2);
        C10868W0 w0 = this.f27247j;
        w0.reportEvent("socket_" + str, (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public void mo63111a(String str) {
        this.f27247j.reportEvent(m29357b(str));
    }

    /* renamed from: a */
    public void mo63114a(String str, Throwable th) {
        this.f27247j.reportError(m29357b(str), th);
    }

    /* renamed from: a */
    public void mo63112a(String str, Integer num) {
        this.f27247j.reportEvent(m29357b(str), m29354a(num));
    }

    /* renamed from: a */
    public void mo63115a(Map<String, Object> map, int i, C11320hi hiVar) {
        Map<String, Object> a = m29353a(i, hiVar);
        ((HashMap) a).put(NativeProtocol.WEB_DIALOG_PARAMS, map);
        this.f27247j.reportEvent(m29357b("reversed_sync_succeed"), a);
    }
}
