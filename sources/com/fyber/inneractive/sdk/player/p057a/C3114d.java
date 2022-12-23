package com.fyber.inneractive.sdk.player.p057a;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.p034a.C2767s;
import com.fyber.inneractive.sdk.player.p057a.C3123g;
import com.fyber.inneractive.sdk.player.p059c.p078j.C3506g;
import com.fyber.inneractive.sdk.player.p059c.p078j.C3509i;
import com.fyber.inneractive.sdk.util.C3646d;
import com.fyber.inneractive.sdk.util.C3670q;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.fyber.inneractive.sdk.player.a.d */
public final class C3114d implements C3506g {

    /* renamed from: a */
    boolean f7672a = false;

    /* renamed from: b */
    C3103a f7673b;

    /* renamed from: c */
    C3116a f7674c;

    /* renamed from: d */
    C3117b f7675d;

    /* renamed from: e */
    int f7676e;

    /* renamed from: f */
    C2767s f7677f;

    /* renamed from: g */
    private C3123g f7678g;

    /* renamed from: h */
    private Uri f7679h;

    /* renamed from: i */
    private long f7680i = 0;

    /* renamed from: j */
    private FileInputStream f7681j;

    /* renamed from: k */
    private FileInputStream f7682k;

    /* renamed from: com.fyber.inneractive.sdk.player.a.d$a */
    public interface C3116a {
        /* renamed from: a */
        void mo18707a(Bitmap bitmap);
    }

    /* renamed from: com.fyber.inneractive.sdk.player.a.d$b */
    public interface C3117b {
        /* renamed from: a */
        void mo18708a(C3123g gVar);
    }

