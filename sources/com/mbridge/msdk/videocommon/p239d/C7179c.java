package com.mbridge.msdk.videocommon.p239d;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.foundation.p164db.C6148f;
import com.mbridge.msdk.videocommon.p237b.C7169b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.videocommon.d.c */
/* compiled from: RewardUnitSetting */
public final class C7179c {

    /* renamed from: H */
    private static C6148f f17914H;

    /* renamed from: a */
    public static String f17915a;

    /* renamed from: A */
    private int f17916A = 70;

    /* renamed from: B */
    private int f17917B = 0;

    /* renamed from: C */
    private int f17918C = -1;

    /* renamed from: D */
    private int f17919D = -1;

    /* renamed from: E */
    private int f17920E = -1;

    /* renamed from: F */
    private int f17921F;

    /* renamed from: G */
    private int f17922G = 20;

    /* renamed from: I */
    private int f17923I;

    /* renamed from: J */
    private int f17924J = 0;

    /* renamed from: K */
    private int f17925K = 1;

    /* renamed from: L */
    private String f17926L = "";

    /* renamed from: M */
    private int f17927M = 1;

    /* renamed from: N */
    private String f17928N = "";

    /* renamed from: O */
    private int f17929O = 1;

    /* renamed from: P */
    private String f17930P = "Virtual Item";

    /* renamed from: Q */
    private String f17931Q = "";

    /* renamed from: R */
    private int f17932R = 0;

    /* renamed from: b */
    private String f17933b;

    /* renamed from: c */
    private String f17934c;

    /* renamed from: d */
    private List<C7169b> f17935d;

    /* renamed from: e */
    private long f17936e;

    /* renamed from: f */
    private int f17937f = -1;

    /* renamed from: g */
    private int f17938g = 0;

    /* renamed from: h */
    private int f17939h = 0;

    /* renamed from: i */
    private int f17940i = 1;

    /* renamed from: j */
    private int f17941j = 1;

    /* renamed from: k */
    private int f17942k = 1;

    /* renamed from: l */
    private int f17943l = 1;

    /* renamed from: m */
    private int f17944m = 5;

    /* renamed from: n */
    private int f17945n = 1;

    /* renamed from: o */
    private int f17946o = 3;

    /* renamed from: p */
    private int f17947p = 80;

    /* renamed from: q */
    private int f17948q = 100;

    /* renamed from: r */
    private int f17949r = 0;

    /* renamed from: s */
    private double f17950s = 1.0d;

    /* renamed from: t */
    private int f17951t = -1;

    /* renamed from: u */
    private ArrayList<Integer> f17952u;

    /* renamed from: v */
    private int f17953v = 3;

    /* renamed from: w */
    private int f17954w = 1;

    /* renamed from: x */
    private int f17955x = 10;

    /* renamed from: y */
    private int f17956y = 60;

    /* renamed from: z */
    private int f17957z = 0;

    /* renamed from: a */
    public final int mo49118a() {
        return this.f17955x;
    }

    /* renamed from: b */
    public final int mo49123b() {
        return this.f17956y;
    }

    /* renamed from: a */
    public final void mo49121a(ArrayList<Integer> arrayList) {
        this.f17952u = arrayList;
    }

    /* renamed from: c */
    public final int mo49126c() {
        return this.f17957z;
    }

    /* renamed from: a */
    public final void mo49119a(int i) {
        this.f17957z = i;
    }

    /* renamed from: d */
    public final int mo49128d() {
        return this.f17917B;
    }

    /* renamed from: b */
    public final void mo49124b(int i) {
        this.f17917B = i;
    }

    /* renamed from: e */
    public final int mo49130e() {
        return this.f17918C;
    }

    /* renamed from: c */
    public final void mo49127c(int i) {
        this.f17918C = i;
    }

    /* renamed from: f */
    public final int mo49132f() {
        return this.f17919D;
    }

    /* renamed from: d */
    public final void mo49129d(int i) {
        this.f17919D = i;
    }

    /* renamed from: g */
    public final int mo49134g() {
        return this.f17920E;
    }

    /* renamed from: e */
    public final void mo49131e(int i) {
        this.f17920E = i;
    }

    /* renamed from: h */
    public final int mo49136h() {
        return this.f17937f;
    }

