package com.p243my.target;

import android.content.Context;
import com.p243my.target.C7524l3;
import com.p243my.target.C7770z3;
import com.p243my.target.common.models.VideoData;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.p */
public class C7592p extends C7337c<C7665t2> implements C7770z3.C7771a {

    /* renamed from: a */
    public String f19162a;

    /* renamed from: a */
    public static C7337c<C7665t2> m20043a() {
        return new C7592p();
    }

    /* renamed from: b */
    public static void m20044b(JSONObject jSONObject, C7617q1 q1Var, C7298a aVar, Context context) {
        C7617q1 a = C7619q3.m20188a(q1Var, aVar, context).mo51420a(jSONObject);
        if (a != null) {
            q1Var.mo51368a(a);
        }
    }

    /* renamed from: a */
    public C7618q2 mo49777a(JSONObject jSONObject, C7617q1 q1Var, C7298a aVar, Context context) {
        C7327b2 a = C7719w3.m20744a(q1Var, aVar, context).mo51791a(jSONObject, this.f19162a);
        if (a == null) {
            return null;
        }
        C7665t2 d = C7665t2.m20432d();
        d.mo51570a(a);
        return d;
    }

    /* renamed from: a */
    public final C7665t2 mo51308a(C7665t2 t2Var, C7455i4<VideoData> i4Var, C7617q1 q1Var) {
        if (t2Var == null) {
            t2Var = C7665t2.m20432d();
        }
        C7413g2 g2Var = i4Var.mo50380c().get(0);
        C7399f2 newBanner = C7399f2.newBanner();
        newBanner.setCtaText(g2Var.getCtaText());
        newBanner.setVideoBanner(g2Var);
        newBanner.setStyle(1);
        newBanner.setTrackingLink(g2Var.getTrackingLink());
        Boolean a = q1Var.mo51362a();
        if (a != null) {
            g2Var.setAllowClose(a.booleanValue());
        }
        Boolean c = q1Var.mo51379c();
        if (c != null) {
            g2Var.setAllowPause(c.booleanValue());
        }
        Boolean d = q1Var.mo51386d();
        if (d != null) {
            g2Var.setAllowReplay(d.booleanValue());
        }
        Boolean k = q1Var.mo51400k();
        if (k != null) {
            newBanner.setDirectLink(k.booleanValue());
        }
        Boolean r = q1Var.mo51407r();
        if (r != null) {
            newBanner.setOpenInBrowser(r.booleanValue());
        }
        float b = q1Var.mo51372b();
        if (b >= 0.0f) {
            g2Var.setAllowCloseDelay(b);
        }
        for (C7328b3 a2 : g2Var.getStatHolder().mo49800a("click")) {
            newBanner.getStatHolder().mo49801a(a2);
        }
        t2Var.mo51570a(newBanner);
        if (newBanner.getOmData() == null) {
            newBanner.setOmData(g2Var.getOmData());
        }
        Iterator<C7302a2> it = g2Var.getCompanionBanners().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C7302a2 next = it.next();
            C7327b2 b2Var = null;
            if (next.getHtmlResource() != null) {
                b2Var = C7359d2.fromCompanion(next);
                continue;
            } else if (next.getStaticResource() != null) {
                b2Var = C7377e2.fromCompanion(next);
                continue;
            } else {
                continue;
            }
            if (b2Var != null) {
                newBanner.setEndCard(b2Var);
                break;
            }
        }
        return t2Var;
    }

    /* renamed from: a */
    public final C7665t2 mo51309a(String str, C7617q1 q1Var, C7298a aVar, C7524l3.C7525a aVar2, C7524l3 l3Var, C7665t2 t2Var, Context context) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        C7541m2 b;
        JSONObject a = C7337c.m18819a(str, aVar2, l3Var);
        if (a == null) {
            return t2Var;
        }
        if (t2Var == null) {
            t2Var = C7665t2.m20432d();
        }
        this.f19162a = a.optString("mraid.js");
        JSONObject a2 = mo51312a(a, aVar.getFormat());
        if (a2 == null) {
            if (!(!aVar.isMediationEnabled() || (optJSONObject2 = a.optJSONObject("mediation")) == null || (b = C7770z3.m20982a(this, q1Var, aVar, context).mo51987b(optJSONObject2)) == null)) {
                t2Var.mo51417a(b);
            }
            return t2Var;
        }
        JSONArray optJSONArray = a2.optJSONArray("banners");
        if (!(optJSONArray == null || optJSONArray.length() <= 0 || (optJSONObject = optJSONArray.optJSONObject(0)) == null)) {
            if ("additionalData".equals(optJSONObject.optString("type", ""))) {
                m20044b(optJSONObject, q1Var, aVar, context);
            } else {
                C7327b2 a3 = C7719w3.m20744a(q1Var, aVar, context).mo51791a(optJSONObject, this.f19162a);
                if (a3 != null) {
                    t2Var.mo51570a(a3);
                }
            }
        }
        return t2Var;
    }

    /* renamed from: a */
    public final C7665t2 mo51310a(String str, C7617q1 q1Var, C7298a aVar, C7665t2 t2Var) {
        C7455i4 a = C7455i4.m19333a(aVar, q1Var);
        a.mo50381c(str);
        return !a.mo50380c().isEmpty() ? mo51308a(t2Var, a, q1Var) : t2Var;
    }

    /* renamed from: a */
    public C7665t2 mo49776a(String str, C7617q1 q1Var, C7665t2 t2Var, C7298a aVar, C7524l3.C7525a aVar2, C7524l3 l3Var, Context context) {
        return C7337c.isVast(str) ? mo51310a(str, q1Var, aVar, t2Var) : mo51309a(str, q1Var, aVar, aVar2, l3Var, t2Var, context);
    }

    /* renamed from: a */
    public final JSONObject mo51312a(JSONObject jSONObject, String str) {
        if (!"fullscreen".equals(str) && !"rewarded".equals(str)) {
            return jSONObject.optJSONObject(str);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("fullscreen");
        return optJSONObject != null ? optJSONObject : jSONObject.optJSONObject("rewarded");
    }
}
