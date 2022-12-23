package com.yandex.metrica.impl.p265ob;

import android.app.Activity;
import com.yandex.metrica.impl.p265ob.C11165dm;
import com.yandex.metrica.uiaccessor.C12065b;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.nl */
class C11569nl implements C11121cm {

    /* renamed from: a */
    private final C12065b f27796a;

    /* renamed from: b */
    private final C11165dm.C11166a f27797b;

    /* renamed from: c */
    private final C11406jm f27798c;

    /* renamed from: d */
    private final C11357im f27799d;

    C11569nl(C10820Um<Activity> um, C11406jm jmVar) {
        this(new C11165dm.C11166a(), um, jmVar, new C11250fl(), new C11357im());
    }

    /* renamed from: a */
    public void mo61837a(Activity activity, long j) {
    }

    /* renamed from: a */
    public void mo61838a(Activity activity, boolean z) {
        if (!z) {
            try {
                this.f27796a.subscribe(activity);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public boolean mo61471a(C10378Il il) {
        return false;
    }

    C11569nl(C11165dm.C11166a aVar, C10820Um<Activity> um, C11406jm jmVar, C11250fl flVar, C11357im imVar) {
        this.f27797b = aVar;
        this.f27798c = jmVar;
        this.f27796a = flVar.mo62912a(um);
        this.f27799d = imVar;
    }

    /* renamed from: a */
    public void mo61469a(long j, Activity activity, C10319Gl gl, List<C10893Wl> list, C10378Il il, C11119cl clVar) {
        C10437Kl kl;
        C10437Kl kl2;
        if (il.f24920b && (kl2 = il.f24924f) != null) {
            this.f27798c.mo61680b(this.f27799d.mo62245a(activity, gl, kl2, clVar.mo62734b(), j));
        }
        if (il.f24922d && (kl = il.f24926h) != null) {
            this.f27798c.mo61677a(this.f27799d.mo62245a(activity, gl, kl, clVar.mo62736d(), j));
        }
    }

    /* renamed from: a */
    public void mo61470a(Throwable th, C11091bm bmVar) {
        this.f27797b.getClass();
        new C11165dm(bmVar, C10611Oh.m27142a()).mo62798a("ui_parsing", th);
    }

    /* renamed from: a */
    public void mo63389a(Activity activity) {
        try {
            this.f27796a.unsubscribe(activity);
        } catch (Throwable unused) {
        }
    }
}
