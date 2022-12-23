package com.fyber.inneractive.sdk.p037d;

import android.app.Application;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveError;
import com.fyber.inneractive.sdk.p046f.C2909a;
import com.fyber.inneractive.sdk.p049h.C2967m;
import com.fyber.inneractive.sdk.p049h.C2968n;
import com.fyber.inneractive.sdk.p051j.C3018e;
import com.fyber.inneractive.sdk.util.C3657l;
import com.fyber.inneractive.sdk.util.C3662m;
import com.fyber.inneractive.sdk.util.C3670q;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.fyber.inneractive.sdk.d.a */
public final class C2815a<T extends C3018e> extends C2909a {

    /* renamed from: a */
    public static final String f6668a = "24";

    /* renamed from: b */
    public static final String f6669b = "1";
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final T f6670d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final InneractiveAdRequest f6671e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final JSONArray f6672f;

    public C2815a(T t, InneractiveAdRequest inneractiveAdRequest, String str, JSONArray jSONArray) {
        super(str);
        this.f6670d = t;
        this.f6671e = inneractiveAdRequest;
        this.f6672f = jSONArray;
    }

    /* renamed from: a */
    public final void mo18091a(final InneractiveError inneractiveError) {
        C3662m.m9138a(new Runnable() {
            public final void run() {
                if (C2815a.this.f6671e != null && C2815a.this.f6670d != null && C2815a.this.f6670d.f7407j != null && C2815a.this.f6670d.f7418u != null) {
                    String str = C2815a.this.f6670d.f7407j;
                    Map<String, String> map = C2815a.this.f6670d.f7418u;
                    String a = IAConfigManager.m5929c().f6586a.mo18048a("max_failed_creatives_interval_hours", C2815a.f6668a);
                    String a2 = IAConfigManager.m5929c().f6586a.mo18048a("max_failed_creatives_per_interval", C2815a.f6669b);
                    int a3 = C3670q.m9151a(a, 24);
                    int a4 = C3670q.m9151a(a2, 1);
                    Application p = C3657l.m9125p();
                    if (p != null) {
                        SharedPreferences sharedPreferences = p.getSharedPreferences("IAConfigPrefs", 0);
                        JSONArray jSONArray = new JSONArray();
                        try {
                            jSONArray = new JSONArray(sharedPreferences.getString("lt", "[]"));
                        } catch (JSONException unused) {
                        }
                        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                        if (C2815a.this.mo18092a() && !C2909a.m6501a(a3, a4, jSONArray, copyOnWriteArrayList)) {
                            copyOnWriteArrayList.add(Long.valueOf(System.currentTimeMillis()));
                            C2815a.m6162a(C2815a.this.f6671e, C2815a.this.f6670d, str, C3670q.m9155a(map), inneractiveError, C2815a.this.f6672f);
                        }
                        sharedPreferences.edit().putString("lt", new JSONArray(copyOnWriteArrayList).toString()).apply();
                    }
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo18092a() {
        return IAConfigManager.m5929c().f6586a.mo18049a(this.f6917c, false);
    }

    /* renamed from: a */
    static /* synthetic */ void m6162a(InneractiveAdRequest inneractiveAdRequest, C3018e eVar, String str, String str2, InneractiveError inneractiveError, JSONArray jSONArray) {
        C2968n.C2969a aVar = new C2968n.C2969a(C2967m.IA_AD_FAILURE_DATA, inneractiveAdRequest, eVar, jSONArray);
        aVar.mo18433a(new C2968n.C2971b().mo18438a("raw_response", str).mo18438a("headers", str2).mo18438a("error_code", inneractiveError.description()));
        aVar.mo18436b((String) null);
    }
}
