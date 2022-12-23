package com.applovin.impl.adview.p009a.p011b;

import android.graphics.PointF;
import android.net.Uri;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.C1088i;
import com.applovin.impl.p008a.C1000a;
import com.applovin.impl.p008a.C1007d;
import com.applovin.impl.p008a.C1011g;
import com.applovin.impl.p008a.C1012h;
import com.applovin.impl.p008a.C1013i;
import com.applovin.impl.p008a.C1014j;
import com.applovin.impl.p008a.C1017k;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.p024ad.C1355g;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.adview.a.b.c */
public class C1059c extends C1061d {

    /* renamed from: v */
    private final C1000a f1876v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final Set<C1011g> f1877w = new HashSet();

    public C1059c(C1355g gVar, AppLovinFullscreenActivity appLovinFullscreenActivity, C1469j jVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(gVar, appLovinFullscreenActivity, jVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        C1000a aVar = (C1000a) gVar;
        this.f1876v = aVar;
        this.f1877w.addAll(aVar.mo11654a(C1000a.C1004c.VIDEO, C1012h.f1706a));
        m1509a(C1000a.C1004c.IMPRESSION);
        m1511a(C1000a.C1004c.VIDEO, "creativeView");
    }

    /* renamed from: a */
    private void m1509a(C1000a.C1004c cVar) {
        m1510a(cVar, C1007d.UNSPECIFIED);
    }

    /* renamed from: a */
    private void m1510a(C1000a.C1004c cVar, C1007d dVar) {
        m1512a(cVar, "", dVar);
    }

    /* renamed from: a */
    private void m1511a(C1000a.C1004c cVar, String str) {
        m1512a(cVar, str, C1007d.UNSPECIFIED);
    }

    /* renamed from: a */
    private void m1512a(C1000a.C1004c cVar, String str, C1007d dVar) {
        m1515a(this.f1876v.mo11653a(cVar, str), dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1514a(Set<C1011g> set) {
        m1515a(set, C1007d.UNSPECIFIED);
    }

    /* renamed from: a */
    private void m1515a(Set<C1011g> set, C1007d dVar) {
        if (set != null && !set.isEmpty()) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds((long) this.f1889q.getCurrentPosition());
            C1017k l = this.f1876v.mo11677l();
            Uri a = l != null ? l.mo11739a() : null;
            C1505q qVar = this.f1833c;
            qVar.mo13277b("InterActivityV2", "Firing " + set.size() + " tracker(s): " + set);
            C1013i.m1370a(set, seconds, a, dVar, this.f1832b);
        }
    }

    /* renamed from: z */
    private void m1516z() {
        if (mo11870x() && !this.f1877w.isEmpty()) {
            C1505q qVar = this.f1833c;
            qVar.mo13280d("InterActivityV2", "Firing " + this.f1877w.size() + " un-fired video progress trackers when video was completed.");
            m1514a(this.f1877w);
        }
    }

    /* renamed from: a */
    public void mo11861a(PointF pointF) {
        m1509a(C1000a.C1004c.VIDEO_CLICK);
        super.mo11861a(pointF);
    }

    /* renamed from: c */
    public void mo11827c() {
        super.mo11827c();
        this.f1890r.mo11958a("PROGRESS_TRACKING", ((Long) this.f1832b.mo13088a(C1369c.f3074eH)).longValue(), (C1088i.C1090a) new C1088i.C1090a() {
            /* renamed from: a */
            public void mo11867a() {
                long seconds = TimeUnit.MILLISECONDS.toSeconds(C1059c.this.f1892t - ((long) (C1059c.this.f1889q.getDuration() - C1059c.this.f1889q.getCurrentPosition())));
                HashSet hashSet = new HashSet();
                for (C1011g gVar : new HashSet(C1059c.this.f1877w)) {
                    if (gVar.mo11723a(seconds, C1059c.this.mo11871y())) {
                        hashSet.add(gVar);
                        C1059c.this.f1877w.remove(gVar);
                    }
                }
                C1059c.this.m1514a((Set<C1011g>) hashSet);
            }

            /* renamed from: b */
            public boolean mo11868b() {
                return !C1059c.this.f1893u;
            }
        });
    }

    /* renamed from: c */
    public void mo11862c(String str) {
        m1510a(C1000a.C1004c.ERROR, C1007d.MEDIA_FILE_ERROR);
        super.mo11862c(str);
    }

    /* renamed from: d */
    public void mo11829d() {
        super.mo11829d();
        m1511a(this.f1893u ? C1000a.C1004c.COMPANION : C1000a.C1004c.VIDEO, CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    /* renamed from: e */
    public void mo11830e() {
        super.mo11830e();
        m1511a(this.f1893u ? C1000a.C1004c.COMPANION : C1000a.C1004c.VIDEO, CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    /* renamed from: f */
    public void mo11831f() {
        m1511a(C1000a.C1004c.VIDEO, "close");
        m1511a(C1000a.C1004c.COMPANION, "close");
        super.mo11831f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo11842q() {
        long j;
        int r;
        long j2 = 0;
        if (this.f1876v.mo12799am() >= 0 || this.f1876v.mo12800an() >= 0) {
            int i = (this.f1876v.mo12799am() > 0 ? 1 : (this.f1876v.mo12799am() == 0 ? 0 : -1));
            C1000a aVar = this.f1876v;
            if (i >= 0) {
                j = aVar.mo12799am();
            } else {
                C1014j k = aVar.mo11676k();
                if (k != null && k.mo11730b() > 0) {
                    j2 = 0 + TimeUnit.SECONDS.toMillis((long) k.mo11730b());
                } else if (this.f1892t > 0) {
                    j2 = 0 + this.f1892t;
                }
                if (aVar.mo12801ao() && (r = (int) aVar.mo12821r()) > 0) {
                    j2 += TimeUnit.SECONDS.toMillis((long) r);
                }
                j = (long) (((double) j2) * (((double) this.f1876v.mo12800an()) / 100.0d));
            }
            mo11817a(j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo11863s() {
        this.f1890r.mo11960c();
        super.mo11863s();
    }

    /* renamed from: t */
    public void mo11864t() {
        m1511a(C1000a.C1004c.VIDEO, "skip");
        super.mo11864t();
    }

    /* renamed from: u */
    public void mo11865u() {
        super.mo11865u();
        m1511a(C1000a.C1004c.VIDEO, this.f1891s ? "mute" : "unmute");
    }

    /* renamed from: v */
    public void mo11866v() {
        m1516z();
        if (!C1013i.m1377c(this.f1876v)) {
            this.f1833c.mo13277b("InterActivityV2", "VAST ad does not have valid companion ad - dismissing...");
            mo11831f();
        } else if (!this.f1893u) {
            m1511a(C1000a.C1004c.COMPANION, "creativeView");
            super.mo11866v();
        }
    }
}
