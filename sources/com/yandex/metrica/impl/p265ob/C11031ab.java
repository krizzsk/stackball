package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import com.yandex.metrica.YandexMetricaConfig;

/* renamed from: com.yandex.metrica.impl.ob.ab */
public class C11031ab {

    /* renamed from: com.yandex.metrica.impl.ob.ab$a */
    class C11032a implements C10864Vm<C10921Xa, C10880Wa> {
        C11032a(C11031ab abVar) {
        }

        /* renamed from: a */
        public Object mo61128a(Object obj) {
            return ((C10921Xa) obj).f26252a;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ab$b */
    class C11033b implements C10864Vm<C10921Xa, C10880Wa> {
        C11033b(C11031ab abVar) {
        }

        /* renamed from: a */
        public Object mo61128a(Object obj) {
            return ((C10921Xa) obj).f26254c;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ab$c */
    class C11034c implements C11108cb {
        C11034c(C11031ab abVar) {
        }

        /* renamed from: a */
        public long mo62351a(C10184D9 d9) {
            return d9.mo61175c(Long.MAX_VALUE);
        }

        /* renamed from: a */
        public void mo62352a(C10184D9 d9, long j) {
            d9.mo61177e(j);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ab$d */
    class C11035d implements C10864Vm<C10921Xa, C10880Wa> {
        C11035d(C11031ab abVar) {
        }

        /* renamed from: a */
        public Object mo61128a(Object obj) {
            return ((C10921Xa) obj).f26253b;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ab$e */
    class C11036e implements C11108cb {
        C11036e(C11031ab abVar) {
        }

        /* renamed from: a */
        public long mo62351a(C10184D9 d9) {
            return d9.mo61174b(Long.MAX_VALUE);
        }

        /* renamed from: a */
        public void mo62352a(C10184D9 d9, long j) {
            d9.mo61176d(j);
        }
    }

    /* renamed from: a */
    public C10987Za<YandexMetricaConfig> mo62641a(Context context, C11011a1 a1Var) {
        C10197Dm dm = new C10197Dm();
        return new C10987Za(context, a1Var, "activation", new C10779Ta(dm, new C11195eb()), new C11032a(this), new C10805Ua(dm));
    }

    /* renamed from: b */
    public C10987Za<C10622P3> mo62642b(Context context, C11011a1 a1Var) {
        return new C10987Za(context, a1Var, "clids_info", new C10836Va(), new C11035d(this), new C11036e(this));
    }

    /* renamed from: c */
    public C10987Za<C10135Be> mo62643c(Context context, C11011a1 a1Var) {
        return new C10987Za(context, a1Var, "preload_info", new C11142db(), new C11033b(this), new C11034c(this));
    }
}
