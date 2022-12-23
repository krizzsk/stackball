package com.yandex.mobile.ads.exo.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.yandex.mobile.ads.impl.C13479j9;
import com.yandex.mobile.ads.impl.bk0;
import com.yandex.mobile.ads.impl.ih1;
import com.yandex.mobile.ads.impl.t20;

public final class DummySurface extends Surface {

    /* renamed from: d */
    private static int f30316d;

    /* renamed from: e */
    private static boolean f30317e;

    /* renamed from: b */
    private final C12338b f30318b;

    /* renamed from: c */
    private boolean f30319c;

    /* JADX WARNING: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean m32493a(android.content.Context r9) {
        /*
            java.lang.Class<com.yandex.mobile.ads.exo.video.DummySurface> r0 = com.yandex.mobile.ads.exo.video.DummySurface.class
            monitor-enter(r0)
            boolean r1 = f30317e     // Catch:{ all -> 0x0098 }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0090
            int r1 = com.yandex.mobile.ads.impl.ih1.f34858a     // Catch:{ all -> 0x0098 }
            r4 = 24
            r5 = 12373(0x3055, float:1.7338E-41)
            if (r1 >= r4) goto L_0x0012
            goto L_0x0068
        L_0x0012:
            com.yandex.mobile.ads.impl.x11 r4 = com.yandex.mobile.ads.impl.x11.f42358a     // Catch:{ all -> 0x0098 }
            com.yandex.mobile.ads.impl.rk0 r4 = r4.mo70789b()     // Catch:{ all -> 0x0098 }
            r6 = 26
            if (r1 >= r6) goto L_0x0045
            com.yandex.mobile.ads.impl.sk0 r4 = (com.yandex.mobile.ads.impl.sk0) r4     // Catch:{ all -> 0x0098 }
            java.lang.String r4 = r4.mo70006b()     // Catch:{ all -> 0x0098 }
            java.lang.String r7 = com.yandex.mobile.ads.impl.ih1.f34860c     // Catch:{ all -> 0x0098 }
            boolean r4 = r4.equals(r7)     // Catch:{ all -> 0x0098 }
            if (r4 != 0) goto L_0x0068
            java.lang.String r4 = "WFQxNjUw"
            byte[] r4 = android.util.Base64.decode(r4, r3)     // Catch:{ all -> 0x0098 }
            java.lang.String r7 = "decode(\"WFQxNjUw\", Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r7)     // Catch:{ all -> 0x0098 }
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x0098 }
            java.nio.charset.Charset r8 = kotlin.text.Charsets.UTF_8     // Catch:{ all -> 0x0098 }
            r7.<init>(r4, r8)     // Catch:{ all -> 0x0098 }
            java.lang.String r4 = com.yandex.mobile.ads.impl.ih1.f34861d     // Catch:{ all -> 0x0098 }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x0098 }
            if (r4 == 0) goto L_0x0045
            goto L_0x0068
        L_0x0045:
            if (r1 >= r6) goto L_0x0054
            android.content.pm.PackageManager r9 = r9.getPackageManager()     // Catch:{ all -> 0x0098 }
            java.lang.String r4 = "android.hardware.vr.high_performance"
            boolean r9 = r9.hasSystemFeature(r4)     // Catch:{ all -> 0x0098 }
            if (r9 != 0) goto L_0x0054
            goto L_0x0068
        L_0x0054:
            android.opengl.EGLDisplay r9 = android.opengl.EGL14.eglGetDisplay(r3)     // Catch:{ all -> 0x0098 }
            java.lang.String r9 = android.opengl.EGL14.eglQueryString(r9, r5)     // Catch:{ all -> 0x0098 }
            if (r9 == 0) goto L_0x0068
            java.lang.String r4 = "EGL_EXT_protected_content"
            boolean r9 = r9.contains(r4)     // Catch:{ all -> 0x0098 }
            if (r9 == 0) goto L_0x0068
            r9 = 1
            goto L_0x0069
        L_0x0068:
            r9 = 0
        L_0x0069:
            if (r9 == 0) goto L_0x008b
            r9 = 17
            if (r1 >= r9) goto L_0x0070
            goto L_0x0084
        L_0x0070:
            android.opengl.EGLDisplay r9 = android.opengl.EGL14.eglGetDisplay(r3)     // Catch:{ all -> 0x0098 }
            java.lang.String r9 = android.opengl.EGL14.eglQueryString(r9, r5)     // Catch:{ all -> 0x0098 }
            if (r9 == 0) goto L_0x0084
            java.lang.String r1 = "EGL_KHR_surfaceless_context"
            boolean r9 = r9.contains(r1)     // Catch:{ all -> 0x0098 }
            if (r9 == 0) goto L_0x0084
            r9 = 1
            goto L_0x0085
        L_0x0084:
            r9 = 0
        L_0x0085:
            if (r9 == 0) goto L_0x0089
            r9 = 1
            goto L_0x008c
        L_0x0089:
            r9 = 2
            goto L_0x008c
        L_0x008b:
            r9 = 0
        L_0x008c:
            f30316d = r9     // Catch:{ all -> 0x0098 }
            f30317e = r2     // Catch:{ all -> 0x0098 }
        L_0x0090:
            int r9 = f30316d     // Catch:{ all -> 0x0098 }
            if (r9 == 0) goto L_0x0095
            goto L_0x0096
        L_0x0095:
            r2 = 0
        L_0x0096:
            monitor-exit(r0)
            return r2
        L_0x0098:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.video.DummySurface.m32493a(android.content.Context):boolean");
    }

    public void release() {
        super.release();
        synchronized (this.f30318b) {
            if (!this.f30319c) {
                this.f30318b.mo65423a();
                this.f30319c = true;
            }
        }
    }

    private DummySurface(C12338b bVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f30318b = bVar;
    }

    /* renamed from: com.yandex.mobile.ads.exo.video.DummySurface$b */
    private static class C12338b extends HandlerThread implements Handler.Callback {

