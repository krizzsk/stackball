package com.yandex.mobile.ads.nativeads;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import com.appsflyer.internal.referrer.Payload;
import com.yandex.mobile.ads.impl.C13198gf;
import com.yandex.mobile.ads.impl.h41;
import com.yandex.mobile.ads.impl.k41;
import com.yandex.mobile.ads.impl.wc1;
import java.util.HashMap;

/* renamed from: com.yandex.mobile.ads.nativeads.d */
public class C15480d implements wc1 {

    /* renamed from: a */
    private final Handler f43825a = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final CustomClickHandler f43826b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ResultReceiver f43827c;

    /* renamed from: com.yandex.mobile.ads.nativeads.d$a */
    class C15481a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f43828b;

        C15481a(String str) {
            this.f43828b = str;
        }

        public void run() {
            C15480d dVar = C15480d.this;
            dVar.f43826b.handleCustomClick(this.f43828b, new C15482b(dVar, (C15481a) null));
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.d$b */
    private class C15482b implements CustomClickHandlerEventListener {
        private C15482b() {
        }

        public void onLeftApplication() {
            C15480d.this.f43827c.send(19, (Bundle) null);
        }

        public void onReturnedToApplication() {
            C15480d.this.f43827c.send(20, (Bundle) null);
        }

        /* synthetic */ C15482b(C15480d dVar, C15481a aVar) {
            this();
        }
    }

    public C15480d(CustomClickHandler customClickHandler, ResultReceiver resultReceiver) {
        this.f43826b = customClickHandler;
        this.f43827c = resultReceiver;
    }

    /* renamed from: a */
    public void mo68549a(k41 k41, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("click_type", Payload.CUSTOM);
        ((C13198gf) k41).mo67277b(h41.C13276b.CLICK, hashMap);
        this.f43825a.post(new C15481a(str));
    }
}
