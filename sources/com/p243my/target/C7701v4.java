package com.p243my.target;

import com.p243my.target.C7368d8;
import com.p243my.target.C7720w4;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.v4 */
public class C7701v4 implements C7720w4, C7368d8.C7369a {

    /* renamed from: a */
    public final C7368d8 f19512a;

    /* renamed from: b */
    public final C7720w4.C7721a f19513b;

    /* renamed from: c */
    public final boolean[] f19514c;

    /* renamed from: d */
    public final List<C7768z1> f19515d = new ArrayList();

    /* renamed from: e */
    public final List<C7342c2> f19516e;

    public C7701v4(C7368d8 d8Var, List<C7342c2> list, C7720w4.C7721a aVar) {
        this.f19512a = d8Var;
        this.f19513b = aVar;
        this.f19516e = new ArrayList(list);
        this.f19514c = new boolean[list.size()];
        d8Var.setListener(this);
    }

    /* renamed from: a */
    public static C7720w4 m20669a(C7368d8 d8Var, List<C7342c2> list, C7720w4.C7721a aVar) {
        return new C7701v4(d8Var, list, aVar);
    }

    /* renamed from: a */
    public void mo51424a(C7768z1 z1Var) {
        if (!this.f19515d.contains(z1Var)) {
            this.f19513b.mo51670c(z1Var);
            this.f19515d.add(z1Var);
        }
    }

    /* renamed from: a */
    public void mo51425a(C7768z1 z1Var, boolean z, int i) {
        if (!this.f19512a.mo50023a(i)) {
            this.f19512a.mo50024b(i);
        } else if (z) {
            this.f19513b.mo51530a(z1Var);
        }
    }

    /* renamed from: a */
    public void mo50026a(int[] iArr) {
        for (int i : iArr) {
            if (i >= 0) {
                boolean[] zArr = this.f19514c;
                if (i < zArr.length && !zArr[i]) {
                    zArr[i] = true;
                    this.f19513b.mo51669b(this.f19516e.get(i));
                }
            }
        }
    }
}
