package com.tapjoy.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import java.nio.ByteBuffer;

/* renamed from: com.tapjoy.internal.ig */
public final class C9411ig extends ImageView implements Runnable {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C9406ic f23379a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Bitmap f23380b;

    /* renamed from: c */
    private final Handler f23381c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private boolean f23382d;

    /* renamed from: e */
    private boolean f23383e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f23384f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Thread f23385g;

    /* renamed from: h */
    private C9415b f23386h = null;

    /* renamed from: i */
    private long f23387i = -1;

    /* renamed from: j */
    private C9414a f23388j = null;

    /* renamed from: k */
    private final Runnable f23389k = new Runnable() {
        public final void run() {
            if (C9411ig.this.f23380b != null && !C9411ig.this.f23380b.isRecycled()) {
                C9411ig igVar = C9411ig.this;
                igVar.setImageBitmap(igVar.f23380b);
            }
        }
    };

    /* renamed from: l */
    private final Runnable f23390l = new Runnable() {
        public final void run() {
            Bitmap unused = C9411ig.this.f23380b = null;
            C9406ic unused2 = C9411ig.this.f23379a = null;
            Thread unused3 = C9411ig.this.f23385g = null;
            boolean unused4 = C9411ig.this.f23384f = false;
        }
    };

    /* renamed from: com.tapjoy.internal.ig$a */
    public interface C9414a {
    }

    /* renamed from: com.tapjoy.internal.ig$b */
    public interface C9415b {
        /* renamed from: a */
        Bitmap mo58359a();
    }

