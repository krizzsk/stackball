package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10978Z3;
import com.yandex.metrica.impl.p265ob.C11024a5;
import com.yandex.metrica.impl.p265ob.C11305h5;

/* renamed from: com.yandex.metrica.impl.ob.i5 */
public class C11334i5<T extends C11305h5, C extends C10978Z3> extends C11024a5<T, C> {

    /* renamed from: com.yandex.metrica.impl.ob.i5$a */
    class C11335a implements C11024a5.C11025a<T> {

        /* renamed from: a */
        final /* synthetic */ C10328H4 f27097a;

        C11335a(C11334i5 i5Var, C10328H4 h4) {
            this.f27097a = h4;
        }

        /* renamed from: a */
        public boolean mo62636a(Object obj, C11411k0 k0Var) {
            return ((C11305h5) obj).mo62989a(k0Var, this.f27097a);
        }
    }

    public C11334i5(C11231f5<T> f5Var, C c) {
        super(f5Var, c);
    }

    /* renamed from: a */
    public boolean mo63032a(C11411k0 k0Var, C10328H4 h4) {
        return mo62635a(k0Var, new C11335a(this, h4));
    }
}
