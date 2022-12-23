package com.tapjoy.internal;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.tapjoy.internal.gh */
public final class C9318gh extends C9317gg {

    /* renamed from: b */
    private final ThreadPoolExecutor f23051b = new ThreadPoolExecutor(0, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public C9318gh(File file, C9343gy gyVar) {
        super(file, gyVar);
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            this.f23051b.shutdown();
            this.f23051b.awaitTermination(1, TimeUnit.SECONDS);
        } finally {
            super.finalize();
        }
    }

    /* renamed from: com.tapjoy.internal.gh$a */
    class C9319a implements Runnable {

        /* renamed from: b */
        private int f23053b;

        /* renamed from: c */
        private long f23054c;

        /* renamed from: d */
        private String f23055d;

        /* renamed from: e */
        private String f23056e;

        /* renamed from: f */
        private Map f23057f;

        C9319a(int i, long j, String str, String str2, Map map) {
            this.f23053b = i;
            this.f23054c = j;
            this.f23055d = str;
            this.f23056e = str2;
            this.f23057f = map;
        }

        public final void run() {
            try {
                int i = this.f23053b;
                if (i == 1) {
                    C9318gh.super.mo58193a(this.f23054c);
                } else if (i == 2) {
                    C9318gh.super.mo58192a();
                } else if (i == 3) {
                    C9318gh.super.mo58194a(this.f23054c, this.f23055d, this.f23056e, this.f23057f);
                }
            } catch (Throwable unused) {
                C9318gh.super.mo58192a();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58193a(long j) {
        try {
            this.f23051b.execute(new C9319a(1, j, (String) null, (String) null, (Map) null));
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58192a() {
        try {
            this.f23051b.execute(new C9319a(2, 0, (String) null, (String) null, (Map) null));
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58194a(long j, String str, String str2, Map map) {
        try {
            this.f23051b.execute(new C9319a(3, j, str, str2, map != null ? new HashMap(map) : null));
        } catch (Throwable unused) {
        }
    }
}
