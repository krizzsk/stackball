package com.yandex.metrica.impl.p265ob;

import java.util.HashSet;

/* renamed from: com.yandex.metrica.impl.ob.M2 */
public class C10490M2 {

    /* renamed from: a */
    private final C10491a f25171a;

    /* renamed from: b */
    private Boolean f25172b;

    /* renamed from: c */
    private final HashSet<String> f25173c = new HashSet<>();

    /* renamed from: d */
    private final HashSet<String> f25174d = new HashSet<>();

    /* renamed from: com.yandex.metrica.impl.ob.M2$a */
    public interface C10491a {
    }

    /* renamed from: com.yandex.metrica.impl.ob.M2$b */
    public static class C10492b implements C10491a {

        /* renamed from: a */
        private final C10364I9 f25175a;

        public C10492b(C10364I9 i9) {
            this.f25175a = i9;
        }

        /* renamed from: a */
        public void mo61777a(boolean z) {
            this.f25175a.mo61512b(z).mo61454c();
        }

        /* renamed from: a */
        public Boolean mo61776a() {
            return this.f25175a.mo61519e();
        }
    }

    public C10490M2(C10491a aVar) {
        this.f25171a = aVar;
        this.f25172b = ((C10492b) aVar).mo61776a();
    }

    /* renamed from: b */
    private boolean m26903b() {
        Boolean bool = this.f25172b;
        if (bool == null) {
            return !this.f25173c.isEmpty() || this.f25174d.isEmpty();
        }
        return bool.booleanValue();
    }

    /* renamed from: a */
    public synchronized void mo61770a(Boolean bool) {
        if (C10796U2.m27891a((Object) bool) || this.f25172b == null) {
            Boolean valueOf = Boolean.valueOf(Boolean.FALSE.equals(bool));
            this.f25172b = valueOf;
            ((C10492b) this.f25171a).mo61777a(valueOf.booleanValue());
        }
    }

    /* renamed from: c */
    public synchronized boolean mo61773c() {
        boolean z;
        Boolean bool = this.f25172b;
        if (bool == null) {
            z = this.f25174d.isEmpty() && this.f25173c.isEmpty();
        } else {
            z = bool.booleanValue();
        }
        return z;
    }

    /* renamed from: d */
    public synchronized boolean mo61774d() {
        return m26903b();
    }

    /* renamed from: e */
    public synchronized boolean mo61775e() {
        return m26903b();
    }

    /* renamed from: a */
    public synchronized void mo61771a(String str, Boolean bool) {
        if (C10796U2.m27891a((Object) bool) || (!this.f25174d.contains(str) && !this.f25173c.contains(str))) {
            Boolean bool2 = Boolean.TRUE;
            if (bool == null) {
                bool = bool2;
            }
            if (bool.booleanValue()) {
                this.f25174d.add(str);
                this.f25173c.remove(str);
            } else {
                this.f25173c.add(str);
                this.f25174d.remove(str);
            }
        }
    }

    /* renamed from: a */
    public synchronized boolean mo61772a() {
        Boolean bool;
        bool = this.f25172b;
        return bool == null ? this.f25174d.isEmpty() : bool.booleanValue();
    }
}
