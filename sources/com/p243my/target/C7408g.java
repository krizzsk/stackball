package com.p243my.target;

import android.content.Context;
import com.p243my.target.C7524l3;
import com.p243my.target.common.models.VideoData;
import com.yandex.mobile.ads.instream.InstreamAdBreakType;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.g */
public class C7408g extends C7337c<C7632r2> {
    /* renamed from: a */
    public static C7337c<C7632r2> m19150a() {
        return new C7408g();
    }

    /* renamed from: a */
    public static C7632r2 m19151a(String str, C7617q1 q1Var, C7632r2 r2Var, C7298a aVar) {
        C7455i4 a = C7455i4.m19333a(aVar, q1Var);
        a.mo50381c(str);
        String o = q1Var.mo51404o();
        if (o == null) {
            o = InstreamAdBreakType.PREROLL;
        }
        if (r2Var == null) {
            r2Var = C7632r2.m20230e();
        }
        C7686u2<VideoData> a2 = r2Var.mo51445a(o);
        if (a2 == null) {
            return r2Var;
        }
        if (!a.mo50380c().isEmpty()) {
            m19153a(a, a2, q1Var);
        } else {
            C7617q1 d = a.mo50385d();
            if (d != null) {
                d.mo51389d(a2.mo51662h());
                int u = q1Var.mo51410u();
                if (u < 0) {
                    u = a2.mo51416a();
                }
                d.mo51381c(u);
                a2.mo51654a(d);
            }
        }
        return r2Var;
    }

    /* renamed from: a */
    public static C7632r2 m19152a(String str, C7617q1 q1Var, C7632r2 r2Var, C7298a aVar, C7524l3.C7525a aVar2, Context context, C7524l3 l3Var) {
        JSONObject optJSONObject;
        JSONObject a = C7337c.m18819a(str, aVar2, l3Var);
        if (a == null || (optJSONObject = a.optJSONObject(aVar.getFormat())) == null) {
            return r2Var;
        }
        if (r2Var == null) {
            r2Var = C7632r2.m20230e();
        }
        C7687u3.m20568a().mo51665a(optJSONObject, r2Var);
        C7619q3 a2 = C7619q3.m20188a(q1Var, aVar, context);
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("sections");
        if (optJSONObject2 != null) {
            String o = q1Var.mo51404o();
            if (o != null) {
                C7686u2<VideoData> a3 = r2Var.mo51445a(o);
                if (a3 != null) {
                    m19156a(optJSONObject2, a2, a3, C7666t3.m20436a(q1Var, aVar, context), q1Var);
                }
            } else {
                Iterator<C7686u2<VideoData>> it = r2Var.mo51446c().iterator();
                while (it.hasNext()) {
                    m19156a(optJSONObject2, a2, it.next(), C7666t3.m20436a(q1Var, aVar, context), q1Var);
                }
            }
        }
        return r2Var;
    }

    /* renamed from: a */
    public static void m19153a(C7455i4<VideoData> i4Var, C7686u2<VideoData> u2Var, C7617q1 q1Var) {
        int u = q1Var.mo51410u();
        Iterator<C7413g2<VideoData>> it = i4Var.mo50380c().iterator();
        while (it.hasNext()) {
            C7413g2 next = it.next();
            Boolean a = q1Var.mo51362a();
            if (a != null) {
                next.setAllowClose(a.booleanValue());
            }
            Boolean c = q1Var.mo51379c();
            if (c != null) {
                next.setAllowPause(c.booleanValue());
            }
            Boolean k = q1Var.mo51400k();
            if (k != null) {
                next.setDirectLink(k.booleanValue());
            }
            Boolean r = q1Var.mo51407r();
            if (r != null) {
                next.setOpenInBrowser(r.booleanValue());
            }
            Boolean d = q1Var.mo51386d();
            if (d != null) {
                next.setAllowReplay(d.booleanValue());
            }
            float b = q1Var.mo51372b();
            if (b >= 0.0f) {
                next.setAllowCloseDelay(b);
            }
            next.setCloseActionText("Close");
            next.setPoint(q1Var.mo51408s());
            next.setPointP(q1Var.mo51409t());
            if (u >= 0) {
                u2Var.mo51653a(next, u);
                u++;
            } else {
                u2Var.mo51652a((C7413g2<VideoData>) next);
            }
        }
    }

    /* renamed from: a */
    public static void m19154a(C7617q1 q1Var, C7619q3 q3Var, JSONObject jSONObject, C7686u2 u2Var, ArrayList<C7617q1> arrayList, ArrayList<C7617q1> arrayList2) {
        C7617q1 a = q3Var.mo51420a(jSONObject);
        if (a != null) {
            a.mo51389d(u2Var.mo51662h());
            if (a.mo51401l() != -1) {
                arrayList2.add(a);
                return;
            }
            arrayList.add(a);
            if (!a.mo51415z() && !a.mo51414y()) {
                q1Var.mo51368a(a);
                int u = q1Var.mo51410u();
                if (u < 0) {
                    u = u2Var.mo51416a();
                }
                a.mo51381c(u);
            }
            u2Var.mo51654a(a);
        }
    }

    /* renamed from: a */
    public static void m19155a(ArrayList<C7617q1> arrayList, ArrayList<C7617q1> arrayList2) {
        Iterator<C7617q1> it = arrayList2.iterator();
        while (it.hasNext()) {
            C7617q1 next = it.next();
            Iterator<C7617q1> it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C7617q1 next2 = it2.next();
                if (next.mo51401l() == next2.mo51402m()) {
                    next2.mo51375b(next);
                    break;
                }
            }
        }
    }

    /* renamed from: a */
    public static void m19156a(JSONObject jSONObject, C7619q3 q3Var, C7686u2<VideoData> u2Var, C7666t3 t3Var, C7617q1 q1Var) {
        JSONArray optJSONArray = jSONObject.optJSONArray(u2Var.mo51662h());
        if (optJSONArray != null) {
            int u = q1Var.mo51410u();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    if ("additionalData".equals(optJSONObject.optString("type"))) {
                        m19154a(q1Var, q3Var, optJSONObject, u2Var, arrayList2, arrayList);
                    } else {
                        C7413g2<VideoData> newVideoBanner = C7413g2.newVideoBanner();
                        if (t3Var.mo51576c(optJSONObject, newVideoBanner)) {
                            float s = q1Var.mo51408s();
                            if (s >= 0.0f) {
                                newVideoBanner.setPoint(s);
                            }
                            float t = q1Var.mo51409t();
                            if (t >= 0.0f) {
                                newVideoBanner.setPointP(t);
                            }
                            if (u >= 0) {
                                u2Var.mo51653a(newVideoBanner, u);
                                u++;
                            } else {
                                u2Var.mo51652a(newVideoBanner);
                            }
                        }
                    }
                }
            }
            m19155a(arrayList2, arrayList);
        }
    }

    /* renamed from: a */
    public C7632r2 mo49776a(String str, C7617q1 q1Var, C7632r2 r2Var, C7298a aVar, C7524l3.C7525a aVar2, C7524l3 l3Var, Context context) {
        return C7337c.isVast(str) ? m19151a(str, q1Var, r2Var, aVar) : m19152a(str, q1Var, r2Var, aVar, aVar2, context, l3Var);
    }
}
