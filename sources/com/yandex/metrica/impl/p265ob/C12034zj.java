package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11428kg;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.zj */
public class C12034zj {

    /* renamed from: a */
    private final C10426Ka f28910a;

    /* renamed from: b */
    private final C10113Aj f28911b;

    public C12034zj() {
        this(new C10426Ka(), new C10113Aj());
    }

    /* renamed from: a */
    public void mo64201a(C11885vj vjVar, JSONObject jSONObject) {
        C10426Ka ka = this.f28910a;
        C11428kg.C11459v vVar = new C11428kg.C11459v();
        JSONObject optJSONObject = jSONObject.optJSONObject("ui_parsing");
        if (optJSONObject != null) {
            vVar.f27579b = optJSONObject.optInt("too_long_text_bound", vVar.f27579b);
            vVar.f27580c = optJSONObject.optInt("truncated_text_bound", vVar.f27580c);
            vVar.f27581d = optJSONObject.optInt("max_visited_children_in_level", vVar.f27581d);
            vVar.f27582e = C11993ym.m30956a(C11993ym.m30989d(optJSONObject, "after_create_timeout"), TimeUnit.SECONDS, vVar.f27582e);
            vVar.f27583f = optJSONObject.optBoolean("relative_text_size_calculation", vVar.f27583f);
            vVar.f27584g = optJSONObject.optBoolean("error_reporting", vVar.f27584g);
            vVar.f27585h = optJSONObject.optBoolean("parsing_allowed_by_default", vVar.f27585h);
            vVar.f27586i = this.f28911b.mo61067a(optJSONObject.optJSONArray("filters"));
        }
        vjVar.mo63937a(ka.mo61049a(vVar));
    }

    C12034zj(C10426Ka ka, C10113Aj aj) {
        this.f28910a = ka;
        this.f28911b = aj;
    }
}
