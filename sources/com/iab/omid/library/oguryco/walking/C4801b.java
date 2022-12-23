package com.iab.omid.library.oguryco.walking;

import com.iab.omid.library.oguryco.walking.p118a.C4794b;
import com.iab.omid.library.oguryco.walking.p118a.C4797c;
import com.iab.omid.library.oguryco.walking.p118a.C4798d;
import com.iab.omid.library.oguryco.walking.p118a.C4799e;
import com.iab.omid.library.oguryco.walking.p118a.C4800f;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.oguryco.walking.b */
public class C4801b implements C4794b.C4796b {

    /* renamed from: a */
    private JSONObject f10816a;

    /* renamed from: b */
    private final C4797c f10817b;

    public C4801b(C4797c cVar) {
        this.f10817b = cVar;
    }

    /* renamed from: a */
    public void mo39445a() {
        this.f10817b.mo39438b(new C4798d(this));
    }

    /* renamed from: a */
    public void mo39436a(JSONObject jSONObject) {
        this.f10816a = jSONObject;
    }

    /* renamed from: a */
    public void mo39446a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f10817b.mo39438b(new C4800f(this, hashSet, jSONObject, j));
    }

    /* renamed from: b */
    public JSONObject mo39437b() {
        return this.f10816a;
    }

    /* renamed from: b */
    public void mo39447b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f10817b.mo39438b(new C4799e(this, hashSet, jSONObject, j));
    }
}
