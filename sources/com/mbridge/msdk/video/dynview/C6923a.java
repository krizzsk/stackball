package com.mbridge.msdk.video.dynview;

import com.mbridge.msdk.video.dynview.p221d.C6934c;
import com.mbridge.msdk.video.dynview.p226g.C6961a;
import java.util.Map;

/* renamed from: com.mbridge.msdk.video.dynview.a */
/* compiled from: MBUIController */
public class C6923a {

    /* renamed from: a */
    private static volatile C6923a f17065a;

    private C6923a() {
    }

    /* renamed from: a */
    public static C6923a m17464a() {
        C6923a aVar;
        if (f17065a != null) {
            return f17065a;
        }
        synchronized (C6923a.class) {
            if (f17065a == null) {
                f17065a = new C6923a();
            }
            aVar = f17065a;
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo48419a(C6925b bVar, C6934c cVar) {
        new C6961a(bVar, cVar, (Map<String, Object>) null);
    }
}
