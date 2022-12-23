package com.iab.omid.library.inmobi.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.inmobi.adsession.C4660a;
import com.iab.omid.library.inmobi.p102b.C4662a;
import com.iab.omid.library.inmobi.p104d.C4681f;
import com.iab.omid.library.inmobi.p105e.C4682a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.iab.omid.library.inmobi.walking.a */
public class C4691a {

    /* renamed from: a */
    private final HashMap<View, String> f10564a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<String, View> f10565b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<View, ArrayList<String>> f10566c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f10567d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f10568e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f10569f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f10570g = new HashMap<>();

    /* renamed from: h */
    private boolean f10571h;

    /* renamed from: a */
    private void m10113a(View view, C4660a aVar) {
        ArrayList arrayList = this.f10566c.get(view);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f10566c.put(view, arrayList);
        }
        arrayList.add(aVar.getAdSessionId());
    }

    /* renamed from: a */
    private void m10114a(C4660a aVar) {
        for (C4682a aVar2 : aVar.mo38921a()) {
            View view = (View) aVar2.get();
            if (view != null) {
                m10113a(view, aVar);
            }
        }
    }

    /* renamed from: d */
    private String m10115d(View view) {
        if (!view.hasWindowFocus()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String e = C4681f.m10068e(view);
            if (e != null) {
                return e;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f10567d.addAll(hashSet);
        return null;
    }

    /* renamed from: a */
    public String mo39021a(View view) {
        if (this.f10564a.size() == 0) {
            return null;
        }
        String str = this.f10564a.get(view);
        if (str != null) {
            this.f10564a.remove(view);
        }
        return str;
    }

    /* renamed from: a */
    public String mo39022a(String str) {
        return this.f10570g.get(str);
    }

    /* renamed from: a */
    public HashSet<String> mo39023a() {
        return this.f10568e;
    }

    /* renamed from: b */
    public View mo39024b(String str) {
        return this.f10565b.get(str);
    }

    /* renamed from: b */
    public ArrayList<String> mo39025b(View view) {
        if (this.f10566c.size() == 0) {
            return null;
        }
        ArrayList<String> arrayList = this.f10566c.get(view);
        if (arrayList != null) {
            this.f10566c.remove(view);
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    /* renamed from: b */
    public HashSet<String> mo39026b() {
        return this.f10569f;
    }

    /* renamed from: c */
    public C4701c mo39027c(View view) {
        return this.f10567d.contains(view) ? C4701c.PARENT_VIEW : this.f10571h ? C4701c.OBSTRUCTION_VIEW : C4701c.UNDERLYING_VIEW;
    }

    /* renamed from: c */
    public void mo39028c() {
        C4662a a = C4662a.m9971a();
        if (a != null) {
            for (C4660a next : a.mo38950c()) {
                View c = next.mo38923c();
                if (next.mo38924d()) {
                    String adSessionId = next.getAdSessionId();
                    if (c != null) {
                        String d = m10115d(c);
                        if (d == null) {
                            this.f10568e.add(adSessionId);
                            this.f10564a.put(c, adSessionId);
                            m10114a(next);
                        } else {
                            this.f10569f.add(adSessionId);
                            this.f10565b.put(adSessionId, c);
                            this.f10570g.put(adSessionId, d);
                        }
                    } else {
                        this.f10569f.add(adSessionId);
                        this.f10570g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo39029d() {
        this.f10564a.clear();
        this.f10565b.clear();
        this.f10566c.clear();
        this.f10567d.clear();
        this.f10568e.clear();
        this.f10569f.clear();
        this.f10570g.clear();
        this.f10571h = false;
    }

    /* renamed from: e */
    public void mo39030e() {
        this.f10571h = true;
    }
}
