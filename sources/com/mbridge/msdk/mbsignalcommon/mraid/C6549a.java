package com.mbridge.msdk.mbsignalcommon.mraid;

import android.webkit.WebView;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.mbsignalcommon.mraid.a */
/* compiled from: CallMraidJS */
public final class C6549a {

    /* renamed from: com.mbridge.msdk.mbsignalcommon.mraid.a$a */
    /* compiled from: CallMraidJS */
    private static class C6550a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C6549a f16323a = new C6549a();
    }

    /* renamed from: a */
    public static C6549a m16848a() {
        return C6550a.f16323a;
    }

    /* renamed from: a */
    public final void mo44470a(WebView webView) {
        m16849c(webView, "javascript:window.mraidbridge.fireReadyEvent();");
    }

    /* renamed from: a */
    public final void mo44476a(WebView webView, Map<String, Object> map) {
        if (map != null && map.size() != 0) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry next : map.entrySet()) {
                try {
                    jSONObject.put((String) next.getKey(), next.getValue());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            m16849c(webView, String.format("javascript:window.mraidbridge.fireChangeEvent(%s);", new Object[]{jSONObject.toString()}));
        }
    }

    /* renamed from: a */
    public final void mo44475a(WebView webView, String str, String str2) {
        m16849c(webView, String.format("javascript:window.mraidbridge.fireErrorEvent('%1s', '%2s');", new Object[]{str2, str}));
    }

    /* renamed from: a */
    public final void mo44472a(WebView webView, float f, float f2) {
        m16849c(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.notifySizeChangeEvent(%.1f, %.1f);", new Object[]{Float.valueOf(f), Float.valueOf(f2)}));
    }

    /* renamed from: a */
    public final void mo44471a(WebView webView, double d) {
        m16849c(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.audioVolumeChange(%s);", new Object[]{Double.valueOf(d)}));
    }

    /* renamed from: b */
    public final void mo44477b(WebView webView, float f, float f2) {
        m16849c(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setScreenSize(%.1f, %.1f);", new Object[]{Float.valueOf(f), Float.valueOf(f2)}));
    }

    /* renamed from: c */
    public final void mo44480c(WebView webView, float f, float f2) {
        m16849c(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setMaxSize(%.1f, %.1f);", new Object[]{Float.valueOf(f), Float.valueOf(f2)}));
    }

    /* renamed from: a */
    public final void mo44473a(WebView webView, float f, float f2, float f3, float f4) {
        m16849c(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setDefaultPosition(%.1f, %.1f, %.1f, %.1f);", new Object[]{Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)}));
    }

    /* renamed from: b */
    public final void mo44478b(WebView webView, float f, float f2, float f3, float f4) {
        m16849c(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setCurrentPosition(%.1f, %.1f, %.1f, %.1f);", new Object[]{Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)}));
    }

    /* renamed from: a */
    public final void mo44474a(WebView webView, String str) {
        m16849c(webView, String.format("javascript:window.mraidbridge.nativeCallComplete('%s');", new Object[]{str}));
    }

    /* renamed from: b */
    public final void mo44479b(WebView webView, String str) {
        m16849c(webView, String.format("javascript:window.mraidbridge.setIsViewable(%s);", new Object[]{str}));
    }

    /* renamed from: c */
    private void m16849c(WebView webView, String str) {
        if (webView != null) {
            try {
                webView.loadUrl(str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
