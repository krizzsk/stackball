package com.iab.omid.library.adcolony.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.adcolony.adsession.C4560a;
import com.iab.omid.library.adcolony.p090b.C4562a;
import com.iab.omid.library.adcolony.p090b.C4565c;
import com.iab.omid.library.adcolony.p092d.C4582f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.iab.omid.library.adcolony.walking.a */
public class C4592a {

    /* renamed from: a */
    private final HashMap<View, String> f10347a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C4593a> f10348b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f10349c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f10350d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f10351e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f10352f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f10353g = new HashMap<>();

    /* renamed from: h */
    private boolean f10354h;

    /* renamed from: com.iab.omid.library.adcolony.walking.a$a */
    public static class C4593a {

        /* renamed from: a */
        private final C4565c f10355a;

        /* renamed from: b */
        private final ArrayList<String> f10356b = new ArrayList<>();

        public C4593a(C4565c cVar, String str) {
            this.f10355a = cVar;
            mo38669a(str);
        }

        /* renamed from: a */
        public C4565c mo38668a() {
            return this.f10355a;
        }

        /* renamed from: a */
        public void mo38669a(String str) {
            this.f10356b.add(str);
        }

        /* renamed from: b */
        public ArrayList<String> mo38670b() {
            return this.f10356b;
        }
    }

    /* renamed from: a */
    private void m9676a(C4560a aVar) {
        for (C4565c a : aVar.mo38542a()) {
            m9677a(a, aVar);
        }
    }

    /* renamed from: a */
    private void m9677a(C4565c cVar, C4560a aVar) {
        View view = (View) cVar.mo38588a().get();
        if (view != null) {
            C4593a aVar2 = this.f10348b.get(view);
            if (aVar2 != null) {
                aVar2.mo38669a(aVar.getAdSessionId());
            } else {
                this.f10348b.put(view, new C4593a(cVar, aVar.getAdSessionId()));
            }
        }
    }

    /* renamed from: d */
    private String m9678d(View view) {
        if (!view.hasWindowFocus()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String e = C4582f.m9627e(view);
            if (e != null) {
                return e;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f10350d.addAll(hashSet);
        return null;
    }

    /* renamed from: a */
    public String mo38658a(View view) {
        if (this.f10347a.size() == 0) {
            return null;
        }
        String str = this.f10347a.get(view);
        if (str != null) {
            this.f10347a.remove(view);
        }
        return str;
    }

    /* renamed from: a */
    public String mo38659a(String str) {
        return this.f10353g.get(str);
    }

    /* renamed from: a */
    public HashSet<String> mo38660a() {
        return this.f10351e;
    }

    /* renamed from: b */
    public View mo38661b(String str) {
        return this.f10349c.get(str);
    }

    /* renamed from: b */
    public C4593a mo38662b(View view) {
        C4593a aVar = this.f10348b.get(view);
        if (aVar != null) {
            this.f10348b.remove(view);
        }
        return aVar;
    }

    /* renamed from: b */
    public HashSet<String> mo38663b() {
        return this.f10352f;
    }

    /* renamed from: c */
    public C4603c mo38664c(View view) {
        return this.f10350d.contains(view) ? C4603c.PARENT_VIEW : this.f10354h ? C4603c.OBSTRUCTION_VIEW : C4603c.UNDERLYING_VIEW;
    }

    /* renamed from: c */
    public void mo38665c() {
        C4562a a = C4562a.m9524a();
        if (a != null) {
            for (C4560a next : a.mo38580c()) {
                View d = next.mo38546d();
                if (next.mo38547e()) {
                    String adSessionId = next.getAdSessionId();
                    if (d != null) {
                        String d2 = m9678d(d);
                        if (d2 == null) {
                            this.f10351e.add(adSessionId);
                            this.f10347a.put(d, adSessionId);
                            m9676a(next);
                        } else {
                            this.f10352f.add(adSessionId);
                            this.f10349c.put(adSessionId, d);
                            this.f10353g.put(adSessionId, d2);
                        }
                    } else {
                        this.f10352f.add(adSessionId);
                        this.f10353g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo38666d() {
        this.f10347a.clear();
        this.f10348b.clear();
        this.f10349c.clear();
        this.f10350d.clear();
        this.f10351e.clear();
        this.f10352f.clear();
        this.f10353g.clear();
        this.f10354h = false;
    }

    /* renamed from: e */
    public void mo38667e() {
        this.f10354h = true;
    }
}
