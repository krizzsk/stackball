package com.unity3d.player;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.Camera;

public class Camera2Wrapper implements C9577c {

    /* renamed from: a */
    private Context f23657a;

    /* renamed from: b */
    private C9570b f23658b = null;

    /* renamed from: c */
    private final int f23659c = 100;

    public Camera2Wrapper(Context context) {
        this.f23657a = context;
        initCamera2Jni();
    }

    /* renamed from: a */
    private static int m25571a(float f) {
        return (int) Math.min(Math.max((f * 2000.0f) - 0.0040893555f, -900.0f), 900.0f);
    }

    private final native void deinitCamera2Jni();

    private final native void initCamera2Jni();

    private final native void nativeFrameReady(Object obj, Object obj2, Object obj3, int i, int i2, int i3);

    private final native void nativeSurfaceTextureReady(Object obj);

    /* renamed from: a */
    public final void mo58571a() {
        deinitCamera2Jni();
        closeCamera2();
    }

    /* renamed from: a */
    public final void mo58572a(Object obj) {
        nativeSurfaceTextureReady(obj);
    }

    /* renamed from: a */
    public final void mo58573a(Object obj, Object obj2, Object obj3, int i, int i2, int i3) {
        nativeFrameReady(obj, obj2, obj3, i, i2, i3);
    }

    /* access modifiers changed from: protected */
    public void closeCamera2() {
        C9570b bVar = this.f23658b;
        if (bVar != null) {
            bVar.mo58736b();
        }
        this.f23658b = null;
    }

    /* access modifiers changed from: protected */
    public int getCamera2Count() {
        if (PlatformSupport.LOLLIPOP_SUPPORT) {
            return C9570b.m25617a(this.f23657a);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public int getCamera2FocalLengthEquivalent(int i) {
        if (PlatformSupport.LOLLIPOP_SUPPORT) {
            return C9570b.m25638d(this.f23657a, i);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public int[] getCamera2Resolutions(int i) {
        if (PlatformSupport.LOLLIPOP_SUPPORT) {
            return C9570b.m25641e(this.f23657a, i);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public int getCamera2SensorOrientation(int i) {
        if (PlatformSupport.LOLLIPOP_SUPPORT) {
            return C9570b.m25618a(this.f23657a, i);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public Object getCameraFocusArea(float f, float f2) {
        int a = m25571a(f);
        int a2 = m25571a(1.0f - f2);
        return new Camera.Area(new Rect(a - 100, a2 - 100, a + 100, a2 + 100), 1000);
    }

    /* access modifiers changed from: protected */
    public Rect getFrameSizeCamera2() {
        C9570b bVar = this.f23658b;
        return bVar != null ? bVar.mo58733a() : new Rect();
    }

    /* access modifiers changed from: protected */
    public boolean initializeCamera2(int i, int i2, int i3, int i4, int i5) {
        if (!PlatformSupport.LOLLIPOP_SUPPORT || this.f23658b != null || UnityPlayer.currentActivity == null) {
            return false;
        }
        C9570b bVar = new C9570b(this);
        this.f23658b = bVar;
        return bVar.mo58735a(this.f23657a, i, i2, i3, i4, i5);
    }

    /* access modifiers changed from: protected */
    public boolean isCamera2AutoFocusPointSupported(int i) {
        if (PlatformSupport.LOLLIPOP_SUPPORT) {
            return C9570b.m25636c(this.f23657a, i);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean isCamera2FrontFacing(int i) {
        if (PlatformSupport.LOLLIPOP_SUPPORT) {
            return C9570b.m25634b(this.f23657a, i);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void pauseCamera2() {
        C9570b bVar = this.f23658b;
        if (bVar != null) {
            bVar.mo58738d();
        }
    }

    /* access modifiers changed from: protected */
    public boolean setAutoFocusPoint(float f, float f2) {
        C9570b bVar;
        if (!PlatformSupport.LOLLIPOP_SUPPORT || (bVar = this.f23658b) == null) {
            return false;
        }
        return bVar.mo58734a(f, f2);
    }

    /* access modifiers changed from: protected */
    public void startCamera2() {
        C9570b bVar = this.f23658b;
        if (bVar != null) {
            bVar.mo58737c();
        }
    }

    /* access modifiers changed from: protected */
    public void stopCamera2() {
        C9570b bVar = this.f23658b;
        if (bVar != null) {
            bVar.mo58739e();
        }
    }
}
