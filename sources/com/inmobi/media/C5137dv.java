package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.VerificationScriptResource;
import com.inmobi.media.C5139dx;
import java.util.List;

/* renamed from: com.inmobi.media.dv */
/* compiled from: OmidTrackedNativeDisplayAd */
public class C5137dv extends C5097cy {

    /* renamed from: d */
    private static final String f11795d = C5137dv.class.getSimpleName();

    /* renamed from: e */
    private final C5098cz f11796e;

    /* renamed from: f */
    private C5131dq f11797f;

    public C5137dv(C5331h hVar, C5098cz czVar, C5131dq dqVar) {
        super(hVar);
        this.f11796e = czVar;
        this.f11797f = dqVar;
    }

    /* renamed from: c */
    public final View mo40372c() {
        return this.f11796e.mo40372c();
    }

    /* renamed from: a */
    public final View mo40365a(View view, ViewGroup viewGroup, boolean z) {
        return this.f11796e.mo40365a(view, viewGroup, z);
    }

    /* renamed from: b */
    public final View mo40371b() {
        return this.f11796e.mo40371b();
    }

    /* renamed from: d */
    public final void mo40373d() {
        try {
            this.f11797f.mo40408a();
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f11796e.mo40373d();
            throw th;
        }
        this.f11796e.mo40373d();
    }

    /* renamed from: a */
    public final void mo40367a(byte b) {
        try {
            this.f11797f.mo40409a((int) b);
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f11796e.mo40367a(b);
            throw th;
        }
        this.f11796e.mo40367a(b);
    }

    /* renamed from: a */
    public final void mo40368a(Context context, byte b) {
        this.f11796e.mo40368a(context, b);
    }

    /* renamed from: e */
    public final void mo40374e() {
        super.mo40374e();
        try {
            this.f11797f = null;
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f11796e.mo40374e();
            throw th;
        }
        this.f11796e.mo40374e();
    }

    /* renamed from: a */
    public static C5131dq m11749a(List<VerificationScriptResource> list, String str) {
        return new C5132dr("native_display_ad", C5139dx.C5140a.f11804a.mo40415a(list, str));
    }

    /* renamed from: a */
    public final void mo40370a(View... viewArr) {
        View i;
        try {
            if (this.f11690c.viewability.omidConfig.omidEnabled && C5139dx.C5140a.f11804a.mo40417a() && (this.f11688a instanceof C5397j) && (i = ((C5397j) this.f11688a).mo40782i()) != null) {
                this.f11797f.mo40411a(i, (View[]) null, this.f11796e.mo40371b());
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f11796e.mo40370a(viewArr);
            throw th;
        }
        this.f11796e.mo40370a(viewArr);
    }
}
