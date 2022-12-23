package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.VerificationScriptResource;
import com.iab.omid.library.inmobi.adsession.video.VastProperties;
import com.inmobi.media.C5098cz;
import com.inmobi.media.C5139dx;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.inmobi.media.dw */
/* compiled from: OmidTrackedNativeV2VideoAd */
public class C5138dw extends C5097cy {

    /* renamed from: d */
    private static final String f11798d = C5138dw.class.getSimpleName();

    /* renamed from: e */
    private final VastProperties f11799e;

    /* renamed from: f */
    private final WeakReference<Context> f11800f;

    /* renamed from: g */
    private final C5098cz f11801g;

    /* renamed from: h */
    private C5131dq f11802h;

    /* renamed from: i */
    private WeakReference<View> f11803i;

    public C5138dw(Context context, C5098cz czVar, C5410k kVar, C5131dq dqVar, VastProperties vastProperties) {
        super(kVar);
        this.f11800f = new WeakReference<>(context);
        this.f11801g = czVar;
        this.f11802h = dqVar;
        this.f11799e = vastProperties;
    }

    /* renamed from: c */
    public final View mo40372c() {
        return this.f11801g.mo40372c();
    }

    /* renamed from: a */
    public final View mo40365a(View view, ViewGroup viewGroup, boolean z) {
        return this.f11801g.mo40365a(view, viewGroup, z);
    }

    /* renamed from: b */
    public final View mo40371b() {
        return this.f11801g.mo40371b();
    }

    /* renamed from: a */
    public final C5098cz.C5099a mo40366a() {
        return this.f11801g.mo40366a();
    }

    /* renamed from: a */
    public final void mo40368a(Context context, byte b) {
        this.f11801g.mo40368a(context, b);
    }

    /* renamed from: e */
    public final void mo40374e() {
        super.mo40374e();
        try {
            this.f11800f.clear();
            if (this.f11803i != null) {
                this.f11803i.clear();
            }
            this.f11802h = null;
        } catch (Exception e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
        } catch (Throwable th) {
            this.f11801g.mo40374e();
            throw th;
        }
        this.f11801g.mo40374e();
    }

    /* renamed from: a */
    public static C5131dq m11758a(List<VerificationScriptResource> list, String str) {
        return new C5132dr("native_video_ad", C5139dx.C5140a.f11804a.mo40415a(list, str));
    }

    /* renamed from: a */
    public final void mo40370a(View... viewArr) {
        C5197ep epVar;
        try {
            if (this.f11690c.viewability.omidConfig.omidEnabled && C5139dx.C5140a.f11804a.mo40417a() && (this.f11688a instanceof C5410k) && (epVar = (C5197ep) this.f11688a.getVideoContainerView()) != null) {
                WeakReference<View> weakReference = new WeakReference<>(epVar);
                this.f11803i = weakReference;
                this.f11802h.mo40411a((View) weakReference.get(), (View[]) null, this.f11801g.mo40371b());
                this.f11802h.hashCode();
            }
        } catch (Exception e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
        } catch (Throwable th) {
            this.f11801g.mo40370a(viewArr);
            throw th;
        }
        this.f11801g.mo40370a(viewArr);
    }

