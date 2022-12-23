package com.yandex.metrica.impl.p265ob;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* renamed from: com.yandex.metrica.impl.ob.n0 */
public class C11541n0 extends ResultReceiver {

    /* renamed from: b */
    public static final /* synthetic */ int f27743b = 0;

    /* renamed from: a */
    private final C11542a f27744a;

    /* renamed from: com.yandex.metrica.impl.ob.n0$a */
    public interface C11542a {
        /* renamed from: a */
        void mo61558a(int i, Bundle bundle);
    }

    public C11541n0(Handler handler, C11542a aVar) {
        super(handler);
        this.f27744a = aVar;
    }

    /* access modifiers changed from: protected */
    public void onReceiveResult(int i, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.setClassLoader(C10378Il.class.getClassLoader());
        this.f27744a.mo61558a(i, bundle);
    }
}
