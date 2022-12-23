package com.yandex.metrica.rtm.wrapper;

import android.content.Context;
import android.os.Bundle;
import com.yandex.metrica.rtm.service.EventToReporterProxy;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.rtm.wrapper.l */
public class C12061l implements C12055f {

    /* renamed from: a */
    private final EventToReporterProxy f29006a;

    public C12061l(C12058i iVar, Context context, Executor executor, C12059j jVar) {
        this(new EventToReporterProxy(new C12050a(iVar), context, executor, new C12052c(jVar)));
    }

    public void reportData(Bundle bundle) {
        try {
            this.f29006a.reportData(bundle);
        } catch (Throwable unused) {
        }
    }

    C12061l(EventToReporterProxy eventToReporterProxy) {
        this.f29006a = eventToReporterProxy;
    }
}
