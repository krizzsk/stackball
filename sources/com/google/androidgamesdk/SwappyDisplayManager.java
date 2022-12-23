package com.google.androidgamesdk;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SwappyDisplayManager implements DisplayManager.DisplayListener {
    private final boolean DEBUG = false;
    private final String LOG_TAG = "SwappyDisplayManager";
    private final long ONE_MS_IN_NS = 1000000;
    private final long ONE_S_IN_NS = 1000000000;
    /* access modifiers changed from: private */
    public Activity mActivity;
    private long mCookie;
    private Display.Mode mCurrentMode;
    private C3915a mLooper;
    private WindowManager mWindowManager;

    /* renamed from: com.google.androidgamesdk.SwappyDisplayManager$a */
    private class C3915a extends Thread {

        /* renamed from: a */
        public Handler f10095a;

        /* renamed from: c */
        private Lock f10097c;

        /* renamed from: d */
        private Condition f10098d;

        private C3915a() {
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f10097c = reentrantLock;
            this.f10098d = reentrantLock.newCondition();
        }

        /* synthetic */ C3915a(SwappyDisplayManager swappyDisplayManager, byte b) {
            this();
        }

        public final void run() {
            Log.i("SwappyDisplayManager", "Starting looper thread");
            this.f10097c.lock();
            Looper.prepare();
            this.f10095a = new Handler();
            this.f10098d.signal();
            this.f10097c.unlock();
            Looper.loop();
            Log.i("SwappyDisplayManager", "Terminating looper thread");
        }

        public final void start() {
            this.f10097c.lock();
            super.start();
            try {
                this.f10098d.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.f10097c.unlock();
        }
    }

    public SwappyDisplayManager(long j, Activity activity) {
        String string;
        try {
            ActivityInfo activityInfo = activity.getPackageManager().getActivityInfo(activity.getIntent().getComponent(), 128);
            if (!(activityInfo.metaData == null || (string = activityInfo.metaData.getString("android.app.lib_name")) == null)) {
                System.loadLibrary(string);
            }
        } catch (Throwable th) {
            Log.e("SwappyDisplayManager", th.getMessage());
        }
        this.mCookie = j;
        this.mActivity = activity;
        WindowManager windowManager = (WindowManager) activity.getSystemService(WindowManager.class);
        this.mWindowManager = windowManager;
        Display defaultDisplay = windowManager.getDefaultDisplay();
        this.mCurrentMode = defaultDisplay.getMode();
        updateSupportedRefreshRates(defaultDisplay);
        DisplayManager displayManager = (DisplayManager) this.mActivity.getSystemService(DisplayManager.class);
        synchronized (this) {
            C3915a aVar = new C3915a(this, (byte) 0);
            this.mLooper = aVar;
            aVar.start();
            displayManager.registerDisplayListener(this, this.mLooper.f10095a);
        }
    }

    private boolean callNativeCallback() {
        if (Build.VERSION.SDK_INT >= 29) {
            return Build.VERSION.SDK_INT == 29 && Build.VERSION.PREVIEW_SDK_INT == 0;
        }
        return true;
    }

    private boolean modeMatchesCurrentResolution(Display.Mode mode) {
        return mode.getPhysicalHeight() == this.mCurrentMode.getPhysicalHeight() && mode.getPhysicalWidth() == this.mCurrentMode.getPhysicalWidth();
    }

    private native void nOnRefreshRateChanged(long j, long j2, long j3, long j4);

    private native void nSetSupportedRefreshRates(long j, long[] jArr, int[] iArr);

    private void updateSupportedRefreshRates(Display display) {
        Display.Mode[] supportedModes = display.getSupportedModes();
        int i = 0;
        for (Display.Mode modeMatchesCurrentResolution : supportedModes) {
            if (modeMatchesCurrentResolution(modeMatchesCurrentResolution)) {
                i++;
            }
        }
        long[] jArr = new long[i];
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < supportedModes.length; i3++) {
            if (modeMatchesCurrentResolution(supportedModes[i3])) {
                jArr[i2] = (long) (1.0E9f / supportedModes[i3].getRefreshRate());
                iArr[i2] = supportedModes[i3].getModeId();
                i2++;
            }
        }
        nSetSupportedRefreshRates(this.mCookie, jArr, iArr);
    }

    public void onDisplayAdded(int i) {
    }

    public void onDisplayChanged(int i) {
        synchronized (this) {
            Display defaultDisplay = this.mWindowManager.getDefaultDisplay();
            float refreshRate = defaultDisplay.getRefreshRate();
            Display.Mode mode = defaultDisplay.getMode();
            boolean z = true;
            boolean z2 = (mode.getPhysicalWidth() != this.mCurrentMode.getPhysicalWidth()) | (mode.getPhysicalHeight() != this.mCurrentMode.getPhysicalHeight());
            if (refreshRate == this.mCurrentMode.getRefreshRate()) {
                z = false;
            }
            this.mCurrentMode = mode;
            if (z2) {
                updateSupportedRefreshRates(defaultDisplay);
            }
            if (callNativeCallback() && z) {
                long j = (long) (1.0E9f / refreshRate);
                nOnRefreshRateChanged(this.mCookie, j, defaultDisplay.getAppVsyncOffsetNanos(), j - (this.mWindowManager.getDefaultDisplay().getPresentationDeadlineNanos() - 1000000));
            }
        }
    }

    public void onDisplayRemoved(int i) {
    }

    public void setPreferredRefreshRate(final int i) {
        this.mActivity.runOnUiThread(new Runnable() {
            public final void run() {
                Window window = SwappyDisplayManager.this.mActivity.getWindow();
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.preferredDisplayModeId = i;
                window.setAttributes(attributes);
            }
        });
    }

    public void terminate() {
        this.mLooper.f10095a.getLooper().quit();
    }
}
