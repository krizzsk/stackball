package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.yandex.metrica.impl.ob.D4 */
public class C10178D4 {

    /* renamed from: a */
    private final Object f24467a;

    /* renamed from: b */
    private final C10391J4 f24468b;

    /* renamed from: c */
    private final HashMap<C10153C4, C10210E4> f24469c;

    /* renamed from: d */
    private final C11007Zm<C10179a, C10153C4> f24470d;

    /* renamed from: e */
    private final Context f24471e;

    /* renamed from: f */
    private volatile int f24472f;

    /* renamed from: g */
    private final C10298G4 f24473g;

    /* renamed from: com.yandex.metrica.impl.ob.D4$a */
    private static final class C10179a {

        /* renamed from: a */
        private final String f24474a;

        /* renamed from: b */
        private final Integer f24475b;

        /* renamed from: c */
        private final String f24476c;

        C10179a(String str, Integer num, String str2) {
            this.f24474a = str;
            this.f24475b = num;
            this.f24476c = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C10179a.class != obj.getClass()) {
                return false;
            }
            C10179a aVar = (C10179a) obj;
            if (!this.f24474a.equals(aVar.f24474a)) {
                return false;
            }
            Integer num = this.f24475b;
            if (num == null ? aVar.f24475b != null : !num.equals(aVar.f24475b)) {
                return false;
            }
            String str = this.f24476c;
            String str2 = aVar.f24476c;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f24474a.hashCode() * 31;
            Integer num = this.f24475b;
            int i = 0;
            int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
            String str = this.f24476c;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode2 + i;
        }
    }

    public C10178D4(Context context, C10391J4 j4) {
        this(context, j4, new C10298G4());
    }

    /* renamed from: a */
    public C10210E4 mo61166a(C10153C4 c4, C10910X3 x3) {
        C10210E4 e4;
        synchronized (this.f24467a) {
            e4 = this.f24469c.get(c4);
            if (e4 == null) {
                e4 = this.f24473g.mo61351a(c4).mo61261a(this.f24471e, this.f24468b, c4, x3);
                this.f24469c.put(c4, e4);
                this.f24470d.mo62601a(new C10179a(c4.mo61130b(), c4.mo61131c(), c4.mo61132d()), c4);
                this.f24472f++;
            }
        }
        return e4;
    }

    C10178D4(Context context, C10391J4 j4, C10298G4 g4) {
        this.f24467a = new Object();
        this.f24469c = new HashMap<>();
        this.f24470d = new C11007Zm<>();
        this.f24472f = 0;
        this.f24471e = context.getApplicationContext();
        this.f24468b = j4;
        this.f24473g = g4;
    }

    /* renamed from: a */
    public void mo61167a(String str, int i, String str2) {
        Integer valueOf = Integer.valueOf(i);
        synchronized (this.f24467a) {
            Collection<C10153C4> b = this.f24470d.mo62603b(new C10179a(str, valueOf, str2));
            if (!C10796U2.m27896b((Collection) b)) {
                this.f24472f -= b.size();
                ArrayList arrayList = new ArrayList(b.size());
                for (C10153C4 remove : b) {
                    arrayList.add(this.f24469c.remove(remove));
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C10210E4) it.next()).mo61042a();
                }
            }
        }
    }
}
