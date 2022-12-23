package com.iab.omid.library.corpmailru.walking;

import com.iab.omid.library.corpmailru.walking.p100a.C4645b;
import com.iab.omid.library.corpmailru.walking.p100a.C4648c;
import com.iab.omid.library.corpmailru.walking.p100a.C4649d;
import com.iab.omid.library.corpmailru.walking.p100a.C4650e;
import com.iab.omid.library.corpmailru.walking.p100a.C4651f;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.corpmailru.walking.b */
public class C4652b implements C4645b.C4647b {

    /* renamed from: a */
    private JSONObject f10479a;

    /* renamed from: b */
    private final C4648c f10480b;

    public C4652b(C4648c cVar) {
        this.f10480b = cVar;
    }

    /* renamed from: a */
    public void mo38879a() {
        this.f10480b.mo38872b(new C4649d(this));
    }

    /* renamed from: a */
    public void mo38870a(JSONObject jSONObject) {
        this.f10479a = jSONObject;
    }

    /* renamed from: a */
    public void mo38880a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f10480b.mo38872b(new C4651f(this, hashSet, jSONObject, j));
    }

    /* renamed from: b */
    public JSONObject mo38871b() {
        return this.f10479a;
    }

    /* renamed from: b */
    public void mo38881b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f10480b.mo38872b(new C4650e(this, hashSet, jSONObject, j));
    }
}
