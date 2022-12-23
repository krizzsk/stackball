package com.iab.omid.library.inmobi.walking.p106a;

import com.iab.omid.library.inmobi.adsession.C4660a;
import com.iab.omid.library.inmobi.p102b.C4662a;
import com.iab.omid.library.inmobi.walking.p106a.C4693b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.walking.a.e */
public class C4698e extends C4692a {
    public C4698e(C4693b.C4695b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m10136b(String str) {
        C4662a a = C4662a.m9971a();
        if (a != null) {
            for (C4660a next : a.mo38948b()) {
                if (this.f10572a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo39000b(str, this.f10574c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f10573b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        m10136b(str);
        super.onPostExecute(str);
    }
}
