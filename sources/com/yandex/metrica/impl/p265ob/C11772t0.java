package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11831v0;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.t0 */
public class C11772t0 implements C10737S1<C11831v0.C11832a> {

    /* renamed from: a */
    private final C11831v0 f28260a;

    public C11772t0() {
        this(new C11831v0());
    }

    /* renamed from: a */
    public Object mo61591a(int i, byte[] bArr, Map map) {
        if (200 == i) {
            this.f28260a.getClass();
            try {
                if (!C10796U2.m27893a(bArr)) {
                    return new C11831v0.C11832a(new JSONObject(new String(bArr, "UTF-8")).optString("status"));
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    C11772t0(C11831v0 v0Var) {
        this.f28260a = v0Var;
    }
}
