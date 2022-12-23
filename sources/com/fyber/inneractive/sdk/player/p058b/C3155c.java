package com.fyber.inneractive.sdk.player.p058b;

import android.content.Context;
import android.view.View;
import com.fyber.inneractive.sdk.config.C2809u;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.p047g.p048a.C2922g;
import com.fyber.inneractive.sdk.p050i.C2997d;
import com.fyber.inneractive.sdk.p056m.C3037c;
import com.fyber.inneractive.sdk.p056m.C3039d;
import com.fyber.inneractive.sdk.p084ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.C3630ak;
import com.fyber.inneractive.sdk.util.C3647e;
import com.fyber.inneractive.sdk.util.C3691w;
import com.fyber.inneractive.videokit.C3708R;

/* renamed from: com.fyber.inneractive.sdk.player.b.c */
public final class C3155c {

    /* renamed from: a */
    public IAmraidWebViewController f7812a;

    /* renamed from: b */
    public UnitDisplayType f7813b;

    /* renamed from: c */
    public boolean f7814c;

    /* renamed from: d */
    private C3039d.C3052d f7815d = C3039d.C3052d.INLINE;

    /* renamed from: e */
    private int f7816e = C3039d.C3049a.f7526a;

    public C3155c(Context context, UnitDisplayType unitDisplayType, boolean z, int i, int i2, C2809u uVar, C2922g gVar) {
        boolean z2 = z;
        this.f7813b = unitDisplayType;
        this.f7814c = z2;
        int i3 = C31561.f7817a[this.f7813b.ordinal()];
        if (i3 == 1 || i3 == 2) {
            this.f7816e = C3039d.C3049a.f7526a;
            if (z2) {
                this.f7815d = C3039d.C3052d.INTERSTITIAL;
            }
        } else {
            this.f7816e = C3039d.C3049a.f7526a;
        }
        try {
            IAmraidWebViewController iAmraidWebViewController = new IAmraidWebViewController(context, C3647e.m9075a(unitDisplayType, IAConfigManager.m5929c().f6586a), this.f7815d, this.f7816e, C3039d.C3053e.f7538c, true);
            this.f7812a = iAmraidWebViewController;
            C3037c e = iAmraidWebViewController.mo18556e();
            int i4 = C31561.f7818b[gVar.ordinal()];
            if (i4 == 1) {
                e.setId(C3708R.C3710id.inneractive_vast_endcard_gif);
            } else if (i4 == 2) {
                e.setId(C3708R.C3710id.inneractive_vast_endcard_html);
            } else if (i4 == 3) {
                e.setId(C3708R.C3710id.inneractive_vast_endcard_iframe);
            }
            Context context2 = context;
            C3691w.m9191a().mo19598a(context, (View) this.f7812a.mo18556e(), (C3691w.C3696b) this.f7812a);
            this.f7812a.mo18557f();
            C3630ak a = C2997d.m6734a(i, i2, uVar);
            this.f7812a.setAdDefaultSize(a.f9896a, a.f9897b);
        } catch (Throwable unused) {
            this.f7812a = null;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.b.c$1 */
    static /* synthetic */ class C31561 {

        /* renamed from: a */
        static final /* synthetic */ int[] f7817a;

        /* renamed from: b */
        static final /* synthetic */ int[] f7818b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        static {
            /*
                com.fyber.inneractive.sdk.g.a.g[] r0 = com.fyber.inneractive.sdk.p047g.p048a.C2922g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7818b = r0
                r1 = 1
                com.fyber.inneractive.sdk.g.a.g r2 = com.fyber.inneractive.sdk.p047g.p048a.C2922g.Static     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f7818b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fyber.inneractive.sdk.g.a.g r3 = com.fyber.inneractive.sdk.p047g.p048a.C2922g.Html     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = f7818b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fyber.inneractive.sdk.g.a.g r3 = com.fyber.inneractive.sdk.p047g.p048a.C2922g.Iframe     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType[] r2 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f7817a = r2
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r3 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f7817a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r2 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p058b.C3155c.C31561.<clinit>():void");
        }
    }
}
