package com.p243my.target;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.internal.NativeProtocol;
import com.p243my.tracker.ads.AdFormat;
import com.vungle.warren.model.ReportDBAdapter;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.z3 */
public class C7770z3 {

    /* renamed from: a */
    public final C7771a f19750a;

    /* renamed from: b */
    public final C7617q1 f19751b;

    /* renamed from: c */
    public final C7298a f19752c;

    /* renamed from: d */
    public final Context f19753d;

    /* renamed from: e */
    public final C7437h4 f19754e;

    /* renamed from: com.my.target.z3$a */
    public interface C7771a {
        /* renamed from: a */
        C7618q2 mo49777a(JSONObject jSONObject, C7617q1 q1Var, C7298a aVar, Context context);
    }

    public C7770z3(C7771a aVar, C7617q1 q1Var, C7298a aVar2, Context context) {
        this.f19750a = aVar;
        this.f19751b = q1Var;
        this.f19752c = aVar2;
        this.f19753d = context;
        this.f19754e = C7437h4.m19248a(q1Var, aVar2, context);
    }

    /* renamed from: a */
    public static C7770z3 m20982a(C7771a aVar, C7617q1 q1Var, C7298a aVar2, Context context) {
        return new C7770z3(aVar, q1Var, aVar2, context);
    }

    /* renamed from: a */
    public final C7560n2 mo51985a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        StringBuilder sb;
        String str;
        String sb2;
        String optString = jSONObject.optString("name");
        if (TextUtils.isEmpty(optString)) {
            sb2 = "no name in mediationAdNetwork";
        } else {
            String optString2 = jSONObject.optString(ReportDBAdapter.ReportColumns.COLUMN_PLACEMENT_ID);
            if (TextUtils.isEmpty(optString2)) {
                sb = new StringBuilder();
                str = "no placementId for ";
            } else {
                String optString3 = jSONObject.optString("adapter");
                if (TextUtils.isEmpty(optString3)) {
                    sb = new StringBuilder();
                    str = "no adapter for ";
                } else {
                    C7560n2 a = C7560n2.m19906a(optString, optString2, optString3);
                    if ("myTarget".equals(optString) && (optJSONObject = jSONObject.optJSONObject(AdFormat.BANNER)) != null) {
                        a.mo50963a(this.f19750a.mo49777a(optJSONObject, this.f19751b, this.f19752c, this.f19753d));
                    }
                    String optString4 = jSONObject.optString("payload");
                    if (!TextUtils.isEmpty(optString4)) {
                        a.mo50964a(optString4);
                    }
                    int optInt = jSONObject.optInt("timeout", a.mo50973i());
                    if (optInt > 0) {
                        a.mo50962a(optInt);
                    } else {
                        mo51986a("Bad value", "timeout <= 0 for " + optString + " mediationAdNetwork");
                    }
                    a.mo50961a((float) jSONObject.optDouble("priority", (double) a.mo50970f()));
                    JSONObject optJSONObject2 = jSONObject.optJSONObject(NativeProtocol.WEB_DIALOG_PARAMS);
                    if (optJSONObject2 != null) {
                        Iterator<String> keys = optJSONObject2.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            if (!TextUtils.isEmpty(next)) {
                                a.mo50965a(next, optJSONObject2.optString(next));
                            }
                        }
                    }
                    this.f19754e.mo50291a(a.mo50972h(), jSONObject, optString, -1.0f);
                    return a;
                }
            }
            sb.append(str);
            sb.append(optString);
            sb.append(" mediationAdNetwork");
            sb2 = sb.toString();
        }
        mo51986a("Required field", sb2);
        return null;
    }

    /* renamed from: a */
    public final void mo51986a(String str, String str2) {
        String str3 = this.f19751b.f19226a;
        C7498k3 a = C7498k3.m19572a(str).mo50704d(str2).mo50699a(this.f19752c.getSlotId());
        if (str3 == null) {
            str3 = this.f19751b.f19227b;
        }
        a.mo50701b(str3).mo50702b(this.f19753d);
    }

    /* renamed from: b */
    public C7541m2 mo51987b(JSONObject jSONObject) {
        C7560n2 a;
        JSONArray optJSONArray = jSONObject.optJSONArray("networks");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return null;
        }
        C7541m2 c = C7541m2.m19763c();
        int optInt = jSONObject.optInt("refreshTimeout", c.mo50845a());
        if (optInt >= 0) {
            c.mo50846a(optInt);
        } else {
            mo51986a("Bad value", "refreshTimeout < 0");
        }
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (!(optJSONObject == null || (a = mo51985a(optJSONObject)) == null)) {
                c.mo50847a(a);
            }
        }
        if (c.mo50848b()) {
            return c;
        }
        return null;
    }
}
