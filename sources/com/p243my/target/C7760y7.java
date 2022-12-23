package com.p243my.target;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: com.my.target.y7 */
public class C7760y7 extends RecyclerView.Adapter<C7335b8> {

    /* renamed from: a */
    public final List<C7620q4> f19717a;

    /* renamed from: b */
    public final C7565n7 f19718b;

    public C7760y7(List<C7620q4> list, C7565n7 n7Var) {
        this.f19717a = list;
        this.f19718b = n7Var;
    }

    /* renamed from: a */
    public C7335b8 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7782z7 a = this.f19718b.mo51010a();
        a.mo49611a().setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new C7335b8(a);
    }

    /* renamed from: a */
    public void onBindViewHolder(C7335b8 b8Var, int i) {
        b8Var.mo49771a(this.f19717a.get(i), i);
    }

    /* renamed from: a */
    public boolean onFailedToRecycleView(C7335b8 b8Var) {
        b8Var.mo49770a();
        return super.onFailedToRecycleView(b8Var);
    }

    /* renamed from: b */
    public void onViewRecycled(C7335b8 b8Var) {
        b8Var.mo49770a();
        super.onViewRecycled(b8Var);
    }

    public int getItemCount() {
        return this.f19717a.size();
    }
}
