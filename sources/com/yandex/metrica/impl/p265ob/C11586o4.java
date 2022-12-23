package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.p265ob.C10813Ug;
import com.yandex.metrica.impl.p265ob.C10910X3;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.o4 */
public class C11586o4 extends C11229f4 implements C10432Kg, C10405Jg {

    /* renamed from: A */
    private final C10854Vg f27831A;

    /* renamed from: B */
    private final C10490M2 f27832B;

    /* renamed from: C */
    private final C10498M7<File> f27833C;

    /* renamed from: D */
    private final C11970y3 f27834D;

    /* renamed from: z */
    private final C10813Ug f27835z;

    /* renamed from: com.yandex.metrica.impl.ob.o4$a */
    class C11587a implements C10820Um<File> {
        C11587a() {
        }

        /* renamed from: b */
        public void mo61092b(Object obj) {
            C11586o4.m29957a(C11586o4.this, (File) obj);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.o4$b */
    public class C11588b implements C10813Ug.C10814a {
        public C11588b() {
        }

        /* renamed from: a */
        public void mo62363a(C10255Fg fg) {
            if (fg != null) {
                C11586o4.this.mo62276a(new C11411k0().mo62212a(fg.mo61326a()).mo63137a(C11413k1.EVENT_TYPE_SEND_REFERRER.mo63170b()));
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C11586o4(android.content.Context r21, com.yandex.metrica.impl.p265ob.C10675Qi r22, com.yandex.metrica.impl.p265ob.C11101c4 r23, com.yandex.metrica.impl.p265ob.C10910X3.C10911a r24, com.yandex.metrica.impl.p265ob.C10813Ug r25, com.yandex.metrica.impl.p265ob.C10490M2 r26, com.yandex.metrica.impl.p265ob.C10890Wi r27) {
        /*
            r20 = this;
            com.yandex.metrica.impl.ob.V3 r5 = new com.yandex.metrica.impl.ob.V3
            r5.<init>()
            com.yandex.metrica.impl.ob.R2 r6 = new com.yandex.metrica.impl.ob.R2
            r6.<init>()
            com.yandex.metrica.impl.ob.L0 r7 = new com.yandex.metrica.impl.ob.L0
            r7.<init>()
            com.yandex.metrica.impl.ob.p4 r19 = new com.yandex.metrica.impl.ob.p4
            com.yandex.metrica.impl.ob.n4 r14 = new com.yandex.metrica.impl.ob.n4
            r4 = r26
            r14.<init>(r4)
            com.yandex.metrica.impl.ob.P0 r0 = com.yandex.metrica.impl.p265ob.C10619P0.m27164i()
            com.yandex.metrica.impl.ob.zn r0 = r0.mo61891s()
            com.yandex.metrica.impl.ob.sn r15 = r0.mo64211e()
            java.lang.String r0 = r23.mo62716b()
            r1 = r21
            int r16 = com.yandex.metrica.impl.p265ob.C10796U2.m27895b(r1, r0)
            com.yandex.metrica.impl.ob.P0 r0 = com.yandex.metrica.impl.p265ob.C10619P0.m27164i()
            com.yandex.metrica.impl.ob.zn r17 = r0.mo61891s()
            com.yandex.metrica.impl.ob.P0 r0 = com.yandex.metrica.impl.p265ob.C10619P0.m27164i()
            com.yandex.metrica.impl.ob.o1 r18 = r0.mo61882j()
            r8 = r19
            r9 = r21
            r10 = r23
            r11 = r24
            r12 = r27
            r13 = r22
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0 = r20
            r2 = r23
            r3 = r22
            r4 = r24
            r9 = r25
            r10 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11586o4.<init>(android.content.Context, com.yandex.metrica.impl.ob.Qi, com.yandex.metrica.impl.ob.c4, com.yandex.metrica.impl.ob.X3$a, com.yandex.metrica.impl.ob.Ug, com.yandex.metrica.impl.ob.M2, com.yandex.metrica.impl.ob.Wi):void");
    }

    /* renamed from: a */
    private void m29956a(Context context, C10442L0 l0) {
        File a = l0.mo61697a(context, "YandexMetricaNativeCrashes");
        if (a != null) {
            new C10304G7(a, new C11587a()).mo61354a();
        }
    }

    /* renamed from: F */
    public void mo62865F() {
        this.f27835z.mo62361a(this.f27831A);
    }

    /* renamed from: s */
    public CounterConfiguration.C10019b mo62439s() {
        return CounterConfiguration.C10019b.MAIN;
    }

    /* renamed from: a */
    public void mo61630a() {
        mo62889w().mo61488c(true);
    }

    /* renamed from: a */
    public synchronized void mo62275a(C10910X3.C10911a aVar) {
        super.mo62275a(aVar);
        this.f27832B.mo61770a(aVar.f26233l);
    }

    /* renamed from: a */
    public void mo61738a(C10675Qi qi) {
        super.mo61738a(qi);
        this.f27834D.mo64119a(qi);
    }

    /* renamed from: a */
    static void m29957a(C11586o4 o4Var, File file) {
        o4Var.f27833C.mo61784a(file);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C11586o4(Context context, C11101c4 c4Var, C10675Qi qi, C10910X3.C10911a aVar, C10826V3 v3, C10691R2 r2, C10442L0 l0, C11620p4 p4Var, C10813Ug ug, C10490M2 m2) {
        super(context, c4Var, v3, r2, p4Var);
        C11620p4 p4Var2 = p4Var;
        this.f27835z = ug;
        C11133d5 k = mo62878k();
        k.mo62744a(C11413k1.EVENT_TYPE_REGULAR, new C10875W5(k.mo62745b()));
        this.f27831A = p4Var2.mo63457c(this);
        this.f27832B = m2;
        C10830V7 a = p4Var2.mo63454a(p4Var.mo63458e(), p4Var2.mo63456b(this), mo62873f());
        this.f27833C = a;
        a.mo61783a();
        Context context2 = context;
        C10442L0 l02 = l0;
        m29956a(context, l0);
        C11970y3 a2 = p4Var2.mo63455a(this);
        this.f27834D = a2;
        C10675Qi qi2 = qi;
        a2.mo64120a(qi, aVar.f26238q);
    }
}
