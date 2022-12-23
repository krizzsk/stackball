package com.tapjoy;

import android.content.Context;
import android.content.Intent;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.internal.C9278fn;
import com.tapjoy.internal.C9285fq;
import com.tapjoy.internal.C9293fw;
import com.tapjoy.internal.C9313ge;
import com.tapjoy.internal.C9314gf;
import com.tapjoy.internal.C9333gs;
import com.tapjoy.internal.C9336gv;
import com.tapjoy.internal.C9344gz;
import com.tapjoy.internal.C9359he;
import com.tapjoy.internal.C9465jq;
import java.util.HashMap;
import java.util.UUID;

public class TJPlacement {

    /* renamed from: a */
    TJPlacementListener f22060a;

    /* renamed from: b */
    private TJCorePlacement f22061b;

    /* renamed from: c */
    private TJPlacementListener f22062c;

    /* renamed from: d */
    private TJPlacementVideoListener f22063d;

    /* renamed from: e */
    private String f22064e;
    public String pushId;

    @Deprecated
    public TJPlacement(Context context, String str, TJPlacementListener tJPlacementListener) {
        TJCorePlacement a = TJPlacementManager.m24216a(str);
        a = a == null ? TJPlacementManager.m24217a(str, "", "", false, false) : a;
        a.setContext(context);
        m24214a(a, tJPlacementListener);
    }

    TJPlacement(TJCorePlacement tJCorePlacement, TJPlacementListener tJPlacementListener) {
        m24214a(tJCorePlacement, tJPlacementListener);
    }

    /* renamed from: a */
    private void m24214a(TJCorePlacement tJCorePlacement, TJPlacementListener tJPlacementListener) {
        this.f22061b = tJCorePlacement;
        this.f22064e = UUID.randomUUID().toString();
        this.f22062c = tJPlacementListener;
        this.f22060a = tJPlacementListener != null ? (TJPlacementListener) C9278fn.m24888a(tJPlacementListener, TJPlacementListener.class) : null;
        FiveRocksIntegration.addPlacementCallback(getName(), this);
    }

    public TJPlacementListener getListener() {
        return this.f22062c;
    }

    public void setVideoListener(TJPlacementVideoListener tJPlacementVideoListener) {
        this.f22063d = tJPlacementVideoListener;
    }

    public TJPlacementVideoListener getVideoListener() {
        return this.f22063d;
    }

    public String getName() {
        return this.f22061b.getPlacementData() != null ? this.f22061b.getPlacementData().getPlacementName() : "";
    }

    public boolean isLimited() {
        return this.f22061b.isLimited();
    }

    public boolean isContentReady() {
        boolean isContentReady = this.f22061b.isContentReady();
        C9293fw fwVar = this.f22061b.f22002f;
        if (isContentReady) {
            fwVar.mo58154a(4);
        } else {
            fwVar.mo58154a(2);
        }
        return isContentReady;
    }

    public boolean isContentAvailable() {
        this.f22061b.f22002f.mo58154a(1);
        return this.f22061b.isContentAvailable();
    }

    public void setMediationId(String str) {
        this.f22061b.f22012p = str;
    }

