package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.inmobi.media.C5139dx;

/* renamed from: com.inmobi.media.du */
/* compiled from: OmidTrackedHtmlAd */
public class C5136du extends C5097cy {

    /* renamed from: d */
    private static final String f11792d = C5136du.class.getSimpleName();

    /* renamed from: e */
    private final C5098cz f11793e;

    /* renamed from: f */
    private C5131dq f11794f;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0047  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.inmobi.media.C5131dq m11740a(java.lang.String r3, com.inmobi.media.C5415m r4, java.lang.String r5, boolean r6) {
        /*
            com.iab.omid.library.inmobi.adsession.AdSessionContext r4 = m11739a((com.inmobi.media.C5415m) r4, (java.lang.String) r5)
            int r5 = r3.hashCode()
            r0 = -284840886(0xffffffffef05ac4a, float:-4.136979E28)
            r1 = 3
            r2 = 2
            if (r5 == r0) goto L_0x002e
            r0 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r5 == r0) goto L_0x0024
            r0 = 1425678798(0x54fa21ce, float:8.5944718E12)
            if (r5 == r0) goto L_0x001a
            goto L_0x0038
        L_0x001a:
            java.lang.String r5 = "nonvideo"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0038
            r3 = 2
            goto L_0x0039
        L_0x0024:
            java.lang.String r5 = "video"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0038
            r3 = 3
            goto L_0x0039
        L_0x002e:
            java.lang.String r5 = "unknown"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0038
            r3 = 1
            goto L_0x0039
        L_0x0038:
            r3 = -1
        L_0x0039:
            if (r3 == r2) goto L_0x0047
            if (r3 == r1) goto L_0x003f
            r3 = 0
            goto L_0x004e
        L_0x003f:
            com.inmobi.media.dr r3 = new com.inmobi.media.dr
            java.lang.String r5 = "html_video_ad"
            r3.<init>(r5, r4, r6)
            goto L_0x004e
        L_0x0047:
            com.inmobi.media.dr r3 = new com.inmobi.media.dr
            java.lang.String r5 = "html_display_ad"
            r3.<init>(r5, r4)
        L_0x004e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5136du.m11740a(java.lang.String, com.inmobi.media.m, java.lang.String, boolean):com.inmobi.media.dq");
    }

    public C5136du(C5331h hVar, C5098cz czVar, C5131dq dqVar) {
        super(hVar);
        this.f11793e = czVar;
        this.f11794f = dqVar;
    }

    /* renamed from: c */
    public final View mo40372c() {
        return this.f11793e.mo40372c();
    }

    /* renamed from: a */
    public final View mo40365a(View view, ViewGroup viewGroup, boolean z) {
        return this.f11793e.mo40365a(view, viewGroup, z);
    }

    /* renamed from: b */
    public final View mo40371b() {
        return this.f11793e.mo40371b();
    }

    /* renamed from: d */
    public final void mo40373d() {
        try {
            this.f11794f.mo40408a();
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f11793e.mo40373d();
            throw th;
        }
        this.f11793e.mo40373d();
    }

    /* renamed from: a */
    public final void mo40367a(byte b) {
        this.f11793e.mo40367a(b);
    }

    /* renamed from: a */
    public final void mo40368a(Context context, byte b) {
        this.f11793e.mo40368a(context, b);
    }

    /* renamed from: e */
    public final void mo40374e() {
        super.mo40374e();
        try {
            this.f11794f = null;
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f11793e.mo40374e();
            throw th;
        }
        this.f11793e.mo40374e();
    }

    /* renamed from: a */
    public static AdSessionContext m11739a(C5415m mVar, String str) {
        if (mVar != null) {
            return C5139dx.C5140a.f11804a.mo40414a((WebView) mVar, str);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo40370a(View... viewArr) {
        View view;
        try {
            if (this.f11690c.viewability.omidConfig.omidEnabled && C5139dx.C5140a.f11804a.mo40417a()) {
                if (this.f11688a instanceof C5397j) {
                    view = ((C5397j) this.f11688a).mo40802v();
                } else {
                    view = this.f11793e.mo40371b() instanceof WebView ? (WebView) this.f11793e.mo40371b() : null;
                }
                if (view != null) {
                    this.f11794f.mo40411a(view, viewArr, (View) null);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f11793e.mo40370a(viewArr);
            throw th;
        }
        this.f11793e.mo40370a(viewArr);
    }
}
