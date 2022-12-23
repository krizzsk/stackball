package com.yandex.metrica.impl.p265ob;

import android.net.Uri;
import com.google.common.net.HttpHeaders;
import com.yandex.metrica.impl.p265ob.C10766T1;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.K2 */
public class C10417K2 extends C10907X1<C11718rh, C11885vj> {

    /* renamed from: o */
    private final C10757Si f25039o;

    /* renamed from: p */
    private C11885vj f25040p;

    /* renamed from: q */
    private C10342Hi f25041q;

    /* renamed from: r */
    private final C11464kh f25042r;

    public C10417K2(C10757Si si, C11464kh khVar) {
        this(si, khVar, new C11718rh(new C11352ih()), new C10387J2());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo61643a(Uri.Builder builder) {
        ((C11718rh) this.f25817j).mo63603a(builder, this.f25042r);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo61645b(Throwable th) {
        this.f25041q = C10342Hi.NETWORK;
    }

    /* renamed from: j */
    public C10167Ci mo61646j() {
        return this.f25042r.mo62789r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo61647o() {
        mo62249a(HttpHeaders.ACCEPT_ENCODING, "encrypted");
        return this.f25039o.mo62242d();
    }

    /* renamed from: r */
    public boolean mo61648r() {
        C11885vj vjVar = (C11885vj) mo62463B();
        this.f25040p = vjVar;
        boolean z = vjVar != null;
        if (!z) {
            this.f25041q = C10342Hi.PARSE;
        }
        return z;
    }

    /* renamed from: s */
    public void mo61649s() {
        super.mo61649s();
        this.f25041q = C10342Hi.NETWORK;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo61650t() {
        Map<String, List<String>> map;
        C11885vj vjVar = this.f25040p;
        if (vjVar != null && (map = this.f25814g) != null) {
            this.f25039o.mo62238a(vjVar, this.f25042r, map);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo61651y() {
        if (this.f25041q == null) {
            this.f25041q = C10342Hi.UNKNOWN;
        }
        this.f25039o.mo62236a(this.f25041q);
    }

    /* renamed from: z */
    public boolean mo61652z() {
        return true;
    }

    C10417K2(C10757Si si, C11464kh khVar, C11718rh rhVar, C10387J2 j2) {
        super(j2, rhVar);
        this.f25039o = si;
        this.f25042r = khVar;
        mo62251a(khVar.mo63231J());
    }

    /* renamed from: a */
    public String mo61642a() {
        return "Startup task for component: " + this.f25039o.mo62235a().toString();
    }

    /* renamed from: b */
    public C10766T1.C10767a mo61644b() {
        return C10766T1.C10767a.STARTUP;
    }
}
