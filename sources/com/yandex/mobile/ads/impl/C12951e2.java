package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C12948e1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.e2 */
public final class C12951e2 {

    /* renamed from: a */
    private final C12564b2 f32885a;

    /* renamed from: b */
    private final sf0 f32886b;

    /* renamed from: c */
    private final C13373i2 f32887c;

    /* renamed from: d */
    private final C13159g2 f32888d;

    public C12951e2(C12564b2 b2Var, sf0 sf0, C13373i2 i2Var, C13159g2 g2Var) {
        Intrinsics.checkNotNullParameter(b2Var, "adGroupController");
        Intrinsics.checkNotNullParameter(sf0, "uiElementsManager");
        Intrinsics.checkNotNullParameter(i2Var, "adGroupPlaybackEventsListener");
        Intrinsics.checkNotNullParameter(g2Var, "adGroupPlaybackController");
        this.f32885a = b2Var;
        this.f32886b = sf0;
        this.f32887c = i2Var;
        this.f32888d = g2Var;
    }

    /* renamed from: a */
    public final void mo66741a() {
        lg0 d = this.f32885a.mo65942d();
        if (d != null) {
            d.mo68426a();
        }
        C13471j2 g = this.f32885a.mo65945g();
        if (g != null) {
            this.f32886b.mo69967a(g.mo67918c());
            int ordinal = g.mo67917b().mo68486a().ordinal();
            if (ordinal == 0) {
                this.f32888d.mo67162c();
                this.f32886b.mo69966a();
                C12948e1.C12950b bVar = (C12948e1.C12950b) this.f32887c;
                C12948e1.this.f32874b.mo67708a(C12948e1.this.f32873a, C13270h1.PREPARING);
                this.f32888d.mo67165f();
            } else if (ordinal == 1) {
                this.f32888d.mo67162c();
                this.f32886b.mo69966a();
                C12948e1.C12950b bVar2 = (C12948e1.C12950b) this.f32887c;
                C12948e1.this.f32874b.mo67708a(C12948e1.this.f32873a, C13270h1.PREPARING);
            } else if (ordinal != 2) {
                if (!(ordinal == 4 || ordinal == 5)) {
                    if (ordinal == 6) {
                        C12948e1.C12950b bVar3 = (C12948e1.C12950b) this.f32887c;
                        if (C12948e1.this.f32874b.mo67707a(C12948e1.this.f32873a).equals(C13270h1.PAUSED)) {
                            C12948e1.this.f32874b.mo67708a(C12948e1.this.f32873a, C13270h1.PLAYING);
                        }
                        this.f32888d.mo67166g();
                        return;
                    } else if (ordinal != 8) {
                        return;
                    }
                }
                mo66741a();
            } else {
                ((C12948e1.C12950b) this.f32887c).mo66738c();
                this.f32888d.mo67164e();
            }
        } else {
            this.f32886b.mo69966a();
            C12948e1.C12950b bVar4 = (C12948e1.C12950b) this.f32887c;
            C13270h1 a = C12948e1.this.f32874b.mo67707a(C12948e1.this.f32873a);
            if (a.equals(C13270h1.PLAYING) || a.equals(C13270h1.PAUSED)) {
                C12948e1.this.f32874b.mo67708a(C12948e1.this.f32873a, C13270h1.FINISHED);
                C12948e1.this.f32877e.mo68304a();
                if (C12948e1.this.f32878f != null) {
                    C12948e1.this.f32878f.mo66903c();
                }
            }
        }
    }
}
