package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.yandex.mobile.ads.impl.ip0;
import java.util.HashMap;
import java.util.Map;

public class ap0 implements bx0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final uo0 f30636a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final cy0 f30637b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final op0 f30638c;

    /* renamed from: d */
    private final ip0 f30639d = new ip0();

    /* renamed from: e */
    private jo1 f30640e = jo1.LOADING;

    /* renamed from: f */
    private final c50 f30641f;

    /* renamed from: g */
    private final e50 f30642g;

    /* renamed from: h */
    private final String f30643h;

    /* renamed from: i */
    private final qo1 f30644i = new qo1();

    /* renamed from: j */
    private final yg1 f30645j = new yg1();

    /* renamed from: k */
    private jp0 f30646k;

    /* renamed from: l */
    private lo0 f30647l;

    /* renamed from: m */
    private ko0 f30648m;

    /* renamed from: n */
    private ax0 f30649n;

    /* renamed from: o */
    private hm1 f30650o;

    /* renamed from: p */
    private b50 f30651p;

    /* renamed from: com.yandex.mobile.ads.impl.ap0$a */
    class C12410a implements ip0.C13432a {

        /* renamed from: a */
        final /* synthetic */ String f30652a;

        C12410a(String str) {
            this.f30652a = str;
        }

        /* renamed from: a */
        public void mo65842a(String str) {
            ap0.this.f30638c.mo69250a(str);
            ap0.this.f30636a.mo70388b(this.f30652a);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ap0$b */
    static /* synthetic */ class C12411b {

        /* renamed from: a */
        static final /* synthetic */ int[] f30654a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.yandex.mobile.ads.impl.fp0[] r0 = com.yandex.mobile.ads.impl.fp0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30654a = r0
                com.yandex.mobile.ads.impl.fp0 r1 = com.yandex.mobile.ads.impl.fp0.CLOSE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30654a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yandex.mobile.ads.impl.fp0 r1 = com.yandex.mobile.ads.impl.fp0.USE_CUSTOM_CLOSE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f30654a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.yandex.mobile.ads.impl.fp0 r1 = com.yandex.mobile.ads.impl.fp0.OPEN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f30654a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.yandex.mobile.ads.impl.fp0 r1 = com.yandex.mobile.ads.impl.fp0.AD_VIDEO_COMPLETE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f30654a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.yandex.mobile.ads.impl.fp0 r1 = com.yandex.mobile.ads.impl.fp0.IMPRESSION_TRACKING_START     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f30654a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.yandex.mobile.ads.impl.fp0 r1 = com.yandex.mobile.ads.impl.fp0.IMPRESSION_TRACKING_SUCCESS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f30654a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.yandex.mobile.ads.impl.fp0 r1 = com.yandex.mobile.ads.impl.fp0.REWARDED_AD_COMPLETE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ap0.C12411b.<clinit>():void");
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ap0$c */
    private class C12412c implements hb0 {
        private C12412c() {
        }

        /* renamed from: a */
        public void mo65843a(int i) {
        }

        /* renamed from: a */
        public void mo65844a(Context context, String str) {
            ap0.this.f30637b.mo65844a(context, str);
        }

        /* renamed from: b */
        public void mo65845b() {
            ap0.this.f30637b.mo65845b();
        }

        /* synthetic */ C12412c(ap0 ap0, C12410a aVar) {
            this();
        }
    }

    public ap0(cy0 cy0) {
        this.f30637b = cy0;
        op0 op0 = new op0(new C12412c(this, (C12410a) null));
        this.f30638c = op0;
        cy0.setWebViewClient(op0);
        this.f30636a = new uo0(cy0);
        c50 c50 = new c50();
        this.f30641f = c50;
        this.f30642g = new e50(cy0, c50, this);
        this.f30643h = C13278h5.m36800a(this);
    }

    /* renamed from: b */
    private void m33829b(b50 b50) {
        if (!b50.equals(this.f30651p)) {
            this.f30651p = b50;
            d50 d50 = new d50(b50.mo65969a(), b50.mo65970b());
            this.f30636a.mo70387a(d50);
        }
    }

    /* renamed from: a */
    public void mo65834a(jp0 jp0) {
        this.f30646k = jp0;
    }

    /* renamed from: c */
    public void mo65841c() {
        this.f30642g.mo66766b();
        ip0 ip0 = this.f30639d;
        Context context = this.f30637b.getContext();
        String str = this.f30643h;
        ip0.getClass();
        s41.m41806a().mo69870a(context, str);
        this.f30646k = null;
        this.f30647l = null;
        this.f30648m = null;
        this.f30649n = null;
        this.f30650o = null;
    }

    /* renamed from: a */
    public void mo65836a(lo0 lo0) {
        this.f30647l = lo0;
    }

    /* renamed from: a */
    public void mo65835a(ko0 ko0) {
        this.f30648m = ko0;
    }

    /* renamed from: a */
    public void mo65831a(ax0 ax0) {
        this.f30649n = ax0;
    }

    /* renamed from: a */
    public void mo65833a(hm1 hm1) {
        this.f30650o = hm1;
    }

    /* renamed from: a */
    public void mo65837a(String str) {
        Context context = this.f30637b.getContext();
        ip0 ip0 = this.f30639d;
        String str2 = this.f30643h;
        C12410a aVar = new C12410a(str);
        ip0.getClass();
        d71 a = l71.m38631c().mo68362a(context);
        if (a == null || TextUtils.isEmpty(a.mo66458g())) {
            aVar.mo65842a(ip0.f34987a);
            return;
        }
        rb1 rb1 = new rb1(0, a.mo66458g(), new gp0(ip0, aVar), new hp0(ip0, aVar));
        rb1.mo68339b((Object) str2);
        synchronized (s41.m41806a()) {
            lv0.m39021a(context).mo70284a(rb1);
        }
    }

    /* renamed from: b */
    public void mo65839b() {
        if (jo1.f35418c == this.f30640e) {
            jo1 jo1 = jo1.HIDDEN;
            this.f30640e = jo1;
            this.f30636a.mo70387a(jo1);
        }
    }

    /* renamed from: b */
    public void mo65840b(String str) {
        if (this.f30645j.mo71077c(str)) {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            if (CampaignEx.JSON_KEY_MRAID.equals(scheme) || "mobileads".equals(scheme)) {
                HashMap hashMap = new HashMap();
                for (String next : parse.getQueryParameterNames()) {
                    hashMap.put(next, parse.getQueryParameter(next));
                }
                fp0 a = fp0.m36097a(host);
                try {
                    m33827a(a, hashMap);
                } catch (Exception e) {
                    this.f30636a.mo70386a(a, e.getMessage());
                }
                this.f30636a.mo70385a(a);
                return;
            }
            return;
        }
        this.f30636a.mo70386a(fp0.UNSPECIFIED, "Mraid command sent an invalid URL");
    }

    /* renamed from: a */
    public void mo65830a() {
        gc1 gc1 = new gc1(this.f30637b);
        uo1 uo1 = new uo1(this.f30644i.mo69624a(this.f30637b));
        b50 a = this.f30641f.mo66204a(this.f30637b);
        d50 d50 = new d50(a.mo65969a(), a.mo65970b());
        jo1 jo1 = jo1.f35418c;
        this.f30640e = jo1;
        this.f30636a.mo70387a(jo1, uo1, d50, gc1);
        this.f30636a.mo70384a();
        jp0 jp0 = this.f30646k;
        if (jp0 != null) {
            jp0.onAdLoaded();
        }
    }

    /* renamed from: a */
    public void mo65838a(boolean z) {
        uo1 uo1 = new uo1(z);
        this.f30636a.mo70387a(uo1);
        if (z) {
            this.f30642g.mo66765a();
            return;
        }
        this.f30642g.mo66766b();
        m33829b(this.f30641f.mo66204a(this.f30637b));
    }

    /* renamed from: a */
    public void mo65832a(b50 b50) {
        m33829b(b50);
    }

    /* renamed from: a */
    private void m33827a(fp0 fp0, Map<String, String> map) throws yo0 {
        if (this.f30646k != null) {
            switch (C12411b.f30654a[fp0.ordinal()]) {
                case 1:
                    if (jo1.f35418c == this.f30640e) {
                        jo1 jo1 = jo1.HIDDEN;
                        this.f30640e = jo1;
                        this.f30636a.mo70387a(jo1);
                        ax0 ax0 = this.f30649n;
                        if (ax0 != null) {
                            ax0.mo65921b();
                            return;
                        }
                        return;
                    }
                    return;
                case 2:
                    if (this.f30649n != null) {
                        this.f30649n.mo65920a(Boolean.parseBoolean(map.get("shouldUseCustomClose")));
                        return;
                    }
                    return;
                case 3:
                    if (this.f30646k != null) {
                        String str = map.get("url");
                        if (!TextUtils.isEmpty(str)) {
                            this.f30646k.mo68074a(str);
                            return;
                        } else {
                            throw new yo0(String.format("Mraid open command sent an invalid URL: %s", new Object[]{str}));
                        }
                    } else {
                        return;
                    }
                case 4:
                    hm1 hm1 = this.f30650o;
                    if (hm1 != null) {
                        ((dm1) hm1).mo66642a();
                        return;
                    }
                    return;
                case 5:
                    ko0 ko0 = this.f30648m;
                    if (ko0 != null) {
                        ko0.mo68156c();
                        return;
                    }
                    return;
                case 6:
                    ko0 ko02 = this.f30648m;
                    if (ko02 != null) {
                        ko02.mo68157e();
                        return;
                    }
                    return;
                case 7:
                    lo0 lo0 = this.f30647l;
                    if (lo0 != null) {
                        lo0.mo68155a();
                        return;
                    }
                    return;
                default:
                    throw new yo0("Unspecified MRAID Javascript command");
            }
        } else {
            throw new yo0("Invalid state to execute this command");
        }
    }
}
