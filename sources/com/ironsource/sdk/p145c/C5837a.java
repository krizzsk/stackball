package com.ironsource.sdk.p145c;

import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.c.a */
public final class C5837a extends FrameLayout implements C5846e {

    /* renamed from: a */
    public C5840c f14214a;

    /* renamed from: b */
    public boolean f14215b = false;

    /* renamed from: c */
    private Activity f14216c;

    public C5837a(C5840c cVar, Activity activity) {
        super(activity.getApplicationContext());
        setLayoutParams(new FrameLayout.LayoutParams(cVar.f14225d.f14148a, cVar.f14225d.f14149b));
        this.f14216c = activity;
        this.f14214a = cVar;
        addView(cVar.f14223b);
    }

    /* renamed from: a */
    public final WebView mo42178a() {
        return this.f14214a.f14223b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo42179a(final java.lang.String r4, final java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.ironsource.sdk.c.c r0 = r3.f14214a     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0034
            com.ironsource.sdk.c.c r0 = r3.f14214a     // Catch:{ all -> 0x0036 }
            com.ironsource.sdk.b.b r0 = r0.f14224c     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0034
            com.ironsource.sdk.c.c r0 = r3.f14214a     // Catch:{ all -> 0x0036 }
            android.webkit.WebView r0 = r0.f14223b     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0012
            goto L_0x0034
        L_0x0012:
            com.ironsource.sdk.c.c r0 = r3.f14214a     // Catch:{ all -> 0x0036 }
            com.ironsource.sdk.b.b r0 = r0.f14224c     // Catch:{ all -> 0x0036 }
            com.ironsource.sdk.b.a r1 = r0.f14193b     // Catch:{ all -> 0x0036 }
            if (r1 == 0) goto L_0x0028
            com.ironsource.sdk.b.d r1 = r0.f14194c     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x001f
            goto L_0x0028
        L_0x001f:
            org.json.JSONObject r1 = r0.mo42162a()     // Catch:{ all -> 0x0036 }
            java.lang.String r2 = "containerWasRemoved"
            r0.mo42168a((java.lang.String) r2, (org.json.JSONObject) r1)     // Catch:{ all -> 0x0036 }
        L_0x0028:
            android.app.Activity r0 = r3.f14216c     // Catch:{ all -> 0x0036 }
            com.ironsource.sdk.c.a$1 r1 = new com.ironsource.sdk.c.a$1     // Catch:{ all -> 0x0036 }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x0036 }
            r0.runOnUiThread(r1)     // Catch:{ all -> 0x0036 }
            monitor-exit(r3)
            return
        L_0x0034:
            monitor-exit(r3)
            return
        L_0x0036:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.p145c.C5837a.mo42179a(java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo42180a(String str, String str2, String str3) {
        C5840c cVar = this.f14214a;
        if (cVar != null) {
            cVar.mo42180a(str, str2, str3);
        }
    }

    /* renamed from: a */
    public final void mo42181a(JSONObject jSONObject, String str, String str2) {
        this.f14214a.mo42181a(jSONObject, str, str2);
    }

    /* renamed from: b */
    public final void mo42182b(JSONObject jSONObject, String str, String str2) {
        this.f14214a.mo42182b(jSONObject, str, str2);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Logger.m14957i("IronSourceAdContainer", "onAttachedToWindow:");
        this.f14215b = true;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        String str;
        super.onDetachedFromWindow();
        Logger.m14957i("IronSourceAdContainer", "onDetachedFromWindow:");
        C5840c cVar = this.f14214a;
        if (cVar == null || cVar.f14224c == null) {
            str = "in onDetachedFromWindow mAdPresenter or mAdPresenter.getLogic() are null";
        } else {
            this.f14215b = false;
            try {
                this.f14214a.f14224c.mo42168a("destroyBanner", new JSONObject().put("adViewId", this.f14214a.f14222a).put("isBNAutoRemove", true).put("isBannerDisplay", this.f14215b));
                return;
            } catch (Exception e) {
                str = e.toString();
            }
        }
        Logger.m14957i("IronSourceAdContainer", str);
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        Logger.m14957i("IronSourceAdContainer", "onVisibilityChanged: " + i);
        C5840c cVar = this.f14214a;
        if (cVar != null) {
            try {
                cVar.f14224c.mo42165a("isVisible", i, isShown());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        Logger.m14957i("IronSourceAdContainer", "onWindowVisibilityChanged: " + i);
        C5840c cVar = this.f14214a;
        if (cVar != null) {
            try {
                cVar.f14224c.mo42165a("isWindowVisible", i, isShown());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
