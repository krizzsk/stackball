package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;

public class ye1 {

    /* renamed from: a */
    private final C14643t f42817a = new C14643t();

    /* renamed from: b */
    private final C14332q f42818b = C14433r.m41458a();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C15244a f42819c;

    /* renamed from: d */
    private C15287z f42820d;

    /* renamed from: e */
    private js0 f42821e;

    /* renamed from: com.yandex.mobile.ads.impl.ye1$a */
    public interface C15244a {
        /* renamed from: a */
        void mo71040a();

        /* renamed from: b */
        void mo71041b();
    }

    /* renamed from: com.yandex.mobile.ads.impl.ye1$b */
    private class C15245b implements C15287z {

        /* renamed from: a */
        private final WeakReference<Context> f42822a;

        C15245b(Context context) {
            this.f42822a = new WeakReference<>(context);
        }

        /* renamed from: a */
        public void mo70432a(Activity activity) {
            Context context = (Context) this.f42822a.get();
            if (context != null && context.equals(activity) && ye1.this.f42819c != null) {
                ye1.this.f42819c.mo71041b();
            }
        }

        /* renamed from: b */
        public void mo70433b(Activity activity) {
            Context context = (Context) this.f42822a.get();
            if (context != null && context.equals(activity) && ye1.this.f42819c != null) {
                ye1.this.f42819c.mo71040a();
            }
        }
    }

    /* renamed from: a */
    public void mo71039a(View view, C15244a aVar) {
        this.f42819c = aVar;
        Context context = view.getContext();
        C15287z zVar = this.f42820d;
        if (zVar != null) {
            this.f42818b.mo69459a(context, zVar);
        }
        js0 js0 = this.f42821e;
        if (js0 != null) {
            js0.mo68088a();
        }
        Context a = this.f42817a.mo70078a(view.getContext());
        if (a != null) {
            this.f42820d = new C15245b(a);
            this.f42821e = new js0(view, this.f42819c);
            this.f42818b.mo69461b(a, this.f42820d);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.f42821e);
        }
    }

    /* renamed from: a */
    public void mo71038a(Context context) {
        this.f42819c = null;
        C15287z zVar = this.f42820d;
        if (zVar != null) {
            this.f42818b.mo69459a(context, zVar);
        }
        js0 js0 = this.f42821e;
        if (js0 != null) {
            js0.mo68088a();
        }
    }
}
