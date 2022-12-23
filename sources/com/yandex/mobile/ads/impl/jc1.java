package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class jc1 implements l90 {

    /* renamed from: a */
    private final Handler f35223a;

    public jc1(Handler handler) {
        this.f35223a = handler;
    }

    /* renamed from: a */
    public Looper mo67966a() {
        return this.f35223a.getLooper();
    }

    /* renamed from: b */
    public boolean mo67972b(int i) {
        return this.f35223a.sendEmptyMessage(i);
    }

    /* renamed from: a */
    public Message mo67969a(int i, Object obj) {
        return this.f35223a.obtainMessage(i, obj);
    }

    /* renamed from: a */
    public Message mo67967a(int i, int i2, int i3) {
        return this.f35223a.obtainMessage(i, i2, i3);
    }

    /* renamed from: a */
    public Message mo67968a(int i, int i2, int i3, Object obj) {
        return this.f35223a.obtainMessage(i, i2, i3, obj);
    }

    /* renamed from: a */
    public boolean mo67971a(int i, long j) {
        return this.f35223a.sendEmptyMessageAtTime(i, j);
    }

    /* renamed from: a */
    public void mo67970a(int i) {
        this.f35223a.removeMessages(i);
    }
}
