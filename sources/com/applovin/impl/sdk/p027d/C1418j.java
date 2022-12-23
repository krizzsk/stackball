package com.applovin.impl.sdk.p027d;

import android.text.TextUtils;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.network.C1499g;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p027d.C1435s;
import com.applovin.impl.sdk.utils.C1520h;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.d.j */
public class C1418j extends C1392a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1499g f3316a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final AppLovinPostbackListener f3317c;

    /* renamed from: d */
    private final C1435s.C1437a f3318d;

    public C1418j(C1499g gVar, C1435s.C1437a aVar, C1469j jVar, AppLovinPostbackListener appLovinPostbackListener) {
        super("TaskDispatchPostback", jVar);
        if (gVar != null) {
            this.f3316a = gVar;
            this.f3317c = appLovinPostbackListener;
            this.f3318d = aVar;
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }

    public void run() {
        final String a = this.f3316a.mo13178a();
        if (!C1553o.m3554b(a)) {
            mo12946b("Requested URL is not valid; nothing to do...");
            AppLovinPostbackListener appLovinPostbackListener = this.f3317c;
            if (appLovinPostbackListener != null) {
                appLovinPostbackListener.onPostbackFailure(a, AppLovinErrorCodes.INVALID_URL);
                return;
            }
            return;
        }
        C14191 r1 = new C1449y<Object>(this.f3316a, mo12948d()) {
            /* renamed from: a */
            public void mo12144a(int i) {
                mo12949d("Failed to dispatch postback. Error code: " + i + " URL: " + a);
                if (C1418j.this.f3317c != null) {
                    C1418j.this.f3317c.onPostbackFailure(a, i);
                }
                if (C1418j.this.f3316a.mo13241o()) {
                    this.f3279b.mo13105ab().mo13046a(C1418j.this.f3316a.mo13242p(), C1418j.this.f3316a.mo13178a(), i, (Object) null);
                }
            }

            /* renamed from: a */
            public void mo12145a(Object obj, int i) {
                if (((Boolean) this.f3279b.mo13088a(C1369c.f3089eW)).booleanValue()) {
                    if (obj instanceof JSONObject) {
                        JSONObject jSONObject = (JSONObject) obj;
                        Iterator<String> it = this.f3279b.mo13114b((C1369c) C1369c.f2865aH).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (C1418j.this.f3316a.mo13178a().startsWith(it.next())) {
                                C1520h.m3450d(jSONObject, this.f3279b);
                                C1520h.m3449c(jSONObject, this.f3279b);
                                break;
                            }
                        }
                    }
                } else if (obj instanceof String) {
                    for (String startsWith : this.f3279b.mo13114b((C1369c) C1369c.f2865aH)) {
                        if (C1418j.this.f3316a.mo13178a().startsWith(startsWith)) {
                            String str = (String) obj;
                            if (!TextUtils.isEmpty(str)) {
                                try {
                                    JSONObject jSONObject2 = new JSONObject(str);
                                    C1520h.m3450d(jSONObject2, this.f3279b);
                                    C1520h.m3449c(jSONObject2, this.f3279b);
                                    break;
                                } catch (JSONException unused) {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                if (C1418j.this.f3317c != null) {
                    C1418j.this.f3317c.onPostbackSuccess(a);
                }
                if (C1418j.this.f3316a.mo13241o()) {
                    this.f3279b.mo13105ab().mo13046a(C1418j.this.f3316a.mo13242p(), C1418j.this.f3316a.mo13178a(), i, obj);
                }
            }
        };
        r1.mo13036a(this.f3318d);
        mo12948d().mo13071K().mo13013a((C1392a) r1);
    }
}
