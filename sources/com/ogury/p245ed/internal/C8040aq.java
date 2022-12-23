package com.ogury.p245ed.internal;

import android.app.Activity;
import android.widget.FrameLayout;

/* renamed from: com.ogury.ed.internal.aq */
public final class C8040aq implements C8036am {

    /* renamed from: a */
    private final FrameLayout f20898a;

    /* renamed from: b */
    private final Activity f20899b;

    /* renamed from: c */
    private final C8036am f20900c;

    public C8040aq(FrameLayout frameLayout, Activity activity, C8036am amVar) {
        C8467mq.m23881b(activity, "interstitialActivity");
        C8467mq.m23881b(amVar, "closeCommandInCollapsedMode");
        this.f20898a = frameLayout;
        this.f20899b = activity;
        this.f20900c = amVar;
    }

    /* renamed from: a */
    public final void mo53117a(C8248g gVar, C8020aj ajVar) {
        C8467mq.m23881b(gVar, "adLayout");
        C8467mq.m23881b(ajVar, "adController");
        if (ajVar.mo53150c()) {
            this.f20899b.finish();
            return;
        }
        gVar.mo53570a();
        gVar.setupDrag(false);
        gVar.mo53574c();
        FrameLayout frameLayout = this.f20898a;
        if (frameLayout != null) {
            frameLayout.addView(gVar);
        }
        ajVar.mo53154g();
        this.f20899b.finish();
        ajVar.mo53146b(this.f20900c);
        ajVar.mo53139a((C8036am) new C8007aa());
    }
}
