package com.iab.omid.library.adcolony.walking.p094a;

import android.text.TextUtils;
import com.iab.omid.library.adcolony.adsession.C4560a;
import com.iab.omid.library.adcolony.p090b.C4562a;
import com.iab.omid.library.adcolony.p092d.C4577b;
import com.iab.omid.library.adcolony.walking.p094a.C4595b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.walking.a.f */
public class C4601f extends C4594a {
    public C4601f(C4595b.C4597b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m9705b(String str) {
        C4562a a = C4562a.m9524a();
        if (a != null) {
            for (C4560a next : a.mo38578b()) {
                if (this.f10357a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo38631a(str, this.f10359c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C4577b.m9602b(this.f10358b, this.f10360d.mo38677b())) {
            return null;
        }
        this.f10360d.mo38676a(this.f10358b);
        return this.f10358b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m9705b(str);
        }
        super.onPostExecute(str);
    }
}
