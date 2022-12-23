package com.chartboost.sdk.impl;

import com.chartboost.sdk.Model.C1836a;
import com.chartboost.sdk.Model.C1837b;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.y */
public class C2018y extends C1836a {

    /* renamed from: u */
    public int f5200u;

    /* renamed from: v */
    private C1908e0 f5201v = null;

    public C2018y(int i, JSONObject jSONObject) throws JSONException {
        this.f5200u = i;
        this.f4422b = 1;
        C1908e0 b = C1899b0.m4472b(jSONObject);
        this.f5201v = b;
        C1902c0 b2 = m4931b(m4932c(b.mo14590d()).mo14597b());
        C1905d0 c = b2.mo14569c();
        m4930a(this.f5201v.mo14587a());
        this.f4423c.put("body", this.f4439s);
        this.f4429i = this.f5201v.mo14589c();
        this.f4428h = b2.mo14568b();
        this.f4437q = c.mo14574c();
        this.f4426f = c.mo14572a();
        this.f4427g = c.mo14573b();
        this.f4435o.put("imptrackers", c.mo14575d());
        m4929a(b2);
    }

    /* renamed from: a */
    private void m4929a(C1902c0 c0Var) {
        String a = m4928a();
        String str = this.f5200u == 0 ? "true" : "false";
        this.f4424d.put("{% encoding %}", "base64");
        this.f4424d.put("{% adm %}", c0Var.mo14567a());
        this.f4424d.put("{{ ad_type }}", a);
        this.f4424d.put("{{ show_close_button }}", str);
        this.f4424d.put("{{ preroll_popup }}", "false");
        this.f4424d.put("{{ post_video_reward_toaster_enabled }}", "false");
        if (this.f5200u == 3) {
            this.f4424d.put("{% is_banner %}", "true");
        }
    }

    /* renamed from: c */
    private C1911f0 m4932c(ArrayList<C1911f0> arrayList) {
        return !arrayList.isEmpty() ? arrayList.get(0) : new C1911f0();
    }

    /* renamed from: b */
    public C1908e0 mo14891b() {
        return this.f5201v;
    }

    /* renamed from: b */
    private C1902c0 m4931b(ArrayList<C1902c0> arrayList) {
        return !arrayList.isEmpty() ? arrayList.get(0) : new C1902c0();
    }

    /* renamed from: a */
    private String m4928a() {
        int i = this.f5200u;
        if (i == 0) {
            return "8";
        }
        if (i != 1) {
            return i != 3 ? "" : "10";
        }
        return "9";
    }

    /* renamed from: a */
    private void m4930a(ArrayList<C1837b> arrayList) {
        if (!arrayList.isEmpty()) {
            this.f4439s = arrayList.get(0);
        } else {
            this.f4439s = new C1837b("", "", "");
        }
    }
}
