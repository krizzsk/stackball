package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class ts1 extends C14165o4 {

    /* renamed from: k */
    private static final Pattern f40442k = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    private final C14353q4 f40443a;

    /* renamed from: b */
    private final C14253p4 f40444b;

    /* renamed from: c */
    private final List<kt1> f40445c = new ArrayList();

    /* renamed from: d */
    private ws1 f40446d;

    /* renamed from: e */
    private C14560s4 f40447e;

    /* renamed from: f */
    private boolean f40448f = false;

    /* renamed from: g */
    private boolean f40449g = false;

    /* renamed from: h */
    private final String f40450h;

    /* renamed from: i */
    private boolean f40451i;

    /* renamed from: j */
    private boolean f40452j;

    ts1(C14253p4 p4Var, C14353q4 q4Var) {
        this.f40444b = p4Var;
        this.f40443a = q4Var;
        this.f40450h = UUID.randomUUID().toString();
        m42477b((View) null);
        this.f40447e = (q4Var.mo69477a() == C14439r4.HTML || q4Var.mo69477a() == C14439r4.JAVASCRIPT) ? new xs1(q4Var.mo69484h()) : new bt1(q4Var.mo69480d(), q4Var.mo69481e());
        this.f40447e.mo66115a();
        us1.m42837a().mo70399a(this);
        this.f40447e.mo69858a(p4Var);
    }

    /* renamed from: b */
    private void m42477b(View view) {
        this.f40446d = new ws1((View) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo70221a(JSONObject jSONObject) {
        if (!this.f40452j) {
            vt1.m43343a().mo70590b(this.f40447e.mo69867e(), jSONObject);
            this.f40452j = true;
            return;
        }
        throw new IllegalStateException("Loaded event can only be sent once");
    }

    /* renamed from: b */
    public void mo69108b() {
        if (!this.f40448f) {
            this.f40448f = true;
            us1.m42837a().mo70401b(this);
            vt1.m43343a().mo70582a(this.f40447e.mo69867e(), bu1.m34401a().mo66126d());
            this.f40447e.mo66116a(this, this.f40443a);
        }
    }

    /* renamed from: c */
    public List<kt1> mo70222c() {
        return this.f40445c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo70223d() {
        if (!this.f40451i) {
            vt1.m43343a().mo70588b(this.f40447e.mo69867e());
            this.f40451i = true;
            return;
        }
        throw new IllegalStateException("Impression event can only be sent once");
    }

    /* renamed from: e */
    public View mo70224e() {
        return (View) this.f40446d.get();
    }

    /* renamed from: f */
    public boolean mo70225f() {
        return this.f40448f && !this.f40449g;
    }

    /* renamed from: g */
    public boolean mo70226g() {
        return this.f40448f;
    }

    /* renamed from: h */
    public String mo70227h() {
        return this.f40450h;
    }

    /* renamed from: i */
    public C14560s4 mo70228i() {
        return this.f40447e;
    }

    /* renamed from: j */
    public boolean mo70229j() {
        return this.f40449g;
    }

    /* renamed from: k */
    public boolean mo70230k() {
        return this.f40444b.mo69315a();
    }

    /* renamed from: l */
    public boolean mo70231l() {
        return this.f40444b.mo69316b();
    }

    /* renamed from: a */
    public void mo69107a(View view, t70 t70, String str) {
        kt1 kt1;
        if (!this.f40449g) {
            if (str != null) {
                if (str.length() > 50) {
                    throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
                } else if (!f40442k.matcher(str).matches()) {
                    throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
                }
            }
            Iterator<kt1> it = this.f40445c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    kt1 = null;
                    break;
                }
                kt1 = it.next();
                if (kt1.mo68270a().get() == view) {
                    break;
                }
            }
            if (kt1 == null) {
                this.f40445c.add(new kt1(view, t70, str));
            }
        }
    }

    /* renamed from: a */
    public void mo69105a() {
        if (!this.f40449g) {
            this.f40446d.clear();
            if (!this.f40449g) {
                this.f40445c.clear();
            }
            this.f40449g = true;
            vt1.m43343a().mo70581a(this.f40447e.mo69867e());
            us1.m42837a().mo70403c(this);
            this.f40447e.mo66117b();
            this.f40447e = null;
        }
    }

    /* renamed from: a */
    public void mo69106a(View view) {
        if (!this.f40449g) {
            wt1.m43867a((Object) view, "AdView is null");
            if (mo70224e() != view) {
                this.f40446d = new ws1(view);
                this.f40447e.mo69868f();
                Collection<ts1> b = us1.m42837a().mo70400b();
                if (b != null && !b.isEmpty()) {
                    for (ts1 next : b) {
                        if (next != this && next.mo70224e() == view) {
                            next.f40446d.clear();
                        }
                    }
                }
            }
        }
    }
}
