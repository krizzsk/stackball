package com.iab.omid.library.ironsrc.walking.p112a;

import android.text.TextUtils;
import com.iab.omid.library.ironsrc.adsession.C4708a;
import com.iab.omid.library.ironsrc.p108b.C4710a;
import com.iab.omid.library.ironsrc.p110d.C4725b;
import com.iab.omid.library.ironsrc.walking.p112a.C4743b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.walking.a.f */
public class C4749f extends C4742a {
    public C4749f(C4743b.C4745b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m10360b(String str) {
        C4710a a = C4710a.m10179a();
        if (a != null) {
            for (C4708a next : a.mo39124b()) {
                if (this.f10686a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo39177a(str, this.f10688c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C4725b.m10257b(this.f10687b, this.f10690d.mo39223b())) {
            return null;
        }
        this.f10690d.mo39222a(this.f10687b);
        return this.f10687b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m10360b(str);
        }
        super.onPostExecute(str);
    }
}
