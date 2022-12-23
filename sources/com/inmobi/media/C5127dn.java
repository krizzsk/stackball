package com.inmobi.media;

import android.app.Application;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.inmobi.media.C5098cz;
import com.inmobi.media.C5435p;
import com.moat.analytics.mobile.inm.NativeDisplayTracker;
import com.tapjoy.TJAdUnitConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.dn */
/* compiled from: MoatTrackedNativeV2DisplayAd */
public class C5127dn extends C5097cy {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String f11764d = C5127dn.class.getSimpleName();

    /* renamed from: e */
    private final WeakReference<Context> f11765e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public NativeDisplayTracker f11766f;

    /* renamed from: g */
    private Map<String, Object> f11767g;

    /* renamed from: h */
    private C5098cz f11768h;

    public C5127dn(Context context, C5098cz czVar, C5397j jVar, Map<String, Object> map) {
        super(jVar);
        this.f11765e = new WeakReference<>(context);
        this.f11768h = czVar;
        this.f11767g = map;
    }

    /* renamed from: c */
    public final View mo40372c() {
        return this.f11768h.mo40372c();
    }

    /* renamed from: a */
    public final View mo40365a(View view, ViewGroup viewGroup, boolean z) {
        return this.f11768h.mo40365a(view, viewGroup, z);
    }

    /* renamed from: b */
    public final View mo40371b() {
        return this.f11768h.mo40371b();
    }

    /* renamed from: a */
    public final C5098cz.C5099a mo40366a() {
        return this.f11768h.mo40366a();
    }

    /* renamed from: a */
    public final void mo40370a(View... viewArr) {
        try {
            View b = this.f11768h.mo40371b();
            if (b != null) {
                Application d = C5314go.m12206d();
                if (this.f11690c.viewability.moatEnabled && d != null && ((Boolean) this.f11767g.get(TJAdUnitConstants.String.ENABLED)).booleanValue()) {
                    if (this.f11766f == null) {
                        HashMap<String, String> a = C5435p.C5454b.m12902a("moatClientLevel", "moatClientSlicer", (JSONArray) this.f11767g.get("clientLevels"), (JSONArray) this.f11767g.get("clientSlicers"), (JSONObject) this.f11767g.get("zMoatExtras"));
                        a.put("zMoatIID", (String) this.f11767g.get("zMoatIID"));
                        this.f11766f = C5125dl.m11690a(d, (String) this.f11767g.get("partnerCode"), b, a);
                    }
                    b.setOnTouchListener(new View.OnTouchListener() {
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            C5127dn.this.f11766f.reportUserInteractionEvent(NativeDisplayTracker.MoatUserInteractionType.TOUCH);
                            String unused = C5127dn.this.f11764d;
                            C5127dn.this.f11766f.hashCode();
                            return true;
                        }
                    });
                    this.f11766f.startTracking();
                    this.f11767g.get("zMoatIID");
                }
            }
        } catch (Exception e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
        } catch (Throwable th) {
            this.f11768h.mo40370a(viewArr);
            throw th;
        }
        this.f11768h.mo40370a(viewArr);
    }

    /* renamed from: d */
    public final void mo40373d() {
        try {
            if (this.f11766f != null) {
                this.f11766f.stopTracking();
                this.f11767g.get("zMoatIID");
            }
        } catch (Exception e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
        } catch (Throwable th) {
            this.f11768h.mo40373d();
            throw th;
        }
        this.f11768h.mo40373d();
    }

    /* renamed from: a */
    public final void mo40367a(byte b) {
        if (4 == b) {
            try {
                this.f11766f.reportUserInteractionEvent(NativeDisplayTracker.MoatUserInteractionType.CLICK);
                this.f11766f.hashCode();
            } catch (Exception e) {
                C5275fn.m12068a().mo40590a(new C5308gk(e));
            } catch (Throwable th) {
                this.f11768h.mo40367a(b);
                throw th;
            }
        }
        this.f11768h.mo40367a(b);
    }

    /* renamed from: a */
    public final void mo40368a(Context context, byte b) {
        this.f11768h.mo40368a(context, b);
    }

    /* renamed from: e */
    public final void mo40374e() {
        this.f11766f = null;
        this.f11765e.clear();
        super.mo40374e();
        this.f11768h.mo40374e();
    }
}
