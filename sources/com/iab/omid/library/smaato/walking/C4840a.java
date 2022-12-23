package com.iab.omid.library.smaato.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.smaato.adsession.C4809a;
import com.iab.omid.library.smaato.p120b.C4811a;
import com.iab.omid.library.smaato.p122d.C4830f;
import com.iab.omid.library.smaato.p123e.C4831a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.iab.omid.library.smaato.walking.a */
public class C4840a {

    /* renamed from: a */
    private final HashMap<View, String> f10900a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, ArrayList<String>> f10901b = new HashMap<>();

    /* renamed from: c */
    private final HashSet<View> f10902c = new HashSet<>();

    /* renamed from: d */
    private final HashSet<String> f10903d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f10904e = new HashSet<>();

    /* renamed from: f */
    private boolean f10905f;

    /* renamed from: a */
    private void m10769a(View view, C4809a aVar) {
        ArrayList arrayList = this.f10901b.get(view);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f10901b.put(view, arrayList);
        }
        arrayList.add(aVar.getAdSessionId());
    }

    /* renamed from: a */
    private void m10770a(C4809a aVar) {
        for (C4831a aVar2 : aVar.mo39487a()) {
            View view = (View) aVar2.get();
            if (view != null) {
                m10769a(view, aVar);
            }
        }
    }

    /* renamed from: d */
    private boolean m10771d(View view) {
        if (!view.hasWindowFocus()) {
            return false;
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            if (!C4830f.m10725d(view)) {
                return false;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f10902c.addAll(hashSet);
        return true;
    }

    /* renamed from: a */
    public String mo39585a(View view) {
        if (this.f10900a.size() == 0) {
            return null;
        }
        String str = this.f10900a.get(view);
        if (str != null) {
            this.f10900a.remove(view);
        }
        return str;
    }

    /* renamed from: a */
    public HashSet<String> mo39586a() {
        return this.f10903d;
    }

    /* renamed from: b */
    public ArrayList<String> mo39587b(View view) {
        if (this.f10901b.size() == 0) {
            return null;
        }
        ArrayList<String> arrayList = this.f10901b.get(view);
        if (arrayList != null) {
            this.f10901b.remove(view);
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    /* renamed from: b */
    public HashSet<String> mo39588b() {
        return this.f10904e;
    }

    /* renamed from: c */
    public C4850c mo39589c(View view) {
        return this.f10902c.contains(view) ? C4850c.PARENT_VIEW : this.f10905f ? C4850c.OBSTRUCTION_VIEW : C4850c.UNDERLYING_VIEW;
    }

    /* renamed from: c */
    public void mo39590c() {
        C4811a a = C4811a.m10631a();
        if (a != null) {
            for (C4809a next : a.mo39516c()) {
                View c = next.mo39489c();
                if (next.mo39490d()) {
                    if (c == null || !m10771d(c)) {
                        this.f10904e.add(next.getAdSessionId());
                    } else {
                        this.f10903d.add(next.getAdSessionId());
                        this.f10900a.put(c, next.getAdSessionId());
                        m10770a(next);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo39591d() {
        this.f10900a.clear();
        this.f10901b.clear();
        this.f10902c.clear();
        this.f10903d.clear();
        this.f10904e.clear();
        this.f10905f = false;
    }

    /* renamed from: e */
    public void mo39592e() {
        this.f10905f = true;
    }
}
