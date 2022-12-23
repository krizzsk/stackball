package com.p243my.target;

import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.my.target.l7 */
public class C7532l7 extends RecyclerView {

    /* renamed from: a */
    public C7533a f18954a;

    /* renamed from: com.my.target.l7$a */
    public interface C7533a {
        /* renamed from: b */
        void mo50087b();
    }

    public C7532l7(Context context) {
        super(context);
    }

    public void onScrollStateChanged(int i) {
        C7533a aVar;
        super.onScrollStateChanged(i);
        if (!(i != 0) && (aVar = this.f18954a) != null) {
            aVar.mo50087b();
        }
    }

    public void setMoveStopListener(C7533a aVar) {
        this.f18954a = aVar;
    }

    public void smoothScrollBy(int i, int i2) {
        super.smoothScrollBy(i, i2, new AccelerateDecelerateInterpolator());
    }
}
