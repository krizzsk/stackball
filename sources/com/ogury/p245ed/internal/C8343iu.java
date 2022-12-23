package com.ogury.p245ed.internal;

/* renamed from: com.ogury.ed.internal.iu */
public final class C8343iu implements C8291hj {

    /* renamed from: a */
    public static final C8344a f21550a = new C8344a((byte) 0);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C8343iu f21551c = new C8343iu((C8291hj[]) ((Object[]) new C8291hj[0]));

    /* renamed from: b */
    private final C8291hj[] f21552b;

    /* renamed from: com.ogury.ed.internal.iu$a */
    public static final class C8344a {
        public /* synthetic */ C8344a(byte b) {
            this();
        }

        private C8344a() {
        }

        /* renamed from: a */
        public static C8343iu m23608a() {
            return C8343iu.f21551c;
        }
    }

    public C8343iu(C8291hj[] hjVarArr) {
        C8467mq.m23881b(hjVarArr, "mraidUrlHandlers");
        this.f21552b = hjVarArr;
    }

    /* renamed from: a */
    public final boolean mo53657a(String str, C8362jh jhVar, C8185eb ebVar) {
        C8467mq.m23881b(str, "url");
        C8467mq.m23881b(jhVar, "webView");
        C8467mq.m23881b(ebVar, "ad");
        C8291hj[] hjVarArr = this.f21552b;
        int length = hjVarArr.length;
        int i = 0;
        while (i < length) {
            C8291hj hjVar = hjVarArr[i];
            i++;
            if (hjVar.mo53657a(str, jhVar, ebVar)) {
                return true;
            }
        }
        return false;
    }
}
