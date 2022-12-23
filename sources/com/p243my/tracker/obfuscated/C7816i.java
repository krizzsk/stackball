package com.p243my.tracker.obfuscated;

import android.content.Intent;
import android.net.Uri;

/* renamed from: com.my.tracker.obfuscated.i */
public final class C7816i {

    /* renamed from: a */
    private final C7828m f19883a;

    private C7816i(C7828m mVar) {
        this.f19883a = mVar;
    }

    /* renamed from: a */
    public static C7816i m21189a(C7828m mVar) {
        return new C7816i(mVar);
    }

    /* renamed from: a */
    public String mo52290a(Intent intent) {
        C7877u0.m21547a("DeeplinkHandler: handling deeplink");
        if (intent == null) {
            C7877u0.m21547a("DeeplinkHandler: intent is null");
            return null;
        }
        try {
            Uri data = intent.getData();
            if (data == null) {
                C7877u0.m21547a("DeeplinkHandler: intent data is null");
                return null;
            }
            C7877u0.m21547a("DeeplinkHandler: intent data: " + data);
            String queryParameter = data.getQueryParameter("mt_deeplink");
            String queryParameter2 = data.getQueryParameter("mt_click_id");
            if (queryParameter != null) {
                C7877u0.m21547a("DeeplinkHandler: found mt_deeplink in intent");
            } else {
                C7877u0.m21547a("DeeplinkHandler: mt_deeplink not found in intent");
                queryParameter = data.toString();
            }
            C7877u0.m21547a("DeeplinkHandler: deeplink " + queryParameter);
            C7877u0.m21547a("DeeplinkHandler: clickId " + queryParameter2);
            this.f19883a.mo52357a(queryParameter, queryParameter2);
            return queryParameter;
        } catch (Throwable th) {
            C7877u0.m21552b("DeeplinkHandler error: ", th);
            return null;
        }
    }
}
