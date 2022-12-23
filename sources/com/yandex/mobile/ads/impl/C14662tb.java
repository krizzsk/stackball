package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.c51;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.mobile.ads.impl.tb */
public abstract class C14662tb<T> extends l41<T> {

    /* renamed from: r */
    private static final int f40272r = ((int) TimeUnit.SECONDS.toMillis(10));

    /* renamed from: q */
    private final C14663a<T> f40273q;

    /* renamed from: com.yandex.mobile.ads.impl.tb$a */
    public interface C14663a<T> extends c51.C12700b<T>, c51.C12699a {
    }

    public C14662tb(int i, String str, C14663a<T> aVar) {
        super(i, str, aVar);
        mo68332a(false);
        mo68330a(new C14602sk(f40272r, 0, 1.0f));
        this.f40273q = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo66996a(T t) {
        C14663a<T> aVar = this.f40273q;
        if (aVar != null) {
            aVar.mo64360a(t);
        }
    }
}
