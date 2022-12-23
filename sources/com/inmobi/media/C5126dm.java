package com.inmobi.media;

import android.app.Application;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.moat.analytics.mobile.inm.WebAdTracker;
import com.tapjoy.TJAdUnitConstants;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.inmobi.media.dm */
/* compiled from: MoatTrackedHtmlAd */
public class C5126dm extends C5097cy {

    /* renamed from: d */
    private static final String f11759d = C5126dm.class.getSimpleName();

    /* renamed from: e */
    private final WeakReference<Context> f11760e;

    /* renamed from: f */
    private final C5098cz f11761f;

    /* renamed from: g */
    private final Map<String, Object> f11762g;

    /* renamed from: h */
    private WebAdTracker f11763h;

    public C5126dm(C5331h hVar, Context context, C5098cz czVar, Map<String, Object> map) {
        super(hVar);
        this.f11760e = new WeakReference<>(context);
        this.f11761f = czVar;
        this.f11762g = map;
    }

    /* renamed from: c */
    public final View mo40372c() {
        return this.f11761f.mo40372c();
    }

    /* renamed from: a */
    public final View mo40365a(View view, ViewGroup viewGroup, boolean z) {
        return this.f11761f.mo40365a(view, viewGroup, z);
    }

    /* renamed from: b */
    public final View mo40371b() {
        return this.f11761f.mo40371b();
    }

    /* renamed from: a */
    public final void mo40370a(View... viewArr) {
        m11694f();
        this.f11761f.mo40370a(viewArr);
    }

    /* renamed from: f */
    private void m11694f() {
        try {
            Application d = C5314go.m12206d();
            if (this.f11690c.viewability.moatEnabled && d != null && ((Boolean) this.f11762g.get(TJAdUnitConstants.String.ENABLED)).booleanValue()) {
                if (this.f11763h == null) {
                    if (this.f11688a instanceof C5397j) {
                        C5397j jVar = (C5397j) this.f11688a;
                        if (jVar.mo40802v() != null) {
                            this.f11763h = C5125dl.m11692a(d, (WebView) jVar.mo40802v());
                        }
                    } else {
                        View b = this.f11761f.mo40371b();
                        if (b != null) {
                            this.f11763h = C5125dl.m11692a(d, (WebView) b);
                        }
                    }
                }
                if (this.f11763h != null) {
                    this.f11763h.startTracking();
                }
            }
        } catch (Exception e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
        }
    }

    /* renamed from: d */
    public final void mo40373d() {
        try {
            m11695g();
        } catch (Exception e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
        } catch (Throwable th) {
            this.f11761f.mo40373d();
            throw th;
        }
        this.f11761f.mo40373d();
    }

    /* renamed from: g */
    private void m11695g() {
        WebAdTracker webAdTracker = this.f11763h;
        if (webAdTracker != null) {
            webAdTracker.stopTracking();
        }
    }

    /* renamed from: a */
    public final void mo40367a(byte b) {
        this.f11761f.mo40367a(b);
    }

    /* renamed from: a */
    public final void mo40368a(Context context, byte b) {
        if (b == 0) {
            m11694f();
        } else if (b == 1) {
            m11695g();
        }
        this.f11761f.mo40368a(context, b);
    }

    /* renamed from: e */
    public final void mo40374e() {
        this.f11763h = null;
        this.f11760e.clear();
        super.mo40374e();
        this.f11761f.mo40374e();
    }
}
