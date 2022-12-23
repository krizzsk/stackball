package com.yandex.metrica.impl.p265ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p265ob.C10810Uf;

/* renamed from: com.yandex.metrica.impl.ob.Kd */
public class C10429Kd {

    /* renamed from: a */
    private final C10161Cc f25055a;

    /* renamed from: b */
    private final C10402Jd f25056b;

    public C10429Kd(C10161Cc cc, C10402Jd jd) {
        this.f25055a = cc;
        this.f25056b = jd;
    }

    /* renamed from: a */
    public C10810Uf.C10812b mo61663a(long j, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                C11630pd b = this.f25055a.mo61147b(j, str);
                if (b != null) {
                    return this.f25056b.mo61626a(b);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
