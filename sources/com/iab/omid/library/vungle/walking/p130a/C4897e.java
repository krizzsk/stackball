package com.iab.omid.library.vungle.walking.p130a;

import com.iab.omid.library.vungle.adsession.C4857a;
import com.iab.omid.library.vungle.p126b.C4859a;
import com.iab.omid.library.vungle.walking.p130a.C4892b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.walking.a.e */
public class C4897e extends C4891a {
    public C4897e(C4892b.C4894b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m11014b(String str) {
        C4859a a = C4859a.m10833a();
        if (a != null) {
            for (C4857a next : a.mo39686b()) {
                if (this.f11019a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo39752b(str, this.f11021c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f11020b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        m11014b(str);
        super.onPostExecute(str);
    }
}
