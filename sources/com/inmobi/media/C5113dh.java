package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.inmobi.media.C5098cz;
import com.inmobi.media.C5220ev;
import java.lang.ref.WeakReference;

/* renamed from: com.inmobi.media.dh */
/* compiled from: InMobiTrackedNativeV2VideoAd */
public class C5113dh extends C5097cy {

    /* renamed from: d */
    private static final String f11724d = C5113dh.class.getSimpleName();

    /* renamed from: e */
    private final WeakReference<Context> f11725e;

    /* renamed from: f */
    private final C5098cz f11726f;

    /* renamed from: g */
    private final C5114di f11727g = new C5114di((byte) 0);

    /* renamed from: h */
    private final C5397j f11728h;

    public C5113dh(C5410k kVar, C5098cz czVar) {
        super(kVar);
        this.f11725e = new WeakReference<>(kVar.mo40786m());
        this.f11726f = czVar;
        this.f11728h = kVar;
    }

    /* renamed from: b */
    public final View mo40371b() {
        return this.f11726f.mo40371b();
    }

    /* renamed from: a */
    public final C5098cz.C5099a mo40366a() {
        return this.f11726f.mo40366a();
    }

    /* renamed from: d */
    public final void mo40373d() {
        try {
            Context context = (Context) this.f11725e.get();
            C5410k kVar = (C5410k) this.f11688a;
            if (!kVar.f12382k && context != null) {
                this.f11727g.mo40395a(context, (C5397j) kVar);
            }
        } catch (Exception e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
        } catch (Throwable th) {
            this.f11726f.mo40373d();
            throw th;
        }
        this.f11726f.mo40373d();
    }

    /* renamed from: a */
    public final void mo40367a(byte b) {
        this.f11726f.mo40367a(b);
    }

    /* renamed from: a */
    public final void mo40368a(Context context, byte b) {
        if (b == 0) {
            C5114di.m11657b(context);
        } else if (b == 1) {
            C5114di.m11658c(context);
        } else if (b == 2) {
            try {
                this.f11727g.mo40391a(context);
            } catch (Exception e) {
                C5275fn.m12068a().mo40590a(new C5308gk(e));
            } catch (Throwable th) {
                this.f11726f.mo40368a(context, b);
                throw th;
            }
        }
        this.f11726f.mo40368a(context, b);
    }

    /* renamed from: e */
    public final void mo40374e() {
        this.f11727g.mo40392a((Context) this.f11725e.get(), this.f11726f.mo40371b(), this.f11728h);
        super.mo40374e();
        this.f11725e.clear();
        this.f11726f.mo40374e();
    }

    /* renamed from: a */
    public final View mo40365a(View view, ViewGroup viewGroup, boolean z) {
        View b = this.f11726f.mo40371b();
        if (b != null) {
            this.f11727g.mo40392a((Context) this.f11725e.get(), b, this.f11728h);
        }
        return this.f11726f.mo40365a(view, viewGroup, z);
    }

    /* renamed from: a */
    public final void mo40370a(View... viewArr) {
        try {
            C5410k kVar = (C5410k) this.f11688a;
            C5197ep epVar = (C5197ep) kVar.getVideoContainerView();
            Context context = (Context) this.f11725e.get();
            C5220ev.C5234k kVar2 = this.f11690c.viewability;
            if (!(context == null || epVar == null || kVar.f12382k)) {
                C5184eo videoView = epVar.getVideoView();
                this.f11727g.mo40394a(context, videoView, kVar, kVar2);
                View b = this.f11726f.mo40371b();
                if (!(videoView.getTag() == null || b == null)) {
                    C5031bs bsVar = (C5031bs) videoView.getTag();
                    if (kVar.getPlacementType() == 0 && !((Boolean) bsVar.f11380v.get("isFullScreen")).booleanValue()) {
                        this.f11727g.mo40393a(context, b, this.f11728h, ((C5410k) this.f11728h).f12411x, kVar2);
                    }
                }
            }
        } catch (Exception e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
        } catch (Throwable th) {
            this.f11726f.mo40370a(viewArr);
            throw th;
        }
        this.f11726f.mo40370a(viewArr);
    }
}
