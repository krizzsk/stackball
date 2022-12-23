package com.p243my.target;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.my.target.e4 */
public class C7379e4 extends C7437h4 {
    public C7379e4(C7617q1 q1Var, C7298a aVar, Context context) {
        super(q1Var, aVar, context);
    }

    /* renamed from: b */
    public static C7379e4 m19010b(C7617q1 q1Var, C7298a aVar, Context context) {
        return new C7379e4(q1Var, aVar, context);
    }

    /* renamed from: a */
    public C7328b3 mo50069a(JSONObject jSONObject, float f) {
        String optString = jSONObject.optString("type");
        String optString2 = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            mo50293a("Required field", "failed to parse stat: no type or url");
            return null;
        }
        optString.hashCode();
        char c = 65535;
        int hashCode = optString.hashCode();
        if (hashCode != -1053159584) {
            if (hashCode != 1669348544) {
                if (hashCode == 1788134515 && optString.equals("playheadReachedValue")) {
                    c = 2;
                }
            } else if (optString.equals("playheadViewabilityValue")) {
                c = 1;
            }
        } else if (optString.equals("playheadTimerValue")) {
            c = 0;
        }
        if (c == 0) {
            return mo50070a(jSONObject, optString2);
        }
        if (c == 1) {
            return mo50071b(jSONObject, optString2);
        }
        if (c != 2) {
            return super.mo50069a(jSONObject, f);
        }
        C7303a3 a = super.mo50290a(jSONObject, optString2, f);
        if (a == null || a.mo49575e() < 0.0f) {
            return null;
        }
        return a;
    }

    /* renamed from: a */
    public final C7328b3 mo50070a(JSONObject jSONObject, String str) {
        if (!str.contains("[CONTENTPLAYHEAD]")) {
            mo50293a("Required field", "failed to parse researchTimerStat: no [CONTENTPLAYHEAD] macros");
            return null;
        }
        int optInt = jSONObject.optInt("startTimer", 0);
        int optInt2 = jSONObject.optInt("endTimer", 0);
        if (optInt < 0) {
            mo50293a("Bad value", "failed to parse researchTimerStat: wrong start timer " + optInt);
            return null;
        } else if (optInt2 < 0) {
            mo50293a("Bad value", "failed to parse researchTimerStat: wrong end timer " + optInt);
            return null;
        } else if (optInt2 == 0 || optInt < optInt2) {
            C7717w1 a = C7717w1.m20714a(str);
            a.mo51765b(jSONObject.optInt("rate", 1));
            a.mo51766c(optInt);
            a.mo51764a(optInt2);
            return a;
        } else {
            mo50293a("Bad value", "failed to parse researchTimerStat: start timer (" + optInt + ") cannot be less than end timer (" + optInt + ")");
            return null;
        }
    }

    /* renamed from: b */
    public final C7328b3 mo50071b(JSONObject jSONObject, String str) {
        String str2;
        StringBuilder sb;
        String str3;
        int optInt = jSONObject.optInt("viewablePercent", -1);
        if (optInt < 0 || optInt > 100) {
            str2 = "failed to parse viewabilityStat: invalid viewable percent value";
        } else {
            int optInt2 = jSONObject.optInt("duration", -1);
            if (optInt2 < 0) {
                return null;
            }
            int optInt3 = jSONObject.optInt("startTimer", 0);
            int optInt4 = jSONObject.optInt("endTimer", 0);
            if (optInt3 < 0) {
                sb = new StringBuilder();
                str3 = "failed to parse viewabilityStat: wrong start timer ";
            } else if (optInt4 < 0) {
                sb = new StringBuilder();
                str3 = "failed to parse viewabilityStat: wrong end timer ";
            } else if (optInt4 == 0 || optInt3 < optInt4) {
                C7730x1 b = C7730x1.m20791b(str, (float) optInt2, optInt, jSONObject.optBoolean("mrc", true));
                b.mo51818b(optInt3);
                b.mo51817a(optInt4);
                return b;
            } else {
                sb = new StringBuilder();
                sb.append("failed to parse viewabilityStat: start timer (");
                sb.append(optInt3);
                sb.append(") cannot be less than end timer (");
                sb.append(optInt4);
                sb.append(")");
                str2 = sb.toString();
            }
            sb.append(str3);
            sb.append(optInt3);
            str2 = sb.toString();
        }
        mo50293a("Bad value", str2);
        return null;
    }
}
