package com.inmobi.media;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.inmobi.media.C5250fc;
import com.inmobi.media.C5253fe;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.inmobi.media.ey */
/* compiled from: ConfigComponent */
public class C5239ey {

    /* renamed from: a */
    public static boolean f11997a = false;

    /* renamed from: b */
    public static AtomicBoolean f11998b = new AtomicBoolean(false);

    /* renamed from: c */
    public static CopyOnWriteArrayList<C5238ex> f11999c = new CopyOnWriteArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final String f12000d = C5239ey.class.getSimpleName();

    /* renamed from: e */
    private static Map<C5238ex, ArrayList<WeakReference<C5242c>>> f12001e = new HashMap();

    /* renamed from: f */
    private static C5240a f12002f;

    /* renamed from: com.inmobi.media.ey$c */
    /* compiled from: ConfigComponent */
    public interface C5242c {
        /* renamed from: a */
        void mo40121a(C5238ex exVar);
    }

    static {
        HandlerThread handlerThread = new HandlerThread("ConfigBootstrapHandler");
        handlerThread.start();
        f12002f = new C5240a(handlerThread.getLooper());
    }

    /* renamed from: a */
    public static void m11989a() {
        if (!f11998b.getAndSet(true)) {
            new C5243ez();
            f11999c.addAll(C5243ez.m12004a());
            m11987a("root", C5314go.m12211f(), (C5242c) null);
        }
    }

    /* renamed from: b */
    public static void m11995b() {
        if (f11998b.getAndSet(false)) {
            f11999c.clear();
            f12002f.sendEmptyMessage(5);
        }
    }

    /* renamed from: a */
    public static C5238ex m11987a(String str, String str2, C5242c cVar) {
        C5238ex a = C5238ex.m11980a(str, str2);
        if (str2 == null) {
            return a;
        }
        Message obtainMessage = f12002f.obtainMessage();
        obtainMessage.what = 0;
        obtainMessage.obj = new C5249fb(a, cVar);
        f12002f.sendMessage(obtainMessage);
        if (!f11999c.isEmpty()) {
            Iterator<C5238ex> it = f11999c.iterator();
            while (it.hasNext()) {
                C5238ex next = it.next();
                if (next.equals(a)) {
                    return next;
                }
            }
        }
        return a;
    }

    /* renamed from: a */
    public static void m11992a(String str) {
        new C5243ez();
        C5261fk fkVar = (C5261fk) C5243ez.m12003a("root", str);
        String str2 = fkVar.latestSdkInfo.version;
        String str3 = fkVar.latestSdkInfo.url;
        if (str2.trim().length() != 0 && m11997b(C5315gp.m12226b(), str2.trim())) {
            String str4 = f12000d;
            C5327gw.m12263a((byte) 2, str4, "A newer version (version " + str2 + ") of the InMobi SDK is available! You are currently on an older version (Version " + C5315gp.m12226b() + "). Please download the latest InMobi SDK from " + str3);
        }
    }

    /* renamed from: a */
    private static boolean m11994a(long j, long j2) {
        return System.currentTimeMillis() - j > j2 * 1000;
    }

    /* renamed from: b */
    private static void m11996b(C5238ex exVar) {
        Message obtainMessage = f12002f.obtainMessage();
        obtainMessage.what = 1;
        obtainMessage.obj = exVar;
        f12002f.sendMessage(obtainMessage);
    }

    /* renamed from: com.inmobi.media.ey$b */
    /* compiled from: ConfigComponent */
    static class C5241b {

        /* renamed from: a */
        final String f12007a;

        /* renamed from: b */
        final String f12008b;

