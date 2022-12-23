package com.p243my.target;

import android.util.LruCache;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.v2 */
public class C7699v2 extends C7618q2 {

    /* renamed from: b */
    public static final LruCache<String, String> f19510b = new LruCache<>(10);

    /* renamed from: c */
    public final ArrayList<C7435h2> f19511c = new ArrayList<>();

    /* renamed from: d */
    public static LruCache<String, String> m20660d() {
        return f19510b;
    }

    /* renamed from: f */
    public static C7699v2 m20661f() {
        return new C7699v2();
    }

    /* renamed from: a */
    public int mo51416a() {
        return this.f19511c.size();
    }

    /* renamed from: a */
    public void mo51726a(C7435h2 h2Var) {
        this.f19511c.add(h2Var);
        f19510b.put(h2Var.getId(), h2Var.getId());
    }

    /* renamed from: c */
    public List<C7435h2> mo51727c() {
        return new ArrayList(this.f19511c);
    }

    /* renamed from: e */
    public C7435h2 mo51728e() {
        if (this.f19511c.size() > 0) {
            return this.f19511c.get(0);
        }
        return null;
    }
}
