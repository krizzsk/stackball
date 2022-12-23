package com.applovin.impl.adview;

import android.graphics.PointF;
import android.net.Uri;
import android.os.Bundle;
import com.applovin.impl.adview.C1088i;
import com.applovin.impl.p008a.C1000a;
import com.applovin.impl.p008a.C1007d;
import com.applovin.impl.p008a.C1011g;
import com.applovin.impl.p008a.C1012h;
import com.applovin.impl.p008a.C1013i;
import com.applovin.impl.p008a.C1017k;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.p025b.C1369c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.adview.r */
public class C1149r extends C1103n {

    /* renamed from: a */
    private final Set<C1011g> f2113a = new HashSet();

    /* renamed from: a */
    private void m1772a() {
        if (isFullyWatched() && !this.f2113a.isEmpty()) {
            C1505q qVar = this.logger;
            qVar.mo13280d("InterstitialActivity", "Firing " + this.f2113a.size() + " un-fired video progress trackers when video was completed.");
            m1777a(this.f2113a);
        }
    }

    /* renamed from: a */
    private void m1773a(C1000a.C1004c cVar) {
        m1774a(cVar, C1007d.UNSPECIFIED);
    }

    /* renamed from: a */
    private void m1774a(C1000a.C1004c cVar, C1007d dVar) {
        m1776a(cVar, "", dVar);
    }

    /* renamed from: a */
    private void m1775a(C1000a.C1004c cVar, String str) {
        m1776a(cVar, str, C1007d.UNSPECIFIED);
    }

    /* renamed from: a */
    private void m1776a(C1000a.C1004c cVar, String str, C1007d dVar) {
        if (isVastAd()) {
            m1778a(((C1000a) this.currentAd).mo11653a(cVar, str), dVar);
        }
    }

    /* renamed from: a */
    private void m1777a(Set<C1011g> set) {
        m1778a(set, C1007d.UNSPECIFIED);
    }

    /* renamed from: a */
    private void m1778a(Set<C1011g> set, C1007d dVar) {
        if (isVastAd() && set != null && !set.isEmpty()) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds((long) this.videoView.getCurrentPosition());
            C1017k l = m1779b().mo11677l();
            Uri a = l != null ? l.mo11739a() : null;
            C1505q qVar = this.logger;
            qVar.mo13277b("InterstitialActivity", "Firing " + set.size() + " tracker(s): " + set);
            C1013i.m1370a(set, seconds, a, dVar, this.sdk);
        }
    }

    /* renamed from: b */
    private C1000a m1779b() {
        if (this.currentAd instanceof C1000a) {
            return (C1000a) this.currentAd;
        }
        return null;
    }

    public void clickThroughFromVideo(PointF pointF) {
        super.clickThroughFromVideo(pointF);
        m1773a(C1000a.C1004c.VIDEO_CLICK);
    }

    public void dismiss() {
        if (isVastAd()) {
            m1775a(C1000a.C1004c.VIDEO, "close");
            m1775a(C1000a.C1004c.COMPANION, "close");
        }
        super.dismiss();
    }

    public void handleCountdownStep() {
        if (isVastAd()) {
            long seconds = ((long) this.computedLengthSeconds) - TimeUnit.MILLISECONDS.toSeconds((long) (this.videoView.getDuration() - this.videoView.getCurrentPosition()));
            HashSet hashSet = new HashSet();
            for (C1011g gVar : new HashSet(this.f2113a)) {
                if (gVar.mo11723a(seconds, getVideoPercentViewed())) {
                    hashSet.add(gVar);
                    this.f2113a.remove(gVar);
                }
            }
            m1777a((Set<C1011g>) hashSet);
        }
    }

    public void handleMediaError(String str) {
        m1774a(C1000a.C1004c.ERROR, C1007d.MEDIA_FILE_ERROR);
        super.handleMediaError(str);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (isVastAd()) {
            this.f2113a.addAll(m1779b().mo11654a(C1000a.C1004c.VIDEO, C1012h.f1706a));
            m1773a(C1000a.C1004c.IMPRESSION);
            m1775a(C1000a.C1004c.VIDEO, "creativeView");
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        m1775a(this.postitialWasDisplayed ? C1000a.C1004c.COMPANION : C1000a.C1004c.VIDEO, CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m1775a(this.postitialWasDisplayed ? C1000a.C1004c.COMPANION : C1000a.C1004c.VIDEO, CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public void playVideo() {
        this.countdownManager.mo11958a("PROGRESS_TRACKING", ((Long) this.sdk.mo13088a(C1369c.f3074eH)).longValue(), (C1088i.C1090a) new C1088i.C1090a() {
            /* renamed from: a */
            public void mo11867a() {
                C1149r.this.handleCountdownStep();
            }

            /* renamed from: b */
            public boolean mo11868b() {
                return C1149r.this.shouldContinueFullLengthVideoCountdown();
            }
        });
        super.playVideo();
    }

    public void showPostitial() {
        if (isVastAd()) {
            m1772a();
            if (!C1013i.m1377c(m1779b())) {
                dismiss();
                return;
            } else if (!this.postitialWasDisplayed) {
                m1775a(C1000a.C1004c.COMPANION, "creativeView");
            } else {
                return;
            }
        }
        super.showPostitial();
    }

    public void skipVideo() {
        m1775a(C1000a.C1004c.VIDEO, "skip");
        super.skipVideo();
    }

    public void toggleMute() {
        super.toggleMute();
        m1775a(C1000a.C1004c.VIDEO, this.videoMuted ? "mute" : "unmute");
    }
}
