package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.it1;
import java.util.HashSet;
import org.json.JSONObject;

public class xt1 extends zs1 {
    public xt1(it1.C13448b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        us1 a = us1.m42837a();
        if (a != null) {
            for (ts1 next : a.mo70400b()) {
                if (this.f43329c.contains(next.mo70227h())) {
                    next.mo70228i().mo69864b(str, this.f43331e);
                }
            }
        }
        super.onPostExecute(str);
    }

    /* access modifiers changed from: protected */
    public Object doInBackground(Object[] objArr) {
        return this.f43330d.toString();
    }
}
