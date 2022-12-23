package com.yandex.metrica.impl.p265ob;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.nf */
public class C11563nf implements C11529mf {

    /* renamed from: a */
    private final C10886We f27787a;

    public C11563nf() {
        this(new C10886We());
    }

    /* renamed from: a */
    public byte[] mo61983a(C10926Xe xe, C11384jh jhVar) {
        if (!jhVar.mo63090U() && !TextUtils.isEmpty(xe.f26258b)) {
            try {
                JSONObject jSONObject = new JSONObject(xe.f26258b);
                jSONObject.remove("preloadInfo");
                xe.f26258b = jSONObject.toString();
            } catch (Throwable unused) {
            }
        }
        return this.f27787a.mo61983a(xe, jhVar);
    }

    C11563nf(C10886We we) {
        this.f27787a = we;
    }
}
