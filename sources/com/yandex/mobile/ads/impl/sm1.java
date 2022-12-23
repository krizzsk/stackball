package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.content.VideoPlayerListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class sm1 implements VideoPlayerListener {

    /* renamed from: a */
    private final Object f40066a = new Object();

    /* renamed from: b */
    private final fk0 f40067b = new fk0();

    /* renamed from: c */
    private final Set<VideoPlayerListener> f40068c = new HashSet();

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m42076c(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((VideoPlayerListener) it.next()).onVideoPaused();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m42077d(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((VideoPlayerListener) it.next()).onVideoPrepared();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m42078e(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((VideoPlayerListener) it.next()).onVideoResumed();
        }
    }

    /* renamed from: a */
    public void mo70027a(VideoPlayerListener videoPlayerListener) {
        synchronized (this.f40066a) {
            this.f40068c.add(videoPlayerListener);
        }
    }

    /* renamed from: b */
    public void mo70028b() {
        this.f40068c.clear();
        this.f40067b.mo67023a();
    }

    public void onVideoCompleted() {
        this.f40067b.mo67024a(new Runnable(m42073a()) {
            public final /* synthetic */ Set f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                sm1.m42074a(this.f$0);
            }
        });
    }

    public void onVideoError() {
        this.f40067b.mo67024a(new Runnable(m42073a()) {
            public final /* synthetic */ Set f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                sm1.m42075b(this.f$0);
            }
        });
    }

    public void onVideoPaused() {
        this.f40067b.mo67024a(new Runnable(m42073a()) {
            public final /* synthetic */ Set f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                sm1.m42076c(this.f$0);
            }
        });
    }

    public void onVideoPrepared() {
        this.f40067b.mo67024a(new Runnable(m42073a()) {
            public final /* synthetic */ Set f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                sm1.m42077d(this.f$0);
            }
        });
    }

    public void onVideoResumed() {
        this.f40067b.mo67024a(new Runnable(m42073a()) {
            public final /* synthetic */ Set f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                sm1.m42078e(this.f$0);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m42075b(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((VideoPlayerListener) it.next()).onVideoError();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m42074a(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((VideoPlayerListener) it.next()).onVideoCompleted();
        }
    }

    /* renamed from: a */
    private Set<VideoPlayerListener> m42073a() {
        HashSet hashSet;
        synchronized (this.f40066a) {
            hashSet = new HashSet(this.f40068c);
        }
        return hashSet;
    }
}
