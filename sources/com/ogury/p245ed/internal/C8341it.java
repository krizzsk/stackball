package com.ogury.p245ed.internal;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.NativeProtocol;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ogury.p245ed.internal.C8350iz;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import com.smaato.sdk.video.vast.model.Creative;
import com.tapjoy.TJAdUnitConstants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.it */
public abstract class C8341it implements C8291hj {

    /* renamed from: a */
    public static final C8342a f21547a = new C8342a((byte) 0);

    /* renamed from: b */
    private final C8282hb f21548b;

    /* renamed from: c */
    private C8129da f21549c = C8129da.f21066a;

    /* renamed from: a */
    public void mo53757a() {
    }

    /* renamed from: a */
    public void mo53760a(C8195ek ekVar) {
        C8467mq.m23881b(ekVar, IronSourceConstants.EVENTS_AD_UNIT);
    }

    /* renamed from: a */
    public void mo53761a(C8350iz izVar) {
    }

    /* renamed from: a */
    public void mo53762a(String str) {
        C8467mq.m23881b(str, Creative.AD_ID);
    }

    /* renamed from: a */
    public void mo53763a(String str, String str2) {
        C8467mq.m23881b(str2, Creative.AD_ID);
    }

    /* renamed from: a */
    public void mo53764a(String str, String str2, String str3) {
        C8467mq.m23881b(str2, TJAdUnitConstants.String.CALLBACK_ID);
        C8467mq.m23881b(str3, Creative.AD_ID);
    }

    /* renamed from: a */
    public void mo53765a(Map<String, String> map, String str) {
        C8467mq.m23881b(map, NativeProtocol.WEB_DIALOG_PARAMS);
        C8467mq.m23881b(str, "args");
    }

    /* renamed from: a */
    public void mo53758a(boolean z) {
    }

    /* renamed from: b */
    public void mo53766b() {
    }

    /* renamed from: b */
    public void mo53767b(String str) {
        C8467mq.m23881b(str, Creative.AD_ID);
    }

    /* renamed from: b */
    public void mo53768b(String str, String str2) {
        C8467mq.m23881b(str2, TJAdUnitConstants.String.CALLBACK_ID);
    }

    /* renamed from: b */
    public void mo53759b(boolean z) {
    }

    /* renamed from: c */
    public void mo53769c() {
    }

    /* renamed from: c */
    public void mo53770c(String str) {
        C8467mq.m23881b(str, Creative.AD_ID);
    }

    /* renamed from: c */
    public void mo53771c(boolean z) {
    }

    public C8341it(C8282hb hbVar) {
        C8467mq.m23881b(hbVar, "mraidCommandExecutor");
        this.f21548b = hbVar;
    }

    /* renamed from: com.ogury.ed.internal.it$a */
    public static final class C8342a {
        public /* synthetic */ C8342a(byte b) {
            this();
        }

        private C8342a() {
        }
    }

    /* renamed from: a */
    public final boolean mo53657a(String str, C8362jh jhVar, C8185eb ebVar) {
        C8467mq.m23881b(str, "url");
        C8467mq.m23881b(jhVar, "webView");
        C8467mq.m23881b(ebVar, "ad");
        C8264gn.m23206a(str);
        if (!m23583a(jhVar)) {
            return true;
        }
        m23580a(str, ebVar);
        return true;
    }

    /* renamed from: a */
    private static boolean m23583a(C8362jh jhVar) {
        return !C8467mq.m23880a((Object) jhVar.getAdState(), (Object) "hidden") && !C8467mq.m23880a((Object) jhVar.getAdState(), (Object) "loading");
    }

    /* renamed from: a */
    private final void m23580a(String str, C8185eb ebVar) {
        String str2;
        Map linkedHashMap = new LinkedHashMap();
        try {
            JSONObject d = m23587d(str);
            str2 = d.optString("method", "");
            C8467mq.m23878a((Object) str2, "json.optString(\"method\", \"\")");
            try {
                String optString = d.optString(TJAdUnitConstants.String.CALLBACK_ID);
                C8467mq.m23878a((Object) optString, "json.optString(\"callbackId\")");
                linkedHashMap.put(TJAdUnitConstants.String.CALLBACK_ID, optString);
                Object opt = d.opt("args");
                if (opt == null) {
                    opt = "";
                }
                m23579a(opt, (Map<String, String>) linkedHashMap);
                m23581a(str2, linkedHashMap, opt.toString(), ebVar);
            } catch (Exception e) {
                e = e;
                C8129da.m22652a(e);
                this.f21548b.mo53640a(str2, "");
            }
        } catch (Exception e2) {
            e = e2;
            str2 = "";
            C8129da.m22652a(e);
            this.f21548b.mo53640a(str2, "");
        }
    }

