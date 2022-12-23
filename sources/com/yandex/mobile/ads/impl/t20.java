package com.yandex.mobile.ads.impl;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import android.util.Log;
import java.util.Locale;

public final class t20 implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: h */
    private static final int[] f40213h = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: b */
    private final Handler f40214b;

    /* renamed from: c */
    private final int[] f40215c = new int[1];

    /* renamed from: d */
    private EGLDisplay f40216d;

    /* renamed from: e */
    private EGLContext f40217e;

    /* renamed from: f */
    private EGLSurface f40218f;

    /* renamed from: g */
    private SurfaceTexture f40219g;

    /* renamed from: com.yandex.mobile.ads.impl.t20$b */
    public static final class C14648b extends RuntimeException {
        private C14648b(String str) {
            super(str);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.t20$c */
    public interface C14649c {
    }

    public t20(Handler handler, C14649c cVar) {
        this.f40214b = handler;
    }

    /* renamed from: a */
    public SurfaceTexture mo70114a() {
        SurfaceTexture surfaceTexture = this.f40219g;
        surfaceTexture.getClass();
        return surfaceTexture;
    }

    /* renamed from: b */
    public void mo70116b() {
        this.f40214b.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f40219g;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f40215c, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f40216d;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f40216d;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f40218f;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f40216d, this.f40218f);
            }
            EGLContext eGLContext = this.f40217e;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f40216d, eGLContext);
            }
            if (ih1.f34858a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f40216d;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f40216d);
            }
            this.f40216d = null;
            this.f40217e = null;
            this.f40218f = null;
            this.f40219g = null;
        }
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f40214b.post(this);
    }

    public void run() {
        SurfaceTexture surfaceTexture = this.f40219g;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo70115a(int i) {
        int[] iArr;
        EGLSurface eGLSurface;
        int[] iArr2;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr3 = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr3, 0, iArr3, 1)) {
                this.f40216d = eglGetDisplay;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr4 = new int[1];
                boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, f40213h, 0, eGLConfigArr, 0, 1, iArr4, 0);
                if (!eglChooseConfig || iArr4[0] <= 0 || eGLConfigArr[0] == null) {
                    Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr4[0]), eGLConfigArr[0]};
                    int i2 = ih1.f34858a;
                    throw new C14648b(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr));
                }
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLDisplay eGLDisplay = this.f40216d;
                if (i == 0) {
                    iArr = new int[]{12440, 2, 12344};
                } else {
                    iArr = new int[]{12440, 2, 12992, 1, 12344};
                }
                EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
                if (eglCreateContext != null) {
                    this.f40217e = eglCreateContext;
                    EGLDisplay eGLDisplay2 = this.f40216d;
                    if (i == 1) {
                        eGLSurface = EGL14.EGL_NO_SURFACE;
                    } else {
                        if (i == 2) {
                            iArr2 = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
                        } else {
                            iArr2 = new int[]{12375, 1, 12374, 1, 12344};
                        }
                        eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig, iArr2, 0);
                        if (eGLSurface == null) {
                            throw new C14648b("eglCreatePbufferSurface failed");
                        }
                    }
                    if (EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, eglCreateContext)) {
                        this.f40218f = eGLSurface;
                        GLES20.glGenTextures(1, this.f40215c, 0);
                        while (true) {
                            int glGetError = GLES20.glGetError();
                            if (glGetError != 0) {
                                Log.e("GlUtil", "glError " + GLU.gluErrorString(glGetError));
                            } else {
                                SurfaceTexture surfaceTexture = new SurfaceTexture(this.f40215c[0]);
                                this.f40219g = surfaceTexture;
                                surfaceTexture.setOnFrameAvailableListener(this);
                                return;
                            }
                        }
                    } else {
                        throw new C14648b("eglMakeCurrent failed");
                    }
                } else {
                    throw new C14648b("eglCreateContext failed");
                }
            } else {
                throw new C14648b("eglInitialize failed");
            }
        } else {
            throw new C14648b("eglGetDisplay failed");
        }
    }
}
