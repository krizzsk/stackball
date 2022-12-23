package com.p243my.target;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.my.target.w2 */
public class C7718w2 extends C7618q2 {

    /* renamed from: b */
    public final String f19543b;

    /* renamed from: c */
    public final ArrayList<C7497k2> f19544c = new ArrayList<>();

    /* renamed from: d */
    public final ArrayList<Pair<String, String>> f19545d = new ArrayList<>();

    /* renamed from: e */
    public JSONObject f19546e;

    /* renamed from: f */
    public boolean f19547f;

    /* renamed from: g */
    public String f19548g;

    /* renamed from: h */
    public String f19549h;

    /* renamed from: i */
    public String f19550i;

    /* renamed from: j */
    public String f19551j;

    /* renamed from: k */
    public String f19552k;

    /* renamed from: l */
    public String f19553l;

    public C7718w2(String str) {
        this.f19543b = str;
    }

    /* renamed from: b */
    public static C7718w2 m20721b(String str) {
        return new C7718w2(str);
    }

    /* renamed from: a */
    public int mo51416a() {
        return this.f19544c.size();
    }

    /* renamed from: a */
    public String mo51770a(String str) {
        Iterator<Pair<String, String>> it = this.f19545d.iterator();
        while (it.hasNext()) {
            Pair next = it.next();
            if (str.equals(next.first)) {
                return (String) next.second;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo51771a(C7497k2 k2Var) {
        this.f19544c.add(k2Var);
    }

    /* renamed from: a */
    public void mo51772a(JSONObject jSONObject) {
        this.f19546e = jSONObject;
    }

    /* renamed from: a */
    public void mo51773a(boolean z) {
        this.f19547f = z;
    }

    /* renamed from: c */
    public List<C7497k2> mo51774c() {
        return new ArrayList(this.f19544c);
    }

    /* renamed from: c */
    public void mo51775c(String str) {
        this.f19550i = str;
    }

    /* renamed from: d */
    public String mo51776d() {
        return this.f19550i;
    }

    /* renamed from: d */
    public void mo51777d(String str) {
        this.f19552k = str;
    }

    /* renamed from: e */
    public String mo51778e() {
        return this.f19552k;
    }

    /* renamed from: e */
    public void mo51779e(String str) {
        this.f19549h = str;
    }

    /* renamed from: f */
    public String mo51780f() {
        return this.f19549h;
    }

    /* renamed from: f */
    public void mo51781f(String str) {
        this.f19553l = str;
    }

    /* renamed from: g */
    public String mo51782g() {
        return this.f19553l;
    }

    /* renamed from: g */
    public void mo51783g(String str) {
        this.f19551j = str;
    }

    /* renamed from: h */
    public String mo51784h() {
        return this.f19551j;
    }

    /* renamed from: h */
    public void mo51785h(String str) {
        this.f19548g = str;
    }

    /* renamed from: i */
    public String mo51786i() {
        return this.f19543b;
    }

    /* renamed from: j */
    public JSONObject mo51787j() {
        return this.f19546e;
    }

    /* renamed from: k */
    public ArrayList<Pair<String, String>> mo51788k() {
        return this.f19545d;
    }

    /* renamed from: l */
    public String mo51789l() {
        return this.f19548g;
    }

    /* renamed from: m */
    public boolean mo51790m() {
        return this.f19547f;
    }
}
