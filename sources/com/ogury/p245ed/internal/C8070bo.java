package com.ogury.p245ed.internal;

import android.app.Activity;
import java.util.List;

/* renamed from: com.ogury.ed.internal.bo */
public final class C8070bo {
    /* renamed from: a */
    public static C8073bq m22485a(Activity activity, C8095cd cdVar, C8226fh fhVar) {
        C8467mq.m23881b(activity, "activity");
        C8467mq.m23881b(cdVar, "publisherActivityFilter");
        C8467mq.m23881b(fhVar, "overlayActivityConfig");
        C8073bq bqVar = new C8073bq(fhVar, activity.getClass());
        bqVar.mo53223a(activity);
        bqVar.mo53224a(cdVar.mo53264a());
        bqVar.mo53225b((List<? extends Class<? extends Activity>>) cdVar.mo53266b());
        return bqVar;
    }
}
