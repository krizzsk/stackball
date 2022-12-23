package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* renamed from: com.inmobi.media.cz */
/* compiled from: ViewableAd */
public abstract class C5098cz {

    /* renamed from: a */
    protected C5331h f11688a;

    /* renamed from: b */
    C5099a f11689b;

    /* renamed from: c */
    protected C5220ev f11690c;

    /* renamed from: d */
    private WeakReference<View> f11691d;

    /* renamed from: a */
    public abstract View mo40365a(View view, ViewGroup viewGroup, boolean z);

    /* renamed from: a */
    public abstract void mo40367a(byte b);

    /* renamed from: a */
    public abstract void mo40368a(Context context, byte b);

    /* renamed from: a */
    public abstract void mo40370a(View... viewArr);

    /* renamed from: c */
    public View mo40372c() {
        return null;
    }

    /* renamed from: d */
    public abstract void mo40373d();

    /* renamed from: com.inmobi.media.cz$a */
    /* compiled from: ViewableAd */
    public static abstract class C5099a {

        /* renamed from: a */
        public boolean f11692a;

        /* renamed from: a */
        public abstract View mo40375a(View view, ViewGroup viewGroup, boolean z, C5415m mVar);

        /* renamed from: a */
        public void mo40376a() {
            if (!this.f11692a) {
                this.f11692a = true;
            }
        }
    }

    public C5098cz(C5331h hVar) {
        this.f11688a = hVar;
        this.f11690c = hVar.getAdConfig();
    }

    /* renamed from: a */
    public C5099a mo40366a() {
        return this.f11689b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40369a(View view) {
        this.f11691d = new WeakReference<>(view);
    }

    /* renamed from: b */
    public View mo40371b() {
        WeakReference<View> weakReference = this.f11691d;
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    /* renamed from: e */
    public void mo40374e() {
        WeakReference<View> weakReference = this.f11691d;
        if (weakReference != null) {
            weakReference.clear();
        }
    }
}
