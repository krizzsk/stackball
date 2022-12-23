package com.inmobi.ads;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.ads.listeners.VideoEventListener;
import com.inmobi.media.C4927ad;
import com.inmobi.media.C5003az;
import com.inmobi.media.C5275fn;
import com.inmobi.media.C5308gk;
import com.inmobi.media.C5314go;
import com.inmobi.media.C5327gw;
import com.inmobi.media.C5343hf;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

public final class InMobiNative {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f11071a = InMobiNative.class.getSimpleName();

    /* renamed from: b */
    private C4927ad f11072b;

    /* renamed from: c */
    private NativeCallbacks f11073c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public NativeAdEventListener f11074d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public VideoEventListener f11075e;

    /* renamed from: f */
    private WeakReference<View> f11076f;

    /* renamed from: g */
    private boolean f11077g;

    /* renamed from: h */
    private C5003az f11078h = new C5003az();

    /* renamed from: i */
    private WeakReference<Context> f11079i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public LockScreenListener f11080j;

    public interface LockScreenListener {
        void onActionRequired(InMobiNative inMobiNative);
    }

    public InMobiNative(Context context, long j, NativeAdEventListener nativeAdEventListener) throws SdkNotInitializedException {
        if (C5314go.m12202b()) {
            this.f11078h.f11350a = j;
            this.f11079i = new WeakReference<>(context);
            this.f11074d = nativeAdEventListener;
            this.f11073c = new NativeCallbacks(this);
            this.f11072b = new C4927ad(this.f11073c);
            return;
        }
        throw new SdkNotInitializedException(f11071a);
    }

    public final void setListener(NativeAdEventListener nativeAdEventListener) {
        this.f11074d = nativeAdEventListener;
    }

    public final void setVideoEventListener(VideoEventListener videoEventListener) {
        this.f11075e = videoEventListener;
    }

    /* renamed from: a */
    private boolean m11048a(boolean z) {
        if (!z ? this.f11074d != null : !(this.f11072b == null && this.f11074d == null)) {
            WeakReference<Context> weakReference = this.f11079i;
            if (weakReference != null && weakReference.get() != null) {
                return true;
            }
            C5327gw.m12263a((byte) 1, f11071a, "Context supplied is null, your call is ignored.");
            return false;
        }
        C5327gw.m12263a((byte) 1, f11071a, "Listener supplied is null, your call is ignored.");
        return false;
    }

    public final void getSignals() {
        if (m11048a(false)) {
            this.f11073c.mo39885a();
            m11050b();
            this.f11072b.mo40009b((PublisherCallbacks) this.f11073c);
        }
    }

    public final void load(byte[] bArr) {
        if (m11048a(false)) {
            if (Build.VERSION.SDK_INT >= 29) {
                WeakReference<Context> weakReference = this.f11079i;
                C5343hf.m12334a(weakReference == null ? null : (Context) weakReference.get());
            }
            m11050b();
            this.f11073c.mo39885a();
            this.f11072b.mo40004a(bArr, (PublisherCallbacks) this.f11073c);
        }
    }

    /* renamed from: b */
    private void m11050b() {
        WeakReference<Context> weakReference = this.f11079i;
        Context context = weakReference == null ? null : (Context) weakReference.get();
        if (context != null) {
            this.f11072b.mo39967a(this.f11078h, context);
        }
    }