    /* renamed from: d */
    public final void mo40373d() {
        try {
            if (!((C5410k) this.f11688a).mo40785l()) {
                this.f11802h.mo40408a();
                this.f11802h.hashCode();
            }
        } catch (Exception e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
        } catch (Throwable th) {
            this.f11801g.mo40373d();
            throw th;
        }
        this.f11801g.mo40373d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0062, code lost:
        if (((com.inmobi.media.C5410k) r6.f11688a).mo40785l() != false) goto L_0x0064;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40367a(byte r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = 5
            r2 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r7 == r1) goto L_0x0054
            r1 = 6
            if (r7 == r1) goto L_0x0011
            r1 = 13
            if (r7 == r1) goto L_0x006c
            r1 = 14
            goto L_0x006a
        L_0x0011:
            com.inmobi.media.h r1 = r6.f11688a     // Catch:{ Exception -> 0x0076 }
            boolean r1 = r1 instanceof com.inmobi.media.C5410k     // Catch:{ Exception -> 0x0076 }
            if (r1 == 0) goto L_0x006a
            com.inmobi.media.h r1 = r6.f11688a     // Catch:{ Exception -> 0x0076 }
            android.view.View r1 = r1.getVideoContainerView()     // Catch:{ Exception -> 0x0076 }
            com.inmobi.media.ep r1 = (com.inmobi.media.C5197ep) r1     // Catch:{ Exception -> 0x0076 }
            if (r1 == 0) goto L_0x006a
            com.inmobi.media.eo r0 = r1.getVideoView()     // Catch:{ Exception -> 0x0076 }
            int r0 = r0.getDuration()     // Catch:{ Exception -> 0x0076 }
            com.inmobi.media.eo r1 = r1.getVideoView()     // Catch:{ Exception -> 0x0076 }
            java.lang.Object r1 = r1.getTag()     // Catch:{ Exception -> 0x0076 }
            com.inmobi.media.bs r1 = (com.inmobi.media.C5031bs) r1     // Catch:{ Exception -> 0x0076 }
            java.util.Map<java.lang.String, java.lang.Object> r4 = r1.f11380v     // Catch:{ Exception -> 0x0076 }
            java.lang.String r5 = "currentMediaVolume"
            java.lang.Object r4 = r4.get(r5)     // Catch:{ Exception -> 0x0076 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ Exception -> 0x0076 }
            int r4 = r4.intValue()     // Catch:{ Exception -> 0x0076 }
            if (r4 <= 0) goto L_0x006c
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f11380v     // Catch:{ Exception -> 0x0076 }
            java.lang.String r4 = "lastMediaVolume"
            java.lang.Object r1 = r1.get(r4)     // Catch:{ Exception -> 0x0076 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x0076 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x0076 }
            if (r1 != 0) goto L_0x006c
            goto L_0x006a
        L_0x0054:
            com.inmobi.media.h r1 = r6.f11688a     // Catch:{ Exception -> 0x0076 }
            boolean r1 = r1 instanceof com.inmobi.media.C5410k     // Catch:{ Exception -> 0x0076 }
            if (r1 == 0) goto L_0x006a
            com.inmobi.media.h r1 = r6.f11688a     // Catch:{ Exception -> 0x0076 }
            com.inmobi.media.k r1 = (com.inmobi.media.C5410k) r1     // Catch:{ Exception -> 0x0076 }
            boolean r1 = r1.mo40785l()     // Catch:{ Exception -> 0x0076 }
            if (r1 == 0) goto L_0x006a
        L_0x0064:
            com.inmobi.media.cz r0 = r6.f11801g
            r0.mo40367a((byte) r7)
            return
        L_0x006a:
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x006c:
            com.inmobi.media.dq r1 = r6.f11802h     // Catch:{ Exception -> 0x0076 }
            com.iab.omid.library.inmobi.adsession.video.VastProperties r3 = r6.f11799e     // Catch:{ Exception -> 0x0076 }
            r1.mo40410a(r7, r0, r2, r3)     // Catch:{ Exception -> 0x0076 }
            goto L_0x0064
        L_0x0074:
            r0 = move-exception
            goto L_0x0084
        L_0x0076:
            r0 = move-exception
            com.inmobi.media.fn r1 = com.inmobi.media.C5275fn.m12068a()     // Catch:{ all -> 0x0074 }
            com.inmobi.media.gk r2 = new com.inmobi.media.gk     // Catch:{ all -> 0x0074 }
            r2.<init>(r0)     // Catch:{ all -> 0x0074 }
            r1.mo40590a((com.inmobi.media.C5308gk) r2)     // Catch:{ all -> 0x0074 }
            goto L_0x0064
        L_0x0084:
            com.inmobi.media.cz r1 = r6.f11801g
            r1.mo40367a((byte) r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5138dw.mo40367a(byte):void");
    }
}
