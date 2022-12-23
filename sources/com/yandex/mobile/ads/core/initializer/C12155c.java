package com.yandex.mobile.ads.core.initializer;

import android.content.Context;
import com.yandex.mobile.ads.core.initializer.C12158e;
import com.yandex.mobile.ads.impl.C12350a2;
import com.yandex.mobile.ads.impl.C14564s6;
import com.yandex.mobile.ads.impl.C15230y2;
import com.yandex.mobile.ads.impl.l30;
import com.yandex.mobile.ads.impl.le0;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.mobile.ads.core.initializer.c */
class C12155c implements Runnable {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final CopyOnWriteArrayList<C12158e> f29474f = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    private final Context f29475b;

    /* renamed from: c */
    private final Executor f29476c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C12158e.C12160b f29477d;

    /* renamed from: e */
    private final le0 f29478e;

    C12155c(Context context, Executor executor, le0 le0, C12158e.C12160b bVar) {
        this.f29475b = context.getApplicationContext();
        this.f29476c = executor;
        this.f29478e = le0;
        this.f29477d = bVar;
    }

    public void run() {
        C12158e eVar = new C12158e(this.f29475b, this.f29476c, new C15230y2());
        f29474f.add(eVar);
        eVar.mo64752a(this.f29478e, (C12158e.C12160b) new C12156a(eVar));
    }

    /* renamed from: com.yandex.mobile.ads.core.initializer.c$a */
    class C12156a implements C12158e.C12160b {

        /* renamed from: a */
        final /* synthetic */ C12158e f29479a;

        C12156a(C12158e eVar) {
            this.f29479a = eVar;
        }

        /* renamed from: a */
        public void mo64612a(C14564s6 s6Var, l30 l30) {
            C12155c.f29474f.remove(this.f29479a);
            C12155c.this.f29477d.mo64612a(s6Var, l30);
        }

        /* renamed from: a */
        public void mo64611a(C12350a2 a2Var) {
            C12155c.f29474f.remove(this.f29479a);
            C12155c.this.f29477d.mo64611a(a2Var);
        }
    }
}
