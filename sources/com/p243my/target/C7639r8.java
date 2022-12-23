package com.p243my.target;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p243my.target.C7608p6;
import com.p243my.target.nativeads.views.IconAdView;
import com.p243my.target.nativeads.views.MediaAdView;
import com.p243my.target.nativeads.views.PromoCardRecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.my.target.r8 */
public class C7639r8 {

    /* renamed from: a */
    public final WeakReference<ViewGroup> f19301a;

    /* renamed from: b */
    public List<WeakReference<View>> f19302b;

    /* renamed from: c */
    public WeakReference<MediaAdView> f19303c;

    /* renamed from: d */
    public WeakReference<IconAdView> f19304d;

    /* renamed from: e */
    public WeakReference<C7722w5> f19305e;

    /* renamed from: f */
    public WeakReference<C7608p6> f19306f;

    /* renamed from: g */
    public WeakReference<C7707v6> f19307g;

    /* renamed from: h */
    public boolean f19308h = false;

    /* renamed from: com.my.target.r8$a */
    public static class C7640a implements Iterator<View> {

        /* renamed from: a */
        public int f19309a = 0;

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f19310b;

        public C7640a(ViewGroup viewGroup) {
            this.f19310b = viewGroup;
        }

        /* renamed from: a */
        public View next() {
            ViewGroup viewGroup = this.f19310b;
            int i = this.f19309a;
            this.f19309a = i + 1;
            return viewGroup.getChildAt(i);
        }

        public boolean hasNext() {
            return this.f19309a < this.f19310b.getChildCount();
        }
    }

    public C7639r8(ViewGroup viewGroup, MediaAdView mediaAdView) {
        this.f19301a = new WeakReference<>(viewGroup);
        if (mediaAdView != null) {
            this.f19303c = new WeakReference<>(mediaAdView);
        }
        mo51470f(viewGroup);
    }

    public C7639r8(ViewGroup viewGroup, List<View> list, MediaAdView mediaAdView, View.OnClickListener onClickListener) {
        this.f19301a = new WeakReference<>(viewGroup);
        if (mediaAdView != null) {
            this.f19303c = new WeakReference<>(mediaAdView);
        }
        if (list != null && !list.isEmpty()) {
            this.f19302b = new ArrayList();
            for (View next : list) {
                if (next != null) {
                    this.f19302b.add(new WeakReference(next));
                    if (next instanceof MediaAdView) {
                        this.f19308h = true;
                    } else {
                        next.setOnClickListener(onClickListener);
                    }
                }
            }
        }
        mo51464b(viewGroup, onClickListener);
    }

    /* renamed from: a */
    public static C7639r8 m20256a(ViewGroup viewGroup, MediaAdView mediaAdView) {
        return new C7639r8(viewGroup, mediaAdView);
    }

    /* renamed from: a */
    public static C7639r8 m20257a(ViewGroup viewGroup, List<View> list, View.OnClickListener onClickListener) {
        return new C7639r8(viewGroup, list, (MediaAdView) null, onClickListener);
    }

    /* renamed from: a */
    public static C7639r8 m20258a(ViewGroup viewGroup, List<View> list, MediaAdView mediaAdView, View.OnClickListener onClickListener) {
        return new C7639r8(viewGroup, list, mediaAdView, onClickListener);
    }

    /* renamed from: c */
    public static C7639r8 m20259c(ViewGroup viewGroup) {
        return new C7639r8(viewGroup, (MediaAdView) null);
    }

    /* renamed from: d */
    public static Iterable<View> m20260d(ViewGroup viewGroup) {
        return new Iterable(viewGroup) {
            public final /* synthetic */ ViewGroup f$0;

            {
                this.f$0 = r1;
            }

            public final Iterator iterator() {
                return C7639r8.m20261e(this.f$0);
            }
        };
    }

    /* renamed from: e */
    public static /* synthetic */ Iterator m20261e(ViewGroup viewGroup) {
        return new C7640a(viewGroup);
    }

    /* renamed from: a */
    public void mo51456a() {
        WeakReference<C7608p6> weakReference = this.f19306f;
        if (weakReference != null) {
            C7608p6 p6Var = (C7608p6) weakReference.get();
            if (p6Var != null) {
                p6Var.setViewabilityListener((C7608p6.C7609a) null);
            }
            this.f19306f.clear();
            this.f19306f = null;
        }
    }

