package com.moat.analytics.mobile.inm;

import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.moat.analytics.mobile.inm.C7233g;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.moat.analytics.mobile.inm.c */
abstract class C7228c extends C7227b {

    /* renamed from: g */
    static final MoatAdEventType[] f18113g = {MoatAdEventType.AD_EVT_FIRST_QUARTILE, MoatAdEventType.AD_EVT_MID_POINT, MoatAdEventType.AD_EVT_THIRD_QUARTILE};

    /* renamed from: h */
    final Map<MoatAdEventType, Integer> f18114h;

    /* renamed from: i */
    final Handler f18115i;

    /* renamed from: j */
    Map<String, String> f18116j;

    /* renamed from: k */
    WeakReference<View> f18117k;

    /* renamed from: l */
    private final Set<MoatAdEventType> f18118l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public VideoTrackerListener f18119m;

    /* renamed from: n */
    private boolean f18120n;

    /* renamed from: o */
    private Double f18121o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C7233g f18122p;

    /* renamed from: q */
    private final String f18123q;

    C7228c(String str) {
        super((View) null, false, true);
        C7261p.m18544a(3, "BaseVideoTracker", (Object) this, "Initializing.");
        this.f18123q = str;
        C7233g gVar = new C7233g(C7221a.m18375a(), C7233g.C7238a.f18139b);
        this.f18122p = gVar;
        super.mo49339a(gVar.f18128b);
        try {
            super.mo49338a(this.f18122p.f18127a);
        } catch (C7252m e) {
            this.f18102a = e;
        }
        this.f18114h = new HashMap();
        this.f18118l = new HashSet();
        this.f18115i = new Handler();
        this.f18120n = false;
        this.f18121o = Double.valueOf(1.0d);
    }

    /* renamed from: a */
    private static boolean m18411a(MoatAdEventType moatAdEventType) {
        return moatAdEventType == MoatAdEventType.AD_EVT_COMPLETE || moatAdEventType == MoatAdEventType.AD_EVT_STOPPED || moatAdEventType == MoatAdEventType.AD_EVT_SKIPPED;
    }

