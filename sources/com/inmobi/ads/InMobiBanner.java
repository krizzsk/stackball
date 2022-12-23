package com.inmobi.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.exceptions.InvalidPlacementIdException;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.BannerAdEventListener;
import com.inmobi.media.C5003az;
import com.inmobi.media.C5004b;
import com.inmobi.media.C5040c;
import com.inmobi.media.C5314go;
import com.inmobi.media.C5327gw;
import com.inmobi.media.C5343hf;
import com.inmobi.media.C5464t;
import com.vungle.warren.model.ReportDBAdapter;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

public final class InMobiBanner extends RelativeLayout {

    /* renamed from: a */
    public static final String f11040a = InMobiBanner.class.getSimpleName();

    /* renamed from: b */
    public BannerAdEventListener f11041b;

    /* renamed from: c */
    public C5464t f11042c;

    /* renamed from: d */
    public AnimationType f11043d = AnimationType.ROTATE_HORIZONTAL_AXIS;

    /* renamed from: e */
    public C4905a f11044e = new C4905a(this);

    /* renamed from: f */
    private int f11045f;

    /* renamed from: g */
    private boolean f11046g = true;

    /* renamed from: h */
    private C5040c f11047h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f11048i = 0;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f11049j = 0;

    /* renamed from: k */
    private long f11050k = 0;

    /* renamed from: l */
    private WeakReference<Activity> f11051l;

    /* renamed from: m */
    private C5003az f11052m = new C5003az();

