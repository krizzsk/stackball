package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.yandex.metrica.impl.p265ob.C10734S;
import com.yandex.metrica.impl.p265ob.C10910X3;
import com.yandex.metrica.impl.p265ob.C11136d8;
import com.yandex.metrica.impl.p265ob.C11464kh;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.f2 */
public class C11225f2 {

    /* renamed from: a */
    private final Context f26859a;

    /* renamed from: b */
    private final C11769sn f26860b;

    /* renamed from: c */
    private final C10178D4 f26861c;

    /* renamed from: d */
    private final C10442L0 f26862d;

    /* renamed from: com.yandex.metrica.impl.ob.f2$a */
    class C11226a implements C10820Um<C10331H7> {
        C11226a() {
        }

        /* renamed from: b */
        public void mo61092b(Object obj) {
            C10331H7 h7 = (C10331H7) obj;
            C11225f2 f2Var = C11225f2.this;
            C10153C4 c4 = new C10153C4(h7.mo61417a(), h7.mo61422f(), h7.mo61423g(), h7.mo61424h(), h7.mo61425i());
            String e = h7.mo61421e();
            byte[] c = h7.mo61419c();
            int b = h7.mo61418b();
            HashMap<C10734S.C10735a, Integer> j = h7.mo61426j();
            String d = h7.mo61420d();
            C10380Im b2 = C12038zm.m31087b(h7.mo61417a());
            List<Integer> list = C10385J0.f24953i;
            C10734S a = new C10734S(c, e, C11413k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE.mo63170b(), b2).mo62211a(j);
            a.f27305h = b;
            f2Var.mo62856a(c4, a.mo63148c(d), new C10910X3(new C11464kh.C11466b((String) null, (String) null, (String) null, (String) null, (String) null, (Map<String, String>) null, false, (List<String>) null), new C10910X3.C10911a(), (ResultReceiver) null));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.f2$b */
    protected class C11227b implements C10820Um<String> {

        /* renamed from: a */
        private final C10153C4 f26864a;

        /* renamed from: b */
        private final C10864Vm<String, C11411k0> f26865b;

        public C11227b(C10153C4 c4, C10864Vm<String, C11411k0> vm) {
            this.f26864a = c4;
            this.f26865b = vm;
        }

        /* renamed from: b */
        public void mo61092b(Object obj) {
            C11225f2.this.mo62856a(this.f26864a, this.f26865b.mo61128a((String) obj), new C10910X3(new C11464kh.C11466b((String) null, (String) null, (String) null, (String) null, (String) null, (Map<String, String>) null, false, (List<String>) null), new C10910X3.C10911a(), (ResultReceiver) null));
        }
    }

    C11225f2(Context context, C10178D4 d4, C11769sn snVar, C10442L0 l0) {
        this.f26859a = context;
        this.f26860b = snVar;
        this.f26861c = d4;
        this.f26862d = l0;
    }

    /* renamed from: a */
    public void mo62859a(File file) {
        C10362I7 i7 = new C10362I7();
        ((C11725rn) this.f26860b).execute(new C11069b7(file, i7, i7, new C11226a()));
    }

    /* renamed from: a */
    public void mo62856a(C10153C4 c4, C11411k0 k0Var, C10910X3 x3) {
        this.f26861c.mo61166a(c4, x3).mo61043a(k0Var, x3);
        this.f26861c.mo61167a(c4.mo61130b(), c4.mo61131c().intValue(), c4.mo61132d());
    }

    /* renamed from: a */
    public void mo62857a(C10984Z7 z7, C10864Vm<String, C11411k0> vm) {
        C11769sn snVar = this.f26860b;
        C10442L0 l0 = this.f26862d;
        String str = z7.f26409a.f26650b;
        l0.getClass();
        ((C11725rn) snVar).execute(new C11069b7(new File(str), new C10660Q7(new C10422K7(C10590O7.CRASHPAD, z7.f26411c.f27841b), new C10627P7(new C11937x7())), new C11136d8.C11139c(z7.f26409a.f26649a), new C11227b(z7.f26410b, vm)));
    }

    /* renamed from: a */
    public void mo62858a(C11411k0 k0Var, Bundle bundle) {
        if (!(C11413k1.EVENT_TYPE_UNDEFINED.mo63170b() == k0Var.f27302e)) {
            ((C11725rn) this.f26860b).execute(new C11302h2(this.f26859a, k0Var, bundle, this.f26861c));
        }
    }
}