    public void requestContent() {
        boolean z;
        String name = getName();
        TapjoyLog.m24276i("TJPlacement", "requestContent() called for placement " + name);
        C9314gf.m24956a("TJPlacement.requestContent").mo58199a("placement", (Object) name).mo58199a("placement_type", (Object) this.f22061b.f21999c.getPlacementType());
        if (C9313ge.m24951a() != null && C9465jq.m25449c(C9313ge.m24951a().f23033b)) {
            TapjoyLog.m24278w("TJPlacement", "[INFO] Your application calls requestContent without having previously called setUserConsent. You can review Tapjoy supported consent API here - https://dev.tapjoy.com/sdk-integration/#sdk11122_gdpr_release.");
        }
        if (!isLimited()) {
            z = TapjoyConnectCore.isConnected();
        } else {
            z = TapjoyConnectCore.isLimitedConnected();
        }
        if (!z) {
            C9314gf.m24963b("TJPlacement.requestContent").mo58202b("not connected").mo58204c();
            m24215a(new TJError(0, "SDK not connected -- connect must be called first with a successful callback"));
        } else if (this.f22061b.getContext() == null) {
            C9314gf.m24963b("TJPlacement.requestContent").mo58202b("no context").mo58204c();
            m24215a(new TJError(0, "Context is null -- TJPlacement requires a valid Context."));
        } else if (C9465jq.m25449c(name)) {
            C9314gf.m24963b("TJPlacement.requestContent").mo58202b("invalid name").mo58204c();
            m24215a(new TJError(0, "Invalid placement name -- TJPlacement requires a valid placement name."));
        } else {
            try {
                this.f22061b.mo57527a(this);
            } finally {
                C9314gf.m24966d("TJPlacement.requestContent");
            }
        }
    }

