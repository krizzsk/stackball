package com.yandex.mobile.ads.impl;

import android.widget.FrameLayout;
import com.yandex.mobile.ads.base.C12135y;
import java.util.ArrayList;
import java.util.List;

public class he0 {

    /* renamed from: b */
    private static final List<C12135y.C12136a> f34382b = new C13315a();

    /* renamed from: a */
    private final ie0 f34383a = new ie0();

    /* renamed from: com.yandex.mobile.ads.impl.he0$a */
    class C13315a extends ArrayList<C12135y.C12136a> {
        C13315a() {
            add(C12135y.C12136a.SUCCESS);
            add(C12135y.C12136a.APPLICATION_INACTIVE);
            add(C12135y.C12136a.NOT_ADDED_TO_HIERARCHY);
        }
    }

    /* renamed from: a */
    public void mo67531a(FrameLayout frameLayout) {
        this.f34383a.mo67776a(frameLayout);
    }

    /* renamed from: a */
    public void mo67532a(C12135y yVar, FrameLayout frameLayout) {
        C12135y.C12136a e = yVar.mo64680e();
        this.f34383a.mo67777a(yVar, frameLayout, !((ArrayList) f34382b).contains(e));
    }
}
