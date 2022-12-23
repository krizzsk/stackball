package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.inmobi.media.db */
/* compiled from: ViewableNativeV2DisplayAd */
public final class C5102db extends C5098cz {

    /* renamed from: d */
    private final C5397j f11694d;

    /* renamed from: e */
    private boolean f11695e = false;

    /* renamed from: f */
    private C5415m f11696f;

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

    public C5102db(C5397j jVar, C5415m mVar) {
        super(jVar);
        this.f11694d = jVar;
        this.f11696f = mVar;
    }

    /* renamed from: a */
    public final View mo40365a(View view, ViewGroup viewGroup, boolean z) {
        Context m;
        if (this.f11695e || (m = this.f11694d.mo40786m()) == null) {
            return null;
        }
        C5220ev evVar = this.f11690c;
        C5397j jVar = this.f11694d;
        this.f11689b = new C5159eg(m, evVar, jVar, jVar.mo40784k());
        C5327gw.m12263a((byte) 2, "InMobi", "Ad markup loaded into the container will be inflated into a View.");
        View a = this.f11689b.mo40375a(view, viewGroup, z, this.f11696f);
        mo40369a(a);
        this.f11694d.mo40803w();
        return a;
    }

    /* renamed from: e */
    public final void mo40374e() {
        if (!this.f11695e) {
            this.f11695e = true;
            if (this.f11689b != null) {
                this.f11689b.mo40376a();
                this.f11689b = null;
            }
            C5415m mVar = this.f11696f;
            if (mVar != null) {
                mVar.destroy();
                this.f11696f = null;
            }
            super.mo40374e();
        }
    }
}