    /* renamed from: a */
    public final void mo51457a(View view, View.OnClickListener onClickListener) {
        if (this.f19302b == null) {
            view.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: a */
    public final void mo51458a(ViewGroup viewGroup, View.OnClickListener onClickListener) {
        if (!mo51461a(viewGroup)) {
            for (View next : m20260d(viewGroup)) {
                mo51457a(next, onClickListener);
                if (!mo51460a(next) && (next instanceof ViewGroup)) {
                    mo51458a((ViewGroup) next, onClickListener);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo51459a(C7608p6 p6Var) {
        this.f19306f = new WeakReference<>(p6Var);
    }

    /* renamed from: a */
    public final boolean mo51460a(View view) {
        if (!(view instanceof IconAdView)) {
            return false;
        }
        this.f19304d = new WeakReference<>((IconAdView) view);
        return true;
    }

    /* renamed from: a */
    public final boolean mo51461a(ViewGroup viewGroup) {
        if (viewGroup instanceof PromoCardRecyclerView) {
            this.f19307g = new WeakReference<>((C7707v6) viewGroup);
            return true;
        } else if (this.f19303c != null || !(viewGroup instanceof MediaAdView)) {
            return false;
        } else {
            this.f19303c = new WeakReference<>((MediaAdView) viewGroup);
            return true;
        }
    }

    /* renamed from: b */
    public void mo51462b() {
        WeakReference<MediaAdView> weakReference = this.f19303c;
        if (weakReference != null) {
            weakReference.clear();
            this.f19303c = null;
        }
        List<WeakReference<View>> list = this.f19302b;
        if (list != null) {
            for (WeakReference<View> weakReference2 : list) {
                View view = (View) weakReference2.get();
                if (view != null) {
                    view.setOnClickListener((View.OnClickListener) null);
                }
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.f19301a.get();
        if (viewGroup != null) {
            mo51463b(viewGroup);
        }
    }

    /* renamed from: b */
    public final void mo51463b(ViewGroup viewGroup) {
        for (View next : m20260d(viewGroup)) {
            if (!(next instanceof RecyclerView) && !(next instanceof MediaAdView) && !(next instanceof C7722w5) && !(next instanceof C7608p6)) {
                next.setOnClickListener((View.OnClickListener) null);
                if (next instanceof ViewGroup) {
                    mo51463b((ViewGroup) next);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo51464b(ViewGroup viewGroup, View.OnClickListener onClickListener) {
        if (!mo51461a(viewGroup)) {
            mo51457a((View) viewGroup, onClickListener);
            for (View next : m20260d(viewGroup)) {
                if (!mo51465b(next) && !mo51460a(next)) {
                    mo51457a(next, onClickListener);
                    if (next instanceof ViewGroup) {
                        mo51458a((ViewGroup) next, onClickListener);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean mo51465b(View view) {
        if (view instanceof C7722w5) {
            this.f19305e = new WeakReference<>((C7722w5) view);
            return true;
        } else if (!(view instanceof C7608p6)) {
            return false;
        } else {
            this.f19306f = new WeakReference<>((C7608p6) view);
            return true;
        }
    }

    /* renamed from: c */
    public C7722w5 mo51466c() {
        WeakReference<C7722w5> weakReference = this.f19305e;
        if (weakReference != null) {
            return (C7722w5) weakReference.get();
        }
        return null;
    }

    /* renamed from: d */
    public Context mo51467d() {
        ViewGroup viewGroup = (ViewGroup) this.f19301a.get();
        if (viewGroup != null) {
            return viewGroup.getContext();
        }
        return null;
    }

    /* renamed from: e */
    public IconAdView mo51468e() {
        WeakReference<IconAdView> weakReference = this.f19304d;
        if (weakReference != null) {
            return (IconAdView) weakReference.get();
        }
        return null;
    }

    /* renamed from: f */
    public MediaAdView mo51469f() {
        WeakReference<MediaAdView> weakReference = this.f19303c;
        if (weakReference != null) {
            return (MediaAdView) weakReference.get();
        }
        return null;
    }

    /* renamed from: f */
    public final boolean mo51470f(ViewGroup viewGroup) {
        if (this.f19303c == null && (viewGroup instanceof MediaAdView)) {
            this.f19303c = new WeakReference<>((MediaAdView) viewGroup);
        } else if (viewGroup instanceof IconAdView) {
            this.f19304d = new WeakReference<>((IconAdView) viewGroup);
        } else {
            for (View next : m20260d(viewGroup)) {
                if ((next instanceof ViewGroup) && mo51470f((ViewGroup) next)) {
                    return true;
                }
            }
        }
        return (this.f19303c == null || this.f19304d == null) ? false : true;
    }

    /* renamed from: g */
    public C7707v6 mo51471g() {
        WeakReference<C7707v6> weakReference = this.f19307g;
        if (weakReference != null) {
            return (C7707v6) weakReference.get();
        }
        return null;
    }

    /* renamed from: h */
    public ViewGroup mo51472h() {
        return (ViewGroup) this.f19301a.get();
    }

    /* renamed from: i */
    public C7608p6 mo51473i() {
        WeakReference<C7608p6> weakReference = this.f19306f;
        if (weakReference != null) {
            return (C7608p6) weakReference.get();
        }
        return null;
    }

    /* renamed from: j */
    public boolean mo51474j() {
        return this.f19302b == null || this.f19308h;
    }
}
