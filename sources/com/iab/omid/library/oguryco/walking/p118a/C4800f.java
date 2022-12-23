package com.iab.omid.library.oguryco.walking.p118a;

import android.text.TextUtils;
import com.iab.omid.library.oguryco.adsession.C4758a;
import com.iab.omid.library.oguryco.p114b.C4760a;
import com.iab.omid.library.oguryco.p116d.C4776b;
import com.iab.omid.library.oguryco.walking.p118a.C4794b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.oguryco.walking.a.f */
public class C4800f extends C4793a {
    public C4800f(C4794b.C4796b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m10589b(String str) {
        C4760a a = C4760a.m10402a();
        if (a != null) {
            for (C4758a next : a.mo39336b()) {
                if (this.f10807a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo39391a(str, this.f10809c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C4776b.m10486b(this.f10808b, this.f10811d.mo39437b())) {
            return null;
        }
        this.f10811d.mo39436a(this.f10808b);
        return this.f10808b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m10589b(str);
        }
        super.onPostExecute(str);
    }
}