    /* renamed from: i */
    public final int mo49138i() {
        return this.f17939h;
    }

    /* renamed from: j */
    public final String mo49140j() {
        return this.f17931Q;
    }

    /* renamed from: k */
    public final int mo49142k() {
        return this.f17927M;
    }

    /* renamed from: w */
    private void m18153w(int i) {
        if (i <= 0) {
            this.f17927M = 1;
        } else {
            this.f17927M = i;
        }
    }

    /* renamed from: l */
    public final String mo49144l() {
        return this.f17930P;
    }

    /* renamed from: d */
    private void m18152d(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f17930P = this.f17926L;
        } else {
            this.f17930P = str;
        }
    }

    /* renamed from: m */
    public final int mo49146m() {
        return this.f17922G;
    }

    /* renamed from: n */
    public final int mo49148n() {
        return this.f17921F;
    }

    /* renamed from: f */
    public final void mo49133f(int i) {
        this.f17921F = i;
    }

    /* renamed from: o */
    public final int mo49150o() {
        return this.f17923I;
    }

    /* renamed from: g */
    public final void mo49135g(int i) {
        this.f17923I = i;
    }

    /* renamed from: h */
    public final void mo49137h(int i) {
        this.f17946o = i;
    }

    /* renamed from: i */
    public final void mo49139i(int i) {
        this.f17947p = i;
    }

    /* renamed from: p */
    public final int mo49152p() {
        return this.f17948q;
    }

    /* renamed from: j */
    public final void mo49141j(int i) {
        this.f17948q = i;
    }

    /* renamed from: q */
    public final int mo49154q() {
        return this.f17949r;
    }

    /* renamed from: k */
    public final void mo49143k(int i) {
        this.f17949r = i;
    }

    /* renamed from: r */
    public final int mo49156r() {
        return this.f17941j;
    }

    /* renamed from: l */
    public final void mo49145l(int i) {
        this.f17941j = i;
    }

    /* renamed from: s */
    public final int mo49158s() {
        return this.f17942k;
    }

    /* renamed from: m */
    public final void mo49147m(int i) {
        this.f17942k = i;
    }

    /* renamed from: n */
    public final void mo49149n(int i) {
        this.f17943l = i;
    }

    /* renamed from: t */
    public final int mo49160t() {
        return this.f17944m;
    }

    /* renamed from: o */
    public final void mo49151o(int i) {
        this.f17944m = i;
    }

    /* renamed from: u */
    public final int mo49162u() {
        return this.f17945n;
    }

    /* renamed from: p */
    public final void mo49153p(int i) {
        this.f17945n = i;
    }

    /* renamed from: q */
    public final void mo49155q(int i) {
        this.f17940i = i;
    }

    /* renamed from: v */
    public final long mo49164v() {
        return this.f17936e;
    }

    /* renamed from: a */
    public final void mo49120a(String str) {
        this.f17933b = str;
    }

    /* renamed from: w */
    public final List<C7169b> mo49166w() {
        return this.f17935d;
    }

    /* renamed from: a */
    public final void mo49122a(List<C7169b> list) {
        this.f17935d = list;
    }

    /* renamed from: x */
    public final double mo49167x() {
        return this.f17950s;
    }

    /* renamed from: y */
    public final int mo49168y() {
        return this.f17954w;
    }

    /* renamed from: r */
    public final void mo49157r(int i) {
        this.f17954w = i;
    }

    /* renamed from: s */
    public final boolean mo49159s(int i) {
        ArrayList<Integer> arrayList = this.f17952u;
        if (arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        return this.f17952u.contains(Integer.valueOf(i));
    }

    /* renamed from: z */
    public final String mo49169z() {
        return this.f17934c;
    }

    /* renamed from: b */
    public final void mo49125b(String str) {
        this.f17934c = str;
    }

    /* renamed from: A */
    public final int mo49114A() {
        return this.f17953v;
    }

    /* renamed from: t */
    public final void mo49161t(int i) {
        this.f17953v = i;
    }

    /* renamed from: B */
    public final Queue<Integer> mo49115B() {
        LinkedList linkedList;
        Exception e;
        try {
            if (this.f17935d == null || this.f17935d.size() <= 0) {
                return null;
            }
            linkedList = new LinkedList();
            int i = 0;
            while (i < this.f17935d.size()) {
                try {
                    linkedList.add(Integer.valueOf(this.f17935d.get(i).mo49081b()));
                    i++;
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    return linkedList;
                }
            }
            return linkedList;
        } catch (Exception e3) {
            Exception exc = e3;
            linkedList = null;
            e = exc;
            e.printStackTrace();
            return linkedList;
        }
    }

    /* renamed from: u */
    public final void mo49163u(int i) {
        this.f17932R = i;
    }

    /* renamed from: c */
    public static C7179c m18151c(String str) {
        JSONObject optJSONObject;
        if (f17914H == null) {
            f17914H = C6148f.m15420a(C6122a.m15302b().mo42895d());
        }
        C7179c cVar = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONArray optJSONArray = jSONObject.optJSONArray("unitSetting");
                if (optJSONArray == null || (optJSONObject = optJSONArray.optJSONObject(0)) == null) {
                    return null;
                }
                String optString = optJSONObject.optString("unitId");
                if (TextUtils.isEmpty(optString)) {
                    return null;
                }
                C7179c cVar2 = new C7179c();
                try {
                    List<C7169b> a = C7169b.m18095a(optJSONObject.optJSONArray("adSourceList"));
                    cVar2.f17933b = optString;
                    cVar2.f17935d = a;
                    cVar2.f17940i = optJSONObject.optInt("callbackType");
                    int optInt = optJSONObject.optInt("aqn", 1);
                    if (optInt <= 0) {
                        optInt = 1;
                    }
                    cVar2.f17941j = optInt;
                    int optInt2 = optJSONObject.optInt("acn", 1);
                    if (optInt2 < 0) {
                        optInt2 = 1;
                    }
                    cVar2.f17942k = optInt2;
                    cVar2.f17943l = optJSONObject.optInt("vcn", 5);
                    cVar2.f17944m = optJSONObject.optInt("offset", 5);
                    cVar2.f17945n = optJSONObject.optInt("dlnet", 1);
                    cVar2.f17923I = optJSONObject.optInt("endscreen_type", 2);
                    int i = 3;
                    cVar2.f17946o = optJSONObject.optInt("tv_start", 3);
                    cVar2.f17947p = optJSONObject.optInt("tv_end", 80);
                    cVar2.f17948q = optJSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100);
                    cVar2.f17949r = optJSONObject.optInt("cd_rate", 0);
                    cVar2.f17936e = jSONObject.optLong("current_time");
                    cVar2.f17957z = optJSONObject.optInt("orientation", 0);
                    cVar2.f17917B = optJSONObject.optInt("daily_play_cap", 0);
                    cVar2.f17918C = optJSONObject.optInt("video_skip_time", -1);
                    cVar2.f17919D = optJSONObject.optInt("video_skip_result", 2);
                    cVar2.f17920E = optJSONObject.optInt("video_interactive_type", -1);
                    cVar2.f17921F = optJSONObject.optInt("close_button_delay", 1);
                    cVar2.f17937f = optJSONObject.optInt("playclosebtn_tm", -1);
                    cVar2.f17938g = optJSONObject.optInt("play_ctdown", 0);
                    cVar2.f17939h = optJSONObject.optInt("close_alert", 0);
                    cVar2.f17922G = optJSONObject.optInt("rdrct", 20);
                    cVar2.f17916A = optJSONObject.optInt("load_global_timeout", 70);
                    cVar2.f17951t = optJSONObject.optInt("rfpv", -1);
                    cVar2.f17950s = optJSONObject.optDouble("vdcmp", 1.0d);
                    f17915a = optJSONObject.optString("atzu");
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("atl_type");
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    if (optJSONArray2 != null) {
                        int i2 = 0;
                        while (i2 < optJSONArray2.length()) {
                            try {
                                arrayList.add(Integer.valueOf(optJSONArray2.getInt(i2)));
                                i2++;
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    } else {
                        arrayList.add(4);
                        arrayList.add(6);
                    }
                    cVar2.f17952u = arrayList;
                    int optInt3 = optJSONObject.optInt("atl_dyt", 0);
                    if (optInt3 > 0) {
                        i = optInt3;
                    }
                    cVar2.f17953v = i;
                    int optInt4 = optJSONObject.optInt("tmorl", 1);
                    if (optInt4 > 2 || optInt4 <= 0) {
                        optInt4 = 1;
                    }
                    cVar2.f17954w = optInt4;
                    cVar2.f17934c = optJSONObject.optString("placementid");
                    cVar2.f17955x = optJSONObject.optInt("ltafemty", 10);
                    cVar2.f17956y = optJSONObject.optInt("ltorwc", 60);
                    cVar2.f17931Q = optJSONObject.optString("ab_id");
                    cVar2.f17924J = optJSONObject.optInt(RewardPlus.AMOUNT_MAX, 0);
                    cVar2.f17925K = optJSONObject.optInt(RewardPlus.CALLBACK_RULE, 1);
                    cVar2.f17926L = optJSONObject.optString(RewardPlus.VIRTUAL_CURRENCY, "");
                    cVar2.m18153w(optJSONObject.optInt("amount", 1));
                    cVar2.f17928N = optJSONObject.optString(RewardPlus.ICON, "");
                    cVar2.f17929O = optJSONObject.optInt("currency_id", 1);
                    cVar2.m18152d(optJSONObject.optString("name", "Virtual Item"));
                    return cVar2;
                } catch (Exception e2) {
                    e = e2;
                    cVar = cVar2;
                    e.printStackTrace();
                    return cVar;
                }
            } catch (Exception e3) {
                e = e3;
                e.printStackTrace();
                return cVar;
            }
        }
        return cVar;
    }

    /* renamed from: C */
    public final JSONObject mo49116C() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("unitId", this.f17933b);
            jSONObject.put("callbackType", this.f17940i);
            if (this.f17935d != null && this.f17935d.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (C7169b next : this.f17935d) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", next.mo49080a());
                    jSONObject2.put("timeout", next.mo49081b());
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            jSONObject.put("aqn", this.f17941j);
            jSONObject.put("acn", this.f17942k);
            jSONObject.put("vcn", this.f17943l);
            jSONObject.put("offset", this.f17944m);
            jSONObject.put("dlnet", this.f17945n);
            jSONObject.put("tv_start", this.f17946o);
            jSONObject.put("tv_end", this.f17947p);
            jSONObject.put(CampaignEx.JSON_KEY_READY_RATE, this.f17948q);
            jSONObject.put("endscreen_type", this.f17923I);
            jSONObject.put("daily_play_cap", this.f17917B);
            jSONObject.put("video_skip_time", this.f17918C);
            jSONObject.put("video_skip_result", this.f17919D);
            jSONObject.put("video_interactive_type", this.f17920E);
            jSONObject.put("orientation", this.f17957z);
            jSONObject.put("close_button_delay", this.f17921F);
            jSONObject.put("playclosebtn_tm", this.f17937f);
            jSONObject.put("play_ctdown", this.f17938g);
            jSONObject.put("close_alert", this.f17939h);
            jSONObject.put("rfpv", this.f17951t);
            jSONObject.put("vdcmp", this.f17950s);
            JSONArray jSONArray2 = new JSONArray();
            if (this.f17952u != null) {
                if (this.f17952u.size() > 0) {
                    Iterator<Integer> it = this.f17952u.iterator();
                    while (it.hasNext()) {
                        jSONArray2.put(it.next());
                    }
                }
                jSONObject.put("atl_type", jSONArray2);
            }
            jSONObject.put("atl_dyt", this.f17953v);
            jSONObject.put("tmorl", this.f17954w);
            jSONObject.put("placementid", this.f17934c);
            jSONObject.put("ltafemty", this.f17955x);
            jSONObject.put("ltorwc", this.f17956y);
            jSONObject.put(RewardPlus.AMOUNT_MAX, this.f17924J);
            jSONObject.put(RewardPlus.CALLBACK_RULE, this.f17925K);
            jSONObject.put(RewardPlus.VIRTUAL_CURRENCY, this.f17926L);
            jSONObject.put("amount", this.f17927M);
            jSONObject.put(RewardPlus.ICON, this.f17928N);
            jSONObject.put("currency_id", this.f17929O);
            jSONObject.put("name", this.f17930P);
            jSONObject.put("isDefault", this.f17932R);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static C7179c m18150a(JSONObject jSONObject) {
        C7179c cVar = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            C7179c cVar2 = new C7179c();
            try {
                cVar2.f17935d = C7169b.m18095a(jSONObject.optJSONArray("adSourceList"));
                cVar2.f17940i = jSONObject.optInt("callbackType");
                int optInt = jSONObject.optInt("aqn", 1);
                if (optInt <= 0) {
                    optInt = 1;
                }
                cVar2.f17941j = optInt;
                int optInt2 = jSONObject.optInt("acn", 1);
                if (optInt2 < 0) {
                    optInt2 = 1;
                }
                cVar2.f17942k = optInt2;
                cVar2.f17943l = jSONObject.optInt("vcn", 5);
                cVar2.f17944m = jSONObject.optInt("offset", 5);
                cVar2.f17945n = jSONObject.optInt("dlnet", 2);
                cVar2.f17923I = jSONObject.optInt("endscreen_type", 2);
                cVar2.f17946o = jSONObject.optInt("tv_start", 3);
                cVar2.f17947p = jSONObject.optInt("tv_end", 80);
                cVar2.f17948q = jSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100);
                cVar2.f17936e = jSONObject.optLong("current_time");
                cVar2.f17957z = jSONObject.optInt("orientation", 0);
                cVar2.f17917B = jSONObject.optInt("daily_play_cap", 0);
                cVar2.f17918C = jSONObject.optInt("video_skip_time", -1);
                cVar2.f17919D = jSONObject.optInt("video_skip_result", 2);
                cVar2.f17920E = jSONObject.optInt("video_interactive_type", -1);
                cVar2.f17921F = jSONObject.optInt("close_button_delay", 1);
                cVar2.f17937f = jSONObject.optInt("playclosebtn_tm", -1);
                cVar2.f17938g = jSONObject.optInt("play_ctdown", 0);
                cVar2.f17939h = jSONObject.optInt("close_alert", 0);
                cVar2.f17922G = jSONObject.optInt("rdrct", 20);
                cVar2.f17951t = jSONObject.optInt("rfpv", -1);
                cVar2.f17950s = jSONObject.optDouble("vdcmp", 1.0d);
                cVar2.f17916A = jSONObject.optInt("load_global_timeout", 70);
                JSONArray optJSONArray = jSONObject.optJSONArray("atl_type");
                ArrayList<Integer> arrayList = new ArrayList<>();
                if (optJSONArray != null) {
                    int i = 0;
                    while (i < optJSONArray.length()) {
                        try {
                            arrayList.add(Integer.valueOf(optJSONArray.getInt(i)));
                            i++;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } else {
                    arrayList.add(4);
                    arrayList.add(6);
                }
                cVar2.f17952u = arrayList;
                cVar2.f17953v = jSONObject.optInt("atl_dyt", 3);
                int optInt3 = jSONObject.optInt("tmorl", 1);
                if (optInt3 > 2 || optInt3 <= 0) {
                    optInt3 = 1;
                }
                cVar2.f17954w = optInt3;
                cVar2.f17934c = jSONObject.optString("placementid");
                cVar2.f17955x = jSONObject.optInt("ltafemty", 10);
                cVar2.f17956y = jSONObject.optInt("ltorwc", 60);
                cVar2.f17931Q = jSONObject.optString("ab_id");
                cVar2.f17924J = jSONObject.optInt(RewardPlus.AMOUNT_MAX, 0);
                cVar2.f17925K = jSONObject.optInt(RewardPlus.CALLBACK_RULE, 1);
                cVar2.f17926L = jSONObject.optString(RewardPlus.VIRTUAL_CURRENCY, "");
                cVar2.m18153w(jSONObject.optInt("amount", 1));
                cVar2.f17928N = jSONObject.optString(RewardPlus.ICON, "");
                cVar2.f17929O = jSONObject.optInt("currency_id", 1);
                cVar2.m18152d(jSONObject.optString("name", "Virtual Item"));
                return cVar2;
            } catch (Exception e2) {
                e = e2;
                cVar = cVar2;
                e.printStackTrace();
                return cVar;
            }
        } catch (Exception e3) {
            e = e3;
            e.printStackTrace();
            return cVar;
        }
    }

    /* renamed from: D */
    public final int mo49117D() {
        return this.f17916A;
    }

    /* renamed from: v */
    public final void mo49165v(int i) {
        this.f17916A = i;
    }
}
