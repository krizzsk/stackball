package com.applovin.impl.adview;

import android.os.Handler;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.applovin.impl.adview.i */
public final class C1088i {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1505q f1966a;

    /* renamed from: b */
    private final Handler f1967b;

    /* renamed from: c */
    private final Set<C1091b> f1968c = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final AtomicInteger f1969d = new AtomicInteger();

    /* renamed from: com.applovin.impl.adview.i$a */
    public interface C1090a {
        /* renamed from: a */
        void mo11867a();

        /* renamed from: b */
        boolean mo11868b();
    }

    /* renamed from: com.applovin.impl.adview.i$b */
    private static class C1091b {

        /* renamed from: a */
        private final String f1973a;

        /* renamed from: b */
        private final C1090a f1974b;

        /* renamed from: c */
        private final long f1975c;

        private C1091b(String str, long j, C1090a aVar) {
            this.f1973a = str;
            this.f1975c = j;
            this.f1974b = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String m1613a() {
            return this.f1973a;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public long m1615b() {
            return this.f1975c;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public C1090a m1618c() {
            return this.f1974b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1091b)) {
                return false;
            }
            String str = this.f1973a;
            String str2 = ((C1091b) obj).f1973a;
            return str != null ? str.equalsIgnoreCase(str2) : str2 == null;
        }

        public int hashCode() {
            String str = this.f1973a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "CountdownProxy{identifier='" + this.f1973a + '\'' + ", countdownStepMillis=" + this.f1975c + '}';
        }
    }

    public C1088i(Handler handler, C1469j jVar) {
        if (handler == null) {
            throw new IllegalArgumentException("No handler specified.");
        } else if (jVar != null) {
            this.f1967b = handler;
            this.f1966a = jVar.mo13139v();
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1604a(final C1091b bVar, final int i) {
        this.f1967b.postDelayed(new Runnable() {
            public void run() {
                C1090a b = bVar.m1618c();
                if (!b.mo11868b()) {
                    C1505q b2 = C1088i.this.f1966a;
                    b2.mo13277b("CountdownManager", "Ending countdown for " + bVar.m1613a());
                } else if (C1088i.this.f1969d.get() == i) {
                    try {
                        b.mo11867a();
                    } catch (Throwable th) {
                        C1505q b3 = C1088i.this.f1966a;
                        b3.mo13278b("CountdownManager", "Encountered error on countdown step for: " + bVar.m1613a(), th);
                    }
                    C1088i.this.m1604a(bVar, i);
                } else {
                    C1505q b4 = C1088i.this.f1966a;
                    b4.mo13280d("CountdownManager", "Killing duplicate countdown from previous generation: " + bVar.m1613a());
                }
            }
        }, bVar.m1615b());
    }

    /* renamed from: a */
    public void mo11957a() {
        HashSet<C1091b> hashSet = new HashSet<>(this.f1968c);
        C1505q qVar = this.f1966a;
        qVar.mo13277b("CountdownManager", "Starting " + hashSet.size() + " countdowns...");
        int incrementAndGet = this.f1969d.incrementAndGet();
        for (C1091b bVar : hashSet) {
            C1505q qVar2 = this.f1966a;
            qVar2.mo13277b("CountdownManager", "Starting countdown: " + bVar.m1613a() + " for generation " + incrementAndGet + "...");
            m1604a(bVar, incrementAndGet);
        }
    }

    /* renamed from: a */
    public void mo11958a(String str, long j, C1090a aVar) {
        if (j <= 0) {
            throw new IllegalArgumentException("Invalid step specified.");
        } else if (this.f1967b != null) {
            C1505q qVar = this.f1966a;
            qVar.mo13277b("CountdownManager", "Adding countdown: " + str);
            this.f1968c.add(new C1091b(str, j, aVar));
        } else {
            throw new IllegalArgumentException("No handler specified.");
        }
    }

    /* renamed from: b */
    public void mo11959b() {
        this.f1966a.mo13277b("CountdownManager", "Removing all countdowns...");
        mo11960c();
        this.f1968c.clear();
    }

    /* renamed from: c */
    public void mo11960c() {
        this.f1966a.mo13277b("CountdownManager", "Stopping countdowns...");
        this.f1969d.incrementAndGet();
        this.f1967b.removeCallbacksAndMessages((Object) null);
    }
}
