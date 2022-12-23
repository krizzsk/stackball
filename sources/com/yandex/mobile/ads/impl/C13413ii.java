package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.models.p268ad.C15561a;
import com.yandex.mobile.ads.video.models.p268ad.C15566b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.ii */
public class C13413ii implements in1 {

    /* renamed from: a */
    private final List<C15566b> f34870a;

    /* renamed from: b */
    private final List<C15561a> f34871b;

    /* renamed from: c */
    private final List<qe1> f34872c;

    /* renamed from: d */
    private final C13709ki f34873d;

    /* renamed from: e */
    private final re1 f34874e = new re1();

    /* renamed from: f */
    private final String f34875f;

    /* renamed from: g */
    private final String f34876g;

    /* renamed from: h */
    private g91 f34877h;

    /* renamed from: i */
    private int f34878i;

    /* renamed from: com.yandex.mobile.ads.impl.ii$a */
    public static class C13414a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final List<C15566b> f34879a = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final List<C15561a> f34880b = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final List<qe1> f34881c = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C13709ki f34882d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public String f34883e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public g91 f34884f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public String f34885g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f34886h;

        /* renamed from: a */
        public C13414a mo67793a(int i) {
            this.f34886h = i;
            return this;
        }

        /* renamed from: b */
        public C13414a mo67801b(String str) {
            this.f34885g = str;
            return this;
        }

        /* renamed from: a */
        public C13414a mo67798a(Collection<C15561a> collection) {
            List<C15561a> list = this.f34880b;
            if (collection == null) {
                collection = Collections.emptyList();
            }
            list.addAll(collection);
            return this;
        }

        /* renamed from: b */
        public C13414a mo67802b(Collection<C15566b> collection) {
            List<C15566b> list = this.f34879a;
            if (collection == null) {
                collection = Collections.emptyList();
            }
            list.addAll(collection);
            return this;
        }

        /* renamed from: a */
        public C13414a mo67799a(List<qe1> list) {
            for (qe1 add : list) {
                this.f34881c.add(add);
            }
            return this;
        }

        /* renamed from: a */
        public C13414a mo67795a(C13709ki kiVar) {
            this.f34882d = kiVar;
            return this;
        }

        /* renamed from: a */
        public C13414a mo67796a(qe1 qe1) {
            this.f34881c.add(qe1);
            return this;
        }

        /* renamed from: a */
        public C13414a mo67797a(String str) {
            this.f34883e = str;
            return this;
        }

        /* renamed from: a */
        public C13414a mo67794a(g91 g91) {
            this.f34884f = g91;
            return this;
        }

        /* renamed from: a */
        public C13413ii mo67800a() {
            return new C13413ii(this);
        }
    }

    C13413ii(C13414a aVar) {
        this.f34876g = aVar.f34885g;
        this.f34878i = aVar.f34886h;
        this.f34870a = aVar.f34879a;
        this.f34871b = aVar.f34880b;
        this.f34872c = aVar.f34881c;
        this.f34873d = aVar.f34882d;
        this.f34875f = aVar.f34883e;
        this.f34877h = aVar.f34884f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> mo65493a() {
        /*
            r5 = this;
            com.yandex.mobile.ads.impl.re1 r0 = r5.f34874e
            java.util.List<com.yandex.mobile.ads.impl.qe1> r1 = r5.f34872c
            r0.getClass()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0010:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x003e
            java.lang.Object r2 = r1.next()
            com.yandex.mobile.ads.impl.qe1 r2 = (com.yandex.mobile.ads.impl.qe1) r2
            java.lang.String r3 = r2.mo69585a()
            boolean r4 = r0.containsKey(r3)
            if (r4 != 0) goto L_0x002f
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.put(r3, r4)
            goto L_0x0036
        L_0x002f:
            java.lang.Object r3 = r0.get(r3)
            r4 = r3
            java.util.List r4 = (java.util.List) r4
        L_0x0036:
            java.lang.String r2 = r2.mo69587c()
            r4.add(r2)
            goto L_0x0010
        L_0x003e:
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C13413ii.mo65493a():java.util.Map");
    }

    /* renamed from: b */
    public String mo67784b() {
        return this.f34875f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C13709ki mo67785c() {
        return this.f34873d;
    }

    /* renamed from: d */
    public int mo67786d() {
        return this.f34878i;
    }

    /* renamed from: e */
    public List<C15561a> mo67787e() {
        return Collections.unmodifiableList(this.f34871b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13413ii.class != obj.getClass()) {
            return false;
        }
        C13413ii iiVar = (C13413ii) obj;
        if (this.f34878i != iiVar.f34878i || !this.f34870a.equals(iiVar.f34870a) || !this.f34871b.equals(iiVar.f34871b) || !this.f34872c.equals(iiVar.f34872c)) {
            return false;
        }
        C13709ki kiVar = this.f34873d;
        if (kiVar == null ? iiVar.f34873d != null : !kiVar.equals(iiVar.f34873d)) {
            return false;
        }
        String str = this.f34875f;
        if (str == null ? iiVar.f34875f != null : !str.equals(iiVar.f34875f)) {
            return false;
        }
        g91 g91 = this.f34877h;
        if (g91 == null ? iiVar.f34877h != null : !g91.equals(iiVar.f34877h)) {
            return false;
        }
        String str2 = this.f34876g;
        String str3 = iiVar.f34876g;
        return str2 == null ? str3 == null : str2.equals(str3);
    }

    /* renamed from: f */
    public List<C15566b> mo67789f() {
        return Collections.unmodifiableList(this.f34870a);
    }

    /* renamed from: g */
    public g91 mo67790g() {
        return this.f34877h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public List<qe1> mo67791h() {
        return this.f34872c;
    }

    public int hashCode() {
        int hashCode = ((((this.f34870a.hashCode() * 31) + this.f34871b.hashCode()) * 31) + this.f34872c.hashCode()) * 31;
        C13709ki kiVar = this.f34873d;
        int i = 0;
        int hashCode2 = (hashCode + (kiVar != null ? kiVar.hashCode() : 0)) * 31;
        String str = this.f34875f;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        g91 g91 = this.f34877h;
        int hashCode4 = (hashCode3 + (g91 != null ? g91.hashCode() : 0)) * 31;
        String str2 = this.f34876g;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode4 + i) * 31) + this.f34878i;
    }
}
