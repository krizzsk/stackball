package com.iab.omid.library.ironsrc.walking;

import com.iab.omid.library.ironsrc.walking.p112a.C4743b;
import com.iab.omid.library.ironsrc.walking.p112a.C4746c;
import com.iab.omid.library.ironsrc.walking.p112a.C4747d;
import com.iab.omid.library.ironsrc.walking.p112a.C4748e;
import com.iab.omid.library.ironsrc.walking.p112a.C4749f;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.walking.b */
public class C4750b implements C4743b.C4745b {

    /* renamed from: a */
    private JSONObject f10695a;

    /* renamed from: b */
    private final C4746c f10696b;

    public C4750b(C4746c cVar) {
        this.f10696b = cVar;
    }

    /* renamed from: a */
    public void mo39231a() {
        this.f10696b.mo39224b(new C4747d(this));
    }

    /* renamed from: a */
    public void mo39222a(JSONObject jSONObject) {
        this.f10695a = jSONObject;
    }

    /* renamed from: a */
    public void mo39232a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f10696b.mo39224b(new C4749f(this, hashSet, jSONObject, j));
    }

    /* renamed from: b */
    public JSONObject mo39223b() {
        return this.f10695a;
    }

    /* renamed from: b */
    public void mo39233b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f10696b.mo39224b(new C4748e(this, hashSet, jSONObject, j));
    }
}
