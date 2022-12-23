package com.p243my.target;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.my.target.b8 */
public class C7335b8 extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public final C7782z7 f18384a;

    /* renamed from: b */
    public C7620q4 f18385b;

    public C7335b8(C7782z7 z7Var) {
        super(z7Var.mo49611a());
        this.f18384a = z7Var;
    }

    /* renamed from: a */
    public void mo49770a() {
        C7620q4 q4Var = this.f18385b;
        if (q4Var != null) {
            q4Var.mo51422a(this.f18384a);
        }
        this.f18385b = null;
    }

    /* renamed from: a */
    public void mo49771a(C7620q4 q4Var, int i) {
        this.f18385b = q4Var;
        q4Var.mo51423a(this.f18384a, i);
    }
}
