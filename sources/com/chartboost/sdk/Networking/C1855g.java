package com.chartboost.sdk.Networking;

import android.os.Handler;
import com.chartboost.sdk.Libraries.C1832j;
import com.chartboost.sdk.Libraries.CBLogging;
import java.util.concurrent.Executor;

/* renamed from: com.chartboost.sdk.Networking.g */
public class C1855g {

    /* renamed from: a */
    private final Executor f4576a;

    /* renamed from: b */
    private final Executor f4577b;

    /* renamed from: c */
    private final C1863m f4578c;

    /* renamed from: d */
    private final C1856h f4579d;

    /* renamed from: e */
    private final C1832j f4580e;

    /* renamed from: f */
    private final Handler f4581f;

    public C1855g(Executor executor, C1863m mVar, C1856h hVar, C1832j jVar, Handler handler, Executor executor2) {
        this.f4576a = executor2;
        this.f4577b = executor;
        this.f4578c = mVar;
        this.f4579d = hVar;
        this.f4580e = jVar;
        this.f4581f = handler;
    }

    /* renamed from: a */
    public <T> void mo14335a(C1851c<T> cVar) {
        CBLogging.m3996d("CBRequest", "Execute request: " + cVar.f4561b);
        this.f4576a.execute(new C1862l(this.f4577b, this.f4578c, this.f4579d, this.f4580e, this.f4581f, cVar));
    }
}
