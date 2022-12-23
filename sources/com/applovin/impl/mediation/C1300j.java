package com.applovin.impl.mediation;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.mediation.C1259f;
import com.applovin.impl.mediation.p020b.C1225c;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.p025b.C1368b;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.impl.sdk.utils.C1554p;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.mediation.j */
public class C1300j {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final List<C1305b> f2533a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    private final C1302a f2534b;

    /* renamed from: c */
    private final C1302a f2535c;

    /* renamed from: com.applovin.impl.mediation.j$a */
    private static class C1302a implements AppLovinBroadcastManager.Receiver, MaxAdListener, MaxRewardedAdListener {

        /* renamed from: a */
        private final C1469j f2536a;

        /* renamed from: b */
        private final C1300j f2537b;

        /* renamed from: c */
        private final MaxAdFormat f2538c;

        /* renamed from: d */
        private final C1369c<String> f2539d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public MaxAdListener f2540e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C1225c f2541f;

        /* renamed from: g */
        private final Object f2542g;

        /* renamed from: h */
        private C1554p f2543h;

        /* renamed from: i */
        private long f2544i;

        /* renamed from: j */
        private final AtomicBoolean f2545j;

        /* renamed from: k */
        private volatile boolean f2546k;

        private C1302a(C1369c<String> cVar, MaxAdFormat maxAdFormat, C1300j jVar, C1469j jVar2) {
            this.f2542g = new Object();
            this.f2545j = new AtomicBoolean();
            this.f2537b = jVar;
            this.f2536a = jVar2;
            this.f2539d = cVar;
            this.f2538c = maxAdFormat;
            jVar2.mo13108ae().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
            jVar2.mo13108ae().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
        }

        /* renamed from: a */
        private void m2300a(long j) {
            if (j > 0) {
                this.f2544i = System.currentTimeMillis() + j;
                this.f2543h = C1554p.m3559a(j, this.f2536a, new Runnable() {
                    public void run() {
                        C1302a.this.m2306b(true);
                    }
                });
            }
        }

        /* renamed from: a */
        private void m2303a(boolean z) {
            if (this.f2536a.mo13084X().mo13378a()) {
                this.f2546k = z;
                this.f2545j.set(true);
                return;
            }
            String str = (String) this.f2536a.mo13088a(this.f2539d);
            if (C1553o.m3554b(str)) {
                this.f2536a.mo13142y().loadAd(str, this.f2538c, new C1259f.C1261a().mo12405a("fa", String.valueOf(true)).mo12405a("faie", String.valueOf(z)).mo12406a(), true, this.f2536a.mo13110ag(), this);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m2305b() {
            m2303a(false);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m2306b(boolean z) {
            synchronized (this.f2542g) {
                this.f2544i = 0;
                m2307c();
                this.f2541f = null;
            }
            m2303a(z);
        }

        /* renamed from: c */
        private void m2307c() {
            synchronized (this.f2542g) {
                if (this.f2543h != null) {
                    this.f2543h.mo13347d();
                    this.f2543h = null;
                }
            }
        }

        /* renamed from: a */
        public void mo12491a() {
            if (this.f2545j.compareAndSet(true, false)) {
                m2303a(this.f2546k);
                return;
            }
            long j = this.f2544i;
            if (j != 0) {
                long currentTimeMillis = j - System.currentTimeMillis();
                if (currentTimeMillis <= 0) {
                    m2306b(true);
                } else {
                    m2300a(currentTimeMillis);
                }
            }
        }

        public void onAdClicked(MaxAd maxAd) {
            this.f2540e.onAdClicked(maxAd);
        }

        public void onAdDisplayFailed(MaxAd maxAd, int i) {
            this.f2540e.onAdDisplayFailed(maxAd, i);
        }

        public void onAdDisplayed(MaxAd maxAd) {
            this.f2540e.onAdDisplayed(maxAd);
            m2306b(false);
        }

        public void onAdHidden(MaxAd maxAd) {
            this.f2540e.onAdHidden(maxAd);
            this.f2540e = null;
        }

        public void onAdLoadFailed(String str, int i) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    C1302a.this.m2305b();
                }
            }, TimeUnit.SECONDS.toMillis(((Long) this.f2536a.mo13088a(C1368b.f2819O)).longValue()));
        }

        public void onAdLoaded(MaxAd maxAd) {
            C1225c cVar = (C1225c) maxAd;
            this.f2541f = cVar;
            m2300a(cVar.mo12321n());
            Iterator it = new ArrayList(this.f2537b.f2533a).iterator();
            while (it.hasNext()) {
                ((C1305b) it.next()).mo12270a(this.f2541f);
            }
        }

        public void onReceive(Context context, Intent intent, Map<String, Object> map) {
            String action = intent.getAction();
            if ("com.applovin.application_paused".equals(action)) {
                m2307c();
            } else if ("com.applovin.application_resumed".equals(action)) {
                mo12491a();
            }
        }

        public void onRewardedVideoCompleted(MaxAd maxAd) {
            MaxAdListener maxAdListener = this.f2540e;
            if (maxAdListener instanceof MaxRewardedAdListener) {
                ((MaxRewardedAdListener) maxAdListener).onRewardedVideoCompleted(maxAd);
            }
        }

        public void onRewardedVideoStarted(MaxAd maxAd) {
            MaxAdListener maxAdListener = this.f2540e;
            if (maxAdListener instanceof MaxRewardedAdListener) {
                ((MaxRewardedAdListener) maxAdListener).onRewardedVideoStarted(maxAd);
            }
        }

        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            MaxAdListener maxAdListener = this.f2540e;
            if (maxAdListener instanceof MaxRewardedAdListener) {
                ((MaxRewardedAdListener) maxAdListener).onUserRewarded(maxAd, maxReward);
            }
        }
    }

    /* renamed from: com.applovin.impl.mediation.j$b */
    public interface C1305b {
        /* renamed from: a */
        void mo12270a(C1225c cVar);
    }

    public C1300j(C1469j jVar) {
        this.f2534b = new C1302a(C1368b.f2816L, MaxAdFormat.INTERSTITIAL, this, jVar);
        this.f2535c = new C1302a(C1368b.f2817M, MaxAdFormat.REWARDED, this, jVar);
    }

    /* renamed from: b */
    private C1302a m2293b(MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            return this.f2534b;
        }
        if (MaxAdFormat.REWARDED == maxAdFormat) {
            return this.f2535c;
        }
        return null;
    }

    /* renamed from: a */
    public C1225c mo12486a(MaxAdFormat maxAdFormat) {
        C1302a b = m2293b(maxAdFormat);
        if (b != null) {
            return b.f2541f;
        }
        return null;
    }

    /* renamed from: a */
    public void mo12487a() {
        this.f2534b.m2305b();
        this.f2535c.m2305b();
    }

    /* renamed from: a */
    public void mo12488a(C1305b bVar) {
        this.f2533a.add(bVar);
    }

    /* renamed from: a */
    public void mo12489a(MaxAdListener maxAdListener, MaxAdFormat maxAdFormat) {
        C1302a b = m2293b(maxAdFormat);
        if (b != null) {
            MaxAdListener unused = b.f2540e = maxAdListener;
        }
    }

    /* renamed from: b */
    public void mo12490b(C1305b bVar) {
        this.f2533a.remove(bVar);
    }
}
