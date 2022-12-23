package com.p243my.target;

import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.inmobi.media.C5073cj;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p243my.target.C7457i6;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import java.net.URI;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.my.target.l1 */
public class C7516l1 {

    /* renamed from: a */
    public final String f18926a;

    /* renamed from: b */
    public final WebViewClient f18927b = new C7519c();

    /* renamed from: c */
    public C7518b f18928c;

    /* renamed from: d */
    public C7457i6 f18929d;

    /* renamed from: e */
    public boolean f18930e;

    /* renamed from: f */
    public boolean f18931f;

    /* renamed from: com.my.target.l1$b */
    public interface C7518b {
        /* renamed from: a */
        void mo50771a(C7516l1 l1Var, WebView webView);

        /* renamed from: a */
        void mo50772a(boolean z);

        /* renamed from: a */
        boolean mo50773a(float f, float f2);

        /* renamed from: a */
        boolean mo50774a(int i, int i2, int i3, int i4, boolean z, int i5);

        /* renamed from: a */
        boolean mo50775a(Uri uri);

        /* renamed from: a */
        boolean mo50776a(ConsoleMessage consoleMessage, C7516l1 l1Var);

        /* renamed from: a */
        boolean mo50777a(String str);

        /* renamed from: a */
        boolean mo50778a(String str, JsResult jsResult);

        /* renamed from: a */
        boolean mo50779a(boolean z, C7559n1 n1Var);

        /* renamed from: b */
        void mo50780b(Uri uri);

        /* renamed from: c */
        void mo50781c();

        /* renamed from: d */
        void mo50782d();

        /* renamed from: f */
        boolean mo50783f();

        /* renamed from: g */
        void mo50784g();
    }

    /* renamed from: com.my.target.l1$c */
    public class C7519c extends WebViewClient {
        public C7519c() {
        }

        public void onPageFinished(WebView webView, String str) {
            C7516l1.this.mo50764b();
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            C7374e0.m18989a("Error: " + str);
            super.onReceivedError(webView, i, str, str2);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            C7516l1.this.mo50754a(webResourceRequest.getUrl());
            return true;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            C7516l1.this.mo50754a(Uri.parse(str));
            return true;
        }
    }