    /* renamed from: a */
    private static void m23579a(Object obj, Map<String, String> map) {
        if (obj != null && (obj instanceof JSONObject)) {
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> keys = jSONObject.keys();
            C8467mq.m23878a((Object) keys, "keys");
            while (keys.hasNext()) {
                String next = keys.next();
                C8467mq.m23878a((Object) next, SDKConstants.PARAM_KEY);
                String optString = jSONObject.optString(next, "");
                C8467mq.m23878a((Object) optString, "args.optString(key, \"\")");
                map.put(next, optString);
            }
        }
    }

    /* renamed from: d */
    private static JSONObject m23587d(String str) {
        int a = C8516oc.m23954a((CharSequence) str, "/?q=") + 4;
        if (str != null) {
            String substring = str.substring(a);
            C8467mq.m23878a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            return new JSONObject(C8264gn.m23206a(substring));
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    private final void m23581a(String str, Map<String, String> map, String str2, C8185eb ebVar) {
        String str3 = "";
        switch (str.hashCode()) {
            case -1289167206:
                if (str.equals(MraidJsMethods.EXPAND)) {
                    mo53769c();
                    return;
                }
                return;
            case -984419449:
                if (str.equals("ogyResolveIntent")) {
                    String str4 = map.get("intentUri");
                    String str5 = map.get(TJAdUnitConstants.String.CALLBACK_ID);
                    if (str5 != null) {
                        str3 = str5;
                    }
                    mo53768b(str4, str3);
                    return;
                }
                return;
            case -934437708:
                if (str.equals(MraidJsMethods.RESIZE)) {
                    m23588d();
                    return;
                }
                return;
            case -840442113:
                if (str.equals(MraidJsMethods.UNLOAD)) {
                    mo53757a();
                    return;
                }
                return;
            case -12713460:
                if (str.equals("ogyOnAdImpression")) {
                    m23578a(ebVar);
                    return;
                }
                return;
            case 3417674:
                if (str.equals("open")) {
                    mo53763a(map.get("url"), ebVar.mo53365m().mo53410b());
                    return;
                }
                return;
            case 94756344:
                if (str.equals("close")) {
                    m23582a(map, false);
                    return;
                }
                return;
            case 451326307:
                if (str.equals("ogyCreateShortcut")) {
                    mo53765a(map, str2);
                    return;
                }
                return;
            case 624734601:
                if (str.equals("setResizeProperties")) {
                    m23589d(map);
                    return;
                }
                return;
            case 901631159:
                if (str.equals("ogyOnAdEvent")) {
                    mo53760a(ebVar.mo53365m());
                    return;
                }
                return;
            case 1121179396:
                if (str.equals("ogyOnAdClicked")) {
                    mo53767b(ebVar.mo53365m().mo53410b());
                    return;
                }
                return;
            case 1614272768:
                if (str.equals("useCustomClose")) {
                    m23586c(map);
                    return;
                }
                return;
            case 1622028878:
                if (str.equals("ogyForceClose")) {
                    m23582a(map, true);
                    return;
                }
                return;
            case 1805873469:
                if (str.equals("ogyStartIntent")) {
                    String str6 = map.get("intentUri");
                    String str7 = map.get(TJAdUnitConstants.String.CALLBACK_ID);
                    if (str7 != null) {
                        str3 = str7;
                    }
                    mo53764a(str6, str3, ebVar.mo53365m().mo53410b());
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private final void m23582a(Map<String, String> map, boolean z) {
        boolean a = m23584a(map);
        if (z) {
            mo53771c(a);
        } else {
            mo53758a(a);
        }
        if (a) {
            m23585b(map);
        }
    }

    /* renamed from: a */
    private static boolean m23584a(Map<String, String> map) {
        String str = map.get("showNextAd");
        if (str == null) {
            return true;
        }
        return str.equals("true");
    }

    /* renamed from: b */
    private final void m23585b(Map<String, String> map) {
        String str = map.get("nextAdId");
        if (str == null) {
            str = "";
        }
        mo53762a(str);
    }

    /* renamed from: c */
    private final void m23586c(Map<String, String> map) {
        String str = map.get("useCustomClose");
        mo53759b(str == null ? false : str.equals("false"));
    }

    /* renamed from: d */
    private final void m23589d(Map<String, String> map) {
        C8350iz.C8351a aVar = C8350iz.f21570a;
        C8350iz a = C8350iz.C8351a.m23656a(map);
        mo53761a(a);
        if (a == null) {
            this.f21548b.mo53640a("setResizeProperties", "Wrong parameters");
        }
    }

    /* renamed from: d */
    private final void m23588d() {
        try {
            mo53766b();
        } catch (Throwable th) {
            C8282hb hbVar = this.f21548b;
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            hbVar.mo53640a(MraidJsMethods.RESIZE, message);
        }
    }

    /* renamed from: a */
    private final void m23578a(C8185eb ebVar) {
        if (ebVar.mo53382y().mo53422a() && ebVar.mo53382y().mo53423b() == C8199eo.IMPRESSION_SOURCE_FORMAT) {
            mo53770c(ebVar.mo53365m().mo53410b());
        }
    }
}
