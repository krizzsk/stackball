package com.iab.omid.library.oguryco.walking.p118a;

import com.iab.omid.library.oguryco.adsession.C4758a;
import com.iab.omid.library.oguryco.p114b.C4760a;
import com.iab.omid.library.oguryco.walking.p118a.C4794b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.oguryco.walking.a.e */
public class C4799e extends C4793a {
    public C4799e(C4794b.C4796b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m10586b(String str) {
        C4760a a = C4760a.m10402a();
        if (a != null) {
            for (C4758a next : a.mo39336b()) {
                if (this.f10807a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo39396b(str, this.f10809c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f10808b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        m10586b(str);
        super.onPostExecute(str);
    }
}
