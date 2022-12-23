package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.metrica.impl.ob.K8 */
public final class C10423K8 {

    /* renamed from: a */
    private final Map<String, C10363I8> f25047a = new LinkedHashMap();

    /* renamed from: b */
    private final Lazy f25048b = LazyKt.lazy(new C10424a(this));
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f25049c;

    /* renamed from: com.yandex.metrica.impl.ob.K8$a */
    static final class C10424a extends Lambda implements Function0<C10332H8> {

        /* renamed from: a */
        final /* synthetic */ C10423K8 f25050a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10424a(C10423K8 k8) {
            super(0);
            this.f25050a = k8;
        }

        public Object invoke() {
            return new C10332H8(this.f25050a.f25049c, new C10442L0());
        }
    }

    public C10423K8(Context context) {
        this.f25049c = context;
    }

    /* renamed from: a */
    public final C10332H8 mo61658a() {
        return (C10332H8) this.f25048b.getValue();
    }

    /* renamed from: a */
    public final synchronized C10363I8 mo61659a(String str) {
        C10363I8 i8;
        String valueOf = String.valueOf(str);
        i8 = this.f25047a.get(valueOf);
        if (i8 == null) {
            i8 = new C10363I8(this.f25049c, valueOf, new C10442L0());
            this.f25047a.put(valueOf, i8);
        }
        return i8;
    }
}
