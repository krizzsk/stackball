package com.yandex.metrica.impl.p265ob;

import android.app.Activity;
import com.yandex.metrica.uiaccessor.C12063a;
import com.yandex.metrica.uiaccessor.C12065b;

/* renamed from: com.yandex.metrica.impl.ob.fl */
class C11250fl {

    /* renamed from: com.yandex.metrica.impl.ob.fl$a */
    class C11251a implements C12063a.C12064a {

        /* renamed from: a */
        final /* synthetic */ C10820Um f26918a;

        C11251a(C11250fl flVar, C10820Um um) {
            this.f26918a = um;
        }

        public void fragmentAttached(Activity activity) {
            this.f26918a.mo61092b(activity);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.fl$b */
    class C11252b implements C12065b {
        C11252b(C11250fl flVar) {
        }

        public void subscribe(Activity activity) throws Throwable {
        }

        public void unsubscribe(Activity activity) throws Throwable {
        }
    }

    C11250fl() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C12065b mo62912a(C10820Um<Activity> um) {
        C12063a aVar;
        try {
            aVar = new C12063a(new C11251a(this, um));
        } catch (Throwable unused) {
            aVar = null;
        }
        return aVar == null ? new C11252b(this) : aVar;
    }
}
