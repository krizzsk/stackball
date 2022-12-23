package com.yandex.metrica.impl.p265ob;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.yandex.metrica.impl.ob.pm */
public class C11663pm extends BroadcastReceiver {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C10762Sm<Context, Intent> f27986a;

    /* renamed from: b */
    private final C11769sn f27987b;

    /* renamed from: com.yandex.metrica.impl.ob.pm$a */
    class C11664a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f27988a;

        /* renamed from: b */
        final /* synthetic */ Intent f27989b;

        C11664a(Context context, Intent intent) {
            this.f27988a = context;
            this.f27989b = intent;
        }

        public void run() {
            C11663pm.this.f27986a.mo61639a(this.f27988a, this.f27989b);
        }
    }

    public C11663pm(C10762Sm<Context, Intent> sm, C11769sn snVar) {
        this.f27986a = sm;
        this.f27987b = snVar;
    }

    public void onReceive(Context context, Intent intent) {
        ((C11725rn) this.f27987b).execute(new C11664a(context, intent));
    }
}
