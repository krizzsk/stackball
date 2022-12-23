package com.applovin.impl.mediation.p021c;

import android.app.Activity;
import com.applovin.impl.mediation.p020b.C1227e;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.p025b.C1371e;
import com.applovin.impl.sdk.p026c.C1387g;
import com.applovin.impl.sdk.p027d.C1392a;
import com.applovin.impl.sdk.utils.C1521i;
import com.applovin.impl.sdk.utils.C1553o;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.c.a */
public class C1234a extends C1392a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Activity f2379a;

    public C1234a(Activity activity, C1469j jVar) {
        super("TaskAutoInitAdapters", jVar, true);
        this.f2379a = activity;
    }

    /* renamed from: a */
    private List<C1227e> m2138a(JSONArray jSONArray, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(new C1227e(C1521i.m3474a(jSONArray, i, (JSONObject) null, this.f3279b), jSONObject, this.f3279b));
        }
        return arrayList;
    }

    public void run() {
        String str;
        String str2 = (String) this.f3279b.mo13089a(C1371e.f3173y);
        if (C1553o.m3554b(str2)) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                List<C1227e> a = m2138a(C1521i.m3491b(jSONObject, this.f3279b.mo13111ah() ? "test_mode_auto_init_adapters" : "auto_init_adapters", new JSONArray(), this.f3279b), jSONObject);
                if (a.size() > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Auto-initing ");
                    sb.append(a.size());
                    sb.append(" adapters");
                    sb.append(this.f3279b.mo13111ah() ? " in test mode" : "");
                    sb.append("...");
                    mo12944a(sb.toString());
                    this.f3279b.mo13118c("max");
                    if (this.f2379a == null) {
                        C1505q.m3345i("AppLovinSdk", "\n**********\nFailed to initialize 3rd-party SDKs. Please make sure to initialize the AppLovin SDK with an Activity context.\n**********\n");
                        this.f3279b.mo13072L().mo12931b(C1387g.f3263p, 1);
                        return;
                    }
                    for (final C1227e next : a) {
                        this.f3279b.mo13071K().mo13018b().execute(new Runnable() {
                            public void run() {
                                C1234a aVar = C1234a.this;
                                aVar.mo12944a("Auto-initing adapter: " + next);
                                C1234a.this.f3279b.mo13141x().mo12409a(next, C1234a.this.f2379a);
                            }
                        });
                    }
                }
            } catch (JSONException e) {
                th = e;
                str = "Failed to parse auto-init adapters JSON";
                mo12945a(str, th);
            } catch (Throwable th) {
                th = th;
                str = "Failed to auto-init adapters";
                mo12945a(str, th);
            }
        }
    }
}
