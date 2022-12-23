package com.amazon.device.ads;

import android.util.Log;

/* compiled from: Logger */
class LogcatLogger implements Logger {
    private String logTag;

    LogcatLogger() {
    }

    public LogcatLogger withLogTag(String str) {
        this.logTag = str;
        return this;
    }

    /* renamed from: i */
    public void mo10940i(String str) {
        Log.i(this.logTag, str);
    }

    /* renamed from: v */
    public void mo10941v(String str) {
        Log.v(this.logTag, str);
    }

    /* renamed from: d */
    public void mo10938d(String str) {
        Log.d(this.logTag, str);
    }

    /* renamed from: w */
    public void mo10942w(String str) {
        Log.w(this.logTag, str);
    }

    /* renamed from: e */
    public void mo10939e(String str) {
        Log.e(this.logTag, str);
    }
}
