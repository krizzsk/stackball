package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBinder;
import com.yandex.mobile.ads.instream.player.content.VideoPlayer;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class vg0 {

    /* renamed from: c */
    public static final C14891a f41288c = new C14891a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static volatile vg0 f41289d;

    /* renamed from: a */
    private final Object f41290a;

    /* renamed from: b */
    private final WeakHashMap<VideoPlayer, InstreamAdBinder> f41291b;

    /* renamed from: com.yandex.mobile.ads.impl.vg0$a */
    public static final class C14891a {
        private C14891a() {
        }

        public /* synthetic */ C14891a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final vg0 mo70489a() {
            vg0 a = vg0.f41289d;
            if (a == null) {
                synchronized (this) {
                    a = vg0.f41289d;
                    if (a == null) {
                        a = new vg0((DefaultConstructorMarker) null);
                        vg0.f41289d = a;
                    }
                }
            }
            return a;
        }
    }

    private vg0() {
        this.f41290a = new Object();
        this.f41291b = new WeakHashMap<>();
    }

    public /* synthetic */ vg0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: b */
    public final void mo70488b(VideoPlayer videoPlayer) {
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        synchronized (this.f41290a) {
            InstreamAdBinder remove = this.f41291b.remove(videoPlayer);
        }
    }

    /* renamed from: a */
    public final InstreamAdBinder mo70486a(VideoPlayer videoPlayer) {
        InstreamAdBinder instreamAdBinder;
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        synchronized (this.f41290a) {
            instreamAdBinder = this.f41291b.get(videoPlayer);
        }
        return instreamAdBinder;
    }

    /* renamed from: a */
    public final void mo70487a(VideoPlayer videoPlayer, InstreamAdBinder instreamAdBinder) {
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        Intrinsics.checkNotNullParameter(instreamAdBinder, "adBinder");
        synchronized (this.f41290a) {
            this.f41291b.put(videoPlayer, instreamAdBinder);
            Unit unit = Unit.INSTANCE;
        }
    }
}
