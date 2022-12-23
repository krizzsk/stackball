package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import com.yandex.metrica.impl.p265ob.C10501Ma;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.zh */
public class C12030zh {

    /* renamed from: a */
    private C11769sn f28898a;

    /* renamed from: b */
    private final C10662Q9<C10225Eh> f28899b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C12032b f28900c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C11075ba f28901d;

    /* renamed from: e */
    private final C10667Qd f28902e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C10580Nm f28903f;

    /* renamed from: g */
    private final C10703Rd f28904g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f28905h;

    /* renamed from: com.yandex.metrica.impl.ob.zh$a */
    class C12031a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11987yh f28906a;

        C12031a(C11987yh yhVar) {
            this.f28906a = yhVar;
        }

        public void run() {
            C12030zh zhVar = C12030zh.this;
            C12030zh.m31072a(zhVar, this.f28906a, zhVar.f28905h);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.zh$b */
    public static class C12032b {

        /* renamed from: a */
        private final C10372Ih f28908a;

        public C12032b() {
            this(new C10372Ih());
        }

        /* renamed from: a */
        public List<C10341Hh> mo64199a(byte[] bArr) {
            ArrayList arrayList = new ArrayList();
            if (C10796U2.m27893a(bArr)) {
                return arrayList;
            }
            try {
                return this.f28908a.mo61543a(new String(bArr, "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
                return arrayList;
            }
        }

        C12032b(C10372Ih ih) {
            this.f28908a = ih;
        }
    }

    public C12030zh(Context context, String str, C11769sn snVar) {
        this((String) null, C10501Ma.C10503b.m26925a(C10225Eh.class).mo61785a(context), new C12032b(), new C10667Qd(), snVar, new C11075ba(), new C10580Nm(), new C10703Rd(context));
    }

    /* renamed from: a */
    public void mo64196a(C11987yh yhVar) {
        ((C11725rn) this.f28898a).execute(new C12031a(yhVar));
    }

    /* renamed from: b */
    public boolean mo64197b(C10675Qi qi) {
        String str = this.f28905h;
        if (str != null) {
            return !str.equals(qi.mo61997L());
        }
        if (qi.mo61997L() != null) {
            return true;
        }
        return false;
    }

    C12030zh(String str, C10662Q9 q9, C12032b bVar, C10667Qd qd, C11769sn snVar, C11075ba baVar, C10580Nm nm, C10703Rd rd) {
        this.f28905h = str;
        this.f28899b = q9;
        this.f28900c = bVar;
        this.f28902e = qd;
        this.f28898a = snVar;
        this.f28901d = baVar;
        this.f28903f = nm;
        this.f28904g = rd;
    }

    /* renamed from: a */
    static void m31072a(C12030zh zhVar, C11987yh yhVar, String str) {
        if (zhVar.f28904g.mo62128a() && str != null) {
            zhVar.f28902e.mo61982a(str, new C10111Ah(zhVar, (C10225Eh) zhVar.f28899b.mo61953b(), yhVar));
        }
    }

    /* renamed from: a */
    public void mo64195a(C10675Qi qi) {
        if (qi != null) {
            this.f28905h = qi.mo61997L();
        }
    }
}
