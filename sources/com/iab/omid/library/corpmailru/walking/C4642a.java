package com.iab.omid.library.corpmailru.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.corpmailru.adsession.C4610a;
import com.iab.omid.library.corpmailru.p096b.C4612a;
import com.iab.omid.library.corpmailru.p096b.C4615c;
import com.iab.omid.library.corpmailru.p098d.C4632f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.iab.omid.library.corpmailru.walking.a */
public class C4642a {

    /* renamed from: a */
    private final HashMap<View, String> f10460a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C4643a> f10461b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f10462c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f10463d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f10464e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f10465f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f10466g = new HashMap<>();

    /* renamed from: h */
    private boolean f10467h;

    /* renamed from: com.iab.omid.library.corpmailru.walking.a$a */
    public static class C4643a {

        /* renamed from: a */
        private final C4615c f10468a;

        /* renamed from: b */
        private final ArrayList<String> f10469b = new ArrayList<>();

        public C4643a(C4615c cVar, String str) {
            this.f10468a = cVar;
            mo38863a(str);
        }

        /* renamed from: a */
        public C4615c mo38862a() {
            return this.f10468a;
        }

        /* renamed from: a */
        public void mo38863a(String str) {
            this.f10469b.add(str);
        }

        /* renamed from: b */
        public ArrayList<String> mo38864b() {
            return this.f10469b;
        }
    }

    /* renamed from: a */
    private void m9900a(C4610a aVar) {
        for (C4615c a : aVar.mo38728a()) {
            m9901a(a, aVar);
        }
    }

    /* renamed from: a */
    private void m9901a(C4615c cVar, C4610a aVar) {
        View view = (View) cVar.mo38782a().get();
        if (view != null) {
            C4643a aVar2 = this.f10461b.get(view);
            if (aVar2 != null) {
                aVar2.mo38863a(aVar.getAdSessionId());
            } else {
                this.f10461b.put(view, new C4643a(cVar, aVar.getAdSessionId()));
            }
        }
    }

    /* renamed from: d */
    private String m9902d(View view) {
        if (!view.hasWindowFocus()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String e = C4632f.m9851e(view);
            if (e != null) {
                return e;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f10463d.addAll(hashSet);
        return null;
    }

    /* renamed from: a */
    public String mo38852a(View view) {
        if (this.f10460a.size() == 0) {
            return null;
        }
        String str = this.f10460a.get(view);
        if (str != null) {
            this.f10460a.remove(view);
        }
        return str;
    }

    /* renamed from: a */
    public String mo38853a(String str) {
        return this.f10466g.get(str);
    }

    /* renamed from: a */
    public HashSet<String> mo38854a() {
        return this.f10464e;
    }

    /* renamed from: b */
    public View mo38855b(String str) {
        return this.f10462c.get(str);
    }

    /* renamed from: b */
    public C4643a mo38856b(View view) {
        C4643a aVar = this.f10461b.get(view);
        if (aVar != null) {
            this.f10461b.remove(view);
        }
        return aVar;
    }

    /* renamed from: b */
    public HashSet<String> mo38857b() {
        return this.f10465f;
    }

    /* renamed from: c */
    public C4653c mo38858c(View view) {
        return this.f10463d.contains(view) ? C4653c.PARENT_VIEW : this.f10467h ? C4653c.OBSTRUCTION_VIEW : C4653c.UNDERLYING_VIEW;
    }

    /* renamed from: c */
    public void mo38859c() {
        C4612a a = C4612a.m9745a();
        if (a != null) {
            for (C4610a next : a.mo38766c()) {
                View d = next.mo38732d();
                if (next.mo38733e()) {
                    String adSessionId = next.getAdSessionId();
                    if (d != null) {
                        String d2 = m9902d(d);
                        if (d2 == null) {
                            this.f10464e.add(adSessionId);
                            this.f10460a.put(d, adSessionId);
                            m9900a(next);
                        } else {
                            this.f10465f.add(adSessionId);
                            this.f10462c.put(adSessionId, d);
                            this.f10466g.put(adSessionId, d2);
                        }
                    } else {
                        this.f10465f.add(adSessionId);
                        this.f10466g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo38860d() {
        this.f10460a.clear();
        this.f10461b.clear();
        this.f10462c.clear();
        this.f10463d.clear();
        this.f10464e.clear();
        this.f10465f.clear();
        this.f10466g.clear();
        this.f10467h = false;
    }

    /* renamed from: e */
    public void mo38861e() {
        this.f10467h = true;
    }
}
