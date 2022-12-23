package com.iab.omid.library.smaato.walking.p124a;

import android.text.TextUtils;
import com.iab.omid.library.smaato.adsession.C4809a;
import com.iab.omid.library.smaato.p120b.C4811a;
import com.iab.omid.library.smaato.p122d.C4825b;
import com.iab.omid.library.smaato.walking.p124a.C4842b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.smaato.walking.a.f */
public class C4848f extends C4841a {
    public C4848f(C4842b.C4844b bVar, HashSet<String> hashSet, JSONObject jSONObject, double d) {
        super(bVar, hashSet, jSONObject, d);
    }

    /* renamed from: b */
    private void m10793b(String str) {
        C4811a a = C4811a.m10631a();
        if (a != null) {
            for (C4809a next : a.mo39514b()) {
                if (this.f10906a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo39561a(str, this.f10908c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C4825b.m10701b(this.f10907b, this.f10910d.mo39599b())) {
            return null;
        }
        this.f10910d.mo39598a(this.f10907b);
        return this.f10907b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m10793b(str);
        }
        super.onPostExecute(str);
    }
}
