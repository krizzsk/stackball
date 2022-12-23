package com.fyber.inneractive.sdk.p039dv.p040a;

import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.p037d.C2836g;
import com.fyber.inneractive.sdk.p037d.C2837h;
import com.fyber.inneractive.sdk.p039dv.C2863a;
import com.fyber.inneractive.sdk.p039dv.C2886e;
import com.fyber.inneractive.sdk.p045e.C2899b;
import com.fyber.inneractive.sdk.p051j.C3018e;
import com.fyber.inneractive.sdk.util.C3657l;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.ads.AdView;

/* renamed from: com.fyber.inneractive.sdk.dv.a.b */
public final class C2866b extends C2837h<C2864a, InneractiveAdViewEventsListener> implements C2886e, C2899b {

    /* renamed from: h */
    private ViewGroup f6816h;

    /* renamed from: a */
    public final void mo18231a(int i) {
    }

    /* renamed from: c */
    public final void mo18236c() {
    }

    /* renamed from: d */
    public final void mo18237d() {
    }

    /* renamed from: f */
    public final void mo18239f() {
    }

    /* renamed from: a */
    public final void mo18232a(ViewGroup viewGroup) {
        if (this.f6748a == null) {
            IAlog.m9036d("%sYou must set the spot to render before calling renderAd", IAlog.m9029a((Object) this));
        } else if (viewGroup != null && this.f6749b != null && ((C2864a) this.f6749b).mo18228e() != null) {
            ((C2864a) this.f6749b).mo18225a((C2886e) this);
            this.f6816h = viewGroup;
            viewGroup.addView((View) ((C2864a) this.f6749b).mo18228e());
        }
    }

    /* renamed from: a */
    public final boolean mo18234a(C2836g gVar) {
        return gVar instanceof C2863a;
    }

    /* renamed from: a */
    public final boolean mo18233a(View view) {
        ViewGroup viewGroup = this.f6816h;
        return viewGroup != null && viewGroup.equals(view);
    }

    /* renamed from: e */
    public final void mo18238e() {
        ViewGroup viewGroup = this.f6816h;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f6816h = null;
        }
    }

    /* renamed from: g */
    public final int mo18240g() {
        if (this.f6749b == null || ((C2864a) this.f6749b).mo18228e() == null || ((AdView) ((C2864a) this.f6749b).mo18228e()).getAdSize() == null) {
            return 0;
        }
        return C3657l.m9119b(((AdView) ((C2864a) this.f6749b).mo18228e()).getAdSize().getWidth());
    }

    /* renamed from: h */
    public final int mo18241h() {
        if (this.f6749b == null || ((C2864a) this.f6749b).mo18228e() == null || ((AdView) ((C2864a) this.f6749b).mo18228e()).getAdSize() == null) {
            return 0;
        }
        return C3657l.m9119b(((AdView) ((C2864a) this.f6749b).mo18228e()).getAdSize().getHeight());
    }

    public final void destroy() {
        if (this.f6749b != null) {
            if (((C2864a) this.f6749b).mo18228e() != null) {
                ((AdView) ((C2864a) this.f6749b).mo18228e()).destroy();
            }
            ((C2864a) this.f6749b).mo18127b();
        }
        ViewGroup viewGroup = this.f6816h;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f6816h = null;
        }
        super.destroy();
    }

    /* renamed from: a */
    public final void mo18230a() {
        mo18148n();
        if (this.f6749b != null && ((C2864a) this.f6749b).mo18227c() != null) {
            mo18140b((C3018e) ((C2864a) this.f6749b).mo18227c());
        }
    }

    /* renamed from: b */
    public final void mo18235b() {
        mo18147m();
        if (this.f6749b != null && ((C2864a) this.f6749b).mo18227c() != null) {
            mo18138a((C3018e) ((C2864a) this.f6749b).mo18227c());
        }
    }
}
