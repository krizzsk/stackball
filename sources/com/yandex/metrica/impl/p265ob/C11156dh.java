package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.metrica.C10078e;

/* renamed from: com.yandex.metrica.impl.ob.dh */
public class C11156dh {

    /* renamed from: a */
    private String f26729a;

    /* renamed from: b */
    private C11096c0 f26730b;

    /* renamed from: c */
    private C11900w2 f26731c;

    /* renamed from: d */
    private final String f26732d = m28757z();

    /* renamed from: e */
    private String f26733e = C10122B2.m26033a();

    /* renamed from: f */
    private String f26734f;

    /* renamed from: g */
    private String f26735g;

    /* renamed from: h */
    private C11312hc f26736h;

    /* renamed from: i */
    private C11279gc f26737i;

    /* renamed from: j */
    private String f26738j;

    /* renamed from: k */
    private String f26739k;

    /* renamed from: l */
    private C10675Qi f26740l;

    /* renamed from: com.yandex.metrica.impl.ob.dh$a */
    public static abstract class C11157a<I, O> implements C11115ch<I, O> {

        /* renamed from: a */
        public final String f26741a;

        /* renamed from: b */
        public final String f26742b;

        /* renamed from: c */
        public final String f26743c;

        public C11157a(String str, String str2, String str3) {
            this.f26741a = str;
            this.f26742b = str2;
            this.f26743c = str3;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.dh$b */
    protected static abstract class C11158b<T extends C11156dh, A extends C11157a> implements C11160d<T, C11159c<A>> {

        /* renamed from: a */
        final Context f26744a;

        /* renamed from: b */
        final String f26745b;

        protected C11158b(Context context, String str) {
            this.f26744a = context;
            this.f26745b = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract T mo62478a();
    }

    /* renamed from: com.yandex.metrica.impl.ob.dh$c */
    public static class C11159c<A> {

        /* renamed from: a */
        public final C10675Qi f26746a;

        /* renamed from: b */
        public final A f26747b;

        public C11159c(C10675Qi qi, A a) {
            this.f26746a = qi;
            this.f26747b = a;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.dh$d */
    public interface C11160d<T extends C11156dh, D> {
        /* renamed from: a */
        T mo61924a(D d);
    }

    /* renamed from: z */
    private static String m28757z() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty("public")) {
            sb.append("public");
        }
        if (!TextUtils.isEmpty("binary")) {
            sb.append("_binary");
        }
        if (!TextUtils.isEmpty("")) {
            sb.append("_");
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo62764a(C11096c0 c0Var) {
        this.f26730b = c0Var;
    }

    /* renamed from: b */
    public String mo62769b() {
        String str = this.f26735g;
        return str == null ? "" : str;
    }

    /* renamed from: c */
    public String mo62771c() {
        return this.f26733e;
    }

    /* renamed from: d */
    public synchronized String mo62773d() {
        String a;
        C11312hc hcVar = this.f26736h;
        a = hcVar == null ? null : hcVar.mo63003a();
        if (a == null) {
            a = "";
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo62776e(String str) {
        this.f26729a = str;
    }

    /* renamed from: f */
    public String mo62777f() {
        String str = this.f26734f;
        return str == null ? "" : str;
    }

    /* renamed from: g */
    public synchronized String mo62778g() {
        String i;
        i = this.f26740l.mo62017i();
        if (i == null) {
            i = "";
        }
        return i;
    }

    /* renamed from: h */
    public synchronized String mo62779h() {
        String j;
        j = this.f26740l.mo62018j();
        if (j == null) {
            j = "";
        }
        return j;
    }

    /* renamed from: i */
    public String mo62780i() {
        return this.f26730b.f26642e;
    }

    /* renamed from: j */
    public String mo62781j() {
        String str = this.f26738j;
        return str == null ? C10078e.PHONE.mo60963a() : str;
    }

    /* renamed from: k */
    public String mo62782k() {
        return this.f26732d;
    }

    /* renamed from: l */
    public String mo62783l() {
        String str = this.f26739k;
        return str == null ? "" : str;
    }

    /* renamed from: m */
    public String mo62784m() {
        String str = this.f26730b.f26638a;
        return str == null ? "" : str;
    }

    /* renamed from: n */
    public String mo62785n() {
        return this.f26730b.f26639b;
    }

    /* renamed from: o */
    public int mo62786o() {
        return this.f26730b.f26641d;
    }

    /* renamed from: p */
    public String mo62787p() {
        return this.f26730b.f26640c;
    }

    /* renamed from: q */
    public String mo62788q() {
        return this.f26729a;
    }

    /* renamed from: r */
    public C10167Ci mo62789r() {
        return this.f26740l.mo61995J();
    }

    /* renamed from: s */
    public float mo62790s() {
        return this.f26731c.mo64002d();
    }

    /* renamed from: t */
    public int mo62791t() {
        return this.f26731c.mo64000b();
    }

    /* renamed from: u */
    public int mo62792u() {
        return this.f26731c.mo64001c();
    }

    /* renamed from: v */
    public int mo62793v() {
        return this.f26731c.mo64003e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C10675Qi mo62794w() {
        return this.f26740l;
    }

    /* renamed from: x */
    public synchronized String mo62795x() {
        String V;
        V = this.f26740l.mo62007V();
        if (V == null) {
            V = "";
        }
        return V;
    }

    /* renamed from: y */
    public synchronized boolean mo62796y() {
        return C10612Oi.m27146a(this.f26740l);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo62767a(C11900w2 w2Var) {
        this.f26731c = w2Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo62770b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f26734f = str;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo62772c(String str) {
        this.f26738j = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo62774d(String str) {
        this.f26739k = str;
    }

    /* renamed from: e */
    public synchronized String mo62775e() {
        String a;
        C11312hc hcVar = this.f26736h;
        a = hcVar == null ? null : hcVar.mo63004b().mo60936a();
        if (a == null) {
            a = "";
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo62763a(C10675Qi qi) {
        this.f26740l = qi;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo62768a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f26735g = str;
        }
    }

    /* renamed from: a */
    public synchronized void mo62766a(C11312hc hcVar) {
        this.f26736h = hcVar;
    }

    /* renamed from: a */
    public C11279gc mo62762a() {
        return this.f26737i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo62765a(C11279gc gcVar) {
        this.f26737i = gcVar;
    }
}
