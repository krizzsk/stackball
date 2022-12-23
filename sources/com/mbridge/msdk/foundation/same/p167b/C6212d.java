package com.mbridge.msdk.foundation.same.p167b;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mbridge.msdk.foundation.same.b.d */
/* compiled from: MBridgeDirContext */
public final class C6212d extends C6210b {
    public C6212d(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final List<C6209a> mo43782b() {
        ArrayList arrayList = new ArrayList();
        mo43781a(arrayList, C6211c.MBRIDGE_RES_MANAGER_DIR, "res");
        mo43781a(arrayList, C6211c.AD_MOVIES, "res/Movies").mo43774a(C6211c.MBRIDGE_VC, "res/.MBridge_VC");
        C6209a a = mo43781a(arrayList, C6211c.AD_MBRIDGE_700, "res/.mbridge700");
        a.mo43774a(C6211c.MBRIDGE_700_IMG, "res/img");
        a.mo43774a(C6211c.MBRIDGE_700_RES, "res/res");
        a.mo43774a(C6211c.MBRIDGE_700_HTML, "res/html");
        mo43781a(arrayList, C6211c.MBRIDGE_OTHER, "other");
        mo43781a(arrayList, C6211c.MBRIDGE_CRASH_INFO, "crashinfo");
        mo43781a(arrayList, C6211c.MBRIDGE_OTHER, "other");
        return arrayList;
    }
}
