package com.tapjoy.internal;

import android.graphics.Point;
import android.os.SystemClock;
import com.appsflyer.ServerParameters;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.model.VisionDataDBAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.hu */
public final class C9390hu extends C9381hq {

    /* renamed from: n */
    public static final C9093bi f23273n = new C9093bi() {
        /* renamed from: a */
        public final /* synthetic */ Object mo57847a(C9101bn bnVar) {
            return new C9390hu(bnVar);
        }
    };
    @Nullable

    /* renamed from: a */
    public C9396hx f23274a;
    @Nullable

    /* renamed from: b */
    public C9396hx f23275b;

    /* renamed from: c */
    public C9396hx f23276c;
    @Nullable

    /* renamed from: d */
    public Point f23277d;
    @Nullable

    /* renamed from: e */
    public C9396hx f23278e;
    @Nullable

    /* renamed from: f */
    public C9396hx f23279f;

    /* renamed from: g */
    public String f23280g;
    @Nullable

    /* renamed from: h */
    public C9324gl f23281h;

    /* renamed from: i */
    public ArrayList f23282i = new ArrayList();

    /* renamed from: j */
    public ArrayList f23283j = new ArrayList();

    /* renamed from: k */
    public Map f23284k;

    /* renamed from: l */
    public long f23285l;
    @Nullable

    /* renamed from: m */
    public C9392hv f23286m;

    public C9390hu() {
    }

    C9390hu(C9101bn bnVar) {
        bnVar.mo57868h();
        String str = null;
        String str2 = null;
        while (bnVar.mo57870j()) {
            String l = bnVar.mo57872l();
            if ("frame".equals(l)) {
                bnVar.mo57868h();
                while (bnVar.mo57870j()) {
                    String l2 = bnVar.mo57872l();
                    if ("portrait".equals(l2)) {
                        this.f23274a = (C9396hx) C9396hx.f23294e.mo57847a(bnVar);
                    } else if ("landscape".equals(l2)) {
                        this.f23275b = (C9396hx) C9396hx.f23294e.mo57847a(bnVar);
                    } else if ("close_button".equals(l2)) {
                        this.f23276c = (C9396hx) C9396hx.f23294e.mo57847a(bnVar);
                    } else if ("close_button_offset".equals(l2)) {
                        this.f23277d = (Point) C9094bj.f22384a.mo57847a(bnVar);
                    } else {
                        bnVar.mo57879s();
                    }
                }
                bnVar.mo57869i();
            } else if (VisionDataDBAdapter.VisionDataColumns.COLUMN_CREATIVE.equals(l)) {
                bnVar.mo57868h();
                while (bnVar.mo57870j()) {
                    String l3 = bnVar.mo57872l();
                    if ("portrait".equals(l3)) {
                        this.f23278e = (C9396hx) C9396hx.f23294e.mo57847a(bnVar);
                    } else if ("landscape".equals(l3)) {
                        this.f23279f = (C9396hx) C9396hx.f23294e.mo57847a(bnVar);
                    } else {
                        bnVar.mo57879s();
                    }
                }
                bnVar.mo57869i();
            } else if ("url".equals(l)) {
                this.f23280g = bnVar.mo57857b();
            } else if (C9378ho.m25200a(l)) {
                this.f23281h = C9378ho.m25199a(l, bnVar);
            } else if ("mappings".equals(l)) {
                bnVar.mo57868h();
                while (bnVar.mo57870j()) {
                    String l4 = bnVar.mo57872l();
                    if ("portrait".equals(l4)) {
                        bnVar.mo57854a((List) this.f23282i, C9384hs.f23253h);
                    } else if ("landscape".equals(l4)) {
                        bnVar.mo57854a((List) this.f23283j, C9384hs.f23253h);
                    } else {
                        bnVar.mo57879s();
                    }
                }
                bnVar.mo57869i();
            } else if (ServerParameters.META.equals(l)) {
                this.f23284k = bnVar.mo57860d();
            } else if ("ttl".equals(l)) {
                this.f23285l = SystemClock.elapsedRealtime() + ((long) (bnVar.mo57876p() * 1000.0d));
            } else if ("no_more_today".equals(l)) {
                this.f23286m = (C9392hv) C9392hv.f23287d.mo57847a(bnVar);
            } else if ("ad_content".equals(l)) {
                str = bnVar.mo57857b();
            } else if (TapjoyConstants.TJC_REDIRECT_URL.equals(l)) {
                str2 = bnVar.mo57857b();
            } else {
                bnVar.mo57879s();
            }
        }
        bnVar.mo57869i();
        if (this.f23280g == null) {
            this.f23280g = "";
        }
        ArrayList arrayList = this.f23282i;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C9384hs hsVar = (C9384hs) it.next();
                if (hsVar.f23259f == null) {
                    hsVar.f23259f = str;
                }
                if (hsVar.f23258e == null) {
                    hsVar.f23258e = str2;
                }
            }
        }
        ArrayList arrayList2 = this.f23283j;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C9384hs hsVar2 = (C9384hs) it2.next();
                if (hsVar2.f23259f == null) {
                    hsVar2.f23259f = str;
                }
                if (hsVar2.f23258e == null) {
                    hsVar2.f23258e = str2;
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo58327a() {
        return (this.f23276c == null || this.f23274a == null || this.f23278e == null) ? false : true;
    }

    /* renamed from: b */
    public final boolean mo58328b() {
        return (this.f23276c == null || this.f23275b == null || this.f23279f == null) ? false : true;
    }
}
