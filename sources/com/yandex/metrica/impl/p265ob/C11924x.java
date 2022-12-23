package com.yandex.metrica.impl.p265ob;

import android.app.Activity;
import com.yandex.metrica.impl.p265ob.C11962y;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.x */
public class C11924x implements C11962y.C11964b {

    /* renamed from: a */
    private final Set<C11926b> f28683a = new HashSet();

    /* renamed from: b */
    private final C11769sn f28684b;

    /* renamed from: com.yandex.metrica.impl.ob.x$a */
    class C11925a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f28685a;

        C11925a(Activity activity) {
            this.f28685a = activity;
        }

        public void run() {
            C11924x.this.mo64049a(this.f28685a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.x$b */
    public interface C11926b {
        /* renamed from: a */
        void mo64052a(Activity activity);
    }

    public C11924x(C11962y yVar, C11769sn snVar) {
        this.f28684b = snVar;
        yVar.mo64107a((C11962y.C11964b) this, new C11962y.C11963a[0]);
    }

    /* renamed from: a */
    public synchronized void mo64050a(C11926b bVar) {
        this.f28683a.add(bVar);
    }

    /* renamed from: a */
    public void mo64049a(Activity activity) {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f28683a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C11926b) it.next()).mo64052a(activity);
        }
    }

    /* renamed from: a */
    public void mo61122a(Activity activity, C11962y.C11963a aVar) {
        ((C11725rn) this.f28684b).execute(new C11925a(activity));
    }
}
