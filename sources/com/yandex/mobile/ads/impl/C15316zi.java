package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.l50;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.zi */
public final class C15316zi extends View implements l50 {

    /* renamed from: a */
    private final List<C15055wl> f43130a = new ArrayList();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15316zi(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: a */
    public List<C15055wl> mo65869a() {
        return this.f43130a;
    }

    /* renamed from: a */
    public /* synthetic */ void mo65870a(C15055wl wlVar) {
        l50.CC.$default$a(this, wlVar);
    }

    /* renamed from: b */
    public /* synthetic */ void mo65871b() {
        l50.CC.$default$b(this);
    }

    public /* synthetic */ void release() {
        l50.CC.$default$release(this);
    }
}
