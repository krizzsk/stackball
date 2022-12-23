package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.inmobi.media.C5098cz;
import com.inmobi.media.C5162eh;

/* renamed from: com.inmobi.media.eg */
/* compiled from: NativeInflater */
public class C5159eg extends C5098cz.C5099a implements C5162eh.C5173b {

    /* renamed from: c */
    private static final String f11849c = C5159eg.class.getSimpleName();

    /* renamed from: b */
    public final C5162eh f11850b;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C5397j f11851d;

    public C5159eg(Context context, C5220ev evVar, C5397j jVar, C5016bj bjVar) {
        this.f11851d = jVar;
        Context context2 = context;
        C5220ev evVar2 = evVar;
        this.f11850b = new C5162eh(context2, evVar2, this.f11851d, bjVar, new C5162eh.C5174c() {
            /* renamed from: a */
            public final void mo40453a(int i, C5010bf bfVar) {
                if (!C5159eg.this.f11692a) {
                    C5159eg.this.f11851d.mo40769a(i, bfVar);
                }
            }
        }, new C5162eh.C5172a() {
            /* renamed from: a */
            public final void mo40454a(View view, C5010bf bfVar) {
                if (!C5159eg.this.f11692a) {
                    C5159eg.this.f11851d.mo40772a(view, bfVar);
                    C5159eg.this.f11851d.mo40773a(bfVar, false);
                }
            }
        }, this);
        C5198eq.m11901a(jVar.f12389r);
    }

    /* renamed from: a */
    public final View mo40375a(View view, ViewGroup viewGroup, boolean z, C5415m mVar) {
        C5176ej ejVar;
        if (view != null) {
            View findViewWithTag = view.findViewWithTag("InMobiAdView");
            if (findViewWithTag != null) {
                C5176ej ejVar2 = (C5176ej) findViewWithTag;
                if (z) {
                    ejVar = this.f11850b.mo40460b(ejVar2, viewGroup, mVar);
                } else {
                    ejVar = this.f11850b.mo40457a(ejVar2, viewGroup, mVar);
                }
            } else if (z) {
                ejVar = this.f11850b.mo40460b((C5176ej) null, viewGroup, mVar);
            } else {
                ejVar = this.f11850b.mo40457a((C5176ej) null, viewGroup, mVar);
            }
        } else if (z) {
            ejVar = this.f11850b.mo40460b((C5176ej) null, viewGroup, mVar);
        } else {
            ejVar = this.f11850b.mo40457a((C5176ej) null, viewGroup, mVar);
        }
        ejVar.setNativeStrandAd(this.f11851d);
        ejVar.setTag("InMobiAdView");
        return ejVar;
    }

    /* renamed from: a */
    public final void mo40376a() {
        this.f11850b.mo40458a();
        super.mo40376a();
    }

    /* renamed from: a */
    public final void mo40452a(C5026bp bpVar) {
        if (bpVar.f11369k == 1) {
            this.f11851d.mo40686b();
        }
    }
}
