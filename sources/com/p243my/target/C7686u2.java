package com.p243my.target;

import com.p243my.target.C7685u1;
import com.p243my.target.common.models.AudioData;
import com.p243my.target.common.models.VideoData;
import com.yandex.mobile.ads.instream.InstreamAdBreakType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.my.target.u2 */
public class C7686u2<T extends C7685u1> extends C7618q2 {

    /* renamed from: b */
    public final int f19461b;

    /* renamed from: c */
    public final String f19462c;

    /* renamed from: d */
    public final ArrayList<C7413g2<T>> f19463d = new ArrayList<>();

    /* renamed from: e */
    public final ArrayList<C7617q1> f19464e = new ArrayList<>();

    /* renamed from: f */
    public final ArrayList<C7617q1> f19465f = new ArrayList<>();

    /* renamed from: g */
    public final ArrayList<C7617q1> f19466g = new ArrayList<>();

    /* renamed from: h */
    public int f19467h = 10;

    /* renamed from: i */
    public int f19468i;

    public C7686u2(String str) {
        char c = 65535;
        this.f19468i = -1;
        this.f19462c = str;
        str.hashCode();
        switch (str.hashCode()) {
            case -318297696:
                if (str.equals(InstreamAdBreakType.PREROLL)) {
                    c = 0;
                    break;
                }
                break;
            case 757909789:
                if (str.equals("postroll")) {
                    c = 1;
                    break;
                }
                break;
            case 830323571:
                if (str.equals(InstreamAdBreakType.PAUSEROLL)) {
                    c = 2;
                    break;
                }
                break;
            case 1055572677:
                if (str.equals(InstreamAdBreakType.MIDROLL)) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0) {
            this.f19461b = 1;
        } else if (c == 1) {
            this.f19461b = 3;
        } else if (c == 2) {
            this.f19461b = 4;
        } else if (c != 3) {
            this.f19461b = 0;
        } else {
            this.f19461b = 2;
        }
    }

    /* renamed from: a */
    public static C7686u2<AudioData> m20549a(String str) {
        return m20550b(str);
    }

    /* renamed from: b */
    public static <T extends C7685u1> C7686u2<T> m20550b(String str) {
        return new C7686u2<>(str);
    }

    /* renamed from: c */
    public static C7686u2<VideoData> m20551c(String str) {
        return m20550b(str);
    }

    /* renamed from: a */
    public int mo51416a() {
        return this.f19463d.size();
    }

    /* renamed from: a */
    public ArrayList<C7617q1> mo51650a(float f) {
        ArrayList<C7617q1> arrayList = new ArrayList<>();
        Iterator<C7617q1> it = this.f19465f.iterator();
        while (it.hasNext()) {
            C7617q1 next = it.next();
            if (next.mo51408s() == f) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() > 0) {
            this.f19465f.removeAll(arrayList);
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo51651a(int i) {
        this.f19467h = i;
    }

    /* renamed from: a */
    public void mo51652a(C7413g2<T> g2Var) {
        g2Var.setMediaSectionType(this.f19461b);
        this.f19463d.add(g2Var);
    }

    /* renamed from: a */
    public void mo51653a(C7413g2<T> g2Var, int i) {
        int size = this.f19463d.size();
        if (i >= 0 && i <= size) {
            g2Var.setMediaSectionType(this.f19461b);
            this.f19463d.add(i, g2Var);
            Iterator<C7617q1> it = this.f19466g.iterator();
            while (it.hasNext()) {
                C7617q1 next = it.next();
                int u = next.mo51410u();
                if (u >= i) {
                    next.mo51381c(u + 1);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo51654a(C7617q1 q1Var) {
        (q1Var.mo51415z() ? this.f19465f : q1Var.mo51414y() ? this.f19464e : this.f19466g).add(q1Var);
    }

    /* renamed from: a */
    public void mo51655a(C7686u2<T> u2Var) {
        Iterator<C7413g2<T>> it = u2Var.f19463d.iterator();
        while (it.hasNext()) {
            mo51652a(it.next());
        }
        this.f19464e.addAll(u2Var.f19464e);
        this.f19465f.addAll(u2Var.f19465f);
    }

    /* renamed from: b */
    public void mo51656b(int i) {
        this.f19468i = i;
    }

    /* renamed from: c */
    public void mo51657c() {
        this.f19466g.clear();
    }

    /* renamed from: d */
    public List<C7413g2<T>> mo51658d() {
        return new ArrayList(this.f19463d);
    }

    /* renamed from: e */
    public int mo51659e() {
        return this.f19467h;
    }

    /* renamed from: f */
    public int mo51660f() {
        return this.f19468i;
    }

    /* renamed from: g */
    public ArrayList<C7617q1> mo51661g() {
        return new ArrayList<>(this.f19465f);
    }

    /* renamed from: h */
    public String mo51662h() {
        return this.f19462c;
    }

    /* renamed from: i */
    public boolean mo51663i() {
        return !this.f19465f.isEmpty() || !this.f19464e.isEmpty();
    }

    /* renamed from: j */
    public C7617q1 mo51664j() {
        if (this.f19464e.size() > 0) {
            return this.f19464e.remove(0);
        }
        return null;
    }
}