    public void showContent() {
        String name = getName();
        TapjoyLog.m24276i("TJPlacement", "showContent() called for placement " + name);
        TJCorePlacement tJCorePlacement = this.f22061b;
        C9314gf.m24956a("TJPlacement.showContent").mo58199a("placement", (Object) tJCorePlacement.f21999c.getPlacementName()).mo58199a("placement_type", (Object) tJCorePlacement.f21999c.getPlacementType()).mo58199a(FirebaseAnalytics.Param.CONTENT_TYPE, (Object) tJCorePlacement.mo57526a());
        C9293fw fwVar = tJCorePlacement.f22002f;
        fwVar.mo58154a(8);
        C9285fq fqVar = fwVar.f22972a;
        if (fqVar != null) {
            fqVar.mo58146a();
        }
        if (!this.f22061b.isContentAvailable()) {
            TapjoyLog.m24274e("TJPlacement", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, "No placement content available. Can not show content for non-200 placement."));
            C9314gf.m24963b("TJPlacement.showContent").mo58202b("no content").mo58204c();
            return;
        }
        try {
            TJCorePlacement tJCorePlacement2 = this.f22061b;
            if (TapjoyConnectCore.isFullScreenViewOpen()) {
                TapjoyLog.m24278w(TJCorePlacement.f21996a, "Only one view can be presented at a time.");
                C9314gf.m24963b("TJPlacement.showContent").mo58202b("another content showing").mo58204c();
            } else {
                if (TapjoyConnectCore.isViewOpen()) {
                    TapjoyLog.m24278w(TJCorePlacement.f21996a, "Will close N2E content.");
                    TJPlacementManager.dismissContentShowing(false);
                }
                tJCorePlacement2.mo57530a("SHOW", this);
                C9314gf.C9316a d = C9314gf.m24966d("TJPlacement.showContent");
                int i = 1;
                if (tJCorePlacement2.f22003g.isPrerendered()) {
                    d.mo58199a("prerendered", (Object) true);
                }
                if (tJCorePlacement2.isContentReady()) {
                    d.mo58199a("content_ready", (Object) true);
                }
                tJCorePlacement2.f22002f.f22975d = d;
                String uuid = UUID.randomUUID().toString();
                if (tJCorePlacement2.f22005i != null) {
                    tJCorePlacement2.f22005i.f23185f = uuid;
                    if (tJCorePlacement2.f22005i != null) {
                        if (tJCorePlacement2.f22005i instanceof C9336gv) {
                            i = 3;
                        } else {
                            i = tJCorePlacement2.f22005i instanceof C9359he ? 2 : 0;
                        }
                    }
                    TapjoyConnectCore.viewWillOpen(uuid, i);
                    tJCorePlacement2.f22005i.f23184e = new C9333gs(uuid) {

                        /* renamed from: a */
                        final /* synthetic */ String f22032a;

                        {
                            this.f22032a = r2;
                        }

                        /* renamed from: a */
                        public final void mo57541a(Context context, String str, String str2) {
                            if (str2 == null) {
                                TJCorePlacement.this.f21999c.setRedirectURL(str);
                            } else {
                                TJCorePlacement.this.f21999c.setBaseURL(str);
                                TJCorePlacement.this.f21999c.setHttpResponse(str2);
                            }
                            TJCorePlacement.this.f21999c.setHasProgressSpinner(true);
                            TJCorePlacement.this.f21999c.setContentViewId(this.f22032a);
                            Intent intent = new Intent(TJCorePlacement.this.f21998b, TJAdUnitActivity.class);
                            intent.putExtra(TJAdUnitConstants.EXTRA_TJ_PLACEMENT_DATA, TJCorePlacement.this.f21999c);
                            intent.setFlags(268435456);
                            context.startActivity(intent);
                        }
                    };
                    C9344gz.m25064a((Runnable) new Runnable() {
                        public final void run() {
                            TJCorePlacement.this.f22005i.mo58223a(C9344gz.m25060a().f23126p, TJCorePlacement.this.f22002f);
                        }
                    });
                } else {
                    tJCorePlacement2.f21999c.setContentViewId(uuid);
                    Intent intent = new Intent(tJCorePlacement2.f21998b, TJAdUnitActivity.class);
                    intent.putExtra(TJAdUnitConstants.EXTRA_TJ_PLACEMENT_DATA, tJCorePlacement2.f21999c);
                    intent.setFlags(268435456);
                    tJCorePlacement2.f21998b.startActivity(intent);
                }
                tJCorePlacement2.f22001e = 0;
                tJCorePlacement2.f22007k = false;
                tJCorePlacement2.f22008l = false;
            }
        } finally {
            C9314gf.m24966d("TJPlacement.showContent");
        }
    }

    public void setAuctionData(HashMap hashMap) {
        if (hashMap == null || hashMap.isEmpty()) {
            TapjoyLog.m24273d("TJPlacement", "auctionData can not be null or empty");
            return;
        }
        TJCorePlacement tJCorePlacement = this.f22061b;
        tJCorePlacement.f22013q = hashMap;
        String b = tJCorePlacement.mo57531b();
        if (!C9465jq.m25449c(b)) {
            tJCorePlacement.f21999c.setAuctionMediationURL(TapjoyConnectCore.getPlacementURL() + "v1/apps/" + b + "/bid_content?");
            return;
        }
        TapjoyLog.m24276i(TJCorePlacement.f21996a, "Placement auction data can not be set for a null app ID");
    }

    public void setMediationName(String str) {
        TapjoyLog.m24273d("TJPlacement", "setMediationName=" + str);
        if (!C9465jq.m25449c(str)) {
            TJCorePlacement tJCorePlacement = this.f22061b;
            Context context = tJCorePlacement != null ? tJCorePlacement.getContext() : null;
            TJCorePlacement a = TJPlacementManager.m24217a(getName(), str, "", false, isLimited());
            this.f22061b = a;
            a.f22011o = str;
            a.f22009m = str;
            a.f21999c.setPlacementType(str);
            String b = a.mo57531b();
            if (!C9465jq.m25449c(b)) {
                a.f21999c.setMediationURL(TapjoyConnectCore.getPlacementURL() + "v1/apps/" + b + "/mediation_content?");
            } else {
                TapjoyLog.m24276i(TJCorePlacement.f21996a, "Placement mediation name can not be set for a null app ID");
            }
            if (context != null) {
                this.f22061b.setContext(context);
            }
        }
    }

    public void setAdapterVersion(String str) {
        this.f22061b.f22010n = str;
    }

    public static void dismissContent() {
        TJPlacementManager.dismissContentShowing("true".equals(TapjoyConnectCore.getConnectFlagValue("TJC_OPTION_DISMISS_CONTENT_ALL")));
    }

    public String getGUID() {
        return this.f22064e;
    }

    /* renamed from: a */
    private void m24215a(TJError tJError) {
        this.f22061b.mo57528a(this, TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, tJError);
    }
}
