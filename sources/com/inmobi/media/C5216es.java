package com.inmobi.media;

import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.inmobi.ads.viewsv2.NativeRecyclerViewAdapter;
import com.inmobi.media.C5177ek;

/* renamed from: com.inmobi.media.es */
/* compiled from: ScrollableDeckFreeContainer */
class C5216es extends C5177ek {

    /* renamed from: a */
    private RecyclerView f11985a;

    /* renamed from: b */
    private boolean f11986b = false;

    public C5216es(Context context) {
        super(context, (byte) 1);
    }

    /* renamed from: a */
    public final void mo40473a(C5012bh bhVar, C5179el elVar, int i, int i2, C5177ek.C5178a aVar) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) C5198eq.m11897a(bhVar.mo40173a(0), (ViewGroup) this);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(20);
            layoutParams.setMarginEnd(20);
        } else {
            layoutParams.setMargins(20, 0, 20, 0);
        }
        layoutParams.gravity = i2;
        RecyclerView recyclerView = new RecyclerView(getContext());
        this.f11985a = recyclerView;
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f11985a.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        addView(this.f11985a);
        this.f11985a.setAdapter((NativeRecyclerViewAdapter) elVar);
    }
}
