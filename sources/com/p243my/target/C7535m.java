package com.p243my.target;

import android.content.Context;
import android.text.TextUtils;
import com.p243my.target.C7524l3;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.m */
public class C7535m extends C7337c<C7664t1> {

    /* renamed from: a */
    public final int f18955a;

    public C7535m(int i) {
        this.f18955a = i;
    }

    /* renamed from: a */
    public static C7337c<C7664t1> m19713a(int i) {
        return new C7535m(i);
    }

    /* renamed from: a */
    public C7664t1 mo49776a(String str, C7617q1 q1Var, C7664t1 t1Var, C7298a aVar, C7524l3.C7525a aVar2, C7524l3 l3Var, Context context) {
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        JSONObject optJSONObject2;
        JSONObject a = C7337c.m18819a(str, aVar2, l3Var);
        if (a == null || (optJSONObject = a.optJSONObject(aVar.getFormat())) == null || (optJSONArray = optJSONObject.optJSONArray("banners")) == null || optJSONArray.length() <= 0 || (optJSONObject2 = optJSONArray.optJSONObject(0)) == null) {
            return null;
        }
        C7646s1 newBanner = C7646s1.newBanner();
        String optString = optJSONObject2.optString("id");
        if (TextUtils.isEmpty(optString)) {
            optString = optJSONObject2.optString("bannerID", newBanner.getId());
        }
        newBanner.setId(optString);
        String optString2 = optJSONObject2.optString("type");
        if (!TextUtils.isEmpty(optString2)) {
            newBanner.setType(optString2);
        }
        if (optJSONObject2.optJSONArray("statistics") != null) {
            C7379e4.m19010b(q1Var, aVar, context).mo50291a(newBanner.getStatHolder(), optJSONObject2, optString, (float) this.f18955a);
        }
        if (!newBanner.getStatHolder().mo49809e()) {
            return null;
        }
        C7664t1 d = C7664t1.m20428d();
        d.mo51568a(newBanner);
        return d;
    }
}
