package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C14168o6;
import java.util.Iterator;
import java.util.PriorityQueue;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

public final class zn1 {

    /* renamed from: a */
    private final C15333b f43240a;

    /* renamed from: com.yandex.mobile.ads.impl.zn1$a */
    private static final class C15332a implements Runnable, Comparable<C15332a> {

        /* renamed from: e */
        static final /* synthetic */ KProperty<Object>[] f43241e = {Reflection.property1(new PropertyReference1Impl(C15332a.class, "channelRef", "getChannelRef()Lcom/yandex/div/view/pooling/AdvanceViewPool$Channel;", 0))};

        /* renamed from: b */
        private final int f43242b;

        /* renamed from: c */
        private final String f43243c;

        /* renamed from: d */
        private final ReadWriteProperty f43244d;

        public C15332a(C14168o6.C14169a<?> aVar, int i) {
            Intrinsics.checkNotNullParameter(aVar, "channel");
            this.f43242b = i;
            this.f43243c = aVar.mo69123d();
            this.f43244d = kh1.m38357a(aVar);
        }

        /* renamed from: a */
        public final String mo71260a() {
            return this.f43243c;
        }

        public int compareTo(Object obj) {
            C15332a aVar = (C15332a) obj;
            Intrinsics.checkNotNullParameter(aVar, "other");
            int i = this.f43242b - aVar.f43242b;
            if (i != 0) {
                return i;
            }
            return Intrinsics.areEqual((Object) this.f43243c, (Object) aVar.f43243c) ^ true ? 1 : 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!Intrinsics.areEqual((Object) C15332a.class, (Object) obj == null ? null : obj.getClass())) {
                return false;
            }
            if (obj != null) {
                C15332a aVar = (C15332a) obj;
                return Intrinsics.areEqual((Object) this.f43243c, (Object) aVar.f43243c) && this.f43242b == aVar.f43242b;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.view.pooling.ViewCreator.CreateViewTask");
        }

        public int hashCode() {
            return ((this.f43242b + 6913) * 31) + this.f43243c.hashCode();
        }

        public void run() {
            C14168o6.C14169a aVar = (C14168o6.C14169a) this.f43244d.getValue(this, f43241e[0]);
            if (aVar != null) {
                aVar.mo69120a();
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.zn1$b */
    private static final class C15333b extends Thread {

        /* renamed from: b */
        private final C13323hi f43245b;

        /* renamed from: c */
        private final C15158xb<C15332a> f43246c = new C15158xb<>(new PriorityQueue(32));

        /* renamed from: d */
        private volatile String f43247d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15333b(String str, C13323hi hiVar) {
            super(str);
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(hiVar, "cpuUsageHistogramReporter");
            this.f43245b = hiVar;
            setPriority(5);
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        private final void m44732a() throws InterruptedException {
            C15332a poll = this.f43246c.poll();
            if (poll == null) {
                try {
                    setPriority(3);
                    poll = this.f43246c.take();
                    setPriority(5);
                    Intrinsics.checkNotNullExpressionValue(poll, "run {\n                //…          }\n            }");
                } catch (Throwable th) {
                    setPriority(5);
                    throw th;
                }
            }
            this.f43247d = poll.mo71260a();
            poll.run();
            this.f43247d = null;
        }

        /* renamed from: b */
        public final String mo71265b() {
            return this.f43247d;
        }

        /* renamed from: c */
        public final C15158xb<C15332a> mo71266c() {
            return this.f43246c;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(6:1|2|4|5|6|7) */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
            r0.mo65530a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
            throw r1;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0012 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
                com.yandex.mobile.ads.impl.hi r0 = r3.f43245b
                int r1 = android.os.Process.myTid()
                java.lang.String r2 = "Div.ViewPool.CPU"
                com.yandex.mobile.ads.impl.le r0 = r0.mo67558a(r2, r1)
            L_0x000c:
                r3.m44732a()     // Catch:{ InterruptedException -> 0x0012 }
                goto L_0x000c
            L_0x0010:
                r1 = move-exception
                goto L_0x001d
            L_0x0012:
                java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0010 }
                r1.interrupt()     // Catch:{ all -> 0x0010 }
                r0.mo65530a()
                return
            L_0x001d:
                r0.mo65530a()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.zn1.C15333b.run():void");
        }
    }

    public zn1(C13323hi hiVar) {
        Intrinsics.checkNotNullParameter(hiVar, "cpuUsageHistogramReporter");
        C15333b bVar = new C15333b("ViewPoolThread", hiVar);
        this.f43240a = bVar;
        bVar.start();
    }

    /* renamed from: a */
    public final void mo71259a(C14168o6.C14169a<?> aVar, int i) {
        Intrinsics.checkNotNullParameter(aVar, "channel");
        this.f43240a.mo71266c().offer(new C15332a(aVar, i));
    }

    /* renamed from: a */
    public final void mo71258a(C14168o6.C14169a<?> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "channel");
        if (!Intrinsics.areEqual((Object) aVar.mo69123d(), (Object) this.f43240a.mo71265b()) && !aVar.mo69122c()) {
            C15158xb<C15332a> c = this.f43240a.mo71266c();
            c.f42486c.lock();
            try {
                if (!Intrinsics.areEqual((Object) aVar.mo69123d(), (Object) this.f43240a.mo71265b())) {
                    if (!aVar.mo69122c()) {
                        c = this.f43240a.mo71266c();
                        c.f42486c.lock();
                        Iterator it = c.f42485b.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (Intrinsics.areEqual((Object) ((C15332a) it.next()).mo71260a(), (Object) aVar.mo69123d())) {
                                    it.remove();
                                    break;
                                }
                            }
                        }
                        c.f42486c.unlock();
                        this.f43240a.mo71266c().offer(new C15332a(aVar, -1));
                        Unit unit = Unit.INSTANCE;
                    }
                }
            } catch (Throwable th) {
                throw th;
            } finally {
                c.f42486c.unlock();
            }
        }
    }
}