    public final void load() {
        try {
            if (m11048a(true)) {
                this.f11073c.mo39885a();
                if (this.f11077g) {
                    this.f11072b.mo40000a(this.f11072b.mo39975m(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
                    C5327gw.m12263a((byte) 1, f11071a, "You can call load() on an instance of InMobiNative only once if the ad request has been successful. Ignoring InMobiNative.load()");
                    return;
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    C5343hf.m12334a(this.f11079i == null ? null : (Context) this.f11079i.get());
                }
                m11050b();
                this.f11072b.mo39976n();
            }
        } catch (Exception e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
            C5327gw.m12263a((byte) 1, "InMobi", "Could not load ad; SDK encountered an unexpected error");
        }
    }

    public final void load(Context context) {
        if (m11048a(true)) {
            this.f11079i = new WeakReference<>(context);
            load();
        }
    }

    public final void showOnLockScreen(LockScreenListener lockScreenListener) {
        WeakReference<Context> weakReference = this.f11079i;
        if (weakReference == null || weakReference.get() == null) {
            C5327gw.m12263a((byte) 1, f11071a, "InMobiNative is not initialized. Provided context is null. Ignoring showOnLockScreen");
            return;
        }
        try {
            this.f11072b.mo39970b(this.f11078h, (Context) this.f11079i.get());
            this.f11080j = lockScreenListener;
        } catch (Exception unused) {
            C5327gw.m12263a((byte) 1, f11071a, "SDK encountered unexpected error in showOnLockScreen");
        }
    }

    public final void takeAction() {
        try {
            this.f11072b.mo39978p();
        } catch (Exception unused) {
            C5327gw.m12263a((byte) 1, f11071a, "SDK encountered unexpected error in takeAction");
        }
    }

    public final void pause() {
        try {
            this.f11072b.mo39979q();
        } catch (Exception unused) {
            C5327gw.m12263a((byte) 1, f11071a, "Could not pause ad; SDK encountered an unexpected error");
        }
    }

    public final void resume() {
        try {
            this.f11072b.mo39980r();
        } catch (Exception unused) {
            C5327gw.m12263a((byte) 1, f11071a, "Could not resume ad; SDK encountered an unexpected error");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d7 A[Catch:{ Exception -> 0x00db }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d8 A[Catch:{ Exception -> 0x00db }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getPrimaryViewOfWidth(android.content.Context r7, android.view.View r8, android.view.ViewGroup r9, int r10) {
        /*
            r6 = this;
            java.lang.String r0 = "InMobi"
            r1 = 1
            r2 = 0
            if (r7 != 0) goto L_0x000e
            java.lang.String r7 = f11071a     // Catch:{ Exception -> 0x00db }
            java.lang.String r8 = "View can not be rendered using null context"
            com.inmobi.media.C5327gw.m12263a((byte) r1, (java.lang.String) r7, (java.lang.String) r8)     // Catch:{ Exception -> 0x00db }
            return r2
        L_0x000e:
            com.inmobi.media.ad r3 = r6.f11072b     // Catch:{ Exception -> 0x00db }
            com.inmobi.media.p r3 = r3.mo39975m()     // Catch:{ Exception -> 0x00db }
            if (r3 != 0) goto L_0x0018
            r3 = r2
            goto L_0x0020
        L_0x0018:
            com.inmobi.media.ad r3 = r6.f11072b     // Catch:{ Exception -> 0x00db }
            com.inmobi.media.p r3 = r3.mo39975m()     // Catch:{ Exception -> 0x00db }
            com.inmobi.media.ab r3 = (com.inmobi.media.C4924ab) r3     // Catch:{ Exception -> 0x00db }
        L_0x0020:
            if (r3 != 0) goto L_0x002a
            java.lang.String r7 = f11071a     // Catch:{ Exception -> 0x00db }
            java.lang.String r8 = "InMobiNative is not initialized. Ignoring InMobiNative.getPrimaryView()"
            com.inmobi.media.C5327gw.m12263a((byte) r1, (java.lang.String) r7, (java.lang.String) r8)     // Catch:{ Exception -> 0x00db }
            return r2
        L_0x002a:
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference     // Catch:{ Exception -> 0x00db }
            r4.<init>(r7)     // Catch:{ Exception -> 0x00db }
            r6.f11079i = r4     // Catch:{ Exception -> 0x00db }
            r3.mo39952a(r7)     // Catch:{ Exception -> 0x00db }
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference     // Catch:{ Exception -> 0x00db }
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x00db }
            android.os.Looper r5 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x00db }
            java.lang.Thread r5 = r5.getThread()     // Catch:{ Exception -> 0x00db }
            if (r4 != r5) goto L_0x00b7
            boolean r4 = com.inmobi.media.C5346hh.m12351h()     // Catch:{ Exception -> 0x00db }
            if (r4 != 0) goto L_0x0050
            r3.mo39950Y()     // Catch:{ Exception -> 0x00db }
        L_0x004d:
            r9 = r2
            goto L_0x00ca
        L_0x0050:
            boolean r4 = r3.mo41005r()     // Catch:{ Exception -> 0x00db }
            if (r4 == 0) goto L_0x005f
            java.lang.String r8 = "Ad has expired, please create a new instance."
            com.inmobi.media.C5327gw.m12263a((byte) r1, (java.lang.String) r0, (java.lang.String) r8)     // Catch:{ Exception -> 0x00db }
            r3.mo39950Y()     // Catch:{ Exception -> 0x00db }
            goto L_0x004d
        L_0x005f:
            boolean r4 = r3.mo39951Z()     // Catch:{ Exception -> 0x00db }
            if (r4 != 0) goto L_0x0092
            byte r4 = r3.mo41001k()     // Catch:{ Exception -> 0x00db }
            r5 = 6
            if (r4 == r5) goto L_0x0092
            java.lang.String r8 = com.inmobi.media.C4924ab.f11134t     // Catch:{ Exception -> 0x00db }
            java.lang.String r9 = "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling getPrimaryView()."
            com.inmobi.media.C5327gw.m12263a((byte) r1, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ Exception -> 0x00db }
            java.lang.ref.WeakReference<android.view.View> r8 = r3.f11135u     // Catch:{ Exception -> 0x00db }
            if (r8 == 0) goto L_0x004d
            java.lang.ref.WeakReference<android.view.View> r8 = r3.f11135u     // Catch:{ Exception -> 0x00db }
            java.lang.Object r8 = r8.get()     // Catch:{ Exception -> 0x00db }
            android.view.View r8 = (android.view.View) r8     // Catch:{ Exception -> 0x00db }
            if (r8 == 0) goto L_0x004d
            android.view.View r9 = new android.view.View     // Catch:{ Exception -> 0x00db }
            android.content.Context r10 = com.inmobi.media.C5314go.m12203c()     // Catch:{ Exception -> 0x00db }
            r9.<init>(r10)     // Catch:{ Exception -> 0x00db }
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()     // Catch:{ Exception -> 0x00db }
            r9.setLayoutParams(r8)     // Catch:{ Exception -> 0x00db }
            goto L_0x00ca
        L_0x0092:
            com.inmobi.media.j r4 = r3.f12521h     // Catch:{ Exception -> 0x00db }
            if (r4 == 0) goto L_0x004d
            boolean r5 = r3.f11136v     // Catch:{ Exception -> 0x00db }
            r4.f12390s = r5     // Catch:{ Exception -> 0x00db }
            r4.f12389r = r10     // Catch:{ Exception -> 0x00db }
            com.inmobi.media.cz r10 = r4.getViewableAd()     // Catch:{ Exception -> 0x00db }
            android.view.View r8 = r10.mo40365a(r8, r9, r1)     // Catch:{ Exception -> 0x00db }
            java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference     // Catch:{ Exception -> 0x00db }
            r9.<init>(r8)     // Catch:{ Exception -> 0x00db }
            r3.f11135u = r9     // Catch:{ Exception -> 0x00db }
            android.os.Handler r9 = r3.f12523j     // Catch:{ Exception -> 0x00db }
            com.inmobi.media.ab$1 r4 = new com.inmobi.media.ab$1     // Catch:{ Exception -> 0x00db }
            r4.<init>(r10)     // Catch:{ Exception -> 0x00db }
            r9.post(r4)     // Catch:{ Exception -> 0x00db }
            r9 = r8
            goto L_0x00ca
        L_0x00b7:
            java.lang.String r8 = "Please ensure that you call getPrimaryView() on the UI thread"
            com.inmobi.media.C5327gw.m12263a((byte) r1, (java.lang.String) r0, (java.lang.String) r8)     // Catch:{ Exception -> 0x00db }
            com.inmobi.ads.InMobiAdRequestStatus r8 = new com.inmobi.ads.InMobiAdRequestStatus     // Catch:{ Exception -> 0x00db }
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r9 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.CALLED_FROM_WRONG_THREAD     // Catch:{ Exception -> 0x00db }
            r8.<init>(r9)     // Catch:{ Exception -> 0x00db }
            r9 = 0
            r10 = 44
            r3.mo40976a((com.inmobi.ads.InMobiAdRequestStatus) r8, (boolean) r9, (byte) r10)     // Catch:{ Exception -> 0x00db }
            goto L_0x004d
        L_0x00ca:
            r7.<init>(r9)     // Catch:{ Exception -> 0x00db }
            r6.f11076f = r7     // Catch:{ Exception -> 0x00db }
            java.lang.Object r7 = r7.get()     // Catch:{ Exception -> 0x00db }
            android.view.View r7 = (android.view.View) r7     // Catch:{ Exception -> 0x00db }
            if (r7 != 0) goto L_0x00d8
            return r2
        L_0x00d8:
            r6.f11077g = r1     // Catch:{ Exception -> 0x00db }
            return r7
        L_0x00db:
            r7 = move-exception
            com.inmobi.media.fn r8 = com.inmobi.media.C5275fn.m12068a()
            com.inmobi.media.gk r9 = new com.inmobi.media.gk
            r9.<init>(r7)
            r8.mo40590a((com.inmobi.media.C5308gk) r9)
            java.lang.String r7 = "Could not pause ad; SDK encountered an unexpected error"
            com.inmobi.media.C5327gw.m12263a((byte) r1, (java.lang.String) r0, (java.lang.String) r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.ads.InMobiNative.getPrimaryViewOfWidth(android.content.Context, android.view.View, android.view.ViewGroup, int):android.view.View");
    }

    @Deprecated
    public final View getPrimaryViewOfWidth(View view, ViewGroup viewGroup, int i) {
        C5327gw.m12263a((byte) 1, f11071a, String.format("The %s API has been deprecated and API will be removed in the subsequent versions", new Object[]{"getPrimaryViewOfWidth(View, ViewGroup, int)"}));
        WeakReference<Context> weakReference = this.f11079i;
        if (weakReference != null && weakReference.get() != null) {
            return getPrimaryViewOfWidth((Context) this.f11079i.get(), view, viewGroup, i);
        }
        C5327gw.m12263a((byte) 1, f11071a, "InMobiNative is not initialized or provided context is null.");
        return null;
    }

    public final JSONObject getCustomAdContent() {
        try {
            return this.f11072b.mo39981s();
        } catch (Exception e) {
            C5327gw.m12263a((byte) 1, f11071a, "Could not get the ad customJson ; SDK encountered unexpected error");
            C5275fn.m12068a().mo40590a(new C5308gk(e));
            return null;
        }
    }

    public final String getAdTitle() {
        try {
            return this.f11072b.mo39982t();
        } catch (Exception e) {
            C5327gw.m12263a((byte) 1, f11071a, "Could not get the ad title; SDK encountered unexpected error");
            C5275fn.m12068a().mo40590a(new C5308gk(e));
            return null;
        }
    }

    public final String getAdDescription() {
        try {
            return this.f11072b.mo39983u();
        } catch (Exception e) {
            C5327gw.m12263a((byte) 1, f11071a, "Could not get the description; SDK encountered unexpected error");
            C5275fn.m12068a().mo40590a(new C5308gk(e));
            return null;
        }
    }

    public final String getAdIconUrl() {
        try {
            return this.f11072b.mo39984v();
        } catch (Exception e) {
            C5327gw.m12263a((byte) 1, f11071a, "Could not get the iconUrl; SDK encountered unexpected error");
            C5275fn.m12068a().mo40590a(new C5308gk(e));
            return null;
        }
    }

    public final String getAdLandingPageUrl() {
        try {
            return this.f11072b.mo39985w();
        } catch (Exception e) {
            C5327gw.m12263a((byte) 1, f11071a, "Could not get the adLandingPageUrl; SDK encountered unexpected error");
            C5275fn.m12068a().mo40590a(new C5308gk(e));
            return null;
        }
    }

    public final String getAdCtaText() {
        try {
            return this.f11072b.mo39986x();
        } catch (Exception e) {
            C5327gw.m12263a((byte) 1, f11071a, "Could not get the ctaText; SDK encountered unexpected error");
            C5275fn.m12068a().mo40590a(new C5308gk(e));
            return null;
        }
    }

    public final float getAdRating() {
        try {
            return this.f11072b.mo39987y();
        } catch (Exception e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
            C5327gw.m12263a((byte) 1, "InMobi", "Could not get rating; SDK encountered an unexpected error");
            return 0.0f;
        }
    }

    public final boolean isAppDownload() {
        try {
            return this.f11072b.mo39988z();
        } catch (Exception e) {
            C5327gw.m12263a((byte) 1, f11071a, "Could not get isAppDownload; SDK encountered unexpected error");
            C5275fn.m12068a().mo40590a(new C5308gk(e));
            return false;
        }
    }

    public final Boolean isVideo() {
        try {
            return this.f11072b.mo39963A();
        } catch (Exception e) {
            C5327gw.m12263a((byte) 1, f11071a, "Could not get isVideo; SDK encountered unexpected error");
            C5275fn.m12068a().mo40590a(new C5308gk(e));
            return null;
        }
    }

    public final void reportAdClickAndOpenLandingPage() {
        try {
            this.f11072b.mo39964B();
        } catch (Exception e) {
            C5327gw.m12263a((byte) 1, f11071a, "reportAdClickAndOpenLandingPage failed; SDK encountered unexpected error");
            C5275fn.m12068a().mo40590a(new C5308gk(e));
        }
    }

    public final boolean isReady() {
        return this.f11072b.mo39974l();
    }

    @Deprecated
    public final JSONObject getAdMetaInfo() {
        return this.f11072b.mo39998D();
    }

    public final void setExtras(Map<String, String> map) {
        this.f11078h.f11352c = map;
    }

    public final void setKeywords(String str) {
        this.f11078h.f11351b = str;
    }

    public final void destroy() {
        try {
            View view = this.f11076f == null ? null : (View) this.f11076f.get();
            if (view != null) {
                ((ViewGroup) view).removeAllViews();
            }
            this.f11072b.mo39977o();
            this.f11074d = null;
            this.f11075e = null;
            this.f11077g = false;
        } catch (Exception e) {
            C5327gw.m12263a((byte) 1, f11071a, "Failed to destroy ad; SDK encountered an unexpected error");
            C5275fn.m12068a().mo40590a(new C5308gk(e));
        }
    }

    @Deprecated
    public final String getCreativeId() {
        return this.f11072b.mo39997C();
    }

    public static final class NativeCallbacks extends PublisherCallbacks {

        /* renamed from: a */
        private WeakReference<InMobiNative> f11081a;

        /* renamed from: b */
        private boolean f11082b = true;

        public final byte getType() {
            return 0;
        }

        NativeCallbacks(InMobiNative inMobiNative) {
            this.f11081a = new WeakReference<>(inMobiNative);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo39885a() {
            this.f11082b = false;
        }

        public final void onAdFetchSuccessful(AdMetaInfo adMetaInfo) {
            InMobiNative inMobiNative = (InMobiNative) this.f11081a.get();
            if (inMobiNative == null) {
                C5327gw.m12263a((byte) 1, InMobiNative.f11071a, "Lost reference to InMobiNative! callback cannot be given");
                return;
            }
            if (inMobiNative.f11074d != null) {
                inMobiNative.f11074d.onAdReceived(inMobiNative);
            }
            if (inMobiNative.f11074d != null) {
                inMobiNative.f11074d.onAdFetchSuccessful(inMobiNative, adMetaInfo);
            }
        }

        public final void onAdFetchFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
            onAdLoadFailed(inMobiAdRequestStatus);
        }

        public final void onAdLoadSucceeded(AdMetaInfo adMetaInfo) {
            InMobiNative inMobiNative = (InMobiNative) this.f11081a.get();
            if (inMobiNative == null) {
                C5327gw.m12263a((byte) 1, InMobiNative.f11071a, "Lost reference to InMobiNative! callback cannot be given");
            } else if (!this.f11082b) {
                this.f11082b = true;
                if (inMobiNative.f11074d != null) {
                    inMobiNative.f11074d.onAdLoadSucceeded(inMobiNative);
                }
                if (inMobiNative.f11074d != null) {
                    inMobiNative.f11074d.onAdLoadSucceeded(inMobiNative, adMetaInfo);
                }
            }
        }

        public final void onAdLoadFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
            InMobiNative inMobiNative = (InMobiNative) this.f11081a.get();
            if (inMobiNative == null) {
                C5327gw.m12263a((byte) 1, InMobiNative.f11071a, "Lost reference to InMobiNative! callback cannot be given");
            } else if (!this.f11082b) {
                this.f11082b = true;
                if (inMobiNative.f11074d != null) {
                    inMobiNative.f11074d.onAdLoadFailed(inMobiNative, inMobiAdRequestStatus);
                }
            }
        }

        public final void onAdWillDisplay() {
            InMobiNative inMobiNative = (InMobiNative) this.f11081a.get();
            if (inMobiNative == null) {
                C5327gw.m12263a((byte) 1, InMobiNative.f11071a, "Lost reference to InMobiNative! callback cannot be given");
                return;
            }
            if (inMobiNative.f11080j != null) {
                inMobiNative.f11080j.onActionRequired(inMobiNative);
            }
            if (inMobiNative.f11074d != null) {
                inMobiNative.f11074d.onAdFullScreenWillDisplay(inMobiNative);
            }
        }

        public final void onAdDisplayed(AdMetaInfo adMetaInfo) {
            InMobiNative inMobiNative = (InMobiNative) this.f11081a.get();
            if (inMobiNative == null) {
                C5327gw.m12263a((byte) 1, InMobiNative.f11071a, "Lost reference to InMobiNative! callback cannot be given");
            } else if (inMobiNative.f11074d != null) {
                inMobiNative.f11074d.onAdFullScreenDisplayed(inMobiNative);
            }
        }

        public final void onAdDismissed() {
            InMobiNative inMobiNative = (InMobiNative) this.f11081a.get();
            if (inMobiNative == null) {
                C5327gw.m12263a((byte) 1, InMobiNative.f11071a, "Lost reference to InMobiNative! callback cannot be given");
            } else if (inMobiNative.f11074d != null) {
                inMobiNative.f11074d.onAdFullScreenDismissed(inMobiNative);
            }
        }

        public final void onAdClicked(Map<Object, Object> map) {
            InMobiNative inMobiNative = (InMobiNative) this.f11081a.get();
            if (inMobiNative == null) {
                C5327gw.m12263a((byte) 1, InMobiNative.f11071a, "Lost reference to InMobiNative! callback cannot be given");
            } else if (inMobiNative.f11074d != null) {
                inMobiNative.f11074d.onAdClicked(inMobiNative);
            }
        }

        public final void onUserLeftApplication() {
            InMobiNative inMobiNative = (InMobiNative) this.f11081a.get();
            if (inMobiNative == null) {
                C5327gw.m12263a((byte) 1, InMobiNative.f11071a, "Lost reference to InMobiNative! callback cannot be given");
                return;
            }
            if (inMobiNative.f11080j != null) {
                inMobiNative.f11080j.onActionRequired(inMobiNative);
            }
            if (inMobiNative.f11074d != null) {
                inMobiNative.f11074d.onUserWillLeaveApplication(inMobiNative);
            }
        }

        public final void onAdImpressed() {
            InMobiNative inMobiNative = (InMobiNative) this.f11081a.get();
            if (inMobiNative == null) {
                C5327gw.m12263a((byte) 1, InMobiNative.f11071a, "Lost reference to InMobiNative! callback cannot be given");
            } else if (inMobiNative.f11074d != null) {
                inMobiNative.f11074d.onAdImpressed(inMobiNative);
            }
        }

        public final void onVideoCompleted() {
            InMobiNative inMobiNative = (InMobiNative) this.f11081a.get();
            if (inMobiNative == null) {
                C5327gw.m12263a((byte) 1, InMobiNative.f11071a, "Lost reference to InMobiNative! callback cannot be given");
            } else if (inMobiNative.f11075e != null) {
                inMobiNative.f11075e.onVideoCompleted(inMobiNative);
            }
        }

        public final void onVideoSkipped() {
            InMobiNative inMobiNative = (InMobiNative) this.f11081a.get();
            if (inMobiNative == null) {
                C5327gw.m12263a((byte) 1, InMobiNative.f11071a, "Lost reference to InMobiNative! callback cannot be given");
            } else if (inMobiNative.f11075e != null) {
                inMobiNative.f11075e.onVideoSkipped(inMobiNative);
            }
        }

        public final void onAudioStateChanged(boolean z) {
            InMobiNative inMobiNative = (InMobiNative) this.f11081a.get();
            if (inMobiNative == null) {
                C5327gw.m12263a((byte) 1, InMobiNative.f11071a, "Lost reference to InMobiNative! callback cannot be given");
            } else if (inMobiNative.f11075e != null) {
                inMobiNative.f11075e.onAudioStateChanged(inMobiNative, z);
            }
        }

        public final void onRequestPayloadCreated(byte[] bArr) {
            InMobiNative inMobiNative = (InMobiNative) this.f11081a.get();
            if (inMobiNative == null) {
                C5327gw.m12263a((byte) 1, InMobiNative.f11071a, "Lost reference to InMobiNative! callback cannot be given");
            } else if (inMobiNative.f11074d != null) {
                inMobiNative.f11074d.onRequestPayloadCreated(bArr);
            }
        }

        public final void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
            InMobiNative inMobiNative = (InMobiNative) this.f11081a.get();
            if (inMobiNative == null) {
                C5327gw.m12263a((byte) 1, InMobiNative.f11071a, "Lost reference to InMobiNative! callback cannot be given");
            } else if (inMobiNative.f11074d != null) {
                inMobiNative.f11074d.onRequestPayloadCreationFailed(inMobiAdRequestStatus);
            }
        }
    }
}
