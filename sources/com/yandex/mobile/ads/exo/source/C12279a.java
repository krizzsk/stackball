package com.yandex.mobile.ads.exo.source;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.exo.C12270q;
import com.yandex.mobile.ads.exo.source.C12287f;
import com.yandex.mobile.ads.exo.source.C12290g;
import com.yandex.mobile.ads.impl.C13479j9;
import com.yandex.mobile.ads.impl.af1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.yandex.mobile.ads.exo.source.a */
public abstract class C12279a implements C12287f {

    /* renamed from: a */
    private final ArrayList<C12287f.C12289b> f30066a = new ArrayList<>(1);

    /* renamed from: b */
    private final HashSet<C12287f.C12289b> f30067b = new HashSet<>(1);

    /* renamed from: c */
    private final C12290g.C12291a f30068c = new C12290g.C12291a();

    /* renamed from: d */
    private Looper f30069d;

    /* renamed from: e */
    private C12270q f30070e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65249a(C12270q qVar) {
        this.f30070e = qVar;
        Iterator<C12287f.C12289b> it = this.f30066a.iterator();
        while (it.hasNext()) {
            it.next().mo64927a(this, qVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo65253a(af1 af1);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo65254b();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C12290g.C12291a mo65247a(C12287f.C12288a aVar) {
        return this.f30068c.mo65286a(0, aVar, 0);
    }

    /* renamed from: a */
    public final void mo65248a(Handler handler, C12290g gVar) {
        this.f30068c.mo65289a(handler, gVar);
    }

    /* renamed from: a */
    public final void mo65252a(C12290g gVar) {
        this.f30068c.mo65293a(gVar);
    }

    /* renamed from: a */
    public final void mo65251a(C12287f.C12289b bVar, af1 af1) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f30069d;
        C13479j9.m37705a(looper == null || looper == myLooper);
        C12270q qVar = this.f30070e;
        this.f30066a.add(bVar);
        if (this.f30069d == null) {
            this.f30069d = myLooper;
            this.f30067b.add(bVar);
            mo65253a(af1);
        } else if (qVar != null) {
            this.f30067b.isEmpty();
            this.f30067b.add(bVar);
            bVar.mo64927a(this, qVar);
        }
    }

    /* renamed from: a */
    public final void mo65250a(C12287f.C12289b bVar) {
        this.f30066a.remove(bVar);
        if (this.f30066a.isEmpty()) {
            this.f30069d = null;
            this.f30070e = null;
            this.f30067b.clear();
            mo65254b();
            return;
        }
        boolean z = !this.f30067b.isEmpty();
        this.f30067b.remove(bVar);
        if (z) {
            this.f30067b.isEmpty();
        }
    }
}
