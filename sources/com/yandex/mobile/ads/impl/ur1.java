package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.common.BidderTokenLoadListener;
import com.yandex.mobile.ads.core.initializer.C12158e;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class ur1 {

    /* renamed from: e */
    private static final Object f40864e = new Object();

    /* renamed from: f */
    private static volatile ur1 f40865f;

    /* renamed from: a */
    private final Executor f40866a = Executors.newCachedThreadPool();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final sr1 f40867b = new sr1();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Handler f40868c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private final C15230y2 f40869d = new C15230y2();

    private ur1() {
    }

    /* renamed from: a */
    public static ur1 m42818a() {
        if (f40865f == null) {
            synchronized (f40864e) {
                if (f40865f == null) {
                    f40865f = new ur1();
                }
            }
        }
        return f40865f;
    }

    /* renamed from: b */
    public void mo70396b(Context context, BidderTokenLoadListener bidderTokenLoadListener) {
        this.f40866a.execute(new Runnable(context, bidderTokenLoadListener) {
            public final /* synthetic */ Context f$1;
            public final /* synthetic */ BidderTokenLoadListener f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                ur1.this.m42819a(this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m42819a(Context context, BidderTokenLoadListener bidderTokenLoadListener) {
        new C12158e(context, this.f40866a, this.f40869d).mo64752a((le0) null, (C12158e.C12160b) new tr1(this, context, bidderTokenLoadListener));
    }
}
