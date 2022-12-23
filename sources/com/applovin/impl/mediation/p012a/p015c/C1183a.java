package com.applovin.impl.mediation.p012a.p015c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.applovin.impl.mediation.p012a.p013a.C1173b;
import com.applovin.impl.mediation.p012a.p013a.C1174c;
import com.applovin.sdk.C1701R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.mediation.a.c.a */
public abstract class C1183a extends BaseAdapter implements View.OnClickListener {

    /* renamed from: a */
    protected final Context f2246a;

    /* renamed from: b */
    protected final List<C1174c> f2247b = new ArrayList();

    /* renamed from: c */
    private final LayoutInflater f2248c;

    protected C1183a(Context context) {
        this.f2246a = context;
        this.f2248c = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: a */
    public C1174c getItem(int i) {
        return this.f2247b.get(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo12196a(C1174c cVar);

    public boolean areAllItemsEnabled() {
        return false;
    }

    public int getCount() {
        return this.f2247b.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getItemViewType(int i) {
        return getItem(i).mo12160e();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C1173b bVar;
        C1174c a = getItem(i);
        if (view == null) {
            view = this.f2248c.inflate(a.mo12161f(), viewGroup, false);
            bVar = new C1173b();
            bVar.f2199a = (TextView) view.findViewById(16908308);
            bVar.f2200b = (TextView) view.findViewById(16908309);
            bVar.f2201c = (ImageView) view.findViewById(C1701R.C1703id.imageView);
            bVar.f2202d = (ImageView) view.findViewById(C1701R.C1703id.detailImageView);
            view.setTag(bVar);
            view.setOnClickListener(this);
        } else {
            bVar = (C1173b) view.getTag();
        }
        bVar.mo12156a(a);
        view.setEnabled(a.mo12157b());
        return view;
    }

    public int getViewTypeCount() {
        return C1174c.m1872a();
    }

    public boolean isEnabled(int i) {
        return getItem(i).mo12157b();
    }

    public void onClick(View view) {
        mo12196a(((C1173b) view.getTag()).mo12155a());
    }
}
