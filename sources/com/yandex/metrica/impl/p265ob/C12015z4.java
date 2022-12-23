package com.yandex.metrica.impl.p265ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.z4 */
public class C12015z4 {

    /* renamed from: a */
    private final C10306G9 f28867a;

    /* renamed from: b */
    private final C10616Om f28868b;

    /* renamed from: c */
    private final C10691R2 f28869c;

    /* renamed from: d */
    private C10816Ui f28870d;

    /* renamed from: e */
    private long f28871e;

    public C12015z4(Context context, C11101c4 c4Var) {
        this(new C10306G9(C10663Qa.m27298a(context).mo61958b(c4Var)), new C10580Nm(), new C10691R2());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r7 = r6.f28870d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo64184a(java.lang.Boolean r7) {
        /*
            r6 = this;
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L_0x001c
            com.yandex.metrica.impl.ob.Ui r7 = r6.f28870d
            if (r7 == 0) goto L_0x001c
            com.yandex.metrica.impl.ob.R2 r0 = r6.f28869c
            long r1 = r6.f28871e
            long r3 = r7.f25965a
            java.lang.String r5 = "should report diagnostic"
            boolean r7 = r0.mo62106a((long) r1, (long) r3, (java.lang.String) r5)
            if (r7 == 0) goto L_0x001c
            r7 = 1
            goto L_0x001d
        L_0x001c:
            r7 = 0
        L_0x001d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C12015z4.mo64184a(java.lang.Boolean):boolean");
    }

    public C12015z4(C10306G9 g9, C10616Om om, C10691R2 r2) {
        this.f28867a = g9;
        this.f28868b = om;
        this.f28869c = r2;
        this.f28871e = g9.mo61373j();
    }

    /* renamed from: a */
    public void mo64182a() {
        long a = this.f28868b.mo61840a();
        this.f28871e = a;
        this.f28867a.mo61362d(a).mo61454c();
    }

    /* renamed from: a */
    public void mo64183a(C10816Ui ui) {
        this.f28870d = ui;
    }
}
