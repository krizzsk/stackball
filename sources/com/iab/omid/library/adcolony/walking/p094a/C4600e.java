package com.iab.omid.library.adcolony.walking.p094a;

import com.iab.omid.library.adcolony.adsession.C4560a;
import com.iab.omid.library.adcolony.p090b.C4562a;
import com.iab.omid.library.adcolony.walking.p094a.C4595b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.walking.a.e */
public class C4600e extends C4594a {
    public C4600e(C4595b.C4597b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m9702b(String str) {
        C4562a a = C4562a.m9524a();
        if (a != null) {
            for (C4560a next : a.mo38578b()) {
                if (this.f10357a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo38636b(str, this.f10359c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f10358b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        m9702b(str);
        super.onPostExecute(str);
    }
}
