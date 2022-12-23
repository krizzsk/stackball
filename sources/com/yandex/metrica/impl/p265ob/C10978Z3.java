package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.yandex.metrica.impl.p265ob.C10910X3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Z3 */
public class C10978Z3 implements C11369j4, C10466Li, C11481l4 {

    /* renamed from: a */
    private final Context f26385a;

    /* renamed from: b */
    private final C11101c4 f26386b;

    /* renamed from: c */
    private final C10258Fi f26387c;

    /* renamed from: d */
    private final C10757Si f26388d;

    /* renamed from: e */
    private final C11902w4 f26389e;

    /* renamed from: f */
    private final C11196ec f26390f;

    /* renamed from: g */
    private final C11334i5<C11305h5, C10978Z3> f26391g;

    /* renamed from: h */
    private final C10655Q2<C10978Z3> f26392h;

    /* renamed from: i */
    private List<C11222f1> f26393i = new ArrayList();

    /* renamed from: j */
    private final C11132d4<C10328H4> f26394j;

    /* renamed from: k */
    private C11493lg f26395k;

    /* renamed from: l */
    private final C10822V f26396l;

    /* renamed from: m */
    private final C10888Wg f26397m;

    /* renamed from: n */
    private final Object f26398n = new Object();

    /* renamed from: com.yandex.metrica.impl.ob.Z3$a */
    class C10979a implements C10224Eg {

        /* renamed from: a */
        final /* synthetic */ ResultReceiver f26399a;

        C10979a(C10978Z3 z3, ResultReceiver resultReceiver) {
            this.f26399a = resultReceiver;
        }

        /* renamed from: a */
        public void mo61194a(C10255Fg fg) {
            byte[] bArr;
            ResultReceiver resultReceiver = this.f26399a;
            int i = C10314Gg.f24786b;
            if (resultReceiver != null) {
                Bundle bundle = new Bundle();
                if (fg == null) {
                    bArr = null;
                } else {
                    bArr = fg.mo61326a();
                }
                bundle.putByteArray("referrer", bArr);
                resultReceiver.send(1, bundle);
            }
        }
    }

    C10978Z3(Context context, C10258Fi fi, C11101c4 c4Var, C10910X3 x3, C11902w4 w4Var, C10813Ug ug, C11132d4<C10328H4> d4Var, C11066b4 b4Var, C10867W w, C11196ec ecVar, C10888Wg wg) {
        Context applicationContext = context.getApplicationContext();
        this.f26385a = applicationContext;
        this.f26386b = c4Var;
        this.f26387c = fi;
        this.f26389e = w4Var;
        this.f26394j = d4Var;
        this.f26391g = b4Var.mo62685a(this);
        C10757Si a = fi.mo61330a(applicationContext, c4Var, x3.f26219a);
        this.f26388d = a;
        this.f26390f = ecVar;
        ecVar.mo62818a(applicationContext, a.mo62241c());
        this.f26396l = w.mo62437a(a, ecVar, applicationContext);
        this.f26392h = b4Var.mo62684a(this, a);
        this.f26397m = wg;
        fi.mo61331a(c4Var, (C10466Li) this);
    }

    /* renamed from: a */
    public void mo62564a(C10910X3.C10911a aVar) {
        this.f26389e.mo64011a(aVar);
    }

    /* renamed from: b */
    public synchronized void mo62569b(C10328H4 h4) {
        this.f26394j.mo62743b(h4);
    }

    /* renamed from: a */
    public synchronized void mo62563a(C10328H4 h4) {
        this.f26394j.mo62742a(h4);
        h4.mo61415a(this.f26396l.mo62372a(C11993ym.m30966a(this.f26388d.mo62241c().mo62032w())));
    }

    /* renamed from: b */
    public Context mo62568b() {
        return this.f26385a;
    }

    /* renamed from: a */
    public void mo62567a(C11411k0 k0Var, C10328H4 h4) {
        this.f26391g.mo63032a(k0Var, h4);
    }

    /* renamed from: a */
    public C10910X3.C10911a mo62561a() {
        return this.f26389e.mo64010a();
    }

    /* renamed from: a */
    public void mo61738a(C10675Qi qi) {
        this.f26390f.mo62819a(qi);
        synchronized (this.f26398n) {
            for (C10328H4 a : this.f26394j.mo62741a()) {
                a.mo61415a(this.f26396l.mo62372a(C11993ym.m30966a(qi.mo62032w())));
            }
            ArrayList arrayList = new ArrayList();
            for (C11222f1 next : this.f26393i) {
                if (next.mo62849a(qi)) {
                    m28339a(next.mo62851c(), next.mo62848a());
                } else {
                    arrayList.add(next);
                }
            }
            this.f26393i = new ArrayList(arrayList);
            if (!arrayList.isEmpty()) {
                this.f26392h.mo61947d();
            }
        }
        if (this.f26395k == null) {
            this.f26395k = C10619P0.m27164i().mo61886n();
        }
        this.f26395k.mo63284a(qi);
    }

    /* renamed from: a */
    public void mo61737a(C10342Hi hi, C10675Qi qi) {
        synchronized (this.f26398n) {
            for (C11222f1 next : this.f26393i) {
                ResultReceiver c = next.mo62851c();
                C10793U a = this.f26396l.mo62372a(next.mo62848a());
                int i = C11541n0.f27743b;
                if (c != null) {
                    Bundle bundle = new Bundle();
                    hi.mo61468a(bundle);
                    a.mo62313c(bundle);
                    c.send(2, bundle);
                }
            }
            this.f26393i.clear();
        }
    }

    /* renamed from: a */
    public void mo62566a(C11222f1 f1Var) {
        ResultReceiver resultReceiver;
        Map hashMap = new HashMap();
        List<String> list = null;
        if (f1Var != null) {
            list = f1Var.mo62850b();
            resultReceiver = f1Var.mo62851c();
            hashMap = f1Var.mo62848a();
        } else {
            resultReceiver = null;
        }
        boolean a = this.f26388d.mo62239a(list, hashMap);
        if (!a) {
            m28339a(resultReceiver, (Map<String, String>) hashMap);
        }
        if (this.f26388d.mo62242d()) {
            synchronized (this.f26398n) {
                if (a && f1Var != null) {
                    this.f26393i.add(f1Var);
                }
            }
            this.f26392h.mo61947d();
        } else if (a) {
            m28339a(resultReceiver, (Map<String, String>) hashMap);
        }
    }

    /* renamed from: a */
    public void mo62562a(ResultReceiver resultReceiver) {
        this.f26397m.mo62452a((C10224Eg) new C10979a(this, resultReceiver));
    }

    /* renamed from: a */
    public void mo62565a(C10910X3 x3) {
        this.f26388d.mo62237a(x3.f26219a);
        this.f26389e.mo64011a(x3.f26220b);
    }

    /* renamed from: a */
    private void m28339a(ResultReceiver resultReceiver, Map<String, String> map) {
        C10793U a = this.f26396l.mo62372a(map);
        int i = C11541n0.f27743b;
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            a.mo62313c(bundle);
            resultReceiver.send(1, bundle);
        }
    }
}
