package com.iab.omid.library.vungle.walking;

import com.iab.omid.library.vungle.walking.p130a.C4892b;
import com.iab.omid.library.vungle.walking.p130a.C4895c;
import com.iab.omid.library.vungle.walking.p130a.C4896d;
import com.iab.omid.library.vungle.walking.p130a.C4897e;
import com.iab.omid.library.vungle.walking.p130a.C4898f;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.walking.b */
public class C4899b implements C4892b.C4894b {

    /* renamed from: a */
    private JSONObject f11028a;

    /* renamed from: b */
    private final C4895c f11029b;

    public C4899b(C4895c cVar) {
        this.f11029b = cVar;
    }

    /* renamed from: a */
    public void mo39801a() {
        this.f11029b.mo39794b(new C4896d(this));
    }

    /* renamed from: a */
    public void mo39792a(JSONObject jSONObject) {
        this.f11028a = jSONObject;
    }

    /* renamed from: a */
    public void mo39802a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f11029b.mo39794b(new C4898f(this, hashSet, jSONObject, j));
    }

    /* renamed from: b */
    public JSONObject mo39793b() {
        return this.f11028a;
    }

    /* renamed from: b */
    public void mo39803b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f11029b.mo39794b(new C4897e(this, hashSet, jSONObject, j));
    }
}
