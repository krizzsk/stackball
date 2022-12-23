package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.Rc */
public class C10702Rc {

    /* renamed from: a */
    private final C10101A8 f25595a;

    /* renamed from: b */
    private final C10161Cc f25596b;

    public C10702Rc(Context context) {
        this(C10663Qa.m27298a(context).mo61962e(), new C10161Cc(context));
    }

    /* renamed from: a */
    public void mo62127a(C10781Tc tc) {
        String a = this.f25596b.mo61145a(tc);
        if (!TextUtils.isEmpty(a)) {
            this.f25595a.mo63587a(tc.mo62292d(), a);
        }
    }

    C10702Rc(C10101A8 a8, C10161Cc cc) {
        this.f25595a = a8;
        this.f25596b = cc;
    }
}
