package com.ogury.p244cm;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.appsflyer.internal.referrer.Payload;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.ogury.core.OguryError;
import com.ogury.p244cm.ConsentActivity;
import com.ogury.p244cm.internal.aabca;
import com.ogury.p244cm.internal.ababa;
import com.ogury.p244cm.internal.ababb;
import com.ogury.p244cm.internal.abbba;
import com.ogury.p244cm.internal.abbbb;
import com.ogury.p244cm.internal.abbbc;
import com.ogury.p244cm.internal.baaba;
import com.ogury.p244cm.internal.babca;
import com.ogury.p244cm.internal.bbabc;
import com.ogury.p244cm.internal.bbacb;
import com.ogury.p244cm.internal.bbcbc;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ogury.cm.aaaac */
public final class aaaac {

    /* renamed from: a */
    public static final aaaac f20238a = new aaaac();

    /* renamed from: b */
    private static abbbb f20239b;

    /* renamed from: c */
    private static aaaaa f20240c;

    /* renamed from: d */
    private static WebView f20241d;

    /* renamed from: e */
    private static final Handler f20242e = new Handler(Looper.getMainLooper());

    /* renamed from: com.ogury.cm.aaaac$aaaaa */
    public static final class aaaaa implements abbbb {

        /* renamed from: a */
        final /* synthetic */ bbacb.aaaaa f20243a;

        /* renamed from: b */
        final /* synthetic */ bbacb.aaaaa f20244b;

        /* renamed from: c */
        final /* synthetic */ Context f20245c;

        aaaaa(bbacb.aaaaa aaaaa, bbacb.aaaaa aaaaa2, Context context) {
            this.f20243a = aaaaa;
            this.f20244b = aaaaa2;
            this.f20245c = context;
        }

        /* renamed from: a */
        public final void mo52605a(OguryError oguryError) {
            bbabc.m22051b(oguryError, "error");
            aaaac aaaac = aaaac.f20238a;
            aaaac.m21652d().removeCallbacksAndMessages((Object) null);
            aaaac aaaac2 = aaaac.f20238a;
            abbbb a = aaaac.m21640a();
            if (a != null) {
                a.mo52605a(oguryError);
            }
        }

        /* renamed from: a */
        public final void mo52606a(String str) {
            bbabc.m22051b(str, Payload.RESPONSE);
            if (bbabc.m22050a((Object) str, (Object) "ready")) {
                this.f20243a.f20618a = true;
                aaaac aaaac = aaaac.f20238a;
                boolean z = this.f20244b.f20618a;
                aaaac aaaac2 = aaaac.f20238a;
                aaaac.m21649a(z, aaaac.m21640a(), (long) MBInterstitialActivity.WEB_LOAD_TIME);
            } else if (bbabc.m22050a((Object) str, (Object) "success")) {
                this.f20244b.f20618a = true;
                aaaac.m21644a(aaaac.f20238a, this.f20245c);
                aaaac aaaac3 = aaaac.f20238a;
                aaaac.m21652d().removeCallbacksAndMessages((Object) null);
            } else if (bbcbc.m22089a(str, "parsedConfig=", false, 2, (Object) null)) {
                aaaac.m21645a(aaaac.f20238a, this.f20245c, str);
                aabca aabca = aabca.f20358a;
                aabca.m21762a("ANSWERED");
            }
        }
    }

    /* renamed from: com.ogury.cm.aaaac$aaaab */
    public static final class aaaab implements ababa {

        /* renamed from: a */
        final /* synthetic */ Context f20246a;

        /* renamed from: b */
        final /* synthetic */ String f20247b;

        /* renamed from: com.ogury.cm.aaaac$aaaab$aaaaa */
        static final class aaaaa implements Runnable {

            /* renamed from: a */
            final /* synthetic */ aaaab f20248a;

            /* renamed from: b */
            final /* synthetic */ String f20249b;

            aaaaa(aaaab aaaab, String str) {
                this.f20248a = aaaab;
                this.f20249b = str;
            }

            public final void run() {
                abbba abbba = abbba.f20411a;
                abbba.m21835e(this.f20249b);
                abbba abbba2 = abbba.f20411a;
                abbba.m21832d().mo52745a(this.f20248a.f20246a);
                abbba abbba3 = abbba.f20411a;
                abbba.m21834e().mo52755a(this.f20248a.f20246a, "");
                aabca aabca = aabca.f20358a;
                aabca.m21760a();
                aaaac aaaac = aaaac.f20238a;
                abbbb a = aaaac.m21640a();
                if (a != null) {
                    a.mo52606a(this.f20248a.f20247b);
                }
            }
        }

        aaaab(Context context, String str) {
            this.f20246a = context;
            this.f20247b = str;
        }

