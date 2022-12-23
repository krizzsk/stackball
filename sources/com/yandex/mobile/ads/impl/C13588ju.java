package com.yandex.mobile.ads.impl;

import android.app.Dialog;
import android.content.DialogInterface;
import com.yandex.mobile.ads.nativeads.C15526t;

/* renamed from: com.yandex.mobile.ads.impl.ju */
public class C13588ju implements C12382ag {

    /* renamed from: a */
    private final C15526t f35640a;

    /* renamed from: b */
    private final C14384qh f35641b;

    /* renamed from: c */
    private final C14934vu f35642c = new C14934vu();

    /* renamed from: d */
    private final C12606br f35643d = new C12606br();

    /* renamed from: e */
    private final z00 f35644e = new z00();

    /* renamed from: f */
    private Dialog f35645f;

    public C13588ju(C15526t tVar, C14384qh qhVar) {
        this.f35640a = tVar;
        this.f35641b = qhVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo65752a(android.content.Context r5) {
        /*
            r4 = this;
            com.yandex.mobile.ads.impl.vu r0 = r4.f35642c
            com.yandex.mobile.ads.nativeads.t r1 = r4.f35640a
            r0.getClass()
            java.util.List r0 = r1.mo71676b()
            if (r0 == 0) goto L_0x002a
            java.util.Iterator r0 = r0.iterator()
        L_0x0011:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x002a
            java.lang.Object r1 = r0.next()
            com.yandex.mobile.ads.impl.ru r1 = (com.yandex.mobile.ads.impl.C14535ru) r1
            java.lang.String r2 = r1.mo69820c()
            java.lang.String r3 = "close_dialog"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0011
            goto L_0x002b
        L_0x002a:
            r1 = 0
        L_0x002b:
            if (r1 == 0) goto L_0x0078
            com.yandex.mobile.ads.impl.br r0 = r4.f35643d
            com.yandex.mobile.ads.impl.zq r0 = r0.mo66108a(r1)
            if (r0 == 0) goto L_0x0072
            android.app.Dialog r1 = new android.app.Dialog
            int r2 = com.yandex.mobile.ads.C12066R.style.YandexAdsInternal_FullscreenDialog
            r1.<init>(r5, r2)
            com.yandex.mobile.ads.impl.-$$Lambda$ju$Fql3uz6dvYltZ39vZTQURE7zBak r2 = new com.yandex.mobile.ads.impl.-$$Lambda$ju$Fql3uz6dvYltZ39vZTQURE7zBak
            r2.<init>()
            r1.setOnDismissListener(r2)
            com.yandex.mobile.ads.impl.yf r2 = new com.yandex.mobile.ads.impl.yf
            com.yandex.mobile.ads.impl.qh r3 = r4.f35641b
            r2.<init>(r1, r3)
            com.yandex.mobile.ads.impl.zf r3 = new com.yandex.mobile.ads.impl.zf
            r3.<init>(r2)
            com.yandex.mobile.ads.impl.z00 r2 = r4.f35644e
            com.yandex.mobile.ads.impl.jm r5 = r2.mo71139a(r5)
            r5.setActionHandler(r3)
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
            com.yandex.mobile.ads.impl.cr r3 = new com.yandex.mobile.ads.impl.cr
            r3.<init>(r2)
            r5.mo68031a((com.yandex.mobile.ads.impl.C15340zq) r0, (com.yandex.mobile.ads.impl.C12758cr) r3)
            r1.setContentView(r5)
            r4.f35645f = r1
            r1.show()
            goto L_0x007d
        L_0x0072:
            com.yandex.mobile.ads.impl.qh r5 = r4.f35641b
            r5.mo67136g()
            goto L_0x007d
        L_0x0078:
            com.yandex.mobile.ads.impl.qh r5 = r4.f35641b
            r5.mo67136g()
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C13588ju.mo65752a(android.content.Context):void");
    }

    /* renamed from: a */
    public void mo65751a() {
        Dialog dialog = this.f35645f;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m38042a(DialogInterface dialogInterface) {
        this.f35645f = null;
    }
}
