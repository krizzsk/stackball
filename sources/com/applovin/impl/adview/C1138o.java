package com.applovin.impl.adview;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.StrictMode;
import android.text.TextUtils;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.adview.AppLovinInterstitialActivity;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.p024ad.C1355g;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p026c.C1387g;
import com.applovin.impl.sdk.utils.C1520h;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.applovin.impl.adview.o */
public class C1138o implements AppLovinInterstitialAdDialog {

    /* renamed from: b */
    public static volatile boolean f2085b = false;

    /* renamed from: c */
    public static volatile boolean f2086c = false;

    /* renamed from: d */
    private static final Map<String, C1138o> f2087d = Collections.synchronizedMap(new HashMap());

    /* renamed from: a */
    protected final C1469j f2088a;

    /* renamed from: e */
    private final String f2089e;

    /* renamed from: f */
    private final WeakReference<Context> f2090f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public volatile AppLovinAdLoadListener f2091g;

    /* renamed from: h */
    private volatile AppLovinAdDisplayListener f2092h;

    /* renamed from: i */
    private volatile AppLovinAdVideoPlaybackListener f2093i;

    /* renamed from: j */
    private volatile AppLovinAdClickListener f2094j;

    /* renamed from: k */
    private volatile C1355g f2095k;

    /* renamed from: l */
    private volatile C1355g.C1358b f2096l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public volatile C1092j f2097m;

