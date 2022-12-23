package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.exoplayer2.C3716C;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.source.ads.AdsLoader;
import com.google.android.exoplayer2.ui.AdOverlayInfo;
import com.google.android.exoplayer2.ui.AdViewProvider;
import com.yandex.mobile.ads.impl.bk1;
import com.yandex.mobile.ads.impl.oj0;
import com.yandex.mobile.ads.instream.InstreamAd;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public class wf0 {

    /* renamed from: a */
    private final C15146x4 f41978a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C12952e3 f41979b;

    /* renamed from: c */
    private final C13025f3 f41980c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C13042fc f41981d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C13189gc f41982e;

    /* renamed from: f */
    private final oj0 f41983f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final r40 f41984g;

    /* renamed from: h */
    private final l40 f41985h;

    /* renamed from: i */
    private final u01 f41986i;

    /* renamed from: j */
    private final a01 f41987j;

    /* renamed from: k */
    private final Player.Listener f41988k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final sk1 f41989l = new sk1();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public nj1 f41990m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public mj1 f41991n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public InstreamAd f41992o;

    /* renamed from: p */
    private Player f41993p;

    /* renamed from: q */
    private Object f41994q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f41995r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f41996s;

    public wf0(C15029w4 w4Var, C13025f3 f3Var, C13042fc fcVar, C13189gc gcVar, oj0 oj0, zz0 zz0, l40 l40, u01 u01, Player.Listener listener) {
        this.f41978a = w4Var.mo70633b();
        this.f41979b = w4Var.mo70634c();
        this.f41980c = f3Var;
        this.f41981d = fcVar;
        this.f41982e = gcVar;
        this.f41983f = oj0;
        this.f41985h = l40;
        this.f41986i = u01;
        this.f41984g = zz0.mo71286c();
        this.f41987j = zz0.mo71287d();
        this.f41988k = listener;
    }

    /* renamed from: a */
    public void mo70692a(Player player) {
        this.f41993p = player;
    }

    /* renamed from: a */
    public void mo70693a(AdsLoader.EventListener eventListener, AdViewProvider adViewProvider, Object obj) {
        bk1.C12593a aVar;
        Player player = this.f41993p;
        this.f41984g.mo69688a(player);
        this.f41994q = obj;
        if (player != null) {
            player.addListener(this.f41988k);
            this.f41979b.mo66748a(eventListener);
            this.f41986i.mo70263a(new xz0(player, this.f41987j));
            if (this.f41995r) {
                this.f41979b.mo66747a(this.f41979b.mo66746a());
                C12965ec a = this.f41982e.mo67226a();
                if (a != null) {
                    a.mo66797a();
                    return;
                }
                return;
            }
            InstreamAd instreamAd = this.f41992o;
            if (instreamAd != null) {
                this.f41979b.mo66747a(this.f41980c.mo66912a(instreamAd, this.f41994q));
            } else if (adViewProvider != null) {
                ViewGroup adViewGroup = adViewProvider.getAdViewGroup();
                ArrayList arrayList = new ArrayList();
                for (AdOverlayInfo adOverlayInfo : adViewProvider.getAdOverlayInfos()) {
                    Intrinsics.checkNotNullParameter(adOverlayInfo, "adOverlayInfo");
                    View view = adOverlayInfo.view;
                    Intrinsics.checkNotNullExpressionValue(view, "adOverlayInfo.view");
                    int i = adOverlayInfo.purpose;
                    if (i == 0) {
                        aVar = bk1.C12593a.CONTROLS;
                    } else if (i == 1) {
                        aVar = bk1.C12593a.CLOSE_AD;
                    } else if (i != 3) {
                        aVar = bk1.C12593a.OTHER;
                    } else {
                        aVar = bk1.C12593a.NOT_VISIBLE;
                    }
                    arrayList.add(new bk1(view, aVar, adOverlayInfo.reasonDetail));
                }
                mo70691a(adViewGroup, (List<bk1>) arrayList);
            }
        }
    }

    /* renamed from: b */
    public void mo70695b() {
        Player a = this.f41984g.mo69687a();
        if (a != null) {
            if (this.f41992o != null) {
                long msToUs = C3716C.msToUs(a.getCurrentPosition());
                if (!this.f41987j.mo65634c()) {
                    msToUs = 0;
                }
                this.f41979b.mo66747a(this.f41979b.mo66746a().withAdResumePositionUs(msToUs));
            }
            a.removeListener(this.f41988k);
            this.f41979b.mo66748a((AdsLoader.EventListener) null);
            this.f41984g.mo69688a((Player) null);
            this.f41995r = true;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.wf0$b */
    private class C15048b implements oj0.C14189b {
        private C15048b() {
        }

        /* renamed from: a */
        public void mo69171a(ViewGroup viewGroup, List<bk1> list, InstreamAd instreamAd) {
            boolean unused = wf0.this.f41996s = false;
            InstreamAd unused2 = wf0.this.f41992o = instreamAd;
            if (instreamAd instanceof ng0) {
                wf0.this.getClass();
                ((ng0) wf0.this.f41992o).mo69029a((C15173xi) null);
            }
            C12965ec a = wf0.this.f41981d.mo66951a(viewGroup, list, instreamAd);
            wf0.this.f41982e.mo67227a(a);
            a.mo66800a((qk1) wf0.this.f41989l);
            a.mo66798a(wf0.this.f41991n);
            a.mo66799a(wf0.this.f41990m);
            if (wf0.this.f41984g.mo69690b()) {
                boolean unused3 = wf0.this.f41995r = true;
                wf0.m43606a(wf0.this, instreamAd);
            }
        }

        /* renamed from: a */
        public void mo69172a(String str) {
            boolean unused = wf0.this.f41996s = false;
            wf0.this.f41979b.mo66747a(AdPlaybackState.NONE);
        }
    }

    /* renamed from: a */
    public void mo70694a(qk1 qk1) {
        this.f41989l.mo70007a(qk1);
    }

    /* renamed from: a */
    public void mo70691a(ViewGroup viewGroup, List<bk1> list) {
        if (!this.f41996s && this.f41992o == null && viewGroup != null) {
            this.f41996s = true;
            if (list == null) {
                list = Collections.emptyList();
            }
            this.f41983f.mo69168a(viewGroup, list, new C15048b());
        }
    }

    /* renamed from: a */
    public void mo70688a() {
        this.f41996s = false;
        this.f41995r = false;
        this.f41992o = null;
        this.f41986i.mo70263a((xz0) null);
        this.f41978a.mo70823a();
        this.f41978a.mo70824a((e01) null);
        this.f41979b.mo66749b();
        this.f41983f.mo69167a();
        this.f41982e.mo67229c();
        this.f41989l.mo70007a((qk1) null);
        this.f41991n = null;
        C12965ec a = this.f41982e.mo67226a();
        if (a != null) {
            a.mo66798a((mj1) null);
        }
        this.f41990m = null;
        C12965ec a2 = this.f41982e.mo67226a();
        if (a2 != null) {
            a2.mo66799a((nj1) null);
        }
    }

    /* renamed from: a */
    public void mo70689a(int i, int i2) {
        this.f41985h.mo68327a(i, i2);
    }

    /* renamed from: a */
    public void mo70690a(int i, int i2, IOException iOException) {
        this.f41985h.mo68328b(i, i2, iOException);
    }

    /* renamed from: a */
    static void m43606a(wf0 wf0, InstreamAd instreamAd) {
        wf0.f41979b.mo66747a(wf0.f41980c.mo66912a(instreamAd, wf0.f41994q));
    }
}
