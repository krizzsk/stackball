package com.adcolony.sdk;

import android.webkit.WebView;
import com.adcolony.sdk.C0580a0;
import com.iab.omid.library.adcolony.adsession.AdEvents;
import com.iab.omid.library.adcolony.adsession.AdSession;
import com.iab.omid.library.adcolony.adsession.AdSessionConfiguration;
import com.iab.omid.library.adcolony.adsession.AdSessionContext;
import com.iab.omid.library.adcolony.adsession.CreativeType;
import com.iab.omid.library.adcolony.adsession.ImpressionType;
import com.iab.omid.library.adcolony.adsession.Owner;
import com.iab.omid.library.adcolony.adsession.VerificationScriptResource;
import com.iab.omid.library.adcolony.adsession.media.InteractionType;
import com.iab.omid.library.adcolony.adsession.media.MediaEvents;
import com.iab.omid.library.adcolony.adsession.media.Position;
import com.iab.omid.library.adcolony.adsession.media.VastProperties;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.adcolony.sdk.k0 */
class C0742k0 {

    /* renamed from: a */
    private AdSession f1157a;

    /* renamed from: b */
    private AdEvents f1158b;

    /* renamed from: c */
    private MediaEvents f1159c;

    /* renamed from: d */
    private List<VerificationScriptResource> f1160d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f1161e = -1;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f1162f = "";

    /* renamed from: g */
    private boolean f1163g;

    /* renamed from: h */
    private boolean f1164h;

    /* renamed from: i */
    private boolean f1165i;

    /* renamed from: j */
    private boolean f1166j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f1167k;

    /* renamed from: l */
    private int f1168l;

    /* renamed from: m */
    private int f1169m;

    /* renamed from: n */
    private String f1170n = "";
    /* access modifiers changed from: private */

    /* renamed from: o */
    public String f1171o = "";

    /* renamed from: com.adcolony.sdk.k0$a */
    class C0743a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f1172a;

        C0743a(String str) {
            this.f1172a = str;
        }

