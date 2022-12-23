package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import com.yandex.metrica.impl.p265ob.C11156dh;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Pd */
public class C10636Pd extends C11156dh {

    /* renamed from: m */
    private final C10807Uc f25419m;

    /* renamed from: com.yandex.metrica.impl.ob.Pd$b */
    public static class C10638b {

        /* renamed from: a */
        public final C10675Qi f25420a;

        /* renamed from: b */
        public final C10807Uc f25421b;

        public C10638b(C10675Qi qi, C10807Uc uc) {
            this.f25420a = qi;
            this.f25421b = uc;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Pd$c */
    protected static class C10639c implements C11156dh.C11160d<C10636Pd, C10638b> {

        /* renamed from: a */
        private final Context f25422a;

        /* renamed from: b */
        private final C11086bh f25423b;

        C10639c(Context context, C11086bh bhVar) {
            this.f25422a = context;
            this.f25423b = bhVar;
        }

        /* renamed from: a */
        public C10636Pd mo61924a(C10638b bVar) {
            C10636Pd pd = new C10636Pd(bVar.f25421b);
            C11086bh bhVar = this.f25423b;
            Context context = this.f25422a;
            bhVar.getClass();
            pd.mo62770b(C10796U2.m27877a(context, context.getPackageName()));
            C11086bh bhVar2 = this.f25423b;
            Context context2 = this.f25422a;
            bhVar2.getClass();
            pd.mo62768a(String.valueOf(C10796U2.m27895b(context2, context2.getPackageName())));
            pd.mo62763a(bVar.f25420a);
            pd.mo62764a(C11096c0.m28615a());
            pd.mo62767a(C10619P0.m27164i().mo61888p().mo64117a());
            pd.mo62776e(this.f25422a.getPackageName());
            pd.mo62765a(C10619P0.m27164i().mo61892t().mo62815a(this.f25422a));
            pd.mo62766a(C10619P0.m27164i().mo61875b().mo63037a());
            return pd;
        }
    }

    /* renamed from: A */
    public C10807Uc mo61921A() {
        return this.f25419m;
    }

    /* renamed from: B */
    public List<String> mo61922B() {
        return mo62794w().mo62034y();
    }

    private C10636Pd(C10807Uc uc) {
        this.f25419m = uc;
    }
}
