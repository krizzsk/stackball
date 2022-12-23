package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.yandex.mobile.ads.impl.C12667bz;
import com.yandex.mobile.ads.impl.C14065nb;
import com.yandex.mobile.ads.impl.vr1;
import java.util.List;

public class sc1<ACTION> extends vr1 implements C14065nb.C14067b<ACTION> {
    /* access modifiers changed from: private */

    /* renamed from: E */
    public C14065nb.C14067b.C14068a<ACTION> f39925E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public List<? extends C14065nb.C14073g.C14074a<ACTION>> f39926F;

    /* renamed from: G */
    private eo1 f39927G;

    /* renamed from: H */
    private String f39928H;

    /* renamed from: I */
    private C12667bz.C12677h f39929I;

    /* renamed from: J */
    private C14584b f39930J;

    /* renamed from: K */
    private boolean f39931K;

    /* renamed from: com.yandex.mobile.ads.impl.sc1$a */
    class C14583a implements vr1.C14917b {
        C14583a() {
        }

        /* renamed from: a */
        public void mo69947a(vr1.C14921e eVar) {
        }

        /* renamed from: b */
        public void mo69948b(vr1.C14921e eVar) {
            Object obj;
            if (sc1.this.f39925E != null) {
                int a = eVar.mo70559a();
                if (sc1.this.f39926F != null) {
                    C14065nb.C14073g.C14074a aVar = (C14065nb.C14073g.C14074a) sc1.this.f39926F.get(a);
                    if (aVar == null) {
                        obj = null;
                    } else {
                        obj = aVar.mo67699b();
                    }
                    if (obj != null) {
                        C14065nb.this.f37699j.mo67907a(obj, a);
                    }
                }
            }
        }

        /* renamed from: c */
        public void mo69949c(vr1.C14921e eVar) {
            if (sc1.this.f39925E != null) {
                C14065nb.this.f37692c.setCurrentItem(eVar.mo70559a());
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sc1$b */
    public interface C14584b {
        /* renamed from: a */
        void mo65501a();
    }

    /* renamed from: com.yandex.mobile.ads.impl.sc1$c */
    public static class C14585c implements ao1<tc1> {

        /* renamed from: a */
        private final Context f39933a;

        public C14585c(Context context) {
            this.f39933a = context;
        }

        /* renamed from: a */
        public View mo65489a() {
            return new tc1(this.f39933a);
        }
    }

    public sc1(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0) {
            this.f39931K = true;
        }
        return dispatchTouchEvent;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C14584b bVar = this.f39930J;
        if (bVar != null && this.f39931K) {
            bVar.mo65501a();
            this.f39931K = false;
        }
    }

    public void setData(List<? extends C14065nb.C14073g.C14074a<ACTION>> list, int i, j50 j50, l50 l50) {
        this.f39926F = list;
        mo70534h();
        int size = list.size();
        if (i < 0 || i >= size) {
            i = 0;
        }
        int i2 = 0;
        while (i2 < size) {
            vr1.C14921e a = mo70532f().mo70560a((CharSequence) ((C14065nb.C14073g.C14074a) list.get(i2)).mo67700c());
            tc1 b = a.mo70562b();
            C12667bz.C12677h hVar = this.f39929I;
            if (hVar != null) {
                C13262gz.m36735a(b, hVar, j50, l50);
            }
            mo70522a(a, i2 == i);
            i2++;
        }
    }

    public void setHost(C14065nb.C14067b.C14068a<ACTION> aVar) {
        this.f39925E = aVar;
    }

    public void setIntermediateState(int i, float f) {
    }

    public void setOnScrollChangedListener(C14584b bVar) {
        this.f39930J = bVar;
    }

    public void setTabColors(int i, int i2, int i3) {
        setTabTextColors(i3, i);
        setSelectedTabIndicatorColor(i2);
    }

    public void setTabTitleStyle(C12667bz.C12677h hVar) {
        this.f39929I = hVar;
    }

    public void setTypefaceProvider(eg1 eg1) {
        mo70521a(eg1);
    }

    public void setViewPool(eo1 eo1, String str) {
        this.f39927G = eo1;
        this.f39928H = str;
    }

    public sc1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public tc1 mo69941a(Context context) {
        return (tc1) this.f39927G.mo65946a(this.f39928H);
    }

    /* renamed from: b */
    public void mo68952b(int i) {
        mo70531e(i);
    }

    public sc1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39931K = false;
        setTabMode(0);
        setSelectedTabIndicatorHeight(0);
        setOnTabSelectedListener(new C14583a());
        b21 b21 = new b21();
        b21.mo65947a("TabTitlesLayoutView.TAB_HEADER", new C14585c(getContext()), 0);
        this.f39927G = b21;
        this.f39928H = "TabTitlesLayoutView.TAB_HEADER";
    }

    /* renamed from: a */
    public void mo68951a(int i) {
        mo70531e(i);
    }

    /* renamed from: a */
    public ViewPager.OnPageChangeListener mo68950a() {
        vr1.C14922f c = mo70528c();
        c.mo70565a();
        return c;
    }
}
