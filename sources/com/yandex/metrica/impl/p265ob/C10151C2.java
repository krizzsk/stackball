package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.os.ResultReceiver;
import com.yandex.metrica.CounterConfiguration;

/* renamed from: com.yandex.metrica.impl.ob.C2 */
public class C10151C2 {

    /* renamed from: a */
    private final String f24430a;

    /* renamed from: b */
    private final Context f24431b;

    /* renamed from: c */
    private final CounterConfiguration.C10019b f24432c;

    /* renamed from: d */
    private final C10205E2 f24433d;

    public C10151C2(String str, Context context, CounterConfiguration.C10019b bVar, C10205E2 e2) {
        this.f24430a = str;
        this.f24431b = context;
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            this.f24432c = CounterConfiguration.C10019b.SELF_DIAGNOSTIC_MAIN;
        } else if (ordinal != 1) {
            this.f24432c = null;
        } else {
            this.f24432c = CounterConfiguration.C10019b.SELF_DIAGNOSTIC_MANUAL;
        }
        this.f24433d = e2;
    }

    /* renamed from: a */
    public void mo61126a(C11411k0 k0Var) {
        if (this.f24432c != null) {
            try {
                String str = this.f24430a;
                CounterConfiguration counterConfiguration = new CounterConfiguration();
                synchronized (counterConfiguration) {
                    counterConfiguration.mo60799b(str);
                }
                counterConfiguration.mo60796a(this.f24432c);
                this.f24433d.mo61215a(k0Var.mo63144b(new C11414k2(new C10797U3(this.f24431b, (ResultReceiver) null), counterConfiguration, (String) null).mo63174c()));
            } catch (Throwable unused) {
            }
        }
    }
}
