package com.iab.omid.library.ironsrc.walking.p112a;

import com.iab.omid.library.ironsrc.adsession.C4708a;
import com.iab.omid.library.ironsrc.p108b.C4710a;
import com.iab.omid.library.ironsrc.walking.p112a.C4743b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.walking.a.e */
public class C4748e extends C4742a {
    public C4748e(C4743b.C4745b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m10357b(String str) {
        C4710a a = C4710a.m10179a();
        if (a != null) {
            for (C4708a next : a.mo39124b()) {
                if (this.f10686a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo39182b(str, this.f10688c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f10687b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        m10357b(str);
        super.onPostExecute(str);
    }
}