        /* renamed from: b */
        private t20 f30320b;

        /* renamed from: c */
        private Handler f30321c;

        /* renamed from: d */
        private Error f30322d;

        /* renamed from: e */
        private RuntimeException f30323e;

        /* renamed from: f */
        private DummySurface f30324f;

        public C12338b() {
            super("dummySurface");
        }

        /* renamed from: b */
        private void m32494b(int i) {
            this.f30320b.getClass();
            this.f30320b.mo70115a(i);
            this.f30324f = new DummySurface(this, this.f30320b.mo70114a(), i != 0);
        }

        /* renamed from: a */
        public DummySurface mo65422a(int i) {
            boolean z;
            start();
            Handler handler = new Handler(getLooper(), this);
            this.f30321c = handler;
            this.f30320b = new t20(handler, (t20.C14649c) null);
            synchronized (this) {
                z = false;
                this.f30321c.obtainMessage(1, i, 0).sendToTarget();
                while (this.f30324f == null && this.f30323e == null && this.f30322d == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f30323e;
            if (runtimeException == null) {
                Error error = this.f30322d;
                if (error == null) {
                    DummySurface dummySurface = this.f30324f;
                    dummySurface.getClass();
                    return dummySurface;
                }
                throw error;
            }
            throw runtimeException;
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                try {
                    m32494b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e) {
                    bk0.m34269a("DummySurface", "Failed to initialize dummy surface", e);
                    this.f30323e = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    try {
                        bk0.m34269a("DummySurface", "Failed to initialize dummy surface", e2);
                        this.f30322d = e2;
                        synchronized (this) {
                            notify();
                        }
                    } catch (Throwable th) {
                        synchronized (this) {
                            notify();
                            throw th;
                        }
                    }
                }
                return true;
            } else if (i != 2) {
                return true;
            } else {
                try {
                    this.f30320b.getClass();
                    this.f30320b.mo70116b();
                } catch (Throwable th2) {
                    quit();
                    throw th2;
                }
                quit();
                return true;
            }
        }

        /* renamed from: a */
        public void mo65423a() {
            this.f30321c.getClass();
            this.f30321c.sendEmptyMessage(2);
        }
    }

    /* renamed from: a */
    public static DummySurface m32492a(Context context, boolean z) {
        if (ih1.f34858a >= 17) {
            int i = 0;
            C13479j9.m37708b(!z || m32493a(context));
            C12338b bVar = new C12338b();
            if (z) {
                i = f30316d;
            }
            return bVar.mo65422a(i);
        }
        throw new UnsupportedOperationException("Unsupported prior to API level 17");
    }
}
