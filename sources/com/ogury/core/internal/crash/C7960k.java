package com.ogury.core.internal.crash;

import com.ogury.core.internal.C7917ae;
import com.ogury.core.internal.C7921ai;
import com.ogury.core.internal.C7922aj;
import com.ogury.core.internal.C7979g;
import java.io.File;
import org.json.JSONArray;

/* renamed from: com.ogury.core.internal.crash.k */
/* compiled from: CrashUploader.kt */
public final class C7960k {

    /* renamed from: a */
    private final C7954f f20742a;

    /* renamed from: b */
    private final C7966m f20743b;

    /* renamed from: c */
    private final C7950d f20744c;

    static {
        new C7961a((byte) 0);
    }

    private C7960k(C7954f fVar, C7966m mVar, C7950d dVar) {
        C7921ai.m22144b(fVar, "crashReportDao");
        C7921ai.m22144b(mVar, "fileStore");
        C7921ai.m22144b(dVar, "crashFileWriter");
        this.f20742a = fVar;
        this.f20743b = mVar;
        this.f20744c = dVar;
    }

    public /* synthetic */ C7960k(C7954f fVar, C7966m mVar, C7950d dVar, int i) {
        this(fVar, mVar, new C7950d());
    }

    /* renamed from: com.ogury.core.internal.crash.k$a */
    /* compiled from: CrashUploader.kt */
    public static final class C7961a {
        private C7961a() {
        }

        public /* synthetic */ C7961a(byte b) {
            this();
        }
    }

    /* renamed from: com.ogury.core.internal.crash.k$b */
    /* compiled from: CrashUploader.kt */
    static final class C7962b extends C7922aj implements C7917ae<C7979g> {

        /* renamed from: a */
        private /* synthetic */ C7960k f20745a;

        /* renamed from: b */
        private /* synthetic */ String f20746b;

        /* renamed from: c */
        private /* synthetic */ int f20747c;

        /* renamed from: d */
        private /* synthetic */ int f20748d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7962b(C7960k kVar, String str, int i, int i2) {
            super(0);
            this.f20745a = kVar;
            this.f20746b = str;
            this.f20747c = i;
            this.f20748d = i2;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo52894a() {
            C7960k.m22209a(this.f20745a, this.f20746b, this.f20747c, this.f20748d);
            return C7979g.f20769a;
        }
    }

    /* renamed from: com.ogury.core.internal.crash.k$c */
    /* compiled from: CrashUploader.kt */
    static final class C7963c extends C7922aj implements C7917ae<C7979g> {

        /* renamed from: a */
        private /* synthetic */ C7960k f20749a;

        /* renamed from: b */
        private /* synthetic */ String f20750b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7963c(C7960k kVar, String str) {
            super(0);
            this.f20749a = kVar;
            this.f20750b = str;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo52894a() {
            C7960k.m22208a(this.f20749a, this.f20750b);
            return C7979g.f20769a;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ void m22209a(C7960k kVar, String str, int i, int i2) {
        try {
            File c = kVar.f20743b.mo52952c(str);
            JSONArray b = C7966m.m22213b(c);
            C7973q qVar = C7973q.f20765a;
            JSONArray a = C7973q.m22228a(b, i);
            if (a.length() != 0) {
                C7947b bVar = C7947b.f20712a;
                String jSONArray = a.toString();
                C7921ai.m22142a((Object) jSONArray, "crashesToUpload.toString()");
                int a2 = C7947b.m22171a(jSONArray, kVar.f20742a.mo52934a(str));
                if (a2 == 201) {
                    kVar.f20744c.mo52932a(b, c);
                }
                if (a2 < 500 && b.length() >= i2) {
                    C7966m.m22212a(c);
                }
            }
        } catch (Exception e) {
            C7958i iVar = C7958i.f20738a;
            C7958i.m22206a(e);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ void m22208a(C7960k kVar, String str) {
        try {
            File b = kVar.f20743b.mo52951b(str);
            JSONArray b2 = C7966m.m22213b(b);
            if (b2.length() != 0) {
                C7947b bVar = C7947b.f20712a;
                String jSONArray = b2.toString();
                C7921ai.m22142a((Object) jSONArray, "savedCrashes.toString()");
                if (C7947b.m22171a(jSONArray, kVar.f20742a.mo52934a(str)) < 500) {
                    C7966m.m22212a(b);
                }
            }
        } catch (Exception e) {
            C7958i iVar = C7958i.f20738a;
            C7958i.m22206a(e);
        }
    }
}
