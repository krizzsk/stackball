package com.google.androidgamesdk;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Choreographer;

public class ChoreographerCallback implements Choreographer.FrameCallback {
    private static final String LOG_TAG = "ChoreographerCallback";
    private long mCookie;
    private C3913a mLooper;

    /* renamed from: com.google.androidgamesdk.ChoreographerCallback$a */
    private class C3913a extends Thread {

        /* renamed from: a */
        public Handler f10091a;

        private C3913a() {
        }

        /* synthetic */ C3913a(ChoreographerCallback choreographerCallback, byte b) {
            this();
        }

        public final void run() {
            Log.i(ChoreographerCallback.LOG_TAG, "Starting looper thread");
            Looper.prepare();
            this.f10091a = new Handler();
            Looper.loop();
            Log.i(ChoreographerCallback.LOG_TAG, "Terminating looper thread");
        }
    }

    public ChoreographerCallback(long j) {
        this.mCookie = j;
        C3913a aVar = new C3913a(this, (byte) 0);
        this.mLooper = aVar;
        aVar.start();
    }

    public void doFrame(long j) {
        nOnChoreographer(this.mCookie, j);
    }

    public native void nOnChoreographer(long j, long j2);

    public void postFrameCallback() {
        this.mLooper.f10091a.post(new Runnable() {
            public final void run() {
                Choreographer.getInstance().postFrameCallback(ChoreographerCallback.this);
            }
        });
    }

    public void postFrameCallbackDelayed(long j) {
        Choreographer.getInstance().postFrameCallbackDelayed(this, j);
    }

    public void terminate() {
        this.mLooper.f10091a.getLooper().quit();
    }
}
