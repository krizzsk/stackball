package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.os.Bundle;
import com.yandex.metrica.rtm.wrapper.C12055f;

/* renamed from: com.yandex.metrica.impl.ob.g2 */
class C11260g2 {

    /* renamed from: a */
    private final C11968y1 f26936a;

    /* renamed from: b */
    private final C12055f f26937b;

    C11260g2(C11968y1 y1Var, Context context) {
        this(y1Var, new C11950xh().mo64082b(context));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo62926a(int i, Bundle bundle) {
        if (i == 1) {
            this.f26936a.reportData(bundle);
        } else if (i == 2) {
            this.f26937b.reportData(bundle);
        }
    }

    C11260g2(C11968y1 y1Var, C12055f fVar) {
        this.f26936a = y1Var;
        this.f26937b = fVar;
    }
}
