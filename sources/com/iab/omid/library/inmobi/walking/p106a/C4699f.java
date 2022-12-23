package com.iab.omid.library.inmobi.walking.p106a;

import android.text.TextUtils;
import com.iab.omid.library.inmobi.adsession.C4660a;
import com.iab.omid.library.inmobi.p102b.C4662a;
import com.iab.omid.library.inmobi.p104d.C4676b;
import com.iab.omid.library.inmobi.walking.p106a.C4693b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.walking.a.f */
public class C4699f extends C4692a {
    public C4699f(C4693b.C4695b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m10139b(String str) {
        C4662a a = C4662a.m9971a();
        if (a != null) {
            for (C4660a next : a.mo38948b()) {
                if (this.f10572a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo38996a(str, this.f10574c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C4676b.m10043b(this.f10573b, this.f10576d.mo39037b())) {
            return null;
        }
        this.f10576d.mo39036a(this.f10573b);
        return this.f10573b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m10139b(str);
        }
        super.onPostExecute(str);
    }
}