    /* renamed from: n */
    private PreloadManager f11053n = new PreloadManager() {

        /* renamed from: b */
        private C5004b f11055b = new C5004b(InMobiBanner.this);

        public final void preload() {
            InMobiBanner.this.setEnableAutoRefresh(false);
            InMobiBanner.this.mo39811a((PublisherCallbacks) this.f11055b, false);
        }

        public final void load() {
            try {
                InMobiBanner.this.f11042c.mo41058n();
            } catch (IllegalStateException e) {
                C5327gw.m12263a((byte) 1, InMobiBanner.f11040a, e.getMessage());
                if (InMobiBanner.this.f11041b != null) {
                    InMobiBanner.this.f11041b.onAdLoadFailed(InMobiBanner.this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                }
            }
        }
    };

    public enum AnimationType {
        ANIMATION_OFF,
        ROTATE_HORIZONTAL_AXIS,
        ANIMATION_ALPHA,
        ROTATE_VERTICAL_AXIS
    }

    public InMobiBanner(Context context, AttributeSet attributeSet) throws SdkNotInitializedException {
        super(context, attributeSet);
        if (C5314go.m12202b()) {
            if (context instanceof Activity) {
                this.f11051l = new WeakReference<>((Activity) context);
            }
            this.f11042c = new C5464t();
            String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.inmobi.ads", ReportDBAdapter.ReportColumns.COLUMN_PLACEMENT_ID);
            String attributeValue2 = attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.inmobi.ads", "refreshInterval");
            if (attributeValue != null) {
                long a = m11026a(attributeValue);
                if (a != Long.MIN_VALUE) {
                    this.f11052m.f11350a = a;
                } else {
                    throw new InvalidPlacementIdException();
                }
            }
            m11027a(getContext());
            this.f11045f = this.f11042c.mo41063s();
            this.f11047h = new C5040c(this);
            if (attributeValue2 != null) {
                try {
                    setRefreshInterval(Integer.parseInt(attributeValue2.trim()));
                } catch (NumberFormatException unused) {
                    C5327gw.m12263a((byte) 1, f11040a, "Refresh interval value supplied in XML layout is not valid. Falling back to default value.");
                }
            }
        } else {
            throw new SdkNotInitializedException(f11040a);
        }
    }

    /* renamed from: a */
    private static long m11026a(String str) {
        try {
            StringBuilder sb = new StringBuilder(str.trim());
            if ("plid-".equalsIgnoreCase(sb.substring(0, 5))) {
                return Long.parseLong(sb.substring(5, sb.length()).trim());
            }
            C5327gw.m12263a((byte) 1, f11040a, "Placement id value supplied in XML layout is not valid. Please make sure placement id is in plid-0123456789 format.");
            C5327gw.m12263a((byte) 1, f11040a, "Invalid Placement id: ".concat(String.valueOf(str)));
            return Long.MIN_VALUE;
        } catch (NumberFormatException unused) {
            C5327gw.m12263a((byte) 1, f11040a, "Placement id value supplied in XML layout is not valid. Banner creation failed.");
            C5327gw.m12263a((byte) 1, f11040a, "Invalid Placement id: ".concat(String.valueOf(str)));
        } catch (StringIndexOutOfBoundsException unused2) {
            C5327gw.m12263a((byte) 1, f11040a, "Placement id value supplied in XML layout is not valid. Please make sure placement id is in plid-0123456789 format.");
            C5327gw.m12263a((byte) 1, f11040a, "Invalid Placement id: ".concat(String.valueOf(str)));
        }
    }

    public InMobiBanner(Context context, long j) throws SdkNotInitializedException {
        super(context);
        if (C5314go.m12202b()) {
            if (context instanceof Activity) {
                this.f11051l = new WeakReference<>((Activity) context);
            }
            this.f11042c = new C5464t();
            this.f11052m.f11350a = j;
            m11027a(context);
            this.f11045f = this.f11042c.mo41063s();
            this.f11047h = new C5040c(this);
            return;
        }
        throw new SdkNotInitializedException(f11040a);
    }

    /* renamed from: a */
    private boolean m11029a(boolean z) {
        if (!z || this.f11041b != null) {
            return true;
        }
        C5327gw.m12263a((byte) 1, f11040a, "Listener supplied is null, Ignoring your call.");
        return false;
    }

    public final void getSignals() {
        if (!m11029a(true)) {
            return;
        }
        if (m11032b("getSignals()")) {
            m11027a(getContext());
            setEnableAutoRefresh(false);
            this.f11042c.mo40009b((PublisherCallbacks) this.f11044e);
            return;
        }
        this.f11044e.onRequestPayloadCreationFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR));
    }

    public final PreloadManager getPreloadManager() {
        return this.f11053n;
    }

    public final void load(byte[] bArr) {
        if (!m11029a(false)) {
            return;
        }
        if (m11032b("load(byte[])")) {
            m11027a(getContext());
            this.f11042c.mo40004a(bArr, (PublisherCallbacks) this.f11044e);
            return;
        }
        this.f11044e.onAdLoadFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR));
    }

    public final void load() {
        if (m11029a(false)) {
            mo39811a((PublisherCallbacks) this.f11044e, false);
        }
    }

    /* renamed from: a */
    public final void mo39811a(final PublisherCallbacks publisherCallbacks, final boolean z) {
        try {
            m11027a(getContext());
            if (this.f11042c.mo41064t()) {
                if (this.f11041b != null) {
                    this.f11041b.onAdLoadFailed(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
                }
                C5327gw.m12263a((byte) 1, f11040a, "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
            } else if (!m11032b("load")) {
                this.f11042c.mo40000a(this.f11042c.mo39975m(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_INVALID));
            } else if (!mo39812a()) {
                new Handler().postDelayed(new Runnable() {
                    public final void run() {
                        try {
                            if (InMobiBanner.this.mo39812a()) {
                                InMobiBanner.this.m11037f();
                                if (InMobiBanner.this.m11035d()) {
                                    InMobiBanner.this.f11042c.mo41054a(publisherCallbacks, InMobiBanner.this.getFrameSizeString(), z);
                                    return;
                                }
                                return;
                            }
                            C5327gw.m12263a((byte) 1, InMobiBanner.f11040a, "The height or width of the banner can not be determined");
                            InMobiBanner.this.f11042c.mo40000a(InMobiBanner.this.f11042c.mo39975m(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                        } catch (Exception unused) {
                            C5327gw.m12263a((byte) 1, InMobiBanner.f11040a, "SDK encountered unexpected error while loading an ad");
                            String unused2 = InMobiBanner.f11040a;
                        }
                    }
                }, 200);
            } else {
                m11037f();
                if (m11035d()) {
                    this.f11042c.mo41054a(publisherCallbacks, getFrameSizeString(), z);
                }
            }
        } catch (Exception unused) {
            C5327gw.m12263a((byte) 1, f11040a, "Unable to load ad; SDK encountered an unexpected error");
        }
    }

    /* renamed from: b */
    private boolean m11032b(String str) {
        if (!mo39812a()) {
            if (getLayoutParams() == null) {
                String str2 = f11040a;
                C5327gw.m12263a((byte) 1, str2, "The layout params of the banner must be set before calling " + str + " or call setBannerSize(int widthInDp, int heightInDp) before " + str);
                return false;
            } else if (getLayoutParams().width == -2 || getLayoutParams().height == -2) {
                C5327gw.m12263a((byte) 1, f11040a, "The height or width of a Banner ad can't be WRAP_CONTENT or call setBannerSize(int widthInDp, int heightInDp) before ".concat(String.valueOf(str)));
                return false;
            } else {
                m11036e();
            }
        }
        return true;
    }

    public final void load(Context context) {
        if (m11029a(false)) {
            if (context instanceof Activity) {
                this.f11051l = new WeakReference<>((Activity) context);
            } else {
                this.f11051l = null;
            }
            m11027a(context);
            mo39811a((PublisherCallbacks) this.f11044e, false);
        }
    }

    @Deprecated
    public final JSONObject getAdMetaInfo() {
        return this.f11042c.mo39998D();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public boolean m11035d() {
        long j = this.f11050k;
        if (j != 0 && !this.f11042c.mo41055a(j)) {
            return false;
        }
        this.f11050k = SystemClock.elapsedRealtime();
        return true;
    }

    public final void setExtras(Map<String, String> map) {
        this.f11052m.f11352c = map;
    }

    public final void setKeywords(String str) {
        this.f11052m.f11351b = str;
    }

    public final void setListener(BannerAdEventListener bannerAdEventListener) {
        this.f11041b = bannerAdEventListener;
    }

    public final void setEnableAutoRefresh(boolean z) {
        try {
            if (this.f11046g != z) {
                this.f11046g = z;
                if (z) {
                    mo39813b();
                } else {
                    m11037f();
                }
            }
        } catch (Exception unused) {
            C5327gw.m12263a((byte) 1, f11040a, "Unable to setup auto-refresh on the ad; SDK encountered an unexpected error");
        }
    }

    public final void setRefreshInterval(int i) {
        try {
            m11027a(getContext());
            this.f11045f = this.f11042c.mo41051a(i, this.f11045f);
        } catch (Exception unused) {
            C5327gw.m12263a((byte) 1, f11040a, "Unable to set refresh interval for the ad; SDK encountered an unexpected error");
        }
    }

    public final void setAnimationType(AnimationType animationType) {
        this.f11043d = animationType;
    }

    public final void disableHardwareAcceleration() {
        this.f11052m.f11353d = true;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            this.f11042c.mo41066v();
            m11036e();
            if (!mo39812a()) {
                getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                    public final void onGlobalLayout() {
                        try {
                            int unused = InMobiBanner.this.f11048i = C5343hf.m12337b(InMobiBanner.this.getMeasuredWidth());
                            int unused2 = InMobiBanner.this.f11049j = C5343hf.m12337b(InMobiBanner.this.getMeasuredHeight());
                            if (!InMobiBanner.this.mo39812a()) {
                                return;
                            }
                            if (Build.VERSION.SDK_INT >= 16) {
                                InMobiBanner.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                            } else {
                                InMobiBanner.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                            }
                        } catch (Exception unused3) {
                            C5327gw.m12263a((byte) 1, InMobiBanner.f11040a, "InMobiBanner$1.onGlobalLayout() handler threw unexpected error");
                            String unused4 = InMobiBanner.f11040a;
                        }
                    }
                });
            }
            mo39813b();
            if (Build.VERSION.SDK_INT >= 29) {
                C5343hf.m12335a(getContext(), getRootWindowInsets());
            }
        } catch (Exception unused) {
            C5327gw.m12263a((byte) 1, f11040a, "InMobiBanner#onAttachedToWindow() handler threw unexpected error");
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
            m11037f();
            this.f11042c.mo41065u();
        } catch (Exception unused) {
            C5327gw.m12263a((byte) 1, f11040a, "InMobiBanner.onDetachedFromWindow() handler threw unexpected error");
        }
    }

    /* renamed from: e */
    private void m11036e() {
        if (getLayoutParams() != null) {
            this.f11048i = C5343hf.m12337b(getLayoutParams().width);
            this.f11049j = C5343hf.m12337b(getLayoutParams().height);
        }
    }

    public final void setBannerSize(int i, int i2) {
        this.f11048i = i;
        this.f11049j = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo39812a() {
        return this.f11048i > 0 && this.f11049j > 0;
    }

    /* access modifiers changed from: private */
    public String getFrameSizeString() {
        return this.f11048i + "x" + this.f11049j;
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        try {
            super.onVisibilityChanged(view, i);
            if (i == 0) {
                mo39813b();
            } else {
                m11037f();
            }
        } catch (Exception unused) {
            C5327gw.m12263a((byte) 1, f11040a, "InMobiBanner$1.onVisibilityChanged() handler threw unexpected error");
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        try {
            super.onWindowFocusChanged(z);
            if (z) {
                mo39813b();
            } else {
                m11037f();
            }
        } catch (Exception unused) {
            C5327gw.m12263a((byte) 1, f11040a, "InMobiBanner$1.onWindowFocusChanged() handler threw unexpected error");
        }
    }

    /* renamed from: a */
    private void m11027a(Context context) {
        this.f11042c.mo41052a(context, this.f11052m, getFrameSizeString());
        C5464t tVar = this.f11042c;
        int i = this.f11045f;
        this.f11045f = tVar.mo41051a(i, i);
    }

    /* renamed from: b */
    public final void mo39813b() {
        C5040c cVar;
        if (isShown() && hasWindowFocus()) {
            C5040c cVar2 = this.f11047h;
            if (cVar2 != null) {
                cVar2.removeMessages(1);
            }
            if (this.f11042c.mo41057l() && this.f11046g && (cVar = this.f11047h) != null) {
                cVar.sendEmptyMessageDelayed(1, (long) (this.f11045f * 1000));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m11037f() {
        C5040c cVar = this.f11047h;
        if (cVar != null) {
            cVar.removeMessages(1);
        }
    }

    public final void resume() {
        try {
            if (this.f11051l == null) {
                this.f11042c.mo41061q();
            }
        } catch (Exception unused) {
            C5327gw.m12263a((byte) 1, "InMobi", "Could not resume ad; SDK encountered an unexpected error");
        }
    }

    public final void pause() {
        try {
            if (this.f11051l == null) {
                this.f11042c.mo41062r();
            }
        } catch (Exception unused) {
            C5327gw.m12263a((byte) 1, "InMobi", "Could not pause ad; SDK encountered an unexpected error");
        }
    }

    @Deprecated
    public final String getCreativeId() {
        return this.f11042c.mo39997C();
    }

    public final void destroy() {
        m11037f();
        removeAllViews();
        this.f11042c.mo41067w();
        this.f11041b = null;
    }

    /* renamed from: com.inmobi.ads.InMobiBanner$a */
    public static final class C4905a extends C5004b {
        public final byte getType() {
            return 0;
        }

        C4905a(InMobiBanner inMobiBanner) {
            super(inMobiBanner);
        }

        public final void onAdFetchSuccessful(AdMetaInfo adMetaInfo) {
            super.onAdFetchSuccessful(adMetaInfo);
            InMobiBanner inMobiBanner = (InMobiBanner) this.f11354a.get();
            if (inMobiBanner != null) {
                try {
                    inMobiBanner.f11042c.mo41058n();
                } catch (IllegalStateException e) {
                    C5327gw.m12263a((byte) 1, InMobiBanner.f11040a, e.getMessage());
                    if (inMobiBanner.f11041b != null) {
                        inMobiBanner.f11041b.onAdLoadFailed(inMobiBanner, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                    }
                }
            }
        }

        public final void onAdFetchFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
            InMobiBanner inMobiBanner = (InMobiBanner) this.f11354a.get();
            if (inMobiBanner != null) {
                if (inMobiBanner.f11041b != null) {
                    inMobiBanner.f11041b.onAdLoadFailed(inMobiBanner, inMobiAdRequestStatus);
                }
                inMobiBanner.mo39813b();
            }
        }
    }
}