    /* renamed from: a */
    public final long mo18703a(C3509i iVar) throws IOException {
        if (this.f7673b == null) {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final AtomicReference atomicReference = new AtomicReference();
            final C3646d dVar = new C3646d();
            this.f7679h = iVar.f9498a;
            C3123g a = C3143n.m7413a().mo18734a(this.f7676e, iVar.f9498a.toString(), this.f7677f, new C3123g.C3134e() {
                /* renamed from: a */
                public final void mo18706a(C3103a aVar, Exception exc) {
                    if (!C3114d.this.f7672a) {
                        if (exc == null) {
                            Bitmap bitmap = dVar.f9929a;
                            if (!(bitmap == null || C3114d.this.f7674c == null)) {
                                C3114d.this.f7674c.mo18707a(bitmap);
                            }
                            C3114d.this.f7673b = aVar;
                        } else {
                            atomicReference.set(exc);
                        }
                    }
                    countDownLatch.countDown();
                }
            });
            this.f7678g = a;
            a.f7721o = dVar;
            this.f7678g.mo18715a();
            C3117b bVar = this.f7675d;
            if (bVar != null) {
                bVar.mo18708a(this.f7678g);
            }
            try {
                countDownLatch.await(7, TimeUnit.SECONDS);
                if (this.f7673b == null) {
                    if (atomicReference.get() == null) {
                        throw new IOException("Cache has failed to download");
                    }
                    throw new IOException((Throwable) atomicReference.get());
                }
            } catch (InterruptedException e) {
                this.f7678g.mo18719c();
                throw new IOException(e);
            }
        }
        this.f7680i = iVar.f9501d;
        String a2 = this.f7673b.f7626c ? this.f7673b.mo18673a("http.file.length") : String.valueOf(this.f7673b.mo18672a().length());
        if (a2 == null || !TextUtils.isDigitsOnly(a2)) {
            return -1;
        }
        return Long.parseLong(a2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0096 A[Catch:{ InterruptedException -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0099 A[Catch:{ InterruptedException -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00af A[Catch:{ InterruptedException -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b0 A[Catch:{ InterruptedException -> 0x0051 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo18702a(byte[] r10, int r11, int r12) throws java.io.IOException {
        /*
            r9 = this;
            com.fyber.inneractive.sdk.player.a.a r0 = r9.f7673b
            if (r0 != 0) goto L_0x0006
            r10 = -1
            return r10
        L_0x0006:
            if (r12 != 0) goto L_0x0009
            return r12
        L_0x0009:
            java.lang.Object r0 = r0.f7628e
            monitor-enter(r0)
            com.fyber.inneractive.sdk.player.a.a r1 = r9.f7673b     // Catch:{ all -> 0x00ce }
            java.io.File r1 = r1.mo18672a()     // Catch:{ all -> 0x00ce }
            long r1 = r1.length()     // Catch:{ all -> 0x00ce }
            int r2 = (int) r1     // Catch:{ all -> 0x00ce }
            r1 = 0
            if (r11 <= r2) goto L_0x0033
            com.fyber.inneractive.sdk.player.a.a r2 = r9.f7673b     // Catch:{ all -> 0x00ce }
            java.lang.String r2 = r2.f7625b     // Catch:{ all -> 0x00ce }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x00ce }
            int r4 = r10.length     // Catch:{ all -> 0x00ce }
            r3.<init>(r4)     // Catch:{ all -> 0x00ce }
            long r4 = r9.f7680i     // Catch:{ all -> 0x00ce }
            int r5 = (int) r4     // Catch:{ all -> 0x00ce }
            com.fyber.inneractive.sdk.util.C3669p.m9148a(r2, r5, r3)     // Catch:{ all -> 0x00ce }
            byte[] r2 = r3.toByteArray()     // Catch:{ all -> 0x00ce }
            java.lang.System.arraycopy(r2, r1, r10, r11, r12)     // Catch:{ all -> 0x00ce }
            monitor-exit(r0)     // Catch:{ all -> 0x00ce }
            return r12
        L_0x0033:
            com.fyber.inneractive.sdk.player.a.a r3 = r9.f7673b     // Catch:{ all -> 0x00ce }
            boolean r3 = r3.f7626c     // Catch:{ all -> 0x00ce }
            r4 = 0
            r6 = 1
            if (r3 == 0) goto L_0x006b
        L_0x003c:
            int r3 = r2 - r11
            if (r3 > 0) goto L_0x0058
            r2 = 50
            r9.wait(r4, r2)     // Catch:{ InterruptedException -> 0x0051 }
            com.fyber.inneractive.sdk.player.a.a r2 = r9.f7673b     // Catch:{ all -> 0x00ce }
            java.io.File r2 = r2.mo18672a()     // Catch:{ all -> 0x00ce }
            long r2 = r2.length()     // Catch:{ all -> 0x00ce }
            int r2 = (int) r2     // Catch:{ all -> 0x00ce }
            goto L_0x003c
        L_0x0051:
            r10 = move-exception
            java.io.IOException r11 = new java.io.IOException     // Catch:{ all -> 0x00ce }
            r11.<init>(r10)     // Catch:{ all -> 0x00ce }
            throw r11     // Catch:{ all -> 0x00ce }
        L_0x0058:
            java.io.FileInputStream r3 = r9.f7682k     // Catch:{ all -> 0x00ce }
            if (r3 != 0) goto L_0x0092
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x00ce }
            com.fyber.inneractive.sdk.player.a.a r3 = r9.f7673b     // Catch:{ all -> 0x00ce }
            java.io.File r3 = r3.mo18672a()     // Catch:{ all -> 0x00ce }
            r1.<init>(r3)     // Catch:{ all -> 0x00ce }
            r9.f7682k = r1     // Catch:{ all -> 0x00ce }
        L_0x0069:
            r1 = 1
            goto L_0x0092
        L_0x006b:
            java.io.FileInputStream r3 = r9.f7681j     // Catch:{ all -> 0x00ce }
            if (r3 != 0) goto L_0x0092
            java.lang.String r3 = "%s creating a single instance of fis"
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x00ce }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00ce }
            r7[r1] = r8     // Catch:{ all -> 0x00ce }
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r3, r7)     // Catch:{ all -> 0x00ce }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x00ce }
            com.fyber.inneractive.sdk.player.a.a r3 = r9.f7673b     // Catch:{ all -> 0x00ce }
            java.io.File r3 = r3.mo18672a()     // Catch:{ all -> 0x00ce }
            r1.<init>(r3)     // Catch:{ all -> 0x00ce }
            r9.f7681j = r1     // Catch:{ all -> 0x00ce }
            java.io.FileInputStream r1 = r9.f7682k     // Catch:{ all -> 0x00ce }
            com.fyber.inneractive.sdk.util.C3670q.m9158a((java.io.Closeable) r1)     // Catch:{ all -> 0x00ce }
            r1 = 0
            r9.f7682k = r1     // Catch:{ all -> 0x00ce }
            goto L_0x0069
        L_0x0092:
            java.io.FileInputStream r3 = r9.f7681j     // Catch:{ all -> 0x00ce }
            if (r3 != 0) goto L_0x0099
            java.io.FileInputStream r3 = r9.f7682k     // Catch:{ all -> 0x00ce }
            goto L_0x009b
        L_0x0099:
            java.io.FileInputStream r3 = r9.f7681j     // Catch:{ all -> 0x00ce }
        L_0x009b:
            long r6 = r9.f7680i     // Catch:{ all -> 0x00ce }
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x00b8
            if (r1 == 0) goto L_0x00b8
            long r4 = r9.f7680i     // Catch:{ all -> 0x00ce }
            long r4 = r3.skip(r4)     // Catch:{ all -> 0x00ce }
            long r6 = r9.f7680i     // Catch:{ all -> 0x00ce }
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x00b0
            goto L_0x00b8
        L_0x00b0:
            java.io.IOException r10 = new java.io.IOException     // Catch:{ all -> 0x00ce }
            java.lang.String r11 = "Failed to skip the stream"
            r10.<init>(r11)     // Catch:{ all -> 0x00ce }
            throw r10     // Catch:{ all -> 0x00ce }
        L_0x00b8:
            int r2 = r2 - r11
            int r1 = r10.length     // Catch:{ all -> 0x00ce }
            int r1 = java.lang.Math.min(r1, r2)     // Catch:{ all -> 0x00ce }
            int r12 = java.lang.Math.min(r1, r12)     // Catch:{ all -> 0x00ce }
            int r10 = r3.read(r10, r11, r12)     // Catch:{ all -> 0x00ce }
            monitor-exit(r0)     // Catch:{ all -> 0x00ce }
            long r11 = r9.f7680i
            long r0 = (long) r10
            long r11 = r11 + r0
            r9.f7680i = r11
            return r10
        L_0x00ce:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ce }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p057a.C3114d.mo18702a(byte[], int, int):int");
    }

    /* renamed from: a */
    public final Uri mo18704a() {
        return this.f7679h;
    }

    /* renamed from: b */
    public final void mo18705b() throws IOException {
        this.f7672a = true;
        this.f7680i = 0;
        C3670q.m9158a((Closeable) this.f7681j);
        C3670q.m9158a((Closeable) this.f7682k);
        this.f7681j = null;
        this.f7682k = null;
    }
}
