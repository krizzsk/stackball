package com.ogury.p244cm.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.appsflyer.internal.referrer.Payload;
import com.ogury.core.OguryError;
import com.ogury.p244cm.ConsentActivity;
import com.ogury.p244cm.internal.aacaa;
import com.ogury.p244cm.internal.aacab;
import com.ogury.p244cm.internal.bbacb;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import kotlin.text.Typography;

/* renamed from: com.ogury.cm.internal.abaac */
public final class abaac {

    /* renamed from: a */
    public static final aaaaa f20383a = new aaaaa((bbabb) null);

    /* renamed from: com.ogury.cm.internal.abaac$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    /* renamed from: com.ogury.cm.internal.abaac$aaaab */
    static final class aaaab extends bbaca implements bbaaa<babcc> {

        /* renamed from: a */
        final /* synthetic */ abaac f20384a;

        /* renamed from: b */
        final /* synthetic */ WebView f20385b;

        /* renamed from: c */
        final /* synthetic */ abbbb f20386c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaaab(abaac abaac, WebView webView, abbbb abbbb) {
            super(0);
            this.f20384a = abaac;
            this.f20385b = webView;
            this.f20386c = abbbb;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo52622a() {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final bbacb.aaaab aaaab = new bbacb.aaaab();
            aaaab.f20619a = "";
            final bbacb.aaaab aaaab2 = new bbacb.aaaab();
            aaaab2.f20619a = "";
            baaba.f20569a.setQueryProductDetailsListener(new baacc() {
                /* renamed from: a */
                public final void mo52667a(String str, String str2) {
                    bbabc.m22051b(str, "status");
                    bbabc.m22051b(str2, "skuDetailsJson");
                    aaaab.f20619a = str;
                    aaaab2.f20619a = str2;
                    countDownLatch.countDown();
                }
            });
            countDownLatch.await();
            baaba.f20569a.setQueryProductDetailsListener((baacc) null);
            new Handler(Looper.getMainLooper()).post(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ aaaab f20390a;

                {
                    this.f20390a = r1;
                }

                public final void run() {
                    if (bbabc.m22050a((Object) (String) aaaab.f20619a, (Object) "ok")) {
                        abaac.m21796a(this.f20390a.f20385b, (String) aaaab2.f20619a);
                        this.f20390a.f20386c.mo52606a("ready");
                        return;
                    }
                    this.f20390a.f20386c.mo52605a(new OguryError(1005, aacaa.aaaaa.m21775e((String) aaaab.f20619a)));
                }
            });
            if (!bbabc.m22050a((Object) (String) aaaab.f20619a, (Object) "ok")) {
                new abcba();
                abcba.m21905a((String) aaaab.f20619a, (acabb) new acabb(this) {

                    /* renamed from: a */
                    final /* synthetic */ aaaab f20393a;

                    {
                        this.f20393a = r1;
                    }

                    /* renamed from: a */
                    public final void mo52618a(int i, String str) {
                        OguryError oguryError;
                        bbabc.m22051b(str, "error");
                        if (i == 0 || (500 <= i && 599 >= i)) {
                            oguryError = new OguryError(3, str);
                        } else {
                            aacab.aaaaa aaaaa = aacab.f20365a;
                            oguryError = aacab.aaaaa.m21776a(str);
                        }
                        this.f20393a.f20386c.mo52605a(oguryError);
                    }

                    /* renamed from: a */
                    public final void mo52619a(String str) {
                        bbabc.m22051b(str, Payload.RESPONSE);
                        this.f20393a.f20386c.mo52606a(str);
                    }
                });
            }
            return babcc.f20603a;
        }
    }

    /* renamed from: com.ogury.cm.internal.abaac$aaaac */
    public static final class aaaac implements baaaa {

        /* renamed from: a */
        final /* synthetic */ abaac f20394a;

        /* renamed from: b */
        final /* synthetic */ WebView f20395b;

        aaaac(abaac abaac, WebView webView) {
            this.f20394a = abaac;
            this.f20395b = webView;
        }

        /* renamed from: a */
        public final void mo52669a(String str) {
            bbabc.m22051b(str, "jsonResult");
            abaac.m21798a(str, this.f20395b);
            baaba.f20569a.setBillingFinishedListener((baaaa) null);
        }
    }