    public C9411ig(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo58343a(C9409ie ieVar, byte[] bArr) {
        try {
            this.f23379a = new C9406ic(new C9416ih(), ieVar, ByteBuffer.wrap(bArr));
            if (this.f23382d) {
                m25273e();
            } else {
                m25272d();
            }
        } catch (Exception unused) {
            this.f23379a = null;
        }
    }

    public final void setBytes(byte[] bArr) {
        C9406ic icVar = new C9406ic();
        this.f23379a = icVar;
        try {
            icVar.mo58335a(bArr);
            if (this.f23382d) {
                m25273e();
            } else {
                m25272d();
            }
        } catch (Exception unused) {
            this.f23379a = null;
        }
    }

    public final long getFramesDisplayDuration() {
        return this.f23387i;
    }

    public final void setFramesDisplayDuration(long j) {
        this.f23387i = j;
    }

    /* renamed from: a */
    public final void mo58342a() {
        this.f23382d = true;
        m25273e();
    }

    /* renamed from: b */
    public final void mo58344b() {
        this.f23382d = false;
        Thread thread = this.f23385g;
        if (thread != null) {
            thread.interrupt();
            this.f23385g = null;
        }
    }

    /* renamed from: d */
    private void m25272d() {
        boolean z;
        if (this.f23379a.f23327a != 0) {
            C9406ic icVar = this.f23379a;
            if (-1 >= icVar.f23329c.f23364c) {
                z = false;
            } else {
                icVar.f23327a = -1;
                z = true;
            }
            if (z && !this.f23382d) {
                this.f23383e = true;
                m25273e();
            }
        }
    }

    /* renamed from: c */
    public final void mo58345c() {
        this.f23382d = false;
        this.f23383e = false;
        this.f23384f = true;
        mo58344b();
        this.f23381c.post(this.f23390l);
    }

    public final int getGifWidth() {
        return this.f23379a.f23329c.f23367f;
    }

    public final int getGifHeight() {
        return this.f23379a.f23329c.f23368g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004e A[Catch:{ ArrayIndexOutOfBoundsException | IllegalArgumentException -> 0x0069 }] */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0008  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
        L_0x0000:
            boolean r0 = r9.f23382d
            if (r0 != 0) goto L_0x0008
            boolean r0 = r9.f23383e
            if (r0 == 0) goto L_0x00b2
        L_0x0008:
            com.tapjoy.internal.ic r0 = r9.f23379a
            com.tapjoy.internal.ie r1 = r0.f23329c
            int r1 = r1.f23364c
            r2 = -1
            r3 = 1
            r4 = 0
            if (r1 > 0) goto L_0x0015
        L_0x0013:
            r3 = 0
            goto L_0x003c
        L_0x0015:
            int r1 = r0.f23327a
            com.tapjoy.internal.ie r5 = r0.f23329c
            int r5 = r5.f23364c
            int r5 = r5 - r3
            if (r1 != r5) goto L_0x0023
            int r1 = r0.f23328b
            int r1 = r1 + r3
            r0.f23328b = r1
        L_0x0023:
            com.tapjoy.internal.ie r1 = r0.f23329c
            int r1 = r1.f23374m
            if (r1 == r2) goto L_0x0032
            int r1 = r0.f23328b
            com.tapjoy.internal.ie r5 = r0.f23329c
            int r5 = r5.f23374m
            if (r1 <= r5) goto L_0x0032
            goto L_0x0013
        L_0x0032:
            int r1 = r0.f23327a
            int r1 = r1 + r3
            com.tapjoy.internal.ie r5 = r0.f23329c
            int r5 = r5.f23364c
            int r1 = r1 % r5
            r0.f23327a = r1
        L_0x003c:
            r0 = 0
            long r5 = java.lang.System.nanoTime()     // Catch:{ ArrayIndexOutOfBoundsException | IllegalArgumentException -> 0x0069 }
            com.tapjoy.internal.ic r7 = r9.f23379a     // Catch:{ ArrayIndexOutOfBoundsException | IllegalArgumentException -> 0x0069 }
            android.graphics.Bitmap r7 = r7.mo58336a()     // Catch:{ ArrayIndexOutOfBoundsException | IllegalArgumentException -> 0x0069 }
            r9.f23380b = r7     // Catch:{ ArrayIndexOutOfBoundsException | IllegalArgumentException -> 0x0069 }
            com.tapjoy.internal.ig$b r7 = r9.f23386h     // Catch:{ ArrayIndexOutOfBoundsException | IllegalArgumentException -> 0x0069 }
            if (r7 == 0) goto L_0x0056
            com.tapjoy.internal.ig$b r7 = r9.f23386h     // Catch:{ ArrayIndexOutOfBoundsException | IllegalArgumentException -> 0x0069 }
            android.graphics.Bitmap r7 = r7.mo58359a()     // Catch:{ ArrayIndexOutOfBoundsException | IllegalArgumentException -> 0x0069 }
            r9.f23380b = r7     // Catch:{ ArrayIndexOutOfBoundsException | IllegalArgumentException -> 0x0069 }
        L_0x0056:
            long r7 = java.lang.System.nanoTime()     // Catch:{ ArrayIndexOutOfBoundsException | IllegalArgumentException -> 0x0069 }
            long r7 = r7 - r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r7 / r5
            android.os.Handler r5 = r9.f23381c     // Catch:{ ArrayIndexOutOfBoundsException | IllegalArgumentException -> 0x0067 }
            java.lang.Runnable r6 = r9.f23389k     // Catch:{ ArrayIndexOutOfBoundsException | IllegalArgumentException -> 0x0067 }
            r5.post(r6)     // Catch:{ ArrayIndexOutOfBoundsException | IllegalArgumentException -> 0x0067 }
            goto L_0x006a
        L_0x0067:
            goto L_0x006a
        L_0x0069:
            r7 = r0
        L_0x006a:
            r9.f23383e = r4
            boolean r5 = r9.f23382d
            if (r5 == 0) goto L_0x00b0
            if (r3 != 0) goto L_0x0073
            goto L_0x00b0
        L_0x0073:
            com.tapjoy.internal.ic r3 = r9.f23379a     // Catch:{ InterruptedException -> 0x00aa }
            com.tapjoy.internal.ie r5 = r3.f23329c     // Catch:{ InterruptedException -> 0x00aa }
            int r5 = r5.f23364c     // Catch:{ InterruptedException -> 0x00aa }
            if (r5 <= 0) goto L_0x0097
            int r5 = r3.f23327a     // Catch:{ InterruptedException -> 0x00aa }
            if (r5 >= 0) goto L_0x0080
            goto L_0x0097
        L_0x0080:
            int r4 = r3.f23327a     // Catch:{ InterruptedException -> 0x00aa }
            if (r4 < 0) goto L_0x0096
            com.tapjoy.internal.ie r5 = r3.f23329c     // Catch:{ InterruptedException -> 0x00aa }
            int r5 = r5.f23364c     // Catch:{ InterruptedException -> 0x00aa }
            if (r4 >= r5) goto L_0x0096
            com.tapjoy.internal.ie r2 = r3.f23329c     // Catch:{ InterruptedException -> 0x00aa }
            java.util.List r2 = r2.f23366e     // Catch:{ InterruptedException -> 0x00aa }
            java.lang.Object r2 = r2.get(r4)     // Catch:{ InterruptedException -> 0x00aa }
            com.tapjoy.internal.id r2 = (com.tapjoy.internal.C9408id) r2     // Catch:{ InterruptedException -> 0x00aa }
            int r2 = r2.f23359i     // Catch:{ InterruptedException -> 0x00aa }
        L_0x0096:
            r4 = r2
        L_0x0097:
            long r2 = (long) r4     // Catch:{ InterruptedException -> 0x00aa }
            long r2 = r2 - r7
            int r3 = (int) r2     // Catch:{ InterruptedException -> 0x00aa }
            if (r3 <= 0) goto L_0x00ab
            long r4 = r9.f23387i     // Catch:{ InterruptedException -> 0x00aa }
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x00a5
            long r0 = r9.f23387i     // Catch:{ InterruptedException -> 0x00aa }
            goto L_0x00a6
        L_0x00a5:
            long r0 = (long) r3     // Catch:{ InterruptedException -> 0x00aa }
        L_0x00a6:
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x00aa }
            goto L_0x00ab
        L_0x00aa:
        L_0x00ab:
            boolean r0 = r9.f23382d
            if (r0 != 0) goto L_0x0000
            goto L_0x00b2
        L_0x00b0:
            r9.f23382d = r4
        L_0x00b2:
            boolean r0 = r9.f23384f
            if (r0 == 0) goto L_0x00bd
            android.os.Handler r0 = r9.f23381c
            java.lang.Runnable r1 = r9.f23390l
            r0.post(r1)
        L_0x00bd:
            r0 = 0
            r9.f23385g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C9411ig.run():void");
    }

    public final C9415b getOnFrameAvailable() {
        return this.f23386h;
    }

    public final void setOnFrameAvailable(C9415b bVar) {
        this.f23386h = bVar;
    }

    public final C9414a getOnAnimationStop() {
        return this.f23388j;
    }

    public final void setOnAnimationStop(C9414a aVar) {
        this.f23388j = aVar;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo58345c();
    }

    /* renamed from: e */
    private void m25273e() {
        if ((this.f23382d || this.f23383e) && this.f23379a != null && this.f23385g == null) {
            Thread thread = new Thread(this);
            this.f23385g = thread;
            thread.start();
        }
    }
}
