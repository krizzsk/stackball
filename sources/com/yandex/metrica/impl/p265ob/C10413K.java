package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.yandex.metrica.impl.p265ob.C11361j0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.K */
public class C10413K implements C10237F2 {

    /* renamed from: a */
    private final List<C10820Um<Intent>> f25032a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Intent f25033b;

    /* renamed from: c */
    private final Context f25034c;

    /* renamed from: d */
    private final C11361j0 f25035d;

    /* renamed from: com.yandex.metrica.impl.ob.K$a */
    class C10414a implements C10762Sm<Context, Intent> {
        C10414a() {
        }

        /* renamed from: a */
        public void mo61639a(Object obj, Object obj2) {
            Context context = (Context) obj;
            Intent intent = (Intent) obj2;
            synchronized (C10413K.this) {
                Intent unused = C10413K.this.f25033b = intent;
                C10413K.this.m26703a(intent);
            }
        }
    }

    public C10413K(Context context, C11769sn snVar) {
        this(context, snVar, new C11361j0.C11362a());
    }

    /* renamed from: c */
    public synchronized Intent mo61638c(C10820Um<Intent> um) {
        this.f25032a.add(um);
        return this.f25033b;
    }

    C10413K(Context context, C11769sn snVar, C11361j0.C11362a aVar) {
        this.f25032a = new ArrayList();
        this.f25033b = null;
        this.f25034c = context;
        this.f25035d = aVar.mo63058a(new C11663pm(new C10414a(), snVar));
    }

    /* renamed from: a */
    public synchronized void mo61207a() {
        Intent a = this.f25035d.mo63056a(this.f25034c, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        this.f25033b = a;
        m26703a(a);
    }

    /* renamed from: b */
    public synchronized void mo61209b() {
        this.f25033b = null;
        this.f25033b = null;
        this.f25035d.mo63057a(this.f25034c);
        m26703a((Intent) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m26703a(Intent intent) {
        for (C10820Um<Intent> b : this.f25032a) {
            b.mo61092b(intent);
        }
    }
}
