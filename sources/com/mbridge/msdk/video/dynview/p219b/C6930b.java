package com.mbridge.msdk.video.dynview.p219b;

import android.view.View;
import com.mbridge.msdk.video.dynview.C6925b;
import com.mbridge.msdk.video.dynview.p230i.C6982b;
import java.util.Map;

/* renamed from: com.mbridge.msdk.video.dynview.b.b */
/* compiled from: UIEnergize */
public class C6930b {

    /* renamed from: a */
    private static volatile C6930b f17086a;

    private C6930b() {
    }

    /* renamed from: a */
    public static C6930b m17506a() {
        C6930b bVar;
        if (f17086a != null) {
            return f17086a;
        }
        synchronized (C6930b.class) {
            if (f17086a == null) {
                f17086a = new C6930b();
            }
            bVar = f17086a;
        }
        return bVar;
    }

    /* renamed from: a */
    public final void mo48440a(View view, C6925b bVar, Map<String, Object> map) {
        if (bVar != null) {
            int h = bVar.mo48427h();
            if (h == 1) {
                new C6982b().mo48501a(view);
            } else if (h == 2) {
                new C6982b().mo48502a(view, bVar);
            } else if (h == 3) {
                new C6982b().mo48503b(view, bVar);
            } else if (h == 4) {
                new C6982b().mo48504c(view, bVar);
            }
        }
    }
}
