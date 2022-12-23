package com.yandex.metrica.impl.p265ob;

import android.text.TextUtils;
import com.yandex.metrica.C12042k;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.G5 */
public class C10299G5 extends C11737s5 {
    public C10299G5(C11229f4 f4Var) {
        super(f4Var);
    }

    /* renamed from: a */
    public boolean mo61047a(C11411k0 k0Var) {
        String o = k0Var.mo63162o();
        C12042k a = C11327i.m29166a(o);
        String h = mo63623a().mo62875h();
        C12042k a2 = C11327i.m29166a(h);
        if (!a.equals(a2)) {
            boolean z = false;
            if (TextUtils.isEmpty(a.mo64241c()) && !TextUtils.isEmpty(a2.mo64241c())) {
                k0Var.mo62215e(h);
                m26361a(k0Var, C10681Qm.LOGOUT);
            } else {
                if (!TextUtils.isEmpty(a.mo64241c()) && TextUtils.isEmpty(a2.mo64241c())) {
                    m26361a(k0Var, C10681Qm.LOGIN);
                } else {
                    if (!TextUtils.isEmpty(a.mo64241c()) && !a.mo64241c().equals(a2.mo64241c())) {
                        z = true;
                    }
                    if (z) {
                        m26361a(k0Var, C10681Qm.SWITCH);
                    } else {
                        m26361a(k0Var, C10681Qm.UPDATE);
                    }
                }
            }
            mo63623a().mo62866a(o);
        }
        return true;
    }

    /* renamed from: a */
    private void m26361a(C11411k0 k0Var, C10681Qm qm) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("action", qm.toString());
            str = jSONObject.toString();
        } catch (Throwable unused) {
            str = null;
        }
        k0Var.mo62216f(str);
        mo63623a().mo62885r().mo63762b(k0Var);
    }
}
