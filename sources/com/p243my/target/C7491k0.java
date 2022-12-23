package com.p243my.target;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.p243my.target.C7409g0;
import java.lang.ref.WeakReference;

/* renamed from: com.my.target.k0 */
public final class C7491k0 extends C7409g0 {

    /* renamed from: e */
    public int f18849e;

    /* renamed from: f */
    public C7492a f18850f;

    /* renamed from: com.my.target.k0$a */
    public class C7492a implements View.OnLayoutChangeListener {
        public C7492a() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            WeakReference<C7722w5> weakReference = C7491k0.this.f18605d;
            C7722w5 w5Var = weakReference != null ? (C7722w5) weakReference.get() : null;
            if (w5Var != null) {
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                int measuredWidth2 = w5Var.getMeasuredWidth();
                int measuredHeight2 = w5Var.getMeasuredHeight();
                int i15 = C7491k0.this.f18849e;
                if (i15 != 1) {
                    if (i15 == 2) {
                        int paddingLeft = (measuredWidth - measuredWidth2) - view.getPaddingLeft();
                        i13 = (measuredHeight - view.getPaddingBottom()) - measuredHeight2;
                        i12 = measuredWidth - view.getPaddingRight();
                        i14 = measuredHeight - view.getPaddingBottom();
                        i11 = paddingLeft;
                    } else if (i15 == 3) {
                        int paddingLeft2 = view.getPaddingLeft();
                        i13 = (measuredHeight - view.getPaddingBottom()) - measuredHeight2;
                        i14 = measuredHeight - view.getPaddingBottom();
                        i11 = paddingLeft2;
                        i12 = measuredWidth2 + view.getPaddingLeft();
                    } else if (i15 != 4) {
                        i11 = (measuredWidth - measuredWidth2) - view.getPaddingLeft();
                        i10 = view.getPaddingTop();
                        i12 = measuredWidth - view.getPaddingRight();
                        i9 = measuredHeight2 + view.getPaddingTop();
                    } else {
                        return;
                    }
                    i10 = i13;
                    i9 = i14;
                } else {
                    i11 = view.getPaddingLeft();
                    int paddingTop = view.getPaddingTop();
                    i9 = measuredHeight2 + view.getPaddingTop();
                    int paddingLeft3 = measuredWidth2 + view.getPaddingLeft();
                    i10 = paddingTop;
                    i12 = paddingLeft3;
                }
                w5Var.layout(i11, i10, i12, i9);
            }
        }
    }

    public C7491k0(C7596p1 p1Var) {
        super(p1Var);
        if (p1Var != null) {
            this.f18850f = new C7492a();
        }
    }

    /* renamed from: b */
    public static C7491k0 m19526b(C7596p1 p1Var) {
        return new C7491k0(p1Var);
    }

    /* renamed from: a */
    public void mo50609a(View view) {
        super.mo50160a();
        C7492a aVar = this.f18850f;
        if (aVar != null) {
            view.removeOnLayoutChangeListener(aVar);
        }
    }

    /* renamed from: a */
    public void mo50610a(ViewGroup viewGroup, C7722w5 w5Var, C7409g0.C7411b bVar, int i) {
        this.f18849e = i;
        if (this.f18602a != null) {
            if (w5Var == null) {
                Context context = viewGroup.getContext();
                C7722w5 w5Var2 = new C7722w5(context);
                C7761y8.m20947b(w5Var2, "ad_choices");
                int a = C7761y8.m20931a(2, context);
                w5Var2.setPadding(a, a, a, a);
                w5Var = w5Var2;
            }
            if (w5Var.getParent() == null) {
                try {
                    viewGroup.addView(w5Var);
                } catch (Throwable th) {
                    C7374e0.m18989a("Unable to add AdChoices View: " + th.getMessage());
                }
            }
            if (i != 4) {
                viewGroup.addOnLayoutChangeListener(this.f18850f);
            }
            super.mo50162a(w5Var, bVar);
        } else if (w5Var != null) {
            mo50161a(w5Var);
        }
    }
}
