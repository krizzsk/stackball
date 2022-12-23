package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.yandex.mobile.ads.impl.it1;
import java.util.HashSet;
import org.json.JSONObject;

public class au1 extends zs1 {
    public au1(it1.C13448b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        us1 a;
        if (!TextUtils.isEmpty(str) && (a = us1.m42837a()) != null) {
            for (ts1 next : a.mo70400b()) {
                if (this.f43329c.contains(next.mo70227h())) {
                    next.mo70228i().mo69862a(str, this.f43331e);
                }
            }
        }
        super.onPostExecute(str);
    }

    /* access modifiers changed from: protected */
    public Object doInBackground(Object[] objArr) {
        if (ft1.m36314a(this.f43330d, ((ht1) this.f35032b).mo67630b())) {
            return null;
        }
        ((ht1) this.f35032b).mo67628a(this.f43330d);
        return this.f43330d.toString();
    }
}