    /* renamed from: b */
    private void m18412b(MoatAdEvent moatAdEvent) {
        JSONObject a = mo49355a(moatAdEvent);
        C7261p.m18544a(3, "BaseVideoTracker", (Object) this, String.format("Received event: %s", new Object[]{a.toString()}));
        C7261p.m18547a("[SUCCESS] ", mo49337a() + String.format(" Received event: %s", new Object[]{a.toString()}));
        if (mo49346e() && this.f18104c != null) {
            this.f18104c.mo49392a(this.f18122p.f18129c, a);
            if (!this.f18118l.contains(moatAdEvent.f18086d)) {
                this.f18118l.add(moatAdEvent.f18086d);
                VideoTrackerListener videoTrackerListener = this.f18119m;
                if (videoTrackerListener != null) {
                    videoTrackerListener.onVideoEventReported(moatAdEvent.f18086d);
                }
            }
        }
        MoatAdEventType moatAdEventType = moatAdEvent.f18086d;
        if (m18411a(moatAdEventType)) {
            this.f18114h.put(moatAdEventType, 1);
            if (this.f18104c != null) {
                this.f18104c.mo49396c((C7227b) this);
            }
            mo49362l();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONObject mo49355a(MoatAdEvent moatAdEvent) {
        if (Double.isNaN(moatAdEvent.f18085c.doubleValue())) {
            moatAdEvent.f18085c = this.f18121o;
        }
        return new JSONObject(moatAdEvent.mo49274a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo49341a(List<String> list) {
        if (this.f18116j == null) {
            list.add("Null adIds object");
        }
        if (list.isEmpty()) {
            super.mo49341a(list);
            return;
        }
        throw new C7252m(TextUtils.join(" and ", list));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo49356a(Integer num, Integer num2) {
        return ((double) Math.abs(num2.intValue() - num.intValue())) <= Math.min(750.0d, ((double) num2.intValue()) * 0.05d);
    }

    /* renamed from: a */
    public boolean mo49357a(Map<String, String> map, View view) {
        try {
            mo49343c();
            mo49345d();
            if (view == null) {
                C7261p.m18544a(3, "BaseVideoTracker", (Object) this, "trackVideoAd received null video view instance");
            }
            this.f18116j = map;
            this.f18117k = new WeakReference<>(view);
            mo49342b();
            String format = String.format("trackVideoAd tracking ids: %s | view: %s", new Object[]{new JSONObject(map).toString(), C7261p.m18542a(view)});
            C7261p.m18544a(3, "BaseVideoTracker", (Object) this, format);
            C7261p.m18547a("[SUCCESS] ", mo49337a() + " " + format);
            if (this.f18105d != null) {
                this.f18105d.onTrackingStarted(mo49348g());
            }
            return true;
        } catch (Exception e) {
            mo49340a("trackVideoAd", e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo49342b() {
        super.changeTargetView((View) this.f18117k.get());
        super.mo49342b();
        Map<String, Object> i = mo49359i();
        Integer num = (Integer) i.get("width");
        Integer num2 = (Integer) i.get("height");
        Integer num3 = (Integer) i.get("duration");
        C7261p.m18544a(3, "BaseVideoTracker", (Object) this, String.format(Locale.ROOT, "Player metadata: height = %d, width = %d, duration = %d", new Object[]{num2, num, num3}));
        this.f18122p.mo49370a(this.f18123q, this.f18116j, num, num2, num3);
    }

    public void changeTargetView(View view) {
        C7261p.m18544a(3, "BaseVideoTracker", (Object) this, "changing view to " + C7261p.m18542a(view));
        this.f18117k = new WeakReference<>(view);
        try {
            super.changeTargetView(view);
        } catch (Exception e) {
            C7252m.m18508a(e);
        }
    }

    public void dispatchEvent(MoatAdEvent moatAdEvent) {
        try {
            m18412b(moatAdEvent);
        } catch (Exception e) {
            C7252m.m18508a(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract Map<String, Object> mo49359i();

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Double mo49360j() {
        return Double.valueOf(mo49361k().doubleValue() * C7264s.m18552a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Double mo49361k() {
        return this.f18121o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo49362l() {
        if (!this.f18120n) {
            this.f18120n = true;
            this.f18115i.postDelayed(new Runnable() {
                public void run() {
                    try {
                        C7261p.m18544a(3, "BaseVideoTracker", (Object) this, "Shutting down.");
                        C7228c.this.f18122p.mo49368a();
                        VideoTrackerListener unused = C7228c.this.f18119m = null;
                    } catch (Exception e) {
                        C7252m.m18508a(e);
                    }
                }
            }, 500);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo49363m() {
        return this.f18114h.containsKey(MoatAdEventType.AD_EVT_COMPLETE) || this.f18114h.containsKey(MoatAdEventType.AD_EVT_STOPPED) || this.f18114h.containsKey(MoatAdEventType.AD_EVT_SKIPPED);
    }

    public void removeVideoListener() {
        this.f18119m = null;
    }

    public void setPlayerVolume(Double d) {
        Double j = mo49360j();
        if (!d.equals(this.f18121o)) {
            C7261p.m18544a(3, "BaseVideoTracker", (Object) this, String.format(Locale.ROOT, "player volume changed to %f ", new Object[]{d}));
            this.f18121o = d;
            if (!j.equals(mo49360j())) {
                dispatchEvent(new MoatAdEvent(MoatAdEventType.AD_EVT_VOLUME_CHANGE, MoatAdEvent.f18082a, this.f18121o));
            }
        }
    }

    public void setVideoListener(VideoTrackerListener videoTrackerListener) {
        this.f18119m = videoTrackerListener;
    }

    public void stopTracking() {
        try {
            super.stopTracking();
            mo49362l();
            if (this.f18119m != null) {
                this.f18119m = null;
            }
        } catch (Exception e) {
            C7252m.m18508a(e);
        }
    }
}