        C5241b(String str, String str2) {
            this.f12007a = str;
            this.f12008b = str2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C5241b)) {
                return false;
            }
            C5241b bVar = (C5241b) obj;
            if (!this.f12007a.equals(bVar.f12007a) || !this.f12008b.equals(bVar.f12008b)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.f12007a.hashCode() + this.f12008b.hashCode();
        }
    }

    /* renamed from: com.inmobi.media.ey$a */
    /* compiled from: ConfigComponent */
    static final class C5240a extends Handler implements C5250fc.C5251a {

        /* renamed from: a */
        private List<C5238ex> f12003a = new ArrayList();

        /* renamed from: b */
        private Map<C5241b, Map<String, C5238ex>> f12004b = new HashMap();

        /* renamed from: c */
        private Map<String, C5238ex> f12005c = new HashMap();

        /* renamed from: d */
        private ExecutorService f12006d;

        C5240a(Looper looper) {
            super(looper);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: byte} */
        /* JADX WARNING: type inference failed for: r14v1, types: [byte] */
        /* JADX WARNING: type inference failed for: r15v2, types: [byte] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r20) {
            /*
                r19 = this;
                r0 = r19
                r1 = r20
                int r2 = r1.what
                r3 = 0
                r4 = 0
                r5 = 3
                r6 = 1
                java.lang.String r7 = "root"
                switch(r2) {
                    case 0: goto L_0x026b;
                    case 1: goto L_0x01f0;
                    case 2: goto L_0x01d8;
                    case 3: goto L_0x0163;
                    case 4: goto L_0x00b4;
                    case 5: goto L_0x009a;
                    case 6: goto L_0x0016;
                    default: goto L_0x000f;
                }
            L_0x000f:
                java.lang.String unused = com.inmobi.media.C5239ey.f12000d
                int r1 = r1.what
                goto L_0x029d
            L_0x0016:
                java.lang.Object r1 = r1.obj
                com.inmobi.media.fe$a r1 = (com.inmobi.media.C5253fe.C5254a) r1
                com.inmobi.media.ez r2 = new com.inmobi.media.ez
                r2.<init>()
                boolean r2 = r1.mo40577a()
                if (r2 != 0) goto L_0x0091
                int r2 = r1.f12037a
                r3 = 304(0x130, float:4.26E-43)
                if (r2 != r3) goto L_0x004f
                java.lang.String unused = com.inmobi.media.C5239ey.f12000d
                com.inmobi.media.ex r2 = r1.f12038b
                r2.mo40557b()
                com.inmobi.media.ex r2 = r1.f12038b
                java.lang.String r2 = r2.mo40564g()
                if (r2 == 0) goto L_0x004e
                com.inmobi.media.ex r2 = r1.f12038b
                java.lang.String r2 = r2.mo40557b()
                com.inmobi.media.ex r1 = r1.f12038b
                java.lang.String r1 = r1.mo40564g()
                long r3 = java.lang.System.currentTimeMillis()
                com.inmobi.media.C5243ez.m12006a(r2, r1, r3)
            L_0x004e:
                return
            L_0x004f:
                com.inmobi.media.ex r2 = r1.f12038b
                com.inmobi.media.C5243ez.m12005a((com.inmobi.media.C5238ex) r2)
                java.lang.String unused = com.inmobi.media.C5239ey.f12000d
                com.inmobi.media.ex r2 = r1.f12038b
                r2.mo40557b()
                java.lang.String unused = com.inmobi.media.C5239ey.f12000d
                com.inmobi.media.ex r2 = r1.f12038b
                r2.mo40558c()
                java.lang.String unused = com.inmobi.media.C5239ey.f12000d
                com.inmobi.media.ex r2 = r1.f12038b
                r2.mo40564g()
                java.util.concurrent.CopyOnWriteArrayList<com.inmobi.media.ex> r2 = com.inmobi.media.C5239ey.f11999c
                com.inmobi.media.ex r3 = r1.f12038b
                r2.remove(r3)
                java.util.concurrent.CopyOnWriteArrayList<com.inmobi.media.ex> r2 = com.inmobi.media.C5239ey.f11999c
                com.inmobi.media.ex r3 = r1.f12038b
                r2.add(r3)
                com.inmobi.media.ex r2 = r1.f12038b
                java.lang.String r2 = r2.mo40557b()
                java.lang.String r3 = "appOwnership"
                boolean r2 = r3.equals(r2)
                if (r2 == 0) goto L_0x008b
                com.inmobi.media.C5319gs.m12242a()
            L_0x008b:
                com.inmobi.media.ex r1 = r1.f12038b
                com.inmobi.media.C5239ey.m11990a((com.inmobi.media.C5238ex) r1)
                return
            L_0x0091:
                java.lang.String unused = com.inmobi.media.C5239ey.f12000d
                com.inmobi.media.ex r1 = r1.f12038b
                r1.mo40557b()
                return
            L_0x009a:
                java.util.concurrent.ExecutorService r1 = r0.f12006d
                if (r1 == 0) goto L_0x00b3
                boolean r1 = r1.isShutdown()
                if (r1 != 0) goto L_0x00b3
                r0.f12005c = r3
                java.util.Map<com.inmobi.media.ey$b, java.util.Map<java.lang.String, com.inmobi.media.ex>> r1 = r0.f12004b
                r1.clear()
                r0.removeMessages(r5)
                java.util.concurrent.ExecutorService r1 = r0.f12006d
                r1.shutdownNow()
            L_0x00b3:
                return
            L_0x00b4:
                java.util.Map<com.inmobi.media.ey$b, java.util.Map<java.lang.String, com.inmobi.media.ex>> r1 = r0.f12004b
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L_0x015b
                java.util.Map<com.inmobi.media.ey$b, java.util.Map<java.lang.String, com.inmobi.media.ex>> r1 = r0.f12004b
                java.util.Set r1 = r1.entrySet()
                java.util.Iterator r1 = r1.iterator()
                java.lang.Object r1 = r1.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getValue()
                java.util.Map r2 = (java.util.Map) r2
                r0.f12005c = r2
                java.util.Map<com.inmobi.media.ey$b, java.util.Map<java.lang.String, com.inmobi.media.ex>> r2 = r0.f12004b
                java.lang.Object r4 = r1.getKey()
                r2.remove(r4)
                java.lang.Object r2 = r1.getKey()
                com.inmobi.media.ey$b r2 = (com.inmobi.media.C5239ey.C5241b) r2
                java.util.Map<java.lang.String, com.inmobi.media.ex> r4 = r0.f12005c
                java.lang.Object r1 = r1.getKey()
                com.inmobi.media.ey$b r1 = (com.inmobi.media.C5239ey.C5241b) r1
                java.lang.String r1 = r1.f12008b
                com.inmobi.media.ez r5 = new com.inmobi.media.ez
                r5.<init>()
                com.inmobi.media.ex r5 = com.inmobi.media.C5243ez.m12003a(r7, r1)
                com.inmobi.media.fk r5 = (com.inmobi.media.C5261fk) r5
                int r16 = r5.mo40584h()
                int r17 = r5.mo40583e()
                com.inmobi.media.hu r15 = new com.inmobi.media.hu
                com.inmobi.media.fh r8 = r5.mo40563f()
                r15.<init>(r8)
                byte r8 = com.inmobi.media.C5346hh.m12349f()
                if (r8 != 0) goto L_0x011a
                boolean r9 = r4.containsKey(r7)
                if (r9 == 0) goto L_0x011a
                java.util.Map r4 = com.inmobi.media.C5239ey.m11988a((java.util.Map) r4)
                goto L_0x011b
            L_0x011a:
                r6 = r8
            L_0x011b:
                com.inmobi.media.fd r14 = new com.inmobi.media.fd
                java.lang.String r11 = r2.f12007a
                r8 = r14
                r9 = r4
                r10 = r15
                r12 = r17
                r13 = r16
                r2 = r14
                r14 = r6
                r18 = r15
                r15 = r1
                r8.<init>(r9, r10, r11, r12, r13, r14, r15)
                boolean r7 = r4.containsKey(r7)
                if (r7 == 0) goto L_0x014c
                java.lang.String r11 = r5.mo40587k()
                com.inmobi.media.fd r3 = new com.inmobi.media.fd
                java.util.Map r9 = com.inmobi.media.C5239ey.m11988a((java.util.Map) r4)
                r14 = 1
                r8 = r3
                r10 = r18
                r12 = r17
                r13 = r16
                r15 = r6
                r16 = r1
                r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            L_0x014c:
                com.inmobi.media.fc r1 = new com.inmobi.media.fc
                r1.<init>(r0, r2, r3)
                java.util.concurrent.ExecutorService r2 = r0.f12006d     // Catch:{ OutOfMemoryError -> 0x0157 }
                r2.execute(r1)     // Catch:{ OutOfMemoryError -> 0x0157 }
                return
            L_0x0157:
                java.lang.String unused = com.inmobi.media.C5239ey.f12000d
                return
            L_0x015b:
                java.lang.String unused = com.inmobi.media.C5239ey.f12000d
                r1 = 5
                r0.sendEmptyMessage(r1)
                return
            L_0x0163:
                java.util.List<com.inmobi.media.ex> r1 = r0.f12003a
            L_0x0165:
                int r2 = r1.size()
                if (r4 >= r2) goto L_0x01b5
                java.lang.Object r2 = r1.get(r4)
                com.inmobi.media.ex r2 = (com.inmobi.media.C5238ex) r2
                java.lang.String r3 = r2.mo40564g()
                if (r3 == 0) goto L_0x01b2
                com.inmobi.media.ez r3 = new com.inmobi.media.ez
                r3.<init>()
                java.lang.String r3 = r2.mo40564g()
                com.inmobi.media.ex r3 = com.inmobi.media.C5243ez.m12003a(r7, r3)
                com.inmobi.media.fk r3 = (com.inmobi.media.C5261fk) r3
                com.inmobi.media.ey$b r5 = new com.inmobi.media.ey$b
                java.lang.String r8 = r2.mo40557b()
                java.lang.String r3 = r3.mo40582b(r8)
                java.lang.String r8 = r2.mo40564g()
                r5.<init>(r3, r8)
                java.util.Map<com.inmobi.media.ey$b, java.util.Map<java.lang.String, com.inmobi.media.ex>> r3 = r0.f12004b
                java.lang.Object r3 = r3.get(r5)
                java.util.HashMap r3 = (java.util.HashMap) r3
                if (r3 != 0) goto L_0x01ab
                java.util.HashMap r3 = new java.util.HashMap
                r3.<init>()
                java.util.Map<com.inmobi.media.ey$b, java.util.Map<java.lang.String, com.inmobi.media.ex>> r8 = r0.f12004b
                r8.put(r5, r3)
            L_0x01ab:
                java.lang.String r5 = r2.mo40557b()
                r3.put(r5, r2)
            L_0x01b2:
                int r4 = r4 + 1
                goto L_0x0165
            L_0x01b5:
                java.util.List<com.inmobi.media.ex> r1 = r0.f12003a
                r1.clear()
                java.util.concurrent.ExecutorService r1 = r0.f12006d
                if (r1 == 0) goto L_0x01c4
                boolean r1 = r1.isShutdown()
                if (r1 == 0) goto L_0x029d
            L_0x01c4:
                com.inmobi.media.gv r1 = new com.inmobi.media.gv
                java.lang.String r2 = com.inmobi.media.C5239ey.f12000d
                r1.<init>(r2)
                java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newFixedThreadPool(r6, r1)
                r0.f12006d = r1
                r1 = 4
                r0.sendEmptyMessage(r1)
                return
            L_0x01d8:
                com.inmobi.media.ez r2 = new com.inmobi.media.ez
                r2.<init>()
                java.lang.Object r1 = r1.obj
                java.lang.String r1 = (java.lang.String) r1
                com.inmobi.media.ex r1 = com.inmobi.media.C5243ez.m12003a(r7, r1)
                com.inmobi.media.fk r1 = (com.inmobi.media.C5261fk) r1
                int r1 = r1.waitTime
                int r1 = r1 * 1000
                long r1 = (long) r1
                r0.sendEmptyMessageDelayed(r5, r1)
                return
            L_0x01f0:
                java.lang.Object r1 = r1.obj
                com.inmobi.media.ex r1 = (com.inmobi.media.C5238ex) r1
                java.lang.String r2 = r1.mo40564g()
                if (r2 != 0) goto L_0x0201
                java.lang.String unused = com.inmobi.media.C5239ey.f12000d
                r1.mo40557b()
                return
            L_0x0201:
                java.lang.String r2 = r1.mo40557b()
                java.lang.String r3 = r1.mo40564g()
                com.inmobi.media.ez r5 = new com.inmobi.media.ez
                r5.<init>()
                com.inmobi.media.ex r5 = com.inmobi.media.C5243ez.m12003a(r7, r3)
                com.inmobi.media.fk r5 = (com.inmobi.media.C5261fk) r5
                com.inmobi.media.ey$b r7 = new com.inmobi.media.ey$b
                java.lang.String r5 = r5.mo40582b(r2)
                r7.<init>(r5, r3)
                java.util.Map<com.inmobi.media.ey$b, java.util.Map<java.lang.String, com.inmobi.media.ex>> r3 = r0.f12004b
                java.lang.Object r3 = r3.get(r7)
                if (r3 == 0) goto L_0x0234
                java.util.Map<com.inmobi.media.ey$b, java.util.Map<java.lang.String, com.inmobi.media.ex>> r3 = r0.f12004b
                java.lang.Object r3 = r3.get(r7)
                java.util.Map r3 = (java.util.Map) r3
                boolean r3 = r3.containsKey(r2)
                if (r3 == 0) goto L_0x0234
                r4 = 1
            L_0x0234:
                java.util.Map<java.lang.String, com.inmobi.media.ex> r3 = r0.f12005c
                if (r3 == 0) goto L_0x023f
                boolean r2 = r3.containsKey(r2)
                if (r2 == 0) goto L_0x023f
                goto L_0x0240
            L_0x023f:
                r6 = r4
            L_0x0240:
                java.lang.String unused = com.inmobi.media.C5239ey.f12000d
                r1.mo40557b()
                if (r6 != 0) goto L_0x0264
                java.util.List<com.inmobi.media.ex> r2 = r0.f12003a
                r2.add(r1)
                r2 = 2
                boolean r3 = r0.hasMessages(r2)
                if (r3 != 0) goto L_0x029d
                android.os.Message r3 = android.os.Message.obtain()
                r3.what = r2
                java.lang.String r1 = r1.mo40564g()
                r3.obj = r1
                r0.sendMessage(r3)
                return
            L_0x0264:
                java.lang.String unused = com.inmobi.media.C5239ey.f12000d
                r1.mo40557b()
                return
            L_0x026b:
                java.lang.Object r1 = r1.obj
                com.inmobi.media.fb r1 = (com.inmobi.media.C5249fb) r1
                com.inmobi.media.ex r2 = r1.f12019a
                java.util.concurrent.atomic.AtomicBoolean r3 = com.inmobi.media.C5239ey.f11998b
                boolean r3 = r3.get()
                if (r3 != 0) goto L_0x0280
                java.lang.String unused = com.inmobi.media.C5239ey.f12000d
                r2.mo40557b()
                return
            L_0x0280:
                com.inmobi.media.ey$c r1 = r1.f12020b
                com.inmobi.media.C5239ey.m11991a((com.inmobi.media.C5238ex) r2, (com.inmobi.media.C5239ey.C5242c) r1)
                java.lang.String r1 = r2.mo40564g()
                if (r1 != 0) goto L_0x0292
                java.lang.String unused = com.inmobi.media.C5239ey.f12000d
                r2.mo40557b()
                return
            L_0x0292:
                java.lang.String r1 = r2.mo40557b()
                java.lang.String r2 = r2.mo40564g()
                com.inmobi.media.C5239ey.m11993a((java.lang.String) r1, (java.lang.String) r2)
            L_0x029d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5239ey.C5240a.handleMessage(android.os.Message):void");
        }

        /* renamed from: a */
        public final void mo40566a(C5253fe.C5254a aVar) {
            Message obtain = Message.obtain();
            obtain.what = 6;
            obtain.obj = aVar;
            sendMessage(obtain);
        }

        /* renamed from: a */
        public final void mo40567a(String str) {
            Message obtain = Message.obtain();
            obtain.what = 4;
            obtain.obj = str;
            sendMessage(obtain);
        }
    }

    /* renamed from: b */
    private static boolean m11997b(String str, String str2) {
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        try {
            for (String valueOf : split) {
                if (Integer.valueOf(valueOf).intValue() < 0) {
                    return false;
                }
            }
            for (String valueOf2 : split2) {
                if (Integer.valueOf(valueOf2).intValue() < 0) {
                    return false;
                }
            }
            int length = split.length < split2.length ? split.length : split2.length;
            int i = 0;
            while (i < length) {
                if (split[i].equals(split2[i])) {
                    i++;
                } else if (Integer.valueOf(split[i]).intValue() < Integer.valueOf(split2[i]).intValue()) {
                    return true;
                } else {
                    return false;
                }
            }
            if (split.length < split2.length) {
                return true;
            }
            return false;
        } catch (NumberFormatException unused) {
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m11991a(C5238ex exVar, C5242c cVar) {
        WeakReference weakReference;
        ArrayList arrayList = f12001e.get(exVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (cVar == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference(cVar);
        }
        arrayList.add(weakReference);
        f12001e.put(exVar, arrayList);
    }

    /* renamed from: a */
    static /* synthetic */ void m11993a(String str, String str2) {
        new C5243ez();
        C5238ex a = C5238ex.m11980a(str, str2);
        if (C5243ez.m12007b("root", str2)) {
            m11996b(C5238ex.m11980a("root", str2));
            return;
        }
        C5261fk fkVar = (C5261fk) C5243ez.m12003a("root", str2);
        if (m11994a(C5243ez.m12008c(fkVar.mo40557b(), str2), fkVar.mo40580a(fkVar.mo40557b()))) {
            m11996b(C5238ex.m11980a("root", str2));
        }
        if ("root".equals(str)) {
            return;
        }
        if (C5243ez.m12007b(str, str2)) {
            m11996b(a);
        } else if (m11994a(C5243ez.m12008c(str, str2), fkVar.mo40580a(str))) {
            m11996b(a);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m11990a(C5238ex exVar) {
        C5242c cVar;
        ArrayList arrayList = f12001e.get(exVar);
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (!(arrayList.get(i) == null || (cVar = (C5242c) ((WeakReference) arrayList.get(i)).get()) == null)) {
                    cVar.mo40121a(exVar);
                }
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ Map m11988a(Map map) {
        HashMap hashMap = new HashMap(1);
        hashMap.put("root", map.get("root"));
        return hashMap;
    }
}
