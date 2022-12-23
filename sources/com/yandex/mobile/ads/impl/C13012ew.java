package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.ew */
public class C13012ew {

    /* renamed from: a */
    private final C12660bw f33165a;

    @Inject
    public C13012ew(C12660bw bwVar, Provider<C15257yl> provider) {
        Intrinsics.checkNotNullParameter(bwVar, "divPatchCache");
        Intrinsics.checkNotNullParameter(provider, "divViewCreator");
        this.f33165a = bwVar;
    }

    /* renamed from: a */
    public List<View> mo66878a(C13513jm jmVar, String str) {
        Intrinsics.checkNotNullParameter(jmVar, "rootView");
        Intrinsics.checkNotNullParameter(str, "id");
        this.f33165a.mo66131a(jmVar.mo68037g(), str);
        return null;
    }
}
