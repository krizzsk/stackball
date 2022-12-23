package com.fyber.inneractive.sdk.player.p059c.p078j.p079a;

import java.io.File;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.c.j.a.a */
public interface C3480a {

    /* renamed from: com.fyber.inneractive.sdk.player.c.j.a.a$b */
    public interface C3482b {
        /* renamed from: a */
        void mo19318a(C3480a aVar, C3490g gVar);

        /* renamed from: a */
        void mo19319a(C3480a aVar, C3490g gVar, C3490g gVar2);

        /* renamed from: a */
        void mo19320a(C3490g gVar);
    }

    /* renamed from: a */
    long mo19309a();

    /* renamed from: a */
    long mo19310a(String str);

    /* renamed from: a */
    C3490g mo19311a(String str, long j) throws InterruptedException, C3481a;

    /* renamed from: a */
    File mo19312a(String str, long j, long j2) throws C3481a;

    /* renamed from: a */
    void mo19313a(C3490g gVar);

    /* renamed from: a */
    void mo19314a(File file) throws C3481a;

    /* renamed from: b */
    C3490g mo19315b(String str, long j) throws C3481a;

    /* renamed from: b */
    void mo19316b(C3490g gVar) throws C3481a;

    /* renamed from: c */
    void mo19317c(String str, long j) throws C3481a;

    /* renamed from: com.fyber.inneractive.sdk.player.c.j.a.a$a */
    public static class C3481a extends IOException {
        public C3481a(String str) {
            super(str);
        }

        public C3481a(IOException iOException) {
            super(iOException);
        }
    }
}
