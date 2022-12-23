package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class sw0 {

    /* renamed from: g */
    public static final C14638a f40159g = new C14638a((DefaultConstructorMarker) null);

    /* renamed from: h */
    private static final long f40160h = TimeUnit.SECONDS.toMillis(1);
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static volatile sw0 f40161i;

    /* renamed from: a */
    private final Object f40162a;

    /* renamed from: b */
    private final Handler f40163b;

    /* renamed from: c */
    private final rw0 f40164c;

    /* renamed from: d */
    private final ow0 f40165d;

    /* renamed from: e */
    private boolean f40166e;

    /* renamed from: f */
    private boolean f40167f;

    /* renamed from: com.yandex.mobile.ads.impl.sw0$a */
    public static final class C14638a {
        private C14638a() {
        }

        public /* synthetic */ C14638a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final sw0 mo70068a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            sw0 a = sw0.f40161i;
            if (a == null) {
                synchronized (this) {
                    a = sw0.f40161i;
                    if (a == null) {
                        a = new sw0(context, (DefaultConstructorMarker) null);
                        C14638a aVar = sw0.f40159g;
                        sw0.f40161i = a;
                    }
                }
            }
            return a;
        }
    }

    private sw0(Context context) {
        this.f40162a = new Object();
        this.f40163b = new Handler(Looper.getMainLooper());
        this.f40164c = new rw0(context);
        this.f40165d = new ow0();
    }

    public /* synthetic */ sw0(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    /* renamed from: c */
    private final void m42181c() {
        this.f40163b.postDelayed(new Runnable() {
            public final void run() {
                sw0.m42182c(sw0.this);
            }
        }, f40160h);
    }

    /* renamed from: b */
    public final void mo70067b(nw0 nw0) {
        Intrinsics.checkNotNullParameter(nw0, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        synchronized (this.f40162a) {
            if (!this.f40167f) {
                this.f40165d.mo69277a(nw0);
                if (!this.f40166e) {
                    this.f40166e = true;
                    m42181c();
                    this.f40164c.mo69831a((nw0) new tw0(this));
                }
            } else {
                nw0.mo69083a();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public final void mo70066a(nw0 nw0) {
        Intrinsics.checkNotNullParameter(nw0, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        synchronized (this.f40162a) {
            this.f40165d.mo69280b(nw0);
            if (!this.f40165d.mo69278a()) {
                this.f40164c.mo69830a();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final void m42182c(sw0 sw0) {
        Intrinsics.checkNotNullParameter(sw0, "this$0");
        sw0.f40164c.mo69830a();
        sw0.m42179b();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m42179b() {
        synchronized (this.f40162a) {
            this.f40167f = true;
            this.f40163b.removeCallbacksAndMessages((Object) null);
            this.f40166e = false;
            this.f40165d.mo69279b();
            Unit unit = Unit.INSTANCE;
        }
    }
}
