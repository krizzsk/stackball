package com.mbridge.msdk.video.dynview.p230i;

import android.view.View;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.tools.C6349m;
import com.mbridge.msdk.video.dynview.C6925b;
import com.mbridge.msdk.videocommon.p239d.C7177b;
import com.mbridge.msdk.videocommon.p239d.C7179c;

/* renamed from: com.mbridge.msdk.video.dynview.i.c */
/* compiled from: ViewOptionWrapper */
public final class C6983c {
    /* renamed from: a */
    public final C6925b mo48505a(View view, String str, int i, String str2) {
        int i2 = 0;
        C7179c a = C7177b.m18135a().mo49108a(C6122a.m15302b().mo42896e(), str2, false);
        if (a != null) {
            i2 = a.mo49134g();
        }
        return new C6925b.C6927a().mo48432a(str).mo48429a(i).mo48430a(view.getContext()).mo48431a(view).mo48437c(i2).mo48436b(C6349m.m16102d(view.getContext())).mo48434a();
    }
}
