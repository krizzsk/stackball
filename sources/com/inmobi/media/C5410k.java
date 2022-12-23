package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.share.internal.ShareConstants;
import com.google.common.base.Ascii;
import com.iab.omid.library.inmobi.adsession.video.Position;
import com.iab.omid.library.inmobi.adsession.video.VastProperties;
import com.inmobi.media.C5114di;
import com.inmobi.media.C5331h;
import com.inmobi.media.C5397j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.inmobi.media.k */
/* compiled from: NativeVideoAdContainer */
public class C5410k extends C5397j {
    /* access modifiers changed from: private */

    /* renamed from: y */
    public static final String f12409y = C5410k.class.getSimpleName();

    /* renamed from: A */
    private final C5331h.C5332a f12410A = new C5331h.C5332a() {
        /* renamed from: a */
        public final void mo40700a() {
            String unused = C5410k.f12409y;
            C5397j.C5409c h = C5410k.this.mo40781h();
            if (h != null) {
                h.mo40826a();
            }
        }

        /* renamed from: a */
        public final void mo40701a(Object obj) {
            if (C5410k.this.mo40788o() != null) {
                C5031bs bsVar = (C5031bs) obj;
                String unused = C5410k.f12409y;
                bsVar.f11380v.put("didRequestFullScreen", Boolean.TRUE);
                bsVar.f11380v.put("isFullScreen", Boolean.TRUE);
                bsVar.f11380v.put("shouldAutoPlay", Boolean.TRUE);
                if (bsVar.f11383y != null) {
                    bsVar.f11383y.f11380v.put("didRequestFullScreen", Boolean.TRUE);
                    bsVar.f11383y.f11380v.put("isFullScreen", Boolean.TRUE);
                    bsVar.f11383y.f11380v.put("shouldAutoPlay", Boolean.TRUE);
                }
                if (C5410k.this.getPlacementType() == 0) {
                    C5410k.this.getViewableAd().mo40367a((byte) 1);
                    bsVar.mo40163a("fullscreen", (Map<String, String>) C5410k.this.m12616h(bsVar));
                }
                C5397j.C5409c h = C5410k.this.mo40781h();
                if (h != null) {
                    h.mo40829b();
                }
            }
        }

        /* renamed from: b */
        public final void mo40702b(Object obj) {
            String unused = C5410k.f12409y;
            C5031bs bsVar = (C5031bs) obj;
            bsVar.f11380v.put("didRequestFullScreen", Boolean.FALSE);
            bsVar.f11380v.put("isFullScreen", Boolean.FALSE);
            if (bsVar.f11383y != null) {
                bsVar.f11383y.f11380v.put("didRequestFullScreen", Boolean.FALSE);
                bsVar.f11383y.f11380v.put("isFullScreen", Boolean.FALSE);
                bsVar.f11383y.f11383y = null;
            }
            bsVar.f11383y = null;
            if (C5410k.this.getPlacementType() == 0) {
                C5410k.this.getViewableAd().mo40367a((byte) 2);
                if (C5410k.this.f12384m != null) {
                    C5410k.this.f12384m.getViewableAd().mo40367a((byte) Ascii.DLE);
                }
                bsVar.mo40163a("exitFullscreen", (Map<String, String>) C5410k.this.m12616h(bsVar));
            } else {
                C5410k.this.getViewableAd().mo40367a((byte) 3);
            }
            C5397j.C5409c h = C5410k.this.mo40781h();
            if (h != null) {
                h.mo40833f();
            }
        }
    };

    /* renamed from: x */
    public final C5114di.C5118a f12411x = new C5114di.C5118a() {
        /* renamed from: a */
        public final void mo40397a(View view, boolean z) {
            C5410k.this.mo40777a(z);
            C5410k.m12610a(C5410k.this, view, z);
        }
    };

    /* renamed from: z */
    private WeakReference<View> f12412z;

    /* renamed from: b */
    private void m12613b(C5184eo eoVar) {
        int videoVolume = eoVar.getVideoVolume();
        int lastVolume = eoVar.getLastVolume();
        if (videoVolume != lastVolume && lastVolume > 0) {
            m12615b(true);
            eoVar.setLastVolume(videoVolume);
        }
    }

    /* renamed from: b */
    private void m12615b(boolean z) {
        C5397j.C5409c h;
        if (getPlacementType() == 0 && !mo40785l() && (h = mo40781h()) != null) {
            h.mo40828a(z);
        }
    }

