package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import com.yandex.mobile.ads.exo.C12263o;
import com.yandex.mobile.ads.exo.drm.C12188d;
import com.yandex.mobile.ads.exo.metadata.C12230a;
import com.yandex.mobile.ads.exo.video.C12341c;
import com.yandex.mobile.ads.exo.video.C12344d;
import java.util.ArrayList;

/* renamed from: com.yandex.mobile.ads.impl.rk */
public class C14467rk {

    /* renamed from: a */
    private final Context f39480a;

    /* renamed from: b */
    private ql0 f39481b = ql0.f39179a;

    public C14467rk(Context context) {
        this.f39480a = context;
    }

    /* renamed from: a */
    public C12263o[] mo69775a(Handler handler, C12344d dVar, C13296ha haVar, nd1 nd1, qn0 qn0, C12188d<s70> dVar2) {
        C12188d<s70> dVar3 = dVar2 == null ? null : dVar2;
        ArrayList arrayList = new ArrayList();
        Context context = this.f39480a;
        ql0 ql0 = ql0.f39179a;
        arrayList.add(new C12341c(context, ql0, 5000, dVar3, false, false, handler, dVar, 50));
        Context context2 = this.f39480a;
        arrayList.add(new nl0(context2, ql0, dVar3, false, false, handler, haVar, new C15319zj(C12963ea.m35606a(context2), new C13184ga[0], false)));
        arrayList.add(new od1(nd1, handler.getLooper(), bc1.f31292a));
        arrayList.add(new C12230a(qn0, handler.getLooper(), on0.f38286a));
        arrayList.add(new C13700ke());
        return (C12263o[]) arrayList.toArray(new C12263o[0]);
    }
}
