package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.yandex.mobile.ads.impl.C14065nb.C14073g.C14074a;
import com.yandex.mobile.ads.impl.do1;
import com.yandex.mobile.ads.impl.s90;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.yandex.mobile.ads.impl.nb */
public abstract class C14065nb<TAB_DATA extends C14073g.C14074a<ACTION>, TAB_VIEW, ACTION> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final eo1 f37690a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C14067b<ACTION> f37691b;

    /* renamed from: c */
    protected final c71 f37692c;

    /* renamed from: d */
    private s90 f37693d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final do1 f37694e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public do1.C12908a f37695f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Map<ViewGroup, C14065nb<TAB_DATA, TAB_VIEW, ACTION>.e> f37696g = new ArrayMap();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Map<Integer, C14065nb<TAB_DATA, TAB_VIEW, ACTION>.e> f37697h = new ArrayMap();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final String f37698i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C14069c<ACTION> f37699j;

    /* renamed from: k */
    private final PagerAdapter f37700k = new C14066a();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f37701l = false;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C14073g<TAB_DATA> f37702m = null;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f37703n = false;

    /* renamed from: com.yandex.mobile.ads.impl.nb$a */
    class C14066a extends PagerAdapter {

        /* renamed from: a */
        private SparseArray<Parcelable> f37704a;

        C14066a() {
        }

        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            ViewGroup viewGroup2 = (ViewGroup) obj;
            ((C14071e) C14065nb.this.f37696g.remove(viewGroup2)).mo68959b();
            C14065nb.this.f37697h.remove(Integer.valueOf(i));
            viewGroup.removeView(viewGroup2);
        }

        public int getCount() {
            if (C14065nb.this.f37702m == null) {
                return 0;
            }
            return C14065nb.this.f37702m.mo65499a().size();
        }

        public int getItemPosition(Object obj) {
            return -2;
        }

        public Object instantiateItem(ViewGroup viewGroup, int i) {
            ViewGroup viewGroup2;
            C14071e eVar = (C14071e) C14065nb.this.f37697h.get(Integer.valueOf(i));
            if (eVar != null) {
                viewGroup2 = eVar.f37707a;
                eVar.f37707a.getParent();
            } else {
                ViewGroup viewGroup3 = (ViewGroup) C14065nb.this.f37690a.mo65946a(C14065nb.this.f37698i);
                C14065nb nbVar = C14065nb.this;
                C14071e eVar2 = new C14071e(nbVar, viewGroup3, (C14073g.C14074a) C14065nb.this.f37702m.mo65499a().get(i), i, (C14066a) null);
                nbVar.f37697h.put(Integer.valueOf(i), eVar2);
                viewGroup2 = viewGroup3;
                eVar = eVar2;
            }
            viewGroup.addView(viewGroup2);
            C14065nb.this.f37696g.put(viewGroup2, eVar);
            if (i == C14065nb.this.f37692c.getCurrentItem()) {
                eVar.mo68958a();
            }
            SparseArray<Parcelable> sparseArray = this.f37704a;
            if (sparseArray != null) {
                viewGroup2.restoreHierarchyState(sparseArray);
            }
            return viewGroup2;
        }

        public boolean isViewFromObject(View view, Object obj) {
            return obj == view;
        }

        public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
            if (!(parcelable instanceof Bundle)) {
                this.f37704a = null;
                return;
            }
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(C14066a.class.getClassLoader());
            this.f37704a = bundle.getSparseParcelableArray("div_tabs_child_states");
        }

        public Parcelable saveState() {
            SparseArray sparseArray = new SparseArray(C14065nb.this.f37696g.size());
            for (ViewGroup saveHierarchyState : C14065nb.this.f37696g.keySet()) {
                saveHierarchyState.saveHierarchyState(sparseArray);
            }
            Bundle bundle = new Bundle();
            bundle.putSparseParcelableArray("div_tabs_child_states", sparseArray);
            return bundle;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.nb$b */
    public interface C14067b<ACTION> {

        /* renamed from: com.yandex.mobile.ads.impl.nb$b$a */
        public interface C14068a<ACTION> {
        }

        /* renamed from: a */
        ViewPager.OnPageChangeListener mo68950a();

        /* renamed from: a */
        void mo68951a(int i);

        /* renamed from: b */
        void mo68952b(int i);

        void setData(List<? extends C14073g.C14074a<ACTION>> list, int i, j50 j50, l50 l50);

        void setHost(C14068a<ACTION> aVar);

        void setIntermediateState(int i, float f);

        void setTypefaceProvider(eg1 eg1);

        void setViewPool(eo1 eo1, String str);
    }

    /* renamed from: com.yandex.mobile.ads.impl.nb$c */
    public interface C14069c<ACTION> {
        /* renamed from: a */
        void mo67907a(ACTION action, int i);
    }

    /* renamed from: com.yandex.mobile.ads.impl.nb$d */
    private class C14070d implements C14067b.C14068a<ACTION> {
        private C14070d() {
        }

        /* synthetic */ C14070d(C14065nb nbVar, C14066a aVar) {
            this();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.nb$e */
    private class C14071e {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final ViewGroup f37707a;

        /* renamed from: b */
        private final TAB_DATA f37708b;

        /* renamed from: c */
        private final int f37709c;

        /* renamed from: d */
        private TAB_VIEW f37710d;

        /* synthetic */ C14071e(C14065nb nbVar, ViewGroup viewGroup, C14073g.C14074a aVar, int i, C14066a aVar2) {
            this(viewGroup, aVar, i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo68959b() {
            TAB_VIEW tab_view = this.f37710d;
            if (tab_view != null) {
                C14065nb.this.mo66372a(tab_view);
                this.f37710d = null;
            }
        }

        private C14071e(ViewGroup viewGroup, TAB_DATA tab_data, int i) {
            this.f37707a = viewGroup;
            this.f37708b = tab_data;
            this.f37709c = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo68958a() {
            if (this.f37710d == null) {
                this.f37710d = C14065nb.this.mo66369a(this.f37707a, this.f37708b, this.f37709c);
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.nb$f */
    private class C14072f implements ViewPager.PageTransformer {
        private C14072f() {
        }

        public void transformPage(View view, float f) {
            C14071e eVar;
            if (!C14065nb.this.f37703n && f > -1.0f && f < 1.0f && (eVar = (C14071e) C14065nb.this.f37696g.get(view)) != null) {
                eVar.mo68958a();
            }
        }

        /* synthetic */ C14072f(C14065nb nbVar, C14066a aVar) {
            this();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.nb$g */
    public interface C14073g<TAB extends C14074a> {

        /* renamed from: com.yandex.mobile.ads.impl.nb$g$a */
        public interface C14074a<ACTION> {
            /* renamed from: a */
            Integer mo67698a();

            /* renamed from: b */
            ACTION mo67699b();

            /* renamed from: c */
            String mo67700c();
        }

        /* renamed from: a */
        List<? extends TAB> mo65499a();
    }

    /* renamed from: com.yandex.mobile.ads.impl.nb$i */
    public static class C14076i {

        /* renamed from: a */
        private final int f37715a;

        /* renamed from: b */
        private final int f37716b;

        /* renamed from: c */
        private final int f37717c;

        public C14076i(int i, int i2, int i3, boolean z, boolean z2, String str, String str2) {
            this.f37715a = i;
            this.f37716b = i2;
            this.f37717c = i3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo68960a() {
            return this.f37717c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo68961b() {
            return this.f37716b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo68962c() {
            return this.f37715a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public String mo68963d() {
            return "DIV2.TAB_HEADER_VIEW";
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public String mo68964e() {
            return "DIV2.TAB_ITEM_VIEW";
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo68965f() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public boolean mo68966g() {
            return true;
        }
    }

    public C14065nb(eo1 eo1, View view, C14076i iVar, s90 s90, rc1 rc1, ViewPager.OnPageChangeListener onPageChangeListener, C14069c<ACTION> cVar) {
        this.f37690a = eo1;
        this.f37693d = s90;
        this.f37699j = cVar;
        C14070d dVar = new C14070d(this, (C14066a) null);
        String d = iVar.mo68963d();
        this.f37698i = iVar.mo68964e();
        C14067b<ACTION> bVar = (C14067b) vo1.m43177a(view, iVar.mo68962c());
        this.f37691b = bVar;
        bVar.setHost(dVar);
        bVar.setTypefaceProvider(rc1.mo69753a());
        bVar.setViewPool(eo1, d);
        c71 c71 = (c71) vo1.m43177a(view, iVar.mo68961b());
        this.f37692c = c71;
        c71.setAdapter((PagerAdapter) null);
        c71.clearOnPageChangeListeners();
        c71.addOnPageChangeListener(new C14075h(this, (C14066a) null));
        ViewPager.OnPageChangeListener a = bVar.mo68950a();
        if (a != null) {
            c71.addOnPageChangeListener(a);
        }
        if (onPageChangeListener != null) {
            c71.addOnPageChangeListener(onPageChangeListener);
        }
        c71.setScrollEnabled(iVar.mo68966g());
        c71.setEdgeScrollEnabled(iVar.mo68965f());
        c71.setPageTransformer(false, new C14072f(this, (C14066a) null));
        this.f37694e = (do1) vo1.m43177a(view, iVar.mo68960a());
        m39903b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract TAB_VIEW mo66369a(ViewGroup viewGroup, TAB_DATA tab_data, int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo66372a(TAB_VIEW tab_view);

    /* renamed from: b */
    private void m39903b() {
        if (this.f37694e != null) {
            do1.C12908a a = this.f37693d.mo65484a((ViewGroup) this.f37690a.mo65946a(this.f37698i), new s90.C14572b() {
                /* renamed from: a */
                public final int mo65556a(ViewGroup viewGroup, int i, int i2) {
                    return C14065nb.this.m39899a(viewGroup, i, i2);
                }
            }, new s90.C14571a() {
                /* renamed from: a */
                public final int mo65555a() {
                    return C14065nb.this.m39898a();
                }
            });
            this.f37695f = a;
            this.f37694e.setHeightCalculator(a);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.nb$h */
    private class C14075h implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        int f37713a;

        private C14075h() {
            this.f37713a = 0;
        }

        /* renamed from: a */
        private void m39929a(int i, float f) {
            if (C14065nb.this.f37694e != null && C14065nb.this.f37695f != null && C14065nb.this.f37695f.mo66653a(i, f)) {
                ((C13841lb) C14065nb.this.f37695f).mo68395b(i, f);
                if (C14065nb.this.f37694e.isInLayout()) {
                    do1 g = C14065nb.this.f37694e;
                    do1 g2 = C14065nb.this.f37694e;
                    Objects.requireNonNull(g2);
                    g.post(new Runnable() {
                        public final void run() {
                            do1.this.requestLayout();
                        }
                    });
                    return;
                }
                C14065nb.this.f37694e.requestLayout();
            }
        }

        public void onPageScrollStateChanged(int i) {
            this.f37713a = i;
            if (i == 0) {
                int currentItem = C14065nb.this.f37692c.getCurrentItem();
                m39928a(currentItem);
                if (!C14065nb.this.f37701l) {
                    C14065nb.this.f37691b.mo68952b(currentItem);
                }
                boolean unused = C14065nb.this.f37701l = false;
            }
        }

        public void onPageScrolled(int i, float f, int i2) {
            if (this.f37713a != 0) {
                m39929a(i, f);
            }
            if (!C14065nb.this.f37701l) {
                C14065nb.this.f37691b.setIntermediateState(i, f);
            }
        }

        public void onPageSelected(int i) {
            if (C14065nb.this.f37695f == null) {
                C14065nb.this.f37692c.requestLayout();
            } else if (this.f37713a == 0) {
                m39928a(i);
            }
        }

        /* synthetic */ C14075h(C14065nb nbVar, C14066a aVar) {
            this();
        }

        /* renamed from: a */
        private void m39928a(int i) {
            if (C14065nb.this.f37695f != null && C14065nb.this.f37694e != null) {
                ((C13841lb) C14065nb.this.f37695f).mo68395b(i, 0.0f);
                C14065nb.this.f37694e.requestLayout();
            }
        }
    }

    /* renamed from: a */
    public void mo68948a(C14073g<TAB_DATA> gVar, j50 j50, l50 l50) {
        int i;
        List<? extends TAB_DATA> list;
        int currentItem = this.f37692c.getCurrentItem();
        if (gVar == null) {
            i = -1;
        } else {
            i = Math.min(currentItem, gVar.mo65499a().size() - 1);
        }
        this.f37697h.clear();
        this.f37702m = gVar;
        if (this.f37692c.getAdapter() != null) {
            this.f37703n = true;
            try {
                this.f37700k.notifyDataSetChanged();
            } finally {
                this.f37703n = false;
            }
        }
        if (gVar == null) {
            list = Collections.emptyList();
        } else {
            list = gVar.mo65499a();
        }
        this.f37691b.setData(list, i, j50, l50);
        if (this.f37692c.getAdapter() == null) {
            this.f37692c.setAdapter(this.f37700k);
        } else if (!list.isEmpty() && i != -1) {
            this.f37692c.setCurrentItem(i);
            this.f37691b.mo68951a(i);
        }
        do1.C12908a aVar = this.f37695f;
        if (aVar != null) {
            ((C13841lb) aVar).mo68394a();
        }
        do1 do1 = this.f37694e;
        if (do1 != null) {
            do1.requestLayout();
        }
    }

    /* renamed from: a */
    public void mo68949a(Set<Integer> set) {
        this.f37692c.setDisabledScrollPages(set);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int m39898a() {
        C14073g<TAB_DATA> gVar = this.f37702m;
        if (gVar == null) {
            return 0;
        }
        return gVar.mo65499a().size();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int m39899a(ViewGroup viewGroup, int i, int i2) {
        C14071e eVar;
        ViewGroup viewGroup2;
        int measuredHeight;
        if (this.f37702m == null) {
            return -1;
        }
        do1 do1 = this.f37694e;
        int a = do1 != null ? do1.mo66648a() : 0;
        List<? extends TAB_DATA> a2 = this.f37702m.mo65499a();
        if (i2 >= 0) {
            a2.size();
        }
        C14073g.C14074a aVar = (C14073g.C14074a) a2.get(i2);
        Integer a3 = aVar.mo67698a();
        if (a3 != null) {
            measuredHeight = a3.intValue();
        } else {
            C14071e eVar2 = this.f37697h.get(Integer.valueOf(i2));
            if (eVar2 == null) {
                viewGroup2 = (ViewGroup) this.f37690a.mo65946a(this.f37698i);
                eVar = new C14071e(this, viewGroup2, aVar, i2, (C14066a) null);
                this.f37697h.put(Integer.valueOf(i2), eVar);
            } else {
                eVar = eVar2;
                viewGroup2 = eVar2.f37707a;
            }
            eVar.mo68958a();
            viewGroup2.forceLayout();
            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            measuredHeight = viewGroup2.getMeasuredHeight();
        }
        return measuredHeight + a;
    }
}
