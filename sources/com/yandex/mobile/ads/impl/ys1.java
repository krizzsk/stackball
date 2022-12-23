package com.yandex.mobile.ads.impl;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

public class ys1 {

    /* renamed from: a */
    private final HashMap<View, String> f42938a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C15273a> f42939b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f42940c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f42941d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f42942e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f42943f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f42944g = new HashMap<>();

    /* renamed from: h */
    private final Map<View, Boolean> f42945h = new WeakHashMap();

    /* renamed from: i */
    private boolean f42946i;

    /* renamed from: com.yandex.mobile.ads.impl.ys1$a */
    public static class C15273a {

        /* renamed from: a */
        private final kt1 f42947a;

        /* renamed from: b */
        private final ArrayList<String> f42948b = new ArrayList<>();

        public C15273a(kt1 kt1, String str) {
            this.f42947a = kt1;
            mo71124a(str);
        }

        /* renamed from: a */
        public kt1 mo71123a() {
            return this.f42947a;
        }

        /* renamed from: a */
        public void mo71124a(String str) {
            this.f42948b.add(str);
        }

        /* renamed from: b */
        public ArrayList<String> mo71125b() {
            return this.f42948b;
        }
    }

    /* renamed from: a */
    public String mo71112a(View view) {
        if (this.f42938a.size() == 0) {
            return null;
        }
        String str = this.f42938a.get(view);
        if (str != null) {
            this.f42938a.remove(view);
        }
        return str;
    }

    /* renamed from: a */
    public String mo71113a(String str) {
        return this.f42944g.get(str);
    }

    /* renamed from: a */
    public HashSet<String> mo71114a() {
        return this.f42942e;
    }

    /* renamed from: b */
    public View mo71115b(String str) {
        return this.f42940c.get(str);
    }

    /* renamed from: b */
    public C15273a mo71116b(View view) {
        C15273a aVar = this.f42939b.get(view);
        if (aVar != null) {
            this.f42939b.remove(view);
        }
        return aVar;
    }

    /* renamed from: b */
    public HashSet<String> mo71117b() {
        return this.f42943f;
    }

    /* renamed from: c */
    public nt1 mo71118c(View view) {
        return this.f42941d.contains(view) ? nt1.PARENT_VIEW : this.f42946i ? nt1.OBSTRUCTION_VIEW : nt1.UNDERLYING_VIEW;
    }

    /* renamed from: c */
    public void mo71119c() {
        Boolean bool;
        us1 a = us1.m42837a();
        if (a != null) {
            for (ts1 next : a.mo70402c()) {
                View e = next.mo70224e();
                if (next.mo70225f()) {
                    String h = next.mo70227h();
                    if (e != null) {
                        String str = null;
                        if (Build.VERSION.SDK_INT < 19 || e.isAttachedToWindow()) {
                            if (e.hasWindowFocus()) {
                                this.f42945h.remove(e);
                                bool = Boolean.FALSE;
                            } else if (this.f42945h.containsKey(e)) {
                                bool = this.f42945h.get(e);
                            } else {
                                Map<View, Boolean> map = this.f42945h;
                                Boolean bool2 = Boolean.FALSE;
                                map.put(e, bool2);
                                bool = bool2;
                            }
                            if (bool.booleanValue()) {
                                str = "noWindowFocus";
                            } else {
                                HashSet hashSet = new HashSet();
                                View view = e;
                                while (true) {
                                    if (view == null) {
                                        this.f42941d.addAll(hashSet);
                                        break;
                                    }
                                    String a2 = zt1.m44789a(view);
                                    if (a2 != null) {
                                        str = a2;
                                        break;
                                    }
                                    hashSet.add(view);
                                    ViewParent parent = view.getParent();
                                    view = parent instanceof View ? (View) parent : null;
                                }
                            }
                        } else {
                            str = "notAttached";
                        }
                        if (str == null) {
                            this.f42942e.add(h);
                            this.f42938a.put(e, h);
                            for (kt1 next2 : next.mo70222c()) {
                                View view2 = (View) next2.mo68270a().get();
                                if (view2 != null) {
                                    C15273a aVar = this.f42939b.get(view2);
                                    if (aVar != null) {
                                        aVar.mo71124a(next.mo70227h());
                                    } else {
                                        this.f42939b.put(view2, new C15273a(next2, next.mo70227h()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.f42943f.add(h);
                            this.f42940c.put(h, e);
                            this.f42944g.put(h, str);
                        }
                    } else {
                        this.f42943f.add(h);
                        this.f42944g.put(h, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo71120d() {
        this.f42938a.clear();
        this.f42939b.clear();
        this.f42940c.clear();
        this.f42941d.clear();
        this.f42942e.clear();
        this.f42943f.clear();
        this.f42944g.clear();
        this.f42946i = false;
    }

    /* renamed from: d */
    public boolean mo71121d(View view) {
        if (!this.f42945h.containsKey(view)) {
            return true;
        }
        this.f42945h.put(view, Boolean.TRUE);
        return false;
    }

    /* renamed from: e */
    public void mo71122e() {
        this.f42946i = true;
    }
}
