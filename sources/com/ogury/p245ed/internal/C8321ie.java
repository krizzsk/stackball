package com.ogury.p245ed.internal;

import android.content.Context;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import java.util.List;

/* renamed from: com.ogury.ed.internal.ie */
public final class C8321ie {

    /* renamed from: a */
    public static final C8322a f21507a = new C8322a((byte) 0);

    /* renamed from: b */
    private final C8320id f21508b;

    /* renamed from: c */
    private C8338ir f21509c;

    /* renamed from: d */
    private final C8326ii f21510d;

    /* renamed from: e */
    private final C8233fn f21511e;

    /* renamed from: f */
    private long f21512f;

    /* renamed from: g */
    private final Context f21513g;

    private C8321ie(Context context, C8320id idVar, C8338ir irVar, C8326ii iiVar, C8233fn fnVar) {
        C8467mq.m23881b(context, "context");
        C8467mq.m23881b(idVar, "mraidCacheStore");
        C8467mq.m23881b(irVar, "webViewLoader");
        C8467mq.m23881b(iiVar, "chromeVersionHelper");
        C8467mq.m23881b(fnVar, "profigGateway");
        this.f21508b = idVar;
        this.f21509c = irVar;
        this.f21510d = iiVar;
        this.f21511e = fnVar;
        this.f21512f = 80000;
        this.f21513g = context.getApplicationContext();
    }

    public /* synthetic */ C8321ie(Context context, C8320id idVar) {
        this(context, idVar, new C8338ir(), new C8326ii(), C8233fn.f21330a);
    }

    /* renamed from: com.ogury.ed.internal.ie$a */
    public static final class C8322a {
        public /* synthetic */ C8322a(byte b) {
            this();
        }

        private C8322a() {
        }

        /* renamed from: a */
        public static C8321ie m23488a(Context context) {
            C8467mq.m23881b(context, "context");
            return new C8321ie(context, C8320id.f21501a);
        }
    }

    /* renamed from: a */
    public final void mo53733a(C8324ig igVar, List<C8185eb> list, C8323if ifVar) {
        C8467mq.m23881b(igVar, "presageAdGateway");
        C8467mq.m23881b(list, CampaignUnit.JSON_KEY_ADS);
        C8467mq.m23881b(ifVar, "preCacheListener");
        m23484a(ifVar, igVar);
        for (C8185eb next : list) {
            Context context = this.f21513g;
            C8467mq.m23878a((Object) context, "context");
            C8362jh a = C8365jk.m23712a(context, next);
            if (a != null) {
                WebView webView = a;
                this.f21510d.mo53740a(webView);
                C8268gr.m23213a(webView);
                this.f21509c.mo53755a((C8337iq) new C8329ik(a, next, this.f21508b, igVar));
                if (next.mo53375r().length() > 0) {
                    m23483a(next);
                }
            } else {
                ifVar.mo53736b();
                return;
            }
        }
        this.f21509c.mo53754a(this.f21510d, this.f21512f, list.size());
    }

    /* renamed from: a */
    private final void m23484a(C8323if ifVar, C8324ig igVar) {
        this.f21509c.mo53753a(ifVar);
        this.f21509c.mo53756b();
        C8320id.m23474a(igVar);
        m23482a();
    }

    /* renamed from: a */
    private final void m23482a() {
        Context context = this.f21513g;
        C8467mq.m23878a((Object) context, "context");
        C8232fm a = C8233fn.m23113a(context);
        if (a != null) {
            this.f21512f = a.mo53550i();
        }
    }

    /* renamed from: a */
    private final void m23483a(C8185eb ebVar) {
        C8362jh b = m23485b(ebVar);
        if (b != null) {
            C8296hn.m23336a(b);
            this.f21509c.mo53755a((C8337iq) new C8332im(b, ebVar));
        }
    }

    /* renamed from: b */
    private final C8362jh m23485b(C8185eb ebVar) {
        Context context = this.f21513g;
        C8467mq.m23878a((Object) context, "context");
        C8362jh a = C8365jk.m23712a(context, ebVar);
        if (a != null) {
            C8268gr.m23213a((WebView) a);
        }
        return a;
    }

    /* renamed from: a */
    public final void mo53732a(C8324ig igVar) {
        C8467mq.m23881b(igVar, "presageAdGateway");
        this.f21509c.mo53753a((C8323if) null);
        this.f21509c.mo53756b();
        C8320id.m23474a(igVar);
    }
}
