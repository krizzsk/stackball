package com.tapjoy.internal;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tapjoy.TJConnectListener;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.tapjoy.internal.gb */
public abstract class C9302gb {

    /* renamed from: a */
    private final ReentrantLock f22999a;

    /* renamed from: b */
    volatile int f23000b = C9310c.f23022a;

    /* renamed from: c */
    C9307b f23001c;

    /* renamed from: d */
    long f23002d = 1000;

    /* renamed from: e */
    C9306a f23003e;

    /* renamed from: f */
    private final Condition f23004f;

    /* renamed from: g */
    private final LinkedList f23005g = new LinkedList();

    /* renamed from: h */
    private C9306a f23006h;

    /* renamed from: a */
    public abstract boolean mo58084a(Context context, String str, Hashtable hashtable, TJConnectListener tJConnectListener);

    public C9302gb() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f22999a = reentrantLock;
        this.f23004f = reentrantLock.newCondition();
    }

    /* renamed from: com.tapjoy.internal.gb$c */
    enum C9310c {
        ;
        

        /* renamed from: a */
        public static final int f23022a = 1;

        /* renamed from: b */
        public static final int f23023b = 2;

        /* renamed from: c */
        public static final int f23024c = 3;

        /* renamed from: d */
        public static final int f23025d = 4;

        /* renamed from: e */
        public static final int f23026e = 5;

        static {
            f23027f = new int[]{1, 2, 3, 4, 5};
        }

        /* renamed from: a */
        public static int[] m24947a() {
            return (int[]) f23027f.clone();
        }
    }

    /* renamed from: b */
    public final boolean mo58179b(Context context, String str, Hashtable hashtable, TJConnectListener tJConnectListener) {
        this.f22999a.lock();
        if (tJConnectListener != null) {
            try {
                this.f23005g.addLast(C9278fn.m24888a(tJConnectListener, TJConnectListener.class));
            } catch (Throwable th) {
                this.f22999a.unlock();
                throw th;
            }
        }
        C9306a aVar = new C9306a(context, str, hashtable);
        int i = C93053.f23009a[this.f23000b - 1];
        if (i != 1) {
            if (i == 2) {
                this.f23003e = aVar;
                C9288fs.f22966b.addObserver(new Observer() {
                    public final void update(Observable observable, Object obj) {
                        C9288fs.f22966b.deleteObserver(this);
                        if (!Boolean.valueOf(Boolean.TRUE.equals(obj)).booleanValue() && C9302gb.this.f23003e != null && C9302gb.this.f23003e.f23010a != null) {
                            C9302gb.this.f23001c = new C9307b(C9302gb.this, (byte) 0);
                            C9302gb.this.f23001c.mo58455e();
                        }
                    }
                });
                if (mo58084a(aVar.f23010a, aVar.f23011b, aVar.f23012c, new TJConnectListener() {
                    public final void onConnectSuccess() {
                        C9302gb gbVar = C9302gb.this;
                        int i = C9310c.f23026e;
                        int i2 = C9310c.f23023b;
                        gbVar.mo58175a(i);
                        C9302gb.this.mo58176a(true);
                    }

                    public final void onConnectFailure() {
                        C9302gb.this.mo58176a(false);
                    }
                })) {
                    int i2 = C9310c.f23023b;
                    int i3 = C9310c.f23022a;
                    mo58175a(i2);
                } else {
                    this.f23005g.clear();
                }
            } else if (i == 3 || i == 4) {
                this.f23006h = aVar;
            } else if (i != 5) {
                mo58175a(C9310c.f23022a);
            } else {
                this.f23006h = aVar;
                mo58178b();
            }
            this.f22999a.unlock();
            return false;
        }
        mo58176a(true);
        this.f22999a.unlock();
        return true;
    }

    /* renamed from: com.tapjoy.internal.gb$3 */
    static /* synthetic */ class C93053 {

        /* renamed from: a */
        static final /* synthetic */ int[] f23009a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0027 */
        static {
            /*
                int[] r0 = com.tapjoy.internal.C9302gb.C9310c.m24947a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23009a = r0
                r1 = 1
                int r2 = com.tapjoy.internal.C9302gb.C9310c.f23026e     // Catch:{ NoSuchFieldError -> 0x000f }
                int r2 = r2 - r1
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                int[] r0 = f23009a     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r2 = com.tapjoy.internal.C9302gb.C9310c.f23022a     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r2 = r2 - r1
                r3 = 2
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r0 = f23009a     // Catch:{ NoSuchFieldError -> 0x001f }
                int r2 = com.tapjoy.internal.C9302gb.C9310c.f23023b     // Catch:{ NoSuchFieldError -> 0x001f }
                int r2 = r2 - r1
                r3 = 3
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f23009a     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r2 = com.tapjoy.internal.C9302gb.C9310c.f23024c     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r2 = r2 - r1
                r3 = 4
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0027 }
            L_0x0027:
                int[] r0 = f23009a     // Catch:{ NoSuchFieldError -> 0x002f }
                int r2 = com.tapjoy.internal.C9302gb.C9310c.f23025d     // Catch:{ NoSuchFieldError -> 0x002f }
                int r2 = r2 - r1
                r1 = 5
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x002f }
            L_0x002f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C9302gb.C93053.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo58175a(int i) {
        this.f22999a.lock();
        try {
            this.f23000b = i;
        } finally {
            this.f22999a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C9306a mo58174a() {
        this.f22999a.lock();
        try {
            if (this.f23006h != null) {
                this.f23003e = this.f23006h;
                this.f23006h = null;
            }
            return this.f23003e;
        } finally {
            this.f22999a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo58176a(boolean z) {
        this.f22999a.lock();
        try {
            if (this.f23005g.size() != 0) {
                ArrayList arrayList = new ArrayList(this.f23005g);
                this.f23005g.clear();
                this.f22999a.unlock();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    TJConnectListener tJConnectListener = (TJConnectListener) it.next();
                    if (z) {
                        tJConnectListener.onConnectSuccess();
                    } else {
                        tJConnectListener.onConnectFailure();
                    }
                }
            }
        } finally {
            this.f22999a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo58178b() {
        this.f22999a.lock();
        try {
            this.f23002d = 1000;
            this.f23004f.signal();
        } finally {
            this.f22999a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo58177a(long j) {
        this.f22999a.lock();
        try {
            int i = C9310c.f23025d;
            int i2 = C9310c.f23024c;
            mo58175a(i);
            if (this.f23004f.await(j, TimeUnit.MILLISECONDS)) {
                this.f23002d = 1000;
            }
        } catch (InterruptedException unused) {
        } catch (Throwable th) {
            int i3 = C9310c.f23024c;
            int i4 = C9310c.f23025d;
            mo58175a(i3);
            this.f22999a.unlock();
            throw th;
        }
        int i5 = C9310c.f23024c;
        int i6 = C9310c.f23025d;
        mo58175a(i5);
        this.f22999a.unlock();
        return false;
    }

    /* renamed from: com.tapjoy.internal.gb$a */
    class C9306a {

        /* renamed from: a */
        public final Context f23010a;

        /* renamed from: b */
        public final String f23011b;

        /* renamed from: c */
        public final Hashtable f23012c;

        public C9306a(Context context, String str, Hashtable hashtable) {
            Context context2;
            if (context == null) {
                context2 = null;
            } else if (context instanceof Application) {
                context2 = context;
            } else {
                context2 = context.getApplicationContext();
            }
            this.f23010a = context2 != null ? context2 : context;
            this.f23011b = str;
            this.f23012c = hashtable;
        }
    }

    /* renamed from: com.tapjoy.internal.gb$b */
    class C9307b extends C9478ka {

        /* renamed from: b */
        private boolean f23015b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f23016c;

        /* renamed from: d */
        private Context f23017d;

        /* renamed from: e */
        private BroadcastReceiver f23018e;

        private C9307b() {
            this.f23018e = new BroadcastReceiver() {
                public final void onReceive(Context context, Intent intent) {
                    C9302gb.this.mo58178b();
                }
            };
        }

        /* synthetic */ C9307b(C9302gb gbVar, byte b) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo58181a() {
            this.f23015b = true;
            C9302gb.this.mo58178b();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo58182b() {
            C9302gb gbVar = C9302gb.this;
            int i = C9310c.f23024c;
            int i2 = C9310c.f23023b;
            gbVar.mo58175a(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final void mo58183c() {
            if (C9302gb.this.f23001c == this) {
                C9302gb.this.f23001c = null;
            }
            if (C9302gb.this.f23000b == C9310c.f23024c) {
                C9302gb gbVar = C9302gb.this;
                int i = C9310c.f23022a;
                int i2 = C9310c.f23024c;
                gbVar.mo58175a(i);
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x004e */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0064 A[SYNTHETIC, Splitter:B:17:0x0064] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0052 A[SYNTHETIC] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo58184d() {
            /*
                r7 = this;
                com.tapjoy.internal.gb r0 = com.tapjoy.internal.C9302gb.this
                com.tapjoy.internal.gb$a r0 = r0.mo58174a()
                android.content.Context r0 = r0.f23010a
                r7.f23017d = r0
                android.content.IntentFilter r0 = new android.content.IntentFilter
                java.lang.String r1 = "android.net.conn.CONNECTIVITY_CHANGE"
                r0.<init>(r1)
                android.content.Context r1 = r7.f23017d
                android.content.BroadcastReceiver r2 = r7.f23018e
                r1.registerReceiver(r2, r0)
            L_0x0018:
                boolean r0 = r7.f23015b     // Catch:{ all -> 0x008b }
                if (r0 != 0) goto L_0x0087
                java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x008b }
                r1 = 1
                r0.<init>(r1)     // Catch:{ all -> 0x008b }
                com.tapjoy.internal.fs$a r2 = com.tapjoy.internal.C9288fs.f22966b     // Catch:{ all -> 0x008b }
                com.tapjoy.internal.gb$b$1 r3 = new com.tapjoy.internal.gb$b$1     // Catch:{ all -> 0x008b }
                r3.<init>(r0)     // Catch:{ all -> 0x008b }
                r2.addObserver(r3)     // Catch:{ all -> 0x008b }
                com.tapjoy.internal.gb r2 = com.tapjoy.internal.C9302gb.this     // Catch:{ all -> 0x008b }
                com.tapjoy.internal.gb$a r2 = r2.mo58174a()     // Catch:{ all -> 0x008b }
                com.tapjoy.internal.gb r3 = com.tapjoy.internal.C9302gb.this     // Catch:{ all -> 0x008b }
                android.content.Context r4 = r2.f23010a     // Catch:{ all -> 0x008b }
                java.lang.String r5 = r2.f23011b     // Catch:{ all -> 0x008b }
                java.util.Hashtable r2 = r2.f23012c     // Catch:{ all -> 0x008b }
                r6 = 0
                boolean r2 = r3.mo58084a(r4, r5, r2, r6)     // Catch:{ all -> 0x008b }
                r3 = 0
                if (r2 != 0) goto L_0x004b
                com.tapjoy.internal.gb r0 = com.tapjoy.internal.C9302gb.this     // Catch:{ all -> 0x008b }
                r0.mo58176a((boolean) r3)     // Catch:{ all -> 0x008b }
                r7.m24942h()
                return
            L_0x004b:
                r0.await()     // Catch:{ InterruptedException -> 0x004e }
            L_0x004e:
                boolean r0 = r7.f23016c     // Catch:{ all -> 0x008b }
                if (r0 == 0) goto L_0x0064
                com.tapjoy.internal.gb r0 = com.tapjoy.internal.C9302gb.this     // Catch:{ all -> 0x008b }
                int r2 = com.tapjoy.internal.C9302gb.C9310c.f23026e     // Catch:{ all -> 0x008b }
                int r3 = com.tapjoy.internal.C9302gb.C9310c.f23024c     // Catch:{ all -> 0x008b }
                r0.mo58175a((int) r2)     // Catch:{ all -> 0x008b }
                com.tapjoy.internal.gb r0 = com.tapjoy.internal.C9302gb.this     // Catch:{ all -> 0x008b }
                r0.mo58176a((boolean) r1)     // Catch:{ all -> 0x008b }
                r7.m24942h()
                return
            L_0x0064:
                com.tapjoy.internal.gb r0 = com.tapjoy.internal.C9302gb.this     // Catch:{ all -> 0x008b }
                r0.mo58176a((boolean) r3)     // Catch:{ all -> 0x008b }
                com.tapjoy.internal.gb r0 = com.tapjoy.internal.C9302gb.this     // Catch:{ all -> 0x008b }
                long r0 = r0.f23002d     // Catch:{ all -> 0x008b }
                r2 = 1000(0x3e8, double:4.94E-321)
                long r0 = java.lang.Math.max(r0, r2)     // Catch:{ all -> 0x008b }
                com.tapjoy.internal.gb r2 = com.tapjoy.internal.C9302gb.this     // Catch:{ all -> 0x008b }
                r3 = 2
                long r3 = r0 << r3
                r5 = 3600000(0x36ee80, double:1.7786363E-317)
                long r3 = java.lang.Math.min(r3, r5)     // Catch:{ all -> 0x008b }
                r2.f23002d = r3     // Catch:{ all -> 0x008b }
                com.tapjoy.internal.gb r2 = com.tapjoy.internal.C9302gb.this     // Catch:{ all -> 0x008b }
                r2.mo58177a((long) r0)     // Catch:{ all -> 0x008b }
                goto L_0x0018
            L_0x0087:
                r7.m24942h()
                return
            L_0x008b:
                r0 = move-exception
                r7.m24942h()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C9302gb.C9307b.mo58184d():void");
        }

        /* renamed from: h */
        private void m24942h() {
            this.f23017d.unregisterReceiver(this.f23018e);
        }
    }
}
