package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import com.yandex.metrica.C10086i;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.qg */
public class C11684qg {

    /* renamed from: a */
    private final Map<String, C11634pg> f28017a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C11791tg f28018b;

    /* renamed from: c */
    private final C11769sn f28019c;

    /* renamed from: com.yandex.metrica.impl.ob.qg$a */
    class C11685a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f28020a;

        C11685a(Context context) {
            this.f28020a = context;
        }

        public void run() {
            C11791tg a = C11684qg.this.f28018b;
            Context context = this.f28020a;
            a.getClass();
            C11479l3.m29684a(context);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.qg$b */
    private static class C11686b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C11684qg f28022a = new C11684qg(C10941Y.m28234g().mo62499c(), new C11791tg());
    }

    C11684qg(C11769sn snVar, C11791tg tgVar) {
        this.f28019c = snVar;
        this.f28018b = tgVar;
    }

    /* renamed from: b */
    private C11634pg m30110b(Context context, String str) {
        this.f28018b.getClass();
        if (C11479l3.m29698k() == null) {
            ((C11725rn) this.f28019c).execute(new C11685a(context));
        }
        C11634pg pgVar = new C11634pg(this.f28019c, context, str);
        this.f28017a.put(str, pgVar);
        return pgVar;
    }

    /* renamed from: a */
    public static C11684qg m30108a() {
        return C11686b.f28022a;
    }

    /* renamed from: a */
    public C11634pg mo63547a(Context context, String str) {
        C11634pg pgVar = this.f28017a.get(str);
        if (pgVar == null) {
            synchronized (this.f28017a) {
                pgVar = this.f28017a.get(str);
                if (pgVar == null) {
                    C11634pg b = m30110b(context, str);
                    b.mo63490d(str);
                    pgVar = b;
                }
            }
        }
        return pgVar;
    }

    /* renamed from: a */
    public C11634pg mo63546a(Context context, C10086i iVar) {
        C11634pg pgVar = this.f28017a.get(iVar.apiKey);
        if (pgVar == null) {
            synchronized (this.f28017a) {
                pgVar = this.f28017a.get(iVar.apiKey);
                if (pgVar == null) {
                    C11634pg b = m30110b(context, iVar.apiKey);
                    b.mo63489a(iVar);
                    pgVar = b;
                }
            }
        }
        return pgVar;
    }
}
