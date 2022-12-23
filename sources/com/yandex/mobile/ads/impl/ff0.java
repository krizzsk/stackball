package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.p267ad.InstreamAdPlayer;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ff0 {

    /* renamed from: c */
    public static final C13049a f33351c = new C13049a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static volatile ff0 f33352d;

    /* renamed from: a */
    private final Object f33353a;

    /* renamed from: b */
    private final WeakHashMap<InstreamAdPlayer, ng1> f33354b;

    /* renamed from: com.yandex.mobile.ads.impl.ff0$a */
    public static final class C13049a {
        private C13049a() {
        }

        public /* synthetic */ C13049a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ff0 mo67003a() {
            ff0 a = ff0.f33352d;
            if (a == null) {
                synchronized (this) {
                    a = ff0.f33352d;
                    if (a == null) {
                        a = new ff0((DefaultConstructorMarker) null);
                        ff0.f33352d = a;
                    }
                }
            }
            return a;
        }
    }

    private ff0() {
        this.f33353a = new Object();
        this.f33354b = new WeakHashMap<>();
    }

    public /* synthetic */ ff0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: b */
    public final void mo67002b(InstreamAdPlayer instreamAdPlayer) {
        Intrinsics.checkNotNullParameter(instreamAdPlayer, "instreamAdPlayer");
        synchronized (this.f33353a) {
            ng1 remove = this.f33354b.remove(instreamAdPlayer);
        }
    }

    /* renamed from: a */
    public final ng1 mo67000a(InstreamAdPlayer instreamAdPlayer) {
        ng1 ng1;
        Intrinsics.checkNotNullParameter(instreamAdPlayer, "instreamAdPlayer");
        synchronized (this.f33353a) {
            ng1 = this.f33354b.get(instreamAdPlayer);
        }
        return ng1;
    }

    /* renamed from: a */
    public final void mo67001a(InstreamAdPlayer instreamAdPlayer, ng1 ng1) {
        Intrinsics.checkNotNullParameter(instreamAdPlayer, "instreamAdPlayer");
        Intrinsics.checkNotNullParameter(ng1, "adBinder");
        synchronized (this.f33353a) {
            this.f33354b.put(instreamAdPlayer, ng1);
            Unit unit = Unit.INSTANCE;
        }
    }
}
