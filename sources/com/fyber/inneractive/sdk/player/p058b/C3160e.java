package com.fyber.inneractive.sdk.player.p058b;

import com.fyber.inneractive.sdk.config.C2791i;
import com.fyber.inneractive.sdk.config.C2809u;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.p034a.C2767s;
import com.fyber.inneractive.sdk.config.p034a.p035a.C2746f;
import com.fyber.inneractive.sdk.player.C3145b;
import com.fyber.inneractive.sdk.player.enums.C3608b;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.player.p083e.C3597b;
import com.fyber.inneractive.sdk.util.C3629aj;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.b.e */
public final class C3160e extends C3174h<C3185j> {

    /* renamed from: a */
    private boolean f7846a;

    /* renamed from: b */
    private boolean f7847b;

    /* renamed from: c */
    private boolean f7848c;

    /* renamed from: b */
    public final void mo18794b(int i) {
    }

    public C3160e(C3145b bVar, C3597b bVar2, C2809u uVar, C2767s sVar, boolean z, Skip skip, boolean z2) {
        super(bVar, bVar2, uVar, sVar, z, skip);
        this.f7846a = false;
        this.f7847b = false;
        this.f7846a = false;
        this.f7848c = z2;
    }

    /* renamed from: a */
    public final void mo18791a(boolean z) {
        super.mo18791a(z);
        if (this.f7846a) {
            this.f7888g.mo19510g();
            this.f7888g.mo19507e(false);
            this.f7890i = 0;
        }
        boolean z2 = true;
        this.f7888g.mo19502a(true, ((C2746f) this.f7887f.mo18010a(C2746f.class)).mo17984a("cta_text_all_caps", false));
        if (this.f7885d == null || this.f7885d.mo18752f() == null || !(this.f7885d.mo18752f().mo18824p() == C3608b.Preparing || this.f7885d.mo18752f().mo18824p() == C3608b.Prepared)) {
            z2 = false;
        }
        this.f7888g.mo19501a(z2);
        this.f7888g.mo19509f(false);
        this.f7888g.mo19504b(false, false);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo18809e() {
        /*
            r7 = this;
            boolean r0 = super.mo18809e()
            r1 = 0
            if (r0 == 0) goto L_0x0085
            com.fyber.inneractive.sdk.player.b r0 = r7.f7885d
            r2 = 1
            if (r0 == 0) goto L_0x0081
            com.fyber.inneractive.sdk.player.b r0 = r7.f7885d
            com.fyber.inneractive.sdk.player.b.f r0 = r0.mo18752f()
            if (r0 == 0) goto L_0x0081
            boolean r0 = r7.f7847b
            if (r0 == 0) goto L_0x0019
            goto L_0x0081
        L_0x0019:
            r0 = 2
            com.fyber.inneractive.sdk.player.e.g r3 = r7.f7888g     // Catch:{ all -> 0x0031 }
            android.content.Context r3 = r3.getContext()     // Catch:{ all -> 0x0031 }
            java.lang.String r4 = "audio"
            java.lang.Object r3 = r3.getSystemService(r4)     // Catch:{ all -> 0x0031 }
            android.media.AudioManager r3 = (android.media.AudioManager) r3     // Catch:{ all -> 0x0031 }
            int r4 = r3.getRingerMode()     // Catch:{ all -> 0x0031 }
            int r3 = r3.getStreamVolume(r0)     // Catch:{ all -> 0x0032 }
            goto L_0x0033
        L_0x0031:
            r4 = 0
        L_0x0032:
            r3 = 0
        L_0x0033:
            boolean r5 = r7.f7846a
            if (r5 != 0) goto L_0x0049
            com.fyber.inneractive.sdk.config.u r5 = r7.f7886e
            com.fyber.inneractive.sdk.config.w r5 = r5.mo18070g()
            java.lang.Boolean r5 = r5.mo18075b()
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0049
            r5 = 1
            goto L_0x004a
        L_0x0049:
            r5 = 0
        L_0x004a:
            if (r5 != 0) goto L_0x0079
            boolean r5 = r7.f7848c
            if (r5 == 0) goto L_0x0060
            com.fyber.inneractive.sdk.config.u r5 = r7.f7886e
            com.fyber.inneractive.sdk.config.w r5 = r5.mo18070g()
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r5 = r5.mo18080h()
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r6 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED
            if (r5 == r6) goto L_0x0060
            r5 = 1
            goto L_0x0061
        L_0x0060:
            r5 = 0
        L_0x0061:
            if (r5 == 0) goto L_0x0064
            goto L_0x0079
        L_0x0064:
            if (r3 <= 0) goto L_0x007c
            if (r4 != r0) goto L_0x007c
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r3 = com.fyber.inneractive.sdk.util.IAlog.m9029a((java.lang.Object) r7)
            r0[r1] = r3
            java.lang.String r3 = "%s setting default volume. unmuting player"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r3, r0)
            r7.mo18854i(r1)
            goto L_0x007c
        L_0x0079:
            r7.mo18853h(r1)
        L_0x007c:
            r7.mo18857w()
            r7.f7847b = r2
        L_0x0081:
            r7.mo18843f(r1)
            return r2
        L_0x0085:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p058b.C3160e.mo18809e():boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo18810f() {
        return !this.f7846a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo18811g() {
        C2791i iVar = IAConfigManager.m5929c().f6586a;
        C2809u uVar = this.f7886e;
        Skip skip = this.f7900s;
        int c = iVar.mo18050b("vast_configuration").mo18044c("skip_d");
        if (c >= 0) {
            return c;
        }
        if (skip == null) {
            skip = uVar.mo18070g().mo18078f();
        }
        if (skip == Skip.DEFAULT) {
            return 99999;
        }
        return skip.value().intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo18812h() {
        super.mo18812h();
        this.f7888g.mo19502a(true, ((C2746f) this.f7887f.mo18010a(C2746f.class)).mo17984a("cta_text_all_caps", false));
        mo18858x();
        mo18809e();
        mo18843f(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final int mo18813i() {
        return IAConfigManager.m5929c().f6586a.mo18046a("VideoFullscreenBufferingTimeout", 12, 1) * 1000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo18814j() {
        this.f7898q = true;
        IAlog.m9034b("%s onBufferingTimeout reached. Skipping to end card", IAlog.m9029a((Object) this));
        mo18797d(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo18815k() {
        super.mo18815k();
        this.f7888g.mo19501a(false);
        if (this.f7846a) {
            this.f7888g.mo19510g();
        }
    }

    /* renamed from: l */
    public final void mo18816l() {
        super.mo18816l();
        if (this.f7892k) {
            mo18855u();
        } else {
            mo18809e();
        }
    }

    /* renamed from: e */
    public final void mo18808e(boolean z) {
        if (z && this.f7885d != null && this.f7885d.mo18752f() != null && !this.f7885d.mo18752f().mo18824p().equals(C3608b.f9847i) && !this.f7888g.mo19496e()) {
            mo18843f(false);
        }
        super.mo18808e(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18807a(C3629aj ajVar) {
        TapAction g = this.f7886e.mo18070g().mo18079g();
        if (g == TapAction.CTR) {
            mo18852a(false, VideoClickOrigin.VIDEO, ajVar);
        } else if (g != TapAction.FULLSCREEN && g != TapAction.DO_NOTHING) {
            IAlog.m9034b("% sonVideoClicked called, but we recieved an unknown tap action %s", IAlog.m9029a((Object) this), g);
        } else if (C2746f.C2748a.m5980a(((C2746f) this.f7887f.mo18010a(C2746f.class)).mo17982a("click_action", C2746f.f6472e.f6477c)).equals(C2746f.C2748a.OPEN)) {
            mo18852a(false, VideoClickOrigin.VIDEO, ajVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo18817m() {
        if (this.f7891j != null) {
            this.f7891j.mo18490d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo18818n() {
        super.mo18818n();
        if (this.f7885d != null && this.f7885d.mo18752f() != null && this.f7885d.mo18752f().mo18824p().equals(C3608b.f9847i) && this.f7846a) {
            this.f7888g.mo19510g();
        }
    }
}
