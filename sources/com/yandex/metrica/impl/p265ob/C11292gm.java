package com.yandex.metrica.impl.p265ob;

import android.app.Activity;
import com.yandex.metrica.impl.p265ob.C11119cl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.gm */
class C11292gm {

    /* renamed from: a */
    private Runnable f27002a;

    /* renamed from: b */
    private final C11769sn f27003b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C10528Mk f27004c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C10347Hl f27005d;

    /* renamed from: e */
    private final C11052al f27006e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C11293a f27007f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final List<C11121cm> f27008g;

    /* renamed from: h */
    private final List<C11958xl> f27009h;

    /* renamed from: i */
    private final C11119cl.C11120a f27010i;

    /* renamed from: com.yandex.metrica.impl.ob.gm$a */
    static class C11293a {
        C11293a() {
        }
    }

    C11292gm(C11769sn snVar, C10528Mk mk, C11052al alVar) {
        this(snVar, mk, alVar, new C10347Hl(), new C11293a(), Collections.emptyList(), new C11119cl.C11120a());
    }

    /* renamed from: a */
    static void m29091a(C11292gm gmVar, List list, Throwable th, C11091bm bmVar) {
        gmVar.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C11053am) it.next()).mo61470a(th, bmVar);
        }
        for (C11121cm a : gmVar.f27008g) {
            a.mo61470a(th, bmVar);
        }
    }

    C11292gm(C11769sn snVar, C10528Mk mk, C11052al alVar, C10347Hl hl, C11293a aVar, List<C11958xl> list, C11119cl.C11120a aVar2) {
        this.f27008g = new ArrayList();
        this.f27003b = snVar;
        this.f27004c = mk;
        this.f27006e = alVar;
        this.f27005d = hl;
        this.f27007f = aVar;
        this.f27009h = list;
        this.f27010i = aVar2;
    }

    /* renamed from: a */
    static void m29090a(C11292gm gmVar, List list, C10319Gl gl, List list2, Activity activity, C10378Il il, C11119cl clVar, long j) {
        gmVar.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C11053am) it.next()).mo61469a(j, activity, gl, list2, il, clVar);
        }
        for (C11121cm a : gmVar.f27008g) {
            a.mo61469a(j, activity, gl, list2, il, clVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo62976a(C11121cm... cmVarArr) {
        this.f27008g.addAll(Arrays.asList(cmVarArr));
    }

    /* renamed from: a */
    static void m29089a(C11292gm gmVar, Activity activity, long j) {
        for (C11121cm a : gmVar.f27008g) {
            a.mo61837a(activity, j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo62975a(Activity activity, long j, C10378Il il, C11091bm bmVar, List<C11053am> list) {
        boolean z;
        Activity activity2 = activity;
        Iterator<C11958xl> it = this.f27009h.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().mo64100a(activity, bmVar)) {
                    z = true;
                    break;
                }
            } else {
                C11091bm bmVar2 = bmVar;
                z = false;
                break;
            }
        }
        WeakReference weakReference = new WeakReference(activity);
        C11119cl.C11120a aVar = this.f27010i;
        C11052al alVar = this.f27006e;
        aVar.getClass();
        C10378Il il2 = il;
        C11253fm fmVar = new C11253fm(this, weakReference, list, il2, bmVar, new C11119cl(alVar, il2), z);
        Runnable runnable = this.f27002a;
        if (runnable != null) {
            ((C11725rn) this.f27003b).mo63612a(runnable);
        }
        this.f27002a = fmVar;
        for (C11121cm a : this.f27008g) {
            a.mo61838a(activity, z);
        }
        long j2 = j;
        ((C11725rn) this.f27003b).mo63613a(fmVar, j);
    }
}
