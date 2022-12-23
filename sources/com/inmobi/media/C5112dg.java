package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.inmobi.media.C5098cz;
import com.inmobi.media.C5220ev;
import java.lang.ref.WeakReference;

/* renamed from: com.inmobi.media.dg */
/* compiled from: InMobiTrackedNativeV2DisplayAd */
public class C5112dg extends C5097cy {

    /* renamed from: d */
    private static final String f11719d = C5112dg.class.getSimpleName();

    /* renamed from: e */
    private final WeakReference<Context> f11720e;

    /* renamed from: f */
    private final C5098cz f11721f;

    /* renamed from: g */
    private final C5114di f11722g = new C5114di((byte) 1);

    /* renamed from: h */
    private final C5397j f11723h;

    public C5112dg(Context context, C5397j jVar, C5098cz czVar) {
        super(jVar);
        this.f11720e = new WeakReference<>(context);
        this.f11721f = czVar;
        this.f11723h = jVar;
    }

    /* renamed from: b */
    public final View mo40371b() {
        return this.f11721f.mo40371b();
    }

    /* renamed from: a */
    public final C5098cz.C5099a mo40366a() {
        return this.f11721f.mo40366a();
    }

    /* renamed from: a */
    public final void mo40370a(View... viewArr) {
        try {
            Context context = (Context) this.f11720e.get();
            View b = this.f11721f.mo40371b();
            C5220ev.C5234k kVar = this.f11690c.viewability;
            C5397j jVar = (C5397j) this.f11688a;
            if (!(context == null || b == null || jVar.f12382k)) {
                this.f11722g.mo40394a(context, b, jVar, kVar);
                this.f11722g.mo40393a(context, b, this.f11723h, this.f11723h.f12394w, kVar);
            }
        } catch (Exception e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
        } catch (Throwable th) {
            this.f11721f.mo40370a(viewArr);
            throw th;
        }
        this.f11721f.mo40370a(viewArr);
    }

    /* renamed from: a */
    public final void mo40367a(byte b) {
        this.f11721f.mo40367a(b);
    }

    /* renamed from: a */
    public final void mo40368a(Context context, byte b) {
        if (b == 0) {
            C5114di.m11657b(context);
        } else if (b == 1) {
            C5114di.m11658c(context);
        } else if (b == 2) {
            try {
                this.f11722g.mo40391a(context);
            } catch (Exception e) {
                C5275fn.m12068a().mo40590a(new C5308gk(e));
            } catch (Throwable th) {
                this.f11721f.mo40368a(context, b);
                throw th;
            }
        }
        this.f11721f.mo40368a(context, b);
    }

    /* renamed from: e */
    public final void mo40374e() {
        this.f11722g.mo40392a(this.f11723h.mo40780g(), this.f11721f.mo40371b(), this.f11723h);
        super.mo40374e();
        this.f11720e.clear();
        this.f11721f.mo40374e();
    }

    /* renamed from: a */
    public final View mo40365a(View view, ViewGroup viewGroup, boolean z) {
        View b = this.f11721f.mo40371b();
        if (b != null) {
            this.f11722g.mo40392a(this.f11723h.mo40780g(), b, this.f11723h);
        }
        return this.f11721f.mo40365a(view, viewGroup, z);
    }

    /* renamed from: d */
    public final void mo40373d() {
        try {
            C5397j jVar = (C5397j) this.f11688a;
            if (!jVar.f12382k) {
                this.f11722g.mo40395a((Context) this.f11720e.get(), jVar);
            }
        } catch (Exception e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
        } catch (Throwable th) {
            this.f11721f.mo40373d();
            throw th;
        }
        this.f11721f.mo40373d();
    }
}
