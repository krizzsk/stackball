package com.ogury.p245ed.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.ogury.ed.internal.oa */
final class C8510oa implements C8495np<C8486nh> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final CharSequence f21726a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f21727b = 0;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f21728c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C8443lv<CharSequence, Integer, C8380jz<Integer, Integer>> f21729d;

    public C8510oa(CharSequence charSequence, int i, C8443lv<? super CharSequence, ? super Integer, C8380jz<Integer, Integer>> lvVar) {
        C8467mq.m23881b(charSequence, "input");
        C8467mq.m23881b(lvVar, "getNextMatch");
        this.f21726a = charSequence;
        this.f21729d = lvVar;
    }

    /* renamed from: com.ogury.ed.internal.oa$a */
    public static final class C8511a implements C8474mx, Iterator<C8486nh> {

        /* renamed from: a */
        final /* synthetic */ C8510oa f21730a;

        /* renamed from: b */
        private int f21731b = -1;

        /* renamed from: c */
        private int f21732c;

        /* renamed from: d */
        private int f21733d;

        /* renamed from: e */
        private C8486nh f21734e;

        /* renamed from: f */
        private int f21735f;

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        C8511a(C8510oa oaVar) {
            this.f21730a = oaVar;
            int c = C8488ni.m23921c(oaVar.f21727b, oaVar.f21726a.length());
            this.f21732c = c;
            this.f21733d = c;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
            if (r0 < com.ogury.p245ed.internal.C8510oa.m23938a(r6.f21730a)) goto L_0x0022;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void m23943a() {
            /*
                r6 = this;
                int r0 = r6.f21733d
                r1 = 0
                if (r0 >= 0) goto L_0x000b
                r6.f21731b = r1
                r0 = 0
                r6.f21734e = r0
                return
            L_0x000b:
                com.ogury.ed.internal.oa r0 = r6.f21730a
                int r0 = r0.f21728c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0022
                int r0 = r6.f21735f
                int r0 = r0 + r3
                r6.f21735f = r0
                com.ogury.ed.internal.oa r4 = r6.f21730a
                int r4 = r4.f21728c
                if (r0 >= r4) goto L_0x0030
            L_0x0022:
                int r0 = r6.f21733d
                com.ogury.ed.internal.oa r4 = r6.f21730a
                java.lang.CharSequence r4 = r4.f21726a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0046
            L_0x0030:
                int r0 = r6.f21732c
                com.ogury.ed.internal.nh r1 = new com.ogury.ed.internal.nh
                com.ogury.ed.internal.oa r4 = r6.f21730a
                java.lang.CharSequence r4 = r4.f21726a
                int r4 = com.ogury.p245ed.internal.C8516oc.m23970c(r4)
                r1.<init>(r0, r4)
                r6.f21734e = r1
                r6.f21733d = r2
                goto L_0x009b
            L_0x0046:
                com.ogury.ed.internal.oa r0 = r6.f21730a
                com.ogury.ed.internal.lv r0 = r0.f21729d
                com.ogury.ed.internal.oa r4 = r6.f21730a
                java.lang.CharSequence r4 = r4.f21726a
                int r5 = r6.f21733d
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.mo53233a(r4, r5)
                com.ogury.ed.internal.jz r0 = (com.ogury.p245ed.internal.C8380jz) r0
                if (r0 != 0) goto L_0x0076
                int r0 = r6.f21732c
                com.ogury.ed.internal.nh r1 = new com.ogury.ed.internal.nh
                com.ogury.ed.internal.oa r4 = r6.f21730a
                java.lang.CharSequence r4 = r4.f21726a
                int r4 = com.ogury.p245ed.internal.C8516oc.m23970c(r4)
                r1.<init>(r0, r4)
                r6.f21734e = r1
                r6.f21733d = r2
                goto L_0x009b
            L_0x0076:
                java.lang.Object r2 = r0.mo53855c()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.mo53856d()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f21732c
                com.ogury.ed.internal.nh r4 = com.ogury.p245ed.internal.C8488ni.m23919a(r4, r2)
                r6.f21734e = r4
                int r2 = r2 + r0
                r6.f21732c = r2
                if (r0 != 0) goto L_0x0098
                r1 = 1
            L_0x0098:
                int r2 = r2 + r1
                r6.f21733d = r2
            L_0x009b:
                r6.f21731b = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ogury.p245ed.internal.C8510oa.C8511a.m23943a():void");
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C8486nh next() {
            if (this.f21731b == -1) {
                m23943a();
            }
            if (this.f21731b != 0) {
                C8486nh nhVar = this.f21734e;
                if (nhVar != null) {
                    this.f21734e = null;
                    this.f21731b = -1;
                    return nhVar;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.ranges.IntRange");
            }
            throw new NoSuchElementException();
        }

        public final boolean hasNext() {
            if (this.f21731b == -1) {
                m23943a();
            }
            return this.f21731b == 1;
        }
    }

    /* renamed from: a */
    public final Iterator<C8486nh> mo53994a() {
        return new C8511a(this);
    }
}
