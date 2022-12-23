package com.iab.omid.library.corpmailru.walking.p100a;

import android.text.TextUtils;
import com.iab.omid.library.corpmailru.adsession.C4610a;
import com.iab.omid.library.corpmailru.p096b.C4612a;
import com.iab.omid.library.corpmailru.p098d.C4627b;
import com.iab.omid.library.corpmailru.walking.p100a.C4645b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.corpmailru.walking.a.f */
public class C4651f extends C4644a {
    public C4651f(C4645b.C4647b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m9929b(String str) {
        C4612a a = C4612a.m9745a();
        if (a != null) {
            for (C4610a next : a.mo38764b()) {
                if (this.f10470a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo38825a(str, this.f10472c);
                }
            }
        }
    }

    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C4627b.m9826b(this.f10471b, this.f10474d.mo38871b())) {
            return null;
        }
        this.f10474d.mo38870a(this.f10471b);
        return this.f10471b.toString();
    }

    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m9929b(str);
        }
        super.onPostExecute(str);
    }
}
