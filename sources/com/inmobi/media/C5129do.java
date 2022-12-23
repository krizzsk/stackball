package com.inmobi.media;

import android.app.Application;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.inmobi.media.C5220ev;
import com.inmobi.media.C5435p;
import com.moat.analytics.mobile.inm.MoatAdEvent;
import com.moat.analytics.mobile.inm.MoatAdEventType;
import com.moat.analytics.mobile.inm.ReactiveVideoTracker;
import com.tapjoy.TJAdUnitConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.do */
/* compiled from: MoatTrackedNativeVideoAd */
public class C5129do extends C5097cy {

    /* renamed from: d */
    private static final String f11770d = C5129do.class.getSimpleName();

    /* renamed from: e */
    private final WeakReference<Context> f11771e;

    /* renamed from: f */
    private ReactiveVideoTracker f11772f;

    /* renamed from: g */
    private Map<String, Object> f11773g;

    /* renamed from: h */
    private C5098cz f11774h;

    /* renamed from: i */
    private boolean f11775i = false;

    public C5129do(Context context, C5098cz czVar, C5410k kVar, Map<String, Object> map) {
        super(kVar);
        this.f11771e = new WeakReference<>(context);
        this.f11774h = czVar;
        this.f11773g = map;
        this.f11772f = (ReactiveVideoTracker) map.get("moatTracker");
    }

    /* renamed from: a */
    public final View mo40365a(View view, ViewGroup viewGroup, boolean z) {
        return this.f11774h.mo40365a(view, viewGroup, z);
    }

    /* renamed from: b */
    public final View mo40371b() {
        return this.f11774h.mo40371b();
    }

    /* renamed from: a */
    public final void mo40370a(View... viewArr) {
        try {
            Application d = C5314go.m12206d();
            C5220ev.C5234k kVar = this.f11690c.viewability;
            if (d != null && (this.f11688a instanceof C5410k) && kVar.moatEnabled && ((Boolean) this.f11773g.get(TJAdUnitConstants.String.ENABLED)).booleanValue() && this.f11772f == null) {
                ReactiveVideoTracker a = C5125dl.m11691a(d, (String) this.f11773g.get("partnerCode"));
                this.f11772f = a;
                this.f11773g.put("moatTracker", a);
                this.f11775i = true;
            }
        } catch (Exception e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
        } catch (Throwable th) {
            this.f11774h.mo40370a(viewArr);
            throw th;
        }
        this.f11774h.mo40370a(viewArr);
    }

    /* renamed from: a */
    public final void mo40367a(byte b) {
        try {
            if (this.f11772f != null) {
                this.f11772f.hashCode();
                switch (b) {
                    case 1:
                        this.f11772f.dispatchEvent(new MoatAdEvent(MoatAdEventType.AD_EVT_ENTER_FULLSCREEN));
                        break;
                    case 2:
                        this.f11772f.dispatchEvent(new MoatAdEvent(MoatAdEventType.AD_EVT_EXIT_FULLSCREEN));
                        break;
                    case 3:
                        this.f11772f.dispatchEvent(new MoatAdEvent(MoatAdEventType.AD_EVT_STOPPED));
                        break;
                    case 5:
                    case 16:
                        C5197ep epVar = (C5197ep) this.f11688a.getVideoContainerView();
                        if (!(epVar == null || this.f11772f == null)) {
                            C5184eo videoView = epVar.getVideoView();
                            if (!this.f11775i) {
                                this.f11772f.changeTargetView(epVar);
                                break;
                            } else {
                                ReactiveVideoTracker reactiveVideoTracker = this.f11772f;
                                HashMap<String, String> a = C5435p.C5454b.m12902a("level", "slicer", (JSONArray) this.f11773g.get("clientLevels"), (JSONArray) this.f11773g.get("clientSlicers"), (JSONObject) this.f11773g.get("zMoatExtras"));
                                a.put("zMoatVASTIDs", (String) this.f11773g.get("zMoatVASTIDs"));
                                reactiveVideoTracker.trackVideoAd(a, Integer.valueOf(videoView.getDuration()), epVar);
                                this.f11775i = false;
                                break;
                            }
                        }
                    case 6:
                        C5197ep epVar2 = (C5197ep) this.f11688a.getVideoContainerView();
                        if (epVar2 != null) {
                            this.f11772f.dispatchEvent(new MoatAdEvent(MoatAdEventType.AD_EVT_START, Integer.valueOf(epVar2.getVideoView().getMediaPlayer().getCurrentPosition())));
                            break;
                        }
                        break;
                    case 7:
                        this.f11772f.dispatchEvent(new MoatAdEvent(MoatAdEventType.AD_EVT_PAUSED));
                        break;
                    case 8:
                        this.f11772f.dispatchEvent(new MoatAdEvent(MoatAdEventType.AD_EVT_PLAYING));
                        break;
                    case 9:
                        this.f11772f.dispatchEvent(new MoatAdEvent(MoatAdEventType.AD_EVT_FIRST_QUARTILE));
                        break;
                    case 10:
                        this.f11772f.dispatchEvent(new MoatAdEvent(MoatAdEventType.AD_EVT_MID_POINT));
                        break;
                    case 11:
                        this.f11772f.dispatchEvent(new MoatAdEvent(MoatAdEventType.AD_EVT_THIRD_QUARTILE));
                        break;
                    case 12:
                        this.f11772f.dispatchEvent(new MoatAdEvent(MoatAdEventType.AD_EVT_COMPLETE));
                        break;
                    case 13:
                        this.f11772f.setPlayerVolume(MoatAdEvent.VOLUME_MUTED);
                        break;
                    case 14:
                        this.f11772f.setPlayerVolume(MoatAdEvent.VOLUME_UNMUTED);
                        break;
                    case 15:
                        this.f11772f.dispatchEvent(new MoatAdEvent(MoatAdEventType.AD_EVT_SKIPPED));
                        break;
                }
            }
        } catch (Exception e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
        } catch (Throwable th) {
            this.f11774h.mo40367a(b);
            throw th;
        }
        this.f11774h.mo40367a(b);
    }

    /* renamed from: a */
    public final void mo40368a(Context context, byte b) {
        this.f11774h.mo40368a(context, b);
    }

    /* renamed from: e */
    public final void mo40374e() {
        this.f11772f = null;
        this.f11771e.clear();
        super.mo40374e();
        this.f11774h.mo40374e();
    }

    /* renamed from: d */
    public final void mo40373d() {
        try {
            if (!((C5410k) this.f11688a).mo40785l() && this.f11772f != null) {
                this.f11772f.stopTracking();
            }
        } catch (Exception e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
        } catch (Throwable th) {
            this.f11774h.mo40373d();
            throw th;
        }
        this.f11774h.mo40373d();
    }
}
