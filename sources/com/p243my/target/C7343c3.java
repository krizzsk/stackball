package com.p243my.target;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.my.target.c3 */
public final class C7343c3 {

    /* renamed from: a */
    public final Set<C7328b3> f18399a = new HashSet();

    /* renamed from: b */
    public final Set<C7303a3> f18400b = new HashSet();

    /* renamed from: c */
    public final List<C7769z2> f18401c = new ArrayList();

    /* renamed from: d */
    public final List<C7747y2> f18402d = new ArrayList();

    /* renamed from: e */
    public final Comparator<C7769z2> f18403e = $$Lambda$3Ri92qehj3Ks9ZBZh2yg_kbDYg0.INSTANCE;

    /* renamed from: a */
    public static /* synthetic */ int m18843a(C7303a3 a3Var, C7303a3 a3Var2) {
        return (int) (a3Var2.mo49575e() - a3Var.mo49575e());
    }

    /* renamed from: f */
    public static C7343c3 m18845f() {
        return new C7343c3();
    }

    /* renamed from: a */
    public ArrayList<C7747y2> mo49799a() {
        return new ArrayList<>(this.f18402d);
    }

    /* renamed from: a */
    public ArrayList<C7328b3> mo49800a(String str) {
        ArrayList<C7328b3> arrayList = new ArrayList<>();
        for (C7328b3 next : this.f18399a) {
            if (str.equals(next.mo49727a())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo49801a(C7328b3 b3Var) {
        Set set;
        if (b3Var instanceof C7303a3) {
            set = this.f18400b;
            b3Var = (C7303a3) b3Var;
        } else if (b3Var instanceof C7769z2) {
            C7769z2 z2Var = (C7769z2) b3Var;
            int binarySearch = Collections.binarySearch(this.f18401c, z2Var, this.f18403e);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 1;
            }
            this.f18401c.add(binarySearch, z2Var);
            return;
        } else if (b3Var instanceof C7747y2) {
            this.f18402d.add((C7747y2) b3Var);
            return;
        } else {
            set = this.f18399a;
        }
        set.add(b3Var);
    }

    /* renamed from: a */
    public void mo49802a(C7343c3 c3Var, float f) {
        this.f18399a.addAll(c3Var.mo49808d());
        this.f18402d.addAll(c3Var.mo49799a());
        if (f <= 0.0f) {
            this.f18400b.addAll(c3Var.mo49807c());
            this.f18401c.addAll(c3Var.mo49805b());
            return;
        }
        for (C7303a3 next : c3Var.mo49807c()) {
            float d = next.mo49574d();
            if (d >= 0.0f) {
                next.mo49573b((d * f) / 100.0f);
                next.mo49572a(-1.0f);
            }
            mo49801a((C7328b3) next);
        }
        Iterator<C7769z2> it = c3Var.mo49805b().iterator();
        while (it.hasNext()) {
            C7769z2 next2 = it.next();
            float d2 = next2.mo51982d();
            if (d2 >= 0.0f) {
                next2.mo51980b((d2 * f) / 100.0f);
                next2.mo51979a(-1.0f);
            }
            mo49801a((C7328b3) next2);
        }
    }

    /* renamed from: a */
    public void mo49803a(ArrayList<C7303a3> arrayList) {
        this.f18400b.addAll(arrayList);
    }

    /* renamed from: a */
    public void mo49804a(List<C7328b3> list) {
        for (C7328b3 a : list) {
            mo49801a(a);
        }
    }

    /* renamed from: b */
    public ArrayList<C7769z2> mo49805b() {
        return new ArrayList<>(this.f18401c);
    }

    /* renamed from: b */
    public void mo49806b(List<C7303a3> list) {
        list.addAll(this.f18400b);
        Collections.sort(list, $$Lambda$IP4sDTQNTlS1_Tjs3WUUX9pulqU.INSTANCE);
    }

    /* renamed from: c */
    public Set<C7303a3> mo49807c() {
        return new HashSet(this.f18400b);
    }

    /* renamed from: d */
    public Set<C7328b3> mo49808d() {
        return new HashSet(this.f18399a);
    }

    /* renamed from: e */
    public boolean mo49809e() {
        return !this.f18399a.isEmpty() || !this.f18400b.isEmpty() || !this.f18401c.isEmpty() || !this.f18402d.isEmpty();
    }
}
