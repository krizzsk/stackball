package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.Ln */
public class C10473Ln {

    /* renamed from: a */
    private final C10440Kn f25139a;

    /* renamed from: b */
    private final C10412Jn f25140b;

    public C10473Ln(C10380Im im, String str) {
        this(new C10440Kn(30, 50, 4000, str, im), new C10412Jn(4500, str, im));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized boolean mo61748a(C10320Gm gm, String str, String str2) {
        if (gm.size() >= this.f25139a.mo61692a().mo61410a()) {
            if (this.f25139a.mo61692a().mo61410a() != gm.size() || !gm.containsKey(str)) {
                this.f25139a.mo61693a(str);
                return false;
            }
        }
        if (!this.f25140b.mo61637a(gm, str, str2)) {
            gm.put(str, str2);
            return true;
        }
        this.f25140b.mo61636a(str);
        return false;
    }

    /* renamed from: b */
    public boolean mo61749b(C10320Gm gm, String str, String str2) {
        if (gm == null) {
            return false;
        }
        String a = this.f25139a.mo61694b().mo61205a(str);
        String a2 = this.f25139a.mo61695c().mo61205a(str2);
        if (gm.containsKey(a)) {
            String str3 = (String) gm.get(a);
            if (a2 == null || !a2.equals(str3)) {
                return mo61748a(gm, a, a2);
            }
            return false;
        } else if (a2 != null) {
            return mo61748a(gm, a, a2);
        } else {
            return false;
        }
    }

    C10473Ln(C10440Kn kn, C10412Jn jn) {
        this.f25139a = kn;
        this.f25140b = jn;
    }
}
