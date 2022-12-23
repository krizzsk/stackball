package com.p243my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.p243my.target.C7774z5;

/* renamed from: com.my.target.z5 */
public final class C7774z5 extends C7307a6 {

    /* renamed from: b */
    public C7775a f19755b;

    /* renamed from: c */
    public boolean f19756c;

    /* renamed from: d */
    public boolean f19757d;

    /* renamed from: e */
    public C7778d f19758e;

    /* renamed from: com.my.target.z5$a */
    public interface C7775a {
        /* renamed from: a */
        void mo49734a(WebView webView);

        /* renamed from: a */
        void mo49737a(String str);

        /* renamed from: b */
        void mo49740b(String str);
    }

    /* renamed from: com.my.target.z5$b */
    public static final class C7776b extends WebChromeClient {
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String message = consoleMessage.message();
            int lineNumber = consoleMessage.lineNumber();
            C7374e0.m18989a("js console message: " + message + " at line: " + lineNumber);
            return false;
        }
    }

    /* renamed from: com.my.target.z5$c */
    public final class C7777c extends WebViewClient {
        public C7777c() {
        }

        public void onPageFinished(WebView webView, String str) {
            if (!C7774z5.this.f19756c) {
                boolean unused = C7774z5.this.f19756c = true;
                C7374e0.m18989a("page loaded");
                super.onPageFinished(webView, str);
                if (C7774z5.this.f19755b != null) {
                    C7774z5.this.f19755b.mo49734a(webView);
                }
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            C7374e0.m18989a("load page started");
            super.onPageStarted(webView, str, bitmap);
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            C7374e0.m18989a("load failed. error: " + i + " description: " + str + " url: " + str2);
            super.onReceivedError(webView, i, str, str2);
            if (C7774z5.this.f19755b != null) {
                C7775a c = C7774z5.this.f19755b;
                if (str == null) {
                    str = "unknown JS error";
                }
                c.mo49737a(str);
            }
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            CharSequence description = webResourceError.getDescription();
            String charSequence = description != null ? description.toString() : null;
            int errorCode = webResourceError.getErrorCode();
            String uri = webResourceRequest.getUrl().toString();
            C7374e0.m18989a("load failed. error: " + errorCode + " description: " + charSequence + " url: " + uri);
            if (C7774z5.this.f19755b != null) {
                C7775a c = C7774z5.this.f19755b;
                if (charSequence == null) {
                    charSequence = "Unknown JS error";
                }
                c.mo49737a(charSequence);
            }
        }

        public void onScaleChanged(WebView webView, float f, float f2) {
            super.onScaleChanged(webView, f, f2);
            C7374e0.m18989a("scale new: " + f2 + " old: " + f);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Uri url;
            if (!C7774z5.this.f19757d || (url = webResourceRequest.getUrl()) == null) {
                return true;
            }
            C7774z5.this.mo51988b(url.toString());
            C7774z5.this.mo51989h();
            return true;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (C7774z5.this.f19757d && str != null) {
                C7774z5.this.mo51988b(str);
                C7774z5.this.mo51989h();
            }
            return true;
        }
    }

    /* renamed from: com.my.target.z5$d */
    public interface C7778d {
        /* renamed from: a */
        void mo49458a();
    }

    /* renamed from: com.my.target.z5$e */
    public static final class C7779e extends GestureDetector {

        /* renamed from: a */
        public final View f19760a;

        /* renamed from: b */
        public C7780a f19761b;

        /* renamed from: com.my.target.z5$e$a */
        public interface C7780a {
            /* renamed from: a */
            void mo49495a();
        }

        public C7779e(Context context, View view) {
            this(context, view, new GestureDetector.SimpleOnGestureListener());
        }

        public C7779e(Context context, View view, GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
            super(context, simpleOnGestureListener);
            this.f19760a = view;
            setIsLongpressEnabled(false);
        }

        /* renamed from: a */
        public void mo52001a(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2 || !mo52003a(motionEvent, this.f19760a)) {
                        return;
                    }
                } else if (this.f19761b != null) {
                    C7374e0.m18989a("Gestures: user clicked");
                    this.f19761b.mo49495a();
                    return;
                } else {
                    C7374e0.m18989a("View's onUserClick() is not registered.");
                    return;
                }
            }
            onTouchEvent(motionEvent);
        }

        /* renamed from: a */
        public void mo52002a(C7780a aVar) {
            this.f19761b = aVar;
        }

        /* renamed from: a */
        public final boolean mo52003a(MotionEvent motionEvent, View view) {
            if (motionEvent == null || view == null) {
                return false;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            return x >= 0.0f && x <= ((float) view.getWidth()) && y >= 0.0f && y <= ((float) view.getHeight());
        }
    }

    public C7774z5(Context context) {
        super(context);
        C7776b bVar = new C7776b();
        C7777c cVar = new C7777c();
        C7779e eVar = new C7779e(getContext(), this);
        eVar.mo52002a((C7779e.C7780a) new C7779e.C7780a() {
            /* renamed from: a */
            public final void mo49495a() {
                C7774z5.this.m21002g();
            }
        });
        setOnTouchListener(new View.OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C7774z5.C7779e.this.mo52001a(motionEvent);
            }
        });
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebSettings settings = getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setAppCacheEnabled(true);
            settings.setSupportZoom(false);
            settings.setAppCachePath(getContext().getCacheDir().getAbsolutePath());
            settings.setAllowFileAccess(false);
            settings.setAllowContentAccess(false);
            if (Build.VERSION.SDK_INT >= 16) {
                settings.setAllowFileAccessFromFileURLs(false);
                settings.setAllowUniversalAccessFromFileURLs(false);
            }
        }
        setWebChromeClient(bVar);
        setWebViewClient(cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m21002g() {
        this.f19757d = true;
    }

    /* renamed from: b */
    public void mo51988b(String str) {
        C7775a aVar = this.f19755b;
        if (aVar != null) {
            aVar.mo49740b(str);
        }
    }

    /* renamed from: h */
    public void mo51989h() {
        this.f19757d = false;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C7778d dVar = this.f19758e;
        if (dVar != null) {
            dVar.mo49458a();
        }
    }

    public void setBannerWebViewListener(C7775a aVar) {
        this.f19755b = aVar;
    }

    public void setData(String str) {
        this.f19756c = false;
        this.f19757d = false;
        mo49586a("https://ad.mail.ru/", str, WebRequest.CONTENT_TYPE_HTML, "UTF-8", (String) null);
    }

    public void setOnLayoutListener(C7778d dVar) {
        this.f19758e = dVar;
    }
}
