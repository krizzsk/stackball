package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.inmobi.media.dc */
/* compiled from: ViewableNativeV2VideoAd */
public final class C5103dc extends C5098cz {

    /* renamed from: d */
    private final C5410k f11697d;

    /* renamed from: e */
    private boolean f11698e = false;

    /* renamed from: a */
    public final void mo40367a(byte b) {
    }

    /* renamed from: a */
    public final void mo40368a(Context context, byte b) {
    }

    /* renamed from: a */
    public final void mo40370a(View... viewArr) {
    }

    /* renamed from: d */
    public final void mo40373d() {
    }

    public C5103dc(C5410k kVar) {
        super(kVar);
        this.f11697d = kVar;
    }

    /* renamed from: a */
    public final View mo40365a(View view, ViewGroup viewGroup, boolean z) {
        Context m;
        if (this.f11698e || (m = this.f11697d.mo40786m()) == null) {
            return null;
        }
        C5220ev evVar = this.f11690c;
        C5410k kVar = this.f11697d;
        this.f11689b = new C5159eg(m, evVar, kVar, kVar.mo40784k());
        View a = this.f11689b.mo40375a(view, viewGroup, false, (C5415m) null);
        mo40369a(a);
        this.f11697d.mo40803w();
        return a;
    }

    /* renamed from: e */
    public final void mo40374e() {
        if (!this.f11698e) {
            this.f11698e = true;
            if (this.f11689b != null) {
                this.f11689b.mo40376a();
                this.f11689b = null;
            }
            super.mo40374e();
        }
    }
}
