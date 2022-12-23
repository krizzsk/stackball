package com.yandex.metrica.impl.p265ob;

import android.os.Bundle;
import android.text.TextUtils;
import com.yandex.metrica.impl.p264ac.CrashpadServiceHelper;

/* renamed from: com.yandex.metrica.impl.ob.o5 */
public class C11589o5 extends C11737s5 {

    /* renamed from: b */
    private final C10820Um<String> f27838b;

    /* renamed from: com.yandex.metrica.impl.ob.o5$a */
    class C11590a implements C10820Um<String> {
        C11590a() {
        }

        /* renamed from: b */
        public void mo61092b(Object obj) {
            String str = (String) obj;
            if (C10796U2.m27890a(21)) {
                CrashpadServiceHelper.m25955a(str);
            }
        }
    }

    public C11589o5(C11229f4 f4Var) {
        this(f4Var, new C11590a());
    }

    /* renamed from: a */
    public boolean mo61047a(C11411k0 k0Var) {
        Bundle k = k0Var.mo63158k();
        if (k == null) {
            return true;
        }
        String string = k.getString("payload_crash_id");
        if (TextUtils.isEmpty(string)) {
            return true;
        }
        this.f27838b.mo61092b(string);
        return true;
    }

    public C11589o5(C11229f4 f4Var, C10820Um<String> um) {
        super(f4Var);
        this.f27838b = um;
    }
}