    C1138o(AppLovinSdk appLovinSdk, Context context) {
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        } else if (context != null) {
            this.f2088a = C1557r.m3585a(appLovinSdk);
            this.f2089e = UUID.randomUUID().toString();
            this.f2090f = new WeakReference<>(context);
            f2085b = true;
            f2086c = false;
        } else {
            throw new IllegalArgumentException("No context specified");
        }
    }

    /* renamed from: a */
    public static C1138o m1748a(String str) {
        return f2087d.get(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1750a(final int i) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (C1138o.this.f2091g != null) {
                    C1138o.this.f2091g.failedToReceiveAd(i);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1751a(Context context) {
        Intent intent = new Intent(context, this.f2095k.mo12817n() ? AppLovinFullscreenActivity.class : AppLovinInterstitialActivity.class);
        intent.putExtra(C1103n.KEY_WRAPPER_ID, this.f2089e);
        C1103n.lastKnownWrapper = this;
        AppLovinFullscreenActivity.parentInterstitialWrapper = this;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (context instanceof Activity) {
            context.startActivity(intent);
            ((Activity) context).overridePendingTransition(0, 0);
        } else {
            intent.setFlags(268435456);
            context.startActivity(intent);
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    /* renamed from: a */
    private void m1755a(C1355g gVar, final Context context) {
        if (this.f2088a.mo13086Z().mo12603b() == null) {
            gVar.mo12814b(true);
            this.f2088a.mo13072L().mo12926a(C1387g.f3260m);
        }
        f2087d.put(this.f2089e, this);
        if (((Boolean) this.f2088a.mo13088a(C1369c.f3124ff)).booleanValue()) {
            this.f2088a.mo13071K().mo13018b().execute(new Runnable() {
                public void run() {
                    System.gc();
                }
            });
        }
        this.f2095k = gVar;
        this.f2096l = this.f2095k.mo12818o();
        final long max = Math.max(0, ((Long) this.f2088a.mo13088a(C1369c.f2978cP)).longValue());
        C1505q v = this.f2088a.mo13139v();
        v.mo13277b("InterstitialAdDialogWrapper", "Presenting ad with delay of " + max);
        m1756a(gVar, context, new Runnable() {
            public void run() {
                new Handler(context.getMainLooper()).postDelayed(new Runnable() {
                    public void run() {
                        C1138o.this.m1751a(context);
                    }
                }, max);
            }
        });
    }

    /* renamed from: a */
    private void m1756a(C1355g gVar, Context context, final Runnable runnable) {
        if (!TextUtils.isEmpty(gVar.mo12756P()) || !gVar.mo12803aq() || C1520h.m3445a(context) || !(context instanceof Activity)) {
            runnable.run();
            return;
        }
        AlertDialog create = new AlertDialog.Builder(context).setTitle(gVar.mo12804ar()).setMessage(gVar.mo12805as()).setPositiveButton(gVar.mo12806at(), (DialogInterface.OnClickListener) null).create();
        create.setOnDismissListener(new DialogInterface.OnDismissListener() {
            public void onDismiss(DialogInterface dialogInterface) {
                runnable.run();
            }
        });
        create.show();
    }

    /* renamed from: a */
    private void m1757a(AppLovinAd appLovinAd) {
        if (this.f2092h != null) {
            this.f2092h.adHidden(appLovinAd);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m1759b(final AppLovinAd appLovinAd) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (C1138o.this.f2091g != null) {
                    C1138o.this.f2091g.adReceived(appLovinAd);
                }
            }
        });
    }

    /* renamed from: h */
    private Context m1760h() {
        WeakReference<Context> weakReference = this.f2090f;
        if (weakReference != null) {
            return (Context) weakReference.get();
        }
        return null;
    }

    /* renamed from: a */
    public C1469j mo12032a() {
        return this.f2088a;
    }

    /* renamed from: a */
    public void mo12033a(C1092j jVar) {
        this.f2097m = jVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12034a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f2088a.mo13131o().loadNextAd(AppLovinAdSize.INTERSTITIAL, appLovinAdLoadListener);
    }

    /* renamed from: b */
    public C1355g mo12035b() {
        return this.f2095k;
    }

    /* renamed from: c */
    public AppLovinAdVideoPlaybackListener mo12036c() {
        return this.f2093i;
    }

    /* renamed from: d */
    public AppLovinAdDisplayListener mo12037d() {
        return this.f2092h;
    }

    public void dismiss() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (C1138o.this.f2097m != null) {
                    C1138o.this.f2097m.dismiss();
                }
            }
        });
    }

    /* renamed from: e */
    public AppLovinAdClickListener mo12038e() {
        return this.f2094j;
    }

    /* renamed from: f */
    public C1355g.C1358b mo12039f() {
        return this.f2096l;
    }

    /* renamed from: g */
    public void mo12040g() {
        f2085b = false;
        f2086c = true;
        f2087d.remove(this.f2089e);
        if (this.f2095k != null && this.f2095k.mo12764X()) {
            this.f2097m = null;
        }
    }

    public boolean isAdReadyToDisplay() {
        return this.f2088a.mo13131o().hasPreloadedAd(AppLovinAdSize.INTERSTITIAL);
    }

    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.f2094j = appLovinAdClickListener;
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f2092h = appLovinAdDisplayListener;
    }

    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f2091g = appLovinAdLoadListener;
    }

    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f2093i = appLovinAdVideoPlaybackListener;
    }

    public void show() {
        mo12034a((AppLovinAdLoadListener) new AppLovinAdLoadListener() {
            public void adReceived(AppLovinAd appLovinAd) {
                C1138o.this.m1759b(appLovinAd);
                C1138o.this.showAndRender(appLovinAd);
            }

            public void failedToReceiveAd(int i) {
                C1138o.this.m1750a(i);
            }
        });
    }

    public void showAndRender(AppLovinAd appLovinAd) {
        String str;
        C1505q qVar;
        Context h = m1760h();
        if (h != null) {
            AppLovinAd a = C1557r.m3586a(appLovinAd, this.f2088a);
            if (a == null) {
                qVar = this.f2088a.mo13139v();
                str = "Failed to show ad: " + appLovinAd;
            } else if (((AppLovinAdBase) a).hasShown() && ((Boolean) this.f2088a.mo13088a(C1369c.f3009cu)).booleanValue()) {
                throw new IllegalStateException("Failed to display ad - ad can only be displayed once. Load the next ad.");
            } else if (a instanceof C1355g) {
                m1755a((C1355g) a, h);
                return;
            } else {
                this.f2088a.mo13139v().mo13281e("InterstitialAdDialogWrapper", "Failed to show interstitial: unknown ad type provided: '" + a + "'");
                m1757a(a);
                return;
            }
        } else {
            qVar = this.f2088a.mo13139v();
            str = "Failed to show interstitial: stale activity reference provided";
        }
        qVar.mo13281e("InterstitialAdDialogWrapper", str);
        m1757a(appLovinAd);
    }

    public String toString() {
        return "AppLovinInterstitialAdDialog{}";
    }
}
