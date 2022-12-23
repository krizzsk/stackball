package com.p243my.tracker.obfuscated;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.p243my.tracker.MyTracker;
import com.p243my.tracker.MyTrackerAttribution;
import java.net.URLDecoder;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.e */
public final class C7808e {

    /* renamed from: a */
    final AtomicBoolean f19869a = new AtomicBoolean(false);

    /* renamed from: b */
    final C7880v0 f19870b;

    /* renamed from: c */
    final Context f19871c;

    C7808e(C7880v0 v0Var, Context context) {
        this.f19870b = v0Var;
        this.f19871c = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C7808e m21169a(C7880v0 v0Var, Context context) {
        return new C7808e(v0Var, context);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m21170a(MyTracker.AttributionListener attributionListener, MyTrackerAttribution myTrackerAttribution) {
        try {
            attributionListener.onReceiveAttribution(myTrackerAttribution);
        } catch (Throwable unused) {
            C7877u0.m21551b("AttributionHandler error: exception at AttributionListener::onReceiveAttribution()");
        }
    }

    /* renamed from: a */
    public void mo52279a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "AttributionHandler: referrer is empty";
        } else if (mo52281a()) {
            str2 = "AttributionHandler: attribution has already been received";
        } else {
            try {
                String queryParameter = Uri.parse("https://my.com/?" + URLDecoder.decode(str, "UTF-8")).getQueryParameter("mt_deeplink");
                if (TextUtils.isEmpty(queryParameter)) {
                    C7877u0.m21547a("AttributionHandler: deeplink is empty");
                    return;
                } else {
                    mo52280a(new JSONObject().put("deeplink", queryParameter));
                    return;
                }
            } catch (Throwable th) {
                C7877u0.m21552b("AttributionHandler error: handling referrer failed with error: ", th);
                return;
            }
        }
        C7877u0.m21547a(str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo52280a(JSONObject jSONObject) {
        String optString = jSONObject.optString("deeplink");
        if (TextUtils.isEmpty(optString)) {
            C7877u0.m21547a("AttributionHandler: deeplink is empty");
        } else if (!this.f19869a.compareAndSet(false, true)) {
            C7877u0.m21547a("AttributionHandler: attribution has already been received");
        } else {
            C7823k0 a = C7823k0.m21211a(this.f19871c);
            if (!TextUtils.isEmpty(a.mo52317f())) {
                C7877u0.m21547a("AttributionHandler: attribution has already been received");
                return;
            }
            a.mo52324i(jSONObject.toString());
            MyTracker.AttributionListener c = this.f19870b.mo52529c();
            if (c != null) {
                Handler b = this.f19870b.mo52525b();
                if (b == null) {
                    b = C7806d.f19851a;
                }
                try {
                    b.post(new Runnable(MyTrackerAttribution.newAttribution(optString)) {
                        public final /* synthetic */ MyTrackerAttribution f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            C7808e.m21170a(MyTracker.AttributionListener.this, this.f$1);
                        }
                    });
                } catch (Throwable th) {
                    C7877u0.m21552b("AttributionHandler error: exception occurred while post runnable", th);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo52281a() {
        if (this.f19869a.get()) {
            return true;
        }
        return !TextUtils.isEmpty(C7823k0.m21211a(this.f19871c).mo52317f());
    }

    /* renamed from: b */
    public void mo52282b(String str) {
        if (mo52281a()) {
            C7877u0.m21547a("AttributionHandler: attribution has already been received");
            return;
        }
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("attribution");
            if (optJSONObject == null) {
                C7877u0.m21547a("AttributionHandler: empty attribution object has been returned");
            } else if (optJSONObject.has("error")) {
                int optInt = optJSONObject.optInt("error");
                C7877u0.m21547a("AttributionHandler: attribution response returned error " + optInt);
            } else {
                mo52280a(optJSONObject);
            }
        } catch (Throwable th) {
            C7877u0.m21552b("AttributionHandler error: handling server attribution failed with error: ", th);
        }
    }
}
