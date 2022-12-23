package com.iab.omid.library.smaato.walking;

import com.iab.omid.library.smaato.walking.p124a.C4842b;
import com.iab.omid.library.smaato.walking.p124a.C4845c;
import com.iab.omid.library.smaato.walking.p124a.C4846d;
import com.iab.omid.library.smaato.walking.p124a.C4847e;
import com.iab.omid.library.smaato.walking.p124a.C4848f;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.smaato.walking.b */
public class C4849b implements C4842b.C4844b {

    /* renamed from: a */
    private JSONObject f10915a;

    /* renamed from: b */
    private final C4845c f10916b;

    public C4849b(C4845c cVar) {
        this.f10916b = cVar;
    }

    /* renamed from: a */
    public void mo39607a() {
        this.f10916b.mo39600b(new C4846d(this));
    }

    /* renamed from: a */
    public void mo39598a(JSONObject jSONObject) {
        this.f10915a = jSONObject;
    }

    /* renamed from: a */
    public void mo39608a(JSONObject jSONObject, HashSet<String> hashSet, double d) {
        this.f10916b.mo39600b(new C4848f(this, hashSet, jSONObject, d));
    }

    /* renamed from: b */
    public JSONObject mo39599b() {
        return this.f10915a;
    }

    /* renamed from: b */
    public void mo39609b(JSONObject jSONObject, HashSet<String> hashSet, double d) {
        this.f10916b.mo39600b(new C4847e(this, hashSet, jSONObject, d));
    }
}