    /* renamed from: com.my.target.l1$d */
    public static class C7520d {
        /* renamed from: a */
        public static int m19684a(String str) {
            if (str == null) {
                return 53;
            }
            char c = 65535;
            switch (str.hashCode()) {
                case -1364013995:
                    if (str.equals("center")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1314880604:
                    if (str.equals(C5073cj.DEFAULT_POSITION)) {
                        c = 6;
                        break;
                    }
                    break;
                case -1012429441:
                    if (str.equals("top-left")) {
                        c = 0;
                        break;
                    }
                    break;
                case -655373719:
                    if (str.equals("bottom-left")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1163912186:
                    if (str.equals("bottom-right")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1288627767:
                    if (str.equals("bottom-center")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1755462605:
                    if (str.equals("top-center")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                return 51;
            }
            if (c == 1) {
                return 17;
            }
            if (c == 2) {
                return 83;
            }
            if (c == 3) {
                return 85;
            }
            if (c != 4) {
                return c != 5 ? 53 : 81;
            }
            return 49;
        }
    }

    /* renamed from: com.my.target.l1$e */
    public class C7521e extends WebChromeClient {
        public C7521e() {
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String message = consoleMessage.message();
            int lineNumber = consoleMessage.lineNumber();
            C7374e0.m18989a("js console message: " + message + " at line: " + lineNumber);
            return C7516l1.this.f18928c != null ? C7516l1.this.f18928c.mo50776a(consoleMessage, C7516l1.this) : super.onConsoleMessage(consoleMessage);
        }

        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            return C7516l1.this.f18928c != null ? C7516l1.this.f18928c.mo50778a(str2, jsResult) : super.onJsAlert(webView, str, str2, jsResult);
        }
    }

    /* renamed from: com.my.target.l1$f */
    public class C7522f implements C7457i6.C7458a {
        public C7522f() {
        }

        /* renamed from: a */
        public void mo50409a(boolean z) {
            if (C7516l1.this.f18928c != null) {
                C7516l1.this.f18928c.mo50772a(z);
            }
        }

        /* renamed from: c */
        public void mo50410c() {
            if (C7516l1.this.f18928c != null) {
                C7516l1.this.f18928c.mo50781c();
            }
        }
    }

    public C7516l1(String str) {
        this.f18926a = str;
    }

    /* renamed from: b */
    public static C7516l1 m19650b(String str) {
        return new C7516l1(str);
    }

    /* renamed from: a */
    public final String mo50752a(Rect rect) {
        return rect.left + "," + rect.top + "," + rect.width() + "," + rect.height();
    }

    /* renamed from: a */
    public void mo50753a() {
        this.f18929d = null;
    }

    /* renamed from: a */
    public void mo50754a(Uri uri) {
        C7518b bVar;
        String scheme = uri.getScheme();
        String host = uri.getHost();
        if ("mytarget".equals(scheme)) {
            if ("onloadmraidjs".equals(host)) {
                C7374e0.m18989a("MraidBridge: JS call onLoad");
            }
            C7374e0.m18989a("MraidBridge: got mytarget scheme " + uri);
        } else if (CampaignEx.JSON_KEY_MRAID.equals(scheme)) {
            if (host.contains(",")) {
                host = host.substring(0, host.indexOf(",")).trim();
            }
            C7374e0.m18989a("Got mraid command " + uri);
            String uri2 = uri.toString();
            JSONObject jSONObject = null;
            C7540m1 m1Var = new C7540m1(host, this.f18926a);
            mo50765c(m1Var.toString());
            int indexOf = uri2.indexOf("{");
            int lastIndexOf = uri2.lastIndexOf("}") + 1;
            if (indexOf >= 0 && lastIndexOf > 0 && indexOf < lastIndexOf) {
                try {
                    if (lastIndexOf <= uri2.length()) {
                        jSONObject = new JSONObject(uri2.substring(indexOf, lastIndexOf));
                    }
                } catch (Throwable th) {
                    mo50759a(m1Var.toString(), th.getMessage());
                    return;
                }
            }
            mo50762a(m1Var, jSONObject);
        } else {
            try {
                new URI(uri.toString());
                C7457i6 i6Var = this.f18929d;
                if (i6Var != null && i6Var.mo50404g() && (bVar = this.f18928c) != null) {
                    bVar.mo50780b(uri);
                }
            } catch (Throwable unused) {
                C7374e0.m18989a("Invalid MRAID URL: " + uri);
                mo50759a("", "Mraid command sent an invalid URL");
            }
        }
    }

    /* renamed from: a */
    public void mo50755a(C7457i6 i6Var) {
        this.f18929d = i6Var;
        WebSettings settings = i6Var.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            if (Build.VERSION.SDK_INT >= 17 && "interstitial".equals(this.f18926a)) {
                settings.setMediaPlaybackRequiresUserGesture(false);
            }
        }
        this.f18929d.setScrollContainer(false);
        this.f18929d.setVerticalScrollBarEnabled(false);
        this.f18929d.setHorizontalScrollBarEnabled(false);
        this.f18929d.setWebViewClient(this.f18927b);
        this.f18929d.setWebChromeClient(new C7521e());
        this.f18929d.setVisibilityChangedListener(new C7522f());
    }

    /* renamed from: a */
    public void mo50756a(C7518b bVar) {
        this.f18928c = bVar;
    }

    /* renamed from: a */
    public void mo50757a(C7580o1 o1Var) {
        mo50758a("mraidbridge.setScreenSize(" + mo50763b(o1Var.mo51278d()) + ");window.mraidbridge.setMaxSize(" + mo50763b(o1Var.mo51276c()) + ");window.mraidbridge.setCurrentPosition(" + mo50752a(o1Var.mo51271a()) + ");window.mraidbridge.setDefaultPosition(" + mo50752a(o1Var.mo51274b()) + ")");
        StringBuilder sb = new StringBuilder();
        sb.append("mraidbridge.fireSizeChangeEvent(");
        sb.append(mo50763b(o1Var.mo51271a()));
        sb.append(")");
        mo50758a(sb.toString());
    }

    /* renamed from: a */
    public final void mo50758a(String str) {
        if (this.f18929d == null) {
            C7374e0.m18989a("Attempted to inject Javascript into MRAID WebView while was not attached:\n\t" + str);
            return;
        }
        String str2 = "javascript:window." + str + ";";
        C7374e0.m18989a("Injecting Javascript into MRAID WebView " + hashCode() + ": " + str2);
        this.f18929d.mo49585a(str2);
    }

    /* renamed from: a */
    public void mo50759a(String str, String str2) {
        mo50758a("mraidbridge.fireErrorEvent(" + JSONObject.quote(str2) + ", " + JSONObject.quote(str) + ")");
    }

    /* renamed from: a */
    public void mo50760a(ArrayList<String> arrayList) {
        mo50758a("mraidbridge.setSupports(" + TextUtils.join(",", arrayList) + ")");
    }

    /* renamed from: a */
    public void mo50761a(boolean z) {
        if (z != this.f18931f) {
            mo50758a("mraidbridge.setIsViewable(" + z + ")");
        }
        this.f18931f = z;
    }

    /* renamed from: a */
    public boolean mo50762a(C7540m1 m1Var, JSONObject jSONObject) {
        C7457i6 i6Var;
        String m1Var2 = m1Var.toString();
        if (m1Var.f18981a && (i6Var = this.f18929d) != null && !i6Var.mo50404g()) {
            mo50759a(m1Var2, "Cannot execute this command unless the user clicks");
            return false;
        } else if (this.f18928c == null) {
            mo50759a(m1Var2, "Invalid state to execute this command");
            return false;
        } else if (this.f18929d == null) {
            mo50759a(m1Var2, "The current WebView is being destroyed");
            return false;
        } else {
            m1Var2.hashCode();
            char c = 65535;
            switch (m1Var2.hashCode()) {
                case -1910759310:
                    if (m1Var2.equals("vpaidInit")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1886160473:
                    if (m1Var2.equals(MraidJsMethods.PLAY_VIDEO)) {
                        c = 1;
                        break;
                    }
                    break;
                case -1289167206:
                    if (m1Var2.equals(MraidJsMethods.EXPAND)) {
                        c = 2;
                        break;
                    }
                    break;
                case -934437708:
                    if (m1Var2.equals(MraidJsMethods.RESIZE)) {
                        c = 3;
                        break;
                    }
                    break;
                case -733616544:
                    if (m1Var2.equals("createCalendarEvent")) {
                        c = 4;
                        break;
                    }
                    break;
                case 0:
                    if (m1Var2.equals("")) {
                        c = 5;
                        break;
                    }
                    break;
                case 3417674:
                    if (m1Var2.equals("open")) {
                        c = 6;
                        break;
                    }
                    break;
                case 94756344:
                    if (m1Var2.equals("close")) {
                        c = 7;
                        break;
                    }
                    break;
                case 133423073:
                    if (m1Var2.equals("setOrientationProperties")) {
                        c = 8;
                        break;
                    }
                    break;
                case 459238621:
                    if (m1Var2.equals("storePicture")) {
                        c = 9;
                        break;
                    }
                    break;
                case 624734601:
                    if (m1Var2.equals("setResizeProperties")) {
                        c = 10;
                        break;
                    }
                    break;
                case 892543864:
                    if (m1Var2.equals("vpaidEvent")) {
                        c = 11;
                        break;
                    }
                    break;
                case 1797992422:
                    if (m1Var2.equals("playheadEvent")) {
                        c = 12;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    this.f18928c.mo50784g();
                    break;
                case 1:
                    C7374e0.m18989a("playVideo is currently unsupported");
                    return false;
                case 2:
                    Uri uri = null;
                    if (jSONObject != null) {
                        uri = Uri.parse(jSONObject.getString("url"));
                    }
                    return this.f18928c.mo50775a(uri);
                case 3:
                    return this.f18928c.mo50783f();
                case 4:
                    C7374e0.m18989a("createCalendarEvent is currently unsupported");
                    return false;
                case 5:
                    mo50759a(m1Var2, "Unspecified MRAID Javascript command");
                    return false;
                case 6:
                    if (jSONObject != null) {
                        this.f18928c.mo50780b(Uri.parse(jSONObject.getString("url")));
                        break;
                    } else {
                        mo50759a(m1Var2, "open params cannot be null");
                        return false;
                    }
                case 7:
                    this.f18928c.mo50782d();
                    break;
                case 8:
                    if (jSONObject == null) {
                        mo50759a(m1Var2, "setOrientationProperties params cannot be null");
                        return false;
                    }
                    boolean z = jSONObject.getBoolean("allowOrientationChange");
                    String string = jSONObject.getString("forceOrientation");
                    C7559n1 a = C7559n1.m19903a(string);
                    if (a != null) {
                        return this.f18928c.mo50779a(z, a);
                    }
                    mo50759a(m1Var2, "wrong orientation " + string);
                    return false;
                case 9:
                    C7374e0.m18989a("storePicture is currently unsupported");
                    return false;
                case 10:
                    if (jSONObject == null) {
                        mo50759a(m1Var2, "setResizeProperties params cannot be null");
                        return false;
                    }
                    return this.f18928c.mo50774a(jSONObject.getInt("width"), jSONObject.getInt("height"), jSONObject.getInt("offsetX"), jSONObject.getInt("offsetY"), jSONObject.optBoolean("allowOffscreen", false), C7520d.m19684a(jSONObject.optString("customClosePosition")));
                case 11:
                    if (jSONObject == null) {
                        mo50759a(m1Var2, "vpaidEvent params cannot be null");
                        return false;
                    }
                    return this.f18928c.mo50777a(jSONObject.getString("event"));
                case 12:
                    if (jSONObject == null) {
                        mo50759a(m1Var2, "playheadEvent params cannot be null");
                        return false;
                    }
                    return this.f18928c.mo50773a((float) jSONObject.getDouble("remain"), (float) jSONObject.getDouble("duration"));
            }
            return true;
        }
    }

    /* renamed from: b */
    public final String mo50763b(Rect rect) {
        return rect.width() + "," + rect.height();
    }

    /* renamed from: b */
    public final void mo50764b() {
        if (!this.f18930e) {
            this.f18930e = true;
            C7518b bVar = this.f18928c;
            if (bVar != null) {
                bVar.mo50771a(this, this.f18929d.getWebView());
            }
        }
    }

    /* renamed from: c */
    public final void mo50765c(String str) {
        mo50758a("mraidbridge.nativeComplete(" + JSONObject.quote(str) + ")");
    }

    /* renamed from: c */
    public boolean mo50766c() {
        C7457i6 i6Var = this.f18929d;
        return i6Var != null && i6Var.mo50405h();
    }

    /* renamed from: d */
    public void mo50767d() {
        mo50758a("mraidbridge.fireReadyEvent()");
    }

    /* renamed from: d */
    public void mo50768d(String str) {
        mo50758a("mraidbridge.setPlacementType(" + JSONObject.quote(str) + ")");
    }

    /* renamed from: e */
    public void mo50769e(String str) {
        mo50758a("mraidbridge.setState(" + JSONObject.quote(str) + ")");
    }

    /* renamed from: f */
    public void mo50770f(String str) {
        C7457i6 i6Var = this.f18929d;
        if (i6Var == null) {
            C7374e0.m18989a("MRAID bridge called setContentHtml before WebView was attached");
            return;
        }
        this.f18930e = false;
        i6Var.mo49586a("https://ad.mail.ru/", str, WebRequest.CONTENT_TYPE_HTML, "UTF-8", (String) null);
    }
}
