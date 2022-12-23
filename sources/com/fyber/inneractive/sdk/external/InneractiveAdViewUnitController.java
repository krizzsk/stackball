package com.fyber.inneractive.sdk.external;

import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.C2801o;
import com.fyber.inneractive.sdk.config.C2809u;
import com.fyber.inneractive.sdk.config.C2811w;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.p033c.C2724b;
import com.fyber.inneractive.sdk.p033c.C2730d;
import com.fyber.inneractive.sdk.p037d.C2840i;
import com.fyber.inneractive.sdk.p037d.C2854n;
import com.fyber.inneractive.sdk.p037d.C2856p;
import com.fyber.inneractive.sdk.p045e.C2899b;
import com.fyber.inneractive.sdk.p045e.C2900c;
import com.fyber.inneractive.sdk.util.C3670q;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class InneractiveAdViewUnitController extends C2856p<InneractiveAdViewEventsListener> implements InneractiveFullscreenAdActivity.FullScreenRendererProvider, C2840i.C2844a {
    public static final int DISABLED_REFRESH_INTERVAL = -1;

    /* renamed from: a */
    Set<InneractiveAdRenderer> f6885a;

    /* renamed from: b */
    boolean f6886b;

    /* renamed from: c */
    private View f6887c;

    /* renamed from: d */
    private int f6888d;
    protected int mAdContentHeight;
    protected int mAdContentWidth;

    public boolean supportsRefresh() {
        return true;
    }

    public InneractiveAdViewUnitController() {
        this.f6886b = false;
        this.mAdContentWidth = -1;
        this.mAdContentHeight = -1;
        this.f6888d = 0;
        this.f6885a = new HashSet();
    }

    public InneractiveAdViewUnitController(int i) {
        this();
        if (i >= 30) {
            IAlog.m9034b("InneractiveAdViewUnitController: Overriding remote config refresh interval to: %d", Integer.valueOf(i));
            this.f6888d = i;
            return;
        }
        IAlog.m9034b("InneractiveAdViewUnitController: Overriding remote config refresh interval - value too low. Setting to default: %d -> %d", Integer.valueOf(i), 30);
        this.f6888d = 30;
    }

    public InneractiveAdViewUnitController(boolean z) {
        this();
        if (z) {
            this.f6888d = -1;
        }
    }

    public boolean supports(InneractiveAdSpot inneractiveAdSpot) {
        C2809u h = inneractiveAdSpot.getAdContent().mo18131h();
        if (h.mo18067d() != null) {
            return false;
        }
        C2801o h2 = h.mo18071h();
        if (h2 != null) {
            if (UnitDisplayType.BANNER.equals(h2.mo18057a()) || UnitDisplayType.MRECT.equals(h2.mo18057a())) {
                return true;
            }
            if (UnitDisplayType.INTERSTITIAL.equals(h2.mo18057a())) {
                if (!inneractiveAdSpot.getCurrentProcessedRequest().getAllowFullscreen()) {
                    return true;
                }
                return false;
            }
        }
        C2811w g = h.mo18070g();
        if (g == null || (!UnitDisplayType.LANDSCAPE.equals(g.mo18080h()) && !UnitDisplayType.SQUARE.equals(g.mo18080h()) && !UnitDisplayType.MRECT.equals(g.mo18080h()))) {
            return false;
        }
        return true;
    }

    public C2900c getFullscreenRenderer() {
        C2900c a = C2730d.C2732b.f6417a.mo17971a((InneractiveAdSpot) C3670q.m9152a(this.mAdSpot));
        this.f6885a.add(a);
        return a;
    }

    public InneractiveContentController getSelectedContentController() {
        return this.mSelectedContentController;
    }

    public void destroy() {
        this.f6886b = true;
        for (InneractiveAdRenderer destroy : new HashSet(this.f6885a)) {
            destroy.destroy();
        }
        this.f6885a.clear();
        this.f6887c = null;
        super.destroy();
    }

    public void bindView(ViewGroup viewGroup) {
        IAlog.m9034b("%sPPPP bindView called with parent: %s", logPrefix(), viewGroup);
        InneractiveAdSpot adSpot = getAdSpot();
        if (adSpot == null) {
            IAlog.m9036d("InneractiveFullscreenUnitController was not attached to an ad spot", new Object[0]);
            return;
        }
        IAlog.m9034b("%sPPPP bindView spot is %s", logPrefix(), adSpot);
        for (InneractiveAdRenderer inneractiveAdRenderer : new HashSet(this.f6885a)) {
            if (inneractiveAdRenderer instanceof C2899b) {
                C2899b bVar = (C2899b) inneractiveAdRenderer;
                if (bVar.mo18233a((View) viewGroup)) {
                    bVar.mo18237d();
                    IAlog.m9034b("%sPPPP bindAdToRenderer returning an already attached renderer %s", logPrefix(), bVar);
                    return;
                }
            }
        }
        this.f6887c = viewGroup;
        C2899b a = C2724b.C2726b.f6413a.mo17961a(adSpot);
        int i = this.f6888d;
        if (i != 0) {
            a.mo18231a(i);
        }
        if (a != null) {
            a.initialize(adSpot);
            selectContentController();
            a.mo18232a(viewGroup);
            this.f6885a.add(a);
            IAlog.m9034b("%sPPPP bindView created renderer %s", logPrefix(), a);
            return;
        }
        IAlog.m9036d("%sCould not find a renderer for the given spot! Did you add the appropriate module to your project?", logPrefix());
    }

    public void unbindView(View view) {
        if (this.f6887c != view) {
            IAlog.m9036d("%s unbindView invoked with incorrect view, was - %s received - %s", logPrefix(), this.f6887c, view);
        } else {
            this.f6887c = null;
        }
        IAlog.m9034b("%sPPPP unbindView called with %s", logPrefix(), view);
        IAlog.m9034b("%sPPPP spot is %s", logPrefix(), this.mAdSpot);
        for (InneractiveAdRenderer inneractiveAdRenderer : new HashSet(this.f6885a)) {
            if (inneractiveAdRenderer instanceof C2899b) {
                C2899b bVar = (C2899b) inneractiveAdRenderer;
                if (bVar.mo18233a(view)) {
                    IAlog.m9034b("%sPPPP unbindView unbinding renderer %s", logPrefix(), inneractiveAdRenderer);
                    bVar.mo18238e();
                    this.f6885a.remove(bVar);
                    return;
                }
            }
        }
    }

    public void refreshAd() {
        IAlog.m9034b("InneractiveFullscreenUnitController refreshAd called", new Object[0]);
        InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) C3670q.m9152a(this.mAdSpot);
        if (inneractiveAdSpot != null && (inneractiveAdSpot instanceof C2854n)) {
            ((C2854n) inneractiveAdSpot).mo18155a(this);
        }
    }

    public void onAdRefreshed(InneractiveAdSpot inneractiveAdSpot) {
        C2899b bVar;
        Iterator it = new HashSet(this.f6885a).iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar = null;
                break;
            }
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof C2899b) {
                bVar = (C2899b) inneractiveAdRenderer;
                if (bVar.mo18234a(inneractiveAdSpot.getAdContent())) {
                    break;
                }
            }
        }
        if (bVar != null) {
            bVar.mo18232a((ViewGroup) null);
        } else {
            onAdRefreshFailed(inneractiveAdSpot, InneractiveErrorCode.SDK_INTERNAL_ERROR);
        }
        try {
            if (inneractiveAdSpot instanceof C2840i) {
                IAlog.m9030a(IAlog.f9871b, "%s %s", "AD_REFRESH", ((C2840i) inneractiveAdSpot).f6768g.f6709c.f7160f.mo18409k());
            }
        } catch (Exception unused) {
        }
        IAlog.m9034b("InneractiveFullscreenUnitController onAdRefreshed called", new Object[0]);
    }

    public void onAdRefreshFailed(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
        for (InneractiveAdRenderer inneractiveAdRenderer : new HashSet(this.f6885a)) {
            if (inneractiveAdRenderer instanceof C2899b) {
                ((C2899b) inneractiveAdRenderer).mo18236c();
                return;
            }
        }
    }

    public void unbindFullscreenRenderer(C2900c cVar) {
        IAlog.m9034b("%sremoving full screen ad renderer %s", logPrefix(), cVar);
        Set<InneractiveAdRenderer> set = this.f6885a;
        if (set != null) {
            set.remove(cVar);
        }
        if (!this.f6886b) {
            for (InneractiveAdRenderer inneractiveAdRenderer : new HashSet(this.f6885a)) {
                if (inneractiveAdRenderer instanceof C2899b) {
                    ((C2899b) inneractiveAdRenderer).mo18239f();
                    if (!(this.mEventsListener == null || this.mAdSpot == null || this.mAdSpot.get() == null)) {
                        ((InneractiveAdViewEventsListener) this.mEventsListener).onAdCollapsed((InneractiveAdSpot) this.mAdSpot.get());
                    }
                }
            }
        }
    }

    public boolean canRefreshAd() {
        if (!supportsRefresh()) {
            return false;
        }
        for (InneractiveAdRenderer canRefreshAd : this.f6885a) {
            if (!canRefreshAd.canRefreshAd()) {
                return false;
            }
        }
        return true;
    }

    public int getAdContentWidth() {
        int g;
        for (InneractiveAdRenderer next : this.f6885a) {
            if ((next instanceof C2899b) && (g = ((C2899b) next).mo18240g()) > 0) {
                return g;
            }
        }
        return this.mAdContentWidth;
    }

    public int getAdContentHeight() {
        int h;
        for (InneractiveAdRenderer next : this.f6885a) {
            if ((next instanceof C2899b) && (h = ((C2899b) next).mo18241h()) > 0) {
                return h;
            }
        }
        return this.mAdContentHeight;
    }
}
