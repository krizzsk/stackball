package com.iab.omid.library.corpmailru.walking.p100a;

import com.iab.omid.library.corpmailru.adsession.C4610a;
import com.iab.omid.library.corpmailru.p096b.C4612a;
import com.iab.omid.library.corpmailru.walking.p100a.C4645b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.corpmailru.walking.a.e */
public class C4650e extends C4644a {
    public C4650e(C4645b.C4647b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m9926b(String str) {
        C4612a a = C4612a.m9745a();
        if (a != null) {
            for (C4610a next : a.mo38764b()) {
                if (this.f10470a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo38830b(str, this.f10472c);
                }
            }
        }
    }

    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f10471b.toString();
    }

    /* renamed from: a */
    public void onPostExecute(String str) {
        m9926b(str);
        super.onPostExecute(str);
    }
}