        public void run() {
            C0897z0 b = C0894y.m1151b();
            C0897z0 b2 = C0894y.m1151b();
            C0894y.m1156b(b2, "session_type", C0742k0.this.f1161e);
            C0894y.m1148a(b2, "session_id", C0742k0.this.f1162f);
            C0894y.m1148a(b2, "event", this.f1172a);
            C0894y.m1148a(b, "type", "iab_hook");
            C0894y.m1148a(b, "message", b2.toString());
            new C0645d0("CustomMessage.controller_send", 0, b).mo9536d();
        }
    }

    /* renamed from: com.adcolony.sdk.k0$b */
    class C0744b implements AdColonyCustomMessageListener {

        /* renamed from: com.adcolony.sdk.k0$b$a */
        class C0745a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f1175a;

            /* renamed from: b */
            final /* synthetic */ String f1176b;

            /* renamed from: c */
            final /* synthetic */ float f1177c;

            C0745a(String str, String str2, float f) {
                this.f1175a = str;
                this.f1176b = str2;
                this.f1177c = f;
            }

            public void run() {
                if (this.f1175a.equals(C0742k0.this.f1171o)) {
                    C0742k0.this.mo9692a(this.f1176b, this.f1177c);
                    return;
                }
                AdColonyAdView adColonyAdView = C0578a.m143c().mo9597d().mo9506d().get(this.f1175a);
                C0742k0 omidManager = adColonyAdView != null ? adColonyAdView.getOmidManager() : null;
                if (omidManager != null) {
                    omidManager.mo9692a(this.f1176b, this.f1177c);
                }
            }
        }

        C0744b() {
        }

        public void onAdColonyCustomMessage(AdColonyCustomMessage adColonyCustomMessage) {
            C0897z0 b = C0894y.m1153b(adColonyCustomMessage.getMessage());
            String h = C0894y.m1169h(b, "event_type");
            float floatValue = BigDecimal.valueOf(C0894y.m1160c(b, "duration")).floatValue();
            boolean b2 = C0894y.m1155b(b, "replay");
            boolean equals = C0894y.m1169h(b, "skip_type").equals("dec");
            String h2 = C0894y.m1169h(b, "asi");
            if (h.equals("skip") && equals) {
                boolean unused = C0742k0.this.f1167k = true;
            } else if (!b2 || (!h.equals("start") && !h.equals(CampaignEx.JSON_NATIVE_VIDEO_FIRST_QUARTILE) && !h.equals("midpoint") && !h.equals(CampaignEx.JSON_NATIVE_VIDEO_THIRD_QUARTILE) && !h.equals("complete"))) {
                C0849u0.m931b((Runnable) new C0745a(h2, h, floatValue));
            }
        }
    }

    C0742k0(C0897z0 z0Var, String str) {
        VerificationScriptResource verificationScriptResource;
        this.f1161e = m576a(z0Var);
        this.f1166j = C0894y.m1155b(z0Var, "skippable");
        this.f1168l = C0894y.m1163d(z0Var, "skip_offset");
        this.f1169m = C0894y.m1163d(z0Var, "video_duration");
        C0895y0 a = C0894y.m1136a(z0Var, "js_resources");
        C0895y0 a2 = C0894y.m1136a(z0Var, "verification_params");
        C0895y0 a3 = C0894y.m1136a(z0Var, "vendor_keys");
        this.f1171o = str;
        for (int i = 0; i < a.mo10032c(); i++) {
            try {
                String d = C0894y.m1164d(a2, i);
                String d2 = C0894y.m1164d(a3, i);
                URL url = new URL(C0894y.m1164d(a, i));
                if (!d.equals("") && !d2.equals("")) {
                    verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithParameters(d2, url, d);
                } else if (!d2.equals("")) {
                    verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url);
                } else {
                    verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url);
                }
                this.f1160d.add(verificationScriptResource);
            } catch (MalformedURLException unused) {
                new C0580a0.C0581a().mo9419a("Invalid js resource url passed to Omid").mo9421a(C0580a0.f192j);
            }
        }
        try {
            this.f1170n = C0578a.m143c().mo9614r().mo9895a(C0894y.m1169h(z0Var, "filepath"), true).toString();
        } catch (IOException unused2) {
            new C0580a0.C0581a().mo9419a("Error loading IAB JS Client").mo9421a(C0580a0.f192j);
        }
    }

    /* renamed from: e */
    private void m582e() {
        AdColony.addCustomMessageListener(new C0744b(), "viewability_ad_event");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo9695d() {
        return this.f1161e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo9696f() {
        this.f1164h = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9693b() {
        AdColony.removeCustomMessageListener("viewability_ad_event");
        this.f1157a.finish();
        m580b("end_session");
        this.f1157a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public AdSession mo9694c() {
        return this.f1157a;
    }

    /* renamed from: a */
    private int m576a(C0897z0 z0Var) {
        if (this.f1161e == -1) {
            int d = C0894y.m1163d(z0Var, "ad_unit_type");
            String h = C0894y.m1169h(z0Var, "ad_type");
            if (d == 0) {
                return 0;
            }
            if (d == 1) {
                if (h.equals("video")) {
                    return 0;
                }
                if (h.equals("display")) {
                    return 1;
                }
                if (h.equals("banner_display") || h.equals("interstitial_display")) {
                    return 2;
                }
            }
        }
        return this.f1161e;
    }

    /* renamed from: b */
    private void m580b(String str) {
        if (!C0849u0.m915a((Runnable) new C0743a(str))) {
            new C0580a0.C0581a().mo9419a("Executing ADCOmidManager.sendIabCustomMessage failed").mo9421a(C0580a0.f192j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9690a(C0589c cVar) {
        MediaEvents mediaEvents;
        VastProperties vastProperties;
        if (!this.f1165i && this.f1161e >= 0 && this.f1157a != null) {
            m579b(cVar);
            m582e();
            if (this.f1161e != 0) {
                mediaEvents = null;
            } else {
                mediaEvents = MediaEvents.createMediaEvents(this.f1157a);
            }
            this.f1159c = mediaEvents;
            this.f1157a.start();
            this.f1158b = AdEvents.createAdEvents(this.f1157a);
            m580b("start_session");
            if (this.f1159c != null) {
                Position position = Position.PREROLL;
                if (this.f1166j) {
                    vastProperties = VastProperties.createVastPropertiesForSkippableMedia((float) this.f1168l, true, position);
                } else {
                    vastProperties = VastProperties.createVastPropertiesForNonSkippableMedia(true, position);
                }
                this.f1158b.loaded(vastProperties);
            } else {
                this.f1158b.loaded();
            }
            this.f1165i = true;
        }
    }

    /* renamed from: b */
    private void m579b(C0589c cVar) {
        m580b("register_ad_view");
        C0872w0 w0Var = C0578a.m143c().mo9573E().get(Integer.valueOf(cVar.mo9469k()));
        if (w0Var == null && !cVar.mo9472n().isEmpty()) {
            w0Var = (C0872w0) cVar.mo9472n().entrySet().iterator().next().getValue();
        }
        AdSession adSession = this.f1157a;
        if (adSession != null && w0Var != null) {
            adSession.registerAdView(w0Var);
            w0Var.mo9962f();
        } else if (adSession != null) {
            adSession.registerAdView(cVar);
            cVar.mo9445a(this.f1157a);
            m580b("register_obstructions");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9688a() throws IllegalArgumentException {
        mo9689a((WebView) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9689a(WebView webView) throws IllegalArgumentException {
        String str;
        List<VerificationScriptResource> list;
        if (this.f1161e >= 0 && (str = this.f1170n) != null && !str.equals("") && (list = this.f1160d) != null) {
            if (!list.isEmpty() || mo9695d() == 2) {
                C0693i c = C0578a.m143c();
                Owner owner = Owner.NATIVE;
                ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
                int d = mo9695d();
                if (d == 0) {
                    CreativeType creativeType = CreativeType.VIDEO;
                    AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false), AdSessionContext.createNativeAdSessionContext(c.mo9619w(), this.f1170n, this.f1160d, (String) null, (String) null));
                    this.f1157a = createAdSession;
                    this.f1162f = createAdSession.getAdSessionId();
                    m580b("inject_javascript");
                } else if (d == 1) {
                    CreativeType creativeType2 = CreativeType.NATIVE_DISPLAY;
                    AdSession createAdSession2 = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType2, impressionType, owner, (Owner) null, false), AdSessionContext.createNativeAdSessionContext(c.mo9619w(), this.f1170n, this.f1160d, (String) null, (String) null));
                    this.f1157a = createAdSession2;
                    this.f1162f = createAdSession2.getAdSessionId();
                    m580b("inject_javascript");
                } else if (d == 2) {
                    CreativeType creativeType3 = CreativeType.HTML_DISPLAY;
                    AdSession createAdSession3 = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType3, impressionType, owner, (Owner) null, false), AdSessionContext.createHtmlAdSessionContext(c.mo9619w(), webView, "", (String) null));
                    this.f1157a = createAdSession3;
                    this.f1162f = createAdSession3.getAdSessionId();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9691a(String str) {
        mo9692a(str, 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9692a(String str, float f) {
        if (C0578a.m144d() && this.f1157a != null) {
            if (this.f1159c != null || str.equals("start") || str.equals("skip") || str.equals("continue") || str.equals("cancel")) {
                char c = 65535;
                try {
                    switch (str.hashCode()) {
                        case -1941887438:
                            if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_FIRST_QUARTILE)) {
                                c = 1;
                                break;
                            }
                            break;
                        case -1710060637:
                            if (str.equals("buffer_start")) {
                                c = 12;
                                break;
                            }
                            break;
                        case -1638835128:
                            if (str.equals("midpoint")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -1367724422:
                            if (str.equals("cancel")) {
                                c = 7;
                                break;
                            }
                            break;
                        case -934426579:
                            if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_RESUME)) {
                                c = 11;
                                break;
                            }
                            break;
                        case -651914917:
                            if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_THIRD_QUARTILE)) {
                                c = 3;
                                break;
                            }
                            break;
                        case -599445191:
                            if (str.equals("complete")) {
                                c = 4;
                                break;
                            }
                            break;
                        case -567202649:
                            if (str.equals("continue")) {
                                c = 5;
                                break;
                            }
                            break;
                        case -342650039:
                            if (str.equals("sound_mute")) {
                                c = 8;
                                break;
                            }
                            break;
                        case 3532159:
                            if (str.equals("skip")) {
                                c = 6;
                                break;
                            }
                            break;
                        case 106440182:
                            if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_PAUSE)) {
                                c = 10;
                                break;
                            }
                            break;
                        case 109757538:
                            if (str.equals("start")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 583742045:
                            if (str.equals("in_video_engagement")) {
                                c = 14;
                                break;
                            }
                            break;
                        case 823102269:
                            if (str.equals("html5_interaction")) {
                                c = 15;
                                break;
                            }
                            break;
                        case 1648173410:
                            if (str.equals("sound_unmute")) {
                                c = 9;
                                break;
                            }
                            break;
                        case 1906584668:
                            if (str.equals("buffer_end")) {
                                c = 13;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            this.f1158b.impressionOccurred();
                            MediaEvents mediaEvents = this.f1159c;
                            if (mediaEvents != null) {
                                if (f <= 0.0f) {
                                    f = (float) this.f1169m;
                                }
                                mediaEvents.start(f, 1.0f);
                            }
                            m580b(str);
                            return;
                        case 1:
                            this.f1159c.firstQuartile();
                            m580b(str);
                            return;
                        case 2:
                            this.f1159c.midpoint();
                            m580b(str);
                            return;
                        case 3:
                            this.f1159c.thirdQuartile();
                            m580b(str);
                            return;
                        case 4:
                            this.f1167k = true;
                            this.f1159c.complete();
                            m580b(str);
                            return;
                        case 5:
                            m580b(str);
                            mo9693b();
                            return;
                        case 6:
                        case 7:
                            MediaEvents mediaEvents2 = this.f1159c;
                            if (mediaEvents2 != null) {
                                mediaEvents2.skipped();
                            }
                            m580b(str);
                            mo9693b();
                            return;
                        case 8:
                            this.f1159c.volumeChange(0.0f);
                            m580b(str);
                            return;
                        case 9:
                            this.f1159c.volumeChange(1.0f);
                            m580b(str);
                            return;
                        case 10:
                            if (!this.f1163g && !this.f1164h && !this.f1167k) {
                                this.f1159c.pause();
                                m580b(str);
                                this.f1163g = true;
                                this.f1164h = false;
                                return;
                            }
                            return;
                        case 11:
                            if (this.f1163g && !this.f1167k) {
                                this.f1159c.resume();
                                m580b(str);
                                this.f1163g = false;
                                return;
                            }
                            return;
                        case 12:
                            this.f1159c.bufferStart();
                            m580b(str);
                            return;
                        case 13:
                            this.f1159c.bufferFinish();
                            m580b(str);
                            return;
                        case 14:
                        case 15:
                            this.f1159c.adUserInteraction(InteractionType.CLICK);
                            m580b(str);
                            if (this.f1164h && !this.f1163g && !this.f1167k) {
                                this.f1159c.pause();
                                m580b(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
                                this.f1163g = true;
                                this.f1164h = false;
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                } catch (IllegalArgumentException | IllegalStateException e) {
                    C0580a0.C0581a a = new C0580a0.C0581a().mo9419a("Recording IAB event for ").mo9419a(str);
                    a.mo9419a(" caused " + e.getClass()).mo9421a(C0580a0.f190h);
                }
            }
        }
    }
}
