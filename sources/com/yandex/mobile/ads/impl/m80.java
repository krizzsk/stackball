package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.os.ResultReceiver;
import com.yandex.mobile.ads.banner.AdSize;
import com.yandex.mobile.ads.banner.C12071a;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.AdResultReceiver;
import com.yandex.mobile.ads.base.C12095e;
import com.yandex.mobile.ads.base.C12115n;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.common.AdActivity;
import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.impl.C12686c0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public abstract class m80 extends me1 implements C14892vh {

    /* renamed from: I */
    private final h80 f37239I;

    /* renamed from: J */
    private final f80 f37240J = new f80();

    /* renamed from: K */
    private final C15230y2 f37241K;

    /* renamed from: L */
    private d80 f37242L;

    /* renamed from: M */
    private d80 f37243M;

    /* renamed from: N */
    private final C12468b0 f37244N;

    /* renamed from: O */
    private final l80 f37245O;

    /* renamed from: P */
    private final vb1 f37246P;

    /* renamed from: Q */
    private z70 f37247Q;

    /* renamed from: R */
    private C14252p3 f37248R;

    /* renamed from: S */
    private v70 f37249S;

    public m80(Context context, C12115n nVar, h80 h80, C15230y2 y2Var, v70 v70) {
        super(context, v70, nVar, y2Var);
        this.f37241K = y2Var;
        this.f37249S = v70;
        this.f37239I = h80;
        C13269h0 h0Var = new C13269h0();
        this.f37244N = h0Var;
        this.f37245O = new l80();
        this.f37246P = vb1.m43082a();
        mo64576a(C12071a.m31182a(AdSize.FULL_SCREEN));
        C12095e.m31385a().mo64517a("window_type_fullscreen", h0Var);
    }

    /* renamed from: A */
    public void mo68608A() {
        this.f37239I.onAdShown();
        d80 d80 = this.f37243M;
        if (d80 != this.f37242L) {
            m39326a(this.f29209b, d80);
            this.f37243M = this.f37242L;
        }
    }

    /* renamed from: B */
    public void mo68609B() {
        if (this.f37242L != null && !mo64599k()) {
            this.f37246P.mo70469b(ji0.SHOW, this);
            this.f37242L.mo66525b();
        }
    }

    /* renamed from: C */
    public void mo68610C() {
        z70 z70;
        AdResponse g = mo64595g();
        if (g != null && (z70 = this.f37247Q) != null) {
            mo68613a(new C12686c0(new C12686c0.C12687a(g).mo66174a(z70)));
            this.f37247Q = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract d80 mo68611a(e80 e80);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo64362a(int i) {
        return true;
    }

    /* renamed from: b */
    public void mo64584b(AdRequest adRequest) {
        mo64603p();
        super.mo64584b(adRequest);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo64601m() {
        this.f37239I.mo67430a(C14559s3.f39817j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo64406n() {
        this.f37239I.onAdLoaded();
    }

    public void onLeftApplication() {
        this.f37239I.onAdLeftApplication();
    }

    public void onReturnedToApplication() {
        this.f37239I.mo67428a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public boolean mo64368u() {
        return true;
    }

    /* renamed from: x */
    public void mo68614x() {
        z70 z70 = this.f37247Q;
        if (z70 != null) {
            z70.mo71164a((C14892vh) null);
        }
        this.f37247Q = null;
        this.f37246P.mo70468a(ji0.SHOW, this);
        m39326a(this.f29209b, this.f37243M, this.f37242L);
        synchronized (this) {
            super.mo64364c();
        }
        getClass().toString();
    }

    /* renamed from: y */
    public boolean mo68615y() {
        d80 d80 = this.f37242L;
        return d80 != null && d80.mo66524a();
    }

    /* renamed from: z */
    public void mo68616z() {
        mo64605r();
        this.f37246P.mo70468a(ji0.SHOW, this);
        this.f37239I.onAdDismissed();
    }

    /* renamed from: a */
    public void mo68613a(C12686c0 c0Var) {
        this.f37241K.mo70970b(C15139x2.AD_RENDER);
        Context context = this.f29209b;
        AdResultReceiver adResultReceiver = this.f43072y;
        long a = pc0.m40738a();
        Intent intent = new Intent(context, AdActivity.class);
        intent.putExtra("window_type", "window_type_fullscreen");
        intent.putExtra("extra_receiver", C13278h5.m36798a((ResultReceiver) adResultReceiver));
        intent.putExtra("data_identifier", a);
        intent.addFlags(268435456);
        C12845d0.m34958a().mo66381a(a, c0Var);
        try {
            context.startActivity(intent);
        } catch (Exception e) {
            c21.m34567a("Failed to show Interstitial Ad. Exception: " + e, new Object[0]);
        }
        mo64604q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo64363b(SizeInfo sizeInfo) {
        return sizeInfo.mo64491c(this.f29209b) > 0 && sizeInfo.mo64488a(this.f29209b) > 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo64585b(C12350a2 a2Var) {
        this.f37239I.mo67430a(a2Var);
    }

    /* JADX WARNING: type inference failed for: r3v10, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo64487a(int r3, android.os.Bundle r4) {
        /*
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            r0.toString()
            r0 = 0
            if (r3 == 0) goto L_0x0057
            r1 = 2
            if (r3 == r1) goto L_0x004d
            r1 = 3
            if (r3 == r1) goto L_0x0042
            r1 = 4
            if (r3 == r1) goto L_0x003e
            r1 = 5
            if (r3 == r1) goto L_0x0066
            switch(r3) {
                case 16: goto L_0x0029;
                case 17: goto L_0x0023;
                case 18: goto L_0x001d;
                default: goto L_0x0019;
            }
        L_0x0019:
            super.mo64487a(r3, r4)
            goto L_0x0066
        L_0x001d:
            com.yandex.mobile.ads.impl.h80 r3 = r2.f37239I
            r3.mo67428a()
            goto L_0x0066
        L_0x0023:
            com.yandex.mobile.ads.impl.h80 r3 = r2.f37239I
            r3.onAdLeftApplication()
            goto L_0x0066
        L_0x0029:
            if (r4 == 0) goto L_0x0038
            java.lang.String r3 = "impression_data_key"
            android.os.Parcelable r3 = r4.getParcelable(r3)
            boolean r4 = r3 instanceof com.yandex.mobile.ads.common.AdImpressionData
            if (r4 == 0) goto L_0x0038
            r0 = r3
            com.yandex.mobile.ads.common.AdImpressionData r0 = (com.yandex.mobile.ads.common.AdImpressionData) r0
        L_0x0038:
            com.yandex.mobile.ads.impl.h80 r3 = r2.f37239I
            r3.mo67429a((com.yandex.mobile.ads.common.AdImpressionData) r0)
            goto L_0x0066
        L_0x003e:
            r2.mo68616z()
            goto L_0x0066
        L_0x0042:
            com.yandex.mobile.ads.impl.v70 r3 = r2.f37249S
            r4 = 8
            r3.mo70455b(r4)
            r2.mo64405b((int) r4)
            goto L_0x0066
        L_0x004d:
            com.yandex.mobile.ads.impl.v70 r3 = r2.f37249S
            r4 = 0
            r3.mo70455b(r4)
            r2.mo64405b((int) r4)
            goto L_0x0066
        L_0x0057:
            if (r4 == 0) goto L_0x0062
            java.lang.String r3 = "extra_tracking_parameters"
            java.io.Serializable r3 = r4.getSerializable(r3)
            java.util.Map r3 = (java.util.Map) r3
            goto L_0x0063
        L_0x0062:
            r3 = r0
        L_0x0063:
            r2.mo64356a((android.webkit.WebView) r0, (java.util.Map<java.lang.String, java.lang.String>) r3)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.m80.mo64487a(int, android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo64361a(String str, AdResponse<String> adResponse, SizeInfo sizeInfo) {
        z70 z70 = new z70(this.f29209b, this.f29213f, adResponse, str, this.f43072y);
        this.f37247Q = z70;
        z70.mo71164a((C14892vh) this);
        this.f37247Q.mo71168g();
    }

    /* renamed from: a */
    public void mo68612a() {
        onAdLoaded();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if ((r0.mo64439s() == com.yandex.mobile.ads.base.model.C12110a.NATIVE) == false) goto L_0x0029;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo64356a(android.webkit.WebView r4, java.util.Map<java.lang.String, java.lang.String> r5) {
        /*
            r3 = this;
            com.yandex.mobile.ads.impl.y2 r4 = r3.f37241K
            com.yandex.mobile.ads.impl.x2 r0 = com.yandex.mobile.ads.impl.C15139x2.AD_RENDER
            r4.mo70965a(r0)
            com.yandex.mobile.ads.impl.p3 r4 = r3.f37248R
            if (r4 == 0) goto L_0x000e
            r4.mo69302a()
        L_0x000e:
            r3.mo68608A()
            com.yandex.mobile.ads.impl.l80 r4 = r3.f37245O
            com.yandex.mobile.ads.base.AdResponse<T> r0 = r3.f29227t
            r4.getClass()
            r4 = 0
            r1 = 1
            if (r0 == 0) goto L_0x0029
            com.yandex.mobile.ads.base.model.a r0 = r0.mo64439s()
            com.yandex.mobile.ads.base.model.a r2 = com.yandex.mobile.ads.base.model.C12110a.NATIVE
            if (r0 != r2) goto L_0x0026
            r0 = 1
            goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            if (r0 != 0) goto L_0x002a
        L_0x0029:
            r4 = 1
        L_0x002a:
            if (r4 == 0) goto L_0x002f
            r3.mo68673a((java.util.Map<java.lang.String, java.lang.String>) r5)
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.m80.mo64356a(android.webkit.WebView, java.util.Map):void");
    }

    /* renamed from: a */
    private void m39326a(Context context, d80... d80Arr) {
        Iterator it = new HashSet(Arrays.asList(d80Arr)).iterator();
        while (it.hasNext()) {
            d80 d80 = (d80) it.next();
            if (d80 != null) {
                d80.mo66522a(context);
            }
        }
    }

    /* renamed from: a */
    public void mo64404a(C12350a2 a2Var) {
        super.mo64404a(a2Var);
        mo64605r();
    }

    /* renamed from: a */
    public void mo64359a(AdImpressionData adImpressionData) {
        this.f37239I.mo67429a(adImpressionData);
    }

    /* renamed from: a */
    public void mo64360a(AdResponse<String> adResponse) {
        super.mo64358a(adResponse);
        xa0 xa0 = new xa0();
        xa0.mo70852a(adResponse);
        this.f37248R = new C14252p3(this.f29209b, adResponse, mo64592d(), this.f37241K, xa0);
        d80 a = mo68611a(this.f37240J.mo66937a(adResponse));
        this.f37242L = a;
        a.mo66523a(this.f29209b, adResponse);
    }
}
