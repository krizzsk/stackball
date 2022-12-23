package com.yandex.metrica.impl.p265ob;

import android.content.Intent;
import com.yandex.metrica.impl.p265ob.C10484M1;

/* renamed from: com.yandex.metrica.impl.ob.N1 */
class C10534N1 implements C10484M1.C10488d {

    /* renamed from: a */
    final /* synthetic */ C10484M1 f25232a;

    C10534N1(C10484M1 m1) {
        this.f25232a = m1;
    }

    /* renamed from: a */
    public boolean mo61769a(Intent intent, C10484M1 m1) {
        C10484M1 m12 = this.f25232a;
        String action = intent.getAction();
        m12.getClass();
        return "com.yandex.metrica.ACTION_C_BG_L".equals(action);
    }
}