    C5410k(Context context, byte b, C5016bj bjVar, String str, Set<C5096cx> set, C5220ev evVar, long j, boolean z, String str2, String str3) {
        super(context, b, bjVar, str, set, evVar, j, z, str2, str3);
        this.f12372a = bjVar;
    }

    /* renamed from: a */
    public final void mo40771a(View view) {
        if (!mo40787n() && !this.f12382k && (view instanceof C5184eo)) {
            this.f12381j = true;
            C5031bs bsVar = (C5031bs) ((C5184eo) view).getTag();
            if (!((Boolean) bsVar.f11380v.get("didImpressionFire")).booleanValue()) {
                List<C5030br> list = bsVar.f11379u;
                Map<String, String> h = m12616h(bsVar);
                List<String> arrayList = new ArrayList<>();
                for (C5030br next : list) {
                    if ("VideoImpression".equals(next.f11469d)) {
                        if (next.f11467b.startsWith("http")) {
                            C5031bs.m11373a(next, h);
                        }
                        arrayList = (List) next.f11471f.get("referencedEvents");
                        if (arrayList != null) {
                            for (String a : arrayList) {
                                bsVar.mo40163a(a, h);
                            }
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    bsVar.mo40163a("start", h);
                    bsVar.mo40163a("Impression", h);
                }
                this.f12372a.f11405d.mo40163a("Impression", m12616h(bsVar));
                bsVar.f11380v.put("didImpressionFire", Boolean.TRUE);
                this.f12380i.mo40367a((byte) 0);
                if (mo40781h() != null) {
                    mo40781h().mo40831d();
                }
            }
        }
    }

    /* renamed from: l */
    public final boolean mo40785l() {
        return getPlacementType() == 0 && mo40788o() != null;
    }

    public C5098cz getViewableAd() {
        VastProperties vastProperties;
        Context m = mo40786m();
        if (this.f12380i == null && m != null) {
            mo40783j();
            this.f12380i = new C5113dh(this, new C5103dc(this));
            if (this.f12379h != null) {
                for (C5096cx cxVar : this.f12379h) {
                    try {
                        byte b = cxVar.f11686a;
                        if (b == 1) {
                            C5098cz czVar = this.f12380i;
                            Map<String, Object> map = cxVar.f11687b;
                            StringBuilder sb = new StringBuilder();
                            for (C5030br next : ((C5031bs) this.f12372a.mo40185c(ShareConstants.VIDEO_URL).get(0)).f11379u) {
                                if ("zMoatVASTIDs".equals(next.f11469d)) {
                                    sb.append(next.f11467b);
                                }
                            }
                            if (sb.length() > 0) {
                                map.put("zMoatVASTIDs", sb.toString());
                            }
                            this.f12380i = new C5129do(m, czVar, this, map);
                        } else if (b == 3) {
                            C5131dq dqVar = (C5131dq) cxVar.f11687b.get("omidAdSession");
                            boolean booleanValue = ((Boolean) cxVar.f11687b.get("videoAutoPlay")).booleanValue();
                            boolean booleanValue2 = ((Boolean) cxVar.f11687b.get("videoSkippable")).booleanValue();
                            int intValue = ((Integer) cxVar.f11687b.get("videoSkipOffset")).intValue();
                            if (booleanValue2) {
                                vastProperties = VastProperties.createVastPropertiesForSkippableVideo((float) intValue, booleanValue, Position.STANDALONE);
                            } else {
                                vastProperties = VastProperties.createVastPropertiesForNonSkippableVideo(booleanValue, Position.STANDALONE);
                            }
                            VastProperties vastProperties2 = vastProperties;
                            if (dqVar != null) {
                                this.f12380i = new C5138dw(m, this.f12380i, this, dqVar, vastProperties2);
                            }
                        }
                    } catch (Exception e) {
                        C5275fn.m12068a().mo40590a(new C5308gk(e));
                    }
                }
            }
        }
        return this.f12380i;
    }

    public C5331h.C5332a getFullScreenEventsListener() {
        return this.f12410A;
    }

    public View getVideoContainerView() {
        WeakReference<View> weakReference = this.f12412z;
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final boolean mo40797q() {
        return !this.f12388q;
    }

    /* renamed from: z */
    public final void mo40846z() {
        this.f12380i.mo40367a((byte) 5);
    }

    /* renamed from: B */
    private void m12606B() {
        this.f12380i.mo40367a((byte) Ascii.f10109SI);
    }

    /* renamed from: t */
    public final void mo40800t() {
        super.mo40800t();
        C5197ep epVar = (C5197ep) getVideoContainerView();
        if (epVar != null) {
            C5184eo videoView = epVar.getVideoView();
            if (getPlacementType() == 0 && !mo40785l() && videoView.getVideoVolume() > 0) {
                videoView.setLastVolume(-2);
                m12615b(true);
            }
            videoView.pause();
        }
    }

    /* renamed from: C */
    private static String m12607C() {
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i == 0) {
            i = (secureRandom.nextInt() & Integer.MAX_VALUE) % 10;
        }
        sb.append(i);
        for (int i2 = 1; i2 < 8; i2++) {
            sb.append((secureRandom.nextInt() & Integer.MAX_VALUE) % 10);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m12608a(int i) {
        long j = (long) i;
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j))), Long.valueOf(j - (TimeUnit.MILLISECONDS.toSeconds(j) * 1000))});
    }

    public void destroy() {
        C5197ep epVar;
        if (!this.f12382k) {
            if (!(getVideoContainerView() == null || (epVar = (C5197ep) getVideoContainerView()) == null)) {
                epVar.getVideoView().mo40490c();
            }
            super.destroy();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo40778b(C5010bf bfVar) {
        C5197ep epVar;
        byte b = bfVar.f11370l;
        if (b == 0) {
            return;
        }
        if (b == 1) {
            super.mo40778b(bfVar);
        } else if (b == 3) {
            try {
                if (ShareConstants.VIDEO_URL.equals(bfVar.f11360b)) {
                    if (this.f12392u != null) {
                        this.f12392u.mo40860e("window.imraid.broadcastEvent('replay');");
                    }
                    if (mo40782i() != null) {
                        View i = mo40782i();
                        C5027bq b2 = C5397j.m12518b(i);
                        if (b2 != null) {
                            b2.mo40192a();
                        }
                        ViewGroup viewGroup = (ViewGroup) i.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(i);
                        }
                    }
                    C5197ep epVar2 = (C5197ep) getVideoContainerView();
                    if (epVar2 != null) {
                        epVar2.getVideoView().mo40495e();
                        epVar2.getVideoView().start();
                    }
                }
            } catch (Exception e) {
                C5327gw.m12263a((byte) 2, "InMobi", "SDK encountered unexpected error in replaying video");
                C5275fn.m12068a().mo40590a(new C5308gk(e));
            }
        } else if (b == 4) {
            try {
                if (getPlacementType() == 0 && (epVar = (C5197ep) getVideoContainerView()) != null) {
                    C5184eo videoView = epVar.getVideoView();
                    C5031bs bsVar = (C5031bs) videoView.getTag();
                    if (videoView.getState() != 1) {
                        try {
                            if (this.f12382k) {
                                return;
                            }
                            if (this.f12386o.get() != null) {
                                if (!((Boolean) bsVar.f11380v.get("didRequestFullScreen")).booleanValue()) {
                                    bsVar.f11380v.put("didRequestFullScreen", Boolean.TRUE);
                                    bsVar.f11380v.put("seekPosition", Integer.valueOf(videoView.getCurrentPosition()));
                                    bsVar.f11380v.put("lastMediaVolume", Integer.valueOf(videoView.getVolume()));
                                    if (videoView.getMediaPlayer().isPlaying()) {
                                        videoView.getMediaPlayer().pause();
                                    }
                                    videoView.getMediaPlayer().f11892a = 4;
                                    bsVar.f11380v.put("isFullScreen", Boolean.TRUE);
                                    bsVar.f11380v.put("seekPosition", Integer.valueOf(videoView.getMediaPlayer().getCurrentPosition()));
                                    mo40796p();
                                }
                            }
                        } catch (Exception e2) {
                            C5275fn.m12068a().mo40590a(new C5308gk(e2));
                        }
                    }
                }
            } catch (Exception e3) {
                C5327gw.m12263a((byte) 2, "InMobi", "SDK encountered unexpected error in expanding video to fullscreen");
                C5275fn.m12068a().mo40590a(new C5308gk(e3));
            }
        } else if (b != 5) {
            try {
                if (1 == getPlacementType()) {
                    super.mo40778b(bfVar);
                    if (ShareConstants.VIDEO_URL.equals(bfVar.f11360b)) {
                        C5197ep epVar3 = (C5197ep) getVideoContainerView();
                        if (epVar3 != null) {
                            epVar3.getVideoView().mo40494d();
                            C5184eo videoView2 = epVar3.getVideoView();
                            if (videoView2.mo40489b() && videoView2.f11916a.isPlaying()) {
                                videoView2.f11916a.pause();
                                videoView2.f11916a.seekTo(0);
                                if (videoView2.getTag() != null) {
                                    C5031bs bsVar2 = (C5031bs) videoView2.getTag();
                                    bsVar2.f11380v.put("didPause", Boolean.TRUE);
                                    bsVar2.f11380v.put("seekPosition", 0);
                                    bsVar2.f11380v.put("didCompleteQ4", Boolean.TRUE);
                                }
                                videoView2.f11916a.f11892a = 4;
                                videoView2.getPlaybackEventListener().mo40468a((byte) 4);
                            }
                            if (videoView2.f11916a != null) {
                                videoView2.f11916a.f11893b = 4;
                            }
                        }
                        m12606B();
                        return;
                    }
                    return;
                }
                C5397j.C5409c h = mo40781h();
                if (h != null) {
                    h.mo40836i();
                }
                m12606B();
            } catch (Exception e4) {
                C5275fn.m12068a().mo40590a(new C5308gk(e4));
            }
        } else {
            try {
                C5197ep epVar4 = (C5197ep) getVideoContainerView();
                if (epVar4 != null) {
                    C5031bs bsVar3 = (C5031bs) epVar4.getVideoView().getTag();
                    bsVar3.f11380v.put("shouldAutoPlay", Boolean.TRUE);
                    if (bsVar3.f11383y != null) {
                        bsVar3.f11383y.f11380v.put("shouldAutoPlay", Boolean.TRUE);
                    }
                    epVar4.getVideoView().start();
                }
            } catch (Exception e5) {
                C5327gw.m12263a((byte) 2, "InMobi", "SDK encountered unexpected error in playing video");
                C5275fn.m12068a().mo40590a(new C5308gk(e5));
            }
        }
    }

    /* renamed from: a */
    public final void mo40839a(C5184eo eoVar) {
        eoVar.setIsLockScreen(this.f12390s);
        C5197ep epVar = (C5197ep) eoVar.getParent();
        this.f12412z = new WeakReference<>(epVar);
        C5181en mediaController = epVar.getVideoView().getMediaController();
        if (mediaController != null) {
            mediaController.setVideoAd(this);
        }
    }

    /* renamed from: a */
    public final void mo40837a(C5031bs bsVar) {
        if (!this.f12382k) {
            bsVar.mo40163a("error", m12616h(bsVar));
            this.f12380i.mo40367a((byte) 17);
        }
    }

    /* renamed from: b */
    public final void mo40840b(C5031bs bsVar) {
        if (!this.f12382k) {
            if (getPlacementType() == 0) {
                if (((Integer) bsVar.f11380v.get("currentMediaVolume")).intValue() > 0 && ((Integer) bsVar.f11380v.get("lastMediaVolume")).intValue() == 0) {
                    mo40844f(bsVar);
                }
                if (((Integer) bsVar.f11380v.get("currentMediaVolume")).intValue() == 0 && ((Integer) bsVar.f11380v.get("lastMediaVolume")).intValue() > 0) {
                    mo40843e(bsVar);
                }
            }
            if (!((Boolean) bsVar.f11380v.get("didStartPlaying")).booleanValue()) {
                bsVar.f11380v.put("didStartPlaying", Boolean.TRUE);
                getViewableAd().mo40367a((byte) 6);
            }
        }
    }

    /* renamed from: c */
    public final void mo40841c(C5031bs bsVar) {
        if (!this.f12382k) {
            m12522c(mo40782i());
            bsVar.mo40163a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, m12616h(bsVar));
            this.f12380i.mo40367a((byte) 7);
        }
    }

    /* renamed from: d */
    public final void mo40842d(C5031bs bsVar) {
        if (!this.f12382k) {
            m12525d(mo40782i());
            bsVar.mo40163a(CampaignEx.JSON_NATIVE_VIDEO_RESUME, m12616h(bsVar));
            this.f12380i.mo40367a((byte) 8);
        }
    }

    /* renamed from: e */
    public final void mo40843e(C5031bs bsVar) {
        if (!this.f12382k) {
            bsVar.f11380v.put("lastMediaVolume", 0);
            bsVar.mo40163a("mute", m12616h(bsVar));
            this.f12380i.mo40367a((byte) Ascii.f10100CR);
        }
    }

    /* renamed from: f */
    public final void mo40844f(C5031bs bsVar) {
        if (!this.f12382k) {
            bsVar.f11380v.put("lastMediaVolume", 15);
            bsVar.mo40163a("unmute", m12616h(bsVar));
            this.f12380i.mo40367a((byte) Ascii.f10110SO);
        }
    }

    /* renamed from: a */
    public final void mo40838a(C5031bs bsVar, byte b) {
        if (!this.f12382k) {
            if (b == 0) {
                bsVar.mo40163a(TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE, m12616h(bsVar));
                this.f12380i.mo40367a((byte) 9);
            } else if (b == 1) {
                bsVar.mo40163a("midpoint", m12616h(bsVar));
                this.f12380i.mo40367a((byte) 10);
            } else if (b == 2) {
                bsVar.mo40163a(TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE, m12616h(bsVar));
                this.f12380i.mo40367a((byte) Ascii.f10113VT);
            } else if (b == 3 && !((Boolean) bsVar.f11380v.get("didQ4Fire")).booleanValue()) {
                mo40845g(bsVar);
            }
        }
    }

    /* renamed from: g */
    public final void mo40845g(C5031bs bsVar) {
        bsVar.f11380v.put("didQ4Fire", Boolean.TRUE);
        bsVar.mo40163a("complete", m12616h(bsVar));
        this.f12380i.mo40367a((byte) Ascii.f10102FF);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public Map<String, String> m12616h(C5031bs bsVar) {
        C5012bh bhVar = (C5012bh) bsVar.f11378t;
        HashMap hashMap = new HashMap(4);
        C5197ep epVar = (C5197ep) this.f12412z.get();
        if (epVar != null) {
            hashMap.put("$MD", String.valueOf((int) Math.round((((double) epVar.getVideoView().getDuration()) * 1.0d) / 1000.0d)));
        }
        hashMap.put("[ERRORCODE]", "405");
        hashMap.put("[CONTENTPLAYHEAD]", m12608a(((Integer) bsVar.f11380v.get("seekPosition")).intValue()));
        hashMap.put("[CACHEBUSTING]", m12607C());
        hashMap.put("[ASSETURI]", bsVar.mo40205b().mo40359b());
        hashMap.put("$TS", String.valueOf(System.currentTimeMillis()));
        hashMap.put("$LTS", String.valueOf(this.f12372a.f11405d.f11398z));
        C5318gr.m12239a(mo40780g(), this.f12378g, hashMap);
        if (bhVar != null) {
            hashMap.put("$STS", String.valueOf(bhVar.f11398z));
        }
        if (this.f12372a != null) {
            hashMap.putAll(this.f12372a.mo40181a());
        }
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = (com.inmobi.media.C5031bs) r4.getTag();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m12610a(com.inmobi.media.C5410k r3, android.view.View r4, final boolean r5) {
        /*
            r0 = 2147483647(0x7fffffff, float:NaN)
            android.view.View r4 = r4.findViewById(r0)
            com.inmobi.media.eo r4 = (com.inmobi.media.C5184eo) r4
            if (r4 == 0) goto L_0x0024
            java.lang.Object r0 = r4.getTag()
            com.inmobi.media.bs r0 = (com.inmobi.media.C5031bs) r0
            if (r0 == 0) goto L_0x0024
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            com.inmobi.media.k$3 r2 = new com.inmobi.media.k$3
            r2.<init>(r0, r5, r4)
            r1.post(r2)
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5410k.m12610a(com.inmobi.media.k, android.view.View, boolean):void");
    }

    /* renamed from: a */
    static /* synthetic */ void m12611a(C5410k kVar, C5184eo eoVar) {
        int videoVolume;
        if (kVar.getPlacementType() == 0 && !kVar.mo40785l() && (videoVolume = eoVar.getVideoVolume()) != eoVar.getLastVolume() && eoVar.isPlaying()) {
            kVar.m12615b(videoVolume <= 0);
            eoVar.setLastVolume(videoVolume);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m12612a(C5410k kVar, C5184eo eoVar, C5031bs bsVar) {
        if (kVar.getPlacementType() == 0 && !kVar.mo40785l() && !bsVar.f11474C && !eoVar.isPlaying() && eoVar.getState() == 5) {
            kVar.m12613b(eoVar);
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m12614b(C5410k kVar, C5184eo eoVar) {
        if (kVar.getPlacementType() == 0 && !kVar.mo40785l() && !kVar.f12383l) {
            kVar.m12613b(eoVar);
        }
    }
}
