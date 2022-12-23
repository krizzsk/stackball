package com.iab.omid.library.adcolony.walking;

import com.iab.omid.library.adcolony.walking.p094a.C4595b;
import com.iab.omid.library.adcolony.walking.p094a.C4598c;
import com.iab.omid.library.adcolony.walking.p094a.C4599d;
import com.iab.omid.library.adcolony.walking.p094a.C4600e;
import com.iab.omid.library.adcolony.walking.p094a.C4601f;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.walking.b */
public class C4602b implements C4595b.C4597b {

    /* renamed from: a */
    private JSONObject f10366a;

    /* renamed from: b */
    private final C4598c f10367b;

    public C4602b(C4598c cVar) {
        this.f10367b = cVar;
    }

    /* renamed from: a */
    public void mo38685a() {
        this.f10367b.mo38678b(new C4599d(this));
    }

    /* renamed from: a */
    public void mo38676a(JSONObject jSONObject) {
        this.f10366a = jSONObject;
    }

    /* renamed from: a */
    public void mo38686a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f10367b.mo38678b(new C4601f(this, hashSet, jSONObject, j));
    }

    /* renamed from: b */
    public JSONObject mo38677b() {
        return this.f10366a;
    }

    /* renamed from: b */
    public void mo38687b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f10367b.mo38678b(new C4600e(this, hashSet, jSONObject, j));
    }
}
