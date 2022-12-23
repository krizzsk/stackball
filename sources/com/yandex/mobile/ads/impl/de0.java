package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.nativeads.C15550v;
import java.util.List;

public class de0 {

    /* renamed from: a */
    private final ap1 f32547a = new ap1();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final gh0 f32548b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final he0 f32549c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Handler f32550d;

    /* renamed from: com.yandex.mobile.ads.impl.de0$a */
    private class C12876a implements Runnable {

        /* renamed from: b */
        private final C15550v f32551b;

        C12876a(C15550v vVar) {
            this.f32551b = vVar;
        }

        public void run() {
            View e = this.f32551b.mo71926e();
            if (e instanceof FrameLayout) {
                de0.this.f32549c.mo67532a(de0.this.f32548b.mo67307a(e.getContext()), (FrameLayout) e);
                de0 de0 = de0.this;
                de0.f32550d.postDelayed(new C12876a(this.f32551b), 300);
            }
        }
    }

    public de0(nt0 nt0, List<k81> list) {
        this.f32548b = new hh0().mo67555a(nt0, list);
        this.f32549c = new he0();
        this.f32550d = new Handler(Looper.getMainLooper());
    }

    /* renamed from: a */
    public void mo66560a(Context context, C15550v vVar) {
        boolean z;
        this.f32547a.getClass();
        l71 c = l71.m38631c();
        d71 a = c.mo68362a(context);
        Boolean M = a != null ? a.mo66448M() : null;
        boolean e = c.mo68370e();
        if (M != null) {
            z = M.booleanValue();
        } else {
            z = e && C13378i5.m37284b(context);
        }
        if (z) {
            this.f32550d.post(new C12876a(vVar));
        }
    }

    /* renamed from: a */
    public void mo66561a(C15550v vVar) {
        this.f32550d.removeCallbacksAndMessages((Object) null);
        View e = vVar.mo71926e();
        if (e instanceof FrameLayout) {
            this.f32549c.mo67531a((FrameLayout) e);
        }
    }

    /* renamed from: a */
    public void mo66559a() {
        this.f32550d.removeCallbacksAndMessages((Object) null);
    }
}
