package com.p243my.target;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p243my.target.C7351c8;
import com.p243my.target.C7368d8;
import com.p243my.target.C7532l7;

/* renamed from: com.my.target.e8 */
public class C7388e8 extends FrameLayout implements C7368d8, C7351c8.C7352a, C7532l7.C7533a {

    /* renamed from: a */
    public final C7532l7 f18535a;

    /* renamed from: b */
    public final LinearLayoutManager f18536b;

    /* renamed from: c */
    public final C7507k7 f18537c;

    /* renamed from: d */
    public C7368d8.C7369a f18538d;

    public C7388e8(Context context) {
        super(context);
        C7532l7 l7Var = new C7532l7(context);
        this.f18535a = l7Var;
        C7351c8 c8Var = new C7351c8(context);
        c8Var.mo49846a(this);
        l7Var.setLayoutManager(c8Var);
        this.f18536b = c8Var;
        C7507k7 k7Var = new C7507k7(17);
        this.f18537c = k7Var;
        k7Var.attachToRecyclerView(l7Var);
        l7Var.setHasFixedSize(true);
        l7Var.setMoveStopListener(this);
        addView(l7Var, new FrameLayout.LayoutParams(-1, -1));
    }

    /* renamed from: a */
    public void mo49847a() {
        int i;
        C7507k7 k7Var;
        int findFirstCompletelyVisibleItemPosition = this.f18536b.findFirstCompletelyVisibleItemPosition();
        View findViewByPosition = findFirstCompletelyVisibleItemPosition >= 0 ? this.f18536b.findViewByPosition(findFirstCompletelyVisibleItemPosition) : null;
        if (this.f18535a.getChildCount() == 0 || findViewByPosition == null || ((double) getWidth()) > ((double) findViewByPosition.getWidth()) * 1.7d) {
            k7Var = this.f18537c;
            i = GravityCompat.START;
        } else {
            k7Var = this.f18537c;
            i = 17;
        }
        k7Var.mo50736a(i);
        mo50088c();
    }

    /* renamed from: a */
    public boolean mo50023a(int i) {
        return i >= this.f18536b.findFirstCompletelyVisibleItemPosition() && i <= this.f18536b.findLastCompletelyVisibleItemPosition();
    }

    /* renamed from: a */
    public final boolean mo50086a(View view) {
        return C7311a9.m18721a(view) < 50.0d;
    }

    /* renamed from: b */
    public void mo50087b() {
        mo50088c();
    }

    /* renamed from: b */
    public void mo50024b(int i) {
        this.f18537c.mo50741b(i);
    }

    /* renamed from: c */
    public final void mo50088c() {
        int[] iArr;
        if (this.f18538d != null) {
            int findFirstVisibleItemPosition = this.f18536b.findFirstVisibleItemPosition();
            int findLastVisibleItemPosition = this.f18536b.findLastVisibleItemPosition();
            if (findFirstVisibleItemPosition >= 0 && findLastVisibleItemPosition >= 0) {
                if (mo50086a(this.f18536b.findViewByPosition(findFirstVisibleItemPosition))) {
                    findFirstVisibleItemPosition++;
                }
                if (mo50086a(this.f18536b.findViewByPosition(findLastVisibleItemPosition))) {
                    findLastVisibleItemPosition--;
                }
                if (findFirstVisibleItemPosition <= findLastVisibleItemPosition) {
                    if (findFirstVisibleItemPosition == findLastVisibleItemPosition) {
                        iArr = new int[]{findFirstVisibleItemPosition};
                    } else {
                        int i = (findLastVisibleItemPosition - findFirstVisibleItemPosition) + 1;
                        int[] iArr2 = new int[i];
                        for (int i2 = 0; i2 < i; i2++) {
                            iArr2[i2] = findFirstVisibleItemPosition;
                            findFirstVisibleItemPosition++;
                        }
                        iArr = iArr2;
                    }
                    this.f18538d.mo50026a(iArr);
                }
            }
        }
    }

    public void setAdapter(C7760y7 y7Var) {
        this.f18535a.setAdapter(y7Var);
    }

    public void setListener(C7368d8.C7369a aVar) {
        this.f18538d = aVar;
    }
}