        /* renamed from: a */
        public final void mo52607a(String str) {
            bbabc.m22051b(str, "aaid");
            new Handler(Looper.getMainLooper()).post(new aaaaa(this, str));
        }
    }

    /* renamed from: com.ogury.cm.aaaac$aaaac  reason: collision with other inner class name */
    static final class C15666aaaac implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f20250a;

        /* renamed from: b */
        final /* synthetic */ abbbb f20251b;

        C15666aaaac(boolean z, abbbb abbbb) {
            this.f20250a = z;
            this.f20251b = abbbb;
        }

        public final void run() {
            if (!this.f20250a) {
                aaaac.m21648a(this.f20251b, new OguryError(1002, "Timeout error"));
            }
        }
    }

    private aaaac() {
    }

    /* renamed from: a */
    public static abbbb m21640a() {
        return f20239b;
    }

    /* renamed from: a */
    public static void m21641a(Context context, abbbb abbbb) {
        bbabc.m22051b(context, "context");
        bbabc.m22051b(abbbb, "callback");
        baaba.f20569a.queryProductDetails();
        f20239b = abbbb;
        bbacb.aaaaa aaaaa2 = new bbacb.aaaaa();
        aaaaa2.f20618a = false;
        bbacb.aaaaa aaaaa3 = new bbacb.aaaaa();
        aaaaa3.f20618a = false;
        try {
            WebView webView = new WebView(context.getApplicationContext(), (AttributeSet) null);
            f20241d = webView;
            WebSettings settings = webView.getSettings();
            if (settings != null) {
                settings.setJavaScriptEnabled(true);
            }
            WebView webView2 = f20241d;
            if (webView2 != null) {
                webView2.setBackgroundColor(0);
            }
            WebView webView3 = f20241d;
            if (webView3 != null) {
                webView3.setLayerType(1, (Paint) null);
            }
            aaaaa aaaaa4 = new aaaaa(context, new aaaaa(aaaaa2, aaaaa3, context));
            f20240c = aaaaa4;
            WebView webView4 = f20241d;
            if (webView4 != null) {
                webView4.setWebViewClient(aaaaa4);
            }
            m21649a(aaaaa2.f20618a, abbbb, (long) SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US);
            WebView webView5 = f20241d;
            if (webView5 != null) {
                StringBuilder sb = new StringBuilder("https://consent-form.ogury.co");
                abbba abbba = abbba.f20411a;
                sb.append(abbba.m21838g().mo52687c());
                sb.append("?assetType=android");
                webView5.loadUrl(sb.toString());
            }
        } catch (Exception unused) {
            abbbc abbbc = abbbc.f20427a;
            abbbc.m21856b("Cannot create WebView");
            m21648a(f20239b, new OguryError(4, "Cannot create WebView"));
        }
    }

    /* renamed from: a */
    public static void m21642a(WebView webView) {
        f20241d = null;
    }

    /* renamed from: a */
    public static void m21643a(aaaaa aaaaa2) {
        f20240c = null;
    }

    /* renamed from: a */
    public static final /* synthetic */ void m21644a(aaaac aaaac, Context context) {
        Object systemService = context.getSystemService("activity");
        if (systemService != null) {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            boolean z = false;
            if (runningAppProcesses != null) {
                String packageName = context.getPackageName();
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.importance == 100 && bbabc.m22050a((Object) next.processName, (Object) packageName)) {
                        break;
                    }
                }
            }
            if (!z) {
                ConsentActivity.aaaaa aaaaa2 = ConsentActivity.f20222a;
                bbabc.m22051b(context, "context");
                context.startActivity(new Intent(context, ConsentActivity.class));
                return;
            }
            m21648a(f20239b, new OguryError(4, "App in background"));
            return;
        }
        throw new babca("null cannot be cast to non-null type android.app.ActivityManager");
    }

    /* renamed from: a */
    public static final /* synthetic */ void m21645a(aaaac aaaac, Context context, String str) {
        if (str != null) {
            String substring = str.substring(13);
            bbabc.m22048a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            ababb ababb = ababb.f20396a;
            ababb.m21806a(context, new aaaab(context, substring));
            return;
        }
        throw new babca("null cannot be cast to non-null type java.lang.String");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m21648a(abbbb abbbb, OguryError oguryError) {
        f20241d = null;
        f20240c = null;
        if (abbbb != null) {
            abbbb.mo52605a(oguryError);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m21649a(boolean z, abbbb abbbb, long j) {
        f20242e.postDelayed(new C15666aaaac(z, abbbb), j);
    }

    /* renamed from: b */
    public static aaaaa m21650b() {
        return f20240c;
    }

    /* renamed from: c */
    public static WebView m21651c() {
        return f20241d;
    }

    /* renamed from: d */
    public static Handler m21652d() {
        return f20242e;
    }
}
