package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;

public final class n41 extends o41 {

    /* renamed from: b */
    final /* synthetic */ int f37640b;

    /* renamed from: c */
    final /* synthetic */ byte[] f37641c;

    /* renamed from: d */
    final /* synthetic */ int f37642d;

    n41(int i, byte[] bArr, int i2) {
        this.f37640b = i;
        this.f37641c = bArr;
        this.f37642d = i2;
    }

    /* renamed from: a */
    public long mo68888a() {
        return (long) this.f37640b;
    }

    /* renamed from: b */
    public void mo68890b() {
    }

    /* renamed from: a */
    public void mo68889a(BufferedSink bufferedSink) {
        Intrinsics.checkNotNullParameter(bufferedSink, "sink");
        bufferedSink.write(this.f37641c, this.f37642d, this.f37640b);
    }
}