    /* renamed from: a */
    private static String m21794a(String str) {
        String str2;
        if (str != null) {
            str2 = ", \"" + aacaa.aaaaa.m21773c(str) + Typography.quote;
        } else {
            str2 = "";
        }
        StringBuilder sb = new StringBuilder("javascript:(function(){ogFormBridge.init(\"");
        abbba abbba = abbba.f20411a;
        sb.append(aacaa.aaaaa.m21773c(abbba.m21841j()));
        sb.append(Typography.quote);
        sb.append(str2);
        sb.append(")})()");
        return sb.toString();
    }

    /* renamed from: a */
    private static void m21795a(Context context) {
        if (context instanceof ConsentActivity) {
            ((ConsentActivity) context).finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m21796a(WebView webView, String str) {
        webView.setVisibility(0);
        webView.loadUrl(m21794a(str));
    }

    /* renamed from: a */
    public static void m21798a(String str, WebView webView) {
        bbabc.m22051b(str, "jsonResult");
        bbabc.m22051b(webView, "webView");
        webView.loadUrl("javascript:(function(){ogFormBridge.purchase(\"" + aacaa.aaaaa.m21773c(str) + "\")})()");
    }

    /* renamed from: a */
    public final void mo52666a(String str, Context context, abbbb abbbb, WebView webView) {
        String str2 = str;
        Context context2 = context;
        abbbb abbbb2 = abbbb;
        WebView webView2 = webView;
        bbabc.m22051b(str2, "url");
        bbabc.m22051b(context2, "context");
        bbabc.m22051b(abbbb2, "callback");
        bbabc.m22051b(webView2, "webView");
        Locale locale = Locale.US;
        bbabc.m22048a((Object) locale, "Locale.US");
        String lowerCase = str2.toLowerCase(locale);
        bbabc.m22048a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        if (bbcbc.m22089a(lowerCase, "https://ogyconsent", false, 2, (Object) null)) {
            String substring = str2.substring(20);
            bbabc.m22048a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            if (bbcbc.m22089a(substring, "consent=", false, 2, (Object) null)) {
                abbba abbba = abbba.f20411a;
                abbba.m21836f().mo52747a(substring, false);
                abbba abbba2 = abbba.f20411a;
                if (abbba.m21848q()) {
                    StringBuilder sb = new StringBuilder("parsedConfig=");
                    abbba abbba3 = abbba.f20411a;
                    sb.append(abbba.m21840i());
                    abbbb2.mo52606a(sb.toString());
                } else {
                    abbba abbba4 = abbba.f20411a;
                    abbbb2.mo52605a(abbba.m21840i().mo52750b());
                }
                m21795a(context);
                baaba.f20569a.endDataSourceConnections();
            } else if (bbcbc.m22089a(substring, "ogyRedirect=", false, 2, (Object) null)) {
                try {
                    context2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(bbcbc.m22095a(substring, "ogyRedirect=", (String) null, 2, (Object) null))));
                } catch (ActivityNotFoundException unused) {
                } catch (Exception e) {
                    abbbc abbbc = abbbc.f20427a;
                    abbbc.m21855a((Throwable) e);
                }
            } else if (!bbcbc.m22089a(substring, "error=", false, 2, (Object) null)) {
            } else {
                if (substring != null) {
                    String substring2 = substring.substring(6);
                    bbabc.m22048a((Object) substring2, "(this as java.lang.String).substring(startIndex)");
                    abbbb2.mo52605a(new OguryError(1003, bbcbc.m22084a(bbcbc.m22084a(substring2, "%20", " ", false, 4, (Object) null), "%22", "\"", false, 4, (Object) null)));
                    m21795a(context);
                    return;
                }
                throw new babca("null cannot be cast to non-null type java.lang.String");
            }
        } else {
            CharSequence charSequence = str2;
            if (bbcbc.m22098a(charSequence, (CharSequence) "?ready", false, 2, (Object) null)) {
                if (baaba.f20569a.isProductActivated()) {
                    bacbb.m22034a(false, false, (ClassLoader) null, (String) null, 0, new aaaab(this, webView2, abbbb2), 31, (Object) null);
                    return;
                }
                m21796a(webView2, (String) null);
                abbbb2.mo52606a("ready");
            } else if (bbcbc.m22098a(charSequence, (CharSequence) "?success", false, 2, (Object) null)) {
                abbbb2.mo52606a("success");
            } else if (bbcbc.m22098a(charSequence, (CharSequence) "?purchase", false, 2, (Object) null)) {
                baaba.f20569a.setBillingFinishedListener(new aaaac(this, webView2));
                baaba baaba = baaba.f20569a;
                if (context2 != null) {
                    baaba.launchBillingFlow((Activity) context2);
                    return;
                }
                throw new babca("null cannot be cast to non-null type android.app.Activity");
            }
        }
    }
}
