package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p264ac.CrashpadServiceHelper;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.d8 */
public class C11136d8 implements C10542N7<C10984Z7> {

    /* renamed from: a */
    private final C11225f2 f26689a;

    /* renamed from: com.yandex.metrica.impl.ob.d8$a */
    class C11137a implements C10864Vm<String, C11411k0> {

        /* renamed from: a */
        final /* synthetic */ C10984Z7 f26690a;

        C11137a(C11136d8 d8Var, C10984Z7 z7) {
            this.f26690a = z7;
        }

        /* renamed from: a */
        public Object mo61128a(Object obj) {
            return C10385J0.m26635a((String) obj, C12038zm.m31087b(this.f26690a.f26410b.mo61129a())).mo63148c(this.f26690a.f26411c.f27840a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.d8$b */
    class C11138b implements C10864Vm<String, C11411k0> {

        /* renamed from: a */
        final /* synthetic */ C10984Z7 f26691a;

        C11138b(C11136d8 d8Var, C10984Z7 z7) {
            this.f26691a = z7;
        }

        /* renamed from: a */
        public Object mo61128a(Object obj) {
            return C10385J0.m26641b((String) obj, C12038zm.m31087b(this.f26691a.f26410b.mo61129a())).mo63148c(this.f26691a.f26411c.f27840a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.d8$c */
    public static class C11139c implements C10820Um<File> {

        /* renamed from: a */
        private final String f26692a;

        public C11139c(String str) {
            this.f26692a = str;
        }

        /* renamed from: b */
        public void mo61092b(Object obj) {
            File file = (File) obj;
            CrashpadServiceHelper.m25955a(this.f26692a);
        }
    }

    public C11136d8(C11225f2 f2Var) {
        this.f26689a = f2Var;
    }

    /* renamed from: a */
    public void mo61812a(Object obj) {
        C10984Z7 z7 = (C10984Z7) obj;
        this.f26689a.mo62857a(z7, (C10864Vm<String, C11411k0>) new C11138b(this, z7));
    }

    /* renamed from: b */
    public void mo61813b(Object obj) {
        C10984Z7 z7 = (C10984Z7) obj;
        this.f26689a.mo62857a(z7, (C10864Vm<String, C11411k0>) new C11137a(this, z7));
    }

    /* renamed from: a */
    public void mo62747a(C10984Z7 z7) {
        this.f26689a.mo62857a(z7, (C10864Vm<String, C11411k0>) new C11137a(this, z7));
    }

    /* renamed from: b */
    public void mo62748b(C10984Z7 z7) {
        this.f26689a.mo62857a(z7, (C10864Vm<String, C11411k0>) new C11138b(this, z7));
    }
}
