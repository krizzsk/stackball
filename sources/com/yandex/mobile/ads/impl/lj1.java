package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.mobile.ads.impl.yj1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class lj1 implements in1 {

    /* renamed from: a */
    private final List<C13413ii> f36680a;

    /* renamed from: b */
    private final yj1 f36681b;

    /* renamed from: c */
    private final Map<String, List<String>> f36682c;

    /* renamed from: d */
    private final Map<String, List<String>> f36683d;

    /* renamed from: e */
    private final String f36684e;

    /* renamed from: f */
    private final String f36685f;

    /* renamed from: g */
    private final String f36686g;

    /* renamed from: h */
    private final String f36687h;

    /* renamed from: i */
    private final String f36688i;

    /* renamed from: j */
    private final ro1 f36689j;

    /* renamed from: k */
    private final Integer f36690k;

    /* renamed from: l */
    private zq1 f36691l;

    /* renamed from: m */
    private final List<vi1> f36692m;

    /* renamed from: n */
    private final boolean f36693n;

    /* renamed from: com.yandex.mobile.ads.impl.lj1$a */
    public static class C13860a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public zq1 f36694a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f36695b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f36696c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f36697d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public String f36698e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public String f36699f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public ro1 f36700g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public Integer f36701h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public final boolean f36702i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public final List<C13413ii> f36703j = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: k */
        public final List<vi1> f36704k = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: l */
        public Map<String, List<String>> f36705l = new HashMap();
        /* access modifiers changed from: private */

        /* renamed from: m */
        public final Map<String, List<String>> f36706m = new HashMap();
        /* access modifiers changed from: private */

        /* renamed from: n */
        public yj1 f36707n = new yj1.C15255a().mo71094a();

        /* renamed from: o */
        private final ml1 f36708o;

        public C13860a(Context context, boolean z) {
            this.f36702i = z;
            this.f36708o = new ml1(context);
        }

        /* renamed from: a */
        public C13860a mo68472a(zq1 zq1) {
            this.f36694a = zq1;
            return this;
        }

        /* renamed from: b */
        public C13860a mo68479b(String str) {
            this.f36696c = str;
            return this;
        }

        /* renamed from: c */
        public C13860a mo68481c(String str) {
            this.f36697d = str;
            return this;
        }

        /* renamed from: d */
        public C13860a mo68482d(String str) {
            this.f36698e = str;
            return this;
        }

        /* renamed from: e */
        public C13860a mo68483e(String str) {
            this.f36699f = str;
            return this;
        }

        /* renamed from: a */
        public C13860a mo68474a(String str) {
            this.f36695b = str;
            return this;
        }

        /* renamed from: b */
        public C13860a mo68480b(Collection<C13413ii> collection) {
            this.f36703j.addAll(collection);
            return this;
        }

        /* renamed from: a */
        public C13860a mo68473a(Integer num) {
            this.f36701h = num;
            return this;
        }

        /* renamed from: a */
        public C13860a mo68471a(yj1 yj1) {
            this.f36707n = yj1;
            return this;
        }

        /* renamed from: a */
        public C13860a mo68476a(Collection<vi1> collection) {
            this.f36704k.addAll(collection);
            return this;
        }

        /* renamed from: a */
        public C13860a mo68475a(String str, String str2) {
            List list = this.f36706m.get(str);
            if (list == null) {
                list = new ArrayList();
                this.f36706m.put(str, list);
            }
            if (!TextUtils.isEmpty(str2)) {
                list.add(str2);
            }
            return this;
        }

        /* renamed from: a */
        public C13860a mo68477a(Map<String, List<String>> map) {
            for (Map.Entry next : map.entrySet()) {
                for (String a : (List) next.getValue()) {
                    mo68475a((String) next.getKey(), a);
                }
            }
            return this;
        }

        /* renamed from: a */
        public C13860a mo68470a(ro1 ro1) {
            this.f36700g = ro1;
            return this;
        }

        /* renamed from: a */
        public lj1 mo68478a() {
            this.f36705l = this.f36708o.mo68839a(this.f36706m, this.f36700g);
            return new lj1(this);
        }
    }

    lj1(C13860a aVar) {
        this.f36693n = aVar.f36702i;
        this.f36684e = aVar.f36695b;
        this.f36685f = aVar.f36696c;
        this.f36686g = aVar.f36697d;
        this.f36681b = aVar.f36707n;
        this.f36687h = aVar.f36698e;
        this.f36688i = aVar.f36699f;
        this.f36690k = aVar.f36701h;
        this.f36680a = aVar.f36703j;
        this.f36682c = aVar.f36705l;
        this.f36683d = aVar.f36706m;
        this.f36689j = aVar.f36700g;
        this.f36691l = aVar.f36694a;
        this.f36692m = aVar.f36704k;
    }

    /* renamed from: a */
    public Map<String, List<String>> mo65493a() {
        return Collections.unmodifiableMap(this.f36682c);
    }

    /* renamed from: b */
    public String mo68455b() {
        return this.f36684e;
    }

    /* renamed from: c */
    public String mo68456c() {
        return this.f36685f;
    }

    /* renamed from: d */
    public List<vi1> mo68457d() {
        return this.f36692m;
    }

    /* renamed from: e */
    public List<C13413ii> mo68458e() {
        return this.f36680a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lj1.class != obj.getClass()) {
            return false;
        }
        lj1 lj1 = (lj1) obj;
        if (this.f36693n != lj1.f36693n) {
            return false;
        }
        String str = this.f36684e;
        if (str == null ? lj1.f36684e != null : !str.equals(lj1.f36684e)) {
            return false;
        }
        String str2 = this.f36685f;
        if (str2 == null ? lj1.f36685f != null : !str2.equals(lj1.f36685f)) {
            return false;
        }
        if (!this.f36680a.equals(lj1.f36680a)) {
            return false;
        }
        String str3 = this.f36686g;
        if (str3 == null ? lj1.f36686g != null : !str3.equals(lj1.f36686g)) {
            return false;
        }
        String str4 = this.f36687h;
        if (str4 == null ? lj1.f36687h != null : !str4.equals(lj1.f36687h)) {
            return false;
        }
        Integer num = this.f36690k;
        if (num == null ? lj1.f36690k != null : !num.equals(lj1.f36690k)) {
            return false;
        }
        if (!this.f36681b.equals(lj1.f36681b) || !this.f36682c.equals(lj1.f36682c) || !this.f36683d.equals(lj1.f36683d)) {
            return false;
        }
        String str5 = this.f36688i;
        if (str5 == null ? lj1.f36688i != null : !str5.equals(lj1.f36688i)) {
            return false;
        }
        ro1 ro1 = this.f36689j;
        if (ro1 == null ? lj1.f36689j != null : !ro1.equals(lj1.f36689j)) {
            return false;
        }
        if (!this.f36692m.equals(lj1.f36692m)) {
            return false;
        }
        zq1 zq1 = this.f36691l;
        if (zq1 != null) {
            return zq1.equals(lj1.f36691l);
        }
        if (lj1.f36691l == null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public String mo68460f() {
        return this.f36686g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Map<String, List<String>> mo68461g() {
        return Collections.unmodifiableMap(this.f36683d);
    }

    /* renamed from: h */
    public Integer mo68462h() {
        return this.f36690k;
    }

    public int hashCode() {
        int hashCode = ((((((this.f36680a.hashCode() * 31) + this.f36681b.hashCode()) * 31) + this.f36682c.hashCode()) * 31) + this.f36683d.hashCode()) * 31;
        String str = this.f36684e;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f36685f;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f36686g;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.f36690k;
        int intValue = (hashCode4 + (num != null ? num.intValue() : 0)) * 31;
        String str4 = this.f36687h;
        int hashCode5 = (intValue + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f36688i;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        ro1 ro1 = this.f36689j;
        int hashCode7 = (hashCode6 + (ro1 != null ? ro1.hashCode() : 0)) * 31;
        zq1 zq1 = this.f36691l;
        if (zq1 != null) {
            i = zq1.hashCode();
        }
        return ((((hashCode7 + i) * 31) + (this.f36693n ? 1 : 0)) * 31) + this.f36692m.hashCode();
    }

    /* renamed from: i */
    public String mo68464i() {
        return this.f36687h;
    }

    /* renamed from: j */
    public String mo68465j() {
        return this.f36688i;
    }

    /* renamed from: k */
    public yj1 mo68466k() {
        return this.f36681b;
    }

    /* renamed from: l */
    public ro1 mo68467l() {
        return this.f36689j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public zq1 mo68468m() {
        return this.f36691l;
    }

    /* renamed from: n */
    public boolean mo68469n() {
        return this.f36693n;
    }
}
