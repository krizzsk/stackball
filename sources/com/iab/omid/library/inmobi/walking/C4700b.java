package com.iab.omid.library.inmobi.walking;

import com.iab.omid.library.inmobi.walking.p106a.C4693b;
import com.iab.omid.library.inmobi.walking.p106a.C4696c;
import com.iab.omid.library.inmobi.walking.p106a.C4697d;
import com.iab.omid.library.inmobi.walking.p106a.C4698e;
import com.iab.omid.library.inmobi.walking.p106a.C4699f;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.walking.b */
public class C4700b implements C4693b.C4695b {

    /* renamed from: a */
    private JSONObject f10581a;

    /* renamed from: b */
    private final C4696c f10582b;

    public C4700b(C4696c cVar) {
        this.f10582b = cVar;
    }

    /* renamed from: a */
    public void mo39045a() {
        this.f10582b.mo39038b(new C4697d(this));
    }

    /* renamed from: a */
    public void mo39036a(JSONObject jSONObject) {
        this.f10581a = jSONObject;
    }

    /* renamed from: a */
    public void mo39046a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f10582b.mo39038b(new C4699f(this, hashSet, jSONObject, j));
    }

    /* renamed from: b */
    public JSONObject mo39037b() {
        return this.f10581a;
    }

    /* renamed from: b */
    public void mo39047b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f10582b.mo39038b(new C4698e(this, hashSet, jSONObject, j));
    }
}
