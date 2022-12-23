package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C12701c6;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.k6 */
public class C13683k6 implements ib0 {

    /* renamed from: a */
    private final List<C13279h6> f35972a = m38204b();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C13956m6 f35973b;

    /* renamed from: com.yandex.mobile.ads.impl.k6$b */
    private class C13685b implements Runnable {
        private C13685b() {
        }

        public void run() {
            C13683k6.this.m38203a();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.k6$c */
    private class C13686c implements Runnable {
        private C13686c() {
        }

        public void run() {
            if (C13683k6.this.f35973b != null) {
                C12701c6.m34594c(C12701c6.this);
            }
        }
    }

    C13683k6() {
    }

    /* renamed from: b */
    private List<C13279h6> m38204b() {
        return Arrays.asList(new C13279h6[]{new C14057n6("adtuneRendered", new C13686c()), new C14057n6("adtuneClosed", new C13685b())});
    }

    /* renamed from: a */
    public void mo68137a(String str) {
        try {
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            for (C13279h6 next : this.f35972a) {
                if (next.mo67419a(scheme, host)) {
                    next.mo67418a();
                    return;
                }
            }
            C13956m6 m6Var = this.f35973b;
            if (m6Var != null) {
                C12701c6.this.f31819e.mo66882a(str);
            }
        } catch (URISyntaxException unused) {
            m38203a();
        }
    }

    /* renamed from: a */
    public void mo68136a(C13956m6 m6Var) {
        this.f35973b = m6Var;
    }

    /* renamed from: a */
    public void mo68135a(int i) {
        if (new C13835l6().mo68357a(i)) {
            m38203a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m38203a() {
        C13956m6 m6Var = this.f35973b;
        if (m6Var != null) {
            C12701c6.C12703b bVar = (C12701c6.C12703b) m6Var;
            C12701c6.this.f31818d.mo71679a();
            C12701c6.this.f31816b.dismiss();
        }
    }
}
