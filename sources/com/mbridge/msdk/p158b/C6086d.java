package com.mbridge.msdk.p158b;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.warren.model.AdvertisementDBAdapter;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.b.d */
/* compiled from: UnitSetting */
public final class C6086d {

    /* renamed from: A */
    private int f14971A;

    /* renamed from: B */
    private int f14972B;

    /* renamed from: C */
    private int f14973C;

    /* renamed from: D */
    private String f14974D = "";

    /* renamed from: E */
    private int f14975E = 10;

    /* renamed from: F */
    private int f14976F = 60;

    /* renamed from: G */
    private String f14977G = "";

    /* renamed from: H */
    private int f14978H = 1;

    /* renamed from: I */
    private int f14979I = 100;

    /* renamed from: J */
    private int f14980J = 0;

    /* renamed from: K */
    private int f14981K;

    /* renamed from: L */
    private int f14982L;

    /* renamed from: a */
    private int f14983a;

    /* renamed from: b */
    private int f14984b;

    /* renamed from: c */
    private int f14985c;

    /* renamed from: d */
    private int f14986d = 30;

    /* renamed from: e */
    private String f14987e;

    /* renamed from: f */
    private String f14988f;

    /* renamed from: g */
    private List<Integer> f14989g;

    /* renamed from: h */
    private long f14990h;

    /* renamed from: i */
    private int f14991i = 1;

    /* renamed from: j */
    private List<Integer> f14992j;

    /* renamed from: k */
    private int f14993k;

    /* renamed from: l */
    private int f14994l;

    /* renamed from: m */
    private int f14995m;

    /* renamed from: n */
    private int f14996n;

    /* renamed from: o */
    private String f14997o;

    /* renamed from: p */
    private int f14998p;

    /* renamed from: q */
    private int f14999q = 1;

    /* renamed from: r */
    private int f15000r = 5000;

    /* renamed from: s */
    private int f15001s;

    /* renamed from: t */
    private int f15002t;

    /* renamed from: u */
    private long f15003u;

    /* renamed from: v */
    private String f15004v;

    /* renamed from: w */
    private int f15005w;

    /* renamed from: x */
    private long f15006x;

    /* renamed from: y */
    private long f15007y;

    /* renamed from: z */
    private int f15008z = 60;

    /* renamed from: a */
    public final String mo42770a() {
        return this.f14977G;
    }

    /* renamed from: a */
    public final void mo42771a(int i) {
        this.f14972B = i;
    }

    /* renamed from: b */
    public final void mo42774b(int i) {
        this.f14973C = i;
    }

    /* renamed from: b */
    public final int mo42773b() {
        return this.f15008z;
    }

    /* renamed from: c */
    public final int mo42775c() {
        return this.f14971A;
    }

    /* renamed from: d */
    public final int mo42777d() {
        return this.f14982L;
    }

    /* renamed from: e */
    public final String mo42778e() {
        return this.f14997o;
    }

    /* renamed from: f */
    public final int mo42779f() {
        return this.f14979I;
    }

    /* renamed from: g */
    public final int mo42780g() {
        return this.f14980J;
    }

    /* renamed from: h */
    public final int mo42781h() {
        return this.f14981K;
    }

    /* renamed from: i */
    public final long mo42783i() {
        return this.f15003u;
    }

    /* renamed from: j */
    public final int mo42784j() {
        return this.f15001s;
    }

    /* renamed from: c */
    public final void mo42776c(int i) {
        this.f15001s = i;
    }

    /* renamed from: k */
    public final int mo42785k() {
        return this.f15002t;
    }

    /* renamed from: l */
    public final int mo42786l() {
        int i = this.f14986d;
        if (i <= 0 || i > 100) {
            this.f14986d = 30;
        }
        return this.f14986d;
    }

    /* renamed from: m */
    public static C6086d m15138m() {
        return new C6086d();
    }

    /* renamed from: n */
    public final int mo42787n() {
        return this.f14996n;
    }

    /* renamed from: o */
    public final int mo42788o() {
        return this.f14999q;
    }

    /* renamed from: p */
    public final int mo42789p() {
        return this.f15000r;
    }

    /* renamed from: q */
    public final int mo42790q() {
        return this.f14994l;
    }

    /* renamed from: r */
    public final int mo42791r() {
        return this.f14995m;
    }

