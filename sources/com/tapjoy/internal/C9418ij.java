package com.tapjoy.internal;

import android.content.Context;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.util.List;
import java.util.Map;

/* renamed from: com.tapjoy.internal.ij */
public final class C9418ij extends C9417ii {

    /* renamed from: c */
    public final String f23393c;

    /* renamed from: d */
    public boolean f23394d = false;

    /* renamed from: e */
    private final C9344gz f23395e;

    /* renamed from: f */
    private final C9247fa f23396f;

    /* renamed from: g */
    private final C9229eu f23397g;

    /* renamed from: h */
    private final C9268fh f23398h;

    /* renamed from: i */
    private Context f23399i;

    /* renamed from: c */
    public final String mo57905c() {
        return "placement";
    }

    public C9418ij(C9344gz gzVar, C9247fa faVar, C9229eu euVar, C9268fh fhVar, String str, Context context) {
        this.f23395e = gzVar;
        this.f23396f = faVar;
        this.f23397g = euVar;
        this.f23398h = fhVar;
        this.f23393c = str;
        this.f23399i = context;
    }

    /* renamed from: e */
    public final Map mo57907e() {
        Map e = super.mo57907e();
        e.put(TJAdUnitConstants.String.VIDEO_INFO, new C9100bm(C9379hp.m25206a(this.f23396f)));
        e.put(TapjoyConstants.TJC_APP_PLACEMENT, new C9100bm(C9379hp.m25202a(this.f23397g)));
        e.put("user", new C9100bm(C9379hp.m25207a(this.f23398h)));
        e.put("placement", this.f23393c);
        return e;
    }

    /* renamed from: com.tapjoy.internal.ij$a */
    public static class C9419a {

        /* renamed from: a */
        public C9365hg f23400a;

        /* renamed from: b */
        public final List f23401b;

        public C9419a(C9365hg hgVar, List list) {
            this.f23400a = hgVar;
            this.f23401b = list;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo57898a(C9101bn bnVar) {
        bnVar.mo57868h();
        C9390hu huVar = null;
        C9382hr hrVar = null;
        List list = null;
        while (bnVar.mo57870j()) {
            String l = bnVar.mo57872l();
            if ("interstitial".equals(l)) {
                huVar = (C9390hu) bnVar.mo57853a(C9390hu.f23273n);
            } else if ("contextual_button".equals(l)) {
                hrVar = (C9382hr) bnVar.mo57853a(C9382hr.f23249d);
            } else if ("enabled_placements".equals(l)) {
                list = bnVar.mo57859c();
            } else {
                bnVar.mo57879s();
            }
        }
        bnVar.mo57869i();
        if (huVar != null && (huVar.mo58327a() || huVar.mo58328b())) {
            return new C9419a(new C9359he(this.f23395e, this.f23393c, huVar, this.f23399i), list);
        }
        if (hrVar != null) {
            return new C9419a(new C9336gv(this.f23395e, this.f23393c, hrVar, this.f23399i), list);
        }
        return new C9419a(new C9364hf(), list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final /* synthetic */ Object mo57908f() {
        C9419a aVar = (C9419a) super.mo57908f();
        if (!(aVar.f23400a instanceof C9364hf)) {
            aVar.f23400a.mo58224b();
            if (!aVar.f23400a.mo58225c()) {
                aVar.f23400a = new C9364hf();
            }
        }
        return aVar;
    }
}
