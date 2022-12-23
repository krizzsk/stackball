package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.p267ad.InstreamAdPlayerListener;
import com.yandex.mobile.ads.instream.player.p267ad.error.InstreamAdPlayerError;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hf0 implements InstreamAdPlayerListener {

    /* renamed from: a */
    private final Object f34384a = new Object();

    /* renamed from: b */
    private final fk0 f34385b = new fk0();

    /* renamed from: c */
    private final Map<VideoAd, Set<InstreamAdPlayerListener>> f34386c = new HashMap();

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m36947c(Set set, VideoAd videoAd) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onAdCompleted(videoAd);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m36948d(Set set, VideoAd videoAd) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onAdPaused(videoAd);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m36949e(Set set, VideoAd videoAd) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onAdPrepared(videoAd);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m36950f(Set set, VideoAd videoAd) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onAdResumed(videoAd);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m36951g(Set set, VideoAd videoAd) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onAdSkipped(videoAd);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m36952h(Set set, VideoAd videoAd) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onAdStarted(videoAd);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ void m36953i(Set set, VideoAd videoAd) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onAdStopped(videoAd);
        }
    }

    /* renamed from: a */
    public void mo67534a(VideoAd videoAd, InstreamAdPlayerListener instreamAdPlayerListener) {
        synchronized (this.f34384a) {
            Set set = this.f34386c.get(videoAd);
            if (set == null) {
                set = new HashSet();
                this.f34386c.put(videoAd, set);
            }
            set.add(instreamAdPlayerListener);
        }
    }

    /* renamed from: b */
    public void mo67535b(VideoAd videoAd, InstreamAdPlayerListener instreamAdPlayerListener) {
        synchronized (this.f34384a) {
            Set set = this.f34386c.get(videoAd);
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (instreamAdPlayerListener.equals((InstreamAdPlayerListener) it.next())) {
                        it.remove();
                    }
                }
            }
        }
    }

    public void onAdBufferingFinished(VideoAd videoAd) {
        Set<InstreamAdPlayerListener> a = m36942a(videoAd);
        if (a != null) {
            this.f34385b.mo67024a(new Runnable(a, videoAd) {
                public final /* synthetic */ Set f$0;
                public final /* synthetic */ VideoAd f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void run() {
                    hf0.m36943a(this.f$0, this.f$1);
                }
            });
        }
    }

    public void onAdBufferingStarted(VideoAd videoAd) {
        Set<InstreamAdPlayerListener> a = m36942a(videoAd);
        if (a != null) {
            this.f34385b.mo67024a(new Runnable(a, videoAd) {
                public final /* synthetic */ Set f$0;
                public final /* synthetic */ VideoAd f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void run() {
                    hf0.m36946b(this.f$0, this.f$1);
                }
            });
        }
    }

    public void onAdCompleted(VideoAd videoAd) {
        Set<InstreamAdPlayerListener> a = m36942a(videoAd);
        if (a != null) {
            this.f34385b.mo67024a(new Runnable(a, videoAd) {
                public final /* synthetic */ Set f$0;
                public final /* synthetic */ VideoAd f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void run() {
                    hf0.m36947c(this.f$0, this.f$1);
                }
            });
        }
    }

    public void onAdPaused(VideoAd videoAd) {
        Set<InstreamAdPlayerListener> a = m36942a(videoAd);
        if (a != null) {
            this.f34385b.mo67024a(new Runnable(a, videoAd) {
                public final /* synthetic */ Set f$0;
                public final /* synthetic */ VideoAd f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void run() {
                    hf0.m36948d(this.f$0, this.f$1);
                }
            });
        }
    }

    public void onAdPrepared(VideoAd videoAd) {
        Set<InstreamAdPlayerListener> a = m36942a(videoAd);
        if (a != null) {
            this.f34385b.mo67024a(new Runnable(a, videoAd) {
                public final /* synthetic */ Set f$0;
                public final /* synthetic */ VideoAd f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void run() {
                    hf0.m36949e(this.f$0, this.f$1);
                }
            });
        }
    }

    public void onAdResumed(VideoAd videoAd) {
        Set<InstreamAdPlayerListener> a = m36942a(videoAd);
        if (a != null) {
            this.f34385b.mo67024a(new Runnable(a, videoAd) {
                public final /* synthetic */ Set f$0;
                public final /* synthetic */ VideoAd f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void run() {
                    hf0.m36950f(this.f$0, this.f$1);
                }
            });
        }
    }

    public void onAdSkipped(VideoAd videoAd) {
        Set<InstreamAdPlayerListener> a = m36942a(videoAd);
        if (a != null) {
            this.f34385b.mo67024a(new Runnable(a, videoAd) {
                public final /* synthetic */ Set f$0;
                public final /* synthetic */ VideoAd f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void run() {
                    hf0.m36951g(this.f$0, this.f$1);
                }
            });
        }
    }

    public void onAdStarted(VideoAd videoAd) {
        Set<InstreamAdPlayerListener> a = m36942a(videoAd);
        if (a != null) {
            this.f34385b.mo67024a(new Runnable(a, videoAd) {
                public final /* synthetic */ Set f$0;
                public final /* synthetic */ VideoAd f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void run() {
                    hf0.m36952h(this.f$0, this.f$1);
                }
            });
        }
    }

    public void onAdStopped(VideoAd videoAd) {
        Set<InstreamAdPlayerListener> a = m36942a(videoAd);
        if (a != null) {
            this.f34385b.mo67024a(new Runnable(a, videoAd) {
                public final /* synthetic */ Set f$0;
                public final /* synthetic */ VideoAd f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void run() {
                    hf0.m36953i(this.f$0, this.f$1);
                }
            });
        }
    }

    public void onError(VideoAd videoAd, InstreamAdPlayerError instreamAdPlayerError) {
        Set<InstreamAdPlayerListener> a = m36942a(videoAd);
        if (a != null) {
            this.f34385b.mo67024a(new Runnable(a, videoAd, instreamAdPlayerError) {
                public final /* synthetic */ Set f$0;
                public final /* synthetic */ VideoAd f$1;
                public final /* synthetic */ InstreamAdPlayerError f$2;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    hf0.m36945a(this.f$0, this.f$1, this.f$2);
                }
            });
        }
    }

    public void onVolumeChanged(VideoAd videoAd, float f) {
        Set<InstreamAdPlayerListener> a = m36942a(videoAd);
        if (a != null) {
            this.f34385b.mo67024a(new Runnable(a, videoAd, f) {
                public final /* synthetic */ Set f$0;
                public final /* synthetic */ VideoAd f$1;
                public final /* synthetic */ float f$2;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    hf0.m36944a(this.f$0, this.f$1, this.f$2);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo67533a() {
        this.f34385b.mo67023a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m36943a(Set set, VideoAd videoAd) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onAdBufferingFinished(videoAd);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m36944a(Set set, VideoAd videoAd, float f) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onVolumeChanged(videoAd, f);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m36946b(Set set, VideoAd videoAd) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onAdBufferingStarted(videoAd);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m36945a(Set set, VideoAd videoAd, InstreamAdPlayerError instreamAdPlayerError) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onError(videoAd, instreamAdPlayerError);
        }
    }

    /* renamed from: a */
    private Set<InstreamAdPlayerListener> m36942a(VideoAd videoAd) {
        HashSet hashSet;
        synchronized (this.f34384a) {
            Set set = this.f34386c.get(videoAd);
            hashSet = set != null ? new HashSet(set) : null;
        }
        return hashSet;
    }
}
