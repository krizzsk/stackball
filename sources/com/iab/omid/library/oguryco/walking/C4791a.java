package com.iab.omid.library.oguryco.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.oguryco.adsession.C4758a;
import com.iab.omid.library.oguryco.p114b.C4760a;
import com.iab.omid.library.oguryco.p114b.C4764c;
import com.iab.omid.library.oguryco.p116d.C4781f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.iab.omid.library.oguryco.walking.a */
public class C4791a {

    /* renamed from: a */
    private final HashMap<View, String> f10797a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C4792a> f10798b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f10799c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f10800d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f10801e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f10802f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f10803g = new HashMap<>();

    /* renamed from: h */
    private boolean f10804h;

    /* renamed from: com.iab.omid.library.oguryco.walking.a$a */
    public static class C4792a {

        /* renamed from: a */
        private final C4764c f10805a;

        /* renamed from: b */
        private final ArrayList<String> f10806b = new ArrayList<>();

        public C4792a(C4764c cVar, String str) {
            this.f10805a = cVar;
            mo39429a(str);
        }

        /* renamed from: a */
        public C4764c mo39428a() {
            return this.f10805a;
        }

        /* renamed from: a */
        public void mo39429a(String str) {
            this.f10806b.add(str);
        }

        /* renamed from: b */
        public ArrayList<String> mo39430b() {
            return this.f10806b;
        }
    }

    /* renamed from: a */
    private void m10560a(C4758a aVar) {
        for (C4764c a : aVar.mo39276a()) {
            m10561a(a, aVar);
        }
    }

    /* renamed from: a */
    private void m10561a(C4764c cVar, C4758a aVar) {
        View view = (View) cVar.mo39348a().get();
        if (view != null) {
            C4792a aVar2 = this.f10798b.get(view);
            if (aVar2 != null) {
                aVar2.mo39429a(aVar.getAdSessionId());
            } else {
                this.f10798b.put(view, new C4792a(cVar, aVar.getAdSessionId()));
            }
        }
    }

    /* renamed from: d */
    private String m10562d(View view) {
        if (!view.hasWindowFocus()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String e = C4781f.m10511e(view);
            if (e != null) {
                return e;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f10800d.addAll(hashSet);
        return null;
    }

    /* renamed from: a */
    public String mo39418a(View view) {
        if (this.f10797a.size() == 0) {
            return null;
        }
        String str = this.f10797a.get(view);
        if (str != null) {
            this.f10797a.remove(view);
        }
        return str;
    }

    /* renamed from: a */
    public String mo39419a(String str) {
        return this.f10803g.get(str);
    }

    /* renamed from: a */
    public HashSet<String> mo39420a() {
        return this.f10801e;
    }

    /* renamed from: b */
    public View mo39421b(String str) {
        return this.f10799c.get(str);
    }

    /* renamed from: b */
    public C4792a mo39422b(View view) {
        C4792a aVar = this.f10798b.get(view);
        if (aVar != null) {
            this.f10798b.remove(view);
        }
        return aVar;
    }

    /* renamed from: b */
    public HashSet<String> mo39423b() {
        return this.f10802f;
    }

    /* renamed from: c */
    public C4802c mo39424c(View view) {
        return this.f10800d.contains(view) ? C4802c.PARENT_VIEW : this.f10804h ? C4802c.OBSTRUCTION_VIEW : C4802c.UNDERLYING_VIEW;
    }

    /* renamed from: c */
    public void mo39425c() {
        C4760a a = C4760a.m10402a();
        if (a != null) {
            for (C4758a next : a.mo39338c()) {
                View d = next.mo39280d();
                if (next.mo39281e()) {
                    String adSessionId = next.getAdSessionId();
                    if (d != null) {
                        String d2 = m10562d(d);
                        if (d2 == null) {
                            this.f10801e.add(adSessionId);
                            this.f10797a.put(d, adSessionId);
                            m10560a(next);
                        } else {
                            this.f10802f.add(adSessionId);
                            this.f10799c.put(adSessionId, d);
                            this.f10803g.put(adSessionId, d2);
                        }
                    } else {
                        this.f10802f.add(adSessionId);
                        this.f10803g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo39426d() {
        this.f10797a.clear();
        this.f10798b.clear();
        this.f10799c.clear();
        this.f10800d.clear();
        this.f10801e.clear();
        this.f10802f.clear();
        this.f10803g.clear();
        this.f10804h = false;
    }

    /* renamed from: e */
    public void mo39427e() {
        this.f10804h = true;
    }
}
