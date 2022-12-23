package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.C14307pr;
import com.yandex.mobile.ads.nativeads.C15555x;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import java.util.List;

public class hs0 implements C14307pr {

    /* renamed from: a */
    private final List<NativeAd> f34541a;

    /* renamed from: b */
    private final NativeAdEventListener f34542b;

    /* renamed from: c */
    private final C14627sr f34543c = new C14627sr();

    /* renamed from: d */
    private final t50 f34544d = new t50();

    /* renamed from: e */
    private final u50 f34545e = new u50();

    /* renamed from: f */
    private final C15555x f34546f = new C15555x();

    public hs0(List<NativeAd> list, NativeAdEventListener nativeAdEventListener) {
        this.f34541a = list;
        this.f34542b = nativeAdEventListener;
    }

    /* renamed from: a */
    public void mo67619a(C13513jm jmVar, View view, C14697tn tnVar) {
    }

    /* renamed from: a */
    public /* synthetic */ void mo67620a(C13513jm jmVar, C14697tn tnVar) {
        C14307pr.CC.$default$a(this, jmVar, tnVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo67621a(com.yandex.mobile.ads.impl.C14697tn r5) {
        /*
            r4 = this;
            com.yandex.mobile.ads.impl.sr r0 = r4.f34543c
            java.lang.String r1 = "view"
            com.yandex.mobile.ads.impl.mr r5 = r0.mo70045a(r5, r1)
            r0 = 0
            if (r5 == 0) goto L_0x003d
            com.yandex.mobile.ads.impl.t50 r1 = r4.f34544d
            r1.getClass()
            org.json.JSONObject r1 = r5.f37495b
            r2 = 0
            if (r1 == 0) goto L_0x0020
            java.lang.String r3 = "position"
            int r1 = r1.getInt(r3)     // Catch:{ JSONException -> 0x0020 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ JSONException -> 0x0020 }
            goto L_0x0021
        L_0x0020:
            r1 = r2
        L_0x0021:
            com.yandex.mobile.ads.impl.u50 r3 = r4.f34545e
            r3.getClass()
            org.json.JSONObject r5 = r5.f37495b
            if (r5 == 0) goto L_0x0032
            java.lang.String r3 = "view_name"
            java.lang.String r2 = r5.getString(r3)     // Catch:{ JSONException -> 0x0031 }
            goto L_0x0032
        L_0x0031:
        L_0x0032:
            if (r1 == 0) goto L_0x003d
            java.lang.String r5 = "native_ad_view"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x003d
            r0 = 1
        L_0x003d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.hs0.mo67621a(com.yandex.mobile.ads.impl.tn):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo67622b(com.yandex.mobile.ads.impl.C13513jm r2, android.view.View r3, com.yandex.mobile.ads.impl.C14697tn r4) {
        /*
            r1 = this;
            r2 = 8
            r3.setVisibility(r2)
            com.yandex.mobile.ads.impl.sr r2 = r1.f34543c
            java.lang.String r0 = "view"
            com.yandex.mobile.ads.impl.mr r2 = r2.mo70045a(r4, r0)
            if (r2 == 0) goto L_0x005f
            com.yandex.mobile.ads.impl.t50 r4 = r1.f34544d
            r4.getClass()
            org.json.JSONObject r2 = r2.f37495b
            if (r2 == 0) goto L_0x0023
            java.lang.String r4 = "position"
            int r2 = r2.getInt(r4)     // Catch:{ JSONException -> 0x0023 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ JSONException -> 0x0023 }
            goto L_0x0024
        L_0x0023:
            r2 = 0
        L_0x0024:
            if (r2 == 0) goto L_0x005f
            int r4 = r2.intValue()
            if (r4 < 0) goto L_0x005f
            int r4 = r2.intValue()
            java.util.List<com.yandex.mobile.ads.nativeads.NativeAd> r0 = r1.f34541a
            int r0 = r0.size()
            if (r4 >= r0) goto L_0x005f
            java.util.List<com.yandex.mobile.ads.nativeads.NativeAd> r4 = r1.f34541a
            int r0 = r2.intValue()
            java.lang.Object r4 = r4.get(r0)
            com.yandex.mobile.ads.nativeads.NativeAd r4 = (com.yandex.mobile.ads.nativeads.NativeAd) r4
            com.yandex.mobile.ads.impl.aw0 r0 = new com.yandex.mobile.ads.impl.aw0
            int r2 = r2.intValue()
            r0.<init>(r2)
            com.yandex.mobile.ads.nativeads.x r2 = r1.f34546f
            com.yandex.mobile.ads.nativeads.NativeAdViewBinder r2 = r2.mo71937a(r3, r0)
            r4.bindNativeAd(r2)     // Catch:{ NativeAdException -> 0x005f }
            r2 = 0
            r3.setVisibility(r2)     // Catch:{ NativeAdException -> 0x005f }
            com.yandex.mobile.ads.nativeads.NativeAdEventListener r2 = r1.f34542b     // Catch:{ NativeAdException -> 0x005f }
            r4.setNativeAdEventListener(r2)     // Catch:{ NativeAdException -> 0x005f }
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.hs0.mo67622b(com.yandex.mobile.ads.impl.jm, android.view.View, com.yandex.mobile.ads.impl.tn):void");
    }

    /* renamed from: c */
    public /* synthetic */ void mo67623c(C13513jm jmVar, View view, C14697tn tnVar) {
        C14307pr.CC.$default$c(this, jmVar, view, tnVar);
    }
}
