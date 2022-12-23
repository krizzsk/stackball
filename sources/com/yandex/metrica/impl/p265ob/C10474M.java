package com.yandex.metrica.impl.p265ob;

import android.content.Intent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.M */
public class C10474M {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C11769sn f25141a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public volatile C10476b f25142b;

    /* renamed from: c */
    private final List<C10478c> f25143c = new ArrayList();

    /* renamed from: d */
    private final C10820Um<Intent> f25144d;

    /* renamed from: com.yandex.metrica.impl.ob.M$a */
    class C10475a implements C10820Um<Intent> {
        C10475a() {
        }

        /* renamed from: b */
        public void mo61092b(Object obj) {
            C10476b.C10477a aVar;
            Intent intent = (Intent) obj;
            C10476b a = C10474M.this.f25142b;
            if (a == null) {
                aVar = null;
            } else {
                aVar = a.f25147b;
            }
            C10476b a2 = C10474M.this.m26861a(intent);
            C10476b unused = C10474M.this.f25142b = a2;
            if (aVar != a2.f25147b) {
                ((C11725rn) C10474M.this.f25141a).execute(new C10441L(this, a2));
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.M$b */
    public static class C10476b {

        /* renamed from: a */
        public final Integer f25146a;

        /* renamed from: b */
        public final C10477a f25147b;

        /* renamed from: com.yandex.metrica.impl.ob.M$b$a */
        public enum C10477a {
            UNKNOWN(-1),
            NONE(0),
            USB(1),
            WIRELESS(2),
            AC(3);
            

            /* renamed from: a */
            private final int f25154a;

            private C10477a(int i) {
                this.f25154a = i;
            }

            /* renamed from: a */
            public int mo61753a() {
                return this.f25154a;
            }

            /* renamed from: a */
            public static C10477a m26871a(Integer num) {
                if (num != null) {
                    C10477a[] values = values();
                    for (int i = 0; i < 5; i++) {
                        C10477a aVar = values[i];
                        if (aVar.f25154a == num.intValue()) {
                            return aVar;
                        }
                    }
                }
                return UNKNOWN;
            }
        }

        public C10476b(Integer num, C10477a aVar) {
            this.f25146a = num;
            this.f25147b = aVar;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.M$c */
    public interface C10478c {
        /* renamed from: a */
        void mo61754a(C10476b.C10477a aVar);
    }

    public C10474M(C11769sn snVar, C10413K k) {
        C10475a aVar = new C10475a();
        this.f25144d = aVar;
        this.f25141a = snVar;
        this.f25142b = m26861a(k.mo61638c(aVar));
    }

    /* renamed from: b */
    public C10476b.C10477a mo61752b() {
        C10476b bVar = this.f25142b;
        return bVar == null ? C10476b.C10477a.UNKNOWN : bVar.f25147b;
    }

    /* renamed from: a */
    public Integer mo61750a() {
        C10476b bVar = this.f25142b;
        if (bVar == null) {
            return null;
        }
        return bVar.f25146a;
    }

    /* renamed from: a */
    public synchronized void mo61751a(C10478c cVar) {
        this.f25143c.add(cVar);
        ((C10956Yc) cVar).mo61754a(mo61752b());
    }

    /* renamed from: a */
    static void m26865a(C10474M m, C10476b.C10477a aVar) {
        synchronized (m) {
            for (C10478c a : m.f25143c) {
                a.mo61754a(aVar);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C10476b m26861a(Intent intent) {
        C10476b.C10477a aVar = C10476b.C10477a.UNKNOWN;
        Integer num = null;
        if (intent != null) {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra > 0 && intExtra2 > 0) {
                num = Integer.valueOf((intExtra * 100) / intExtra2);
            }
            int intExtra3 = intent.getIntExtra("plugged", -1);
            aVar = C10476b.C10477a.NONE;
            if (intExtra3 == 1) {
                aVar = C10476b.C10477a.AC;
            } else if (intExtra3 == 2) {
                aVar = C10476b.C10477a.USB;
            } else if (intExtra3 == 4) {
                aVar = C10476b.C10477a.WIRELESS;
            }
        }
        return new C10476b(num, aVar);
    }
}
