package com.iab.omid.library.vungle.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.vungle.adsession.C4857a;
import com.iab.omid.library.vungle.p126b.C4859a;
import com.iab.omid.library.vungle.p126b.C4862c;
import com.iab.omid.library.vungle.p128d.C4879f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.iab.omid.library.vungle.walking.a */
public class C4889a {

    /* renamed from: a */
    private final HashMap<View, String> f11009a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C4890a> f11010b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f11011c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f11012d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f11013e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f11014f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f11015g = new HashMap<>();

    /* renamed from: h */
    private boolean f11016h;

    /* renamed from: com.iab.omid.library.vungle.walking.a$a */
    public static class C4890a {

        /* renamed from: a */
        private final C4862c f11017a;

        /* renamed from: b */
        private final ArrayList<String> f11018b = new ArrayList<>();

        public C4890a(C4862c cVar, String str) {
            this.f11017a = cVar;
            mo39785a(str);
        }

        /* renamed from: a */
        public C4862c mo39784a() {
            return this.f11017a;
        }

        /* renamed from: a */
        public void mo39785a(String str) {
            this.f11018b.add(str);
        }

        /* renamed from: b */
        public ArrayList<String> mo39786b() {
            return this.f11018b;
        }
    }

    /* renamed from: a */
    private void m10988a(C4857a aVar) {
        for (C4862c a : aVar.mo39650a()) {
            m10989a(a, aVar);
        }
    }

    /* renamed from: a */
    private void m10989a(C4862c cVar, C4857a aVar) {
        View view = (View) cVar.mo39704a().get();
        if (view != null) {
            C4890a aVar2 = this.f11010b.get(view);
            if (aVar2 != null) {
                aVar2.mo39785a(aVar.getAdSessionId());
            } else {
                this.f11010b.put(view, new C4890a(cVar, aVar.getAdSessionId()));
            }
        }
    }

    /* renamed from: d */
    private String m10990d(View view) {
        if (!view.hasWindowFocus()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String e = C4879f.m10939e(view);
            if (e != null) {
                return e;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f11012d.addAll(hashSet);
        return null;
    }

    /* renamed from: a */
    public String mo39774a(View view) {
        if (this.f11009a.size() == 0) {
            return null;
        }
        String str = this.f11009a.get(view);
        if (str != null) {
            this.f11009a.remove(view);
        }
        return str;
    }

    /* renamed from: a */
    public String mo39775a(String str) {
        return this.f11015g.get(str);
    }

    /* renamed from: a */
    public HashSet<String> mo39776a() {
        return this.f11013e;
    }

    /* renamed from: b */
    public View mo39777b(String str) {
        return this.f11011c.get(str);
    }

    /* renamed from: b */
    public C4890a mo39778b(View view) {
        C4890a aVar = this.f11010b.get(view);
        if (aVar != null) {
            this.f11010b.remove(view);
        }
        return aVar;
    }

    /* renamed from: b */
    public HashSet<String> mo39779b() {
        return this.f11014f;
    }

    /* renamed from: c */
    public C4900c mo39780c(View view) {
        return this.f11012d.contains(view) ? C4900c.PARENT_VIEW : this.f11016h ? C4900c.OBSTRUCTION_VIEW : C4900c.UNDERLYING_VIEW;
    }

    /* renamed from: c */
    public void mo39781c() {
        C4859a a = C4859a.m10833a();
        if (a != null) {
            for (C4857a next : a.mo39688c()) {
                View d = next.mo39654d();
                if (next.mo39655e()) {
                    String adSessionId = next.getAdSessionId();
                    if (d != null) {
                        String d2 = m10990d(d);
                        if (d2 == null) {
                            this.f11013e.add(adSessionId);
                            this.f11009a.put(d, adSessionId);
                            m10988a(next);
                        } else {
                            this.f11014f.add(adSessionId);
                            this.f11011c.put(adSessionId, d);
                            this.f11015g.put(adSessionId, d2);
                        }
                    } else {
                        this.f11014f.add(adSessionId);
                        this.f11015g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo39782d() {
        this.f11009a.clear();
        this.f11010b.clear();
        this.f11011c.clear();
        this.f11012d.clear();
        this.f11013e.clear();
        this.f11014f.clear();
        this.f11015g.clear();
        this.f11016h = false;
    }

    /* renamed from: e */
    public void mo39783e() {
        this.f11016h = true;
    }
}
