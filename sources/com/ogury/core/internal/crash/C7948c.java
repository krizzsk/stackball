package com.ogury.core.internal.crash;

import android.content.Context;
import android.os.Build;
import com.ogury.core.internal.C7921ai;
import com.ogury.core.internal.crash.C7945a;
import com.ogury.core.internal.crash.C7969o;
import com.ogury.core.internal.crash.C7971p;
import java.io.File;
import java.io.IOException;
import org.json.JSONObject;

/* renamed from: com.ogury.core.internal.crash.c */
/* compiled from: CrashFileSerializer.kt */
public final class C7948c {

    /* renamed from: a */
    private final C7952e f20713a;

    /* renamed from: b */
    private final C7966m f20714b;

    /* renamed from: c */
    private final Throwable f20715c;

    /* renamed from: d */
    private final C7969o f20716d;

    /* renamed from: e */
    private final C7945a f20717e;

    /* renamed from: f */
    private final C7954f f20718f;

    /* renamed from: g */
    private final C7950d f20719g;

    /* renamed from: h */
    private final C7968n f20720h;

    /* renamed from: i */
    private final String f20721i;

    private C7948c(C7949a aVar) {
        this.f20713a = aVar.mo52928f();
        this.f20714b = aVar.mo52929g();
        this.f20715c = aVar.mo52930h();
        this.f20716d = aVar.mo52923a();
        this.f20717e = aVar.mo52924b();
        this.f20718f = aVar.mo52925c();
        this.f20719g = aVar.mo52926d();
        this.f20720h = aVar.mo52927e();
        this.f20721i = C7952e.m22187a(this.f20715c);
    }

    public /* synthetic */ C7948c(C7949a aVar, byte b) {
        this(aVar);
    }

    /* renamed from: com.ogury.core.internal.crash.c$a */
    /* compiled from: CrashFileSerializer.kt */
    public static final class C7949a {

        /* renamed from: a */
        private C7969o f20722a;

        /* renamed from: b */
        private C7945a f20723b;

        /* renamed from: c */
        private C7954f f20724c;

        /* renamed from: d */
        private C7950d f20725d;

        /* renamed from: e */
        private C7968n f20726e;

        /* renamed from: f */
        private final C7952e f20727f;

        /* renamed from: g */
        private final C7966m f20728g;

        /* renamed from: h */
        private final Throwable f20729h;

        public C7949a(Context context, C7952e eVar, C7966m mVar, Throwable th) {
            C7971p pVar;
            Context context2 = context;
            C7952e eVar2 = eVar;
            C7966m mVar2 = mVar;
            Throwable th2 = th;
            C7921ai.m22144b(context2, "context");
            C7921ai.m22144b(eVar2, "crashFormatter");
            C7921ai.m22144b(mVar2, "fileStore");
            C7921ai.m22144b(th2, "throwable");
            this.f20727f = eVar2;
            this.f20728g = mVar2;
            this.f20729h = th2;
            C7969o.C7970a aVar = C7969o.f20756a;
            String str = Build.MODEL;
            C7921ai.m22142a((Object) str, "Build.MODEL");
            String str2 = Build.VERSION.RELEASE;
            C7921ai.m22142a((Object) str2, "Build.VERSION.RELEASE");
            C7971p.C7972a aVar2 = C7971p.f20760a;
            Runtime runtime = Runtime.getRuntime();
            if (runtime != null) {
                pVar = new C7971p(runtime.freeMemory(), runtime.totalMemory(), runtime.maxMemory(), true);
            } else {
                pVar = new C7971p(0, 0, 0, false, 15);
            }
            this.f20722a = new C7969o(str, str2, pVar);
            C7945a.C7946a aVar3 = C7945a.f20709a;
            this.f20723b = C7945a.C7946a.m22170a(context);
            this.f20724c = new C7954f(context2);
            this.f20725d = new C7950d();
            this.f20726e = new C7968n(this.f20724c);
        }

        /* renamed from: f */
        public final C7952e mo52928f() {
            return this.f20727f;
        }

        /* renamed from: g */
        public final C7966m mo52929g() {
            return this.f20728g;
        }

        /* renamed from: h */
        public final Throwable mo52930h() {
            return this.f20729h;
        }

        /* renamed from: a */
        public final C7969o mo52923a() {
            return this.f20722a;
        }

        /* renamed from: b */
        public final C7945a mo52924b() {
            return this.f20723b;
        }

        /* renamed from: c */
        public final C7954f mo52925c() {
            return this.f20724c;
        }

        /* renamed from: d */
        public final C7950d mo52926d() {
            return this.f20725d;
        }

        /* renamed from: e */
        public final C7968n mo52927e() {
            return this.f20726e;
        }
    }

    /* renamed from: a */
    public final void mo52920a() throws IOException {
        String c;
        String a = this.f20720h.mo52953a(this.f20721i);
        if (a != null && (c = this.f20718f.mo52940c(a)) != null) {
            m22172a(c, 1);
        }
    }

    /* renamed from: a */
    public final void mo52921a(String str) {
        C7921ai.m22144b(str, "sdkKey");
        m22172a(str, 1);
    }

    /* renamed from: b */
    public final void mo52922b(String str) {
        C7921ai.m22144b(str, "sdkKey");
        m22172a(str, 2);
    }

    /* renamed from: a */
    private final void m22172a(String str, int i) {
        File a = this.f20714b.mo52949a(str, i);
        if (a != null) {
            JSONObject a2 = this.f20713a.mo52933a(this.f20717e, this.f20716d, this.f20715c, this.f20721i);
            if (this.f20718f.mo52939b(str)) {
                this.f20719g.mo52931a(a, a2, C7966m.m22213b(a));
            }
        }
    }
}
