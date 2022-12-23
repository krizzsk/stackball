package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import com.yandex.metrica.impl.p265ob.C10448L6;
import com.yandex.metrica.impl.p265ob.C10675Qi;

/* renamed from: com.yandex.metrica.impl.ob.N6 */
public class C10539N6 {

    /* renamed from: a */
    private final Context f25234a;

    /* renamed from: b */
    private final C10448L6 f25235b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C10496M6 f25236c;

    /* renamed from: d */
    private final C10541b f25237d;

    /* renamed from: e */
    private final C10361I6 f25238e;

    /* renamed from: com.yandex.metrica.impl.ob.N6$a */
    class C10540a implements C10448L6.C10450b {

        /* renamed from: a */
        final /* synthetic */ C10589O6 f25239a;

        C10540a(C10589O6 o6) {
            this.f25239a = o6;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.N6$b */
    public static class C10541b {
    }

    public C10539N6(Context context, C11769sn snVar, C10330H6 h6) {
        this(context, snVar, h6, new C10496M6(context));
    }

    private C10539N6(Context context, C11769sn snVar, C10330H6 h6, C10496M6 m6) {
        this(context, new C10448L6(snVar, h6), m6, new C10541b(), new C10361I6());
    }

    /* renamed from: a */
    public void mo61810a() {
        C10541b bVar = this.f25237d;
        Context context = this.f25234a;
        bVar.getClass();
        m27004a(new C10675Qi.C10677b(context).mo62085a());
    }

    C10539N6(Context context, C10448L6 l6, C10496M6 m6, C10541b bVar, C10361I6 i6) {
        this.f25234a = context;
        this.f25235b = l6;
        this.f25236c = m6;
        this.f25237d = bVar;
        this.f25238e = i6;
    }

    /* renamed from: a */
    private void m27004a(C10675Qi qi) {
        if (qi.mo62008W() != null) {
            boolean z = qi.mo62008W().f24585b;
            Long a = this.f25238e.mo61478a(qi.mo62008W().f24586c);
            if (!qi.mo62014f().f28187i || a == null || a.longValue() <= 0) {
                this.f25235b.mo61704a();
            } else {
                this.f25235b.mo61706a(a.longValue(), z);
            }
        }
    }

    /* renamed from: a */
    public void mo61811a(C10589O6 o6) {
        C10541b bVar = this.f25237d;
        Context context = this.f25234a;
        bVar.getClass();
        C10675Qi a = new C10675Qi.C10677b(context).mo62085a();
        if (a.mo62008W() != null) {
            long j = a.mo62008W().f24584a;
            if (j > 0) {
                this.f25236c.mo61780a(this.f25234a.getPackageName());
                this.f25235b.mo61705a(j, (C10448L6.C10450b) new C10540a(o6));
            } else if (o6 != null) {
                o6.mo60962a();
            }
        } else if (o6 != null) {
            o6.mo60962a();
        }
        m27004a(a);
    }
}
