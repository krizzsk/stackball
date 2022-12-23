package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.Gd */
public class C10310Gd implements C10765T0 {

    /* renamed from: a */
    private final C10364I9 f24776a;

    /* renamed from: b */
    private final C10691R2 f24777b;

    /* renamed from: c */
    private C10220Ec f24778c;

    /* renamed from: d */
    private final C11065b3 f24779d;

    /* renamed from: e */
    private final C10616Om f24780e;

    /* renamed from: f */
    private final C10311a f24781f;

    /* renamed from: g */
    private final C10252Fd f24782g;

    /* renamed from: com.yandex.metrica.impl.ob.Gd$a */
    static class C10311a {
        C10311a() {
        }
    }

    public C10310Gd(Context context, C10220Ec ec) {
        this(ec, C11065b3.m28563a(context));
    }

    /* renamed from: a */
    public void mo61388a(C10220Ec ec) {
        if (!C10796U2.m27892a((Object) this.f24778c, (Object) ec)) {
            this.f24778c = ec;
            if (ec != null && ec.f24582a.f28777a) {
                this.f24782g.mo62738a(this.f24779d.mo62683b());
            }
        }
    }

    /* renamed from: b */
    public void mo61389b() {
        C10220Ec ec = this.f24778c;
        if (ec != null && ec.f24583b != null && this.f24777b.mo62107b(this.f24776a.mo61520f(0), this.f24778c.f24583b.f24489b, "last wifi scan attempt time")) {
            this.f24781f.getClass();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            if (this.f24779d.mo62682a(countDownLatch, this.f24782g)) {
                this.f24776a.mo61530k(this.f24780e.mo61841b());
                try {
                    countDownLatch.await(5, TimeUnit.SECONDS);
                } catch (Throwable unused) {
                }
            }
        }
    }

    private C10310Gd(C10220Ec ec, C11065b3 b3Var) {
        this(b3Var, C10619P0.m27164i().mo61893u(), new C10691R2(), new C10580Nm(), new C10311a(), ec, new C10252Fd((C11125d0<List<C10977Z2>>) null, b3Var.mo62679a()));
    }

    /* renamed from: a */
    public void mo61387a() {
        C10220Ec ec = this.f24778c;
        if (ec != null && ec.f24582a.f28777a) {
            this.f24782g.mo62738a(this.f24779d.mo62683b());
        }
    }

    C10310Gd(C11065b3 b3Var, C10364I9 i9, C10691R2 r2, C10616Om om, C10311a aVar, C10220Ec ec, C10252Fd fd) {
        this.f24779d = b3Var;
        this.f24776a = i9;
        this.f24777b = r2;
        this.f24781f = aVar;
        this.f24778c = ec;
        this.f24780e = om;
        this.f24782g = fd;
    }
}
