package com.yandex.metrica.impl.p265ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p265ob.C10810Uf;

/* renamed from: com.yandex.metrica.impl.ob.Id */
public class C10368Id {

    /* renamed from: a */
    private final C10161Cc f24899a;

    /* renamed from: b */
    private final C10337Hd f24900b;

    public C10368Id(C10161Cc cc, C10337Hd hd) {
        this.f24899a = cc;
        this.f24900b = hd;
    }

    /* renamed from: a */
    public C10810Uf.C10811a mo61537a(long j, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                C10781Tc a = this.f24899a.mo61144a(j, str);
                if (a != null) {
                    return this.f24900b.mo61464a(a);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
