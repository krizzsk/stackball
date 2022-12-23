package com.iab.omid.library.smaato.walking.p124a;

import com.iab.omid.library.smaato.adsession.C4809a;
import com.iab.omid.library.smaato.p120b.C4811a;
import com.iab.omid.library.smaato.walking.p124a.C4842b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.smaato.walking.a.e */
public class C4847e extends C4841a {
    public C4847e(C4842b.C4844b bVar, HashSet<String> hashSet, JSONObject jSONObject, double d) {
        super(bVar, hashSet, jSONObject, d);
    }

    /* renamed from: b */
    private void m10790b(String str) {
        C4811a a = C4811a.m10631a();
        if (a != null) {
            for (C4809a next : a.mo39514b()) {
                if (this.f10906a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo39565b(str, this.f10908c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f10907b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        m10790b(str);
        super.onPostExecute(str);
    }
}
