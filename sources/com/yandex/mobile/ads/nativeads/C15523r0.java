package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import android.os.ResultReceiver;
import com.yandex.mobile.ads.impl.C14645t1;
import com.yandex.mobile.ads.impl.C14894vj;
import com.yandex.mobile.ads.impl.d71;
import com.yandex.mobile.ads.impl.l71;
import com.yandex.mobile.ads.impl.wc1;

/* renamed from: com.yandex.mobile.ads.nativeads.r0 */
public class C15523r0 {

    /* renamed from: a */
    private CustomClickHandler f43943a;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71742a(CustomClickHandler customClickHandler) {
        this.f43943a = customClickHandler;
    }

    /* renamed from: a */
    public wc1 mo71741a(Context context, C14645t1 t1Var, ResultReceiver resultReceiver) {
        d71 a = l71.m38631c().mo68362a(context);
        boolean z = a != null && a.mo66467o();
        CustomClickHandler customClickHandler = this.f43943a;
        if (customClickHandler == null || !z) {
            return new C14894vj(context, t1Var, resultReceiver);
        }
        return new C15480d(customClickHandler, resultReceiver);
    }
}