    public final String toString() {
        List<Integer> list = this.f14989g;
        String str = "";
        if (list != null && list.size() > 0) {
            for (Integer num : this.f14989g) {
                str = str + num + ",";
            }
        }
        return "offset = " + this.f14991i + " unitId = " + this.f14987e + " fbPlacementId = " + this.f14988f + str;
    }

    /* renamed from: a */
    public final void mo42772a(String str) {
        this.f14987e = str;
    }

    /* renamed from: s */
    public final List<Integer> mo42792s() {
        return this.f14989g;
    }

    /* renamed from: t */
    public final List<Integer> mo42793t() {
        return this.f14992j;
    }

    /* renamed from: b */
    public static C6086d m15132b(String str) {
        C6086d dVar = null;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            C6086d dVar2 = new C6086d();
            try {
                JSONObject jSONObject = new JSONObject(str);
                dVar2.f14987e = jSONObject.optString("unitId");
                dVar2.f14977G = jSONObject.optString("ab_id");
                JSONArray optJSONArray = jSONObject.optJSONArray("adSourceList");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        arrayList.add(Integer.valueOf(optJSONArray.optInt(i)));
                    }
                    dVar2.f14989g = arrayList;
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("ad_source_timeout");
                if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        arrayList2.add(Integer.valueOf(optJSONArray2.optInt(i2)));
                    }
                    dVar2.f14992j = arrayList2;
                }
                dVar2.f14993k = jSONObject.optInt("tpqn");
                dVar2.f14994l = jSONObject.optInt("aqn");
                dVar2.f14995m = jSONObject.optInt("acn");
                dVar2.f14996n = jSONObject.optInt("wt");
                int i3 = 1;
                dVar2.f14999q = jSONObject.optInt("iscasf", 1);
                dVar2.f15000r = jSONObject.optInt("spmxrt", 5000);
                dVar2.f14990h = jSONObject.optLong("current_time");
                dVar2.f14991i = jSONObject.optInt("offset");
                dVar2.f15003u = jSONObject.optLong("dlct", 3600);
                dVar2.f15001s = jSONObject.optInt("autoplay", 0);
                dVar2.f15002t = jSONObject.optInt("dlnet", 2);
                dVar2.f15004v = jSONObject.optString("no_offer");
                dVar2.f15005w = jSONObject.optInt("cb_type");
                dVar2.f15006x = jSONObject.optLong("clct", 86400);
                dVar2.f15007y = jSONObject.optLong("clcq", 300);
                dVar2.f14979I = jSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100);
                dVar2.f14980J = jSONObject.optInt("cd_rate", 0);
                dVar2.f14981K = jSONObject.optInt("content", 1);
                dVar2.f14982L = jSONObject.optInt("impt", 0);
                dVar2.f14998p = jSONObject.optInt("icon_type", 1);
                dVar2.f14997o = jSONObject.optString("no_ads_url", "");
                dVar2.f14983a = jSONObject.optInt("playclosebtn_tm", -1);
                dVar2.f14984b = jSONObject.optInt("play_ctdown", 0);
                dVar2.f14985c = jSONObject.optInt("close_alert", 0);
                dVar2.f14986d = jSONObject.optInt("intershowlimit", 30);
                dVar2.f15008z = jSONObject.optInt("refreshFq", 60);
                dVar2.f14971A = jSONObject.optInt("closeBtn", 0);
                int optInt = jSONObject.optInt("tmorl", 1);
                if (optInt <= 2) {
                    if (optInt > 0) {
                        i3 = optInt;
                    }
                }
                dVar2.f14978H = i3;
                dVar2.f14974D = jSONObject.optString("placementid", "");
                dVar2.f14975E = jSONObject.optInt("ltafemty", 10);
                dVar2.f14976F = jSONObject.optInt("ltorwc", 60);
                return dVar2;
            } catch (Exception e) {
                e = e;
                dVar = dVar2;
                e.printStackTrace();
                return dVar;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            return dVar;
        }
    }

    /* renamed from: u */
    public final JSONObject mo42795u() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f14989g != null && this.f14989g.size() > 0) {
                int size = this.f14989g.size();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < size; i++) {
                    jSONArray.put(this.f14989g.get(i));
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            if (this.f14992j != null && this.f14992j.size() > 0) {
                int size2 = this.f14992j.size();
                JSONArray jSONArray2 = new JSONArray();
                for (int i2 = 0; i2 < size2; i2++) {
                    jSONArray2.put(this.f14992j.get(i2));
                }
                jSONObject.put("ad_source_timeout", jSONArray2);
            }
            jSONObject.put("tpqn", this.f14993k);
            jSONObject.put("aqn", this.f14994l);
            jSONObject.put("acn", this.f14995m);
            jSONObject.put("wt", this.f14996n);
            jSONObject.put("current_time", this.f14990h);
            jSONObject.put("offset", this.f14991i);
            jSONObject.put("dlct", this.f15003u);
            jSONObject.put("autoplay", this.f15001s);
            jSONObject.put("dlnet", this.f15002t);
            jSONObject.put("no_offer", this.f15004v);
            jSONObject.put("cb_type", this.f15005w);
            jSONObject.put("clct", this.f15006x);
            jSONObject.put("clcq", this.f15007y);
            jSONObject.put(CampaignEx.JSON_KEY_READY_RATE, this.f14979I);
            jSONObject.put("content", this.f14981K);
            jSONObject.put("impt", this.f14982L);
            jSONObject.put("icon_type", this.f14998p);
            jSONObject.put("no_ads_url", this.f14997o);
            jSONObject.put("playclosebtn_tm", this.f14983a);
            jSONObject.put("play_ctdown", this.f14984b);
            jSONObject.put("close_alert", this.f14985c);
            jSONObject.put("closeBtn", this.f14971A);
            jSONObject.put("refreshFq", this.f15008z);
            jSONObject.put(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_COUNTDOWN, this.f14973C);
            jSONObject.put("allowSkip", this.f14972B);
            jSONObject.put("tmorl", this.f14978H);
            jSONObject.put("unitId", this.f14987e);
            jSONObject.put("placementid", this.f14974D);
            jSONObject.put("ltafemty", this.f14975E);
            jSONObject.put("ltorwc", this.f14976F);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: v */
    public final long mo42796v() {
        return this.f14990h;
    }

    /* renamed from: w */
    public final int mo42797w() {
        return this.f14991i;
    }

    /* renamed from: c */
    public static C6086d m15133c(String str) {
        C6086d m = m15138m();
        m.f15001s = 0;
        return m;
    }

    /* renamed from: d */
    public static C6086d m15134d(String str) {
        C6086d dVar = new C6086d();
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(8);
        arrayList2.add(8);
        dVar.f14991i = 1;
        dVar.f14987e = str;
        dVar.f14989g = arrayList;
        dVar.f14992j = arrayList2;
        dVar.f14993k = 1;
        dVar.f14995m = -2;
        dVar.f14994l = -2;
        dVar.f14996n = 5;
        dVar.f15003u = 3600;
        dVar.f15002t = 2;
        dVar.f15001s = 1;
        dVar.f14979I = 100;
        dVar.f14980J = 0;
        dVar.f14981K = 1;
        dVar.f14982L = 0;
        dVar.f15008z = 60;
        dVar.f14975E = 10;
        dVar.f14976F = 60;
        return dVar;
    }

    /* renamed from: e */
    public static C6086d m15135e(String str) {
        C6086d dVar = new C6086d();
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(1);
            dVar.f14989g = arrayList;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(30);
            dVar.f14992j = arrayList2;
            dVar.f14987e = str;
            dVar.f14991i = 1;
            dVar.f14993k = 1;
            dVar.f14995m = -2;
            dVar.f14994l = -2;
            dVar.f14996n = 5;
            dVar.f15003u = 3600;
            dVar.f15002t = 2;
            dVar.f15001s = 3;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dVar;
    }

    /* renamed from: f */
    public static C6086d m15136f(String str) {
        C6086d dVar = new C6086d();
        try {
            dVar.f14987e = str;
            dVar.f14991i = 1;
            dVar.f14993k = 1;
            dVar.f14996n = 5;
            dVar.f14995m = 1;
            dVar.f14994l = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dVar;
    }

    /* renamed from: g */
    public static C6086d m15137g(String str) {
        C6086d d = m15134d(str);
        try {
            d.f14998p = 1;
            d.f14997o = "";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return d;
    }

    /* renamed from: h */
    public final void mo42782h(String str) {
        this.f14974D = str;
    }

    /* renamed from: x */
    public final int mo42798x() {
        return this.f14975E;
    }

    /* renamed from: y */
    public final int mo42799y() {
        return this.f14976F;
    }
}
