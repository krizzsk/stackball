package com.ironsource.sdk.p147e.p148a;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.ironsrc.Omid;
import com.iab.omid.library.ironsrc.adsession.AdEvents;
import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.AdSessionConfiguration;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.CreativeType;
import com.iab.omid.library.ironsrc.adsession.ImpressionType;
import com.iab.omid.library.ironsrc.adsession.Owner;
import com.iab.omid.library.ironsrc.adsession.Partner;
import com.ironsource.sdk.p145c.C5844d;
import com.ironsource.sdk.p150g.C6015f;
import com.ironsource.sdk.utils.SDKUtils;
import com.smaato.sdk.video.vast.model.StaticResource;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.e.a.a */
public final class C5998a {

    /* renamed from: a */
    private static final Partner f14693a = Partner.createPartner("Ironsrc", "7");

    /* renamed from: b */
    private static AdSession f14694b;

    /* renamed from: c */
    private static boolean f14695c = false;

    /* renamed from: com.ironsource.sdk.e.a.a$a */
    static class C5999a {

        /* renamed from: a */
        public boolean f14696a;

        /* renamed from: b */
        public Owner f14697b;

        /* renamed from: c */
        public Owner f14698c;

        /* renamed from: d */
        public String f14699d;

        /* renamed from: e */
        public ImpressionType f14700e;

        /* renamed from: f */
        public CreativeType f14701f;

        /* renamed from: g */
        public String f14702g;

        /* renamed from: h */
        private Owner f14703h;

        /* renamed from: a */
        public static C5999a m14813a(JSONObject jSONObject) {
            C5999a aVar = new C5999a();
            aVar.f14696a = jSONObject.optBoolean("isolateVerificationScripts", false);
            String optString = jSONObject.optString("impressionOwner", "");
            if (!TextUtils.isEmpty(optString)) {
                try {
                    aVar.f14697b = Owner.valueOf(optString.toUpperCase());
                    String optString2 = jSONObject.optString("videoEventsOwner", "");
                    if (!TextUtils.isEmpty(optString)) {
                        try {
                            aVar.f14698c = Owner.valueOf(optString2.toUpperCase());
                            aVar.f14699d = jSONObject.optString("customReferenceData", "");
                            aVar.f14701f = m14815c(jSONObject);
                            aVar.f14700e = m14814b(jSONObject);
                            String optString3 = jSONObject.optString("adViewId", "");
                            if (!TextUtils.isEmpty(optString3)) {
                                aVar.f14702g = optString3;
                                jSONObject.optBoolean("signalLoaded", false);
                                aVar.f14703h = m14816d(jSONObject);
                                return aVar;
                            }
                            throw new IllegalArgumentException(String.format("Missing OMID webview id", new Object[]{optString3}));
                        } catch (IllegalArgumentException unused) {
                            throw new IllegalArgumentException(String.format("%s | Invalid OMID videoEventsOwner", new Object[]{optString2}));
                        }
                    } else {
                        throw new IllegalArgumentException(String.format("Missing OMID videoEventsOwner", new Object[]{optString2}));
                    }
                } catch (IllegalArgumentException unused2) {
                    throw new IllegalArgumentException(String.format("%s | Invalid OMID impressionOwner", new Object[]{optString}));
                }
            } else {
                throw new IllegalArgumentException(String.format("Missing OMID impressionOwner", new Object[]{optString}));
            }
        }

        /* renamed from: b */
        private static ImpressionType m14814b(JSONObject jSONObject) {
            String optString = jSONObject.optString("impressionType", "");
            if (!TextUtils.isEmpty(optString)) {
                for (ImpressionType impressionType : ImpressionType.values()) {
                    if (optString.equalsIgnoreCase(impressionType.toString())) {
                        return impressionType;
                    }
                }
                throw new IllegalArgumentException(String.format("Missing OMID creativeType", new Object[]{optString}));
            }
            throw new IllegalArgumentException(String.format("Missing OMID creativeType", new Object[]{optString}));
        }

        /* renamed from: c */
        private static CreativeType m14815c(JSONObject jSONObject) {
            String optString = jSONObject.optString(StaticResource.CREATIVE_TYPE, "");
            if (!TextUtils.isEmpty(optString)) {
                for (CreativeType creativeType : CreativeType.values()) {
                    if (optString.equalsIgnoreCase(creativeType.toString())) {
                        return creativeType;
                    }
                }
                throw new IllegalArgumentException(String.format("Missing OMID creativeType", new Object[]{optString}));
            }
            throw new IllegalArgumentException(String.format("Missing OMID creativeType", new Object[]{optString}));
        }

        /* renamed from: d */
        private static Owner m14816d(JSONObject jSONObject) {
            try {
                return Owner.valueOf(jSONObject.optString("videoEventsOwner", "").toUpperCase());
            } catch (IllegalArgumentException unused) {
                return Owner.NONE;
            }
        }
    }

    /* renamed from: a */
    public static C6015f m14807a() {
        C6015f fVar = new C6015f();
        fVar.mo42559a(SDKUtils.encodeString("omidVersion"), SDKUtils.encodeString(Omid.getVersion()));
        fVar.mo42559a(SDKUtils.encodeString("omidPartnerName"), SDKUtils.encodeString("Ironsrc"));
        fVar.mo42559a(SDKUtils.encodeString("omidPartnerVersion"), SDKUtils.encodeString("7"));
        return fVar;
    }

    /* renamed from: a */
    public static void m14808a(Context context) {
        if (!f14695c) {
            Omid.activate(context);
            f14695c = true;
        }
    }

    /* renamed from: a */
    public static void m14809a(JSONObject jSONObject) {
        m14812c();
        AdEvents createAdEvents = AdEvents.createAdEvents(f14694b);
        try {
            if (((Boolean) jSONObject.get("signalLoaded")).booleanValue()) {
                createAdEvents.loaded();
            }
        } catch (Exception unused) {
        }
        createAdEvents.impressionOccurred();
    }

    /* renamed from: a */
    public static void m14810a(JSONObject jSONObject, WebView webView) {
        C5999a a = C5999a.m14813a(jSONObject);
        if (!f14695c) {
            throw new IllegalStateException("OMID has not been activated");
        } else if (f14694b != null) {
            throw new IllegalStateException("OMID Session has already started");
        } else if (TextUtils.isEmpty(a.f14702g) || (webView = C5844d.m14444a().mo42194a(a.f14702g)) != null) {
            AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(a.f14701f, a.f14700e, a.f14697b, a.f14698c, a.f14696a), AdSessionContext.createHtmlAdSessionContext(f14693a, webView, (String) null, a.f14699d));
            createAdSession.registerAdView(webView);
            f14694b = createAdSession;
            createAdSession.start();
        } else {
            throw new IllegalStateException("webview not found");
        }
    }

    /* renamed from: b */
    public static void m14811b() {
        m14812c();
        f14694b.finish();
        f14694b = null;
    }

    /* renamed from: c */
    private static void m14812c() {
        if (!f14695c) {
            throw new IllegalStateException("OMID has not been activated");
        } else if (f14694b == null) {
            throw new IllegalStateException("OMID Session has not started");
        }
    }
}
