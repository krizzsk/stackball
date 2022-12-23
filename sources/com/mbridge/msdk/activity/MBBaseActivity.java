package com.mbridge.msdk.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.OrientationEventListener;
import android.view.WindowInsets;
import android.view.WindowManager;
import androidx.core.view.InputDeviceCompat;
import com.mbridge.msdk.foundation.tools.C6361q;

public abstract class MBBaseActivity extends Activity {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public OrientationEventListener f14872a;

    /* renamed from: b */
    private Display f14873b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f14874c = -1;

    public abstract void setTopControllerPadding(int i, int i2, int i3, int i4, int i5);

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            getWindow().addFlags(512);
            m14995a();
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                getWindow().setAttributes(attributes);
            }
        } catch (Exception e) {
            C6361q.m16158d("MBBaseActivity", e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        getNotchParams();
        m14995a();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m14995a();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        OrientationEventListener orientationEventListener = this.f14872a;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
            this.f14872a = null;
        }
    }

    public void getNotchParams() {
        getWindow().getDecorView().postDelayed(new Runnable() {
            public final void run() {
                int i;
                int i2;
                int i3;
                int i4;
                DisplayCutout displayCutout;
                try {
                    if (Build.VERSION.SDK_INT >= 23) {
                        WindowInsets rootWindowInsets = MBBaseActivity.this.getWindow().getDecorView().getRootWindowInsets();
                        int i5 = 0;
                        if (rootWindowInsets == null || Build.VERSION.SDK_INT < 28 || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
                            i5 = -1;
                            i4 = 0;
                            i3 = 0;
                            i2 = 0;
                            i = 0;
                        } else {
                            i4 = displayCutout.getSafeInsetLeft();
                            i3 = displayCutout.getSafeInsetRight();
                            i2 = displayCutout.getSafeInsetTop();
                            int safeInsetBottom = displayCutout.getSafeInsetBottom();
                            C6361q.m16158d("MBBaseActivity", "NOTCH Left:" + i4 + " Right:" + i3 + " Top:" + i2 + " Bottom:" + safeInsetBottom);
                            int a = MBBaseActivity.m14993a(MBBaseActivity.this);
                            if (MBBaseActivity.this.f14874c == -1) {
                                int unused = MBBaseActivity.this.f14874c = a == 0 ? 3 : a == 1 ? 1 : a == 2 ? 4 : a == 3 ? 2 : -1;
                                C6361q.m16158d("MBBaseActivity", MBBaseActivity.this.f14874c + "");
                            }
                            if (a == 0) {
                                i = safeInsetBottom;
                            } else if (a == 1) {
                                i = safeInsetBottom;
                                i5 = 90;
                            } else if (a == 2) {
                                i = safeInsetBottom;
                                i5 = 180;
                            } else if (a != 3) {
                                i = safeInsetBottom;
                                i5 = -1;
                            } else {
                                i = safeInsetBottom;
                                i5 = 270;
                            }
                        }
                        MBBaseActivity.this.setTopControllerPadding(i5, i4, i3, i2, i);
                        if (MBBaseActivity.this.f14872a == null) {
                            MBBaseActivity.m14998d(MBBaseActivity.this);
                        }
                    }
                } catch (Exception e) {
                    C6361q.m16158d("MBBaseActivity", e.getMessage());
                }
            }
        }, 500);
    }

    /* renamed from: a */
    private void m14995a() {
        try {
            if (Build.VERSION.SDK_INT >= 19) {
                getWindow().addFlags(67108864);
                getWindow().getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
                return;
            }
            getWindow().getDecorView().setSystemUiVisibility(2);
        } catch (Throwable th) {
            C6361q.m16158d("MBBaseActivity", th.getMessage());
        }
    }

    /* renamed from: a */
    static /* synthetic */ int m14993a(MBBaseActivity mBBaseActivity) {
        if (mBBaseActivity.f14873b == null) {
            mBBaseActivity.f14873b = ((WindowManager) mBBaseActivity.getSystemService("window")).getDefaultDisplay();
        }
        Display display = mBBaseActivity.f14873b;
        if (display != null) {
            return display.getRotation();
        }
        return -1;
    }

    /* renamed from: d */
    static /* synthetic */ void m14998d(MBBaseActivity mBBaseActivity) {
        C60712 r0 = new OrientationEventListener(mBBaseActivity, 1) {
            public final void onOrientationChanged(int i) {
                if (MBBaseActivity.m14993a(MBBaseActivity.this) == 1 && MBBaseActivity.this.f14874c != 1) {
                    int unused = MBBaseActivity.this.f14874c = 1;
                    MBBaseActivity.this.getNotchParams();
                    C6361q.m16158d("MBBaseActivity", "Orientation Left");
                } else if (MBBaseActivity.m14993a(MBBaseActivity.this) == 3 && MBBaseActivity.this.f14874c != 2) {
                    int unused2 = MBBaseActivity.this.f14874c = 2;
                    MBBaseActivity.this.getNotchParams();
                    C6361q.m16158d("MBBaseActivity", "Orientation Right");
                } else if (MBBaseActivity.m14993a(MBBaseActivity.this) == 0 && MBBaseActivity.this.f14874c != 3) {
                    int unused3 = MBBaseActivity.this.f14874c = 3;
                    MBBaseActivity.this.getNotchParams();
                    C6361q.m16158d("MBBaseActivity", "Orientation Top");
                } else if (MBBaseActivity.m14993a(MBBaseActivity.this) == 2 && MBBaseActivity.this.f14874c != 4) {
                    int unused4 = MBBaseActivity.this.f14874c = 4;
                    MBBaseActivity.this.getNotchParams();
                    C6361q.m16158d("MBBaseActivity", "Orientation Bottom");
                }
            }
        };
        mBBaseActivity.f14872a = r0;
        if (r0.canDetectOrientation()) {
            mBBaseActivity.f14872a.enable();
            return;
        }
        mBBaseActivity.f14872a.disable();
        mBBaseActivity.f14872a = null;
    }
}
