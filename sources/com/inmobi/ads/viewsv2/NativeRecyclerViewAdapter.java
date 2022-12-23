package com.inmobi.ads.viewsv2;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.inmobi.media.C5010bf;
import com.inmobi.media.C5012bh;
import com.inmobi.media.C5016bj;
import com.inmobi.media.C5162eh;
import com.inmobi.media.C5179el;
import com.inmobi.media.C5198eq;
import java.lang.ref.WeakReference;

public class NativeRecyclerViewAdapter extends RecyclerView.Adapter<C4919a> implements C5179el {

    /* renamed from: a */
    private static final String f11110a = NativeRecyclerViewAdapter.class.getSimpleName();

    /* renamed from: b */
    private C5016bj f11111b;

    /* renamed from: c */
    private C5162eh f11112c;

    /* renamed from: d */
    private SparseArray<WeakReference<View>> f11113d = new SparseArray<>();

    public NativeRecyclerViewAdapter(C5016bj bjVar, C5162eh ehVar) {
        this.f11111b = bjVar;
        this.f11112c = ehVar;
    }

    /* renamed from: com.inmobi.ads.viewsv2.NativeRecyclerViewAdapter$a */
    class C4919a extends RecyclerView.ViewHolder {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public ViewGroup f11115b;

        C4919a(View view) {
            super(view);
            this.f11115b = (ViewGroup) view;
        }
    }

    public C4919a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C4919a(new FrameLayout(viewGroup.getContext()));
    }

    public void onBindViewHolder(C4919a aVar, int i) {
        View view;
        C5016bj bjVar = this.f11111b;
        C5012bh a = bjVar == null ? null : bjVar.mo40180a(i);
        WeakReference weakReference = this.f11113d.get(i);
        if (a != null) {
            if (weakReference == null || (view = (View) weakReference.get()) == null) {
                view = buildScrollableView(i, aVar.f11115b, a);
            }
            if (view != null) {
                if (i != getItemCount() - 1) {
                    aVar.f11115b.setPadding(0, 0, 16, 0);
                }
                aVar.f11115b.addView(view);
                this.f11113d.put(i, new WeakReference(view));
            }
        }
    }

    public void onViewRecycled(C4919a aVar) {
        aVar.f11115b.removeAllViews();
        super.onViewRecycled(aVar);
    }

    public ViewGroup buildScrollableView(int i, ViewGroup viewGroup, C5012bh bhVar) {
        ViewGroup a = this.f11112c.mo40456a(viewGroup, bhVar);
        this.f11112c.mo40459b(a, bhVar);
        a.setLayoutParams(C5198eq.m11897a((C5010bf) bhVar, viewGroup));
        return a;
    }

    public int getItemCount() {
        C5016bj bjVar = this.f11111b;
        if (bjVar == null) {
            return 0;
        }
        return bjVar.mo40184c();
    }

    public void destroy() {
        C5016bj bjVar = this.f11111b;
        if (bjVar != null) {
            bjVar.f11409h = null;
            bjVar.f11407f = null;
            this.f11111b = null;
        }
        this.f11112c = null;
    }
}
