package com.yandex.metrica.impl.p265ob;

import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.S */
public class C10734S extends C11411k0 {

    /* renamed from: q */
    private HashMap<C10735a, Integer> f25755q;

    /* renamed from: r */
    private C10650Pn<String> f25756r;

    /* renamed from: s */
    private C10650Pn<String> f25757s;

    /* renamed from: t */
    private C10650Pn<String> f25758t;

    /* renamed from: u */
    private C10650Pn<byte[]> f25759u;

    /* renamed from: v */
    private C10650Pn<String> f25760v;

    /* renamed from: w */
    private C10650Pn<String> f25761w;

    /* renamed from: com.yandex.metrica.impl.ob.S$a */
    public enum C10735a {
        NAME,
        VALUE,
        USER_INFO
    }

    public C10734S(C10380Im im) {
        this.f25755q = new HashMap<>();
        m27655a(im);
    }

    /* renamed from: g */
    private String m27657g(String str) {
        String a = this.f25756r.mo61205a(str);
        m27656a(str, a, C10735a.NAME);
        return a;
    }

    /* renamed from: h */
    private String m27658h(String str) {
        String a = this.f25757s.mo61205a(str);
        m27656a(str, a, C10735a.VALUE);
        return a;
    }

    /* renamed from: r */
    public static C11411k0 m27659r() {
        C11411k0 k0Var = new C11411k0();
        k0Var.f27302e = C11413k1.EVENT_TYPE_SEND_USER_PROFILE.mo63170b();
        return k0Var;
    }

    /* renamed from: t */
    private void m27660t() {
        this.f27305h = 0;
        for (Integer intValue : this.f25755q.values()) {
            this.f27305h += intValue.intValue();
        }
    }

    /* renamed from: a */
    public C10734S mo62211a(HashMap<C10735a, Integer> hashMap) {
        this.f25755q = hashMap;
        return this;
    }

    /* renamed from: b */
    public C11411k0 mo62213b(String str) {
        String a = this.f25756r.mo61205a(str);
        m27656a(str, a, C10735a.NAME);
        this.f27298a = a;
        return this;
    }

    /* renamed from: d */
    public C11411k0 mo62214d(String str) {
        return super.mo62214d(this.f25760v.mo61205a(str));
    }

    /* renamed from: e */
    public C11411k0 mo62215e(String str) {
        String a = this.f25761w.mo61205a(str);
        m27656a(str, a, C10735a.USER_INFO);
        return super.mo62215e(a);
    }

    /* renamed from: f */
    public C11411k0 mo62216f(String str) {
        String a = this.f25757s.mo61205a(str);
        m27656a(str, a, C10735a.VALUE);
        this.f27299b = a;
        return this;
    }

    /* renamed from: i */
    public C10734S mo62217i(String str) {
        String a = this.f25758t.mo61205a(str);
        m27656a(str, a, C10735a.VALUE);
        this.f27299b = a;
        return this;
    }

    /* renamed from: s */
    public HashMap<C10735a, Integer> mo62218s() {
        return this.f25755q;
    }

    /* renamed from: a */
    private void m27655a(C10380Im im) {
        this.f25756r = new C10581Nn(1000, "event name", im);
        this.f25757s = new C10531Mn(245760, "event value", im);
        this.f25758t = new C10531Mn(1024000, "event extended value", im);
        this.f25759u = new C10198Dn(245760, "event value bytes", im);
        this.f25760v = new C10581Nn(200, "user profile id", im);
        this.f25761w = new C10581Nn(10000, "UserInfo", im);
    }

    public C10734S(String str, String str2, int i, C10380Im im) {
        this(str, str2, i, 0, im);
    }

    public C10734S(String str, String str2, int i, int i2, C10380Im im) {
        this.f25755q = new HashMap<>();
        m27655a(im);
        this.f27299b = m27658h(str);
        this.f27298a = m27657g(str2);
        this.f27302e = i;
        this.f27303f = i2;
    }

    /* renamed from: a */
    private void m27656a(String str, String str2, C10735a aVar) {
        if (C11327i.m29172a(str, str2)) {
            this.f25755q.put(aVar, Integer.valueOf(C10585O2.m27106c(str).length - C10585O2.m27106c(str2).length));
        } else {
            this.f25755q.remove(aVar);
        }
        m27660t();
    }

    /* renamed from: a */
    public final C11411k0 mo62212a(byte[] bArr) {
        byte[] a = this.f25759u.mo61205a(bArr);
        C10735a aVar = C10735a.VALUE;
        if (bArr.length != a.length) {
            this.f25755q.put(aVar, Integer.valueOf(bArr.length - a.length));
        } else {
            this.f25755q.remove(aVar);
        }
        m27660t();
        return super.mo62212a(a);
    }

    /* renamed from: a */
    static C11411k0 m27654a(String str, C10380Im im) {
        C10734S s = new C10734S(im);
        s.f27302e = C11413k1.EVENT_TYPE_SET_USER_PROFILE_ID.mo63170b();
        return super.mo62214d(s.f25760v.mo61205a(str));
    }

    public C10734S(byte[] bArr, String str, int i, C10380Im im) {
        this.f25755q = new HashMap<>();
        m27655a(im);
        mo62212a(bArr);
        this.f27298a = m27657g(str);
        this.f27302e = i;
    }
}
