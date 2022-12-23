package com.yandex.metrica.impl.p265ob;

import android.content.Intent;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.r0 */
public class C11699r0 {

    /* renamed from: a */
    private final C10794U0 f28040a;

    /* renamed from: b */
    private final Map<Boolean, String> f28041b = new HashMap();

    public C11699r0(C10794U0 u0) {
        this.f28040a = u0;
    }

    /* renamed from: a */
    public void mo63564a(Intent intent) {
        if (intent != null) {
            m30137a(intent.getDataString(), false);
        }
    }

    /* renamed from: b */
    public void mo63566b(String str) {
        m30137a(str, true);
    }

    /* renamed from: a */
    public void mo63565a(String str) {
        m30137a(str, false);
    }

    /* renamed from: a */
    private void m30137a(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            if (!C10796U2.m27892a((Object) str, (Object) this.f28041b.get(Boolean.valueOf(!z)))) {
                this.f28040a.mo61676a(str, z);
            }
            this.f28041b.put(Boolean.valueOf(z), str);
        }
    }
}
