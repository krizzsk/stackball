package com.tapjoy.internal;

import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;

/* renamed from: com.tapjoy.internal.hz */
public final class C9400hz {

    /* renamed from: n */
    public static final C9093bi f23305n = new C9093bi() {
        /* renamed from: a */
        public final /* synthetic */ Object mo57847a(C9101bn bnVar) {
            return new C9400hz(bnVar);
        }
    };

    /* renamed from: a */
    public C9405ib f23306a;

    /* renamed from: b */
    public C9405ib f23307b;

    /* renamed from: c */
    public C9405ib f23308c;

    /* renamed from: d */
    public C9405ib f23309d;

    /* renamed from: e */
    public int f23310e = 9;

    /* renamed from: f */
    public int f23311f = 10;

    /* renamed from: g */
    public String f23312g;

    /* renamed from: h */
    public String f23313h;

    /* renamed from: i */
    public String f23314i;

    /* renamed from: j */
    public boolean f23315j = false;

    /* renamed from: k */
    public String f23316k;

    /* renamed from: l */
    public C9396hx f23317l;

    /* renamed from: m */
    public C9396hx f23318m;

    public C9400hz(C9101bn bnVar) {
        bnVar.mo57868h();
        while (bnVar.mo57870j()) {
            String l = bnVar.mo57872l();
            if ("x".equals(l)) {
                this.f23306a = C9405ib.m25243a(bnVar.mo57873m());
            } else if ("y".equals(l)) {
                this.f23307b = C9405ib.m25243a(bnVar.mo57873m());
            } else if ("width".equals(l)) {
                this.f23308c = C9405ib.m25243a(bnVar.mo57873m());
            } else if ("height".equals(l)) {
                this.f23309d = C9405ib.m25243a(bnVar.mo57873m());
            } else if ("url".equals(l)) {
                this.f23312g = bnVar.mo57873m();
            } else if (TapjoyConstants.TJC_REDIRECT_URL.equals(l)) {
                this.f23313h = bnVar.mo57873m();
            } else if ("ad_content".equals(l)) {
                this.f23314i = bnVar.mo57873m();
            } else if (TapjoyConstants.TJC_FULLSCREEN_AD_DISMISS_URL.equals(l)) {
                this.f23315j = bnVar.mo57874n();
            } else if ("value".equals(l)) {
                this.f23316k = bnVar.mo57873m();
            } else if ("image".equals(l)) {
                this.f23317l = (C9396hx) C9396hx.f23294e.mo57847a(bnVar);
            } else if ("image_clicked".equals(l)) {
                this.f23318m = (C9396hx) C9396hx.f23294e.mo57847a(bnVar);
            } else if ("align".equals(l)) {
                String m = bnVar.mo57873m();
                if ("left".equals(m)) {
                    this.f23310e = 9;
                } else if ("right".equals(m)) {
                    this.f23310e = 11;
                } else if ("center".equals(m)) {
                    this.f23310e = 14;
                } else {
                    bnVar.mo57879s();
                }
            } else if ("valign".equals(l)) {
                String m2 = bnVar.mo57873m();
                if ("top".equals(m2)) {
                    this.f23311f = 10;
                } else if ("middle".equals(m2)) {
                    this.f23311f = 15;
                } else if (TJAdUnitConstants.String.BOTTOM.equals(m2)) {
                    this.f23311f = 12;
                } else {
                    bnVar.mo57879s();
                }
            } else {
                bnVar.mo57879s();
            }
        }
        bnVar.mo57869i();
    }
}
