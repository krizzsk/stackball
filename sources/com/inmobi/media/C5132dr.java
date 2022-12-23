package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.ErrorType;
import com.iab.omid.library.inmobi.adsession.Owner;
import com.iab.omid.library.inmobi.adsession.video.InteractionType;
import com.iab.omid.library.inmobi.adsession.video.PlayerState;
import com.iab.omid.library.inmobi.adsession.video.VastProperties;
import com.iab.omid.library.inmobi.adsession.video.VideoEvents;

/* renamed from: com.inmobi.media.dr */
/* compiled from: OmidAdSessionManagerImpl */
public final class C5132dr implements C5131dq {

    /* renamed from: a */
    private AdSessionContext f11778a;

    /* renamed from: b */
    private final boolean f11779b;

    /* renamed from: c */
    private String f11780c;

    /* renamed from: d */
    private byte f11781d;

    /* renamed from: e */
    private AdSession f11782e;

    /* renamed from: f */
    private C5130dp f11783f;

    public C5132dr(String str, AdSessionContext adSessionContext) {
        this(str, adSessionContext, false);
    }

    public C5132dr(String str, AdSessionContext adSessionContext, boolean z) {
        this.f11781d = 0;
        this.f11780c = str;
        this.f11778a = adSessionContext;
        this.f11779b = z;
    }

    /* renamed from: a */
    private static boolean m11730a(byte b, byte b2) {
        if (b == b2) {
            return true;
        }
        C5275fn a = C5275fn.m12068a();
        a.mo40590a(new C5308gk(new Exception("Omid AdSession State Error currentState :: " + b + ", expectedState :: " + b2)));
        return false;
    }

    /* renamed from: a */
    public final void mo40410a(int i, int i2, float f, VastProperties vastProperties) {
        if (m11730a(this.f11781d, (byte) 2)) {
            if (i == 0) {
                this.f11783f.mo40407a();
            } else if (i == 17) {
                ErrorType errorType = ErrorType.VIDEO;
                if (m11730a(this.f11781d, (byte) 2)) {
                    this.f11782e.error(errorType, "Unknown Player error");
                }
            }
            C5130dp dpVar = this.f11783f;
            if (dpVar.f11776a != null) {
                switch (i) {
                    case 1:
                        dpVar.f11776a.playerStateChange(PlayerState.FULLSCREEN);
                        return;
                    case 2:
                        dpVar.f11776a.playerStateChange(PlayerState.NORMAL);
                        return;
                    case 4:
                        dpVar.f11776a.adUserInteraction(InteractionType.CLICK);
                        return;
                    case 5:
                        dpVar.f11776a.loaded(vastProperties);
                        return;
                    case 6:
                        dpVar.f11776a.start((float) i2, f);
                        return;
                    case 7:
                        dpVar.f11776a.pause();
                        return;
                    case 8:
                        dpVar.f11776a.resume();
                        return;
                    case 9:
                        dpVar.f11776a.firstQuartile();
                        return;
                    case 10:
                        dpVar.f11776a.midpoint();
                        return;
                    case 11:
                        dpVar.f11776a.thirdQuartile();
                        return;
                    case 12:
                        dpVar.f11776a.complete();
                        return;
                    case 13:
                    case 14:
                        VideoEvents videoEvents = dpVar.f11776a;
                        if (13 == i) {
                            f = 0.0f;
                        }
                        videoEvents.volumeChange(f);
                        return;
                    case 15:
                        dpVar.f11776a.skipped();
                        return;
                    case 16:
                        dpVar.f11776a.resume();
                        return;
                    case 18:
                        dpVar.f11776a.adUserInteraction(InteractionType.INVITATION_ACCEPTED);
                        return;
                    default:
                        return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo40409a(int i) {
        if (m11730a(this.f11781d, (byte) 2) && i == 0) {
            this.f11783f.mo40407a();
        }
    }

    /* renamed from: a */
    private void m11728a(View view) {
        if (m11730a(this.f11781d, (byte) 1)) {
            this.f11782e.addFriendlyObstruction(view);
        }
    }

    /* renamed from: a */
    public final void mo40408a() {
        if (m11730a(this.f11781d, (byte) 2)) {
            this.f11782e.finish();
            this.f11782e = null;
            this.f11781d = 3;
        }
    }

    /* renamed from: a */
    public final void mo40412a(AdSessionContext adSessionContext) {
        if (adSessionContext != null) {
            this.f11778a = adSessionContext;
        }
    }

    /* renamed from: a */
    private void m11729a(View view, ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (!childAt.equals(view)) {
                m11728a(childAt);
                if (childAt instanceof ViewGroup) {
                    ViewGroup viewGroup2 = (ViewGroup) childAt;
                    if (viewGroup2.getChildCount() > 0) {
                        m11729a(view, viewGroup2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo40411a(View view, View[] viewArr, View view2) {
        if (this.f11782e == null) {
            boolean z = this.f11779b;
            Owner owner = Owner.JAVASCRIPT;
            String str = this.f11780c;
            char c = 65535;
            switch (str.hashCode()) {
                case -2139264536:
                    if (str.equals("native_display_ad")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1329992236:
                    if (str.equals("html_display_ad")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1191784049:
                    if (str.equals("native_video_ad")) {
                        c = 0;
                        break;
                    }
                    break;
                case 538665083:
                    if (str.equals("html_video_ad")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            Owner owner2 = null;
            if (c == 0) {
                owner = Owner.NATIVE;
                owner2 = Owner.NATIVE;
            } else if (c == 1) {
                owner = Owner.NATIVE;
            } else if (c == 2) {
                owner = Owner.JAVASCRIPT;
                owner2 = Owner.JAVASCRIPT;
            } else if (c == 3) {
                owner = Owner.JAVASCRIPT;
            }
            AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(owner, owner2, z), this.f11778a);
            this.f11782e = createAdSession;
            this.f11783f = new C5130dp(createAdSession, this.f11780c);
            this.f11781d = 1;
        }
        if (m11730a(this.f11781d, (byte) 1)) {
            this.f11782e.registerAdView(view);
        }
        if (viewArr != null) {
            for (View a : viewArr) {
                m11728a(a);
            }
        }
        if (!(view2 == null || view == null || !(view2 instanceof ViewGroup))) {
            m11729a(view, (ViewGroup) view2);
        }
        if (m11730a(this.f11781d, (byte) 1)) {
            this.f11782e.start();
            this.f11781d = 2;
        }
    }
}
