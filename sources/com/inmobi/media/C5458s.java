package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsClient;
import com.facebook.appevents.AppEventsConstants;
import com.google.common.base.Ascii;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C5435p;
import com.p243my.tracker.ads.AdFormat;
import java.util.Map;

/* renamed from: com.inmobi.media.s */
/* compiled from: BannerAdUnit */
public class C5458s extends C5435p implements Application.ActivityLifecycleCallbacks {
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static final String f12575t = C5458s.class.getSimpleName();

    /* renamed from: u */
    private boolean f12576u = false;

    /* renamed from: v */
    private boolean f12577v = false;

    /* renamed from: w */
    private int f12578w = 0;

    /* renamed from: l */
    public String mo39959l() {
        return AdFormat.BANNER;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final byte mo39960m() {
        return 0;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    /* renamed from: a */
    static /* synthetic */ int m12909a(C5458s sVar) {
        int i = sVar.f12578w;
        sVar.f12578w = i + 1;
        return i;
    }

    /* renamed from: b */
    static /* synthetic */ int m12911b(C5458s sVar) {
        int i = sVar.f12578w - 1;
        sVar.f12578w = i;
        return i;
    }

    public C5458s(Context context, C4955an anVar, C5435p.C5453a aVar) {
        super(context, anVar, aVar);
        anVar.mo40070e();
        mo40974a(context, anVar, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final boolean mo40950A() {
        try {
            CustomTabsClient.class.getName();
            return false;
        } catch (NoClassDefFoundError unused) {
            return true;
        }
    }

    /* renamed from: a */
    public void mo41033a(boolean z) {
        if (z) {
            C5327gw.m12263a((byte) 2, "InMobi", "Initiating Banner refresh for placement id: " + mo41000j().toString());
        }
        this.f12576u = z;
        mo39947B();
    }

    /* renamed from: Y */
    public boolean mo39950Y() {
        return this.f12577v;
    }

    /* renamed from: Z */
    public boolean mo39951Z() {
        return mo41001k() == 7;
    }

    /* renamed from: u */
    public C5415m mo41008u() {
        C5415m u = super.mo41008u();
        if (this.f12577v && u != null) {
            u.mo40683a();
        }
        return u;
    }

    /* renamed from: b */
    public void mo41038b(String str) {
        mo41000j().mo40063a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final Map<String, String> mo39961n() {
        Map<String, String> n = super.mo39961n();
        n.put("u-rt", this.f12576u ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
        n.put("mk-ad-slot", mo41000j().mo40079l());
        return n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo39954a(boolean z, InMobiAdRequestStatus inMobiAdRequestStatus) {
        C5435p.C5453a q;
        super.mo39954a(z, inMobiAdRequestStatus);
        C5327gw.m12263a((byte) 2, "InMobi", "Banner ad fetch successful for placement id: " + mo41000j().toString());
        if (mo41001k() == 2 && (q = mo41004q()) != null) {
            mo40989b(q);
        }
    }

    /* renamed from: T */
    public void mo39949T() {
        mo40956H();
        try {
            if (!mo40966S()) {
                mo40967U();
                this.f12523j.post(new Runnable() {
                    public final void run() {
                        C5458s.this.mo41011x();
                    }
                });
            }
        } catch (IllegalStateException unused) {
            mo40976a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (byte) 48);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo40957I() {
        super.mo40957I();
        if (mo41001k() == 2) {
            mo40997e((byte) 2);
            this.f12515b = 4;
            mo40961M();
            C5327gw.m12263a((byte) 2, "InMobi", "Successfully loaded Banner ad markup in the WebView for placement id: " + mo41000j().toString());
            C5435p.C5453a q = mo41004q();
            if (q != null) {
                mo40992c(q);
            }
            mo40953E();
            if (!mo40968V()) {
                mo40822f();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo40958J() {
        super.mo40958J();
        if (mo41001k() == 2) {
            mo40997e((byte) 2);
            this.f12515b = 3;
            C5327gw.m12263a((byte) 2, "InMobi", "Failed to load the Banner markup in the WebView for placement id: " + mo41000j().toString());
            mo40976a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), false, (byte) 43);
        }
    }

    /* renamed from: b */
    public void mo40814b(C5415m mVar) {
        super.mo40814b(mVar);
        this.f12523j.post(new Runnable() {
            public final void run() {
                try {
                    if (C5458s.this.mo41001k() == 4) {
                        C5458s.this.f12515b = 6;
                    }
                } catch (Exception unused) {
                    C5327gw.m12263a((byte) 1, "InMobi", "Unable to load ad; SDK encountered an internal error");
                    String unused2 = C5458s.f12575t;
                }
            }
        });
    }

    /* renamed from: c */
    public synchronized void mo40817c(C5415m mVar) {
        super.mo40817c(mVar);
        this.f12523j.post(new Runnable() {
            public final void run() {
                try {
                    if (C5458s.this.mo41001k() == 6) {
                        C5458s.m12909a(C5458s.this);
                        C5458s.this.f12515b = 7;
                        C5327gw.m12263a((byte) 2, "InMobi", "Successfully displayed banner ad for placement Id : " + C5458s.this.mo41000j().toString());
                        C5435p.C5453a q = C5458s.this.mo41004q();
                        if (q != null) {
                            C5458s.this.mo40994d(q);
                        }
                    } else if (C5458s.this.mo41001k() == 7) {
                        C5458s.m12909a(C5458s.this);
                    }
                } catch (Exception unused) {
                    C5327gw.m12263a((byte) 1, "InMobi", "Unable to display ad; SDK encountered an internal error");
                    String unused2 = C5458s.f12575t;
                }
            }
        });
    }

    /* renamed from: d */
    public synchronized void mo40819d(C5415m mVar) {
        super.mo40819d(mVar);
        this.f12523j.post(new Runnable() {
            public final void run() {
                try {
                    if (C5458s.this.mo41001k() == 7 && C5458s.m12911b(C5458s.this) == 0) {
                        C5458s.this.f12515b = 6;
                        if (C5458s.this.mo41004q() != null) {
                            C5458s.this.mo41004q().mo40013c();
                        }
                    }
                } catch (Exception unused) {
                    C5327gw.m12263a((byte) 1, "InMobi", "Unable to dismiss ad; SDK encountered an internal error");
                    String unused2 = C5458s.f12575t;
                }
            }
        });
    }

    /* renamed from: aa */
    public void mo41034aa() {
        C5331h t;
        C5098cz viewableAd;
        byte k = mo41001k();
        if ((k == 4 || k == 6 || k == 7) && (t = mo41007t()) != null && (viewableAd = t.getViewableAd()) != null) {
            viewableAd.mo40368a(mo40999i(), (byte) 1);
        }
    }

    /* renamed from: ab */
    public void mo41035ab() {
        C5331h t;
        C5098cz viewableAd;
        byte k = mo41001k();
        if ((k == 4 || k == 6 || k == 7) && (t = mo41007t()) != null && (viewableAd = t.getViewableAd()) != null) {
            viewableAd.mo40368a(mo40999i(), (byte) 0);
        }
    }

    /* renamed from: ac */
    public void mo41036ac() {
        if (mo40999i() instanceof Activity) {
            ((Activity) mo40999i()).getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    public void onActivityStarted(Activity activity) {
        Context i = mo40999i();
        if (i != null && i.equals(activity)) {
            mo41035ab();
        }
    }

    public void onActivityStopped(Activity activity) {
        Context i = mo40999i();
        if (i != null && i.equals(activity)) {
            mo41034aa();
        }
    }

    public void onActivityDestroyed(Activity activity) {
        Context i = mo40999i();
        if (i != null && i.equals(activity)) {
            ((Activity) i).getApplication().unregisterActivityLifecycleCallbacks(this);
            mo40955G();
        }
    }

    /* renamed from: g */
    public void mo40823g() {
        super.mo40823g();
        this.f12531r = true;
        this.f12523j.post(new Runnable() {
            public final void run() {
                C5331h t = C5458s.this.mo41007t();
                if (t != null) {
                    t.destroy();
                }
            }
        });
    }

    /* renamed from: ad */
    public void mo41037ad() {
        Context i = mo40999i();
        if (i != null) {
            C5314go.m12191a(i, (Application.ActivityLifecycleCallbacks) this);
        }
    }

    /* renamed from: B */
    public void mo39947B() {
        boolean z = false;
        if (mo40950A()) {
            mo40976a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (byte) 39);
        } else if (1 == mo41001k() || 2 == mo41001k()) {
            C5327gw.m12263a((byte) 1, f12575t, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
        } else if (7 == mo41001k()) {
            mo40976a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (byte) Ascii.f10109SI);
            C5327gw.m12263a((byte) 1, "InMobi", C4937ag.f11159a + mo41000j().mo40070e());
        } else {
            C5327gw.m12263a((byte) 2, "InMobi", "Fetching a Banner ad for placement id: " + mo41000j().toString());
            this.f12526m = false;
            z = true;
        }
        if (z) {
            super.mo39947B();
        }
    }
}
