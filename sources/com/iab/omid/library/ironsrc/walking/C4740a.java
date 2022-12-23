package com.iab.omid.library.ironsrc.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.ironsrc.adsession.C4708a;
import com.iab.omid.library.ironsrc.p108b.C4710a;
import com.iab.omid.library.ironsrc.p108b.C4713c;
import com.iab.omid.library.ironsrc.p110d.C4730f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.iab.omid.library.ironsrc.walking.a */
public class C4740a {

    /* renamed from: a */
    private final HashMap<View, String> f10676a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C4741a> f10677b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f10678c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f10679d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f10680e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f10681f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f10682g = new HashMap<>();

    /* renamed from: h */
    private boolean f10683h;

    /* renamed from: com.iab.omid.library.ironsrc.walking.a$a */
    public static class C4741a {

        /* renamed from: a */
        private final C4713c f10684a;

        /* renamed from: b */
        private final ArrayList<String> f10685b = new ArrayList<>();

        public C4741a(C4713c cVar, String str) {
            this.f10684a = cVar;
            mo39215a(str);
        }

        /* renamed from: a */
        public C4713c mo39214a() {
            return this.f10684a;
        }

        /* renamed from: a */
        public void mo39215a(String str) {
            this.f10685b.add(str);
        }

        /* renamed from: b */
        public ArrayList<String> mo39216b() {
            return this.f10685b;
        }
    }

    /* renamed from: a */
    private void m10331a(C4708a aVar) {
        for (C4713c a : aVar.mo39088a()) {
            m10332a(a, aVar);
        }
    }

    /* renamed from: a */
    private void m10332a(C4713c cVar, C4708a aVar) {
        View view = (View) cVar.mo39134a().get();
        if (view != null) {
            C4741a aVar2 = this.f10677b.get(view);
            if (aVar2 != null) {
                aVar2.mo39215a(aVar.getAdSessionId());
            } else {
                this.f10677b.put(view, new C4741a(cVar, aVar.getAdSessionId()));
            }
        }
    }

    /* renamed from: d */
    private String m10333d(View view) {
        if (!view.hasWindowFocus()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String e = C4730f.m10282e(view);
            if (e != null) {
                return e;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f10679d.addAll(hashSet);
        return null;
    }

    /* renamed from: a */
    public String mo39204a(View view) {
        if (this.f10676a.size() == 0) {
            return null;
        }
        String str = this.f10676a.get(view);
        if (str != null) {
            this.f10676a.remove(view);
        }
        return str;
    }

    /* renamed from: a */
    public String mo39205a(String str) {
        return this.f10682g.get(str);
    }

    /* renamed from: a */
    public HashSet<String> mo39206a() {
        return this.f10680e;
    }

    /* renamed from: b */
    public View mo39207b(String str) {
        return this.f10678c.get(str);
    }

    /* renamed from: b */
    public C4741a mo39208b(View view) {
        C4741a aVar = this.f10677b.get(view);
        if (aVar != null) {
            this.f10677b.remove(view);
        }
        return aVar;
    }

    /* renamed from: b */
    public HashSet<String> mo39209b() {
        return this.f10681f;
    }

    /* renamed from: c */
    public C4751c mo39210c(View view) {
        return this.f10679d.contains(view) ? C4751c.PARENT_VIEW : this.f10683h ? C4751c.OBSTRUCTION_VIEW : C4751c.UNDERLYING_VIEW;
    }

    /* renamed from: c */
    public void mo39211c() {
        C4710a a = C4710a.m10179a();
        if (a != null) {
            for (C4708a next : a.mo39126c()) {
                View d = next.mo39092d();
                if (next.mo39093e()) {
                    String adSessionId = next.getAdSessionId();
                    if (d != null) {
                        String d2 = m10333d(d);
                        if (d2 == null) {
                            this.f10680e.add(adSessionId);
                            this.f10676a.put(d, adSessionId);
                            m10331a(next);
                        } else {
                            this.f10681f.add(adSessionId);
                            this.f10678c.put(adSessionId, d);
                            this.f10682g.put(adSessionId, d2);
                        }
                    } else {
                        this.f10681f.add(adSessionId);
                        this.f10682g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo39212d() {
        this.f10676a.clear();
        this.f10677b.clear();
        this.f10678c.clear();
        this.f10679d.clear();
        this.f10680e.clear();
        this.f10681f.clear();
        this.f10682g.clear();
        this.f10683h = false;
    }

    /* renamed from: e */
    public void mo39213e() {
        this.f10683h = true;
    }
}
