package com.yandex.metrica.impl.p265ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p265ob.C10135Be;
import com.yandex.metrica.impl.p265ob.C11283gg;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ze */
public class C12027ze implements C11194ea<C10135Be.C10136a, C11283gg.C11285b> {

    /* renamed from: a */
    private final C10430Ke f28894a;

    public C12027ze() {
        this(new C10430Ke());
    }

    C12027ze(C10430Ke ke) {
        this.f28894a = ke;
    }

    /* renamed from: a */
    public C11283gg.C11285b mo61050b(C10135Be.C10136a aVar) {
        C11283gg.C11285b bVar = new C11283gg.C11285b();
        if (!TextUtils.isEmpty(aVar.f24403a)) {
            bVar.f26994b = aVar.f24403a;
        }
        bVar.f26995c = aVar.f24404b.toString();
        bVar.f26996d = this.f28894a.mo61050b(aVar.f24405c).intValue();
        return bVar;
    }

    /* renamed from: a */
    public C10135Be.C10136a mo61049a(C11283gg.C11285b bVar) {
        JSONObject jSONObject;
        String str = bVar.f26994b;
        String str2 = bVar.f26995c;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
            return new C10135Be.C10136a(str, jSONObject, this.f28894a.mo61049a(Integer.valueOf(bVar.f26996d)));
        }
        jSONObject = new JSONObject();
        return new C10135Be.C10136a(str, jSONObject, this.f28894a.mo61049a(Integer.valueOf(bVar.f26996d)));
    }
}
