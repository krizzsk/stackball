package com.ogury.core.internal.crash;

import com.ogury.core.internal.C7921ai;
import com.ogury.core.internal.C7998w;
import com.ogury.core.internal.crash.C7960k;
import com.ogury.core.internal.crash.C7964l;
import java.lang.Thread;

/* renamed from: com.ogury.core.internal.crash.g */
/* compiled from: CrashReportFacade.kt */
public final class C7956g {

    /* renamed from: a */
    private boolean f20732a;

    /* renamed from: b */
    private final C7954f f20733b;

    /* renamed from: c */
    private final C7966m f20734c;

    /* renamed from: d */
    private final C7959j f20735d;

    /* renamed from: e */
    private final C7960k f20736e;

    /* renamed from: f */
    private final C7964l.C7965a f20737f;

    private C7956g(C7954f fVar, C7966m mVar, C7959j jVar, C7960k kVar, C7964l.C7965a aVar) {
        C7921ai.m22144b(fVar, "crashReportDao");
        C7921ai.m22144b(mVar, "fileStore");
        C7921ai.m22144b(jVar, "crashSerializerFactory");
        C7921ai.m22144b(kVar, "crashUploader");
        C7921ai.m22144b(aVar, "exceptionHandler");
        this.f20733b = fVar;
        this.f20734c = mVar;
        this.f20735d = jVar;
        this.f20736e = kVar;
        this.f20737f = aVar;
    }

    public /* synthetic */ C7956g(C7954f fVar, C7966m mVar, C7959j jVar, C7960k kVar, C7964l.C7965a aVar, int i) {
        this(fVar, mVar, jVar, new C7960k(fVar, mVar, (C7950d) null, 4), C7964l.f20751a);
    }

    /* renamed from: a */
    public final void mo52943a(String str, CrashConfig crashConfig) {
        C7921ai.m22144b(str, "sdkKey");
        C7921ai.m22144b(crashConfig, "crashConfig");
        this.f20734c.mo52950a(str);
        this.f20733b.mo52936a(str, crashConfig.getUrl());
        this.f20733b.mo52937a(str, true);
        this.f20733b.mo52938b(crashConfig.getPackageName(), str);
        this.f20733b.mo52941d(crashConfig.getPackageName());
        C7960k kVar = this.f20736e;
        int sendCrashFrequency = crashConfig.getSendCrashFrequency();
        int deleteAllCrashesFrequency = crashConfig.getDeleteAllCrashesFrequency();
        C7921ai.m22144b(str, "sdkKey");
        Thread unused = C7998w.m22244a(true, false, (ClassLoader) null, (String) null, -1, new C7960k.C7962b(kVar, str, sendCrashFrequency, deleteAllCrashesFrequency));
        if (!this.f20732a) {
            C7959j jVar = this.f20735d;
            C7921ai.m22144b(jVar, "crashSerializerFactory");
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (!(defaultUncaughtExceptionHandler instanceof C7964l)) {
                Thread.setDefaultUncaughtExceptionHandler(new C7964l(jVar, defaultUncaughtExceptionHandler));
            }
            this.f20732a = true;
        }
    }

    /* renamed from: a */
    public final void mo52942a(String str) {
        C7921ai.m22144b(str, "sdkKey");
        C7960k kVar = this.f20736e;
        C7921ai.m22144b(str, "sdkKey");
        Thread unused = C7998w.m22244a(true, false, (ClassLoader) null, (String) null, -1, new C7960k.C7963c(kVar, str));
    }

    /* renamed from: b */
    public final void mo52945b(String str) {
        C7921ai.m22144b(str, "sdkKey");
        this.f20733b.mo52937a(str, false);
    }

    /* renamed from: a */
    public final void mo52944a(String str, Throwable th) {
        C7921ai.m22144b(str, "sdkKey");
        C7921ai.m22144b(th, "t");
        this.f20735d.mo52947a(th).mo52922b(str);
    }

    /* renamed from: b */
    public final void mo52946b(String str, Throwable th) {
        C7921ai.m22144b(str, "sdkKey");
        C7921ai.m22144b(th, "t");
        this.f20735d.mo52947a(th).mo52921a(str);
    }
}
