package com.p243my.target;

import com.p243my.target.C7620q4;
import com.p243my.target.C7782z7;

/* renamed from: com.my.target.r4 */
public class C7634r4 implements C7620q4, C7782z7.C7783a {

    /* renamed from: a */
    public final C7342c2 f19298a;

    /* renamed from: b */
    public final C7620q4.C7621a f19299b;

    /* renamed from: c */
    public int f19300c;

    public C7634r4(C7342c2 c2Var, C7620q4.C7621a aVar) {
        this.f19298a = c2Var;
        this.f19299b = aVar;
    }

    /* renamed from: a */
    public static C7620q4 m20242a(C7342c2 c2Var, C7620q4.C7621a aVar) {
        return new C7634r4(c2Var, aVar);
    }

    /* renamed from: a */
    public void mo51422a(C7782z7 z7Var) {
        z7Var.setBanner((C7342c2) null);
        z7Var.setListener((C7782z7.C7783a) null);
    }

    /* renamed from: a */
    public void mo51423a(C7782z7 z7Var, int i) {
        this.f19300c = i;
        this.f19299b.mo51424a(this.f19298a);
        z7Var.setBanner(this.f19298a);
        z7Var.setListener(this);
    }

    /* renamed from: a */
    public void mo51454a(boolean z) {
        this.f19299b.mo51425a(this.f19298a, z, this.f19300c);
    }
}
