package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11428kg;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.yj */
public class C11990yj {

    /* renamed from: a */
    private C10399Ja f28807a;

    /* renamed from: b */
    private final C10113Aj f28808b;

    public C11990yj() {
        this(new C10399Ja(), new C10113Aj());
    }

    /* renamed from: a */
    public C10437Kl mo64174a(JSONObject jSONObject, String str, C11428kg.C11458u uVar) {
        C10399Ja ja = this.f28807a;
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject != null) {
            uVar.f27563b = optJSONObject.optBoolean("text_size_collecting", uVar.f27563b);
            uVar.f27564c = optJSONObject.optBoolean("relative_text_size_collecting", uVar.f27564c);
            uVar.f27565d = optJSONObject.optBoolean("text_visibility_collecting", uVar.f27565d);
            uVar.f27566e = optJSONObject.optBoolean("text_style_collecting", uVar.f27566e);
            uVar.f27571j = optJSONObject.optBoolean("info_collecting", uVar.f27571j);
            uVar.f27572k = optJSONObject.optBoolean("non_content_view_collecting", uVar.f27572k);
            uVar.f27573l = optJSONObject.optBoolean("text_length_collecting", uVar.f27573l);
            uVar.f27574m = optJSONObject.optBoolean("view_hierarchical", uVar.f27574m);
            uVar.f27576o = optJSONObject.optBoolean("ignore_filtered", uVar.f27576o);
            uVar.f27577p = optJSONObject.optBoolean("web_view_urls_collecting", uVar.f27577p);
            uVar.f27567f = optJSONObject.optInt("too_long_text_bound", uVar.f27567f);
            uVar.f27568g = optJSONObject.optInt("truncated_text_bound", uVar.f27568g);
            uVar.f27569h = optJSONObject.optInt("max_entities_count", uVar.f27569h);
            uVar.f27570i = optJSONObject.optInt("max_full_content_length", uVar.f27570i);
            uVar.f27578q = optJSONObject.optInt("web_view_url_limit", uVar.f27578q);
            uVar.f27575n = this.f28808b.mo61067a(optJSONObject.optJSONArray("filters"));
        }
        return ja.mo61049a(uVar);
    }

    C11990yj(C10399Ja ja, C10113Aj aj) {
        this.f28807a = ja;
        this.f28808b = aj;
    }
}
